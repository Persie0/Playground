package p000;

import com.lingq.core.p012ui.dragdrop.C1919b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qe7 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f57652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1919b f57653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f57654c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f57655d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f57656e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f57657f;

    public qe7(List list, C1919b c1919b, tb7 tb7Var, vi3 vi3Var, t66 t66Var, t66 t66Var2) {
        this.f57652a = list;
        this.f57653b = c1919b;
        this.f57654c = tb7Var;
        this.f57655d = vi3Var;
        this.f57656e = t66Var;
        this.f57657f = t66Var2;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft4 ft4Var = (ft4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
            td7 td7Var = (td7) this.f57652a.get(iIntValue);
            tj3Var.m22111b0(-1487554619);
            lbd.m16061a(null, this.f57653b, iIntValue, ci8.m4703P(-718791852, new pe7(this.f57654c, td7Var, this.f57655d, this.f57656e, this.f57657f), tj3Var), tj3Var, 3136 | (((i & 126) << 3) & 896));
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
