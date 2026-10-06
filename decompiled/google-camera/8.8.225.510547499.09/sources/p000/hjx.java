package p000;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjx implements hjk {

    /* JADX INFO: renamed from: a */
    public static final nbh f28067a = nbh.m17259h("com/google/android/apps/camera/stats/CameraActivitySettlementDetector");

    /* JADX INFO: renamed from: b */
    public static final long f28068b = TimeUnit.MILLISECONDS.toNanos(30);

    /* JADX INFO: renamed from: c */
    public final List f28069c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final nqf f28070d = nqf.m17621g();

    /* JADX INFO: renamed from: e */
    private final jvd f28071e;

    public hjx(jvd jvdVar) {
        this.f28071e = jvdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10398a() {
        Choreographer.getInstance().postFrameCallback(new cij(this, 2));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28071e.execute(new hmm(this, 1));
    }
}
