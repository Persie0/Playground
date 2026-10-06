package p000;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcl implements emj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ emj f21258a;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ TimeUnit f21259n;

    /* JADX INFO: renamed from: o */
    final /* synthetic */ String f21260o = "AppSettings";

    public fcl(emj emjVar, TimeUnit timeUnit) {
        this.f21258a = emjVar;
        this.f21259n = timeUnit;
    }

    @Override // p000.emj
    /* JADX INFO: renamed from: a */
    public final Object mo7509a(lqq lqqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objMo7509a = this.f21258a.mo7509a(lqqVar);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > TimeUnit.MILLISECONDS.convert(5L, this.f21259n)) {
            Log.w(this.f21260o, "Warning: providing system service " + ((String) lqqVar.f39003c) + " took " + jCurrentTimeMillis2 + " ms");
        }
        return objMo7509a;
    }
}
