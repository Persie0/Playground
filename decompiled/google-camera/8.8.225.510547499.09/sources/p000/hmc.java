package p000;

import com.google.android.apps.camera.p014ui.preference.MaterialStorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmc {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f28297a;

    /* JADX INFO: renamed from: b */
    public final jvd f28298b;

    /* JADX INFO: renamed from: c */
    public final fcp f28299c;

    /* JADX INFO: renamed from: d */
    public MaterialStorageStatusPreference f28300d;

    /* JADX INFO: renamed from: e */
    public hmq f28301e;

    /* JADX INFO: renamed from: f */
    public final hmr f28302f;

    /* JADX INFO: renamed from: g */
    public final ljf f28303g;

    /* JADX INFO: renamed from: h */
    private final drj f28304h;

    public hmc(ljf ljfVar, hmr hmrVar, drj drjVar, ScheduledExecutorService scheduledExecutorService, jvd jvdVar, fcp fcpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28303g = ljfVar;
        this.f28302f = hmrVar;
        this.f28304h = drjVar;
        this.f28297a = scheduledExecutorService;
        this.f28298b = jvdVar;
        this.f28299c = fcpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10456a() {
        hmq hmqVar = this.f28301e;
        if (hmqVar != null) {
            hmh hmhVarM6639s = this.f28304h.m6639s(hmqVar);
            MaterialStorageStatusPreference materialStorageStatusPreference = this.f28300d;
            long j = hmqVar.f28352b;
            long j2 = hmqVar.f28353c;
            int i = hmhVarM6639s.f28309a;
            int i2 = hmhVarM6639s.f28310b;
            materialStorageStatusPreference.f7149a = j;
            materialStorageStatusPreference.f7150b = j2;
            materialStorageStatusPreference.f7151c = i;
            materialStorageStatusPreference.f7152d = i2;
            materialStorageStatusPreference.m4425k();
        }
    }
}
