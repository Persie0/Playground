package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hgl extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    private final hgm f27688a;

    /* JADX INFO: renamed from: b */
    private final AmbientModeSupport.AmbientController f27689b;

    public hgl(hgm hgmVar, AmbientModeSupport.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f27688a = hgmVar;
        ambientController.getClass();
        this.f27689b = ambientController;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ilk ilkVar = this.f27688a.f27697h;
        float y = motionEvent2.getY() - motionEvent.getY();
        float fAbs = Math.abs(f2);
        if (y < -80.0f && fAbs > 200.0f) {
            this.f27689b.m1659i();
            return true;
        }
        if (y <= 80.0f || fAbs <= 200.0f) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        this.f27689b.m1658h();
        return true;
    }
}
