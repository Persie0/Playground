package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t75 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f61935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f61936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f61937d;

    public /* synthetic */ t75(List list, String str, vi3 vi3Var, int i) {
        this.f61934a = i;
        this.f61935b = list;
        this.f61936c = str;
        this.f61937d = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0272  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        p84 p84Var;
        boolean zM22120g;
        Object objM22097O;
        int i = this.f61934a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        p84 p84Var2 = we1.f66679a;
        vi3 vi3Var = this.f61937d;
        String str = this.f61936c;
        List<s75> list = this.f61935b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    tj3Var.m22111b0(-1265251683);
                    for (s75 s75Var : list) {
                        String strM23620a0 = vz1.m23620a0(tj3Var, s75Var.f60465b);
                        int i2 = s75Var.f60466c;
                        boolean zM11650l = fa4.m11650l(str, s75Var.f60464a);
                        boolean zM22120g2 = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(s75Var);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var2) {
                            objM22097O2 = new a45(1, vi3Var, s75Var);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        sjd.m21437a(i2, 0, tj3Var, (ui3) objM22097O2, null, strM23620a0, zM11650l);
                    }
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(true);
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
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    tj3Var2.m22111b0(-560080887);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bm9 bm9Var = (bm9) it.next();
                        String strM23620a1 = vz1.m23620a0(tj3Var2, bm9Var.f8693b);
                        String strM23620a2 = vz1.m23620a0(tj3Var2, bm9Var.f8694c);
                        boolean zM11650l2 = fa4.m11650l(str, bm9Var.f8692a);
                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22120g(bm9Var);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var2) {
                            objM22097O3 = new a45(4, vi3Var, bm9Var);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        txb.m22340f(strM23620a1, strM23620a2, zM11650l2, (ui3) objM22097O3, null, bm9Var.f8695d, tj3Var2, 0);
                    }
                    tj3Var2.m22139q(false);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(ge9.f40637a)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var3, 0);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var3);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                    tj3Var3.m22111b0(-675953401);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        v36 v36Var = (v36) it2.next();
                        String strM23620a3 = vz1.m23620a0(tj3Var3, v36Var.f64791b);
                        boolean zM11650l3 = fa4.m11650l(str, v36Var.f64790a);
                        boolean zM22120g4 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22120g(v36Var);
                        Object objM22097O4 = tj3Var3.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var2) {
                            objM22097O4 = new a45(5, vi3Var, v36Var);
                            tj3Var3.m22131l0(objM22097O4);
                        }
                        txb.m22338d(0, tj3Var3, (ui3) objM22097O4, null, strM23620a3, v36Var.f64792c, zM11650l3);
                    }
                    tj3Var3.m22139q(false);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var4, 0);
                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var4);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c4);
                    tj3Var4.m22111b0(-15666711);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        pw6 pw6Var = (pw6) it3.next();
                        String strM23620a4 = vz1.m23620a0(tj3Var4, pw6Var.f56907b);
                        boolean zM11650l4 = fa4.m11650l(str, pw6Var.f56906a);
                        boolean zM22120g5 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22120g(pw6Var);
                        Object objM22097O5 = tj3Var4.m22097O();
                        if (zM22120g5 || objM22097O5 == p84Var2) {
                            objM22097O5 = new a45(12, vi3Var, pw6Var);
                            tj3Var4.m22131l0(objM22097O5);
                        }
                        txb.m22338d(0, tj3Var4, (ui3) objM22097O5, null, strM23620a4, pw6Var.f56908c, zM11650l4);
                    }
                    tj3Var4.m22139q(false);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            default:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e16 e16VarM4428u = c99.m4428u(b16Var, 0.0f, 400.0f, 1);
                    zf1 zf1Var = ge9.f40637a;
                    bb1 bb1VarM230a5 = ab1.m230a(new C3661uu(((fe9) tj3Var5.m22128k(zf1Var)).f38963l, true, new gm5(28)), nj0.f52791J, tj3Var5, 0);
                    int iHashCode5 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m5 = tj3Var5.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var5, e16VarM4428u);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var5);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var5, zi3Var, bb1VarM230a5);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m5);
                    Integer numValueOf = Integer.valueOf(iHashCode5);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var5, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var5, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c5);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var5.m22128k(zf1Var)).f38952a, true, new gm5(28));
                    fc0 fc0Var = nj0.f52817l;
                    sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var5, 0);
                    int iHashCode6 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m6 = tj3Var5.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var5, e16VarM4412e2);
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var5);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m6);
                    AbstractC3393o1.m17747v(iHashCode6, tj3Var5, zi3Var3, tj3Var5, vi3Var2);
                    oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c6);
                    String strM23620a5 = vz1.m23620a0(tj3Var5, ((jg1) list.get(0)).f45513b);
                    String str2 = ((jg1) list.get(0)).f45514c;
                    boolean zM11650l5 = fa4.m11650l(str, ((jg1) list.get(0)).f45512a);
                    boolean zM22120g6 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(list);
                    Object objM22097O6 = tj3Var5.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var2) {
                        objM22097O6 = new we9(0, vi3Var, list);
                        tj3Var5.m22131l0(objM22097O6);
                    }
                    vj8 vj8Var = vj8.f65508a;
                    txb.m22335a(0, tj3Var5, (ui3) objM22097O6, vj8Var.mo12420a(1.0f, b16Var, true), strM23620a5, str2, zM11650l5);
                    String strM23620a6 = vz1.m23620a0(tj3Var5, ((jg1) list.get(1)).f45513b);
                    String str3 = ((jg1) list.get(1)).f45514c;
                    boolean zM11650l6 = fa4.m11650l(str, ((jg1) list.get(1)).f45512a);
                    boolean zM22120g7 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(list);
                    Object objM22097O7 = tj3Var5.m22097O();
                    if (zM22120g7 || objM22097O7 == p84Var2) {
                        z = true;
                        objM22097O7 = new we9(1, vi3Var, list);
                        tj3Var5.m22131l0(objM22097O7);
                    } else {
                        z = true;
                    }
                    txb.m22335a(0, tj3Var5, (ui3) objM22097O7, vj8Var.mo12420a(1.0f, b16Var, z), strM23620a6, str3, zM11650l6);
                    tj3Var5.m22139q(z);
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var5.m22128k(zf1Var)).f38952a, z, new gm5(28)), fc0Var, tj3Var5, 0);
                    int iHashCode7 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m7 = tj3Var5.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var5, e16VarM4412e3);
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var5);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var5, zi3Var3, tj3Var5, vi3Var2);
                    oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c7);
                    String strM23620a7 = vz1.m23620a0(tj3Var5, ((jg1) list.get(2)).f45513b);
                    String str4 = ((jg1) list.get(2)).f45514c;
                    boolean zM11650l7 = fa4.m11650l(str, ((jg1) list.get(2)).f45512a);
                    boolean zM22120g8 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(list);
                    Object objM22097O8 = tj3Var5.m22097O();
                    if (!zM22120g8) {
                        p84Var = p84Var2;
                        if (objM22097O8 == p84Var) {
                        }
                        txb.m22335a(0, tj3Var5, (ui3) objM22097O8, vj8Var.mo12420a(1.0f, b16Var, true), strM23620a7, str4, zM11650l7);
                        String strM23620a8 = vz1.m23620a0(tj3Var5, ((jg1) list.get(3)).f45513b);
                        String str5 = ((jg1) list.get(3)).f45514c;
                        boolean zM11650l8 = fa4.m11650l(str, ((jg1) list.get(3)).f45512a);
                        zM22120g = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(list);
                        objM22097O = tj3Var5.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new we9(3, vi3Var, list);
                            tj3Var5.m22131l0(objM22097O);
                        }
                        txb.m22335a(0, tj3Var5, (ui3) objM22097O, vj8Var.mo12420a(1.0f, b16Var, true), strM23620a8, str5, zM11650l8);
                        tj3Var5.m22139q(true);
                        tj3Var5.m22139q(true);
                    } else {
                        p84Var = p84Var2;
                    }
                    objM22097O8 = new we9(2, vi3Var, list);
                    tj3Var5.m22131l0(objM22097O8);
                    txb.m22335a(0, tj3Var5, (ui3) objM22097O8, vj8Var.mo12420a(1.0f, b16Var, true), strM23620a7, str4, zM11650l7);
                    String strM23620a9 = vz1.m23620a0(tj3Var5, ((jg1) list.get(3)).f45513b);
                    String str6 = ((jg1) list.get(3)).f45514c;
                    boolean zM11650l9 = fa4.m11650l(str, ((jg1) list.get(3)).f45512a);
                    zM22120g = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(list);
                    objM22097O = tj3Var5.m22097O();
                    if (zM22120g) {
                        objM22097O = new we9(3, vi3Var, list);
                        tj3Var5.m22131l0(objM22097O);
                    } else {
                        objM22097O = new we9(3, vi3Var, list);
                        tj3Var5.m22131l0(objM22097O);
                    }
                    txb.m22335a(0, tj3Var5, (ui3) objM22097O, vj8Var.mo12420a(1.0f, b16Var, true), strM23620a9, str6, zM11650l9);
                    tj3Var5.m22139q(true);
                    tj3Var5.m22139q(true);
                } else {
                    tj3Var5.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
