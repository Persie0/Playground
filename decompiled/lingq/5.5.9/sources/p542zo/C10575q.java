package p542zo;

import dm.C5207g;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import p124fp.C5608e;
import p124fp.InterfaceC5609f;
import tl.C9322j;
import to.C9347b;

/* JADX INFO: renamed from: zo.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10575q implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f52778g = Logger.getLogger(C10561c.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC5609f f52779a;

    /* JADX INFO: renamed from: b */
    public final boolean f52780b;

    /* JADX INFO: renamed from: c */
    public final C5608e f52781c;

    /* JADX INFO: renamed from: d */
    public int f52782d;

    /* JADX INFO: renamed from: e */
    public boolean f52783e;

    /* JADX INFO: renamed from: f */
    public final C10560b.b f52784f;

    public C10575q(InterfaceC5609f interfaceC5609f, boolean z10) {
        this.f52779a = interfaceC5609f;
        this.f52780b = z10;
        C5608e c5608e = new C5608e();
        this.f52781c = c5608e;
        this.f52782d = 16384;
        this.f52784f = new C10560b.b(c5608e);
    }

    /* JADX INFO: renamed from: C */
    public final synchronized void m19577C(int i10, long j10) throws IOException {
        if (this.f52783e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        m19581l(i10, 4, 8, 0);
        this.f52779a.mo11927D((int) j10);
        this.f52779a.flush();
    }

    /* JADX INFO: renamed from: E */
    public final void m19578E(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f52782d, j10);
            j10 -= jMin;
            m19581l(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f52779a.mo11922k1(this.f52781c, jMin);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m19579a(C10578t c10578t) throws IOException {
        C5207g.m11111f(c10578t, "peerSettings");
        if (this.f52783e) {
            throw new IOException("closed");
        }
        int i10 = this.f52782d;
        int i11 = c10578t.f52792a;
        if ((i11 & 32) != 0) {
            i10 = c10578t.f52793b[5];
        }
        this.f52782d = i10;
        if (((i11 & 2) != 0 ? c10578t.f52793b[1] : -1) != -1) {
            C10560b.b bVar = this.f52784f;
            int i12 = (i11 & 2) != 0 ? c10578t.f52793b[1] : -1;
            bVar.getClass();
            int iMin = Math.min(i12, 16384);
            int i13 = bVar.f52652e;
            if (i13 != iMin) {
                if (iMin < i13) {
                    bVar.f52650c = Math.min(bVar.f52650c, iMin);
                }
                bVar.f52651d = true;
                bVar.f52652e = iMin;
                int i14 = bVar.f52656i;
                if (iMin < i14) {
                    if (iMin == 0) {
                        C9322j.m17679g0(bVar.f52653f, null);
                        bVar.f52654g = bVar.f52653f.length - 1;
                        bVar.f52655h = 0;
                        bVar.f52656i = 0;
                    } else {
                        bVar.m19534a(i14 - iMin);
                    }
                }
            }
        }
        m19581l(0, 0, 4, 1);
        this.f52779a.flush();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m19580b(boolean z10, int i10, C5608e c5608e, int i11) throws IOException {
        if (this.f52783e) {
            throw new IOException("closed");
        }
        m19581l(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            C5207g.m11108c(c5608e);
            this.f52779a.mo11922k1(c5608e, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            this.f52783e = true;
            this.f52779a.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final void m19581l(int i10, int i11, int i12, int i13) throws IOException {
        Level level = Level.FINE;
        Logger logger = f52778g;
        boolean z10 = false;
        if (logger.isLoggable(level)) {
            C10561c.f52657a.getClass();
            logger.fine(C10561c.m19539a(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f52782d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f52782d + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) == 0) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(C5207g.m11116k(Integer.valueOf(i10), "reserved bit set: ").toString());
        }
        byte[] bArr = C9347b.f48082a;
        InterfaceC5609f interfaceC5609f = this.f52779a;
        C5207g.m11111f(interfaceC5609f, "<this>");
        interfaceC5609f.mo11937M((i11 >>> 16) & 255);
        interfaceC5609f.mo11937M((i11 >>> 8) & 255);
        interfaceC5609f.mo11937M(i11 & 255);
        interfaceC5609f.mo11937M(i12 & 255);
        interfaceC5609f.mo11937M(i13 & 255);
        interfaceC5609f.mo11927D(i10 & Integer.MAX_VALUE);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized void m19582q(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        C5207g.m11111f(errorCode, "errorCode");
        if (this.f52783e) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m19581l(0, bArr.length + 8, 7, 0);
        this.f52779a.mo11927D(i10);
        this.f52779a.mo11927D(errorCode.getHttpCode());
        if (!(bArr.length == 0)) {
            this.f52779a.mo11945U0(bArr);
        }
        this.f52779a.flush();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m19583r(int i10, int i11, boolean z10) throws IOException {
        if (this.f52783e) {
            throw new IOException("closed");
        }
        m19581l(0, 8, 6, z10 ? 1 : 0);
        this.f52779a.mo11927D(i10);
        this.f52779a.mo11927D(i11);
        this.f52779a.flush();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final synchronized void m19584w(int i10, ErrorCode errorCode) throws IOException {
        try {
            C5207g.m11111f(errorCode, "errorCode");
            if (this.f52783e) {
                throw new IOException("closed");
            }
            if (!(errorCode.getHttpCode() != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            m19581l(i10, 4, 3, 0);
            this.f52779a.mo11927D(errorCode.getHttpCode());
            this.f52779a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
