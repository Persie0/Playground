package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d8b implements xy2 {

    /* JADX INFO: renamed from: a */
    public final so7 f35185a;

    /* JADX INFO: renamed from: b */
    public final so7 f35186b;

    /* JADX INFO: renamed from: c */
    public final vm8 f35187c;

    /* JADX INFO: renamed from: d */
    public final so7 f35188d;

    public d8b(so7 so7Var, so7 so7Var2, vm8 vm8Var, so7 so7Var3) {
        this.f35185a = so7Var;
        this.f35186b = so7Var2;
        this.f35187c = vm8Var;
        this.f35188d = so7Var3;
    }

    @Override // p000.so7
    public final Object get() {
        return new ny8((Executor) this.f35185a.get(), (hk8) this.f35186b.get(), (C3309ls) this.f35187c.get(), (hk8) this.f35188d.get(), 19);
    }
}
