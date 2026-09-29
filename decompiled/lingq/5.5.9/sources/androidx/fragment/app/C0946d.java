package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0946d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f6272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f6273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f6274c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f6275d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0942b.b f6276e;

    public C0946d(ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, C0942b.b bVar) {
        this.f6272a = viewGroup;
        this.f6273b = view;
        this.f6274c = z10;
        this.f6275d = operation;
        this.f6276e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f6272a;
        View view = this.f6273b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f6274c;
        SpecialEffectsController.Operation operation = this.f6275d;
        if (z10) {
            operation.f6235a.applyState(view);
        }
        this.f6276e.m3721a();
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has ended.");
        }
    }
}
