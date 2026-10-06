package p000;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azr implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f2791a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ azs f2792b;

    public azr(azs azsVar, String str) {
        this.f2792b = azsVar;
        this.f2791a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azs azsVar;
        try {
            try {
                C0139dr c0139dr = (C0139dr) this.f2792b.f2800g.get();
                if (c0139dr == null) {
                    ayc.m2099a();
                    Log.e(azs.f2793a, this.f2792b.f2796c.f2965b + " returned a null result. Treating it as a failure.");
                } else {
                    ayc.m2099a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2792b.f2796c.f2965b);
                    sb.append(" returned a ");
                    sb.append(c0139dr);
                    sb.append(".");
                    this.f2792b.f2801h = c0139dr;
                }
                azsVar = this.f2792b;
            } catch (InterruptedException e) {
                e = e;
                ayc.m2099a();
                Log.e(azs.f2793a, this.f2791a + " failed because it threw an exception/error", e);
                azsVar = this.f2792b;
            } catch (CancellationException e2) {
                ayc.m2099a();
                int i = azs.f2794j;
                azsVar = this.f2792b;
            } catch (ExecutionException e3) {
                e = e3;
                ayc.m2099a();
                Log.e(azs.f2793a, this.f2791a + " failed because it threw an exception/error", e);
                azsVar = this.f2792b;
            }
            azsVar.m2135a();
        } catch (Throwable th) {
            this.f2792b.m2135a();
            throw th;
        }
    }
}
