package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p389t2.C9185d;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0952g implements C9185d.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f6293a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f6294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0942b.b f6295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f6296d;

    public C0952g(View view, ViewGroup viewGroup, C0942b.b bVar, SpecialEffectsController.Operation operation) {
        this.f6293a = view;
        this.f6294b = viewGroup;
        this.f6295c = bVar;
        this.f6296d = operation;
    }

    @Override // p389t2.C9185d.a
    /* JADX INFO: renamed from: a */
    public final void mo3694a() {
        View view = this.f6293a;
        view.clearAnimation();
        this.f6294b.endViewTransition(view);
        this.f6295c.m3721a();
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6296d + " has been cancelled.");
        }
    }
}
