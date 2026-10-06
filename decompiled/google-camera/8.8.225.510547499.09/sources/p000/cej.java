package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cej {

    /* JADX INFO: renamed from: a */
    private static final nbh f5444a = nbh.m17259h("com/google/android/apps/camera/activity/util/ActivityFinishWithReason");

    /* JADX INFO: renamed from: b */
    private final WeakReference f5445b;

    /* JADX INFO: renamed from: c */
    private final jvd f5446c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f5447d = new AtomicBoolean(false);

    public cej(WeakReference weakReference, jvd jvdVar) {
        this.f5445b = weakReference;
        this.f5446c = jvdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m3557a(String str) {
        jvd.m13538a();
        lku.m15669w(!mro.m16832b(str));
        Activity activity = (Activity) this.f5445b.get();
        if (activity == null || this.f5447d.getAndSet(true)) {
            return;
        }
        ((nbe) ((nbe) f5444a.m17252c()).mo17276G('7')).mo17293r("WARNING: Activity was artificially finished: %s", str);
        this.f5446c.execute(new cei(activity, 0));
    }
}
