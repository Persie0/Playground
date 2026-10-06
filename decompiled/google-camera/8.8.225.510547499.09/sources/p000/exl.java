package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exl implements bnk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f20740a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f20741b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f20742c;

    public exl(exi exiVar, bnq bnqVar, int i) {
        this.f20742c = i;
        this.f20740a = exiVar;
        this.f20741b = bnqVar;
    }

    public exl(exm exmVar, eyp eypVar, int i) {
        this.f20742c = i;
        this.f20741b = exmVar;
        this.f20740a = eypVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [eyp, java.lang.Object] */
    @Override // p000.bnk
    /* JADX INFO: renamed from: a */
    public final void mo2767a(boolean z, bnq bnqVar) {
        switch (this.f20742c) {
            case 0:
                exp expVar = ((exm) this.f20741b).f20760b;
                expVar.f20792E.m8043c(0.0d);
                expVar.f20840d.m8033b(expVar.f20792E.m8046f());
                if (expVar.f20850n && expVar.f20794G == 1) {
                    expVar.f20841e.m4203c(expVar.f20860x);
                }
                expVar.f20857u = true;
                ((exm) this.f20741b).f20779u = true;
                this.f20740a.mo8051a(null);
                break;
            default:
                exm exmVar = ((exi) this.f20740a).f20738a;
                int i = exmVar.f20769k + 1;
                exmVar.f20769k = i;
                if (exmVar.f20768j) {
                    ((nbe) ((nbe) exm.f20743a.m17252c()).mo17276G((char) 2036)).mo17290o("Past trial succeeded so nothing to do, shouldn't have gotten to this.");
                } else {
                    if (z || i >= 3) {
                        exmVar.m8006d((bnq) this.f20741b);
                    }
                    exm exmVar2 = ((exi) this.f20740a).f20738a;
                    exmVar2.f20766h = z ? exmVar2.f20767i : -9990.0d;
                    ((exi) this.f20740a).f20738a.f20768j = z;
                }
                ((exi) this.f20740a).f20738a.f20770l.release();
                break;
        }
    }
}
