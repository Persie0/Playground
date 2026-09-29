package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final class mw3 implements Closeable {

    /* JADX INFO: renamed from: U */
    public static final h09 f51912U;

    /* JADX INFO: renamed from: H */
    public long f51913H;

    /* JADX INFO: renamed from: I */
    public long f51914I;

    /* JADX INFO: renamed from: J */
    public long f51915J;

    /* JADX INFO: renamed from: K */
    public final f83 f51916K;

    /* JADX INFO: renamed from: L */
    public final h09 f51917L;

    /* JADX INFO: renamed from: M */
    public h09 f51918M;

    /* JADX INFO: renamed from: N */
    public final w4b f51919N;

    /* JADX INFO: renamed from: O */
    public long f51920O;

    /* JADX INFO: renamed from: P */
    public long f51921P;

    /* JADX INFO: renamed from: Q */
    public final C3309ls f51922Q;

    /* JADX INFO: renamed from: R */
    public final uw3 f51923R;

    /* JADX INFO: renamed from: S */
    public final m92 f51924S;

    /* JADX INFO: renamed from: T */
    public final LinkedHashSet f51925T;

    /* JADX INFO: renamed from: a */
    public final lw3 f51926a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f51927b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final String f51928c;

    /* JADX INFO: renamed from: d */
    public int f51929d;

    /* JADX INFO: renamed from: e */
    public int f51930e;

    /* JADX INFO: renamed from: f */
    public boolean f51931f;

    /* JADX INFO: renamed from: g */
    public final as9 f51932g;

    /* JADX INFO: renamed from: h */
    public final zr9 f51933h;

    /* JADX INFO: renamed from: i */
    public final zr9 f51934i;

    /* JADX INFO: renamed from: j */
    public final zr9 f51935j;

    /* JADX INFO: renamed from: k */
    public final u06 f51936k;

    /* JADX INFO: renamed from: l */
    public long f51937l;

    static {
        h09 h09Var = new h09();
        h09Var.m12994b(4, 65535);
        h09Var.m12994b(5, 16384);
        f51912U = h09Var;
    }

    public mw3(w41 w41Var) {
        this.f51926a = (lw3) w41Var.f66368d;
        String str = (String) w41Var.f66367c;
        if (str == null) {
            fa4.m11636J("connectionName");
            throw null;
        }
        this.f51928c = str;
        this.f51930e = 3;
        as9 as9Var = (as9) w41Var.f66365a;
        this.f51932g = as9Var;
        this.f51933h = as9Var.m3023d();
        this.f51934i = as9Var.m3023d();
        this.f51935j = as9Var.m3023d();
        this.f51936k = u06.f63177e;
        this.f51916K = (f83) w41Var.f66369e;
        h09 h09Var = new h09();
        h09Var.m12994b(4, 16777216);
        this.f51917L = h09Var;
        h09 h09Var2 = f51912U;
        this.f51918M = h09Var2;
        this.f51919N = new w4b(0);
        this.f51921P = h09Var2.m12993a();
        C3309ls c3309ls = (C3309ls) w41Var.f66366b;
        if (c3309ls == null) {
            fa4.m11636J("socket");
            throw null;
        }
        this.f51922Q = c3309ls;
        this.f51923R = new uw3((d18) c3309ls.f50066d);
        this.f51924S = new m92(this, new pw3((e18) c3309ls.f50065c));
        this.f51925T = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m17065a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        errorCode.getClass();
        errorCode2.getClass();
        TimeZone timeZone = kcb.f47051a;
        try {
            m17068e(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f51927b.isEmpty()) {
                array = null;
            } else {
                array = this.f51927b.values().toArray(new tw3[0]);
                this.f51927b.clear();
            }
        }
        tw3[] tw3VarArr = (tw3[]) array;
        if (tw3VarArr != null) {
            for (tw3 tw3Var : tw3VarArr) {
                try {
                    tw3Var.m22319d(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f51923R.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((ny8) this.f51922Q.f50064b).f53414b).close();
        } catch (IOException unused4) {
        }
        this.f51933h.m25755f();
        this.f51934i.m25755f();
        this.f51935j.m25755f();
    }

    /* JADX INFO: renamed from: b */
    public final tw3 m17066b(int i) {
        tw3 tw3Var;
        synchronized (this) {
            tw3Var = (tw3) this.f51927b.get(Integer.valueOf(i));
        }
        return tw3Var;
    }

    /* JADX INFO: renamed from: c */
    public final tw3 m17067c(int i) {
        tw3 tw3Var;
        synchronized (this) {
            tw3Var = (tw3) this.f51927b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return tw3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m17065a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m17068e(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.f51923R) {
            synchronized (this) {
                if (this.f51931f) {
                    return;
                }
                this.f51931f = true;
                this.f51923R.m22963e(this.f51929d, errorCode, icb.f43946a);
            }
        }
    }

    public final void flush() {
        this.f51923R.flush();
    }

    /* JADX INFO: renamed from: n */
    public final void m17069n(long j) {
        synchronized (this) {
            try {
                w4b.m23751b(this.f51919N, j, 0L, 2);
                long jM23752a = this.f51919N.m23752a();
                if (jM23752a >= this.f51917L.m12993a() / 2) {
                    m17072r(0, jM23752a);
                    w4b.m23751b(this.f51919N, 0L, jM23752a, 1);
                }
                f83 f83Var = this.f51916K;
                w4b w4bVar = this.f51919N;
                f83Var.getClass();
                w4bVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m17070p(int i, boolean z, aj0 aj0Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f51923R.m22961b(z, i, aj0Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f51920O;
                            j3 = this.f51921P;
                            if (j2 >= j3) {
                                if (!this.f51927b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f51923R.f64461c);
                j4 = iMin;
                this.f51920O += j4;
            }
            j -= j4;
            this.f51923R.m22961b(z && j == 0, i, aj0Var, iMin);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m17071q(int i, ErrorCode errorCode) {
        errorCode.getClass();
        zr9.m25750b(this.f51933h, this.f51928c + '[' + i + "] writeSynReset", new ws2(this, i, errorCode));
    }

    /* JADX INFO: renamed from: r */
    public final void m17072r(final int i, final long j) {
        zr9.m25750b(this.f51933h, this.f51928c + '[' + i + "] windowUpdate", new ui3() { // from class: hw3
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                mw3 mw3Var = this.f43032a;
                try {
                    mw3Var.f51923R.m22967r(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    mw3Var.m17065a(errorCode, errorCode, e);
                }
                return xfa.f68157a;
            }
        });
    }
}
