package androidx.datastore.preferences.protobuf;

import androidx.activity.result.C0204c;
import androidx.datastore.core.SingleProcessDataStore;
import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC0839f {

    /* JADX INFO: renamed from: b */
    public static final Logger f5797b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f5798c = C0841f1.f5850f;

    /* JADX INFO: renamed from: a */
    public C0849j f5799a;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(C0204c.m852k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$a */
    public static abstract class AbstractC0807a extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f5800d;

        /* JADX INFO: renamed from: e */
        public final int f5801e;

        /* JADX INFO: renamed from: f */
        public int f5802f;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public AbstractC0807a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f5800d = bArr;
            this.f5801e = bArr.length;
        }

        /* JADX INFO: renamed from: V */
        public final void m3112V(int i10) {
            int i11 = this.f5802f;
            int i12 = i11 + 1;
            byte[] bArr = this.f5800d;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f5802f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        /* JADX INFO: renamed from: W */
        public final void m3113W(long j10) {
            int i10 = this.f5802f;
            int i11 = i10 + 1;
            byte[] bArr = this.f5800d;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f5802f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        /* JADX INFO: renamed from: X */
        public final void m3114X(int i10, int i11) {
            m3115Y((i10 << 3) | i11);
        }

        /* JADX INFO: renamed from: Y */
        public final void m3115Y(int i10) {
            boolean z10 = CodedOutputStream.f5798c;
            byte[] bArr = this.f5800d;
            if (z10) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.f5802f;
                    this.f5802f = i11 + 1;
                    C0841f1.m3230p(bArr, i11, (byte) ((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH));
                    i10 >>>= 7;
                }
                int i12 = this.f5802f;
                this.f5802f = i12 + 1;
                C0841f1.m3230p(bArr, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                int i13 = this.f5802f;
                this.f5802f = i13 + 1;
                bArr[i13] = (byte) ((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                i10 >>>= 7;
            }
            int i14 = this.f5802f;
            this.f5802f = i14 + 1;
            bArr[i14] = (byte) i10;
        }

        /* JADX INFO: renamed from: Z */
        public final void m3116Z(long j10) {
            boolean z10 = CodedOutputStream.f5798c;
            byte[] bArr = this.f5800d;
            if (z10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f5802f;
                    this.f5802f = i10 + 1;
                    C0841f1.m3230p(bArr, i10, (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH));
                    j10 >>>= 7;
                }
                int i11 = this.f5802f;
                this.f5802f = i11 + 1;
                C0841f1.m3230p(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                int i12 = this.f5802f;
                this.f5802f = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                j10 >>>= 7;
            }
            int i13 = this.f5802f;
            this.f5802f = i13 + 1;
            bArr[i13] = (byte) j10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    public static class C0808b extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f5803d;

        /* JADX INFO: renamed from: e */
        public final int f5804e;

        /* JADX INFO: renamed from: f */
        public int f5805f;

        public C0808b(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f5803d = bArr;
            this.f5805f = 0;
            this.f5804e = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo3089A(int i10, boolean z10) throws IOException {
            mo3105Q(i10, 0);
            mo3111z(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo3090B(byte[] bArr, int i10) throws IOException {
            mo3107S(i10);
            m3117V(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo3091C(int i10, ByteString byteString) throws IOException {
            mo3105Q(i10, 2);
            mo3092D(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo3092D(ByteString byteString) throws IOException {
            mo3107S(byteString.size());
            byteString.mo3059D(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo3093E(int i10, int i11) throws IOException {
            mo3105Q(i10, 5);
            mo3094F(i11);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo3094F(int i10) throws IOException {
            try {
                byte[] bArr = this.f5803d;
                int i11 = this.f5805f;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f5805f = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(this.f5804e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo3095G(int i10, long j10) throws IOException {
            mo3105Q(i10, 1);
            mo3096H(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo3096H(long j10) throws IOException {
            try {
                byte[] bArr = this.f5803d;
                int i10 = this.f5805f;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f5805f = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(this.f5804e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo3097I(int i10, int i11) throws IOException {
            mo3105Q(i10, 0);
            mo3098J(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo3098J(int i10) throws IOException {
            if (i10 >= 0) {
                mo3107S(i10);
            } else {
                mo3109U(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo3099K(int i10, InterfaceC0848i0 interfaceC0848i0, InterfaceC0876w0 interfaceC0876w0) throws IOException {
            mo3105Q(i10, 2);
            mo3107S(((AbstractC0824a) interfaceC0848i0).m3164i(interfaceC0876w0));
            interfaceC0876w0.mo3389e(interfaceC0848i0, this.f5799a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo3100L(InterfaceC0848i0 interfaceC0848i0) throws IOException {
            mo3107S(interfaceC0848i0.mo3130d());
            interfaceC0848i0.mo3133h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: M */
        public final void mo3101M(int i10, InterfaceC0848i0 interfaceC0848i0) throws IOException {
            mo3105Q(1, 3);
            mo3106R(2, i10);
            mo3105Q(3, 2);
            mo3100L(interfaceC0848i0);
            mo3105Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: N */
        public final void mo3102N(int i10, ByteString byteString) throws IOException {
            mo3105Q(1, 3);
            mo3106R(2, i10);
            mo3091C(3, byteString);
            mo3105Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: O */
        public final void mo3103O(String str, int i10) throws IOException {
            mo3105Q(i10, 2);
            mo3104P(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: P */
        public final void mo3104P(String str) throws IOException {
            int i10 = this.f5805f;
            try {
                int iM3086v = CodedOutputStream.m3086v(str.length() * 3);
                int iM3086v2 = CodedOutputStream.m3086v(str.length());
                int i11 = this.f5804e;
                byte[] bArr = this.f5803d;
                if (iM3086v2 == iM3086v) {
                    int i12 = i10 + iM3086v2;
                    this.f5805f = i12;
                    int iMo3160b = Utf8.f5816a.mo3160b(str, bArr, i12, i11 - i12);
                    this.f5805f = i10;
                    mo3107S((iMo3160b - i10) - iM3086v2);
                    this.f5805f = iMo3160b;
                } else {
                    mo3107S(Utf8.m3153b(str));
                    int i13 = this.f5805f;
                    this.f5805f = Utf8.f5816a.mo3160b(str, bArr, i13, i11 - i13);
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f5805f = i10;
                m3110y(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Q */
        public final void mo3105Q(int i10, int i11) throws IOException {
            mo3107S((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: R */
        public final void mo3106R(int i10, int i11) throws IOException {
            mo3105Q(i10, 0);
            mo3107S(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: S */
        public final void mo3107S(int i10) throws IOException {
            boolean z10 = CodedOutputStream.f5798c;
            int i11 = this.f5804e;
            byte[] bArr = this.f5803d;
            if (z10 && !C0833d.m3200a()) {
                int i12 = this.f5805f;
                if (i11 - i12 >= 5) {
                    if ((i10 & (-128)) == 0) {
                        this.f5805f = i12 + 1;
                        C0841f1.m3230p(bArr, i12, (byte) i10);
                        return;
                    }
                    this.f5805f = i12 + 1;
                    C0841f1.m3230p(bArr, i12, (byte) (i10 | BuildConfig.SDK_TRUNCATE_LENGTH));
                    int i13 = i10 >>> 7;
                    if ((i13 & (-128)) == 0) {
                        int i14 = this.f5805f;
                        this.f5805f = i14 + 1;
                        C0841f1.m3230p(bArr, i14, (byte) i13);
                        return;
                    }
                    int i15 = this.f5805f;
                    this.f5805f = i15 + 1;
                    C0841f1.m3230p(bArr, i15, (byte) (i13 | BuildConfig.SDK_TRUNCATE_LENGTH));
                    int i16 = i13 >>> 7;
                    if ((i16 & (-128)) == 0) {
                        int i17 = this.f5805f;
                        this.f5805f = i17 + 1;
                        C0841f1.m3230p(bArr, i17, (byte) i16);
                        return;
                    }
                    int i18 = this.f5805f;
                    this.f5805f = i18 + 1;
                    C0841f1.m3230p(bArr, i18, (byte) (i16 | BuildConfig.SDK_TRUNCATE_LENGTH));
                    int i19 = i16 >>> 7;
                    if ((i19 & (-128)) == 0) {
                        int i20 = this.f5805f;
                        this.f5805f = i20 + 1;
                        C0841f1.m3230p(bArr, i20, (byte) i19);
                        return;
                    } else {
                        int i21 = this.f5805f;
                        this.f5805f = i21 + 1;
                        C0841f1.m3230p(bArr, i21, (byte) (i19 | BuildConfig.SDK_TRUNCATE_LENGTH));
                        int i22 = this.f5805f;
                        this.f5805f = i22 + 1;
                        C0841f1.m3230p(bArr, i22, (byte) (i19 >>> 7));
                        return;
                    }
                }
            }
            while ((i10 & (-128)) != 0) {
                try {
                    int i23 = this.f5805f;
                    this.f5805f = i23 + 1;
                    bArr[i23] = (byte) ((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(i11), 1), e10);
                }
            }
            int i24 = this.f5805f;
            this.f5805f = i24 + 1;
            bArr[i24] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public final void mo3108T(int i10, long j10) throws IOException {
            mo3105Q(i10, 0);
            mo3109U(j10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: U */
        public final void mo3109U(long j10) throws IOException {
            boolean z10 = CodedOutputStream.f5798c;
            int i10 = this.f5804e;
            byte[] bArr = this.f5803d;
            if (z10 && i10 - this.f5805f >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i11 = this.f5805f;
                    this.f5805f = i11 + 1;
                    C0841f1.m3230p(bArr, i11, (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH));
                    j10 >>>= 7;
                }
                int i12 = this.f5805f;
                this.f5805f = i12 + 1;
                C0841f1.m3230p(bArr, i12, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = this.f5805f;
                    this.f5805f = i13 + 1;
                    bArr[i13] = (byte) ((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(i10), 1), e10);
                }
            }
            int i14 = this.f5805f;
            this.f5805f = i14 + 1;
            bArr[i14] = (byte) j10;
        }

        /* JADX INFO: renamed from: V */
        public final void m3117V(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f5803d, this.f5805f, i11);
                this.f5805f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(this.f5804e), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0839f
        /* JADX INFO: renamed from: a */
        public final void mo3118a(byte[] bArr, int i10, int i11) throws IOException {
            m3117V(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo3111z(byte b10) throws IOException {
            try {
                byte[] bArr = this.f5803d;
                int i10 = this.f5805f;
                this.f5805f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5805f), Integer.valueOf(this.f5804e), 1), e10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    public static final class C0809c extends AbstractC0807a {

        /* JADX INFO: renamed from: g */
        public final OutputStream f5806g;

        public C0809c(SingleProcessDataStore.C0791b c0791b, int i10) {
            super(i10);
            this.f5806g = c0791b;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: A */
        public final void mo3089A(int i10, boolean z10) throws IOException {
            m3120b0(11);
            m3114X(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.f5802f;
            this.f5802f = i11 + 1;
            this.f5800d[i11] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: B */
        public final void mo3090B(byte[] bArr, int i10) throws IOException {
            mo3107S(i10);
            m3121c0(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: C */
        public final void mo3091C(int i10, ByteString byteString) throws IOException {
            mo3105Q(i10, 2);
            mo3092D(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D */
        public final void mo3092D(ByteString byteString) throws IOException {
            mo3107S(byteString.size());
            byteString.mo3059D(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E */
        public final void mo3093E(int i10, int i11) throws IOException {
            m3120b0(14);
            m3114X(i10, 5);
            m3112V(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F */
        public final void mo3094F(int i10) throws IOException {
            m3120b0(4);
            m3112V(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G */
        public final void mo3095G(int i10, long j10) throws IOException {
            m3120b0(18);
            m3114X(i10, 1);
            m3113W(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H */
        public final void mo3096H(long j10) throws IOException {
            m3120b0(8);
            m3113W(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I */
        public final void mo3097I(int i10, int i11) throws IOException {
            m3120b0(20);
            m3114X(i10, 0);
            if (i11 >= 0) {
                m3115Y(i11);
            } else {
                m3116Z(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J */
        public final void mo3098J(int i10) throws IOException {
            if (i10 >= 0) {
                mo3107S(i10);
            } else {
                mo3109U(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K */
        public final void mo3099K(int i10, InterfaceC0848i0 interfaceC0848i0, InterfaceC0876w0 interfaceC0876w0) throws IOException {
            mo3105Q(i10, 2);
            mo3107S(((AbstractC0824a) interfaceC0848i0).m3164i(interfaceC0876w0));
            interfaceC0876w0.mo3389e(interfaceC0848i0, this.f5799a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L */
        public final void mo3100L(InterfaceC0848i0 interfaceC0848i0) throws IOException {
            mo3107S(interfaceC0848i0.mo3130d());
            interfaceC0848i0.mo3133h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: M */
        public final void mo3101M(int i10, InterfaceC0848i0 interfaceC0848i0) throws IOException {
            mo3105Q(1, 3);
            mo3106R(2, i10);
            mo3105Q(3, 2);
            mo3100L(interfaceC0848i0);
            mo3105Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: N */
        public final void mo3102N(int i10, ByteString byteString) throws IOException {
            mo3105Q(1, 3);
            mo3106R(2, i10);
            mo3091C(3, byteString);
            mo3105Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: O */
        public final void mo3103O(String str, int i10) throws IOException {
            mo3105Q(i10, 2);
            mo3104P(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: P */
        public final void mo3104P(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iM3086v = CodedOutputStream.m3086v(length);
                int i10 = iM3086v + length;
                int i11 = this.f5801e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iMo3160b = Utf8.f5816a.mo3160b(str, bArr, 0, length);
                    mo3107S(iMo3160b);
                    m3121c0(bArr, 0, iMo3160b);
                    return;
                }
                if (i10 > i11 - this.f5802f) {
                    m3119a0();
                }
                int iM3086v2 = CodedOutputStream.m3086v(str.length());
                int i12 = this.f5802f;
                byte[] bArr2 = this.f5800d;
                try {
                    if (iM3086v2 == iM3086v) {
                        int i13 = i12 + iM3086v2;
                        this.f5802f = i13;
                        int iMo3160b2 = Utf8.f5816a.mo3160b(str, bArr2, i13, i11 - i13);
                        this.f5802f = i12;
                        m3115Y((iMo3160b2 - i12) - iM3086v2);
                        this.f5802f = iMo3160b2;
                    } else {
                        int iM3153b = Utf8.m3153b(str);
                        m3115Y(iM3153b);
                        this.f5802f = Utf8.f5816a.mo3160b(str, bArr2, this.f5802f, iM3153b);
                    }
                } catch (Utf8.UnpairedSurrogateException e10) {
                    this.f5802f = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                m3110y(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Q */
        public final void mo3105Q(int i10, int i11) throws IOException {
            mo3107S((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: R */
        public final void mo3106R(int i10, int i11) throws IOException {
            m3120b0(20);
            m3114X(i10, 0);
            m3115Y(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: S */
        public final void mo3107S(int i10) throws IOException {
            m3120b0(5);
            m3115Y(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public final void mo3108T(int i10, long j10) throws IOException {
            m3120b0(20);
            m3114X(i10, 0);
            m3116Z(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: U */
        public final void mo3109U(long j10) throws IOException {
            m3120b0(10);
            m3116Z(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0839f
        /* JADX INFO: renamed from: a */
        public final void mo3118a(byte[] bArr, int i10, int i11) throws IOException {
            m3121c0(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: a0 */
        public final void m3119a0() throws IOException {
            this.f5806g.write(this.f5800d, 0, this.f5802f);
            this.f5802f = 0;
        }

        /* JADX INFO: renamed from: b0 */
        public final void m3120b0(int i10) throws IOException {
            if (this.f5801e - this.f5802f < i10) {
                m3119a0();
            }
        }

        /* JADX INFO: renamed from: c0 */
        public final void m3121c0(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f5802f;
            int i13 = this.f5801e;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f5800d;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f5802f += i11;
                return;
            }
            System.arraycopy(bArr, i10, bArr2, i12, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f5802f = i13;
            m3119a0();
            if (i16 > i13) {
                this.f5806g.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, bArr2, 0, i16);
                this.f5802f = i16;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: z */
        public final void mo3111z(byte b10) throws IOException {
            if (this.f5802f == this.f5801e) {
                m3119a0();
            }
            int i10 = this.f5802f;
            this.f5802f = i10 + 1;
            this.f5800d[i10] = b10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3066b(int i10) {
        return m3084t(i10) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m3067c(int i10, ByteString byteString) {
        int iM3084t = m3084t(i10);
        int size = byteString.size();
        return m3086v(size) + size + iM3084t;
    }

    /* JADX INFO: renamed from: d */
    public static int m3068d(int i10) {
        return m3084t(i10) + 8;
    }

    /* JADX INFO: renamed from: e */
    public static int m3069e(int i10, int i11) {
        return m3075k(i11) + m3084t(i10);
    }

    /* JADX INFO: renamed from: f */
    public static int m3070f(int i10) {
        return m3084t(i10) + 4;
    }

    /* JADX INFO: renamed from: g */
    public static int m3071g(int i10) {
        return m3084t(i10) + 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m3072h(int i10) {
        return m3084t(i10) + 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static int m3073i(int i10, InterfaceC0848i0 interfaceC0848i0, InterfaceC0876w0 interfaceC0876w0) {
        return ((AbstractC0824a) interfaceC0848i0).m3164i(interfaceC0876w0) + (m3084t(i10) * 2);
    }

    /* JADX INFO: renamed from: j */
    public static int m3074j(int i10, int i11) {
        return m3075k(i11) + m3084t(i10);
    }

    /* JADX INFO: renamed from: k */
    public static int m3075k(int i10) {
        if (i10 >= 0) {
            return m3086v(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: l */
    public static int m3076l(int i10, long j10) {
        return m3088x(j10) + m3084t(i10);
    }

    /* JADX INFO: renamed from: m */
    public static int m3077m(C0875w c0875w) {
        int iMo3130d;
        if (c0875w.f5944b != null) {
            iMo3130d = c0875w.f5944b.size();
        } else {
            iMo3130d = c0875w.f5943a != null ? c0875w.f5943a.mo3130d() : 0;
        }
        return m3086v(iMo3130d) + iMo3130d;
    }

    /* JADX INFO: renamed from: n */
    public static int m3078n(int i10) {
        return m3084t(i10) + 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m3079o(int i10) {
        return m3084t(i10) + 8;
    }

    /* JADX INFO: renamed from: p */
    public static int m3080p(int i10, int i11) {
        return m3086v((i11 >> 31) ^ (i11 << 1)) + m3084t(i10);
    }

    /* JADX INFO: renamed from: q */
    public static int m3081q(int i10, long j10) {
        return m3088x((j10 >> 63) ^ (j10 << 1)) + m3084t(i10);
    }

    /* JADX INFO: renamed from: r */
    public static int m3082r(String str, int i10) {
        return m3083s(str) + m3084t(i10);
    }

    /* JADX INFO: renamed from: s */
    public static int m3083s(String str) {
        int length;
        try {
            length = Utf8.m3153b(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C0871u.f5935a).length;
        }
        return m3086v(length) + length;
    }

    /* JADX INFO: renamed from: t */
    public static int m3084t(int i10) {
        return m3086v((i10 << 3) | 0);
    }

    /* JADX INFO: renamed from: u */
    public static int m3085u(int i10, int i11) {
        return m3086v(i11) + m3084t(i10);
    }

    /* JADX INFO: renamed from: v */
    public static int m3086v(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: w */
    public static int m3087w(int i10, long j10) {
        return m3088x(j10) + m3084t(i10);
    }

    /* JADX INFO: renamed from: x */
    public static int m3088x(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo3089A(int i10, boolean z10) throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract void mo3090B(byte[] bArr, int i10) throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract void mo3091C(int i10, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract void mo3092D(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract void mo3093E(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: F */
    public abstract void mo3094F(int i10) throws IOException;

    /* JADX INFO: renamed from: G */
    public abstract void mo3095G(int i10, long j10) throws IOException;

    /* JADX INFO: renamed from: H */
    public abstract void mo3096H(long j10) throws IOException;

    /* JADX INFO: renamed from: I */
    public abstract void mo3097I(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: J */
    public abstract void mo3098J(int i10) throws IOException;

    /* JADX INFO: renamed from: K */
    public abstract void mo3099K(int i10, InterfaceC0848i0 interfaceC0848i0, InterfaceC0876w0 interfaceC0876w0) throws IOException;

    /* JADX INFO: renamed from: L */
    public abstract void mo3100L(InterfaceC0848i0 interfaceC0848i0) throws IOException;

    /* JADX INFO: renamed from: M */
    public abstract void mo3101M(int i10, InterfaceC0848i0 interfaceC0848i0) throws IOException;

    /* JADX INFO: renamed from: N */
    public abstract void mo3102N(int i10, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: O */
    public abstract void mo3103O(String str, int i10) throws IOException;

    /* JADX INFO: renamed from: P */
    public abstract void mo3104P(String str) throws IOException;

    /* JADX INFO: renamed from: Q */
    public abstract void mo3105Q(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract void mo3106R(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: S */
    public abstract void mo3107S(int i10) throws IOException;

    /* JADX INFO: renamed from: T */
    public abstract void mo3108T(int i10, long j10) throws IOException;

    /* JADX INFO: renamed from: U */
    public abstract void mo3109U(long j10) throws IOException;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y */
    public final void m3110y(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f5797b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(C0871u.f5935a);
        try {
            mo3107S(bytes.length);
            mo3118a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo3111z(byte b10) throws IOException;
}
