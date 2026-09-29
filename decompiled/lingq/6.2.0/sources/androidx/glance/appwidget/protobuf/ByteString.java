package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3074hg;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bw8;
import p000.n58;
import p000.q94;
import p000.ux5;
import p000.v63;
import p000.vk0;
import p000.wq1;
import p000.xk0;
import p000.y6d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final ByteString f6037b = new LiteralByteString(q94.f57450b);

    /* JADX INFO: renamed from: c */
    public static final xk0 f6038c;

    /* JADX INFO: renamed from: a */
    public int f6039a;

    public static final class BoundedByteString extends LiteralByteString {

        /* JADX INFO: renamed from: e */
        public final int f6040e;

        /* JADX INFO: renamed from: f */
        public final int f6041f;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m2260f(i, i + i2, bArr.length);
            this.f6040e = i;
            this.f6041f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public final byte mo2262d(int i) {
            int i2 = this.f6041f;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f6042d[this.f6040e + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(ux5.m22988k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(wq1.m24115k("Index > length: ", i, i2, ", "));
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: h */
        public final void mo2263h(int i, byte[] bArr) {
            System.arraycopy(this.f6042d, this.f6040e, bArr, 0, i);
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: i */
        public final byte mo2264i(int i) {
            return this.f6042d[this.f6040e + i];
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString
        /* JADX INFO: renamed from: j */
        public final int mo2265j() {
            return this.f6040e;
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString.LiteralByteString, androidx.glance.appwidget.protobuf.ByteString
        public final int size() {
            return this.f6041f;
        }

        public Object writeReplace() {
            byte[] bArr;
            int size = size();
            if (size == 0) {
                bArr = q94.f57450b;
            } else {
                byte[] bArr2 = new byte[size];
                mo2263h(size, bArr2);
                bArr = bArr2;
            }
            return new LiteralByteString(bArr);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new vk0(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {

        /* JADX INFO: renamed from: d */
        public final byte[] f6042d;

        public LiteralByteString(byte[] bArr) {
            this.f6039a = 0;
            bArr.getClass();
            this.f6042d = bArr;
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public byte mo2262d(int i) {
            return this.f6042d[i];
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(obj instanceof LiteralByteString)) {
                    return obj.equals(this);
                }
                LiteralByteString literalByteString = (LiteralByteString) obj;
                int i = this.f6039a;
                int i2 = literalByteString.f6039a;
                if (i == 0 || i2 == 0 || i == i2) {
                    int size = size();
                    if (size > literalByteString.size()) {
                        C3386nv.m17620f(size, size());
                        return false;
                    }
                    if (size > literalByteString.size()) {
                        StringBuilder sbM22998u = ux5.m22998u("Ran off end of other: 0, ", size, ", ");
                        sbM22998u.append(literalByteString.size());
                        throw new IllegalArgumentException(sbM22998u.toString());
                    }
                    byte[] bArr = literalByteString.f6042d;
                    int iMo2265j = mo2265j() + size;
                    int iMo2265j2 = mo2265j();
                    int iMo2265j3 = literalByteString.mo2265j();
                    while (iMo2265j2 < iMo2265j) {
                        if (this.f6042d[iMo2265j2] == bArr[iMo2265j3]) {
                            iMo2265j2++;
                            iMo2265j3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: h */
        public void mo2263h(int i, byte[] bArr) {
            System.arraycopy(this.f6042d, 0, bArr, 0, i);
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString
        /* JADX INFO: renamed from: i */
        public byte mo2264i(int i) {
            return this.f6042d[i];
        }

        /* JADX INFO: renamed from: j */
        public int mo2265j() {
            return 0;
        }

        @Override // androidx.glance.appwidget.protobuf.ByteString
        public int size() {
            return this.f6042d.length;
        }
    }

    static {
        f6038c = AbstractC3074hg.m13220a() ? new bw8() : new n58(5);
    }

    /* JADX INFO: renamed from: f */
    public static int m2260f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            v63.m23143u(ux5.m22989l("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            v63.m23143u(wq1.m24115k("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        v63.m23143u(wq1.m24115k("End index: ", i2, i3, " >= "));
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static ByteString m2261g(byte[] bArr, int i, int i2) {
        m2260f(i, i + i2, bArr.length);
        return new LiteralByteString(f6038c.copyFrom(bArr, i, i2));
    }

    /* JADX INFO: renamed from: d */
    public abstract byte mo2262d(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo2263h(int i, byte[] bArr);

    public final int hashCode() {
        int i = this.f6039a;
        if (i != 0) {
            return i;
        }
        int size = size();
        LiteralByteString literalByteString = (LiteralByteString) this;
        int iMo2265j = literalByteString.mo2265j();
        int i2 = size;
        for (int i3 = iMo2265j; i3 < iMo2265j + size; i3++) {
            i2 = (i2 * 31) + literalByteString.f6042d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f6039a = i2;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public abstract byte mo2264i(int i);

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = y6d.m24964a(this);
        } else {
            LiteralByteString literalByteString = (LiteralByteString) this;
            int iM2260f = m2260f(0, 47, literalByteString.size());
            strConcat = y6d.m24964a(iM2260f == 0 ? f6037b : new BoundedByteString(literalByteString.f6042d, literalByteString.mo2265j(), iM2260f)).concat("...");
        }
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
