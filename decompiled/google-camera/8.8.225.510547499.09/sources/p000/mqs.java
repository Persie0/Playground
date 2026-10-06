package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mqs extends msn {
    @Override // p000.msn
    /* JADX INFO: renamed from: a */
    public final long mo15326a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
