public final class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + x;
        hash = hash * 31 + y;
        return hash;
    }

    public int manhattanDistanceTo(Point p2) {
        int deltaX = x - p2.x;
        int deltaY = y - p2.y;

        return Math.abs(deltaX) + Math.abs(deltaY);
    }

}