package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: un */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1044un implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ oqs f47755a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AmbientDelegate f47756b;

    public C1044un(AmbientDelegate ambientDelegate, oqs oqsVar, byte[] bArr) {
        this.f47756b = ambientDelegate;
        this.f47755a = oqsVar;
    }

    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16103a(Object obj, ols olsVar) {
        C0748jo c0748jo = (C0748jo) obj;
        if ((c0748jo instanceof C1018to) || (c0748jo instanceof C1017tn)) {
            ((C1075vr) this.f47756b.f1687c).m19509b();
            oqs oqsVar = this.f47755a;
            oqsVar.getClass();
            ory oryVar = (ory) oqsVar.mo18859cS().get(ory.f46473c);
            if (oryVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scope cannot be cancelled because it does not have a job: ");
                sb.append(oqsVar);
                throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(oqsVar.toString()));
            }
            oryVar.mo18977r(null);
        }
        return oki.f46196a;
    }
}
