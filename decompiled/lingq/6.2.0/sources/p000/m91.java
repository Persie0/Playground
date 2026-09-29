package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.library.Sort;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m91 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f50805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f50806c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f50807d;

    public /* synthetic */ m91(List list, vi3 vi3Var, t66 t66Var, int i) {
        this.f50804a = i;
        this.f50805b = list;
        this.f50806c = vi3Var;
        this.f50807d = t66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f50804a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        final t66 t66Var = this.f50807d;
        final vi3 vi3Var = this.f50806c;
        List<Sort> list = this.f50805b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (final Sort sort : list) {
                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                        C0282a c0282aM4703P = ci8.m4703P(556499325, new zi3() { // from class: n91
                            @Override // p000.zi3
                            public final Object invoke(Object obj4, Object obj5) {
                                int i3 = objArr3;
                                xfa xfaVar2 = xfa.f68157a;
                                Sort sort2 = sort;
                                switch (i3) {
                                    case 0:
                                        ye1 ye1Var2 = (ye1) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        tj3 tj3Var2 = (tj3) ye1Var2;
                                        if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            tj3Var2.m22102U();
                                        } else {
                                            lw9.m16554b(vz1.m23620a0(tj3Var2, AbstractC3423or.m18255g0(sort2)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            lw9.m16554b(vz1.m23620a0(tj3Var3, AbstractC3423or.m18255g0(sort2)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var);
                        boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(sort.ordinal());
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            final Object[] objArr4 = objArr == true ? 1 : 0;
                            objM22097O = new ui3() { // from class: o91
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i3 = objArr4;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var2 = t66Var;
                                    Sort sort2 = sort;
                                    vi3 vi3Var2 = vi3Var;
                                    switch (i3) {
                                        case 0:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(new a61(sort2));
                                            break;
                                        default:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(new ds8(sort2));
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var.m22131l0(objM22097O);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P, (ui3) objM22097O, null, null, null, false, null, null, tj3Var, 6, 508);
                    }
                } else {
                    tj3Var.m22102U();
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (final Sort sort2 : list) {
                        C0282a c0282aM4703P2 = ci8.m4703P(590304419, new zi3() { // from class: n91
                            @Override // p000.zi3
                            public final Object invoke(Object obj4, Object obj5) {
                                int i3 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                Sort sort3 = sort2;
                                switch (i3) {
                                    case 0:
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            lw9.m16554b(vz1.m23620a0(tj3Var3, AbstractC3423or.m18255g0(sort3)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var4 = (ye1) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        tj3 tj3Var4 = (tj3) ye1Var4;
                                        if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            tj3Var4.m22102U();
                                        } else {
                                            lw9.m16554b(vz1.m23620a0(tj3Var4, AbstractC3423or.m18255g0(sort3)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var2);
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22116e(sort2.ordinal());
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new ui3() { // from class: o91
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i3 = i2;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var2 = t66Var;
                                    Sort sort3 = sort2;
                                    vi3 vi3Var2 = vi3Var;
                                    switch (i3) {
                                        case 0:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(new a61(sort3));
                                            break;
                                        default:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(new ds8(sort3));
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P2, (ui3) objM22097O2, null, null, null, false, null, null, tj3Var2, 6, 508);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
