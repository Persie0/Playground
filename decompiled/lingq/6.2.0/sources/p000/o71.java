package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.library.CollectionLoadingItemType;
import com.lingq.feature.imports.AbstractC2105b;
import com.lingq.feature.notifications.AbstractC2167a;
import com.lingq.feature.search.fastsearch.components.AbstractC2769a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o71 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f53924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f53925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f53926d;

    public /* synthetic */ o71(List list, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f53923a = i;
        this.f53924b = list;
        this.f53925c = vi3Var;
        this.f53926d = vi3Var2;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        tj3 tj3Var;
        String str;
        int i6 = this.f53923a;
        String strM23620a0 = null;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f53924b;
        vi3 vi3Var = this.f53925c;
        vi3 vi3Var2 = this.f53926d;
        int i7 = 1;
        switch (i6) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(i & 1, (i & 147) != 146)) {
                    n71 n71Var = (n71) list.get(iIntValue);
                    tj3Var2.m22111b0(-846634111);
                    if (n71Var instanceof g71) {
                        tj3Var2.m22111b0(-846710062);
                        v7d.m23159a(((g71) n71Var).f40308a, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (n71Var instanceof i71) {
                        tj3Var2.m22111b0(-846574716);
                        w7d.m23806a(((i71) n71Var).f43615a, vi3Var, vi3Var2, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (n71Var instanceof m71) {
                        tj3Var2.m22111b0(-846304551);
                        f8d.m11605a(((m71) n71Var).f50694a, vi3Var, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (n71Var instanceof k71) {
                        tj3Var2.m22111b0(-845995977);
                        k71 k71Var = (k71) n71Var;
                        h81 h81Var = k71Var.f46806a;
                        g81 g81Var = new g81(h81Var.f41930a, h81Var.f41931b, h81Var.f41933d, false);
                        boolean zM22120g = tj3Var2.m22120g(n71Var) | tj3Var2.m22120g(vi3Var2) | tj3Var2.m22120g(vi3Var);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new sb0(vi3Var2, k71Var, vi3Var, i7);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        d8d.m10161a(g81Var, (vi3) objM22097O, tj3Var2, 8);
                        tj3Var2.m22139q(false);
                    } else if (n71Var instanceof l71) {
                        tj3Var2.m22111b0(-842603554);
                        e8d.m10944c(CollectionLoadingItemType.Lesson, tj3Var2, 6);
                        tj3Var2.m22139q(false);
                    } else if (fa4.m11650l(n71Var, h71.f41856a)) {
                        tj3Var2.m22111b0(-842446818);
                        e8d.m10944c(CollectionLoadingItemType.Course, tj3Var2, 6);
                        tj3Var2.m22139q(false);
                    } else {
                        if (!fa4.m11650l(n71Var, j71.f45134a)) {
                            throw ux5.m23001x(tj3Var2, -165858110, false);
                        }
                        tj3Var2.m22111b0(-842305241);
                        b8d.m3487a(tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 1:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    e03 e03Var = (e03) list.get(iIntValue3);
                    tj3Var3.m22111b0(-211714610);
                    if (e03Var instanceof c03) {
                        tj3Var3.m22111b0(-211685998);
                        AbstractC2769a.m9683a((c03) e03Var, vi3Var, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else if (e03Var instanceof a03) {
                        tj3Var3.m22111b0(-211498882);
                        add.m288a((a03) e03Var, vi3Var, vi3Var2, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else if (e03Var instanceof yz2) {
                        tj3Var3.m22111b0(-211263189);
                        vcd.m23230a((yz2) e03Var, vi3Var2, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else if (e03Var instanceof d03) {
                        tj3Var3.m22111b0(-211067672);
                        ddd.m10304a((d03) e03Var, vi3Var2, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else if (e03Var instanceof zz2) {
                        tj3Var3.m22111b0(-210875658);
                        xcd.m24458a((zz2) e03Var, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else {
                        if (!(e03Var instanceof b03)) {
                            throw ux5.m23001x(tj3Var3, 685907157, false);
                        }
                        tj3Var3.m22111b0(-210756928);
                        bdd.m3655a(tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 2:
                ft4 ft4Var3 = (ft4) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (((tj3) ye1Var3).m22120g(ft4Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= ((tj3) ye1Var3).m22116e(iIntValue5) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (tj3Var4.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    om6 om6Var = (om6) list.get(iIntValue5);
                    tj3Var4.m22111b0(2080059779);
                    boolean zM22120g2 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22124i(om6Var) | tj3Var4.m22120g(vi3Var2);
                    Object objM22097O2 = tj3Var4.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new sb0(vi3Var, om6Var, vi3Var2, 3);
                        tj3Var4.m22131l0(objM22097O2);
                    }
                    AbstractC2167a.m9097a(null, om6Var, (vi3) objM22097O2, tj3Var4, 0);
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 3:
                ft4 ft4Var4 = (ft4) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ye1 ye1Var4 = (ye1) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (((tj3) ye1Var4).m22120g(ft4Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= ((tj3) ye1Var4).m22116e(iIntValue7) ? 32 : 16;
                }
                tj3 tj3Var5 = (tj3) ye1Var4;
                if (tj3Var5.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    yq8 yq8Var = (yq8) list.get(iIntValue7);
                    tj3Var5.m22111b0(-21838578);
                    int i8 = 5;
                    if (yq8Var instanceof tq8) {
                        tj3Var5.m22111b0(-21932106);
                        ArrayList arrayList = ((tq8) yq8Var).f62739a;
                        boolean zM22120g3 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O3 = tj3Var5.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new qo1(vi3Var, 5);
                            tj3Var5.m22131l0(objM22097O3);
                        }
                        i1d.m13630a(arrayList, (vi3) objM22097O3, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof xq8) {
                        tj3Var5.m22111b0(-21702675);
                        z0d.m25399a((xq8) yq8Var, vi3Var, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof sq8) {
                        tj3Var5.m22111b0(-21526130);
                        mzc.m17161a((sq8) yq8Var, vi3Var, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof uq8) {
                        tj3Var5.m22111b0(-21255624);
                        uq8 uq8Var = (uq8) yq8Var;
                        g81 g81Var2 = new g81(uq8Var.f64223a, uq8Var.f64224b, uq8Var.f64226d, true);
                        boolean zM22120g4 = tj3Var5.m22120g(yq8Var) | tj3Var5.m22120g(vi3Var2) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O4 = tj3Var5.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new sb0(vi3Var2, uq8Var, vi3Var, i8);
                            tj3Var5.m22131l0(objM22097O4);
                        }
                        d8d.m10161a(g81Var2, (vi3) objM22097O4, tj3Var5, 8);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof pq8) {
                        tj3Var5.m22111b0(-18135784);
                        czc.m9946b((pq8) yq8Var, vi3Var, vi3Var2, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof vq8) {
                        tj3Var5.m22111b0(-17890357);
                        String str2 = ((vq8) yq8Var).f65791a.f19447s;
                        yyc.m25385a(new mo8(str2 == null ? "" : str2, new gs8(str2 != null ? str2 : "")), vi3Var, vi3Var2, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof qq8) {
                        tj3Var5.m22111b0(-17418785);
                        LibraryItem libraryItem = ((qq8) yq8Var).f58085a;
                        String str3 = libraryItem.f19433e;
                        yyc.m25385a(new mo8(str3 != null ? str3 : "", new fs8(libraryItem.f19426a)), vi3Var, vi3Var2, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (yq8Var instanceof wq8) {
                        tj3Var5.m22111b0(-16963922);
                        u0d.m22381a(yq8Var, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else {
                        if (!fa4.m11650l(yq8Var, rq8.f59726a)) {
                            throw ux5.m23001x(tj3Var5, -693441131, false);
                        }
                        tj3Var5.m22111b0(-16856228);
                        ezc.m11404a(tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    }
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            default:
                ft4 ft4Var5 = (ft4) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ye1 ye1Var5 = (ye1) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (((tj3) ye1Var5).m22120g(ft4Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= ((tj3) ye1Var5).m22116e(iIntValue9) ? 32 : 16;
                }
                tj3 tj3Var6 = (tj3) ye1Var5;
                if (tj3Var6.m22099R(i5 & 1, (i5 & 147) != 146)) {
                    ila ilaVar = (ila) list.get(iIntValue9);
                    tj3Var6.m22111b0(1942119776);
                    if (ilaVar instanceof hla) {
                        tj3Var6.m22111b0(1942222106);
                        e16 e16VarM4409b = c99.m4409b(b16.f7762a, 0.0f, 40.0f, 1);
                        boolean zM22120g5 = tj3Var6.m22120g(vi3Var) | tj3Var6.m22120g(ilaVar) | tj3Var6.m22120g(vi3Var2);
                        Object objM22097O5 = tj3Var6.m22097O();
                        if (zM22120g5 || objM22097O5 == p84Var) {
                            objM22097O5 = new C3030g9(vi3Var, (hla) ilaVar, vi3Var2, 2);
                            tj3Var6.m22131l0(objM22097O5);
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O5, e16VarM4409b, 15);
                        sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var6.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var6, 48);
                        int iHashCode = Long.hashCode(tj3Var6.f62385T);
                        l77 l77VarM22132m = tj3Var6.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var6, e16VarM815b);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var6.m22119f0();
                        if (tj3Var6.f62384S) {
                            tj3Var6.m22130l(ui3Var);
                        } else {
                            tj3Var6.m22137o0();
                        }
                        oha.m18001g(tj3Var6, C0352b.f4303f, sj8VarM20003a);
                        oha.m18001g(tj3Var6, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var6, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var6, C0352b.f4305h);
                        as4 as4VarM10871c = e65.m10871c(tj3Var6, e16VarM1322c, C0352b.f4301d, 1.0f, true);
                        fv8 fv8Var = ((hla) ilaVar).f42587a;
                        if (vk9.m23391n0(fv8Var.f39759b)) {
                            tj3Var6.m22111b0(-1402328351);
                            Integer num = fv8Var.f39758a;
                            if (num == null) {
                                tj3Var6.m22111b0(-1402258199);
                            } else {
                                tj3Var6.m22111b0(-1402258198);
                                strM23620a0 = vz1.m23620a0(tj3Var6, num.intValue());
                            }
                            tj3Var6.m22139q(false);
                            str = strM23620a0 != null ? strM23620a0 : "";
                            tj3Var6.m22139q(false);
                        } else {
                            tj3Var6.m22111b0(-1402131315);
                            tj3Var6.m22139q(false);
                            str = fv8Var.f39759b;
                        }
                        lw9.m16554b(str, as4VarM10871c, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var6, 0, 0, 131068);
                        if (fv8Var.f39760c) {
                            tj3Var6.m22111b0(-1401819548);
                            ty3.m22351a(f7d.m11590a(), null, null, 0L, tj3Var6, 48, 12);
                            tj3Var = tj3Var6;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var = tj3Var6;
                            tj3Var.m22111b0(-1401573532);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var = tj3Var6;
                        if (!(ilaVar instanceof gla)) {
                            throw ux5.m23001x(tj3Var, -2015560957, false);
                        }
                        tj3Var.m22111b0(1944084338);
                        AbstractC2105b.m9005c(null, new ola(((gla) ilaVar).f40978a), vi3Var, tj3Var, 0);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(false);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
        }
    }
}
