package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final ByteString f5793b = new LiteralByteString(C0871u.f5936b);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0805c f5794c;

    /* JADX INFO: renamed from: a */
    public int f5795a = 0;

    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C0842g(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {

        /* JADX INFO: renamed from: d */
        public final byte[] f5796d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f5796d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: C */
        public final String mo3058C(Charset charset) {
            return new String(this.f5796d, m3064G(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: D */
        public final void mo3059D(AbstractC0839f abstractC0839f) throws IOException {
            abstractC0839f.mo3118a(this.f5796d, m3064G(), size());
        }

        /* JADX INFO: renamed from: G */
        public int m3064G() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: a */
        public byte mo3060a(int i10) {
            return this.f5796d[i10];
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i10 = this.f5795a;
            int i11 = literalByteString.f5795a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > literalByteString.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (0 + size > literalByteString.size()) {
                StringBuilder sbM614j = C0141b.m614j("Ran off end of other: 0, ", size, ", ");
                sbM614j.append(literalByteString.size());
                throw new IllegalArgumentException(sbM614j.toString());
            }
            int iM3064G = m3064G() + size;
            int iM3064G2 = m3064G();
            int iM3064G3 = literalByteString.m3064G() + 0;
            while (iM3064G2 < iM3064G) {
                if (this.f5796d[iM3064G2] != literalByteString.f5796d[iM3064G3]) {
                    return false;
                }
                iM3064G2++;
                iM3064G3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: s */
        public byte mo3061s(int i10) {
            return this.f5796d[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f5796d.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: t */
        public final boolean mo3062t() {
            int iM3064G = m3064G();
            return Utf8.f5816a.mo3161c(iM3064G, size() + iM3064G, this.f5796d) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        /* JADX INFO: renamed from: y */
        public final int mo3063y(int i10, int i11) {
            int iM3064G = m3064G() + 0;
            Charset charset = C0871u.f5935a;
            for (int i12 = iM3064G; i12 < iM3064G + i11; i12++) {
                i10 = (i10 * 31) + this.f5796d[i12];
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$a */
    public static abstract class AbstractC0803a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C0842g c0842g = (C0842g) this;
            int i10 = c0842g.f5854a;
            if (i10 >= c0842g.f5855b) {
                throw new NoSuchElementException();
            }
            c0842g.f5854a = i10 + 1;
            return Byte.valueOf(c0842g.f5856c.mo3061s(i10));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$b */
    public static final class C0804b implements InterfaceC0805c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0805c
        /* JADX INFO: renamed from: a */
        public final byte[] mo3065a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$c */
    public interface InterfaceC0805c {
        /* JADX INFO: renamed from: a */
        byte[] mo3065a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$d */
    public static final class C0806d implements InterfaceC0805c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.InterfaceC0805c
        /* JADX INFO: renamed from: a */
        public final byte[] mo3065a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f5794c = C0833d.m3200a() ? new C0806d() : new C0804b();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l */
    public static int m3056l(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(C0166e.m762h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(C0204c.m851j("End index: ", i11, " >= ", i12));
    }

    /* JADX INFO: renamed from: q */
    public static ByteString m3057q(byte[] bArr, int i10, int i11) {
        m3056l(i10, i10 + i11, bArr.length);
        return new LiteralByteString(f5794c.mo3065a(bArr, i10, i11));
    }

    /* JADX INFO: renamed from: C */
    public abstract String mo3058C(Charset charset);

    /* JADX INFO: renamed from: D */
    public abstract void mo3059D(AbstractC0839f abstractC0839f) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract byte mo3060a(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo3063y = this.f5795a;
        if (iMo3063y == 0) {
            int size = size();
            iMo3063y = mo3063y(size, size);
            if (iMo3063y == 0) {
                iMo3063y = 1;
            }
            this.f5795a = iMo3063y;
        }
        return iMo3063y;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C0842g(this);
    }

    /* JADX INFO: renamed from: s */
    public abstract byte mo3061s(int i10);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo3062t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: y */
    public abstract int mo3063y(int i10, int i11);
}
