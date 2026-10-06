package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtf {
    /* JADX INFO: renamed from: a */
    public static HashMap m9752a(gts[] gtsVarArr) {
        HashMap map = new HashMap();
        for (gts gtsVar : gtsVarArr) {
            if (gtsVar.f26391f.mo16813g()) {
                map.put(Integer.valueOf((int) gtsVar.f26386a), (List) gtsVar.f26391f.mo16809c());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m9754c() {
        return new jvi(jzn.m13824l("MotionBlurProc"));
    }

    /* JADX INFO: renamed from: d */
    public static void m9755d(dhv dhvVar) {
        if (dhvVar.mo6184l(dhi.f11115b) && dhvVar.mo6184l(dik.f11607e)) {
            dhvVar.mo6177e();
        }
    }
}
