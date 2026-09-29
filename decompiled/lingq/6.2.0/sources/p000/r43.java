package p000;

import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r43 {

    /* JADX INFO: renamed from: a */
    public final tp1 f58599a;

    public r43(tp1 tp1Var) {
        this.f58599a = tp1Var;
    }

    /* JADX INFO: renamed from: a */
    public static r43 m20289a() {
        r43 r43Var = (r43) q43.m19641c().m19645b(r43.class);
        if (r43Var != null) {
            return r43Var;
        }
        C3386nv.m17635v("FirebaseCrashlytics component is not present.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m20290b(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        tp1 tp1Var = this.f58599a;
        tp1Var.f62668o.f13668a.m9855a(new RunnableC3470pr(tp1Var, th));
    }
}
