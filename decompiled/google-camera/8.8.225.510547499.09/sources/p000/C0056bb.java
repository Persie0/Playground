package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: bb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0056bb implements adj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f2887a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewGroup f2888b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0060bf f2889c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0133dl f2890d;

    public C0056bb(View view, ViewGroup viewGroup, C0060bf c0060bf, C0133dl c0133dl) {
        this.f2887a = view;
        this.f2888b = viewGroup;
        this.f2889c = c0060bf;
        this.f2890d = c0133dl;
    }

    @Override // p000.adj
    /* JADX INFO: renamed from: a */
    public final void mo291a() {
        this.f2887a.clearAnimation();
        this.f2888b.endViewTransition(this.f2887a);
        this.f2889c.m2373b();
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.f2890d);
            sb.append(" has been cancelled.");
        }
    }
}
