package ex4_3;
public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi constructor của lớp cha Point2D
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Gọi phương thức setXY của lớp cha Point2D
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX(); // Gọi getX() của lớp cha Point2D
        result[1] = getY(); // Gọi getY() của lớp cha Point2D
        result[2] = z;
        return result;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}