package p000;

import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbr extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public C1132xu f27157a;

    /* JADX INFO: renamed from: b */
    private final String[] f27158b;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f27160d;

    /* JADX INFO: renamed from: f */
    private boolean f27162f;

    /* JADX INFO: renamed from: g */
    private ScheduledFuture f27163g;

    /* JADX INFO: renamed from: e */
    private final Map f27161e = new HashMap();

    /* JADX INFO: renamed from: c */
    private final boolean f27159c = true;

    public hbr(String[] strArr, ScheduledExecutorService scheduledExecutorService) {
        this.f27158b = strArr;
        this.f27160d = scheduledExecutorService;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this) {
            this.f27161e.put(str, true);
        }
        synchronized (this) {
            if (this.f27161e.size() < this.f27158b.length) {
                return;
            }
            Iterator it = this.f27161e.values().iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return;
                }
            }
            if (this.f27162f) {
                this.f27163g = this.f27160d.schedule(new bdv(this, 10), 1000L, TimeUnit.MILLISECONDS);
            } else {
                this.f27157a.m19591a(true);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.f27159c) {
            this.f27157a.m19591a(false);
            return;
        }
        this.f27162f = true;
        ScheduledFuture scheduledFuture = this.f27163g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f27163g = null;
        }
        synchronized (this) {
            this.f27161e.put(str, false);
        }
    }
}
