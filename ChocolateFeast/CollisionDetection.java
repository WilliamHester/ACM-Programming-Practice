import java.util.*;

public class CollisionDetection {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double t, x, y, s;
		t = scan.nextDouble();
		while (t >= 0) {

			Car car1 = new Car(t, scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			double t2 = scan.nextDouble();
			Car car2 = new Car(t2, scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			car1.move(t2 - t);

			double distance = Car.distance(car1, car2);
			double elapsedTime = 0.0;
			while (elapsedTime < 30) {
				if (distance > 30 && elapsedTime <= 29.0) { // Cars are pretty far away, so we can go faster
					car1.move(1.0);
					car2.move(1.0);
					elapsedTime += 1.0;
				} else if (distance > 25 && elapsedTime <= 29.5) {
					car1.move(0.5);
					car2.move(0.5);
					elapsedTime += 0.5;
				} else if (elapsedTime <= 29.9) {
					car1.move(0.1);
					car2.move(0.1);
					elapsedTime += 0.1;
				} else {
					double diff = 30.0 - elapsedTime;
					car1.move(diff);
					car2.move(diff);
					elapsedTime = 30.0;
				}
				distance = Car.distance(car1, car2);
				if (distance < 20) {
					break;
				}
			}

			if (distance < 20) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}

			t = scan.nextDouble();
		}

	}


	private static class Car {
		double speedX;
		double speedY;
		double accelerationX;
		double accelerationY;
		double x, y;
		boolean stoppedAccelerating;

		public Car(double t1, double x1, double y1, double s1,
				   double t2, double x2, double y2, double s2) {
			accelerationX = (s2 - s1) * (x2 - x1) / (t2 - t1);
			accelerationY = (s2 - s1) * (y2 - y1) / (t2 - t1);
			x = x2;
			y = y2;
		}

		public void move(double time) {
			if (!stoppedAccelerating && Math.sqrt(speedY * speedY + speedX * speedX) < 80) { // keep accelerating
				speedX += accelerationX * time;
				speedY += accelerationY * time;
				if (!(Math.sqrt(speedY * speedY + speedX * speedX) < 80.0)) {
					speedX = accelerationX / (accelerationX + accelerationY) * 80.0;
					speedY = accelerationY / (accelerationX + accelerationY) * 80.0;
					stoppedAccelerating = true;
				}
			}
			x += speedX * time;
			y += speedY * time;
		}

		public static double distance(Car car1, Car car2) {
			return Math.sqrt(Math.pow(car2.x - car1.x, 2) + Math.pow(car2.y - car1.y, 2));
		}
	}
}