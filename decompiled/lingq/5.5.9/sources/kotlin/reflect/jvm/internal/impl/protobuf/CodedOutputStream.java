package kotlin.reflect.jvm.internal.impl.protobuf;

import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import p282nn.AbstractC7803a;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f39484a;

    /* JADX INFO: renamed from: b */
    public final int f39485b;

    /* JADX INFO: renamed from: c */
    public int f39486c = 0;

    /* JADX INFO: renamed from: d */
    public final OutputStream f39487d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f39487d = outputStream;
        this.f39484a = bArr;
        this.f39485b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static int m13893a(int i10, int i11) {
        return m13895c(i11) + m13900h(i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m13894b(int i10, int i11) {
        return m13895c(i11) + m13900h(i10);
    }

    /* JADX INFO: renamed from: c */
    public static int m13895c(int i10) {
        if (i10 >= 0) {
            return m13898f(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: d */
    public static int m13896d(int i10, InterfaceC6997h interfaceC6997h) {
        int iM13900h = m13900h(i10);
        int iMo13782d = interfaceC6997h.mo13782d();
        return m13898f(iMo13782d) + iMo13782d + iM13900h;
    }

    /* JADX INFO: renamed from: e */
    public static int m13897e(InterfaceC6997h interfaceC6997h) {
        int iMo13782d = interfaceC6997h.mo13782d();
        return m13898f(iMo13782d) + iMo13782d;
    }

    /* JADX INFO: renamed from: f */
    public static int m13898f(int i10) {
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

    /* JADX INFO: renamed from: g */
    public static int m13899g(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: h */
    public static int m13900h(int i10) {
        return m13898f((i10 << 3) | 0);
    }

    /* JADX INFO: renamed from: j */
    public static CodedOutputStream m13901j(OutputStream outputStream, int i10) {
        return new CodedOutputStream(outputStream, new byte[i10]);
    }

    /* JADX INFO: renamed from: i */
    public final void m13902i() throws IOException {
        if (this.f39487d != null) {
            m13903k();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final void m13903k() throws IOException {
        OutputStream outputStream = this.f39487d;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f39484a, 0, this.f39486c);
        this.f39486c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m13904l(int i10, int i11) throws IOException {
        m13916x(i10, 0);
        m13906n(i11);
    }

    /* JADX INFO: renamed from: m */
    public final void m13905m(int i10, int i11) throws IOException {
        m13916x(i10, 0);
        m13906n(i11);
    }

    /* JADX INFO: renamed from: n */
    public final void m13906n(int i10) throws IOException {
        if (i10 >= 0) {
            m13914v(i10);
        } else {
            m13915w(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m13907o(int i10, InterfaceC6997h interfaceC6997h) throws IOException {
        m13916x(i10, 2);
        m13908p(interfaceC6997h);
    }

    /* JADX INFO: renamed from: p */
    public final void m13908p(InterfaceC6997h interfaceC6997h) throws IOException {
        m13914v(interfaceC6997h.mo13782d());
        interfaceC6997h.mo13784j(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m13909q(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (this.f39486c == this.f39485b) {
            m13903k();
        }
        int i11 = this.f39486c;
        this.f39486c = i11 + 1;
        this.f39484a[i11] = b10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final void m13910r(AbstractC7803a abstractC7803a) throws IOException {
        int size = abstractC7803a.size();
        int i10 = this.f39486c;
        int i11 = this.f39485b;
        int i12 = i11 - i10;
        byte[] bArr = this.f39484a;
        if (i12 >= size) {
            abstractC7803a.m15520g(0, i10, size, bArr);
            this.f39486c += size;
            return;
        }
        abstractC7803a.m15520g(0, i10, i12, bArr);
        int i13 = i12 + 0;
        int i14 = size - i12;
        this.f39486c = i11;
        m13903k();
        if (i14 <= i11) {
            abstractC7803a.m15520g(i13, 0, i14, bArr);
            this.f39486c = i14;
            return;
        }
        if (i13 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i13);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i14 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i14);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i15 = i13 + i14;
        if (i15 <= abstractC7803a.size()) {
            if (i14 > 0) {
                abstractC7803a.mo15530y(this.f39487d, i13, i14);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i15);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13911s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = this.f39486c;
        int i11 = this.f39485b;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f39484a;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.f39486c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        int i13 = i12 + 0;
        int i14 = length - i12;
        this.f39486c = i11;
        m13903k();
        if (i14 > i11) {
            this.f39487d.write(bArr, i13, i14);
        } else {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.f39486c = i14;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13912t(int i10) throws IOException {
        m13909q(i10 & 255);
        m13909q((i10 >> 8) & 255);
        m13909q((i10 >> 16) & 255);
        m13909q((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: u */
    public final void m13913u(long j10) throws IOException {
        m13909q(((int) j10) & 255);
        m13909q(((int) (j10 >> 8)) & 255);
        m13909q(((int) (j10 >> 16)) & 255);
        m13909q(((int) (j10 >> 24)) & 255);
        m13909q(((int) (j10 >> 32)) & 255);
        m13909q(((int) (j10 >> 40)) & 255);
        m13909q(((int) (j10 >> 48)) & 255);
        m13909q(((int) (j10 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: v */
    public final void m13914v(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            m13909q((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
            i10 >>>= 7;
        }
        m13909q(i10);
    }

    /* JADX INFO: renamed from: w */
    public final void m13915w(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            m13909q((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
            j10 >>>= 7;
        }
        m13909q((int) j10);
    }

    /* JADX INFO: renamed from: x */
    public final void m13916x(int i10, int i11) throws IOException {
        m13914v((i10 << 3) | i11);
    }
}
