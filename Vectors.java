public class Vectors {
    private int x;
    private int y;
    private int z;

    public Vectors(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vectors() {
        this(0, 0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vectors add(Vectors other) {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
        return this;
    }

    public Vectors subtract(Vectors other) {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;
        return this;
    }

    public int dot(Vectors other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vectors multiply(int scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
        return this;
    }

}
