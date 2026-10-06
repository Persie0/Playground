package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esi implements chs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f15311a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f15312b;

    public esi(ciq ciqVar, int i) {
        this.f15312b = i;
        this.f15311a = ciqVar;
    }

    public esi(esl eslVar, int i) {
        this.f15312b = i;
        this.f15311a = eslVar;
    }

    @Override // p000.chs
    /* JADX INFO: renamed from: b */
    public final void mo3752b() {
        switch (this.f15312b) {
            case 0:
                fcp fcpVar = ((esl) this.f15311a).f15416t;
                fcpVar.getClass();
                fcpVar.mo8151Z(3, 2);
                break;
            default:
                ((ciq) this.f15311a).f5817B = true;
                break;
        }
    }

    @Override // p000.chs
    /* JADX INFO: renamed from: a */
    public final void mo3751a() {
        switch (this.f15312b) {
            case 0:
                ((esl) this.f15311a).m7781D();
                esl eslVar = (esl) this.f15311a;
                fcp fcpVar = eslVar.f15416t;
                fcpVar.getClass();
                fcpVar.mo8151Z(eslVar.m7782E(), 2);
                break;
            default:
                ciq ciqVar = (ciq) this.f15311a;
                if (ciqVar.f5817B) {
                    ciqVar.f5839e.m4499k();
                }
                break;
        }
    }
}
