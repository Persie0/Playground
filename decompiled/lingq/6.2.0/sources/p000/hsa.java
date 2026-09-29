package p000;

import com.lingq.core.domain.model.ExportType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsa implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f42892b;

    public /* synthetic */ hsa(vi3 vi3Var, int i) {
        this.f42891a = i;
        this.f42892b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f42891a;
        gxa gxaVar = gxa.f41509a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f42892b;
        switch (i) {
            case 0:
                vi3Var.invoke(cra.f34434a);
                break;
            case 1:
                vi3Var.invoke(wra.f67209a);
                break;
            case 2:
                vi3Var.invoke(gxaVar);
                break;
            case 3:
                vi3Var.invoke(gxaVar);
                break;
            case 4:
                vi3Var.invoke(hxa.f43134a);
                break;
            case 5:
                vi3Var.invoke(qf6.f57699a);
                break;
            case 6:
                vi3Var.invoke(zya.f72396a);
                break;
            case 7:
                vi3Var.invoke(jza.f46440a);
                break;
            case 8:
                vi3Var.invoke(mza.f52090a);
                break;
            case 9:
                vi3Var.invoke(nza.f53480a);
                break;
            case 10:
                vi3Var.invoke(axa.f7653a);
                break;
            case 11:
                vi3Var.invoke(ywa.f70601a);
                break;
            case 12:
                vi3Var.invoke(wwa.f67435a);
                break;
            case 13:
                vi3Var.invoke(bxa.f9150a);
                break;
            case 14:
                vi3Var.invoke(j0b.f44859a);
                break;
            case 15:
                vi3Var.invoke(l0b.f48876a);
                break;
            case 16:
                vi3Var.invoke(new vwa(ExportType.CSV, false));
                break;
            case 17:
                vi3Var.invoke(new vwa(ExportType.CSV, true));
                break;
            case 18:
                vi3Var.invoke(new vwa(ExportType.Anki, false));
                break;
            case 19:
                vi3Var.invoke(new vwa(ExportType.Anki, true));
                break;
            default:
                vi3Var.invoke(cxa.f34695a);
                break;
        }
        return xfaVar;
    }
}
