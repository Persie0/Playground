package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class f5b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m5b f38495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f6b f38496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f6b f38497c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f38498d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f38499e;

    public f5b(m5b m5bVar, f6b f6bVar, f6b f6bVar2, int i, View view) {
        this.f38495a = m5bVar;
        this.f38496b = f6bVar;
        this.f38497c = f6bVar2;
        this.f38498d = i;
        this.f38499e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t5b o5bVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m5b m5bVar = this.f38495a;
        l5b l5bVar = m5bVar.f50624a;
        l5bVar.mo14860e(animatedFraction);
        float fMo14858c = l5bVar.mo14858c();
        PathInterpolator pathInterpolator = h5b.f41821e;
        int i = Build.VERSION.SDK_INT;
        f6b f6bVar = this.f38496b;
        if (i >= 36) {
            o5bVar = new s5b(f6bVar);
        } else if (i >= 35) {
            o5bVar = new r5b(f6bVar);
        } else if (i >= 34) {
            o5bVar = new q5b(f6bVar);
        } else if (i >= 31) {
            o5bVar = new p5b(f6bVar);
        } else {
            o5bVar = i >= 30 ? new o5b(f6bVar) : new n5b(f6bVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f38498d & i2;
            c6b c6bVar = f6bVar.f38536a;
            if (i3 == 0) {
                o5bVar.mo17808d(i2, c6bVar.mo136i(i2));
            } else {
                l64 l64VarMo136i = c6bVar.mo136i(i2);
                l64 l64VarMo136i2 = this.f38497c.f38536a.mo136i(i2);
                float f = 1.0f - fMo14858c;
                o5bVar.mo17808d(i2, f6b.m11569e(l64VarMo136i, (int) (((double) ((l64VarMo136i.f49116a - l64VarMo136i2.f49116a) * f)) + 0.5d), (int) (((double) ((l64VarMo136i.f49117b - l64VarMo136i2.f49117b) * f)) + 0.5d), (int) (((double) ((l64VarMo136i.f49118c - l64VarMo136i2.f49118c) * f)) + 0.5d), (int) (((double) ((l64VarMo136i.f49119d - l64VarMo136i2.f49119d) * f)) + 0.5d)));
            }
        }
        h5b.m13063h(this.f38499e, o5bVar.mo17237b(), Collections.singletonList(m5bVar));
    }
}
