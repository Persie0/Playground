package p000;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebw {

    /* JADX INFO: renamed from: c */
    public Future f13311c;

    /* JADX INFO: renamed from: d */
    private final Gcam f13312d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f13313e;

    /* JADX INFO: renamed from: a */
    public final Object f13309a = new Object();

    /* JADX INFO: renamed from: b */
    public final List f13310b = new ArrayList();

    /* JADX INFO: renamed from: f */
    private float f13314f = 1.0f;

    public ebw(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.f13312d = gcam;
        this.f13313e = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m7087a() {
        synchronized (this.f13309a) {
            Future future = this.f13311c;
            if (future != null) {
                future.cancel(false);
            }
        }
        this.f13313e.execute(new drs(this, 19));
    }

    /* JADX INFO: renamed from: b */
    public final void m7088b() {
        this.f13313e.execute(new drs(this, 17));
        synchronized (this.f13309a) {
            this.f13311c = this.f13313e.schedule(new drs(this, 18), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7089c(float f) {
        synchronized (this.f13309a) {
            if (f == this.f13314f) {
                return;
            }
            this.f13314f = f;
            mws mwsVarM17095j = mws.m17095j(this.f13310b);
            int size = mwsVarM17095j.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((oyo) mwsVarM17095j.get(i)).f46847a;
                Gcam gcam = this.f13312d;
                GcamModuleJNI.Gcam_LimitShotCpuUsage(gcam.f8271a, gcam, i2, f);
            }
        }
    }
}
