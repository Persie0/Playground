package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fis implements fic {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22148a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22149b;

    public /* synthetic */ fis(fin finVar, int i) {
        this.f22149b = i;
        this.f22148a = finVar;
    }

    public /* synthetic */ fis(fiv fivVar, int i) {
        this.f22149b = i;
        this.f22148a = fivVar;
    }

    @Override // p000.fic
    /* JADX INFO: renamed from: a */
    public final void mo8456a(lcy lcyVar, ldx ldxVar) {
        switch (this.f22149b) {
            case 0:
                fiv fivVar = (fiv) this.f22148a;
                gvb gvbVar = fivVar.f22188t;
                ldf ldfVar = fivVar.f22184p;
                lec lecVar = fivVar.f22185q;
                float[] fArrMo8440e = fivVar.f22175g.mo8440e();
                lct lctVarM15890c = lct.m15170j(lecVar, ldfVar).m15890c((ldx) gvbVar.f26482a);
                lctVarM15890c.m15171a("aPosition", 0);
                lctVarM15890c.m15171a(VCYBIzY.dpe, 1);
                lctVarM15890c.m15177g(fArrMo8440e);
                lctVarM15890c.m15172b(lcyVar);
                lctVarM15890c.f37949j = true;
                lctVarM15890c.m15179k(ldxVar);
                break;
            default:
                lea leaVar = ((fin) this.f22148a).f22130b;
                leaVar.getClass();
                leaVar.m15236f(lcyVar, ldxVar, fin.f22128a);
                break;
        }
    }
}
