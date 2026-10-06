package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ide implements ida {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30423a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30424b;

    public /* synthetic */ ide(fpp fppVar, int i) {
        this.f30424b = i;
        this.f30423a = fppVar;
    }

    public /* synthetic */ ide(idf idfVar, int i) {
        this.f30424b = i;
        this.f30423a = idfVar;
    }

    public /* synthetic */ ide(idg idgVar, int i) {
        this.f30424b = i;
        this.f30423a = idgVar;
    }

    @Override // p000.ida
    /* JADX INFO: renamed from: a */
    public final void mo11107a(long j) {
        switch (this.f30424b) {
            case 0:
                idf idfVar = (idf) this.f30423a;
                Executor executor = idfVar.f30428d;
                kbg kbgVar = idfVar.f30427c;
                if (kbgVar != null && executor != null) {
                    executor.execute(new hri(idfVar, kbgVar, 9));
                    break;
                }
                break;
            case 1:
                ((fpp) this.f30423a).f23126i = 1;
                break;
            default:
                Object obj = this.f30423a;
                if (j >= 3000) {
                    ((idg) obj).f30434b.mo10045l("face_retouching_hint", true);
                }
                break;
        }
    }
}
