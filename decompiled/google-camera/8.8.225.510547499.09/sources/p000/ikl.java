package p000;

import android.view.ScaleGestureDetector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ikl implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iuj f31352a;

    public ikl(iuj iujVar) {
        this.f31352a = iujVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f31352a.mo11770u(scaleGestureDetector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f31352a.mo11771v();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getScaleFactor();
        ite iteVar = (ite) this.f31352a;
        iteVar.f32054E.mo11686p();
        if (!iteVar.f32108m) {
            iteVar.f32054E.m11784F();
        }
        iteVar.f32054E.m11787J(4, iteVar.f32075Z, ((Float) iteVar.f32103h.mo3831be()).floatValue());
    }
}
