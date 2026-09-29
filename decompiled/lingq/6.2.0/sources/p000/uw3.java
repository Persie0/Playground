package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final class uw3 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f64458f = Logger.getLogger(gw3.class.getName());

    /* JADX INFO: renamed from: a */
    public final gj0 f64459a;

    /* JADX INFO: renamed from: b */
    public final aj0 f64460b;

    /* JADX INFO: renamed from: c */
    public int f64461c;

    /* JADX INFO: renamed from: d */
    public boolean f64462d;

    /* JADX INFO: renamed from: e */
    public final wv3 f64463e;

    public uw3(d18 d18Var) {
        d18Var.getClass();
        this.f64459a = d18Var;
        aj0 aj0Var = new aj0();
        this.f64460b = aj0Var;
        this.f64461c = 16384;
        this.f64463e = new wv3(aj0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m22960a(h09 h09Var) {
        h09Var.getClass();
        synchronized (this) {
            try {
                if (this.f64462d) {
                    throw new IOException("closed");
                }
                int i = this.f64461c;
                int i2 = h09Var.f41639a;
                if ((i2 & 32) != 0) {
                    i = h09Var.f41640b[5];
                }
                this.f64461c = i;
                if (((i2 & 2) != 0 ? h09Var.f41640b[1] : -1) != -1) {
                    wv3 wv3Var = this.f64463e;
                    int i3 = (i2 & 2) != 0 ? h09Var.f41640b[1] : -1;
                    wv3Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = wv3Var.f67335d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            wv3Var.f67333b = Math.min(wv3Var.f67333b, iMin);
                        }
                        wv3Var.f67334c = true;
                        wv3Var.f67335d = iMin;
                        int i5 = wv3Var.f67339h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                jr3[] jr3VarArr = wv3Var.f67336e;
                                AbstractC3550rv.m20833a0(0, jr3VarArr.length, null, jr3VarArr);
                                wv3Var.f67337f = wv3Var.f67336e.length - 1;
                                wv3Var.f67338g = 0;
                                wv3Var.f67339h = 0;
                            } else {
                                wv3Var.m24158a(i5 - iMin);
                            }
                        }
                    }
                }
                m22962c(0, 0, 4, 1);
                this.f64459a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22961b(boolean z, int i, aj0 aj0Var, int i2) {
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            m22962c(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                gj0 gj0Var = this.f64459a;
                aj0Var.getClass();
                gj0Var.mo471X(aj0Var, i2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22962c(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f64458f;
            if (logger.isLoggable(level)) {
                logger.fine(gw3.m12931b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f64461c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f64461c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C3386nv.m17624j(ux5.m22988k(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = icb.f43946a;
        gj0 gj0Var = this.f64459a;
        gj0Var.getClass();
        gj0Var.writeByte((i2 >>> 16) & 255);
        gj0Var.writeByte((i2 >>> 8) & 255);
        gj0Var.writeByte(i2 & 255);
        gj0Var.writeByte(i3 & 255);
        gj0Var.writeByte(i4 & 255);
        gj0Var.writeInt(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f64462d = true;
            this.f64459a.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22963e(int i, ErrorCode errorCode, byte[] bArr) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m22962c(0, bArr.length + 8, 7, 0);
            this.f64459a.writeInt(i);
            this.f64459a.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.f64459a.write(bArr);
            }
            this.f64459a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            this.f64459a.flush();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22964n(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            this.f64463e.m24161d(arrayList);
            long j = this.f64460b.f723b;
            long jMin = Math.min(this.f64461c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m22962c(i, (int) jMin, 1, i2);
            this.f64459a.mo471X(this.f64460b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f64461c, j2);
                    j2 -= jMin2;
                    m22962c(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f64459a.mo471X(this.f64460b, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22965p(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            m22962c(0, 8, 6, z ? 1 : 0);
            this.f64459a.writeInt(i);
            this.f64459a.writeInt(i2);
            this.f64459a.flush();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m22966q(int i, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.f64462d) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m22962c(i, 4, 3, 0);
            this.f64459a.writeInt(errorCode.getHttpCode());
            this.f64459a.flush();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m22967r(int i, long j) {
        synchronized (this) {
            try {
                if (this.f64462d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f64458f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(gw3.m12932c(i, 4, j, false));
                }
                m22962c(i, 4, 8, 0);
                this.f64459a.writeInt((int) j);
                this.f64459a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
