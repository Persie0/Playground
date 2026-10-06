package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ay */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0052ay extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewGroup f2699a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ View f2700b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f2701c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0133dl f2702d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C0060bf f2703e;

    public C0052ay(ViewGroup viewGroup, View view, boolean z, C0133dl c0133dl, C0060bf c0060bf) {
        this.f2699a = viewGroup;
        this.f2700b = view;
        this.f2701c = z;
        this.f2702d = c0133dl;
        this.f2703e = c0060bf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2699a.endViewTransition(this.f2700b);
        if (this.f2701c) {
            C0137dp.m6524u(this.f2702d.f11919e, this.f2700b);
        }
        this.f2703e.m2373b();
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(this.f2702d);
            sb.append(" has ended.");
        }
    }
}
