package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpd extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fpf f23021a;

    public fpd(fpf fpfVar) {
        this.f23021a = fpfVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        synchronized (this.f23021a.f23039k) {
            this.f23021a.f23038j.m5233e();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        synchronized (this.f23021a.f23039k) {
            if (this.f23021a.f23038j.m5244p()) {
                this.f23021a.f23040l.m5365f();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        synchronized (this.f23021a.f23039k) {
            if (this.f23021a.f23038j.m5245q()) {
                this.f23021a.f23040l.m5366g();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        synchronized (this.f23021a.f23039k) {
            this.f23021a.f23038j.m5236h();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        synchronized (this.f23021a.f23039k) {
            this.f23021a.f23038j.m5237i();
        }
    }
}
