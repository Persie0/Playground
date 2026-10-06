package p000;

import android.view.ScaleGestureDetector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iqe implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener f31765a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ iqa f31766b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ iqh f31767c;

    public iqe(iqh iqhVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, iqa iqaVar) {
        this.f31767c = iqhVar;
        this.f31765a = onScaleGestureListener;
        this.f31766b = iqaVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f31765a.onScale(scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f31767c.f31780k = true;
        this.f31765a.onScaleBegin(scaleGestureDetector);
        this.f31766b.mo3423c();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f31765a.onScaleEnd(scaleGestureDetector);
    }
}
