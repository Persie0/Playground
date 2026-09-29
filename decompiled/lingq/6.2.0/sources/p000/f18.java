package p000;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f18 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final xo2 f38250a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicInteger f38251b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i18 f38252c;

    public f18(i18 i18Var, xo2 xo2Var) {
        this.f38252c = i18Var;
        this.f38250a = xo2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny8 ny8Var;
        String strConcat = "OkHttp ".concat(((ex3) this.f38252c.f43343b.f10360c).m11382h());
        i18 i18Var = this.f38252c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            i18Var.f43345d.m24714h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f38250a.mo3851g(i18Var, i18Var.m13623f());
                        ny8Var = i18Var.f43342a.f36085a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C2927dg c2927dg = u87.f63590a;
                            C2927dg c2927dg2 = u87.f63590a;
                            String strConcat2 = "Callback failure for ".concat(i18.m13618a(i18Var));
                            c2927dg2.getClass();
                            Log.i("OkHttp", strConcat2, e);
                        } else {
                            this.f38250a.mo3854j(i18Var, e);
                        }
                        ny8Var = i18Var.f43342a.f36085a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        i18Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f38250a.mo3854j(i18Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        ny8Var = i18Var.f43342a.f36085a;
                    }
                } catch (Throwable th2) {
                    ny8 ny8Var2 = i18Var.f43342a.f36085a;
                    ny8Var2.getClass();
                    ny8.m17673J(ny8Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            ny8Var.getClass();
            ny8.m17673J(ny8Var, null, null, this, 3);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
