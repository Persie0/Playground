package androidx.fragment.app;

import android.util.Log;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0960k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0942b.d f6316a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6317b;

    public RunnableC0960k(C0942b.d dVar, SpecialEffectsController.Operation operation) {
        this.f6316a = dVar;
        this.f6317b = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6316a.m3721a();
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f6317b + "has completed");
        }
    }
}
