package p000;

import com.lingq.feature.reader.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fo8 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tpa f39388b;

    public /* synthetic */ fo8(tpa tpaVar, int i) {
        this.f39387a = i;
        this.f39388b = tpaVar;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f39387a;
        xfa xfaVar = xfa.f68157a;
        tpa tpaVar = this.f39388b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    zjc.m25679a(tpaVar.f62710e, tpaVar.f62708c, tpaVar.f62709d, null, tj3Var, 0, 8);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, tpaVar.f62714i ? R$string.lesson_view_lesson_stats : R$string.lesson_finish_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var2, 0, 0, 131070);
                }
                break;
        }
        return xfaVar;
    }
}
