package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cje {

    /* JADX INFO: renamed from: a */
    public static final ScheduledExecutorService f5921a = cjq.m3827a(jzn.m13827o(PMZiHihxLGEy.mHvjZvyBXTiCHhh, 2));

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f5922b = cjq.m3827a(jzn.m13827o("GcaLowPrio", 1));

    /* JADX INFO: renamed from: a */
    public static ExecutorService m3820a(ScheduledExecutorService scheduledExecutorService) {
        return new jvk(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: b */
    public static jvx m3821b() {
        return jzn.m13820h(jzn.m13824l("pck-temporal-binning"));
    }
}
