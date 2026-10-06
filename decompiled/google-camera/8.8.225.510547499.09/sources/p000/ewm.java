package p000;

import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewm extends AbstractC0909pn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CameraSettingsActivity f20653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewm(CameraSettingsActivity cameraSettingsActivity) {
        super(true);
        this.f20653a = cameraSettingsActivity;
    }

    @Override // p000.AbstractC0909pn
    /* JADX INFO: renamed from: a */
    public final void mo3794a() {
        if ((this.f20653a.getIntent().getFlags() & 33554432) != 0) {
            this.f20653a.setResult(-1);
        }
        m19324d(false);
        this.f20653a.onBackPressed();
    }
}
