package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class e18 implements hj0 {

    /* JADX INFO: renamed from: a */
    public final yd9 f36574a;

    /* JADX INFO: renamed from: b */
    public final aj0 f36575b;

    /* JADX INFO: renamed from: c */
    public boolean f36576c;

    public e18(yd9 yd9Var) {
        yd9Var.getClass();
        this.f36574a = yd9Var;
        this.f36575b = new aj0();
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: D */
    public final String mo457D(long j) {
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM10788b = m10788b((byte) 10, 0L, j2);
        aj0 aj0Var = this.f36575b;
        if (jM10788b != -1) {
            return AbstractC0792b.m3131c(aj0Var, jM10788b);
        }
        if (j2 < Long.MAX_VALUE && mo464P(j2) && aj0Var.m494q(j2 - 1) == 13 && mo464P(j2 + 1) && aj0Var.m494q(j2) == 10) {
            return AbstractC0792b.m3131c(aj0Var, j2);
        }
        aj0 aj0Var2 = new aj0();
        aj0Var.m479e(aj0Var2, 0L, Math.min(32L, aj0Var.f723b));
        throw new EOFException("\\n not found: limit=" + Math.min(aj0Var.f723b, j) + " content=" + aj0Var2.mo497s(aj0Var2.f723b).mo18079e() + (char) 8230);
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: E */
    public final long mo458E(gj0 gj0Var) {
        aj0 aj0Var;
        long j = 0;
        while (true) {
            yd9 yd9Var = this.f36574a;
            aj0Var = this.f36575b;
            if (yd9Var.mo459F(aj0Var, 8192L) == -1) {
                break;
            }
            long jM476c = aj0Var.m476c();
            if (jM476c > 0) {
                j += jM476c;
                gj0Var.mo471X(aj0Var, jM476c);
            }
        }
        long j2 = aj0Var.f723b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        gj0Var.mo471X(aj0Var, j2);
        return j3;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) {
        aj0Var.getClass();
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        aj0 aj0Var2 = this.f36575b;
        if (aj0Var2.f723b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f36574a.mo459F(aj0Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return aj0Var2.mo459F(aj0Var, Math.min(j, aj0Var2.f723b));
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: K */
    public final String mo462K(Charset charset) {
        charset.getClass();
        yd9 yd9Var = this.f36574a;
        aj0 aj0Var = this.f36575b;
        aj0Var.mo456B(yd9Var);
        return aj0Var.m470W(aj0Var.f723b, charset);
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: P */
    public final boolean mo464P(long j) {
        aj0 aj0Var;
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return false;
        }
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return false;
        }
        do {
            aj0Var = this.f36575b;
            if (aj0Var.f723b >= j) {
                return true;
            }
        } while (this.f36574a.mo459F(aj0Var, 8192L) != -1);
        return false;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: Q */
    public final int mo465Q() {
        mo475b0(4L);
        return this.f36575b.mo465Q();
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: V */
    public final short mo469V() {
        mo475b0(2L);
        return this.f36575b.mo469V();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10787a() {
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return false;
        }
        aj0 aj0Var = this.f36575b;
        return aj0Var.m492p() && this.f36574a.mo459F(aj0Var, 8192L) == -1;
    }

    /* JADX INFO: renamed from: b */
    public final long m10788b(byte b, long j, long j2) {
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        if (0 > j2) {
            C3386nv.m17624j(wq1.m24116l("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            aj0 aj0Var = this.f36575b;
            byte b2 = b;
            long j3 = j2;
            long jM498u = aj0Var.m498u(b2, jMax, j3);
            if (jM498u != -1) {
                return jM498u;
            }
            long j4 = aj0Var.f723b;
            if (j4 >= j3 || this.f36574a.mo459F(aj0Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: b0 */
    public final void mo475b0(long j) {
        if (!mo464P(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m10789c(ByteString byteString) {
        byteString.getClass();
        long jMax = 0;
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        while (true) {
            aj0 aj0Var = this.f36575b;
            long jM502z = aj0Var.m502z(byteString, jMax);
            if (jM502z != -1) {
                return jM502z;
            }
            long j = aj0Var.f723b;
            if (this.f36574a.mo459F(aj0Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f36576c) {
            return;
        }
        this.f36576c = true;
        this.f36574a.close();
        this.f36575b.m473a();
    }

    /* JADX INFO: renamed from: e */
    public final e18 m10790e() {
        return new e18(new s67(this));
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: f0 */
    public final InputStream mo480f0() {
        return new yi0(this, 1);
    }

    @Override // p000.hj0, p000.gj0
    /* JADX INFO: renamed from: h */
    public final aj0 mo482h() {
        return this.f36575b;
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f36574a.mo484i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f36576c;
    }

    /* JADX INFO: renamed from: n */
    public final long m10791n() throws EOFException {
        char c;
        char c2;
        long j;
        mo475b0(8L);
        aj0 aj0Var = this.f36575b;
        if (aj0Var.f723b < 8) {
            throw new EOFException();
        }
        zt8 zt8Var = aj0Var.f722a;
        zt8Var.getClass();
        int i = zt8Var.f72154b;
        int i2 = zt8Var.f72155c;
        if (i2 - i < 8) {
            j = ((((long) aj0Var.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) aj0Var.readInt()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = zt8Var.f72153a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            aj0Var.f723b -= 8;
            if (i4 == i2) {
                aj0Var.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            } else {
                zt8Var.f72154b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    /* JADX INFO: renamed from: p */
    public final String m10792p(long j) {
        mo475b0(j);
        return this.f36575b.m470W(j, yu0.f70463a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        aj0 aj0Var = this.f36575b;
        if (aj0Var.f723b == 0 && this.f36574a.mo459F(aj0Var, 8192L) == -1) {
            return -1;
        }
        return aj0Var.read(byteBuffer);
    }

    @Override // p000.hj0
    public final byte readByte() {
        mo475b0(1L);
        return this.f36575b.readByte();
    }

    @Override // p000.hj0
    public final int readInt() {
        mo475b0(4L);
        return this.f36575b.readInt();
    }

    @Override // p000.hj0
    public final short readShort() {
        mo475b0(2L);
        return this.f36575b.readShort();
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: s */
    public final ByteString mo497s(long j) {
        mo475b0(j);
        return this.f36575b.mo497s(j);
    }

    @Override // p000.hj0
    public final void skip(long j) throws EOFException {
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return;
        }
        while (j > 0) {
            aj0 aj0Var = this.f36575b;
            if (aj0Var.f723b == 0 && this.f36574a.mo459F(aj0Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, aj0Var.f723b);
            aj0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f36574a + ')';
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: w */
    public final byte[] mo499w() {
        yd9 yd9Var = this.f36574a;
        aj0 aj0Var = this.f36575b;
        aj0Var.mo456B(yd9Var);
        return aj0Var.m463N(aj0Var.f723b);
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: y */
    public final int mo501y(rz6 rz6Var) throws EOFException {
        aj0 aj0Var;
        rz6Var.getClass();
        if (this.f36576c) {
            C3386nv.m17633t("closed");
            return 0;
        }
        do {
            aj0Var = this.f36575b;
            int iM3132d = AbstractC0792b.m3132d(aj0Var, rz6Var, true);
            if (iM3132d != -2) {
                if (iM3132d == -1) {
                    break;
                }
                aj0Var.skip(rz6Var.f60085a[iM3132d].mo18078d());
                return iM3132d;
            }
        } while (this.f36574a.mo459F(aj0Var, 8192L) != -1);
        return -1;
    }
}
