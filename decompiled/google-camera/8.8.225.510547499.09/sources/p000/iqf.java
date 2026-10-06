package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iqf extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iqh f31768a;

    public iqf(iqh iqhVar) {
        this.f31768a = iqhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f31768a.f31775f.mo3484b();
        iqh iqhVar = this.f31768a;
        ipx ipxVar = (ipx) ((mzq) iqhVar.f31776g).f41853c.get(((jwf) iqhVar.f31777h).f34942d);
        if (ipxVar == null || !(this.f31768a.f31779j.mo6184l(dib.f11303bJ) || this.f31768a.f31779j.mo6184l(dij.f11593q))) {
            return false;
        }
        if (ipxVar == ipx.SWITCH_CAMERA && !iqh.f31771b) {
            return true;
        }
        jfo jfoVar = this.f31768a.f31789t;
        switch (ipxVar) {
            case ZOOM:
                ite iteVar = (ite) jfoVar.f33911b;
                if (iteVar.f32120y.mo16813g()) {
                    iteVar.f32054E.f32175K = iteVar.mo11752c(false, (ikw) iteVar.f32110o.mo3831be());
                    ((hfd) iteVar.f32120y.mo16809c()).mo10172i((ikw) iteVar.f32110o.mo3831be());
                    ((hfd) iteVar.f32120y.mo16809c()).mo10170g();
                    iteVar.f32062M.f7392n = iteVar.mo11756g();
                } else {
                    if (!iteVar.f32099d.mo6184l(dib.f11276aj)) {
                        iteVar.mo11765p();
                    }
                    iteVar.f32054E.mo11680j();
                }
                return false;
            case SWITCH_CAMERA:
                ((BottomBarController) jfoVar.f33910a).switchCamera();
                return false;
            case NONE:
                return false;
            default:
                throw new IllegalStateException("Invalid double tap action option ".concat(ipxVar.toString()));
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AmbientModeSupport.AmbientController ambientController = this.f31768a.f31790u;
        if (Math.abs(f) > Math.abs(f2)) {
            ((ibs) ambientController.f1702a).m11031c(f);
            return false;
        }
        ((ibs) ambientController.f1702a).m11031c(f2);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        iqh iqhVar = this.f31768a;
        iqhVar.f31781l = true;
        iqhVar.f31775f.mo3484b();
        iqh iqhVar2 = this.f31768a;
        iqhVar2.f31774e.mo3424d(iqhVar2.m11602a(motionEvent));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f31768a.f31774e.mo3423c();
        iqh iqhVar = this.f31768a;
        int i = iqhVar.f31786q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                if (iqhVar.f31784o > 0) {
                    return false;
                }
                float f3 = iqhVar.f31782m + f;
                iqhVar.f31782m = f3;
                iqhVar.f31783n += f2;
                if (iqh.m11601e(f3)) {
                    iqh iqhVar2 = this.f31768a;
                    iqhVar2.f31787r.m11405a(iqhVar2.f31782m);
                    this.f31768a.f31786q = 2;
                    return true;
                }
                if (!iqh.m11601e(this.f31768a.f31783n)) {
                    return false;
                }
                iqh iqhVar3 = this.f31768a;
                iqhVar3.f31788s.m11406a(iqhVar3.f31783n);
                this.f31768a.f31786q = 3;
                return true;
            case 1:
                iqhVar.f31787r.m11405a(f);
                return true;
            case 2:
                iqhVar.f31788s.m11406a(f2);
                return true;
            default:
                throw new IllegalStateException("Unknown scrolling state");
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        iqh iqhVar = this.f31768a;
        iqhVar.f31775f.mo3470a(iqhVar.m11602a(motionEvent));
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        iqh iqhVar = this.f31768a;
        iqhVar.f31775f.mo3488f(iqhVar.m11602a(motionEvent));
        return false;
    }
}
