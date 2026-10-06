package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class icl implements aip {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30357a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30358b;

    public /* synthetic */ icl(hhh hhhVar, int i) {
        this.f30358b = i;
        this.f30357a = hhhVar;
    }

    public /* synthetic */ icl(icm icmVar, int i) {
        this.f30358b = i;
        this.f30357a = icmVar;
    }

    @Override // p000.aip
    /* JADX INFO: renamed from: a */
    public final void mo775a() {
        switch (this.f30358b) {
            case 0:
                icm icmVar = (icm) this.f30357a;
                ikw ikwVarM4388b = icmVar.f30361c.m4388b();
                if (icmVar.f30361c.f7067h != null && icmVar.f30359a != ikw.UNINITIALIZED) {
                    icmVar.f30361c.f7067h.mo8158ac(icmVar.f30362d, icmVar.f30359a.toString(), ikwVarM4388b.toString());
                }
                icmVar.f30359a = ikw.UNINITIALIZED;
                icmVar.f30360b = 0L;
                icmVar.f30361c.m4394h(ikwVarM4388b);
                icmVar.m11068a(false);
                break;
            default:
                hhh hhhVar = (hhh) this.f30357a;
                hhhVar.m10295f(true);
                hhhVar.setTranslationY(0.0f);
                hhhVar.getLayoutParams().height = hhhVar.m10292c();
                hhhVar.requestLayout();
                break;
        }
    }
}
