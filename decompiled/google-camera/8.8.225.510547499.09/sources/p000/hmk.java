package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.p014ui.preference.StorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmk {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f28321a;

    /* JADX INFO: renamed from: b */
    public final jvd f28322b;

    /* JADX INFO: renamed from: c */
    public final fcp f28323c;

    /* JADX INFO: renamed from: d */
    public StorageStatusPreference f28324d;

    /* JADX INFO: renamed from: e */
    public hmq f28325e;

    /* JADX INFO: renamed from: f */
    public final hmr f28326f;

    /* JADX INFO: renamed from: g */
    public final ljf f28327g;

    /* JADX INFO: renamed from: h */
    private final drj f28328h;

    public hmk(ljf ljfVar, hmr hmrVar, drj drjVar, ScheduledExecutorService scheduledExecutorService, jvd jvdVar, fcp fcpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28327g = ljfVar;
        this.f28326f = hmrVar;
        this.f28328h = drjVar;
        this.f28321a = scheduledExecutorService;
        this.f28322b = jvdVar;
        this.f28323c = fcpVar;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m10458a(Context context, dhv dhvVar) {
        Intent intent = new Intent();
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        intent.setClassName(context, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
        intent.putExtra("pref_open_setting_page", "pref_category_storage");
        intent.putExtra("pref_make_setting_page_root", true);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public final void m10459b() {
        hmq hmqVar = this.f28325e;
        if (hmqVar != null) {
            hmh hmhVarM6639s = this.f28328h.m6639s(hmqVar);
            StorageStatusPreference storageStatusPreference = this.f28324d;
            long j = hmqVar.f28352b;
            long j2 = hmqVar.f28353c;
            int i = hmhVarM6639s.f28309a;
            int i2 = hmhVarM6639s.f28310b;
            storageStatusPreference.f7157a = j;
            storageStatusPreference.f7158b = j2;
            storageStatusPreference.f7159c = i;
            storageStatusPreference.f7160d = i2;
            storageStatusPreference.m4426a();
        }
    }
}
