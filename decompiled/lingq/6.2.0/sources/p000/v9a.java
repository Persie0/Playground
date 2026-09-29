package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class v9a {

    /* JADX INFO: renamed from: a */
    public final jda f65083a;

    /* JADX INFO: renamed from: b */
    public final t66 f65084b = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ faa f65085c;

    public v9a(faa faaVar, jda jdaVar, String str) {
        this.f65085c = faaVar;
        this.f65083a = jdaVar;
    }

    /* JADX INFO: renamed from: a */
    public final u9a m23193a(vi3 vi3Var, vi3 vi3Var2) {
        t66 t66Var = this.f65084b;
        u9a u9aVar = (u9a) ((xc9) t66Var).getValue();
        faa faaVar = this.f65085c;
        if (u9aVar == null) {
            Object objInvoke = vi3Var2.invoke(faaVar.m11669c());
            Object objInvoke2 = vi3Var2.invoke(faaVar.m11669c());
            jda jdaVar = this.f65083a;
            AbstractC3081hn abstractC3081hn = (AbstractC3081hn) jdaVar.f45442a.invoke(objInvoke2);
            abstractC3081hn.mo10486d();
            baa baaVar = new baa(faaVar, objInvoke, abstractC3081hn, jdaVar);
            u9aVar = new u9a(this, baaVar, vi3Var, vi3Var2);
            ((xc9) t66Var).setValue(u9aVar);
            faaVar.f38743i.add(baaVar);
        }
        u9aVar.f63623c = vi3Var2;
        u9aVar.f63622b = vi3Var;
        u9aVar.m22636c(faaVar.m11672f());
        return u9aVar;
    }
}
