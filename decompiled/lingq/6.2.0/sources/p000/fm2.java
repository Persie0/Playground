package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fm2 {

    /* JADX INFO: renamed from: a */
    public final int f39277a;

    /* JADX INFO: renamed from: b */
    public final jv5 f39278b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f39279c;

    public /* synthetic */ fm2(CopyOnWriteArrayList copyOnWriteArrayList, int i, jv5 jv5Var) {
        this.f39279c = copyOnWriteArrayList;
        this.f39277a = i;
        this.f39278b = jv5Var;
    }

    /* JADX INFO: renamed from: a */
    public void m11936a(kk1 kk1Var) {
        for (nv5 nv5Var : this.f39279c) {
            uma.m22800E(nv5Var.f53288a, new mv5(0, kk1Var, nv5Var.f53289b));
        }
    }
}
