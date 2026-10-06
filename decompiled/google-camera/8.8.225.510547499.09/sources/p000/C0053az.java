package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: az */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0053az implements adj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Animator f2740a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0133dl f2741b;

    public C0053az(Animator animator, C0133dl c0133dl) {
        this.f2740a = animator;
        this.f2741b = c0133dl;
    }

    @Override // p000.adj
    /* JADX INFO: renamed from: a */
    public final void mo291a() {
        this.f2740a.end();
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(this.f2741b);
            sb.append(" has been canceled.");
        }
    }
}
