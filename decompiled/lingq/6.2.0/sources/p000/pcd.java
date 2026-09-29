package p000;

import com.google.common.util.concurrent.RunnableFutureC1123m;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pcd implements zcd {

    /* JADX INFO: renamed from: d */
    public static boolean f55962d;

    /* JADX INFO: renamed from: a */
    public final on9 f55963a;

    /* JADX INFO: renamed from: b */
    public final int f55964b = Math.max(5, 10);

    /* JADX INFO: renamed from: c */
    public final mcd f55965c = mcd.f51092a;

    public pcd(on9 on9Var) {
        this.f55963a = on9Var;
    }

    @Override // p000.zcd
    public final void zza() {
        synchronized (pcd.class) {
            try {
                if (!f55962d) {
                    s3d s3dVar = new s3d(this, 5);
                    long j = this.f55964b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    c26 c26Var = (c26) this.f55963a.get();
                    dfb dfbVar = new dfb(this, s3dVar, c26Var, j);
                    c26Var.getClass();
                    RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m(Executors.callable(dfbVar, null));
                    sed.m21322b(new a26(runnableFutureC1123m, c26Var.f9353b.schedule(runnableFutureC1123m, j, timeUnit)));
                    f55962d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
