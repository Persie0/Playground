package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpl extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fpm f23100a;

    public fpl(fpm fpmVar) {
        this.f23100a = fpmVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        synchronized (this.f23100a.f23102c) {
            if (this.f23100a.f23101b.m5244p()) {
                this.f23100a.f23103d.m5365f();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        synchronized (this.f23100a.f23102c) {
            if (this.f23100a.f23101b.m5245q()) {
                this.f23100a.f23103d.m5366g();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        synchronized (this.f23100a.f23102c) {
            this.f23100a.f23101b.m5236h();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        synchronized (this.f23100a.f23102c) {
            this.f23100a.f23101b.m5237i();
        }
    }
}
