package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import p389t2.C9185d;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0948e implements C9185d.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Animator f6279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6280b;

    public C0948e(Animator animator, SpecialEffectsController.Operation operation) {
        this.f6279a = animator;
        this.f6280b = operation;
    }

    @Override // p389t2.C9185d.a
    /* JADX INFO: renamed from: a */
    public final void mo3694a() {
        this.f6279a.end();
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f6280b + " has been canceled.");
        }
    }
}
