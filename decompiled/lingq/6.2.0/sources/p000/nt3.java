package p000;

/* JADX INFO: loaded from: classes.dex */
public final class nt3 implements zta {

    /* JADX INFO: renamed from: d */
    public static final g9c f53233d = new g9c(11);

    /* JADX INFO: renamed from: a */
    public final es4 f53234a;

    /* JADX INFO: renamed from: b */
    public final zta f53235b;

    /* JADX INFO: renamed from: c */
    public final C3601t7 f53236c;

    public nt3(es4 es4Var, zta ztaVar, b64 b64Var) {
        this.f53234a = es4Var;
        this.f53235b = ztaVar;
        this.f53236c = new C3601t7(b64Var, 1);
    }

    @Override // p000.zta
    /* JADX INFO: renamed from: a */
    public final wta mo3069a(Class cls) {
        if (!this.f53234a.containsKey(cls)) {
            return this.f53235b.mo3069a(cls);
        }
        C3386nv.m17636w("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // p000.zta
    /* JADX INFO: renamed from: b */
    public final wta mo3070b(Class cls, p56 p56Var) {
        return this.f53234a.containsKey(cls) ? this.f53236c.mo3070b(cls, p56Var) : this.f53235b.mo3070b(cls, p56Var);
    }
}
