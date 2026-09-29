package p124fp;

import android.support.v4.media.session.C0166e;
import dm.C5206f;
import dm.C5207g;
import gp.C5862a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: fp.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622s implements InterfaceC5610g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5627x f34459a;

    /* JADX INFO: renamed from: b */
    public final C5608e f34460b;

    /* JADX INFO: renamed from: c */
    public boolean f34461c;

    /* JADX INFO: renamed from: fp.s$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            C5622s c5622s = C5622s.this;
            if (c5622s.f34461c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c5622s.f34460b.f34435b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C5622s.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            C5622s c5622s = C5622s.this;
            if (c5622s.f34461c) {
                throw new IOException("closed");
            }
            C5608e c5608e = c5622s.f34460b;
            if (c5608e.f34435b == 0 && c5622s.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                return -1;
            }
            return c5622s.f34460b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            C5207g.m11111f(bArr, "data");
            C5622s c5622s = C5622s.this;
            if (c5622s.f34461c) {
                throw new IOException("closed");
            }
            C5617n.m11992d(bArr.length, i10, i11);
            C5608e c5608e = c5622s.f34460b;
            if (c5608e.f34435b == 0 && c5622s.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                return -1;
            }
            return c5622s.f34460b.read(bArr, i10, i11);
        }

        public final String toString() {
            return C5622s.this + ".inputStream()";
        }
    }

    public C5622s(InterfaceC5627x interfaceC5627x) {
        C5207g.m11111f(interfaceC5627x, "source");
        this.f34459a = interfaceC5627x;
        this.f34460b = new C5608e();
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: C0 */
    public final int mo11926C0(C5619p c5619p) throws EOFException {
        C5608e c5608e;
        C5207g.m11111f(c5619p, "options");
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c5608e = this.f34460b;
            int iM12294c = C5862a.m12294c(c5608e, c5619p, true);
            if (iM12294c != -2) {
                if (iM12294c == -1) {
                    break;
                }
                c5608e.skip(c5619p.f34452a[iM12294c].mo15992q());
                return iM12294c;
            }
        } while (this.f34459a.mo11924j0(c5608e, 8192L) != -1);
        return -1;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: E0 */
    public final boolean mo11929E0(long j10) {
        C5608e c5608e;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c5608e = this.f34460b;
            if (c5608e.f34435b >= j10) {
                return true;
            }
        } while (this.f34459a.mo11924j0(c5608e, 8192L) != -1);
        return false;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: I */
    public final byte[] mo11933I() throws IOException {
        InterfaceC5627x interfaceC5627x = this.f34459a;
        C5608e c5608e = this.f34460b;
        c5608e.mo11940O0(interfaceC5627x);
        return c5608e.mo11933I();
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: J */
    public final long mo11935J(ByteString byteString) throws IOException {
        C5207g.m11111f(byteString, "bytes");
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            C5608e c5608e = this.f34460b;
            long jM11953d0 = c5608e.m11953d0(jMax, byteString);
            if (jM11953d0 != -1) {
                return jM11953d0;
            }
            long j10 = c5608e.f34435b;
            if (this.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j10 - ((long) byteString.data.length)) + 1);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: L */
    public final boolean mo11936L() {
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        C5608e c5608e = this.f34460b;
        return c5608e.mo11936L() && this.f34459a.mo11924j0(c5608e, 8192L) == -1;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: M0 */
    public final String mo11938M0() {
        return mo11946V(Long.MAX_VALUE);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: R */
    public final long mo11943R(ByteString byteString) {
        C5207g.m11111f(byteString, "targetBytes");
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            C5608e c5608e = this.f34460b;
            long jM11959m0 = c5608e.m11959m0(jMax, byteString);
            if (jM11959m0 != -1) {
                return jM11959m0;
            }
            long j10 = c5608e.f34435b;
            if (this.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j10);
        }
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: V */
    public final String mo11946V(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long jM11999a = m11999a(b10, 0L, j11);
        C5608e c5608e = this.f34460b;
        if (jM11999a != -1) {
            return C5862a.m12293b(c5608e, jM11999a);
        }
        if (j11 < Long.MAX_VALUE && mo11929E0(j11) && c5608e.m11930G(j11 - 1) == ((byte) 13) && mo11929E0(1 + j11) && c5608e.m11930G(j11) == b10) {
            return C5862a.m12293b(c5608e, j11);
        }
        C5608e c5608e2 = new C5608e();
        c5608e.m11928E(c5608e2, 0L, Math.min(32, c5608e.f34435b));
        throw new EOFException("\\n not found: limit=" + Math.min(c5608e.f34435b, j10) + " content=" + c5608e2.m11976y0().mo15993s() + (char) 8230);
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: X */
    public final long mo11948X(C5608e c5608e) {
        C5608e c5608e2;
        long j10 = 0;
        while (true) {
            InterfaceC5627x interfaceC5627x = this.f34459a;
            c5608e2 = this.f34460b;
            if (interfaceC5627x.mo11924j0(c5608e2, 8192L) == -1) {
                break;
            }
            long jM11972w = c5608e2.m11972w();
            if (jM11972w > 0) {
                j10 += jM11972w;
                c5608e.mo11922k1(c5608e2, jM11972w);
            }
        }
        long j11 = c5608e2.f34435b;
        if (j11 > 0) {
            j10 += j11;
            c5608e.mo11922k1(c5608e2, j11);
        }
        return j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m11999a(byte b10, long j10, long j11) {
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (!(0 <= j11)) {
            throw new IllegalArgumentException(C0166e.m763i("fromIndex=0 toIndex=", j11).toString());
        }
        while (jMax < j11) {
            long jM11932H = this.f34460b.m11932H(b10, jMax, j11);
            if (jM11932H != -1) {
                return jM11932H;
            }
            C5608e c5608e = this.f34460b;
            long j12 = c5608e.f34435b;
            if (j12 >= j11 || this.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
        }
        return -1L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final long m12000b() throws EOFException {
        C5608e c5608e;
        mo11960o1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            boolean zMo11929E0 = mo11929E0(j11);
            c5608e = this.f34460b;
            if (!zMo11929E0) {
                break;
            }
            byte bM11930G = c5608e.m11930G(j10);
            if ((bM11930G >= ((byte) 48) && bM11930G <= ((byte) 57)) || (j10 == 0 && bM11930G == ((byte) 45))) {
                j10 = j11;
            }
            if (j10 != 0) {
                break;
            }
            C5206f.m11029x0(16);
            C5206f.m11029x0(16);
            String string = Integer.toString(bM11930G, 16);
            C5207g.m11110e(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return c5608e.m11925B0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f34461c) {
            return;
        }
        this.f34461c = true;
        this.f34459a.close();
        this.f34460b.m11951b();
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: e1 */
    public final boolean mo11955e1(ByteString byteString) {
        C5207g.m11111f(byteString, "bytes");
        byte[] bArr = byteString.data;
        int length = bArr.length;
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (length >= 0 && bArr.length - 0 >= length) {
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = ((long) i10) + 0;
                if (mo11929E0(1 + j10)) {
                    if (this.f34460b.m11930G(j10) == byteString.data[0 + i10]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p124fp.InterfaceC5610g, p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: f */
    public final C5608e mo11956f() {
        return this.f34460b;
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34459a.mo11923g();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f34461c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) {
        C5207g.m11111f(c5608e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        C5608e c5608e2 = this.f34460b;
        if (c5608e2.f34435b == 0 && this.f34459a.mo11924j0(c5608e2, 8192L) == -1) {
            return -1L;
        }
        return c5608e2.mo11924j0(c5608e, Math.min(j10, c5608e2.f34435b));
    }

    /* JADX INFO: renamed from: l */
    public final int m12001l() throws EOFException {
        mo11960o1(4L);
        int i10 = this.f34460b.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: o1 */
    public final void mo11960o1(long j10) throws EOFException {
        if (!mo11929E0(j10)) {
            throw new EOFException();
        }
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: q0 */
    public final String mo11962q0(Charset charset) throws IOException {
        C5608e c5608e = this.f34460b;
        c5608e.mo11940O0(this.f34459a);
        return c5608e.m11931G0(c5608e.f34435b, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C5207g.m11111f(byteBuffer, "sink");
        C5608e c5608e = this.f34460b;
        if (c5608e.f34435b == 0 && this.f34459a.mo11924j0(c5608e, 8192L) == -1) {
            return -1;
        }
        return c5608e.read(byteBuffer);
    }

    @Override // p124fp.InterfaceC5610g
    public final byte readByte() throws EOFException {
        mo11960o1(1L);
        return this.f34460b.readByte();
    }

    @Override // p124fp.InterfaceC5610g
    public final int readInt() throws EOFException {
        mo11960o1(4L);
        return this.f34460b.readInt();
    }

    @Override // p124fp.InterfaceC5610g
    public final short readShort() throws EOFException {
        mo11960o1(2L);
        return this.f34460b.readShort();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    public final void skip(long j10) throws EOFException {
        if (!(!this.f34461c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            C5608e c5608e = this.f34460b;
            if (c5608e.f34435b == 0 && this.f34459a.mo11924j0(c5608e, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, c5608e.f34435b);
            c5608e.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: t */
    public final ByteString mo11968t(long j10) throws EOFException {
        mo11960o1(j10);
        return this.f34460b.mo11968t(j10);
    }

    public final String toString() {
        return "buffer(" + this.f34459a + ')';
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: w1 */
    public final long mo11973w1() throws EOFException {
        int i10;
        C5608e c5608e;
        mo11960o1(1L);
        while (true) {
            int i11 = i10 + 1;
            boolean zMo11929E0 = mo11929E0(i11);
            c5608e = this.f34460b;
            if (!zMo11929E0) {
                break;
            }
            byte bM11930G = c5608e.m11930G(i10);
            i10 = ((bM11930G >= ((byte) 48) && bM11930G <= ((byte) 57)) || (bM11930G >= ((byte) 97) && bM11930G <= ((byte) 102)) || (bM11930G >= ((byte) 65) && bM11930G <= ((byte) 70))) ? i11 : 0;
            if (i10 != 0) {
                break;
            }
            C5206f.m11029x0(16);
            C5206f.m11029x0(16);
            String string = Integer.toString(bM11930G, 16);
            C5207g.m11110e(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c5608e.mo11973w1();
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: x1 */
    public final InputStream mo11975x1() {
        return new a();
    }
}
