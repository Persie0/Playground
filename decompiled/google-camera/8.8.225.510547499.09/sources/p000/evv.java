package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evv extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ewa f20483a;

    public evv(ewa ewaVar) {
        this.f20483a = ewaVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.f20483a.f20546d.m5899h(new evu(this, 2));
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
    }
}
