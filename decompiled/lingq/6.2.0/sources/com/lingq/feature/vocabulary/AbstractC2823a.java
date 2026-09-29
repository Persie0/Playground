package com.lingq.feature.vocabulary;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.vocabulary.C2824b;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3003fj;
import p000.AbstractC3584sr;
import p000.C3065h7;
import p000.C3357n2;
import p000.C3386nv;
import p000.a05;
import p000.aj3;
import p000.atc;
import p000.aya;
import p000.b16;
import p000.b1b;
import p000.b34;
import p000.bia;
import p000.br8;
import p000.bya;
import p000.c3a;
import p000.c99;
import p000.ci0;
import p000.ci8;
import p000.cw0;
import p000.cya;
import p000.d32;
import p000.dn7;
import p000.dua;
import p000.dya;
import p000.e16;
import p000.e5a;
import p000.ebd;
import p000.eh0;
import p000.eya;
import p000.f5a;
import p000.fa4;
import p000.fe9;
import p000.fya;
import p000.g39;
import p000.gbd;
import p000.gca;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.gya;
import p000.h39;
import p000.hf6;
import p000.hp5;
import p000.hsa;
import p000.ht5;
import p000.i0b;
import p000.j0b;
import p000.jya;
import p000.k0b;
import p000.ka6;
import p000.kxa;
import p000.kya;
import p000.l0b;
import p000.l77;
import p000.la6;
import p000.lda;
import p000.lp7;
import p000.lxa;
import p000.m0b;
import p000.mbd;
import p000.mya;
import p000.n0b;
import p000.n1b;
import p000.nj0;
import p000.nya;
import p000.o0b;
import p000.og8;
import p000.oha;
import p000.or1;
import p000.p0b;
import p000.p84;
import p000.pfa;
import p000.pv7;
import p000.q2d;
import p000.qh0;
import p000.qk9;
import p000.qz5;
import p000.r0b;
import p000.rza;
import p000.se1;
import p000.si5;
import p000.t66;
import p000.tj3;
import p000.tza;
import p000.u91;
import p000.ui3;
import p000.ux5;
import p000.v29;
import p000.ve2;
import p000.vi3;
import p000.vz1;
import p000.w41;
import p000.we1;
import p000.wxa;
import p000.x18;
import p000.xi3;
import p000.xwc;
import p000.xxa;
import p000.xy0;
import p000.y0b;
import p000.y38;
import p000.ye1;
import p000.yxa;
import p000.z0b;
import p000.zf1;
import p000.zi3;
import p000.zxa;
import p000.zy0;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2823a {
    /* JADX INFO: renamed from: a */
    public static final void m9734a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(593343074);
        int i2 = i | (tj3Var2.m22124i(ui3Var) ? 4 : 2);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var2, ci8.m4703P(977166506, new v29(9, ui3Var), tj3Var2), null, ci8.m4703P(29114540, new v29(7, ui3Var2), tj3Var2), null, atc.f7496q, atc.f7497r, null, 0L, 0L, 0L, 0L, null, tj3Var, 1772598, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX INFO: renamed from: b */
    public static final void m9735b(n1b n1bVar, vi3 vi3Var, vi3 vi3Var2, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        b16 b16Var;
        boolean z;
        p84 p84Var;
        boolean z2;
        Object objM22097O;
        boolean z3;
        boolean zM22124i;
        Object objM22097O2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-213260735);
        int i2 = i | (tj3Var2.m22124i(n1bVar) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var2) ? 256 : 128) | (tj3Var2.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            boolean z4 = n1bVar.f52196f;
            int i3 = i2 & 112;
            boolean z5 = i3 == 32;
            Object objM22097O3 = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (z5 || objM22097O3 == p84Var2) {
                objM22097O3 = new hsa(vi3Var, 10);
                tj3Var2.m22131l0(objM22097O3);
            }
            b16 b16Var2 = b16.f7762a;
            tj3Var = tj3Var2;
            lp7.m16424b(z4, (ui3) objM22097O3, c99.m4411d(b16Var2, 1.0f), null, null, null, false, 0.0f, ci8.m4703P(801469859, new a05(n1bVar, vi3Var2, vi3Var, 24), tj3Var2), tj3Var, 100663680, 248);
            int i4 = n1bVar.f52194d.f58466b;
            ci0 ci0Var = ci0.f10109a;
            if (i4 > 1) {
                tj3Var.m22111b0(1690556813);
                b16Var = b16Var2;
                e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, nj0.f52814i);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarMo3727a, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 6);
                r0b r0bVar = n1bVar.f52194d;
                boolean z6 = i3 == 32;
                Object objM22097O4 = tj3Var.m22097O();
                if (z6) {
                    p84Var = p84Var2;
                } else {
                    p84Var = p84Var2;
                    if (objM22097O4 == p84Var) {
                    }
                    ui3 ui3Var2 = (ui3) objM22097O4;
                    if (i3 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (z2 || objM22097O == p84Var) {
                        objM22097O = new hsa(vi3Var, 12);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O;
                    if ((i2 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zM22124i = z3 | tj3Var.m22124i(n1bVar);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22124i || objM22097O2 == p84Var) {
                        objM22097O2 = new z0b(vi3Var2, n1bVar);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    gbd.m12467a(r0bVar, ui3Var2, ui3Var3, (ui3) objM22097O2, e16VarM21611X, tj3Var, 0);
                    z = false;
                    tj3Var.m22139q(false);
                }
                objM22097O4 = new hsa(vi3Var, 11);
                tj3Var.m22131l0(objM22097O4);
                ui3 ui3Var4 = (ui3) objM22097O4;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM22097O = tj3Var.m22097O();
                if (z2) {
                    objM22097O = new hsa(vi3Var, 12);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new hsa(vi3Var, 12);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3 ui3Var5 = (ui3) objM22097O;
                if ((i2 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zM22124i = z3 | tj3Var.m22124i(n1bVar);
                objM22097O2 = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O2 = new z0b(vi3Var2, n1bVar);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new z0b(vi3Var2, n1bVar);
                    tj3Var.m22131l0(objM22097O2);
                }
                gbd.m12467a(r0bVar, ui3Var4, ui3Var5, (ui3) objM22097O2, e16VarM21611X, tj3Var, 0);
                z = false;
                tj3Var.m22139q(false);
            } else {
                b16Var = b16Var2;
                z = false;
                tj3Var.m22111b0(1691410491);
                tj3Var.m22139q(false);
            }
            if (n1bVar.f52197g || fa4.m11650l(n1bVar.f52201k, gya.f41535a)) {
                tj3Var.m22111b0(1691509598);
                dn7.m10492a(ci0Var.mo3727a(b16Var, nj0.f52812g), 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 62);
                tj3Var = tj3Var;
                tj3Var.m22139q(z);
            } else {
                tj3Var.m22111b0(1691629723);
                tj3Var.m22139q(z);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(n1bVar, vi3Var, vi3Var2, e16Var, i, 12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9736c(kya kyaVar, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        String strM23620a0;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-782693886);
        int i2 = i | (tj3Var.m22120g(kyaVar) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.vocabulary_export);
            String strM23620a2 = vz1.m23620a0(tj3Var, R$string.export_error);
            String str = null;
            jya jyaVar = kyaVar instanceof jya ? (jya) kyaVar : null;
            if (jyaVar == null) {
                tj3Var.m22111b0(144337443);
                tj3Var.m22139q(false);
            } else {
                fya fyaVar = jyaVar.f46411a;
                tj3Var.m22111b0(144337444);
                if (fyaVar.equals(wxa.f67489a)) {
                    tj3Var.m22111b0(102956292);
                    tj3Var.m22139q(false);
                    str = strM23620a2;
                } else {
                    if (fyaVar.equals(cya.f34714a)) {
                        tj3Var.m22111b0(102958525);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.export_csv_message);
                        tj3Var.m22139q(false);
                    } else if (fyaVar.equals(bya.f9183a)) {
                        tj3Var.m22111b0(102961566);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.export_anki_message);
                        tj3Var.m22139q(false);
                    } else if (fyaVar instanceof dya) {
                        tj3Var.m22111b0(-1103043118);
                        dya dyaVar = (dya) fyaVar;
                        int i3 = dyaVar.f36428a;
                        int i4 = dyaVar.f36429b;
                        if (i4 == 0) {
                            tj3Var.m22111b0(-1103005825);
                            strM23620a0 = vz1.m23618Z(R$string.skritter_export_success, new Object[]{Integer.valueOf(i3)}, tj3Var);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(-1102822522);
                            strM23620a0 = vz1.m23618Z(R$string.skritter_export_success_with_skipped, new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, tj3Var);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(false);
                    } else if (fyaVar.equals(xxa.f68930a)) {
                        tj3Var.m22111b0(-1102516769);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.skritter_export_no_terms);
                        tj3Var.m22139q(false);
                    } else if (fyaVar.equals(aya.f7674a)) {
                        tj3Var.m22111b0(-1102374975);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.skritter_not_connected);
                        tj3Var.m22139q(false);
                    } else if (fyaVar.equals(yxa.f70622a)) {
                        tj3Var.m22111b0(-1102236126);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.skritter_auth_expired);
                        tj3Var.m22139q(false);
                    } else if (fyaVar.equals(eya.f38088a)) {
                        tj3Var.m22111b0(-1102096967);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.skritter_export_too_many_terms);
                        tj3Var.m22139q(false);
                    } else {
                        if (!fyaVar.equals(zxa.f72361a)) {
                            throw ux5.m23001x(tj3Var, 102955729, false);
                        }
                        tj3Var.m22111b0(-1101949438);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.skritter_export_error);
                        tj3Var.m22139q(false);
                    }
                    str = strM23620a0;
                }
                tj3Var.m22139q(false);
            }
            Object[] objArr = {kyaVar, strM23620a1, strM23620a2, str};
            boolean zM22124i = ((i2 & 14) == 4) | tj3Var.m22124i(context) | tj3Var.m22120g(strM23620a1) | tj3Var.m22120g(strM23620a2) | ((i2 & 112) == 32) | tj3Var.m22120g(str) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                VocabularyScreenKt$VocabularyExportEffect$1$1 vocabularyScreenKt$VocabularyExportEffect$1$1 = new VocabularyScreenKt$VocabularyExportEffect$1$1(kyaVar, context, strM23620a1, strM23620a2, ui3Var, str, ui3Var2, null);
                tj3Var.m22131l0(vocabularyScreenKt$VocabularyExportEffect$1$1);
                objM22097O = vocabularyScreenKt$VocabularyExportEffect$1$1;
            }
            d32.m10053n(objArr, (zi3) objM22097O, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39((Object) kyaVar, (Object) ui3Var, (xi3) ui3Var2, i, 21);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9737d(boolean z, final boolean z2, final boolean z3, final boolean z4, ui3 ui3Var, final vi3 vi3Var, final vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-575749901);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22122h(z2) ? 32 : 16) | (tj3Var.m22122h(z3) ? 256 : 128) | (tj3Var.m22122h(z4) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            AbstractC3003fj.m11885a(z, ui3Var, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(-1860145832, new aj3() { // from class: c1b
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        vi3 vi3Var3 = vi3Var2;
                        boolean zM22120g = tj3Var2.m22120g(vi3Var3);
                        Object objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new hsa(vi3Var3, 15);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        AbstractC3003fj.m11886b(atc.f7485f, (ui3) objM22097O, null, null, null, false, null, null, tj3Var2, 6, 508);
                        boolean z5 = z2;
                        boolean z6 = z4;
                        boolean z7 = z5 && !z6;
                        vi3 vi3Var4 = vi3Var;
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var4);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new hsa(vi3Var4, 16);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        AbstractC3003fj.m11886b(atc.f7486g, (ui3) objM22097O2, null, null, null, z7, null, null, tj3Var2, 6, 476);
                        boolean z8 = !z6;
                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var4);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new hsa(vi3Var4, 17);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        AbstractC3003fj.m11886b(atc.f7487h, (ui3) objM22097O3, null, null, null, z8, null, null, tj3Var2, 6, 476);
                        boolean z9 = z5 && !z6;
                        boolean zM22120g4 = tj3Var2.m22120g(vi3Var4);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new hsa(vi3Var4, 18);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        AbstractC3003fj.m11886b(atc.f7488i, (ui3) objM22097O4, null, null, null, z9, null, null, tj3Var2, 6, 476);
                        boolean zM22120g5 = tj3Var2.m22120g(vi3Var4);
                        Object objM22097O5 = tj3Var2.m22097O();
                        if (zM22120g5 || objM22097O5 == p84Var) {
                            objM22097O5 = new hsa(vi3Var4, 19);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        AbstractC3003fj.m11886b(atc.f7489j, (ui3) objM22097O5, null, null, null, z8, null, null, tj3Var2, 6, 476);
                        if (z3) {
                            tj3Var2.m22111b0(-1934967739);
                            boolean z10 = z5 && !z6;
                            boolean zM22120g6 = tj3Var2.m22120g(vi3Var4);
                            Object objM22097O6 = tj3Var2.m22097O();
                            if (zM22120g6 || objM22097O6 == p84Var) {
                                objM22097O6 = new hsa(vi3Var4, 20);
                                tj3Var2.m22131l0(objM22097O6);
                            }
                            AbstractC3003fj.m11886b(atc.f7490k, (ui3) objM22097O6, null, null, null, z10, null, null, tj3Var2, 6, 476);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-1934676246);
                            tj3Var2.m22139q(false);
                        }
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i2 & 14) | 48, 2044);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b1b(z, z2, z3, z4, ui3Var, vi3Var, vi3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9738e(r0b r0bVar, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(566604491);
        int i2 = i | (tj3Var2.m22120g(r0bVar) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 8;
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, atc.f7491l, null, ci8.m4703P(-1642796095, new v29(i3, ui3Var), tj3Var2), null, atc.f7493n, ci8.m4703P(1735267614, new nya(i3, r0bVar, vi3Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772598, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(r0bVar, ui3Var, vi3Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9739f(w41 w41Var, og8 og8Var, bia biaVar, C2824b c2824b, C1909e c1909e, ye1 ye1Var, int i) {
        C2824b c2824b2;
        C1909e c1909e2;
        C1909e c1909e3;
        final C2824b c2824b3;
        t66 t66Var;
        Boolean bool;
        Context context;
        Continuation continuation;
        t66 t66Var2;
        og8 og8Var2;
        C1909e c1909e4;
        t66 t66Var3;
        t66 t66Var4;
        C1909e c1909e5;
        Object vocabularyScreenKt$VocabularyRoute$9$2$1;
        C1909e c1909e6;
        final t66 t66Var5;
        C1909e c1909e7;
        w41 w41Var2 = w41Var;
        w41Var2.getClass();
        og8Var.getClass();
        biaVar.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1149546941);
        int i2 = i | (tj3Var.m22124i(w41Var2) ? 4 : 2) | (tj3Var.m22124i(og8Var) ? 32 : 16) | (tj3Var.m22124i(biaVar) ? 256 : 128) | 9216;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C2824b c2824b4 = (C2824b) pfa.m19114d(y38.m24933a(C2824b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c1909e3 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
                    c2824b3 = c2824b4;
                }
            } else {
                tj3Var.m22102U();
                c2824b3 = c2824b;
                c1909e3 = c1909e;
            }
            tj3Var.m22140r();
            Context context2 = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var.m22120g(context2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                Context baseContext = context2;
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            objM22097O = null;
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            baseContext.getClass();
                        }
                    } else {
                        objM22097O = (Activity) baseContext;
                        break;
                    }
                }
                tj3Var.m22131l0(objM22097O);
            }
            Activity activity = (Activity) objM22097O;
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2824b3.f33531i, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2824b3.f33532j, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2824b3.f33533k, tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2824b3.f33525c.mo8249k(), tj3Var);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var6 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(null);
                tj3Var.m22131l0(objM22097O3);
            }
            final t66 t66Var7 = (t66) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66Var8 = (t66) objM22097O4;
            C3065h7 c3065h7 = new C3065h7();
            boolean zM22124i = tj3Var.m22124i(c2824b3);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i || objM22097O5 == p84Var) {
                final int i3 = 0;
                objM22097O5 = new vi3() { // from class: x0b
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        xfa xfaVar = xfa.f68157a;
                        t66 t66Var9 = t66Var7;
                        C2824b c2824b5 = c2824b3;
                        switch (i4) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                vwa vwaVar = (vwa) t66Var9.getValue();
                                t66Var9.setValue(null);
                                if (zBooleanValue && vwaVar != null) {
                                    c2824b5.m9744V2(new twa(vwaVar.f66033a, vwaVar.f66034b));
                                }
                                break;
                            default:
                                qza qzaVar = (qza) obj;
                                qzaVar.getClass();
                                if (qzaVar instanceof jza) {
                                    t66Var9.setValue(Boolean.FALSE);
                                }
                                c2824b5.f33527e.m9764c(qzaVar);
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            }
            hp5 hp5VarM16109I = lda.m16109I(c3065h7, (vi3) objM22097O5, tj3Var);
            lxa lxaVar = ((n1b) t66VarM2513c.getValue()).f52200j;
            boolean zM22120g2 = tj3Var.m22120g(t66VarM2513c) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(c2824b3);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O6 == p84Var) {
                objM22097O6 = new VocabularyScreenKt$VocabularyRoute$1$1(c2824b3, t66VarM2513c, c1909e3, null);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O6, lxaVar);
            kya kyaVar = ((n1b) t66VarM2513c.getValue()).f52201k;
            boolean zM22124i2 = tj3Var.m22124i(c2824b3);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O7 == p84Var) {
                objM22097O7 = new br8(c2824b3, 16);
                tj3Var.m22131l0(objM22097O7);
            }
            ui3 ui3Var = (ui3) objM22097O7;
            boolean zM22124i3 = tj3Var.m22124i(c1909e3) | tj3Var.m22124i(c2824b3) | tj3Var.m22124i(w41Var2) | tj3Var.m22124i(context2) | tj3Var.m22124i(og8Var) | tj3Var.m22124i(biaVar);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O8 == p84Var) {
                t66Var = t66Var6;
                objM22097O8 = new pv7(w41Var2, context2, og8Var, biaVar, c1909e3, c2824b3, t66Var);
                tj3Var.m22131l0(objM22097O8);
            } else {
                t66Var = t66Var6;
            }
            t66 t66Var9 = t66Var;
            m9736c(kyaVar, ui3Var, (ui3) objM22097O8, tj3Var, 0);
            Boolean boolValueOf = Boolean.valueOf(((n1b) r17.getValue()).f52195e.f66191d);
            boolean zM22120g3 = tj3Var.m22120g(r17) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(c2824b3) | tj3Var.m22124i(w41Var2) | tj3Var.m22124i(context2) | tj3Var.m22124i(og8Var) | tj3Var.m22124i(biaVar);
            Object objM22097O9 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O9 == p84Var) {
                bool = boolValueOf;
                C1909e c1909e8 = c1909e3;
                C2824b c2824b5 = c2824b3;
                context = context2;
                continuation = null;
                VocabularyScreenKt$VocabularyRoute$4$1 vocabularyScreenKt$VocabularyRoute$4$1 = new VocabularyScreenKt$VocabularyRoute$4$1(c2824b5, r17, w41Var2, context, og8Var, biaVar, c1909e8, t66Var9, null);
                c2824b3 = c2824b5;
                t66Var2 = r17;
                w41Var2 = w41Var2;
                og8Var2 = og8Var;
                c1909e4 = c1909e8;
                t66Var3 = t66Var9;
                tj3Var.m22131l0(vocabularyScreenKt$VocabularyRoute$4$1);
                objM22097O9 = vocabularyScreenKt$VocabularyRoute$4$1;
            } else {
                context = context2;
                og8Var2 = og8Var;
                c1909e4 = c1909e3;
                t66Var3 = t66Var9;
                bool = boolValueOf;
                t66Var2 = t66VarM2513c;
                continuation = null;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O9, bool);
            hf6 hf6Var = (hf6) t66VarM2513c4.getValue();
            boolean zM22120g4 = tj3Var.m22120g(t66VarM2513c4) | tj3Var.m22124i(c2824b3);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22120g4 || objM22097O10 == p84Var) {
                objM22097O10 = new VocabularyScreenKt$VocabularyRoute$5$1(c2824b3, t66VarM2513c4, continuation);
                tj3Var.m22131l0(objM22097O10);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O10, hf6Var);
            if (((Boolean) t66Var8.getValue()).booleanValue()) {
                tj3Var.m22111b0(1922062929);
                boolean zM22124i4 = tj3Var.m22124i(hp5VarM16109I);
                Object objM22097O11 = tj3Var.m22097O();
                if (zM22124i4 || objM22097O11 == p84Var) {
                    t66Var4 = t66Var8;
                    objM22097O11 = new qk9(13, hp5VarM16109I, t66Var4);
                    tj3Var.m22131l0(objM22097O11);
                } else {
                    t66Var4 = t66Var8;
                }
                ui3 ui3Var2 = (ui3) objM22097O11;
                Object objM22097O12 = tj3Var.m22097O();
                if (objM22097O12 == p84Var) {
                    objM22097O12 = new zy0(t66Var4, t66Var7, 4);
                    tj3Var.m22131l0(objM22097O12);
                }
                m9734a(ui3Var2, (ui3) objM22097O12, tj3Var, 48);
                tj3Var.m22139q(false);
            } else {
                t66Var4 = t66Var8;
                tj3Var.m22111b0(1922414655);
                tj3Var.m22139q(false);
            }
            boolean z = ((f5a) t66VarM2513c5.getValue()).f38475g != null;
            boolean zM22124i5 = tj3Var.m22124i(c1909e4);
            Object objM22097O13 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O13 == p84Var) {
                objM22097O13 = new br8(c1909e4, 17);
                tj3Var.m22131l0(objM22097O13);
            }
            eh0.m11123c(0, 0, tj3Var, (ui3) objM22097O13, z);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            n1b n1bVar = (n1b) t66Var2.getValue();
            boolean zM22124i6 = tj3Var.m22124i(context) | tj3Var.m22124i(c2824b3) | tj3Var.m22124i(activity) | tj3Var.m22124i(hp5VarM16109I);
            Object objM22097O14 = tj3Var.m22097O();
            if (zM22124i6 || objM22097O14 == p84Var) {
                c1909e5 = c1909e4;
                Context context3 = context;
                C2824b c2824b6 = c2824b3;
                gca gcaVar = new gca(c2824b6, context3, activity, hp5VarM16109I, t66Var7, t66Var4);
                c2824b3 = c2824b6;
                context = context3;
                tj3Var.m22131l0(gcaVar);
                objM22097O14 = gcaVar;
            } else {
                c1909e5 = c1909e4;
            }
            vi3 vi3Var = (vi3) objM22097O14;
            boolean zM22124i7 = tj3Var.m22124i(c1909e5) | tj3Var.m22124i(c2824b3) | tj3Var.m22124i(w41Var2) | tj3Var.m22124i(context) | tj3Var.m22124i(og8Var2) | tj3Var.m22124i(biaVar);
            Object objM22097O15 = tj3Var.m22097O();
            if (zM22124i7 || objM22097O15 == p84Var) {
                c1909e6 = c1909e5;
                t66Var5 = t66Var3;
                vocabularyScreenKt$VocabularyRoute$9$2$1 = new VocabularyScreenKt$VocabularyRoute$9$2$1(w41Var2, context, og8Var2, biaVar, c1909e6, c2824b3, t66Var5);
                tj3Var.m22131l0(vocabularyScreenKt$VocabularyRoute$9$2$1);
            } else {
                vocabularyScreenKt$VocabularyRoute$9$2$1 = objM22097O15;
                c1909e6 = c1909e5;
                t66Var5 = t66Var3;
            }
            m9742i(n1bVar, vi3Var, (vi3) ((FunctionReference) vocabularyScreenKt$VocabularyRoute$9$2$1), tj3Var, 0);
            f5a f5aVar = (f5a) t66VarM2513c5.getValue();
            boolean zM22124i8 = tj3Var.m22124i(c1909e6);
            Object objM22097O16 = tj3Var.m22097O();
            if (zM22124i8 || objM22097O16 == p84Var) {
                C1909e c1909e9 = c1909e6;
                VocabularyScreenKt$VocabularyRoute$9$3$1 vocabularyScreenKt$VocabularyRoute$9$3$1 = new VocabularyScreenKt$VocabularyRoute$9$3$1(1, c1909e9, C1909e.class, "handleAction", "handleAction(Lcom/lingq/core/token/TokenAction;)V", 0);
                c1909e7 = c1909e9;
                tj3Var.m22131l0(vocabularyScreenKt$VocabularyRoute$9$3$1);
                objM22097O16 = vocabularyScreenKt$VocabularyRoute$9$3$1;
            } else {
                c1909e7 = c1909e6;
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) ((FunctionReference) objM22097O16), tj3Var, 8);
            tj3Var.m22139q(true);
            if (((Boolean) t66Var5.getValue()).booleanValue()) {
                tj3Var.m22111b0(1923105552);
                tza tzaVar = (tza) t66VarM2513c2.getValue();
                List list = (List) t66VarM2513c3.getValue();
                boolean zM22124i9 = tj3Var.m22124i(c2824b3);
                Object objM22097O17 = tj3Var.m22097O();
                if (zM22124i9 || objM22097O17 == p84Var) {
                    final int i4 = 1;
                    objM22097O17 = new vi3() { // from class: x0b
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            int i5 = i4;
                            xfa xfaVar = xfa.f68157a;
                            t66 t66Var10 = t66Var5;
                            C2824b c2824b7 = c2824b3;
                            switch (i5) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    vwa vwaVar = (vwa) t66Var10.getValue();
                                    t66Var10.setValue(null);
                                    if (zBooleanValue && vwaVar != null) {
                                        c2824b7.m9744V2(new twa(vwaVar.f66033a, vwaVar.f66034b));
                                    }
                                    break;
                                default:
                                    qza qzaVar = (qza) obj;
                                    qzaVar.getClass();
                                    if (qzaVar instanceof jza) {
                                        t66Var10.setValue(Boolean.FALSE);
                                    }
                                    c2824b7.f33527e.m9764c(qzaVar);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O17);
                }
                ebd.m11020e(tzaVar, list, (vi3) objM22097O17, null, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1923458239);
                tj3Var.m22139q(false);
            }
            c2824b2 = c2824b3;
            c1909e2 = c1909e7;
        } else {
            tj3Var.m22102U();
            c2824b2 = c2824b;
            c1909e2 = c1909e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(w41Var, og8Var, biaVar, c2824b2, c1909e2, i, 18);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9740g(w41 w41Var, Context context, og8 og8Var, bia biaVar, C1909e c1909e, C2824b c2824b, t66 t66Var, p0b p0bVar) {
        if (p0bVar instanceof i0b) {
            m9741h(c1909e, c2824b, ((i0b) p0bVar).f43301a, TokenType.CardType);
            return;
        }
        if (fa4.m11650l(p0bVar, j0b.f44859a)) {
            t66Var.setValue(Boolean.TRUE);
            return;
        }
        if (fa4.m11650l(p0bVar, l0b.f48876a)) {
            w41Var.m23737z(new la6());
            return;
        }
        if (fa4.m11650l(p0bVar, m0b.f50406a)) {
            mbd.m16753a(context, "https://www.lingq.com/auth/skritter/login/");
            return;
        }
        if (!(p0bVar instanceof k0b)) {
            if (fa4.m11650l(p0bVar, o0b.f53564a)) {
                biaVar.mo3737M1(UpgradeReason.LIMIT_WORDS);
                return;
            } else {
                if (p0bVar instanceof n0b) {
                    return;
                }
                gm5.m12750e();
                return;
            }
        }
        k0b k0bVar = (k0b) p0bVar;
        List list = k0bVar.f46522a;
        if (list.isEmpty()) {
            return;
        }
        Set setM22627s1 = u91.m22627s1(list);
        og8Var.getClass();
        og8Var.f54320a = setM22627s1;
        w41Var.m23737z(new ka6(true, -1, CardStatus.Known, k0bVar.f46523b, -1, null, null, null, 448));
    }

    /* JADX INFO: renamed from: h */
    public static final void m9741h(C1909e c1909e, C2824b c2824b, String str, TokenType tokenType) {
        c1909e.m8760d3(new c3a(new TokenPopupData(str, vz1.m23609O(str, c2824b.f33524b.mo4589b2()), tokenType, 0, 0, null, TokenViewState.Expanded.f23709a, TokenControllerType.Vocabulary, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null), false));
    }

    /* JADX INFO: renamed from: i */
    public static final void m9742i(n1b n1bVar, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3 = vi3Var;
        vi3 vi3Var4 = vi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-994722683);
        int i2 = (tj3Var.m22124i(n1bVar) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var3) ? 32 : 16) | (tj3Var.m22124i(vi3Var4) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new e5a(14);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
            Object[] objArr2 = new Object[0];
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new e5a(15);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) xwc.m24745R(objArr2, (ui3) objM22097O2, tj3Var, 48);
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            h39 h39Var = new h39(n1bVar, t66Var, vi3Var, vi3Var4, 11);
            vi3Var4 = vi3Var4;
            vi3Var3 = vi3Var;
            b34.m3232b(null, ci8.m4703P(211449417, h39Var, tj3Var), null, null, ci8.m4703P(162396172, new nya(7, n1bVar, vi3Var4), tj3Var), 0, 0L, 0L, null, ci8.m4703P(-1392752940, new C3357n2((Object) n1bVar, vi3Var3, (Object) vi3Var4, (Object) t66Var3, 22), tj3Var), tj3Var, 805330992, 493);
            tj3Var = tj3Var;
            if (((Boolean) t66Var3.getValue()).booleanValue()) {
                tj3Var.m22111b0(1493230208);
                r0b r0bVar = n1bVar.f52194d;
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new mya(3, t66Var3);
                    tj3Var.m22131l0(objM22097O4);
                }
                ui3 ui3Var = (ui3) objM22097O4;
                boolean z = (i2 & 112) == 32;
                Object objM22097O5 = tj3Var.m22097O();
                if (z || objM22097O5 == p84Var) {
                    objM22097O5 = new rza(vi3Var3, t66Var3, 2);
                    tj3Var.m22131l0(objM22097O5);
                }
                m9738e(r0bVar, ui3Var, (vi3) objM22097O5, tj3Var, 48);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1493534845);
                tj3Var.m22139q(false);
            }
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var.m22111b0(1493587049);
                kxa kxaVar = new kxa((String) t66Var2.getValue());
                boolean zM22120g = tj3Var.m22120g(t66Var) | tj3Var.m22120g(t66Var2) | ((i2 & 112) == 32);
                Object objM22097O6 = tj3Var.m22097O();
                if (zM22120g || objM22097O6 == p84Var) {
                    objM22097O6 = new qz5(vi3Var3, t66Var, t66Var2);
                    tj3Var.m22131l0(objM22097O6);
                }
                ve2.m23242a(kxaVar, (vi3) objM22097O6, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1494467325);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y0b(n1bVar, vi3Var3, vi3Var4, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m9743j(final boolean z, final boolean z2, final boolean z3, final boolean z4, final ui3 ui3Var, final vi3 vi3Var, final vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2108266218);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22122h(z2) ? 32 : 16) | (tj3Var.m22122h(z3) ? 256 : 128) | (tj3Var.m22122h(z4) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            final t66 t66Var = (t66) objM22097O;
            AbstractC0218a.m1125e(atc.f7482c, null, null, ci8.m4703P(-993091705, new aj3() { // from class: a1b
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((tj8) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z5 = z;
                        boolean zM22122h = tj3Var2.m22122h(z5);
                        ui3 ui3Var2 = ui3Var;
                        boolean zM22120g = zM22122h | tj3Var2.m22120g(ui3Var2);
                        vi3 vi3Var3 = vi3Var2;
                        boolean zM22120g2 = zM22120g | tj3Var2.m22120g(vi3Var3);
                        Object objM22097O2 = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new dz4(z5, ui3Var2, vi3Var3);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        b16 b16Var = b16.f7762a;
                        omd.m18141c((ui3) objM22097O2, vz1.m23624c0(b16Var, "vocabulary:add"), false, null, null, atc.f7483d, tj3Var2, 1572912, 60);
                        Object objM22097O3 = tj3Var2.m22097O();
                        t66 t66Var2 = t66Var;
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new mya(5, t66Var2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        omd.m18141c((ui3) objM22097O3, vz1.m23624c0(b16Var, "vocabulary:more"), false, null, null, atc.f7484e, tj3Var2, 1572918, 60);
                        boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new mya(6, t66Var2);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        ui3 ui3Var3 = (ui3) objM22097O4;
                        vi3 vi3Var4 = vi3Var;
                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var4);
                        Object objM22097O5 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O5 == p84Var) {
                            objM22097O5 = new rza(vi3Var4, t66Var2, 4);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        vi3 vi3Var5 = (vi3) objM22097O5;
                        boolean zM22120g4 = tj3Var2.m22120g(vi3Var3);
                        Object objM22097O6 = tj3Var2.m22097O();
                        if (zM22120g4 || objM22097O6 == p84Var) {
                            objM22097O6 = new rza(vi3Var3, t66Var2, 5);
                            tj3Var2.m22131l0(objM22097O6);
                        }
                        AbstractC2823a.m9737d(zBooleanValue, z2, z3, z4, ui3Var3, vi3Var5, (vi3) objM22097O6, tj3Var2, 24576);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), 0.0f, null, null, null, null, tj3Var, 3078, 502);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b1b(z, z2, z3, z4, ui3Var, vi3Var, vi3Var2, i, 0);
        }
    }
}
