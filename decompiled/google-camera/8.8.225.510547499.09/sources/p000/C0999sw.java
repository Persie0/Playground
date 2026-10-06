package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: sw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0999sw extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f47614a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ opx f47615b;

    /* JADX INFO: renamed from: c */
    private final opk f47616c = ook.m18793g(false);

    public C0999sw(String str, opx opxVar) {
        this.f47614a = str;
        this.f47615b = opxVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        if (this.f47616c.m18843b()) {
            this.f47615b.mo18640e(true);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        if (ooc.m18737c(str, this.f47614a)) {
            String str2 = this.f47614a;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) C0952rc.m19373b(str2));
            sb.append(" is now available.");
            if (this.f47616c.m18843b()) {
                this.f47615b.mo18640e(true);
            }
        }
    }
}
