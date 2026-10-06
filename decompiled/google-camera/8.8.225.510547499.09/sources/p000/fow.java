package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fow extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ foy f22976a;

    public fow(foy foyVar) {
        this.f22976a = foyVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onFpsSwitch(int i) {
        synchronized (this.f22976a.f22981e) {
            this.f22976a.f22979c.setClickable(false);
            this.f22976a.m8642w(i);
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        synchronized (this.f22976a.f22981e) {
            if (this.f22976a.f22978b.m5244p()) {
                this.f22976a.f22980d.m5365f();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        synchronized (this.f22976a.f22981e) {
            if (this.f22976a.f22978b.m5245q()) {
                this.f22976a.f22980d.m5366g();
            }
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        synchronized (this.f22976a.f22981e) {
            this.f22976a.f22978b.m5236h();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        synchronized (this.f22976a.f22981e) {
            this.f22976a.f22978b.m5237i();
        }
    }
}
