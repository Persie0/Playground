package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 extends daa {

    /* JADX INFO: renamed from: f0 */
    public static final String[] f64316f0 = {"android:changeScroll:x", "android:changeScroll:y"};

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ int f64317e0 = 1;

    public /* synthetic */ ut0() {
    }

    /* JADX INFO: renamed from: W */
    public static void m22907W(waa waaVar) {
        HashMap map = waaVar.f66570a;
        View view = waaVar.f66571b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public boolean mo3530B() {
        switch (this.f64317e0) {
            case 0:
                return true;
            default:
                return super.mo3530B();
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        switch (this.f64317e0) {
            case 0:
                m22907W(waaVar);
                break;
            default:
                View view = waaVar.f66571b;
                if (view instanceof TextView) {
                    waaVar.f66570a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                }
                break;
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        switch (this.f64317e0) {
            case 0:
                m22907W(waaVar);
                break;
            default:
                View view = waaVar.f66571b;
                if (view instanceof TextView) {
                    waaVar.f66570a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                }
                break;
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        switch (this.f64317e0) {
            case 0:
                if (waaVar == null) {
                    return null;
                }
                HashMap map = waaVar.f66570a;
                if (waaVar2 == null) {
                    return null;
                }
                HashMap map2 = waaVar2.f66570a;
                View view = waaVar2.f66571b;
                int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
                int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
                int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
                int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
                if (iIntValue != iIntValue2) {
                    view.setScrollX(iIntValue);
                    objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                } else {
                    objectAnimatorOfInt = null;
                }
                if (iIntValue3 != iIntValue4) {
                    view.setScrollY(iIntValue3);
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                }
                return l8d.m16029c(objectAnimatorOfInt, objectAnimatorOfInt2);
            default:
                if (waaVar == null || waaVar2 == null || !(waaVar.f66571b instanceof TextView)) {
                    return null;
                }
                View view2 = waaVar2.f66571b;
                if (!(view2 instanceof TextView)) {
                    return null;
                }
                TextView textView = (TextView) view2;
                HashMap map3 = waaVar.f66570a;
                HashMap map4 = waaVar2.f66570a;
                float fFloatValue = map3.get("android:textscale:scale") != null ? ((Float) map3.get("android:textscale:scale")).floatValue() : 1.0f;
                float fFloatValue2 = map4.get("android:textscale:scale") != null ? ((Float) map4.get("android:textscale:scale")).floatValue() : 1.0f;
                if (fFloatValue == fFloatValue2) {
                    return null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
                valueAnimatorOfFloat.addUpdateListener(new gg0(textView, 5));
                return valueAnimatorOfFloat;
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public String[] mo3045y() {
        switch (this.f64317e0) {
            case 0:
                return f64316f0;
            default:
                return super.mo3045y();
        }
    }

    public /* synthetic */ ut0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
