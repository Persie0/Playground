package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpv implements ftg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f23145a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ftg f23146b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fst f23147c;

    public fpv(fst fstVar, long j, ftg ftgVar, byte[] bArr) {
        this.f23147c = fstVar;
        this.f23145a = j;
        this.f23146b = ftgVar;
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: a */
    public final void mo8682a() {
        ((ktz) this.f23147c.f23512d).m14852d("cancelled");
        ((ktz) this.f23147c.f23511c).m14853e(SystemClock.elapsedRealtime() - this.f23145a, "cancelled");
        this.f23146b.mo8682a();
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: b */
    public final void mo8683b(Throwable th) {
        if (th instanceof TimeoutException) {
            ((ktz) this.f23147c.f23512d).m14852d("timeout");
            ((ktz) this.f23147c.f23511c).m14853e(SystemClock.elapsedRealtime() - this.f23145a, "timeout");
        } else {
            ((ktz) this.f23147c.f23512d).m14852d("failed");
            ((ktz) this.f23147c.f23511c).m14853e(SystemClock.elapsedRealtime() - this.f23145a, "failed");
        }
        this.f23146b.mo8683b(th);
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: c */
    public final void mo8684c(kpw kpwVar) {
        ((ktz) this.f23147c.f23512d).m14852d("success");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ((ktz) this.f23147c.f23511c).m14853e(jElapsedRealtime - this.f23145a, "success");
        this.f23146b.mo8684c(new fpu(this, kpwVar, jElapsedRealtime, kpwVar));
    }
}
