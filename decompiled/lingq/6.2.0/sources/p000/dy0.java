package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.CoursePlaylistSort;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36413a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36415c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36416d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f36417e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f36418f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f36419g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f36420h;

    public /* synthetic */ dy0(tx0 tx0Var, String str, String str2, jv0 jv0Var, t66 t66Var, dh9 dh9Var, t66 t66Var2) {
        this.f36416d = tx0Var;
        this.f36417e = str;
        this.f36418f = str2;
        this.f36419g = jv0Var;
        this.f36414b = t66Var;
        this.f36420h = dh9Var;
        this.f36415c = t66Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f36413a;
        final int i2 = 0;
        xfa xfaVar = xfa.f68157a;
        int i3 = 2;
        int i4 = 3;
        Object obj2 = this.f36420h;
        Object obj3 = this.f36418f;
        Object obj4 = this.f36415c;
        Object obj5 = this.f36414b;
        Object obj6 = this.f36419g;
        Object obj7 = this.f36416d;
        Object obj8 = this.f36417e;
        final int i5 = 1;
        switch (i) {
            case 0:
                tx0 tx0Var = (tx0) obj7;
                jv0 jv0Var = (jv0) obj6;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                List list = tx0Var.f63040e;
                vu4.m23546i(vu4Var, list.size(), new s70(list, tx0Var), new C0282a(-629385481, true, new gy0(list, tx0Var, (String) obj8, (String) obj3, jv0Var, 0)), 4);
                vu4.m23545g(vu4Var, AbstractC3393o1.m17732g(tx0Var.f63041f, "_suggestions"), new C0282a(-495608978, true, new hn0(tx0Var, (t66) obj5, jv0Var, (dh9) obj2, (t66) obj4, 1)), 2);
                return xfaVar;
            case 1:
                wo1 wo1Var = (wo1) obj7;
                tb7 tb7Var = (tb7) obj6;
                vi3 vi3Var = (vi3) obj2;
                t66 t66Var = (t66) obj4;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4.m23545g(vu4Var2, "dropdown_period", new C0282a(1495301756, true, new ik0((t66) obj5, (CoursePlaylistSort) obj8, (vi3) obj3, 10)), 2);
                if (fa4.m11650l(wo1Var, to1.f62630a)) {
                    vu4.m23545g(vu4Var2, null, xob.f68462b, 3);
                    return xfaVar;
                }
                if (fa4.m11650l(wo1Var, uo1.f64126a)) {
                    vu4.m23545g(vu4Var2, null, xob.f68463c, 3);
                    return xfaVar;
                }
                if (!(wo1Var instanceof vo1)) {
                    gm5.m12750e();
                    return null;
                }
                vo1 vo1Var = (vo1) wo1Var;
                List list2 = vo1Var.f65700k;
                vu4Var2.m23547h(list2.size(), null, new C3520r2(6, list2), new C0282a(802480018, true, new ve0(1, vi3Var, list2, tb7Var)));
                if (!vo1Var.f65692c) {
                    return xfaVar;
                }
                vu4.m23545g(vu4Var2, null, new C0282a(-1717291369, true, new oo1(i2, t66Var)), 3);
                return xfaVar;
            case 2:
                final ko4 ko4Var = (ko4) obj7;
                final t66 t66Var2 = (t66) obj5;
                final vi3 vi3Var2 = (vi3) obj8;
                zi3 zi3Var = (zi3) obj3;
                final t66 t66Var3 = (t66) obj4;
                final vi3 vi3Var3 = (vi3) obj6;
                vi3 vi3Var4 = (vi3) obj2;
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                vu4.m23545g(vu4Var3, "dropdown_metric", new C0282a(-506310111, true, new aj3() { // from class: bo4
                    @Override // p000.aj3
                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                        int i6 = i2;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var5 = vi3Var2;
                        ko4 ko4Var2 = ko4Var;
                        t66 t66Var4 = t66Var2;
                        int i7 = 3;
                        switch (i6) {
                            case 0:
                                ye1 ye1Var = (ye1) obj10;
                                int iIntValue = ((Integer) obj11).intValue();
                                ((ft4) obj9).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                                    l77 l77VarM22132m = tj3Var.m22132m();
                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var = C0352b.f4299b;
                                    tj3Var.m22119f0();
                                    if (tj3Var.f62384S) {
                                        tj3Var.m22130l(ui3Var);
                                    } else {
                                        tj3Var.m22137o0();
                                    }
                                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                                    oha.m18000f(tj3Var, C0352b.f4305h);
                                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (objM22097O == p84Var) {
                                        objM22097O = new C3799yk(29, t66Var4);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    AbstractC0231g.m1153f(805306422, 508, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-1215945986, new co4(ko4Var2, 4), tj3Var), c99.m4430w(b16Var, null, 3), null, null, false);
                                    boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
                                    Object objM22097O2 = tj3Var.m22097O();
                                    if (objM22097O2 == p84Var) {
                                        objM22097O2 = new do4(0, t66Var4);
                                        tj3Var.m22131l0(objM22097O2);
                                    }
                                    AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O2, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1645392278, new po1(vi3Var5, t66Var4, 3), tj3Var), tj3Var, 48, 2044);
                                    tj3Var.m22139q(true);
                                }
                                break;
                            default:
                                ye1 ye1Var2 = (ye1) obj10;
                                int iIntValue2 = ((Integer) obj11).intValue();
                                ((ft4) obj9).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    e16 e16VarM4430w2 = c99.m4430w(b16Var, null, 3);
                                    ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4430w2);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var2 = C0352b.f4299b;
                                    tj3Var2.m22119f0();
                                    if (tj3Var2.f62384S) {
                                        tj3Var2.m22130l(ui3Var2);
                                    } else {
                                        tj3Var2.m22137o0();
                                    }
                                    oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d2);
                                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                    oha.m18000f(tj3Var2, C0352b.f4305h);
                                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                                    Object objM22097O3 = tj3Var2.m22097O();
                                    if (objM22097O3 == p84Var) {
                                        objM22097O3 = new C3799yk(27, t66Var4);
                                        tj3Var2.m22131l0(objM22097O3);
                                    }
                                    AbstractC0231g.m1153f(805306422, 508, null, tj3Var2, (ui3) objM22097O3, ci8.m4703P(-412798937, new co4(ko4Var2, i7), tj3Var2), c99.m4430w(b16Var, null, 3), null, null, false);
                                    boolean zBooleanValue2 = ((Boolean) t66Var4.getValue()).booleanValue();
                                    Object objM22097O4 = tj3Var2.m22097O();
                                    if (objM22097O4 == p84Var) {
                                        objM22097O4 = new C3799yk(28, t66Var4);
                                        tj3Var2.m22131l0(objM22097O4);
                                    }
                                    AbstractC3003fj.m11885a(zBooleanValue2, (ui3) objM22097O4, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(554203327, new po1(vi3Var5, t66Var4, 2), tj3Var2), tj3Var2, 48, 2044);
                                    tj3Var2.m22139q(true);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 2);
                boolean z = ko4Var instanceof jo4;
                if (z) {
                    vu4.m23545g(vu4Var3, null, new C0282a(1146546662, true, new C3180kd(24, ko4Var, zi3Var)), 3);
                } else {
                    vu4.m23545g(vu4Var3, null, jsb.f46085b, 3);
                }
                vu4.m23545g(vu4Var3, "dropdown_graph", new C0282a(-1352523126, true, new aj3() { // from class: bo4
                    @Override // p000.aj3
                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                        int i6 = i5;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var5 = vi3Var3;
                        ko4 ko4Var2 = ko4Var;
                        t66 t66Var4 = t66Var3;
                        int i7 = 3;
                        switch (i6) {
                            case 0:
                                ye1 ye1Var = (ye1) obj10;
                                int iIntValue = ((Integer) obj11).intValue();
                                ((ft4) obj9).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                                    l77 l77VarM22132m = tj3Var.m22132m();
                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var = C0352b.f4299b;
                                    tj3Var.m22119f0();
                                    if (tj3Var.f62384S) {
                                        tj3Var.m22130l(ui3Var);
                                    } else {
                                        tj3Var.m22137o0();
                                    }
                                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                                    oha.m18000f(tj3Var, C0352b.f4305h);
                                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (objM22097O == p84Var) {
                                        objM22097O = new C3799yk(29, t66Var4);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    AbstractC0231g.m1153f(805306422, 508, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-1215945986, new co4(ko4Var2, 4), tj3Var), c99.m4430w(b16Var, null, 3), null, null, false);
                                    boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
                                    Object objM22097O2 = tj3Var.m22097O();
                                    if (objM22097O2 == p84Var) {
                                        objM22097O2 = new do4(0, t66Var4);
                                        tj3Var.m22131l0(objM22097O2);
                                    }
                                    AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O2, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1645392278, new po1(vi3Var5, t66Var4, 3), tj3Var), tj3Var, 48, 2044);
                                    tj3Var.m22139q(true);
                                }
                                break;
                            default:
                                ye1 ye1Var2 = (ye1) obj10;
                                int iIntValue2 = ((Integer) obj11).intValue();
                                ((ft4) obj9).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    e16 e16VarM4430w2 = c99.m4430w(b16Var, null, 3);
                                    ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4430w2);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var2 = C0352b.f4299b;
                                    tj3Var2.m22119f0();
                                    if (tj3Var2.f62384S) {
                                        tj3Var2.m22130l(ui3Var2);
                                    } else {
                                        tj3Var2.m22137o0();
                                    }
                                    oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d2);
                                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                    oha.m18000f(tj3Var2, C0352b.f4305h);
                                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                                    Object objM22097O3 = tj3Var2.m22097O();
                                    if (objM22097O3 == p84Var) {
                                        objM22097O3 = new C3799yk(27, t66Var4);
                                        tj3Var2.m22131l0(objM22097O3);
                                    }
                                    AbstractC0231g.m1153f(805306422, 508, null, tj3Var2, (ui3) objM22097O3, ci8.m4703P(-412798937, new co4(ko4Var2, i7), tj3Var2), c99.m4430w(b16Var, null, 3), null, null, false);
                                    boolean zBooleanValue2 = ((Boolean) t66Var4.getValue()).booleanValue();
                                    Object objM22097O4 = tj3Var2.m22097O();
                                    if (objM22097O4 == p84Var) {
                                        objM22097O4 = new C3799yk(28, t66Var4);
                                        tj3Var2.m22131l0(objM22097O4);
                                    }
                                    AbstractC3003fj.m11885a(zBooleanValue2, (ui3) objM22097O4, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(554203327, new po1(vi3Var5, t66Var4, 2), tj3Var2), tj3Var2, 48, 2044);
                                    tj3Var2.m22139q(true);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 2);
                if (z) {
                    vu4.m23545g(vu4Var3, null, new C0282a(-2095063793, true, new co4(ko4Var, i2)), 3);
                    vu4.m23545g(vu4Var3, null, jsb.f46086c, 3);
                    vu4.m23545g(vu4Var3, null, new C0282a(643318487, true, new co4(ko4Var, i5)), 3);
                } else {
                    vu4.m23545g(vu4Var3, null, jsb.f46087d, 3);
                }
                List list3 = ko4Var.mo14050b().f10322c;
                vu4.m23546i(vu4Var3, list3.size(), new qy3(15), new C0282a(1552773688, true, new jk0(i4, list3, vi3Var4)), 4);
                return xfaVar;
            default:
                String str = (String) obj8;
                wia wiaVar = (wia) obj7;
                up6 up6Var = (up6) obj6;
                ArrayList arrayList = (ArrayList) obj4;
                String str2 = (String) obj3;
                vi3 vi3Var5 = (vi3) obj2;
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                vu4.m23545g(vu4Var4, null, new C0282a(82159439, true, new iq8((C3419on) obj5, 7)), 3);
                if (str != null) {
                    vu4.m23545g(vu4Var4, null, new C0282a(265008234, true, new iq0(str, 18)), 3);
                    if (wiaVar.f66880e.f65546e && up6Var != null) {
                        vu4.m23545g(vu4Var4, null, new C0282a(-2073797691, true, new qia(wiaVar, i3)), 3);
                    }
                    vu4.m23545g(vu4Var4, null, drc.f36124d, 3);
                }
                vu4.m23545g(vu4Var4, null, new C0282a(1876628806, true, new C3357n2((Object) arrayList, (Object) wiaVar, str2, vi3Var5, 20)), 3);
                vu4.m23545g(vu4Var4, null, drc.f36125e, 3);
                vu4.m23545g(vu4Var4, null, new C0282a(-2134352952, true, new iz4(28, str2, wiaVar)), 3);
                vu4.m23545g(vu4Var4, null, drc.f36126f, 3);
                vu4.m23545g(vu4Var4, null, drc.f36127g, 3);
                vu4.m23545g(vu4Var4, null, drc.f36128h, 3);
                vu4.m23545g(vu4Var4, null, drc.f36129i, 3);
                return xfaVar;
        }
    }

    public /* synthetic */ dy0(wo1 wo1Var, t66 t66Var, CoursePlaylistSort coursePlaylistSort, vi3 vi3Var, tb7 tb7Var, vi3 vi3Var2, t66 t66Var2) {
        this.f36416d = wo1Var;
        this.f36414b = t66Var;
        this.f36417e = coursePlaylistSort;
        this.f36418f = vi3Var;
        this.f36419g = tb7Var;
        this.f36420h = vi3Var2;
        this.f36415c = t66Var2;
    }

    public /* synthetic */ dy0(ko4 ko4Var, t66 t66Var, vi3 vi3Var, zi3 zi3Var, t66 t66Var2, vi3 vi3Var2, vi3 vi3Var3) {
        this.f36416d = ko4Var;
        this.f36414b = t66Var;
        this.f36417e = vi3Var;
        this.f36418f = zi3Var;
        this.f36415c = t66Var2;
        this.f36419g = vi3Var2;
        this.f36420h = vi3Var3;
    }

    public /* synthetic */ dy0(String str, wia wiaVar, up6 up6Var, C3419on c3419on, ArrayList arrayList, String str2, vi3 vi3Var) {
        this.f36417e = str;
        this.f36416d = wiaVar;
        this.f36419g = up6Var;
        this.f36414b = c3419on;
        this.f36415c = arrayList;
        this.f36418f = str2;
        this.f36420h = vi3Var;
    }
}
