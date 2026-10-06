package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eiq extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eja f14169a;

    public eiq(eja ejaVar) {
        this.f14169a = ejaVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCancelButtonPressed() {
        this.f14169a.m7389h(false, 2);
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        this.f14169a.f14226C = true;
    }
}
