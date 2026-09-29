package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u9a implements dh9 {

    /* JADX INFO: renamed from: a */
    public final baa f63621a;

    /* JADX INFO: renamed from: b */
    public vi3 f63622b;

    /* JADX INFO: renamed from: c */
    public vi3 f63623c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v9a f63624d;

    public u9a(v9a v9aVar, baa baaVar, vi3 vi3Var, vi3 vi3Var2) {
        this.f63624d = v9aVar;
        this.f63621a = baaVar;
        this.f63622b = vi3Var;
        this.f63623c = vi3Var2;
    }

    /* JADX INFO: renamed from: c */
    public final void m22636c(z9a z9aVar) {
        Object objInvoke = this.f63623c.invoke(z9aVar.mo218c());
        boolean zM11673g = this.f63624d.f65085c.m11673g();
        baa baaVar = this.f63621a;
        if (zM11673g) {
            baaVar.m3537g(this.f63623c.invoke(z9aVar.mo217a()), objInvoke, (l43) this.f63622b.invoke(z9aVar));
        } else {
            baaVar.m3538h(objInvoke, (l43) this.f63622b.invoke(z9aVar));
        }
    }

    @Override // p000.dh9
    public final Object getValue() {
        m22636c(this.f63624d.f65085c.m11672f());
        return ((xc9) this.f63621a.f8247h).getValue();
    }
}
