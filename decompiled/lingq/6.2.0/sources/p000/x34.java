package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class x34 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f67713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f67714c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f67715d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y34 f67716e;

    public x34(y34 y34Var, int i, TextView textView, int i2, TextView textView2) {
        this.f67716e = y34Var;
        this.f67712a = i;
        this.f67713b = textView;
        this.f67714c = i2;
        this.f67715d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3048gr c3048gr;
        int i = this.f67712a;
        y34 y34Var = this.f67716e;
        y34Var.f69227n = i;
        y34Var.f69225l = null;
        TextView textView = this.f67713b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f67714c == 1 && (c3048gr = y34Var.f69231r) != null) {
                c3048gr.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f67715d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f67715d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
