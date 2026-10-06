package p000;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0895p extends Number implements Comparable {
    private static final long serialVersionUID = -4756200506571685661L;

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final double f47132a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final int f47133b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final int f47134c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public final long f47135d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public final long f47136e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final long f47137f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final boolean f47138g;

    private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    @Override // java.lang.Comparable
    @Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0895p c0895p = (C0895p) obj;
        long j = this.f47137f;
        long j2 = c0895p.f47137f;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        double d = this.f47132a;
        double d2 = c0895p.f47132a;
        if (d != d2) {
            return d >= d2 ? 1 : -1;
        }
        int i = this.f47133b;
        int i2 = c0895p.f47133b;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        long j3 = this.f47135d - c0895p.f47135d;
        if (j3 != 0) {
            return j3 >= 0 ? 1 : -1;
        }
        return 0;
    }

    @Override // java.lang.Number
    @Deprecated
    public final double doubleValue() {
        return this.f47138g ? -this.f47132a : this.f47132a;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0895p)) {
            return false;
        }
        C0895p c0895p = (C0895p) obj;
        return this.f47132a == c0895p.f47132a && this.f47133b == c0895p.f47133b && this.f47135d == c0895p.f47135d;
    }

    @Override // java.lang.Number
    @Deprecated
    public final float floatValue() {
        return (float) this.f47132a;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.f47135d + ((long) ((this.f47133b + ((int) (this.f47132a * 37.0d))) * 37)));
    }

    @Override // java.lang.Number
    @Deprecated
    public final int intValue() {
        return (int) this.f47137f;
    }

    @Override // java.lang.Number
    @Deprecated
    public final long longValue() {
        return this.f47137f;
    }

    @Deprecated
    public final String toString() {
        return String.format("%." + this.f47133b + "f", Double.valueOf(this.f47132a));
    }

    @Deprecated
    public C0895p(double d, int i) {
        int iRound;
        if (i == 0) {
            iRound = 0;
        } else {
            double d2 = d < 0.0d ? -d : d;
            int iPow = (int) Math.pow(10.0d, i);
            double d3 = iPow;
            Double.isNaN(d3);
            iRound = (int) (Math.round(d2 * d3) % ((long) iPow));
        }
        boolean z = d < 0.0d;
        this.f47138g = z;
        long j = iRound;
        this.f47132a = z ? -d : d;
        this.f47133b = i;
        this.f47135d = j;
        this.f47137f = d > 1.0E18d ? 1000000000000000000L : (long) d;
        if (j == 0) {
            this.f47136e = 0L;
            this.f47134c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.f47136e = j;
            this.f47134c = i2;
        }
        Math.pow(10.0d, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public C0895p(String str) {
        double d = Double.parseDouble(str);
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(46) + 1;
        this(d, iIndexOf == 0 ? 0 : strTrim.length() - iIndexOf);
    }
}
