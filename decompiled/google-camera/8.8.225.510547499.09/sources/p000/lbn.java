package p000;

import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbn {

    /* JADX INFO: renamed from: a */
    public final long f37881a;

    public lbn() {
        this.f37881a = SystemClock.elapsedRealtimeNanos();
        new Throwable();
    }

    public lbn(long j) {
        this.f37881a = j;
    }

    public lbn(byte[] bArr) {
        this.f37881a = Process.getStartUptimeMillis();
    }

    public lbn(dhv dhvVar) {
        int iIntValue = ((Integer) dhvVar.mo6173a(dib.f11373o).get()).intValue();
        this.f37881a = (iIntValue > 0 ? iIntValue : 420L) * 1000000;
    }
}
