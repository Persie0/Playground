package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: renamed from: vo */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3692vo implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f65685c;

    public /* synthetic */ C3692vo(int i, Object obj, Object obj2) {
        this.f65683a = i;
        this.f65684b = obj;
        this.f65685c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f65683a;
        Object obj = this.f65684b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                fs5 fs5Var = (fs5) this.f65685c;
                int i2 = AppBarLayout.f12562W;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fs5Var.m12075s(fFloatValue);
                Drawable drawable = appBarLayout.f12574S;
                if (drawable instanceof fs5) {
                    ((fs5) drawable).m12075s(fFloatValue);
                }
                Iterator it = appBarLayout.f12568M.iterator();
                if (it.hasNext()) {
                    throw wq1.m24110f(it);
                }
                Iterator it2 = appBarLayout.f12569N.iterator();
                if (it2.hasNext()) {
                    throw wq1.m24110f(it2);
                }
                return;
            default:
                ((View) ((z4b) ((nr9) obj).f53173a).f70908d.getParent()).invalidate();
                return;
        }
    }
}
