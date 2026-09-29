package p124fp;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.kochava.tracker.BuildConfig;
import dm.C5206f;
import dm.C5207g;
import gp.C5862a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import mo.C7653a;
import okio.ByteString;
import okio.SegmentedByteString;
import p003a2.C0009a;
import tl.C9322j;

/* JADX INFO: renamed from: fp.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C5608e implements InterfaceC5610g, InterfaceC5609f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public C5623t f34434a;

    /* JADX INFO: renamed from: b */
    public long f34435b;

    /* JADX INFO: renamed from: fp.e$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C5608e.this.f34435b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            C5608e c5608e = C5608e.this;
            if (c5608e.f34435b > 0) {
                return c5608e.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            C5207g.m11111f(bArr, "sink");
            return C5608e.this.read(bArr, i10, i11);
        }

        public final String toString() {
            return C5608e.this + ".inputStream()";
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B0 */
    public final long m11925B0() throws EOFException {
        if (this.f34435b == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = -7;
        long j11 = 0;
        boolean z11 = false;
        do {
            C5623t c5623t = this.f34434a;
            C5207g.m11108c(c5623t);
            int i11 = c5623t.f34464b;
            int i12 = c5623t.f34465c;
            while (i11 < i12) {
                byte b10 = c5623t.f34463a[i11];
                byte b11 = (byte) 48;
                if (b10 >= b11 && b10 <= ((byte) 57)) {
                    int i13 = b11 - b10;
                    if (j11 >= -922337203685477580L && (j11 != -922337203685477580L || i13 >= j10)) {
                        j11 = (j11 * 10) + ((long) i13);
                    }
                    C5608e c5608e = new C5608e();
                    c5608e.m11958l1(j11);
                    c5608e.m11954d1(b10);
                    if (!z10) {
                        c5608e.readByte();
                    }
                    throw new NumberFormatException("Number too large: ".concat(c5608e.m11934I0()));
                }
                if (b10 != ((byte) 45) || i10 != 0) {
                    z11 = true;
                    break;
                }
                j10--;
                z10 = true;
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f34434a = c5623t.m12002a();
                C5624u.m12006a(c5623t);
            } else {
                c5623t.f34464b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f34434a != null);
        long j12 = this.f34435b - ((long) i10);
        this.f34435b = j12;
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j11 : -j11;
        }
        if (j12 == 0) {
            throw new EOFException();
        }
        StringBuilder sbM26o = C0009a.m26o(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbM26o.append(C5617n.m11996h(m11930G(0L)));
        throw new NumberFormatException(sbM26o.toString());
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: C0 */
    public final int mo11926C0(C5619p c5619p) throws EOFException {
        C5207g.m11111f(c5619p, "options");
        int iM12294c = C5862a.m12294c(this, c5619p, false);
        if (iM12294c == -1) {
            return -1;
        }
        skip(c5619p.f34452a[iM12294c].mo15992q());
        return iM12294c;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11927D(int i10) {
        m11963q1(i10);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final void m11928E(C5608e c5608e, long j10, long j11) {
        C5207g.m11111f(c5608e, "out");
        C5617n.m11992d(this.f34435b, j10, j11);
        if (j11 == 0) {
            return;
        }
        c5608e.f34435b += j11;
        C5623t c5623t = this.f34434a;
        while (true) {
            C5207g.m11108c(c5623t);
            long j12 = c5623t.f34465c - c5623t.f34464b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            c5623t = c5623t.f34468f;
        }
        while (j11 > 0) {
            C5207g.m11108c(c5623t);
            C5623t c5623tM12004c = c5623t.m12004c();
            int i10 = c5623tM12004c.f34464b + ((int) j10);
            c5623tM12004c.f34464b = i10;
            c5623tM12004c.f34465c = Math.min(i10 + ((int) j11), c5623tM12004c.f34465c);
            C5623t c5623t2 = c5608e.f34434a;
            if (c5623t2 == null) {
                c5623tM12004c.f34469g = c5623tM12004c;
                c5623tM12004c.f34468f = c5623tM12004c;
                c5608e.f34434a = c5623tM12004c;
            } else {
                C5623t c5623t3 = c5623t2.f34469g;
                C5207g.m11108c(c5623t3);
                c5623t3.m12003b(c5623tM12004c);
            }
            j11 -= (long) (c5623tM12004c.f34465c - c5623tM12004c.f34464b);
            c5623t = c5623t.f34468f;
            j10 = 0;
        }
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: E0 */
    public final boolean mo11929E0(long j10) {
        return this.f34435b >= j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G */
    public final byte m11930G(long j10) {
        C5617n.m11992d(this.f34435b, j10, 1L);
        C5623t c5623t = this.f34434a;
        if (c5623t == null) {
            C5207g.m11108c(null);
            throw null;
        }
        long j11 = this.f34435b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                c5623t = c5623t.f34469g;
                C5207g.m11108c(c5623t);
                j11 -= (long) (c5623t.f34465c - c5623t.f34464b);
            }
            return c5623t.f34463a[(int) ((((long) c5623t.f34464b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = c5623t.f34465c;
            int i11 = c5623t.f34464b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return c5623t.f34463a[(int) ((((long) i11) + j10) - j12)];
            }
            c5623t = c5623t.f34468f;
            C5207g.m11108c(c5623t);
            j12 = j13;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G0 */
    public final String m11931G0(long j10, Charset charset) throws EOFException {
        C5207g.m11111f(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount: ", j10).toString());
        }
        if (this.f34435b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        C5623t c5623t = this.f34434a;
        C5207g.m11108c(c5623t);
        int i10 = c5623t.f34464b;
        if (((long) i10) + j10 > c5623t.f34465c) {
            return new String(m11966s0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c5623t.f34463a, i10, i11, charset);
        int i12 = c5623t.f34464b + i11;
        c5623t.f34464b = i12;
        this.f34435b -= j10;
        if (i12 == c5623t.f34465c) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        }
        return str;
    }

    /* JADX INFO: renamed from: H */
    public final long m11932H(byte b10, long j10, long j11) {
        C5623t c5623t;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + this.f34435b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f34435b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 != j11 && (c5623t = this.f34434a) != null) {
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    c5623t = c5623t.f34469g;
                    C5207g.m11108c(c5623t);
                    j13 -= (long) (c5623t.f34465c - c5623t.f34464b);
                }
                while (j13 < j11) {
                    int iMin = (int) Math.min(c5623t.f34465c, (((long) c5623t.f34464b) + j11) - j13);
                    for (int i10 = (int) ((((long) c5623t.f34464b) + j10) - j13); i10 < iMin; i10++) {
                        if (c5623t.f34463a[i10] == b10) {
                            return ((long) (i10 - c5623t.f34464b)) + j13;
                        }
                    }
                    j13 += (long) (c5623t.f34465c - c5623t.f34464b);
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                    j10 = j13;
                }
                return -1L;
            }
            while (true) {
                long j14 = ((long) (c5623t.f34465c - c5623t.f34464b)) + j12;
                if (j14 > j10) {
                    break;
                }
                c5623t = c5623t.f34468f;
                C5207g.m11108c(c5623t);
                j12 = j14;
            }
            while (j12 < j11) {
                int iMin2 = (int) Math.min(c5623t.f34465c, (((long) c5623t.f34464b) + j11) - j12);
                for (int i11 = (int) ((((long) c5623t.f34464b) + j10) - j12); i11 < iMin2; i11++) {
                    if (c5623t.f34463a[i11] == b10) {
                        return ((long) (i11 - c5623t.f34464b)) + j12;
                    }
                }
                j12 += (long) (c5623t.f34465c - c5623t.f34464b);
                c5623t = c5623t.f34468f;
                C5207g.m11108c(c5623t);
                j10 = j12;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: I */
    public final byte[] mo11933I() {
        return m11966s0(this.f34435b);
    }

    /* JADX INFO: renamed from: I0 */
    public final String m11934I0() {
        return m11931G0(this.f34435b, C7653a.f42116b);
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: J */
    public final long mo11935J(ByteString byteString) throws IOException {
        C5207g.m11111f(byteString, "bytes");
        return m11953d0(0L, byteString);
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: L */
    public final boolean mo11936L() {
        return this.f34435b == 0;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: M */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11937M(int i10) {
        m11954d1(i10);
        return this;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: M0 */
    public final String mo11938M0() throws EOFException {
        return mo11946V(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: N0 */
    public final String m11939N0(long j10) throws EOFException {
        return m11931G0(j10, C7653a.f42116b);
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: O0 */
    public final long mo11940O0(InterfaceC5627x interfaceC5627x) throws IOException {
        C5207g.m11111f(interfaceC5627x, "source");
        long j10 = 0;
        while (true) {
            long jMo11924j0 = interfaceC5627x.mo11924j0(this, 8192L);
            if (jMo11924j0 == -1) {
                return j10;
            }
            j10 += jMo11924j0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: P0 */
    public final int m11941P0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f34435b == 0) {
            throw new EOFException();
        }
        byte bM11930G = m11930G(0L);
        boolean z10 = false;
        if ((bM11930G & 128) == 0) {
            i10 = bM11930G & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bM11930G & 224) == 192) {
            i10 = bM11930G & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bM11930G & 240) == 224) {
            i10 = bM11930G & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bM11930G & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bM11930G & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (this.f34435b < j10) {
            StringBuilder sbM614j = C0141b.m614j("size < ", i11, ": ");
            sbM614j.append(this.f34435b);
            sbM614j.append(" (to read code point prefixed 0x");
            sbM614j.append(C5617n.m11996h(bM11930G));
            sbM614j.append(')');
            throw new EOFException(sbM614j.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bM11930G2 = m11930G(j11);
            if ((bM11930G2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bM11930G2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if (55296 <= i10 && i10 < 57344) {
            z10 = true;
        }
        if (!z10 && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q0 */
    public final ByteString m11942Q0(int i10) {
        if (i10 == 0) {
            return ByteString.f43897d;
        }
        C5617n.m11992d(this.f34435b, 0L, i10);
        C5623t c5623t = this.f34434a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            C5207g.m11108c(c5623t);
            int i14 = c5623t.f34465c;
            int i15 = c5623t.f34464b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c5623t = c5623t.f34468f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        C5623t c5623t2 = this.f34434a;
        int i16 = 0;
        while (i11 < i10) {
            C5207g.m11108c(c5623t2);
            bArr[i16] = c5623t2.f34463a;
            i11 += c5623t2.f34465c - c5623t2.f34464b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c5623t2.f34464b;
            c5623t2.f34466d = true;
            i16++;
            c5623t2 = c5623t2.f34468f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: R */
    public final long mo11943R(ByteString byteString) {
        C5207g.m11111f(byteString, "targetBytes");
        return m11959m0(0L, byteString);
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: S */
    public final InterfaceC5609f mo11944S() {
        return this;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: U0 */
    public final InterfaceC5609f mo11945U0(byte[] bArr) {
        C5207g.m11111f(bArr, "source");
        m11952c1(bArr, 0, bArr.length);
        return this;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: V */
    public final String mo11946V(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        byte b10 = (byte) 10;
        long jM11932H = m11932H(b10, 0L, j11);
        if (jM11932H != -1) {
            return C5862a.m12293b(this, jM11932H);
        }
        if (j11 < this.f34435b && m11930G(j11 - 1) == ((byte) 13) && m11930G(j11) == b10) {
            return C5862a.m12293b(this, j11);
        }
        C5608e c5608e = new C5608e();
        m11928E(c5608e, 0L, Math.min(32, this.f34435b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f34435b, j10) + " content=" + c5608e.m11976y0().mo15993s() + (char) 8230);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W0 */
    public final C5623t m11947W0(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C5623t c5623t = this.f34434a;
        if (c5623t == null) {
            C5623t c5623tM12007b = C5624u.m12007b();
            this.f34434a = c5623tM12007b;
            c5623tM12007b.f34469g = c5623tM12007b;
            c5623tM12007b.f34468f = c5623tM12007b;
            return c5623tM12007b;
        }
        C5623t c5623t2 = c5623t.f34469g;
        C5207g.m11108c(c5623t2);
        if (c5623t2.f34465c + i10 <= 8192 && c5623t2.f34467e) {
            return c5623t2;
        }
        C5623t c5623tM12007b2 = C5624u.m12007b();
        c5623t2.m12003b(c5623tM12007b2);
        return c5623tM12007b2;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: X */
    public final long mo11948X(C5608e c5608e) throws IOException {
        long j10 = this.f34435b;
        if (j10 > 0) {
            c5608e.mo11922k1(this, j10);
        }
        return j10;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m11949X0(ByteString byteString) {
        C5207g.m11111f(byteString, "byteString");
        byteString.mo15989C(this, byteString.mo15992q());
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: Z0 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11950Z0(ByteString byteString) {
        m11949X0(byteString);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m11951b() throws EOFException {
        skip(this.f34435b);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m11952c1(byte[] bArr, int i10, int i11) {
        C5207g.m11111f(bArr, "source");
        long j10 = i11;
        C5617n.m11992d(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C5623t c5623tM11947W0 = m11947W0(1);
            int iMin = Math.min(i12 - i10, 8192 - c5623tM11947W0.f34465c);
            int i13 = i10 + iMin;
            C9322j.m17671Y(c5623tM11947W0.f34465c, i10, i13, bArr, c5623tM11947W0.f34463a);
            c5623tM11947W0.f34465c += iMin;
            i10 = i13;
        }
        this.f34435b += j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p124fp.InterfaceC5625v
    public final void close() {
    }

    /* JADX INFO: renamed from: d0 */
    public final long m11953d0(long j10, ByteString byteString) throws IOException {
        C5207g.m11111f(byteString, "bytes");
        if (!(byteString.data.length > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("fromIndex < 0: ", j10).toString());
        }
        C5623t c5623t = this.f34434a;
        if (c5623t != null) {
            long j12 = this.f34435b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    c5623t = c5623t.f34469g;
                    C5207g.m11108c(c5623t);
                    j12 -= (long) (c5623t.f34465c - c5623t.f34464b);
                }
                byte[] bArr = byteString.data;
                byte b10 = bArr[0];
                int length = bArr.length;
                long j13 = (this.f34435b - ((long) length)) + 1;
                while (j12 < j13) {
                    int iMin = (int) Math.min(c5623t.f34465c, (((long) c5623t.f34464b) + j13) - j12);
                    for (int i10 = (int) ((((long) c5623t.f34464b) + j10) - j12); i10 < iMin; i10++) {
                        if (c5623t.f34463a[i10] == b10 && C5862a.m12292a(c5623t, i10 + 1, bArr, length)) {
                            return ((long) (i10 - c5623t.f34464b)) + j12;
                        }
                    }
                    j12 += (long) (c5623t.f34465c - c5623t.f34464b);
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                    j10 = j12;
                }
            } else {
                while (true) {
                    long j14 = ((long) (c5623t.f34465c - c5623t.f34464b)) + j11;
                    if (j14 > j10) {
                        break;
                    }
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                    j11 = j14;
                }
                byte[] bArr2 = byteString.data;
                byte b11 = bArr2[0];
                int length2 = bArr2.length;
                long j15 = (this.f34435b - ((long) length2)) + 1;
                while (j11 < j15) {
                    int iMin2 = (int) Math.min(c5623t.f34465c, (((long) c5623t.f34464b) + j15) - j11);
                    for (int i11 = (int) ((((long) c5623t.f34464b) + j10) - j11); i11 < iMin2; i11++) {
                        if (c5623t.f34463a[i11] == b11 && C5862a.m12292a(c5623t, i11 + 1, bArr2, length2)) {
                            return ((long) (i11 - c5623t.f34464b)) + j11;
                        }
                    }
                    j11 += (long) (c5623t.f34465c - c5623t.f34464b);
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                    j10 = j11;
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m11954d1(int i10) {
        C5623t c5623tM11947W0 = m11947W0(1);
        int i11 = c5623tM11947W0.f34465c;
        c5623tM11947W0.f34465c = i11 + 1;
        c5623tM11947W0.f34463a[i11] = (byte) i10;
        this.f34435b++;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: e1 */
    public final boolean mo11955e1(ByteString byteString) {
        C5207g.m11111f(byteString, "bytes");
        byte[] bArr = byteString.data;
        int length = bArr.length;
        if (length >= 0 && this.f34435b - 0 >= length && bArr.length - 0 >= length) {
            for (int i10 = 0; i10 < length; i10++) {
                if (m11930G(((long) i10) + 0) != byteString.data[0 + i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5608e) {
                long j10 = this.f34435b;
                C5608e c5608e = (C5608e) obj;
                if (j10 == c5608e.f34435b) {
                    if (j10 != 0) {
                        C5623t c5623t = this.f34434a;
                        C5207g.m11108c(c5623t);
                        C5623t c5623t2 = c5608e.f34434a;
                        C5207g.m11108c(c5623t2);
                        int i10 = c5623t.f34464b;
                        int i11 = c5623t2.f34464b;
                        long j11 = 0;
                        while (j11 < this.f34435b) {
                            long jMin = Math.min(c5623t.f34465c - i10, c5623t2.f34465c - i11);
                            long j12 = 0;
                            while (j12 < jMin) {
                                int i12 = i10 + 1;
                                byte b10 = c5623t.f34463a[i10];
                                int i13 = i11 + 1;
                                if (b10 == c5623t2.f34463a[i11]) {
                                    j12++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == c5623t.f34465c) {
                                C5623t c5623t3 = c5623t.f34468f;
                                C5207g.m11108c(c5623t3);
                                i10 = c5623t3.f34464b;
                                c5623t = c5623t3;
                            }
                            if (i11 == c5623t2.f34465c) {
                                c5623t2 = c5623t2.f34468f;
                                C5207g.m11108c(c5623t2);
                                i11 = c5623t2.f34464b;
                            }
                            j11 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p124fp.InterfaceC5610g, p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: f */
    public final C5608e mo11956f() {
        return this;
    }

    @Override // p124fp.InterfaceC5609f, p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() {
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return C5628y.f34474d;
    }

    public final int hashCode() {
        C5623t c5623t = this.f34434a;
        if (c5623t == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c5623t.f34465c;
            for (int i12 = c5623t.f34464b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c5623t.f34463a[i12];
            }
            c5623t = c5623t.f34468f;
            C5207g.m11108c(c5623t);
        } while (c5623t != this.f34434a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) {
        C5207g.m11111f(c5608e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f34435b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        c5608e.mo11922k1(this, j10);
        return j10;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: k0 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11957k0(String str) {
        m11969t1(str);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) {
        int i10;
        C5623t c5623tM12007b;
        C5207g.m11111f(c5608e, "source");
        if (!(c5608e != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C5617n.m11992d(c5608e.f34435b, 0L, j10);
        while (j10 > 0) {
            C5623t c5623t = c5608e.f34434a;
            C5207g.m11108c(c5623t);
            int i11 = c5623t.f34465c;
            C5623t c5623t2 = c5608e.f34434a;
            C5207g.m11108c(c5623t2);
            if (j10 < i11 - c5623t2.f34464b) {
                C5623t c5623t3 = this.f34434a;
                C5623t c5623t4 = c5623t3 != null ? c5623t3.f34469g : null;
                if (c5623t4 != null && c5623t4.f34467e) {
                    if ((((long) c5623t4.f34465c) + j10) - ((long) (c5623t4.f34466d ? 0 : c5623t4.f34464b)) <= 8192) {
                        C5623t c5623t5 = c5608e.f34434a;
                        C5207g.m11108c(c5623t5);
                        c5623t5.m12005d(c5623t4, (int) j10);
                        c5608e.f34435b -= j10;
                        this.f34435b += j10;
                        return;
                    }
                }
                C5623t c5623t6 = c5608e.f34434a;
                C5207g.m11108c(c5623t6);
                int i12 = (int) j10;
                if (!(i12 > 0 && i12 <= c5623t6.f34465c - c5623t6.f34464b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i12 >= 1024) {
                    c5623tM12007b = c5623t6.m12004c();
                } else {
                    c5623tM12007b = C5624u.m12007b();
                    int i13 = c5623t6.f34464b;
                    C9322j.m17671Y(0, i13, i13 + i12, c5623t6.f34463a, c5623tM12007b.f34463a);
                }
                c5623tM12007b.f34465c = c5623tM12007b.f34464b + i12;
                c5623t6.f34464b += i12;
                C5623t c5623t7 = c5623t6.f34469g;
                C5207g.m11108c(c5623t7);
                c5623t7.m12003b(c5623tM12007b);
                c5608e.f34434a = c5623tM12007b;
            }
            C5623t c5623t8 = c5608e.f34434a;
            C5207g.m11108c(c5623t8);
            long j11 = c5623t8.f34465c - c5623t8.f34464b;
            c5608e.f34434a = c5623t8.m12002a();
            C5623t c5623t9 = this.f34434a;
            if (c5623t9 == null) {
                this.f34434a = c5623t8;
                c5623t8.f34469g = c5623t8;
                c5623t8.f34468f = c5623t8;
            } else {
                C5623t c5623t10 = c5623t9.f34469g;
                C5207g.m11108c(c5623t10);
                c5623t10.m12003b(c5623t8);
                C5623t c5623t11 = c5623t8.f34469g;
                if (!(c5623t11 != c5623t8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                C5207g.m11108c(c5623t11);
                if (c5623t11.f34467e) {
                    int i14 = c5623t8.f34465c - c5623t8.f34464b;
                    C5623t c5623t12 = c5623t8.f34469g;
                    C5207g.m11108c(c5623t12);
                    int i15 = 8192 - c5623t12.f34465c;
                    C5623t c5623t13 = c5623t8.f34469g;
                    C5207g.m11108c(c5623t13);
                    if (c5623t13.f34466d) {
                        i10 = 0;
                    } else {
                        C5623t c5623t14 = c5623t8.f34469g;
                        C5207g.m11108c(c5623t14);
                        i10 = c5623t14.f34464b;
                    }
                    if (i14 <= i15 + i10) {
                        C5623t c5623t15 = c5623t8.f34469g;
                        C5207g.m11108c(c5623t15);
                        c5623t8.m12005d(c5623t15, i14);
                        c5623t8.m12002a();
                        C5624u.m12006a(c5623t8);
                    }
                }
            }
            c5608e.f34435b -= j11;
            this.f34435b += j11;
            j10 -= j11;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final C5608e m11958l1(long j10) {
        boolean z10;
        byte[] bArr;
        if (j10 == 0) {
            m11954d1(48);
        } else {
            int i10 = 1;
            if (j10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    m11969t1("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (j10 < 100000000) {
                if (j10 < 10000) {
                    if (j10 >= 100) {
                        i10 = j10 < 1000 ? 3 : 4;
                    } else if (j10 >= 10) {
                        i10 = 2;
                    }
                } else if (j10 < 1000000) {
                    i10 = j10 < 100000 ? 5 : 6;
                } else {
                    i10 = j10 < 10000000 ? 7 : 8;
                }
            } else if (j10 < 1000000000000L) {
                if (j10 < 10000000000L) {
                    i10 = j10 < 1000000000 ? 9 : 10;
                } else {
                    i10 = j10 < 100000000000L ? 11 : 12;
                }
            } else if (j10 < 1000000000000000L) {
                if (j10 < 10000000000000L) {
                    i10 = 13;
                } else {
                    i10 = j10 < 100000000000000L ? 14 : 15;
                }
            } else if (j10 < 100000000000000000L) {
                i10 = j10 < 10000000000000000L ? 16 : 17;
            } else {
                i10 = j10 < 1000000000000000000L ? 18 : 19;
            }
            if (z10) {
                i10++;
            }
            C5623t c5623tM11947W0 = m11947W0(i10);
            int i11 = c5623tM11947W0.f34465c + i10;
            while (true) {
                bArr = c5623tM11947W0.f34463a;
                if (j10 == 0) {
                    break;
                }
                long j11 = 10;
                i11--;
                bArr[i11] = C5862a.f35130a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i11 - 1] = (byte) 45;
            }
            c5623tM11947W0.f34465c += i10;
            this.f34435b += (long) i10;
        }
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public final long m11959m0(long j10, ByteString byteString) {
        int i10;
        int i11;
        int i12;
        int i13;
        C5207g.m11111f(byteString, "targetBytes");
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("fromIndex < 0: ", j10).toString());
        }
        C5623t c5623t = this.f34434a;
        if (c5623t != null) {
            long j12 = this.f34435b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    c5623t = c5623t.f34469g;
                    C5207g.m11108c(c5623t);
                    j12 -= (long) (c5623t.f34465c - c5623t.f34464b);
                }
                byte[] bArr = byteString.data;
                if (bArr.length == 2) {
                    byte b10 = bArr[0];
                    byte b11 = bArr[1];
                    while (j12 < this.f34435b) {
                        i12 = (int) ((((long) c5623t.f34464b) + j10) - j12);
                        int i14 = c5623t.f34465c;
                        while (i12 < i14) {
                            byte b12 = c5623t.f34463a[i12];
                            if (b12 != b10 && b12 != b11) {
                                i12++;
                            }
                            i13 = c5623t.f34464b;
                            return ((long) (i12 - i13)) + j12;
                        }
                        j12 += (long) (c5623t.f34465c - c5623t.f34464b);
                        c5623t = c5623t.f34468f;
                        C5207g.m11108c(c5623t);
                        j10 = j12;
                    }
                } else {
                    while (j12 < this.f34435b) {
                        i12 = (int) ((((long) c5623t.f34464b) + j10) - j12);
                        int i15 = c5623t.f34465c;
                        while (i12 < i15) {
                            byte b13 = c5623t.f34463a[i12];
                            for (byte b14 : bArr) {
                                if (b13 == b14) {
                                    i13 = c5623t.f34464b;
                                    return ((long) (i12 - i13)) + j12;
                                }
                            }
                            i12++;
                        }
                        j12 += (long) (c5623t.f34465c - c5623t.f34464b);
                        c5623t = c5623t.f34468f;
                        C5207g.m11108c(c5623t);
                        j10 = j12;
                    }
                }
            } else {
                while (true) {
                    long j13 = ((long) (c5623t.f34465c - c5623t.f34464b)) + j11;
                    if (j13 > j10) {
                        break;
                    }
                    c5623t = c5623t.f34468f;
                    C5207g.m11108c(c5623t);
                    j11 = j13;
                }
                byte[] bArr2 = byteString.data;
                if (bArr2.length == 2) {
                    byte b15 = bArr2[0];
                    byte b16 = bArr2[1];
                    while (j11 < this.f34435b) {
                        i10 = (int) ((((long) c5623t.f34464b) + j10) - j11);
                        int i16 = c5623t.f34465c;
                        while (i10 < i16) {
                            byte b17 = c5623t.f34463a[i10];
                            if (b17 != b15 && b17 != b16) {
                                i10++;
                            }
                            i11 = c5623t.f34464b;
                            return ((long) (i10 - i11)) + j11;
                        }
                        j11 += (long) (c5623t.f34465c - c5623t.f34464b);
                        c5623t = c5623t.f34468f;
                        C5207g.m11108c(c5623t);
                        j10 = j11;
                    }
                } else {
                    while (j11 < this.f34435b) {
                        i10 = (int) ((((long) c5623t.f34464b) + j10) - j11);
                        int i17 = c5623t.f34465c;
                        while (i10 < i17) {
                            byte b18 = c5623t.f34463a[i10];
                            for (byte b19 : bArr2) {
                                if (b18 == b19) {
                                    i11 = c5623t.f34464b;
                                    return ((long) (i10 - i11)) + j11;
                                }
                            }
                            i10++;
                        }
                        j11 += (long) (c5623t.f34465c - c5623t.f34464b);
                        c5623t = c5623t.f34468f;
                        C5207g.m11108c(c5623t);
                        j10 = j11;
                    }
                }
            }
        }
        return -1L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: o1 */
    public final void mo11960o1(long j10) throws EOFException {
        if (this.f34435b < j10) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final C5608e m11961p1(long j10) {
        if (j10 == 0) {
            m11954d1(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C5623t c5623tM11947W0 = m11947W0(i10);
            int i11 = c5623tM11947W0.f34465c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                c5623tM11947W0.f34463a[i12] = C5862a.f35130a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            c5623tM11947W0.f34465c += i10;
            this.f34435b += (long) i10;
        }
        return this;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: q0 */
    public final String mo11962q0(Charset charset) {
        return m11931G0(this.f34435b, charset);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m11963q1(int i10) {
        C5623t c5623tM11947W0 = m11947W0(4);
        int i11 = c5623tM11947W0.f34465c;
        int i12 = i11 + 1;
        byte[] bArr = c5623tM11947W0.f34463a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        c5623tM11947W0.f34465c = i14 + 1;
        this.f34435b += 4;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C5608e clone() {
        C5608e c5608e = new C5608e();
        if (this.f34435b != 0) {
            C5623t c5623t = this.f34434a;
            C5207g.m11108c(c5623t);
            C5623t c5623tM12004c = c5623t.m12004c();
            c5608e.f34434a = c5623tM12004c;
            c5623tM12004c.f34469g = c5623tM12004c;
            c5623tM12004c.f34468f = c5623tM12004c;
            for (C5623t c5623t2 = c5623t.f34468f; c5623t2 != c5623t; c5623t2 = c5623t2.f34468f) {
                C5623t c5623t3 = c5623tM12004c.f34469g;
                C5207g.m11108c(c5623t3);
                C5207g.m11108c(c5623t2);
                c5623t3.m12003b(c5623t2.m12004c());
            }
            c5608e.f34435b = this.f34435b;
        }
        return c5608e;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m11965r1(int i10) {
        C5623t c5623tM11947W0 = m11947W0(2);
        int i11 = c5623tM11947W0.f34465c;
        int i12 = i11 + 1;
        byte[] bArr = c5623tM11947W0.f34463a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        c5623tM11947W0.f34465c = i12 + 1;
        this.f34435b += 2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        C5207g.m11111f(byteBuffer, "sink");
        C5623t c5623t = this.f34434a;
        if (c5623t == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c5623t.f34465c - c5623t.f34464b);
        byteBuffer.put(c5623t.f34463a, c5623t.f34464b, iMin);
        int i10 = c5623t.f34464b + iMin;
        c5623t.f34464b = i10;
        this.f34435b -= (long) iMin;
        if (i10 == c5623t.f34465c) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        C5207g.m11111f(bArr, "sink");
        C5617n.m11992d(bArr.length, i10, i11);
        C5623t c5623t = this.f34434a;
        if (c5623t == null) {
            return -1;
        }
        int iMin = Math.min(i11, c5623t.f34465c - c5623t.f34464b);
        int i12 = c5623t.f34464b;
        C9322j.m17671Y(i10, i12, i12 + iMin, c5623t.f34463a, bArr);
        int i13 = c5623t.f34464b + iMin;
        c5623t.f34464b = i13;
        this.f34435b -= (long) iMin;
        if (i13 == c5623t.f34465c) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        }
        return iMin;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    public final byte readByte() throws EOFException {
        if (this.f34435b == 0) {
            throw new EOFException();
        }
        C5623t c5623t = this.f34434a;
        C5207g.m11108c(c5623t);
        int i10 = c5623t.f34464b;
        int i11 = c5623t.f34465c;
        int i12 = i10 + 1;
        byte b10 = c5623t.f34463a[i10];
        this.f34435b--;
        if (i12 == i11) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        } else {
            c5623t.f34464b = i12;
        }
        return b10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    public final int readInt() throws EOFException {
        if (this.f34435b < 4) {
            throw new EOFException();
        }
        C5623t c5623t = this.f34434a;
        C5207g.m11108c(c5623t);
        int i10 = c5623t.f34464b;
        int i11 = c5623t.f34465c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        int i12 = i10 + 1;
        byte[] bArr = c5623t.f34463a;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f34435b -= 4;
        if (i17 == i11) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        } else {
            c5623t.f34464b = i17;
        }
        return i18;
    }

    @Override // p124fp.InterfaceC5610g
    public final short readShort() throws EOFException {
        if (this.f34435b < 2) {
            throw new EOFException();
        }
        C5623t c5623t = this.f34434a;
        C5207g.m11108c(c5623t);
        int i10 = c5623t.f34464b;
        int i11 = c5623t.f34465c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i12 = i10 + 1;
        byte[] bArr = c5623t.f34463a;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f34435b -= 2;
        if (i13 == i11) {
            this.f34434a = c5623t.m12002a();
            C5624u.m12006a(c5623t);
        } else {
            c5623t.f34464b = i13;
        }
        return (short) i14;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: s0 */
    public final byte[] m11966s0(long j10) throws EOFException {
        int i10 = 0;
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount: ", j10).toString());
        }
        if (this.f34435b < j10) {
            throw new EOFException();
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        while (i10 < i11) {
            int i12 = read(bArr, i10, i11 - i10);
            if (i12 == -1) {
                throw new EOFException();
            }
            i10 += i12;
        }
        return bArr;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: s1 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11967s1(long j10) {
        m11958l1(j10);
        return this;
    }

    @Override // p124fp.InterfaceC5610g
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            C5623t c5623t = this.f34434a;
            if (c5623t == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, c5623t.f34465c - c5623t.f34464b);
            long j11 = iMin;
            this.f34435b -= j11;
            j10 -= j11;
            int i10 = c5623t.f34464b + iMin;
            c5623t.f34464b = i10;
            if (i10 == c5623t.f34465c) {
                this.f34434a = c5623t.m12002a();
                C5624u.m12006a(c5623t);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: t */
    public final ByteString mo11968t(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount: ", j10).toString());
        }
        if (this.f34435b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new ByteString(m11966s0(j10));
        }
        ByteString byteStringM11942Q0 = m11942Q0((int) j10);
        skip(j10);
        return byteStringM11942Q0;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m11969t1(String str) {
        C5207g.m11111f(str, "string");
        m11977y1(str, 0, str.length());
    }

    public final String toString() {
        long j10 = this.f34435b;
        if (j10 <= 2147483647L) {
            return m11942Q0((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f34435b).toString());
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11970v(int i10) {
        m11965r1(i10);
        return this;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: v0 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11971v0(byte[] bArr, int i10, int i11) {
        m11952c1(bArr, i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final long m11972w() {
        long j10 = this.f34435b;
        if (j10 == 0) {
            return 0L;
        }
        C5623t c5623t = this.f34434a;
        C5207g.m11108c(c5623t);
        C5623t c5623t2 = c5623t.f34469g;
        C5207g.m11108c(c5623t2);
        int i10 = c5623t2.f34465c;
        if (i10 < 8192 && c5623t2.f34467e) {
            j10 -= (long) (i10 - c5623t2.f34464b);
        }
        return j10;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: w1 */
    public final long mo11973w1() throws EOFException {
        int i10;
        if (this.f34435b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            C5623t c5623t = this.f34434a;
            C5207g.m11108c(c5623t);
            int i12 = c5623t.f34464b;
            int i13 = c5623t.f34465c;
            while (i12 < i13) {
                byte b10 = c5623t.f34463a[i12];
                byte b11 = (byte) 48;
                if (b10 < b11 || b10 > ((byte) 57)) {
                    byte b12 = (byte) 97;
                    if ((b10 < b12 || b10 > ((byte) 102)) && (b10 < (b12 = (byte) 65) || b10 > ((byte) 70))) {
                        if (i11 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(C5617n.m11996h(b10)));
                        }
                        z10 = true;
                        break;
                    }
                    i10 = (b10 - b12) + 10;
                } else {
                    i10 = b10 - b11;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    C5608e c5608e = new C5608e();
                    c5608e.m11961p1(j10);
                    c5608e.m11954d1(b10);
                    throw new NumberFormatException("Number too large: ".concat(c5608e.m11934I0()));
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f34434a = c5623t.m12002a();
                C5624u.m12006a(c5623t);
            } else {
                c5623t.f34464b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f34434a != null);
        this.f34435b -= (long) i11;
        return j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        C5207g.m11111f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            C5623t c5623tM11947W0 = m11947W0(1);
            int iMin = Math.min(i10, 8192 - c5623tM11947W0.f34465c);
            byteBuffer.get(c5623tM11947W0.f34463a, c5623tM11947W0.f34465c, iMin);
            i10 -= iMin;
            c5623tM11947W0.f34465c += iMin;
        }
        this.f34435b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: x0 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11974x0(String str, int i10, int i11) {
        m11977y1(str, i10, i11);
        return this;
    }

    @Override // p124fp.InterfaceC5610g
    /* JADX INFO: renamed from: x1 */
    public final InputStream mo11975x1() {
        return new a();
    }

    /* JADX INFO: renamed from: y0 */
    public final ByteString m11976y0() {
        return mo11968t(this.f34435b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y1 */
    public final void m11977y1(String str, int i10, int i11) {
        char cCharAt;
        C5207g.m11111f(str, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("beginIndex < 0: ", i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(C0204c.m851j("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (!(i11 <= str.length())) {
            StringBuilder sbM614j = C0141b.m614j("endIndex > string.length: ", i11, " > ");
            sbM614j.append(str.length());
            throw new IllegalArgumentException(sbM614j.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                C5623t c5623tM11947W0 = m11947W0(1);
                int i12 = c5623tM11947W0.f34465c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = c5623tM11947W0.f34463a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = c5623tM11947W0.f34465c;
                int i15 = (i12 + i10) - i14;
                c5623tM11947W0.f34465c = i14 + i15;
                this.f34435b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    C5623t c5623tM11947W1 = m11947W0(2);
                    int i16 = c5623tM11947W1.f34465c;
                    byte[] bArr2 = c5623tM11947W1.f34463a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                    c5623tM11947W1.f34465c = i16 + 2;
                    this.f34435b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C5623t c5623tM11947W2 = m11947W0(3);
                    int i17 = c5623tM11947W2.f34465c;
                    byte[] bArr3 = c5623tM11947W2.f34463a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | BuildConfig.SDK_TRUNCATE_LENGTH);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                    c5623tM11947W2.f34465c = i17 + 3;
                    this.f34435b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            C5623t c5623tM11947W3 = m11947W0(4);
                            int i20 = c5623tM11947W3.f34465c;
                            byte[] bArr4 = c5623tM11947W3.f34463a;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                            c5623tM11947W3.f34465c = i20 + 4;
                            this.f34435b += 4;
                            i10 += 2;
                        }
                    }
                    m11954d1(63);
                    i10 = i18;
                }
                i10++;
            }
        }
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: z0 */
    public final /* bridge */ /* synthetic */ InterfaceC5609f mo11978z0(long j10) {
        m11961p1(j10);
        return this;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m11979z1(int i10) {
        String str;
        if (i10 < 128) {
            m11954d1(i10);
            return;
        }
        if (i10 < 2048) {
            C5623t c5623tM11947W0 = m11947W0(2);
            int i11 = c5623tM11947W0.f34465c;
            byte[] bArr = c5623tM11947W0.f34463a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            c5623tM11947W0.f34465c = i11 + 2;
            this.f34435b += 2;
            return;
        }
        int i12 = 0;
        if (55296 <= i10 && i10 < 57344) {
            m11954d1(63);
            return;
        }
        if (i10 < 65536) {
            C5623t c5623tM11947W1 = m11947W0(3);
            int i13 = c5623tM11947W1.f34465c;
            byte[] bArr2 = c5623tM11947W1.f34463a;
            bArr2[i13] = (byte) ((i10 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            bArr2[i13 + 2] = (byte) ((i10 & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            c5623tM11947W1.f34465c = i13 + 3;
            this.f34435b += 3;
            return;
        }
        if (i10 <= 1114111) {
            C5623t c5623tM11947W2 = m11947W0(4);
            int i14 = c5623tM11947W2.f34465c;
            byte[] bArr3 = c5623tM11947W2.f34463a;
            bArr3[i14] = (byte) ((i10 >> 18) | 240);
            bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            bArr3[i14 + 3] = (byte) ((i10 & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
            c5623tM11947W2.f34465c = i14 + 4;
            this.f34435b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = C5206f.f33269d;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i12 < 8 && cArr2[i12] == '0') {
                i12++;
            }
            if (i12 < 0) {
                throw new IndexOutOfBoundsException(C0166e.m762h("startIndex: ", i12, ", endIndex: 8, size: 8"));
            }
            if (i12 > 8) {
                throw new IllegalArgumentException(C0166e.m762h("startIndex: ", i12, " > endIndex: 8"));
            }
            str = new String(cArr2, i12, 8 - i12);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }
}
