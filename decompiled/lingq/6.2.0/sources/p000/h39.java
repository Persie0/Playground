package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.stats.C1529d;
import com.lingq.core.premium.R$string;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.widget.streak.C2871b;
import java.io.IOException;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h39 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41757c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f41758d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f41759e;

    public /* synthetic */ h39(String str, List list, e16 e16Var, vx9 vx9Var, int i) {
        this.f41755a = 5;
        this.f41757c = str;
        this.f41758d = list;
        this.f41756b = e16Var;
        this.f41759e = vx9Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws IOException {
        sc9 sc9Var;
        int i = this.f41755a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f41759e;
        Object obj4 = this.f41758d;
        Object obj5 = this.f41757c;
        Object obj6 = this.f41756b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8598n((e16) obj6, (w19) obj5, (zi3) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(385));
                return xfaVar;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8601q((e16) obj6, (a29) obj5, (ui3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 2:
                ((Integer) obj2).getClass();
                m4d.m16629b((vs3) obj6, (w65) obj5, (ui3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(385));
                return xfaVar;
            case 3:
                Context context = (Context) obj6;
                cma cmaVar = (cma) obj5;
                C1529d c1529d = (C1529d) obj4;
                C2871b c2871b = (C2871b) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pvc.m19507c(yf1.f69763b.mo1265a(context), ci8.m4703P(431558250, new wj9(cmaVar, c1529d, c2871b, 0), tj3Var), tj3Var, 56);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8667f((List) obj6, (ReaderFont) obj5, (Pair) obj3, (zi3) obj4, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC1915b.m8788a((String) obj5, (List) obj4, (e16) obj6, (vx9) obj3, (ye1) obj, pk9.m19383z(385));
                return xfaVar;
            case 6:
                via viaVar = (via) obj6;
                List list = (List) obj5;
                sc9 sc9Var2 = (sc9) obj4;
                wia wiaVar = (wia) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                e16 e16VarM10007D = d32.m10007D(c99.m4412e(b16Var, 1.0f), aa1.m198b(0.7f, p58.m18900f(tj3Var2).f55868n), ss5.f61356d);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                e16 e16VarM4428u = c99.m4428u(b16Var, 0.0f, 600.0f, 1);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4428u);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4429v(c99.m4412e(b16Var, 1.0f)), ge9.m12515a(tj3Var2).f38960i, 0.0f, 2);
                x17 x17Var = wj0.f66899a;
                vj0 vj0VarM23996a = wj0.m23996a(p58.m18900f(tj3Var2).f55842a, 0L, 0L, tj3Var2, 14);
                boolean zM22124i = tj3Var2.m22124i(viaVar) | tj3Var2.m22124i(list);
                Object objM22097O = tj3Var2.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    sc9Var = sc9Var2;
                    objM22097O = new u29(viaVar, list, sc9Var, 4);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    sc9Var = sc9Var2;
                }
                ss5.m21710f(e16VarM21609V, vj0VarM23996a, null, false, (ui3) objM22097O, ci8.m4703P(1589064059, new a05(wiaVar, list, sc9Var, 20), tj3Var2), tj3Var2, 196608, 12);
                lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.upgrade_cancel_any_time), AbstractC3584sr.m21610W(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38960i, ge9.m12515a(tj3Var2).f38952a, ge9.m12515a(tj3Var2).f38960i, ge9.m12515a(tj3Var2).f38957f), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var2).f71408l, p58.m18900f(tj3Var2).f55875s, 0L, null, null, null, 0L, null, null, 0, 0L, null, 16777214), tj3Var2, 0, 0, 130044);
                WeakHashMap weakHashMap = l6b.f49204w;
                thb.m22044c(tj3Var2, pvc.m19502J(ho5.m13397r(tj3Var2).f49211g));
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(true);
                return xfaVar;
            case 7:
                ((Integer) obj2).getClass();
                dbd.m10273a((zza) obj5, (vi3) obj4, (ui3) obj3, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 8:
                yza yzaVar = (yza) obj6;
                Context context2 = (Context) obj5;
                vi3 vi3Var2 = (vi3) obj4;
                vi3 vi3Var3 = (vi3) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4411d(b16Var, 1.0f), ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38960i);
                    ec0 ec0Var = nj0.f52792K;
                    boolean zM22124i2 = tj3Var3.m22124i(yzaVar) | tj3Var3.m22124i(context2) | tj3Var3.m22120g(vi3Var2) | tj3Var3.m22120g(vi3Var3);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        C3445p2 c3445p2 = new C3445p2((Object) yzaVar, vi3Var2, (Object) vi3Var3, (Object) context2, 22);
                        tj3Var3.m22131l0(c3445p2);
                        objM22097O2 = c3445p2;
                    }
                    fa4.m11642c(e16VarM21607T, null, null, null, ec0Var, null, false, null, (vi3) objM22097O2, tj3Var3, 196608, 478);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 9:
                ((Integer) obj2).getClass();
                ebd.m11020e((tza) obj5, (List) obj4, (vi3) obj3, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 10:
                r0b r0bVar = (r0b) obj6;
                ui3 ui3Var2 = (ui3) obj5;
                ui3 ui3Var3 = (ui3) obj4;
                ui3 ui3Var4 = (ui3) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ge9.m12515a(tj3Var4).f38955d, ge9.m12515a(tj3Var4).f38954c);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var4).f38954c, true, new gm5(28)), nj0.f52789H, tj3Var4, 48);
                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var5);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c3);
                    omd.m18141c(ui3Var2, vz1.m23624c0(b16Var, "vocabulary:page_previous"), r0bVar.f58468d, null, null, xsc.f68671a, tj3Var4, 1572912, 56);
                    lw9.m16554b(r0bVar.f58467c, AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var3, vz1.m23624c0(b16Var, "vocabulary:page_selector"), 15), ge9.m12515a(tj3Var4).f38952a, ge9.m12515a(tj3Var4).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71407k, tj3Var4, 0, 0, 131068);
                    omd.m18141c(ui3Var4, vz1.m23624c0(b16Var, "vocabulary:page_next"), r0bVar.f58469e, null, null, xsc.f68672b, tj3Var4, 1572912, 56);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 11:
                n1b n1bVar = (n1b) obj6;
                t66 t66Var = (t66) obj5;
                vi3 vi3Var4 = (vi3) obj4;
                vi3 vi3Var5 = (vi3) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z = n1bVar.f52198h;
                    boolean z2 = !n1bVar.f52193c.f41644a.isEmpty();
                    boolean z3 = n1bVar.f52199i;
                    boolean zM11650l = fa4.m11650l(n1bVar.f52201k, gya.f41535a);
                    boolean zM22120g = tj3Var5.m22120g(t66Var);
                    Object objM22097O3 = tj3Var5.m22097O();
                    if (zM22120g || objM22097O3 == p84Var) {
                        objM22097O3 = new mya(4, t66Var);
                        tj3Var5.m22131l0(objM22097O3);
                    }
                    AbstractC2823a.m9743j(z, z2, z3, zM11650l, (ui3) objM22097O3, vi3Var4, vi3Var5, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2823a.m9735b((n1b) obj5, (vi3) obj4, (vi3) obj3, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 13:
                ((Integer) obj2).getClass();
                hbd.m13186a((h1b) obj5, (vi3) obj4, (ui3) obj3, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 14:
                hj0 hj0Var = (hj0) obj6;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj3;
                int iIntValue6 = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue6 == 21589) {
                    if (jLongValue < 1) {
                        v63.m23133k("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    byte b = hj0Var.readByte();
                    boolean z4 = (b & 1) == 1;
                    boolean z5 = (b & 2) == 2;
                    boolean z6 = (b & 4) == 4;
                    long j = z4 ? 5L : 1L;
                    if (z5) {
                        j += 4;
                    }
                    if (z6) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        v63.m23133k("bad zip: extended timestamp extra too short");
                        return null;
                    }
                    if (z4) {
                        ref$ObjectRef.f47718a = Integer.valueOf(hj0Var.mo465Q());
                    }
                    if (z5) {
                        ref$ObjectRef2.f47718a = Integer.valueOf(hj0Var.mo465Q());
                    }
                    if (z6) {
                        ref$ObjectRef3.f47718a = Integer.valueOf(hj0Var.mo465Q());
                    }
                }
                return xfaVar;
            default:
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) obj6;
                e18 e18Var = (e18) obj5;
                Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) obj4;
                Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) obj3;
                int iIntValue7 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue7 == 1) {
                    if (ref$ObjectRef4.f47718a != null) {
                        v63.m23133k("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        return null;
                    }
                    if (jLongValue2 != 24) {
                        v63.m23133k("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        return null;
                    }
                    ref$ObjectRef4.f47718a = Long.valueOf(e18Var.m10791n());
                    ref$ObjectRef5.f47718a = Long.valueOf(e18Var.m10791n());
                    ref$ObjectRef6.f47718a = Long.valueOf(e18Var.m10791n());
                }
                return xfaVar;
        }
    }

    public /* synthetic */ h39(Object obj, Object obj2, xi3 xi3Var, e16 e16Var, int i, int i2) {
        this.f41755a = i2;
        this.f41757c = obj;
        this.f41758d = obj2;
        this.f41759e = xi3Var;
        this.f41756b = e16Var;
    }

    public /* synthetic */ h39(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f41755a = i;
        this.f41756b = obj;
        this.f41757c = obj2;
        this.f41758d = obj3;
        this.f41759e = obj4;
    }

    public /* synthetic */ h39(Object obj, Object obj2, xi3 xi3Var, xi3 xi3Var2, int i, int i2) {
        this.f41755a = i2;
        this.f41756b = obj;
        this.f41757c = obj2;
        this.f41758d = xi3Var;
        this.f41759e = xi3Var2;
    }

    public /* synthetic */ h39(List list, ReaderFont readerFont, Pair pair, zi3 zi3Var, int i) {
        this.f41755a = 4;
        this.f41756b = list;
        this.f41757c = readerFont;
        this.f41759e = pair;
        this.f41758d = zi3Var;
    }
}
