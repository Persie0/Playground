package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pe0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55994b;

    public /* synthetic */ pe0(int i, int i2) {
        this.f55993a = i2;
        this.f55994b = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f55993a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f55994b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var, i2), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var, 1572864, 0, 131006);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        zf1 zf1Var = ge9.f40637a;
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f);
                        vh9 vh9Var = ps5.f56764b;
                        lw9.m16554b(LanguageProgressMetric.ListeningHours.getKey(), x74.m24341H(c99.m4429v(c99.m4426s(pb1.m19045o(e16VarM21608U, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64858d), 120.0f))), ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4216i(), null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71402f, tj3Var2, 0, 24960, 110584);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strM23620a0 = vz1.m23620a0(tj3Var3, i2);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(strM23620a0, AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, 7), ((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var2)).f51800b.f71401e, tj3Var3, 1572864, 0, 131000);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    String strM23620a1 = vz1.m23620a0(tj3Var4, i2);
                    vh9 vh9Var3 = ps5.f56764b;
                    lw9.m16554b(strM23620a1, e16VarM4412e, ((ms5) tj3Var4.m22128k(vh9Var3)).f51799a.f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(vh9Var3)).f51800b.f71404h, tj3Var4, 48, 0, 130040);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            case 4:
                cq9 cq9Var = (cq9) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? ((tj3) ye1Var5).m22120g(cq9Var) : ((tj3) ye1Var5).m22124i(cq9Var) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    a3d.f191c.m90j(cq9Var.mo9850a(i2, false), 0.0f, 0L, tj3Var5, 3072);
                } else {
                    tj3Var5.m22102U();
                }
                break;
            case 5:
                cq9 cq9Var2 = (cq9) obj;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? ((tj3) ye1Var6).m22120g(cq9Var2) : ((tj3) ye1Var6).m22124i(cq9Var2) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    a3d.f191c.m88h(Float.NaN, 0.0f, 196656, 0L, tj3Var6, cq9Var2.mo9850a(i2, true), null);
                } else {
                    tj3Var6.m22102U();
                }
                break;
            case 6:
                cq9 cq9Var3 = (cq9) obj;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? ((tj3) ye1Var7).m22120g(cq9Var3) : ((tj3) ye1Var7).m22124i(cq9Var3) ? 4 : 2;
                }
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    a3d.f191c.m88h(Float.NaN, 0.0f, 196656, 0L, tj3Var7, cq9Var3.mo9850a(i2, true), null);
                } else {
                    tj3Var7.m22102U();
                }
                break;
            default:
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var8, i2), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 130046);
                } else {
                    tj3Var8.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
