package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC3000fg;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.my5;
import p000.o94;
import p000.p58;
import p000.t6d;
import p000.ux5;
import p000.v63;
import p000.vk0;
import p000.wk0;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final ByteString f13555b = new LiteralByteString(o94.f54078b);

    /* JADX INFO: renamed from: c */
    public static final wk0 f13556c;

    /* JADX INFO: renamed from: a */
    public int f13557a;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class BoundedByteString extends LiteralByteString {

        /* JADX INFO: renamed from: e */
        public final int f13558e;

        /* JADX INFO: renamed from: f */
        public final int f13559f;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m6407f(i, i + i2, bArr.length);
            this.f13558e = i;
            this.f13559f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public final byte mo6409d(int i) {
            int i2 = this.f13559f;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f13560d[this.f13558e + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(ux5.m22988k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(wq1.m24115k("Index > length: ", i, i2, ", "));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: h */
        public final void mo6410h(int i, byte[] bArr) {
            System.arraycopy(this.f13560d, this.f13558e, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: i */
        public final byte mo6411i(int i) {
            return this.f13560d[this.f13558e + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        /* JADX INFO: renamed from: k */
        public final int mo6413k() {
            return this.f13558e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.f13559f;
        }

        public Object writeReplace() {
            return new LiteralByteString(m6412j());
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
        public final byte[] f13560d;

        public LiteralByteString(byte[] bArr) {
            this.f13557a = 0;
            bArr.getClass();
            this.f13560d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: d */
        public byte mo6409d(int i) {
            return this.f13560d[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
                int i = this.f13557a;
                int i2 = literalByteString.f13557a;
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
                    byte[] bArr = literalByteString.f13560d;
                    int iMo6413k = mo6413k() + size;
                    int iMo6413k2 = mo6413k();
                    int iMo6413k3 = literalByteString.mo6413k();
                    while (iMo6413k2 < iMo6413k) {
                        if (this.f13560d[iMo6413k2] == bArr[iMo6413k3]) {
                            iMo6413k2++;
                            iMo6413k3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: h */
        public void mo6410h(int i, byte[] bArr) {
            System.arraycopy(this.f13560d, 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        /* JADX INFO: renamed from: i */
        public byte mo6411i(int i) {
            return this.f13560d[i];
        }

        /* JADX INFO: renamed from: k */
        public int mo6413k() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.f13560d.length;
        }
    }

    static {
        f13556c = AbstractC3000fg.m11816a() ? new p58(8) : new my5(5);
    }

    /* JADX INFO: renamed from: f */
    public static int m6407f(int i, int i2, int i3) {
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
    public static ByteString m6408g(byte[] bArr, int i, int i2) {
        m6407f(i, i + i2, bArr.length);
        return new LiteralByteString(f13556c.copyFrom(bArr, i, i2));
    }

    /* JADX INFO: renamed from: d */
    public abstract byte mo6409d(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo6410h(int i, byte[] bArr);

    public final int hashCode() {
        int i = this.f13557a;
        if (i != 0) {
            return i;
        }
        int size = size();
        LiteralByteString literalByteString = (LiteralByteString) this;
        int iMo6413k = literalByteString.mo6413k();
        int i2 = size;
        for (int i3 = iMo6413k; i3 < iMo6413k + size; i3++) {
            i2 = (i2 * 31) + literalByteString.f13560d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f13557a = i2;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public abstract byte mo6411i(int i);

    /* JADX INFO: renamed from: j */
    public final byte[] m6412j() {
        int size = size();
        if (size == 0) {
            return o94.f54078b;
        }
        byte[] bArr = new byte[size];
        mo6410h(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = t6d.m21880b(this);
        } else {
            LiteralByteString literalByteString = (LiteralByteString) this;
            int iM6407f = m6407f(0, 47, literalByteString.size());
            strConcat = t6d.m21880b(iM6407f == 0 ? f13555b : new BoundedByteString(literalByteString.f13560d, literalByteString.mo6413k(), iM6407f)).concat("...");
        }
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
