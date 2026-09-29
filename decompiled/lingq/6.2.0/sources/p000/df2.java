package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0235i;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.language.AbstractC2119a;
import com.lingq.feature.vocabulary.filter.AbstractC2849a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class df2 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f35547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f35548c;

    public /* synthetic */ df2(int i, vi3 vi3Var, List list) {
        this.f35546a = i;
        this.f35547b = list;
        this.f35548c = vi3Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        String strM23620a0;
        int i8;
        Object obj6;
        int i9;
        boolean z9;
        boolean z10;
        String strM23620a1;
        boolean z11;
        int i10;
        int i11 = this.f35546a;
        b16 b16Var = b16.f7762a;
        int i12 = 7;
        int i13 = 8;
        xfa xfaVar = xfa.f68157a;
        List list = this.f35547b;
        vi3 vi3Var = this.f35548c;
        p84 p84Var = we1.f66679a;
        switch (i11) {
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
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
                    DictionaryData dictionaryData = (DictionaryData) list.get(iIntValue);
                    tj3Var.m22111b0(2111251684);
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(dictionaryData);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        obj5 = objM22097O;
                        bf2 bf2Var = new bf2(vi3Var, dictionaryData, 1);
                        tj3Var.m22131l0(bf2Var);
                        obj5 = bf2Var;
                    }
                    AbstractC2059d.m8966b(dictionaryData, (ui3) obj5, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22102U();
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
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    ym4 ym4Var = (ym4) list.get(iIntValue3);
                    tj3Var2.m22111b0(-318732045);
                    if (ym4Var instanceof xm4) {
                        tj3Var2.m22111b0(-318678633);
                        z = false;
                        AbstractC2119a.m9036a(((xm4) ym4Var).f68347a, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else {
                        if (!(ym4Var instanceof wm4)) {
                            throw ux5.m23001x(tj3Var2, -1118660336, false);
                        }
                        tj3Var2.m22111b0(-318474095);
                        wm4 wm4Var = (wm4) ym4Var;
                        LanguageToLearn languageToLearn = wm4Var.f67053a;
                        boolean zM22120g2 = tj3Var2.m22120g(ym4Var) | tj3Var2.m22120g(vi3Var);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new we0(vi3Var, wm4Var, 4);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        z = false;
                        AbstractC2119a.m9037b(languageToLearn, (ui3) objM22097O2, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(z);
                } else {
                    tj3Var2.m22102U();
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
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    kn6 kn6Var = (kn6) list.get(iIntValue5);
                    tj3Var3.m22111b0(577035082);
                    if (kn6Var instanceof jn6) {
                        tj3Var3.m22111b0(-1921046542);
                        z2 = false;
                        wsb.m24147b(new hn6(((jn6) kn6Var).f45869a), null, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else {
                        if (!(kn6Var instanceof in6)) {
                            throw ux5.m23001x(tj3Var3, -1921048615, false);
                        }
                        tj3Var3.m22111b0(-1921040666);
                        in6 in6Var = (in6) kn6Var;
                        gn6 gn6Var = new gn6(in6Var.f44308a.f19113a);
                        boolean zM22120g3 = tj3Var3.m22120g(kn6Var) | tj3Var3.m22120g(vi3Var);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new we0(vi3Var, in6Var, i12);
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        z2 = false;
                        wsb.m24146a(gn6Var, (ui3) objM22097O3, null, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    tj3Var3.m22139q(z2);
                } else {
                    tj3Var3.m22102U();
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
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    h29 h29Var = (h29) list.get(iIntValue7);
                    tj3Var4.m22111b0(-1199576481);
                    if (h29Var instanceof e29) {
                        tj3Var4.m22111b0(-454337410);
                        e29 e29Var = (e29) h29Var;
                        boolean zM22120g4 = tj3Var4.m22120g(h29Var) | tj3Var4.m22120g(vi3Var);
                        Object objM22097O4 = tj3Var4.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            z3 = false;
                            objM22097O4 = new mz7(vi3Var, e29Var, 0);
                            tj3Var4.m22131l0(objM22097O4);
                        } else {
                            z3 = false;
                        }
                        AbstractC1858a.m8604t(null, e29Var, (ui3) objM22097O4, tj3Var4, z3 ? 1 : 0);
                        tj3Var4.m22139q(z3);
                    } else {
                        z3 = false;
                        if (h29Var instanceof o19) {
                            tj3Var4.m22111b0(-454327296);
                            AbstractC1858a.m8594j(null, (o19) h29Var, tj3Var4, 0);
                            tj3Var4.m22139q(false);
                        } else if (h29Var instanceof z19) {
                            tj3Var4.m22111b0(-454324327);
                            z19 z19Var = (z19) h29Var;
                            boolean zM22120g5 = tj3Var4.m22120g(h29Var) | tj3Var4.m22120g(vi3Var);
                            Object objM22097O5 = tj3Var4.m22097O();
                            if (zM22120g5 || objM22097O5 == p84Var) {
                                z4 = false;
                                objM22097O5 = new nz7(vi3Var, z19Var, 0);
                                tj3Var4.m22131l0(objM22097O5);
                            } else {
                                z4 = false;
                            }
                            AbstractC1858a.m8600p(null, z19Var, (vi3) objM22097O5, tj3Var4, z4 ? 1 : 0);
                            tj3Var4.m22139q(z4);
                        } else if (h29Var instanceof a29) {
                            tj3Var4.m22111b0(-454317145);
                            a29 a29Var = (a29) h29Var;
                            boolean zM22120g6 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22120g(h29Var);
                            Object objM22097O6 = tj3Var4.m22097O();
                            if (zM22120g6 || objM22097O6 == p84Var) {
                                objM22097O6 = new oz7(vi3Var, a29Var, 0);
                                tj3Var4.m22131l0(objM22097O6);
                            }
                            ui3 ui3Var = (ui3) objM22097O6;
                            boolean zM22120g7 = tj3Var4.m22120g(h29Var) | tj3Var4.m22120g(vi3Var);
                            Object objM22097O7 = tj3Var4.m22097O();
                            if (zM22120g7 || objM22097O7 == p84Var) {
                                z4 = false;
                                objM22097O7 = new pz7(vi3Var, a29Var, 0);
                                tj3Var4.m22131l0(objM22097O7);
                            } else {
                                z4 = false;
                            }
                            AbstractC1858a.m8601q(null, a29Var, ui3Var, (vi3) objM22097O7, tj3Var4, 0);
                            tj3Var4.m22139q(z4);
                        } else if (h29Var instanceof x19) {
                            tj3Var4.m22111b0(-454304944);
                            x19 x19Var = (x19) h29Var;
                            boolean zM22120g8 = tj3Var4.m22120g(h29Var) | tj3Var4.m22120g(vi3Var);
                            Object objM22097O8 = tj3Var4.m22097O();
                            if (zM22120g8 || objM22097O8 == p84Var) {
                                z4 = false;
                                objM22097O8 = new qz7(vi3Var, x19Var, 0);
                                tj3Var4.m22131l0(objM22097O8);
                            } else {
                                z4 = false;
                            }
                            AbstractC1858a.m8599o(null, x19Var, (ui3) objM22097O8, tj3Var4, z4 ? 1 : 0);
                            tj3Var4.m22139q(z4);
                        } else if (h29Var instanceof b29) {
                            tj3Var4.m22111b0(-454298438);
                            b29 b29Var = (b29) h29Var;
                            boolean zM22120g9 = tj3Var4.m22120g(h29Var) | tj3Var4.m22120g(vi3Var);
                            Object objM22097O9 = tj3Var4.m22097O();
                            if (zM22120g9 || objM22097O9 == p84Var) {
                                objM22097O9 = new we0(vi3Var, b29Var, i13);
                                tj3Var4.m22131l0(objM22097O9);
                            }
                            AbstractC1858a.m8602r(null, b29Var, 0.0f, (ui3) objM22097O9, tj3Var4, 0);
                            z4 = false;
                            tj3Var4.m22139q(false);
                        } else {
                            z4 = false;
                            z4 = false;
                            if (h29Var instanceof q19) {
                                tj3Var4.m22111b0(-454291802);
                                AbstractC1858a.m8595k(null, tj3Var4, 0);
                                tj3Var4.m22139q(false);
                            } else {
                                tj3Var4.m22111b0(-1197614678);
                                tj3Var4.m22139q(false);
                            }
                        }
                        tj3Var4.m22139q(z4);
                    }
                    z4 = z3;
                    tj3Var4.m22139q(z4);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
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
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(i5 & 1, (i5 & 147) != 146)) {
                    String str = (String) list.get(iIntValue9);
                    tj3Var5.m22111b0(-772647346);
                    boolean zM22120g10 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(str);
                    Object objM22097O10 = tj3Var5.m22097O();
                    if (zM22120g10 || objM22097O10 == p84Var) {
                        objM22097O10 = new we0(vi3Var, str, 9);
                        tj3Var5.m22131l0(objM22097O10);
                    }
                    AbstractC0235i.m1159b((ui3) objM22097O10, ci8.m4703P(1218229323, new oc8(str, 0), tj3Var5), null, false, null, null, null, null, null, null, tj3Var5, 48);
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                ft4 ft4Var6 = (ft4) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                ye1 ye1Var6 = (ye1) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (((tj3) ye1Var6).m22120g(ft4Var6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= ((tj3) ye1Var6).m22116e(iIntValue11) ? 32 : 16;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(i6 & 1, (i6 & 147) != 146)) {
                    h29 h29Var2 = (h29) list.get(iIntValue11);
                    tj3Var6.m22111b0(-1849933952);
                    if (h29Var2 instanceof e29) {
                        tj3Var6.m22111b0(-198221219);
                        e29 e29Var2 = (e29) h29Var2;
                        boolean zM22120g11 = tj3Var6.m22120g(h29Var2) | tj3Var6.m22120g(vi3Var);
                        Object objM22097O11 = tj3Var6.m22097O();
                        if (zM22120g11 || objM22097O11 == p84Var) {
                            objM22097O11 = new mz7(vi3Var, e29Var2, 1);
                            tj3Var6.m22131l0(objM22097O11);
                        }
                        z5 = false;
                        AbstractC1858a.m8604t(null, e29Var2, (ui3) objM22097O11, tj3Var6, 0);
                        tj3Var6.m22139q(false);
                    } else {
                        z5 = false;
                        if (h29Var2 instanceof o19) {
                            tj3Var6.m22111b0(-198214241);
                            AbstractC1858a.m8594j(null, (o19) h29Var2, tj3Var6, 0);
                            tj3Var6.m22139q(false);
                        } else if (h29Var2 instanceof z19) {
                            tj3Var6.m22111b0(-198211272);
                            z19 z19Var2 = (z19) h29Var2;
                            boolean zM22120g12 = tj3Var6.m22120g(h29Var2) | tj3Var6.m22120g(vi3Var);
                            Object objM22097O12 = tj3Var6.m22097O();
                            if (zM22120g12 || objM22097O12 == p84Var) {
                                objM22097O12 = new nz7(vi3Var, z19Var2, 1);
                                tj3Var6.m22131l0(objM22097O12);
                            }
                            z6 = false;
                            AbstractC1858a.m8600p(null, z19Var2, (vi3) objM22097O12, tj3Var6, 0);
                            tj3Var6.m22139q(false);
                        } else if (h29Var2 instanceof a29) {
                            tj3Var6.m22111b0(-198204090);
                            a29 a29Var2 = (a29) h29Var2;
                            boolean zM22120g13 = tj3Var6.m22120g(vi3Var) | tj3Var6.m22120g(h29Var2);
                            Object objM22097O13 = tj3Var6.m22097O();
                            if (zM22120g13 || objM22097O13 == p84Var) {
                                objM22097O13 = new oz7(vi3Var, a29Var2, 1);
                                tj3Var6.m22131l0(objM22097O13);
                            }
                            ui3 ui3Var2 = (ui3) objM22097O13;
                            boolean zM22120g14 = tj3Var6.m22120g(h29Var2) | tj3Var6.m22120g(vi3Var);
                            Object objM22097O14 = tj3Var6.m22097O();
                            if (zM22120g14 || objM22097O14 == p84Var) {
                                objM22097O14 = new pz7(vi3Var, a29Var2, 1);
                                tj3Var6.m22131l0(objM22097O14);
                            }
                            AbstractC1858a.m8601q(null, a29Var2, ui3Var2, (vi3) objM22097O14, tj3Var6, 0);
                            z6 = false;
                            tj3Var6.m22139q(false);
                        } else if (h29Var2 instanceof x19) {
                            tj3Var6.m22111b0(-198191889);
                            x19 x19Var2 = (x19) h29Var2;
                            boolean zM22120g15 = tj3Var6.m22120g(h29Var2) | tj3Var6.m22120g(vi3Var);
                            Object objM22097O15 = tj3Var6.m22097O();
                            if (zM22120g15 || objM22097O15 == p84Var) {
                                objM22097O15 = new qz7(vi3Var, x19Var2, 1);
                                tj3Var6.m22131l0(objM22097O15);
                            }
                            z6 = false;
                            AbstractC1858a.m8599o(null, x19Var2, (ui3) objM22097O15, tj3Var6, 0);
                            tj3Var6.m22139q(false);
                        } else {
                            z6 = false;
                            if (h29Var2 instanceof q19) {
                                tj3Var6.m22111b0(-198185563);
                                AbstractC1858a.m8595k(null, tj3Var6, 0);
                                tj3Var6.m22139q(false);
                            } else {
                                tj3Var6.m22111b0(-1848740949);
                                tj3Var6.m22139q(false);
                            }
                        }
                        tj3Var6.m22139q(z6);
                    }
                    z6 = z5;
                    tj3Var6.m22139q(z6);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                ft4 ft4Var7 = (ft4) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                ye1 ye1Var7 = (ye1) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (((tj3) ye1Var7).m22120g(ft4Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= ((tj3) ye1Var7).m22116e(iIntValue13) ? 32 : 16;
                }
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(i7 & 1, (i7 & 147) != 146)) {
                    tj3Var7.m22102U();
                    return xfaVar;
                }
                zp8 zp8Var = (zp8) list.get(iIntValue13);
                tj3Var7.m22111b0(1646400579);
                if (zp8Var instanceof xp8) {
                    tj3Var7.m22111b0(1646433624);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    float f = ((fe9) tj3Var7.m22128k(zf1Var)).f38952a;
                    fc0 fc0Var = nj0.f52789H;
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(f, false, new gm5(29)), nj0.f52791J, tj3Var7, 0);
                    int iHashCode = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m = tj3Var7.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var7, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var3);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var7, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var7, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var7, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var7, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var7, zi3Var4, e16VarM1322c);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    boolean zM22120g16 = tj3Var7.m22120g(vi3Var) | tj3Var7.m22120g(zp8Var);
                    Object objM22097O16 = tj3Var7.m22097O();
                    if (zM22120g16 || objM22097O16 == p84Var) {
                        objM22097O16 = new we0(vi3Var, (xp8) zp8Var, 12);
                        tj3Var7.m22131l0(objM22097O16);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O16, e16VarM4412e2, 15);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var7.m22128k(zf1Var)).f38952a, true, new gm5(28)), fc0Var, tj3Var7, 48);
                    int iHashCode2 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m2 = tj3Var7.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var7, e16VarM815b);
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var3);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var7, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var7, zi3Var3, tj3Var7, vi3Var2);
                    as4 as4VarM10871c = e65.m10871c(tj3Var7, e16VarM1322c2, zi3Var4, 1.0f, true);
                    tj3Var7.m22111b0(-734018891);
                    ev8 ev8Var = ((xp8) zp8Var).f68500a;
                    String str2 = ev8Var.f37940b;
                    if (vk9.m23391n0(str2)) {
                        Integer num = ev8Var.f37939a;
                        if (num == null) {
                            tj3Var7.m22111b0(881019014);
                            z8 = false;
                            tj3Var7.m22139q(false);
                            strM23620a0 = null;
                        } else {
                            z8 = false;
                            tj3Var7.m22111b0(881019015);
                            strM23620a0 = vz1.m23620a0(tj3Var7, num.intValue());
                            tj3Var7.m22139q(false);
                        }
                        str2 = strM23620a0 == null ? "" : strM23620a0;
                    } else {
                        z8 = false;
                    }
                    String str3 = str2;
                    tj3Var7.m22139q(z8);
                    lw9.m16554b(str3, as4VarM10871c, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var7, 0, 0, 131068);
                    if (ev8Var.f37941c) {
                        tj3Var7.m22111b0(-1279277195);
                        ty3.m22351a(f7d.m11590a(), null, null, 0L, tj3Var7, 48, 12);
                        z7 = false;
                        tj3Var7.m22139q(false);
                    } else {
                        z7 = false;
                        tj3Var7.m22111b0(-1279070580);
                        tj3Var7.m22139q(false);
                    }
                    tj3Var7.m22139q(true);
                    pb1.m19031a(0.0f, 6, 6, 0L, tj3Var7, c99.m4412e(b16Var, 1.0f));
                    tj3Var7.m22139q(true);
                    tj3Var7.m22139q(z7);
                } else {
                    xfaVar = xfaVar;
                    if (zp8Var instanceof wp8) {
                        tj3Var7.m22111b0(1648355283);
                        wp8 wp8Var = (wp8) zp8Var;
                        fq8 fq8Var = new fq8(wp8Var.f67156a, wp8Var.f67157b);
                        boolean zM22120g17 = tj3Var7.m22120g(vi3Var);
                        Object objM22097O17 = tj3Var7.m22097O();
                        if (zM22120g17 || objM22097O17 == p84Var) {
                            objM22097O17 = new qo1(vi3Var, 4);
                            tj3Var7.m22131l0(objM22097O17);
                        }
                        z7 = false;
                        szc.m21802a(fq8Var, (vi3) objM22097O17, null, tj3Var7, 0);
                        tj3Var7.m22139q(false);
                    } else if (zp8Var instanceof vp8) {
                        tj3Var7.m22111b0(1648858103);
                        lw9.m16554b(vz1.m23620a0(tj3Var7, ((vp8) zp8Var).f65767a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var7, 0, 0, 131070);
                        z7 = false;
                        tj3Var7.m22139q(false);
                    } else {
                        if (!(zp8Var instanceof yp8)) {
                            throw ux5.m23001x(tj3Var7, 53109696, false);
                        }
                        tj3Var7.m22111b0(1649134065);
                        yp8 yp8Var = (yp8) zp8Var;
                        iv8 iv8Var = yp8Var.f70262a;
                        hq8 hq8Var = new hq8(iv8Var.f44680a, iv8Var.f44681b, iv8Var.f44684e, iv8Var.f44682c);
                        boolean zM22120g18 = tj3Var7.m22120g(zp8Var) | tj3Var7.m22120g(vi3Var);
                        Object objM22097O18 = tj3Var7.m22097O();
                        if (zM22120g18 || objM22097O18 == p84Var) {
                            objM22097O18 = new we0(vi3Var, yp8Var, 13);
                            tj3Var7.m22131l0(objM22097O18);
                        }
                        z7 = false;
                        d0d.m9965a(hq8Var, (ui3) objM22097O18, null, tj3Var7, 0);
                        tj3Var7.m22139q(false);
                    }
                }
                tj3Var7.m22139q(z7);
                return xfaVar;
            case 7:
                ft4 ft4Var8 = (ft4) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                ye1 ye1Var8 = (ye1) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (((tj3) ye1Var8).m22120g(ft4Var8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= ((tj3) ye1Var8).m22116e(iIntValue15) ? 32 : 16;
                }
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(i8 & 1, (i8 & 147) != 146)) {
                    dx8 dx8Var = (dx8) list.get(iIntValue15);
                    tj3Var8.m22111b0(832441297);
                    boolean zM22120g19 = tj3Var8.m22120g(vi3Var) | tj3Var8.m22124i(dx8Var);
                    Object objM22097O19 = tj3Var8.m22097O();
                    if (zM22120g19 || objM22097O19 == p84Var) {
                        obj6 = objM22097O19;
                        we0 we0Var = new we0(vi3Var, dx8Var, 16);
                        tj3Var8.m22131l0(we0Var);
                        obj6 = we0Var;
                    }
                    k2d.m14774a(dx8Var, (ui3) obj6, tj3Var8, 0);
                    pb1.m19031a(0.0f, 0, 7, 0L, tj3Var8, null);
                    tj3Var8.m22139q(false);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                ft4 ft4Var9 = (ft4) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                ye1 ye1Var9 = (ye1) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (((tj3) ye1Var9).m22120g(ft4Var9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= ((tj3) ye1Var9).m22116e(iIntValue17) ? 32 : 16;
                }
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(i9 & 1, (i9 & 147) != 146)) {
                    k1b k1bVar = (k1b) list.get(iIntValue17);
                    tj3Var9.m22111b0(1506445460);
                    if (k1bVar instanceof i1b) {
                        tj3Var9.m22111b0(1506513628);
                        zf1 zf1Var2 = ge9.f40637a;
                        float f2 = ((fe9) tj3Var9.m22128k(zf1Var2)).f38952a;
                        fc0 fc0Var2 = nj0.f52789H;
                        bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(f2, false, new gm5(29)), nj0.f52791J, tj3Var9, 0);
                        int iHashCode3 = Long.hashCode(tj3Var9.f62385T);
                        l77 l77VarM22132m3 = tj3Var9.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var9, b16Var);
                        se1.f60731q.getClass();
                        ui3 ui3Var4 = C0352b.f4299b;
                        tj3Var9.m22119f0();
                        if (tj3Var9.f62384S) {
                            tj3Var9.m22130l(ui3Var4);
                        } else {
                            tj3Var9.m22137o0();
                        }
                        zi3 zi3Var5 = C0352b.f4303f;
                        oha.m18001g(tj3Var9, zi3Var5, bb1VarM230a2);
                        zi3 zi3Var6 = C0352b.f4302e;
                        oha.m18001g(tj3Var9, zi3Var6, l77VarM22132m3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        zi3 zi3Var7 = C0352b.f4304g;
                        oha.m18001g(tj3Var9, zi3Var7, numValueOf2);
                        vi3 vi3Var3 = C0352b.f4305h;
                        oha.m18000f(tj3Var9, vi3Var3);
                        zi3 zi3Var8 = C0352b.f4301d;
                        oha.m18001g(tj3Var9, zi3Var8, e16VarM1322c3);
                        boolean zM22120g20 = tj3Var9.m22120g(vi3Var) | tj3Var9.m22120g(k1bVar);
                        Object objM22097O20 = tj3Var9.m22097O();
                        if (zM22120g20 || objM22097O20 == p84Var) {
                            z10 = false;
                            objM22097O20 = new fza(vi3Var, (i1b) k1bVar, 0);
                            tj3Var9.m22131l0(objM22097O20);
                        } else {
                            z10 = false;
                        }
                        e16 e16VarM815b2 = AbstractC0080f.m815b(null, z10, (ui3) objM22097O20, b16Var, 15);
                        sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var9.m22128k(zf1Var2)).f38952a, true, new gm5(28)), fc0Var2, tj3Var9, 48);
                        int iHashCode4 = Long.hashCode(tj3Var9.f62385T);
                        l77 l77VarM22132m4 = tj3Var9.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var9, e16VarM815b2);
                        tj3Var9.m22119f0();
                        if (tj3Var9.f62384S) {
                            tj3Var9.m22130l(ui3Var4);
                        } else {
                            tj3Var9.m22137o0();
                        }
                        oha.m18001g(tj3Var9, zi3Var5, sj8VarM20003a2);
                        oha.m18001g(tj3Var9, zi3Var6, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var9, zi3Var7, tj3Var9, vi3Var3);
                        as4 as4VarM10871c2 = e65.m10871c(tj3Var9, e16VarM1322c4, zi3Var8, 1.0f, true);
                        fv8 fv8Var = ((i1b) k1bVar).f43357a;
                        if (vk9.m23391n0(fv8Var.f39759b)) {
                            tj3Var9.m22111b0(-1942731939);
                            Integer num2 = fv8Var.f39758a;
                            if (num2 == null) {
                                tj3Var9.m22111b0(-1942658191);
                                z11 = false;
                                tj3Var9.m22139q(false);
                                strM23620a1 = null;
                            } else {
                                z11 = false;
                                tj3Var9.m22111b0(-1942658190);
                                strM23620a1 = vz1.m23620a0(tj3Var9, num2.intValue());
                                tj3Var9.m22139q(false);
                            }
                            if (strM23620a1 == null) {
                                strM23620a1 = "";
                            }
                            tj3Var9.m22139q(z11);
                        } else {
                            tj3Var9.m22111b0(-1942523123);
                            tj3Var9.m22139q(false);
                            strM23620a1 = fv8Var.f39759b;
                        }
                        lw9.m16554b(strM23620a1, as4VarM10871c2, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var9, 0, 0, 131068);
                        if (fv8Var.f39760c) {
                            tj3Var9.m22111b0(-1942191144);
                            ty3.m22351a(f7d.m11590a(), null, null, 0L, tj3Var9, 48, 12);
                            z9 = false;
                            tj3Var9.m22139q(false);
                        } else {
                            z9 = false;
                            tj3Var9.m22111b0(-1941925908);
                            tj3Var9.m22139q(false);
                        }
                        tj3Var9.m22139q(true);
                        pb1.m19031a(0.0f, 0, 7, 0L, tj3Var9, null);
                        tj3Var9.m22139q(true);
                        tj3Var9.m22139q(z9);
                    } else {
                        if (!(k1bVar instanceof j1b)) {
                            throw ux5.m23001x(tj3Var9, 325689679, false);
                        }
                        tj3Var9.m22111b0(1508677180);
                        l1b l1bVar = new l1b(((j1b) k1bVar).f44914a);
                        boolean zM22120g21 = tj3Var9.m22120g(vi3Var);
                        Object objM22097O21 = tj3Var9.m22097O();
                        if (zM22120g21 || objM22097O21 == p84Var) {
                            objM22097O21 = new qo1(vi3Var, 6);
                            tj3Var9.m22131l0(objM22097O21);
                        }
                        z9 = false;
                        AbstractC2849a.m9755a(l1bVar, (vi3) objM22097O21, null, tj3Var9, 0);
                        tj3Var9.m22139q(false);
                    }
                    tj3Var9.m22139q(z9);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            default:
                ft4 ft4Var10 = (ft4) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                ye1 ye1Var10 = (ye1) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (((tj3) ye1Var10).m22120g(ft4Var10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= ((tj3) ye1Var10).m22116e(iIntValue19) ? 32 : 16;
                }
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(i10 & 1, (i10 & 147) != 146)) {
                    k1b k1bVar2 = (k1b) list.get(iIntValue19);
                    tj3Var10.m22111b0(22240219);
                    if (k1bVar2 instanceof i1b) {
                        tj3Var10.m22111b0(1801834636);
                        i1b i1bVar = (i1b) k1bVar2;
                        fv8 fv8Var2 = i1bVar.f43357a;
                        boolean zM22120g22 = tj3Var10.m22120g(k1bVar2) | tj3Var10.m22120g(vi3Var);
                        Object objM22097O22 = tj3Var10.m22097O();
                        if (zM22120g22 || objM22097O22 == p84Var) {
                            objM22097O22 = new fza(vi3Var, i1bVar, 1);
                            tj3Var10.m22131l0(objM22097O22);
                        }
                        ebd.m11016a(fv8Var2, (ui3) objM22097O22, tj3Var10, 8);
                        tj3Var10.m22139q(false);
                    } else {
                        if (!(k1bVar2 instanceof j1b)) {
                            throw ux5.m23001x(tj3Var10, 1801832744, false);
                        }
                        tj3Var10.m22111b0(1801849311);
                        String str4 = ((j1b) k1bVar2).f44914a;
                        boolean zM22120g23 = tj3Var10.m22120g(vi3Var);
                        Object objM22097O23 = tj3Var10.m22097O();
                        if (zM22120g23 || objM22097O23 == p84Var) {
                            objM22097O23 = new qo1(vi3Var, 7);
                            tj3Var10.m22131l0(objM22097O23);
                        }
                        ebd.m11017b(str4, (vi3) objM22097O23, tj3Var10, 0);
                        tj3Var10.m22139q(false);
                    }
                    tj3Var10.m22139q(false);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
        }
    }
}
