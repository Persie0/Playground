package p000;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mih implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ float f40583a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ float f40584b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ float f40585c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ float f40586d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ float f40587e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ float f40588f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ float f40589g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ Matrix f40590h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ min f40591i;

    public mih(min minVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.f40591i = minVar;
        this.f40583a = f;
        this.f40584b = f2;
        this.f40585c = f3;
        this.f40586d = f4;
        this.f40587e = f5;
        this.f40588f = f6;
        this.f40589g = f7;
        this.f40590h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f40591i.f40611B.setAlpha(mfs.m16340a(this.f40583a, this.f40584b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = this.f40591i.f40611B;
        float f = this.f40585c;
        floatingActionButton.setScaleX(f + ((this.f40586d - f) * fFloatValue));
        FloatingActionButton floatingActionButton2 = this.f40591i.f40611B;
        float f2 = this.f40587e;
        floatingActionButton2.setScaleY(f2 + ((this.f40586d - f2) * fFloatValue));
        min minVar = this.f40591i;
        float f3 = this.f40588f;
        float f4 = f3 + (fFloatValue * (this.f40589g - f3));
        minVar.f40632y = f4;
        minVar.m16405d(f4, this.f40590h);
        this.f40591i.f40611B.setImageMatrix(this.f40590h);
    }
}
