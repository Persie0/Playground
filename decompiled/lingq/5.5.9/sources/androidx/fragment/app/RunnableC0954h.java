package androidx.fragment.app;

import p326q.C8446b;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0954h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SpecialEffectsController.Operation f6297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f6299c;

    public RunnableC0954h(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, C8446b c8446b) {
        this.f6297a = operation;
        this.f6298b = operation2;
        this.f6299c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f6297a.f6237c;
        Fragment fragment2 = this.f6298b.f6237c;
        C0969o0 c0969o0 = C0965m0.f6370a;
        if (this.f6299c) {
            fragment2.getClass();
        } else {
            fragment.getClass();
        }
    }
}
