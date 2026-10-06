package p000;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fdr implements gyi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fds f21481a;

    public fdr(fds fdsVar) {
        this.f21481a = fdsVar;
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo3957j(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo3959l(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final void mo3960m(long j) {
        fds fdsVar = this.f21481a;
        if (fdsVar.f21484c || !fdsVar.f21485d) {
            return;
        }
        fdsVar.f21484c = true;
        fds fdsVar2 = this.f21481a;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(fdsVar2.f21488g, 0);
        valueAnimatorOfInt.addUpdateListener(new afx(fdsVar2, 13));
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final void mo3962o(Bitmap bitmap, int i) {
        fds fdsVar = this.f21481a;
        if (fdsVar.f21485d) {
            int i2 = (fdsVar.f21486e - i) + fdsVar.f21487f;
            fdsVar.f21484c = true;
            this.f21481a.f21482a.m4504b(imq.m11478a(bitmap, i2));
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void mo3971x(gyu gyuVar) {
    }
}
