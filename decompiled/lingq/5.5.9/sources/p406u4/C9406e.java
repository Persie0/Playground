package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9406e extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Y */
    public static final String[] f48258Y = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: u4.e$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f48259a;

        public a(View view) {
            this.f48259a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.f.m18696c(this.f48259a, null);
        }
    }

    public C9406e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: S */
    public final void m17771S(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        Rect rectM18694a = C10029b0.f.m18694a(view);
        HashMap map = c9425n0.f48372a;
        map.put("android:clipBounds:clip", rectM18694a);
        if (rectM18694a == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17771S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17771S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        if (c9425n0 != null && c9425n1 != null) {
            HashMap map = c9425n0.f48372a;
            if (map.containsKey("android:clipBounds:clip")) {
                HashMap map2 = c9425n1.f48372a;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
                    boolean z10 = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    View view = c9425n1.f48373b;
                    C10029b0.f.m18696c(view, rect);
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, C9433r0.f48405c, new C9398a0(new Rect()), rect, rect2);
                    if (z10) {
                        objectAnimatorOfObject.addListener(new a(view));
                    }
                    return objectAnimatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48258Y;
    }
}
