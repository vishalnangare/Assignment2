package com.vn.Assignment2.examples;

public class RectangleExample {
	int length;
	int breadth;

	public RectangleExample(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		return length * breadth;
	}
	public static int calculate_Area(RectangleExample[] rectangles, int N) {
		int maxArea = 0;

		for (int i = 0; i < N; i++) {
			int area = rectangles[i].area();
			maxArea = Math.max(maxArea, area);
		}

		return maxArea;
	} 
	public static void main(String[] args) {
		int N = 3; 

		RectangleExample[] rectangles = new RectangleExample[N];
		rectangles[0] = new RectangleExample(3, 4);
		rectangles[1] = new RectangleExample(5, 6);
		rectangles[2] = new RectangleExample(2, 7);

		int maxArea = calculate_Area(rectangles, N);
		System.out.println("Maximum area among the rectangles: " + maxArea);
	}

	
}
