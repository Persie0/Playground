package androidx.work.impl.constraints.controllers;

import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3222b;
import p000.ak1;
import p000.dj1;
import p000.yb0;

/* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0777a implements dj1 {

    /* JADX INFO: renamed from: a */
    public final yb0 f7239a;

    public AbstractC0777a(yb0 yb0Var) {
        yb0Var.getClass();
        this.f7239a = yb0Var;
    }

    @Override // p000.dj1
    /* JADX INFO: renamed from: a */
    public final C3222b mo2920a(ak1 ak1Var) {
        ak1Var.getClass();
        return AbstractC3224d.m15526e(new BaseConstraintController$track$1(this, null));
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo2923c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2924d(Object obj);
}
