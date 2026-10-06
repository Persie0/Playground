package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gus implements fha {
    @Override // p000.fha
    /* JADX INFO: renamed from: a */
    public final boolean mo8406a(mzj mzjVar) {
        return mzj.m17173c(Long.valueOf(SystemClock.elapsedRealtimeNanos() - TimeUnit.NANOSECONDS.convert(5L, TimeUnit.SECONDS))).m17185n(mzjVar);
    }

    @Override // p000.fha
    /* JADX INFO: renamed from: b */
    public final boolean mo8407b(mzj mzjVar) {
        return false;
    }
}
