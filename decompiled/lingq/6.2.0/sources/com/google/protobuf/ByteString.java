package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3037gg;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.p94;
import p000.u6d;
import p000.ux5;
import p000.v63;
import p000.vk0;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final ByteString f13921b = new LiteralByteString(p94.f55801b);

    /* JADX INFO: renamed from: a */
    public int f13922a;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class BoundedByteString extends LiteralByteString {

        /* JADX INFO: renamed from: d */
        public final int f13923d;

        /* JADX INFO: renamed from: e */
        public final int f13924e;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m6781f(i, i + i2, bArr.length);
            this.f13923d = i;
            this.f13924e = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public final byte mo6782d(int i) {
            int i2 = this.f13924e;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f13925c[this.f13923d + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(ux5.m22988k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(wq1.m24115k("Index > length: ", i, i2, ", "));
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        /* JADX INFO: renamed from: g */
        public final byte mo6783g(int i) {
            return this.f13925c[this.f13923d + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        /* JADX INFO: renamed from: h */
        public final int mo6784h() {
            return this.f13923d;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.f13924e;
        }

        public Object writeReplace() {
            byte[] bArr;
            int i = this.f13924e;
            if (i == 0) {
                bArr = p94.f55801b;
            } else {
                byte[] bArr2 = new byte[i];
                System.arraycopy(this.f13925c, this.f13923d, bArr2, 0, i);
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

        /* JADX INFO: renamed from: c */
        public final byte[] f13925c;

        public LiteralByteString(byte[] bArr) {
            this.f13922a = 0;
            bArr.getClass();
            this.f13925c = bArr;
        }

        @Override // com.google.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public byte mo6782d(int i) {
            return this.f13925c[i];
        }

        @Override // com.google.protobuf.ByteString
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
                int i = this.f13922a;
                int i2 = literalByteString.f13922a;
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
                    byte[] bArr = literalByteString.f13925c;
                    int iMo6784h = mo6784h() + size;
                    int iMo6784h2 = mo6784h();
                    int iMo6784h3 = literalByteString.mo6784h();
                    while (iMo6784h2 < iMo6784h) {
                        if (this.f13925c[iMo6784h2] == bArr[iMo6784h3]) {
                            iMo6784h2++;
                            iMo6784h3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        /* JADX INFO: renamed from: g */
        public byte mo6783g(int i) {
            return this.f13925c[i];
        }

        /* JADX INFO: renamed from: h */
        public int mo6784h() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.f13925c.length;
        }
    }

    static {
        AbstractC3037gg.m12571a();
    }

    /* JADX INFO: renamed from: f */
    public static int m6781f(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: d */
    public abstract byte mo6782d(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract byte mo6783g(int i);

    public final int hashCode() {
        int i = this.f13922a;
        if (i != 0) {
            return i;
        }
        int size = size();
        LiteralByteString literalByteString = (LiteralByteString) this;
        int iMo6784h = literalByteString.mo6784h();
        int i2 = size;
        for (int i3 = iMo6784h; i3 < iMo6784h + size; i3++) {
            i2 = (i2 * 31) + literalByteString.f13925c[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f13922a = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = u6d.m22519d(this);
        } else {
            LiteralByteString literalByteString = (LiteralByteString) this;
            int iM6781f = m6781f(0, 47, literalByteString.size());
            strConcat = u6d.m22519d(iM6781f == 0 ? f13921b : new BoundedByteString(literalByteString.f13925c, literalByteString.mo6784h(), iM6781f)).concat("...");
        }
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
