package p000;

import com.google.android.apps.camera.legacy.app.settings.CameraMaterialSettingsActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewh extends AbstractC0909pn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CameraMaterialSettingsActivity f20629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewh(CameraMaterialSettingsActivity cameraMaterialSettingsActivity) {
        super(true);
        this.f20629a = cameraMaterialSettingsActivity;
    }

    @Override // p000.AbstractC0909pn
    /* JADX INFO: renamed from: a */
    public final void mo3794a() {
        if ((this.f20629a.getIntent().getFlags() & 33554432) != 0) {
            this.f20629a.setResult(-1);
        }
        m19324d(false);
        this.f20629a.onBackPressed();
    }
}
