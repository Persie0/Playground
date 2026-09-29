package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tx6 extends k8b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx6(Class cls) {
        super(cls);
        cls.getClass();
    }

    @Override // p000.k8b
    /* JADX INFO: renamed from: b */
    public final l8b mo10910b() {
        if (!this.f46871a || !this.f46873c.f55781j.f755d) {
            return new ux6(this.f46872b, this.f46873c, this.f46874d);
        }
        C3386nv.m17626m("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    @Override // p000.k8b
    /* JADX INFO: renamed from: c */
    public final k8b mo10911c() {
        return this;
    }
}
