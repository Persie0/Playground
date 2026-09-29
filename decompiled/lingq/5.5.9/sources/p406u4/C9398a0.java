package p406u4;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: u4.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9398a0 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a */
    public final Rect f48219a;

    public C9398a0() {
    }

    public C9398a0(Rect rect) {
        this.f48219a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f3, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i10 = rect3.left;
        int i11 = i10 + ((int) ((rect4.left - i10) * f3));
        int i12 = rect3.top;
        int i13 = i12 + ((int) ((rect4.top - i12) * f3));
        int i14 = rect3.right;
        int i15 = i14 + ((int) ((rect4.right - i14) * f3));
        int i16 = rect3.bottom;
        int i17 = i16 + ((int) ((rect4.bottom - i16) * f3));
        Rect rect5 = this.f48219a;
        if (rect5 == null) {
            return new Rect(i11, i13, i15, i17);
        }
        rect5.set(i11, i13, i15, i17);
        return rect5;
    }
}
