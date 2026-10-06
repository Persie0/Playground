package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class non extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public non() {
        this(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        m17568b(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(m17567a());
    }

    /* JADX INFO: renamed from: a */
    public final double m17567a() {
        return Double.longBitsToDouble(this.value.get());
    }

    /* JADX INFO: renamed from: b */
    public final void m17568b(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return m17567a();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) m17567a();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) m17567a();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) m17567a();
    }

    public final String toString() {
        return Double.toString(m17567a());
    }

    public non(byte[] bArr) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(0.0d));
    }
}
