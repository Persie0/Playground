package p000;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34624a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f34625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f34627d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f34628e;

    public /* synthetic */ cw2(ed1 ed1Var, rq1 rq1Var, fu2 fu2Var, boolean z) {
        this.f34626c = ed1Var;
        this.f34627d = rq1Var;
        this.f34628e = fu2Var;
        this.f34625b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34624a) {
            case 0:
                Context context = (Context) this.f34626c;
                boolean z = this.f34625b;
                jw2 jw2Var = (jw2) this.f34627d;
                xb7 xb7Var = (xb7) this.f34628e;
                MediaMetricsManager mediaMetricsManagerM12602g = AbstractC3038gh.m12602g(context.getSystemService("media_metrics"));
                vu5 vu5Var = mediaMetricsManagerM12602g != null ? new vu5(context, mediaMetricsManagerM12602g.createPlaybackSession()) : null;
                if (vu5Var == null) {
                    ss5.m21707d0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    l52 l52Var = jw2Var.f46300r;
                    l52Var.getClass();
                    l52Var.f49069f.m23268a(vu5Var);
                }
                LogSessionId sessionId = vu5Var.f65920d.getSessionId();
                synchronized (xb7Var) {
                    web webVar = xb7Var.f68030b;
                    webVar.getClass();
                    LogSessionId logSessionId = (LogSessionId) webVar.f66742a;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    bna.m3987z(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    webVar.f66742a = sessionId;
                }
                return;
            default:
                ed1 ed1Var = (ed1) this.f34626c;
                rq1 rq1Var = (rq1) this.f34627d;
                fu2 fu2Var = (fu2) this.f34628e;
                boolean z2 = this.f34625b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((zq1) ed1Var.f37034b).m25744d(rq1Var, fu2Var.f39638a, z2);
                return;
        }
    }

    public /* synthetic */ cw2(Context context, boolean z, jw2 jw2Var, xb7 xb7Var) {
        this.f34626c = context;
        this.f34625b = z;
        this.f34627d = jw2Var;
        this.f34628e = xb7Var;
    }
}
