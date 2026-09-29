package p000;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.feature.onboarding.R$string;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vd1 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65226a;

    public /* synthetic */ vd1(int i) {
        this.f65226a = i;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        C3419on c3419onM16933h;
        C3419on c3419onM16933h2;
        int i = this.f65226a;
        int i2 = 0;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    ud5 ud5Var = (ud5) xd5.f68099a.get(iIntValue);
                    xd5.m24462a(vz1.m23620a0(tj3Var, ud5Var.f63757a), vz1.m23620a0(tj3Var, ud5Var.f63758b), tj3Var, 0);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                Integer num = (Integer) obj2;
                ye1 ye1Var2 = (ye1) obj3;
                ((Integer) obj4).getClass();
                ((C3116im) obj).getClass();
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                tj3 tj3Var2 = (tj3) ye1Var2;
                e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f, 0.0f, 2);
                if (num == null) {
                    tj3Var2.m22111b0(-663266088);
                    tj3Var2.m22139q(false);
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    String string = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    while (i2 < size) {
                        arrayList2.add(((C3304ln) arrayList.get(i2)).m16392a(sb.length()));
                        i2++;
                    }
                    c3419onM16933h = new C3419on(string, arrayList2);
                } else {
                    tj3Var2.m22111b0(-663151543);
                    C3341mn c3341mn = new C3341mn();
                    String strM23618Z = vz1.m23618Z(R$string.onboarding_daily_goal_message, new Object[]{num}, tj3Var2);
                    c3341mn.m16929d(strM23618Z);
                    Pair pairM11560b = f5d.m11560b(num.intValue(), strM23618Z);
                    int iIntValue3 = ((Number) pairM11560b.f47623a).intValue();
                    int iIntValue4 = ((Number) pairM11560b.f47624b).intValue();
                    bc3 bc3Var = bc3.f8323i;
                    c3341mn.m16927b(new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iIntValue3, iIntValue4);
                    c3341mn.m16929d(" ");
                    tj3Var2.m22111b0(-1822484450);
                    int iM16932g = c3341mn.m16932g(new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        c3341mn.m16929d(vz1.m23620a0(tj3Var2, R$string.upgrade_one_year));
                        c3341mn.m16931f(iM16932g);
                        tj3Var2.m22139q(false);
                        c3419onM16933h = c3341mn.m16933h();
                        tj3Var2.m22139q(false);
                    } catch (Throwable th) {
                        c3341mn.m16931f(iM16932g);
                        throw th;
                    }
                }
                lw9.m16555c(c3419onM16933h, e16VarM21609V, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, null, ye1Var2, 0, 0, 523260);
                return xfaVar;
            case 2:
                Integer num2 = (Integer) obj2;
                ye1 ye1Var3 = (ye1) obj3;
                ((Integer) obj4).getClass();
                ((C3116im) obj).getClass();
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                tj3 tj3Var3 = (tj3) ye1Var3;
                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(e16VarM4412e2, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, 0.0f, 2);
                if (num2 == null) {
                    tj3Var3.m22111b0(-1819526043);
                    tj3Var3.m22139q(false);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    String string2 = sb2.toString();
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size2 = arrayList3.size();
                    while (i2 < size2) {
                        arrayList4.add(((C3304ln) arrayList3.get(i2)).m16392a(sb2.length()));
                        i2++;
                    }
                    c3419onM16933h2 = new C3419on(string2, arrayList4);
                } else {
                    tj3Var3.m22111b0(-1819421666);
                    C3341mn c3341mn2 = new C3341mn();
                    String strM23618Z2 = vz1.m23618Z(R$string.onboarding_daily_goal_message, new Object[]{num2}, tj3Var3);
                    c3341mn2.m16929d(strM23618Z2);
                    Pair pairM11560b2 = f5d.m11560b(num2.intValue(), strM23618Z2);
                    int iIntValue5 = ((Number) pairM11560b2.f47623a).intValue();
                    int iIntValue6 = ((Number) pairM11560b2.f47624b).intValue();
                    bc3 bc3Var2 = bc3.f8323i;
                    c3341mn2.m16927b(new he9(0L, 0L, bc3Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iIntValue5, iIntValue6);
                    c3341mn2.m16929d(" ");
                    tj3Var3.m22111b0(1603898089);
                    int iM16932g2 = c3341mn2.m16932g(new he9(0L, 0L, bc3Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        c3341mn2.m16929d(vz1.m23620a0(tj3Var3, R$string.upgrade_one_year));
                        c3341mn2.m16931f(iM16932g2);
                        tj3Var3.m22139q(false);
                        c3419onM16933h2 = c3341mn2.m16933h();
                        tj3Var3.m22139q(false);
                    } catch (Throwable th2) {
                        c3341mn2.m16931f(iM16932g2);
                        throw th2;
                    }
                }
                lw9.m16555c(c3419onM16933h2, e16VarM21609V2, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, null, ye1Var3, 0, 0, 523260);
                return xfaVar;
            case 3:
                ((Boolean) obj3).booleanValue();
                ((xz7) obj).getClass();
                ((TokenType) obj2).getClass();
                ((e28) obj4).getClass();
                return xfaVar;
            default:
                ((Boolean) obj3).booleanValue();
                ((xz7) obj).getClass();
                ((TokenType) obj2).getClass();
                ((e28) obj4).getClass();
                return xfaVar;
        }
    }
}
