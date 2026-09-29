package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import p000.C3386nv;
import p000.fg7;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0331e {
    /* JADX INFO: renamed from: a */
    public static final void m1468a(long j, vi3 vi3Var) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        ((PointerInteropFilter$pointerInputFilter$1$onCancel$1) vi3Var).invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static final void m1469b(fg7 fg7Var, long j, vi3 vi3Var) {
        m1471d(fg7Var, j, vi3Var, true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m1470c(fg7 fg7Var, long j, vi3 vi3Var) {
        m1471d(fg7Var, j, vi3Var, false);
    }

    /* JADX INFO: renamed from: d */
    public static final void m1471d(fg7 fg7Var, long j, vi3 vi3Var, boolean z) {
        MotionEvent motionEventM11827a = fg7Var.m11827a();
        if (motionEventM11827a == null) {
            C3386nv.m17626m("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM11827a.getAction();
        if (z) {
            motionEventM11827a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM11827a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        vi3Var.invoke(motionEventM11827a);
        motionEventM11827a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM11827a.setAction(action);
    }
}
