package p000;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r52 {

    /* JADX INFO: renamed from: a */
    public long f58738a;

    /* JADX INFO: renamed from: b */
    public long f58739b;

    /* JADX INFO: renamed from: c */
    public Serializable f58740c;

    public r52() {
        this.f58738a = -9223372036854775807L;
        this.f58739b = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public void m20405a(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f58740c) == null) {
            this.f58740c = exc;
        }
        if (this.f58738a == -9223372036854775807L && s52.f60314c0.get() <= 0) {
            this.f58738a = 200 + jElapsedRealtime;
        }
        long j = this.f58738a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.f58739b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f58740c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f58740c;
        this.f58740c = null;
        this.f58738a = -9223372036854775807L;
        this.f58739b = -9223372036854775807L;
        throw exc3;
    }

    public r52(long j, long j2, TimeUnit timeUnit) {
        this.f58738a = j;
        this.f58739b = j2;
        this.f58740c = timeUnit;
    }
}
