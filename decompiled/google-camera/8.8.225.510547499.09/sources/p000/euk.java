package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class euk extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eus f20119a;

    public euk(eus eusVar) {
        this.f20119a = eusVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        this.f20119a.m7914x();
        this.f20119a.f20186d.m5899h(new euj(this, 3));
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
    }
}
