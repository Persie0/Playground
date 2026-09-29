package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3711w6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f66439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f66440c;

    public /* synthetic */ RunnableC3711w6(String str, int i, long j) {
        this.f66438a = i;
        this.f66439b = j;
        this.f66440c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66438a;
        long j = this.f66439b;
        String str = this.f66440c;
        switch (i) {
            case 0:
                if (AbstractC3785y6.f69344g == null) {
                    AbstractC3785y6.f69344g = new C3488q8(Long.valueOf(j), (Long) null);
                }
                C3488q8 c3488q8 = AbstractC3785y6.f69344g;
                if (c3488q8 != null) {
                    c3488q8.f57370d = Long.valueOf(j);
                }
                int i2 = 1;
                if (AbstractC3785y6.f69343f.get() <= 0) {
                    RunnableC3711w6 runnableC3711w6 = new RunnableC3711w6(str, i2, j);
                    synchronized (AbstractC3785y6.f69342e) {
                        ScheduledExecutorService scheduledExecutorService = AbstractC3785y6.f69339b;
                        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
                        AbstractC3785y6.f69341d = scheduledExecutorService.schedule(runnableC3711w6, w23VarM24854b == null ? 60 : w23VarM24854b.f66253b, TimeUnit.SECONDS);
                    }
                }
                long j2 = AbstractC3785y6.f69347j;
                long j3 = j2 > 0 ? (j - j2) / 1000 : 0L;
                m58 m58Var = c60.f9605a;
                Context contextM21766a = sy2.m21766a();
                w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
                if (w23VarM24862k != null && w23VarM24862k.f66255d && j3 > 0) {
                    C3012fs c3012fs = new C3012fs(contextM21766a, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d = j3;
                    if (ema.m11256c() && !lp1.f49971a.contains(c3012fs)) {
                        try {
                            C3012fs.m12037f(c3012fs, "fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, AbstractC3785y6.m24949b());
                        } catch (Throwable th) {
                            lp1.m16420a(c3012fs, th);
                        }
                    }
                    break;
                }
                C3488q8 c3488q9 = AbstractC3785y6.f69344g;
                if (c3488q9 != null) {
                    c3488q9.m19732R();
                    return;
                }
                return;
            default:
                if (AbstractC3785y6.f69344g == null) {
                    AbstractC3785y6.f69344g = new C3488q8(Long.valueOf(j), (Long) null);
                }
                if (AbstractC3785y6.f69343f.get() <= 0) {
                    gz8.m12979n(str, AbstractC3785y6.f69344g, AbstractC3785y6.f69346i);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    v3d.m23091a();
                    AbstractC3785y6.f69344g = null;
                }
                synchronized (AbstractC3785y6.f69342e) {
                    AbstractC3785y6.f69341d = null;
                }
                return;
        }
    }
}
