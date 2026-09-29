package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x72 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final so7 f67866a;

    /* JADX INFO: renamed from: b */
    public final so7 f67867b;

    /* JADX INFO: renamed from: c */
    public final vm8 f67868c;

    /* JADX INFO: renamed from: d */
    public final so7 f67869d;

    /* JADX INFO: renamed from: e */
    public final so7 f67870e;

    public x72(so7 so7Var, so7 so7Var2, vm8 vm8Var, so7 so7Var3, so7 so7Var4) {
        this.f67866a = so7Var;
        this.f67867b = so7Var2;
        this.f67868c = vm8Var;
        this.f67869d = so7Var3;
        this.f67870e = so7Var4;
    }

    @Override // p000.so7
    public final Object get() {
        return new w72((Executor) this.f67866a.get(), (fy5) this.f67867b.get(), (C3309ls) this.f67868c.get(), (hk8) this.f67869d.get(), (hk8) this.f67870e.get());
    }
}
