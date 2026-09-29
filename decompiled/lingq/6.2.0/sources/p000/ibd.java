package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.dragdrop.C1919b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ibd {
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01be  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01db  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:116:0x020f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:127:0x0240  */
    /* JADX WARN: Code duplicated, block: B:131:0x027f  */
    /* JADX WARN: Code duplicated, block: B:134:0x028d  */
    /* JADX WARN: Code duplicated, block: B:137:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0323  */
    /* JADX WARN: Code duplicated, block: B:146:0x0327  */
    /* JADX WARN: Code duplicated, block: B:149:0x0376  */
    /* JADX WARN: Code duplicated, block: B:151:0x0384  */
    /* JADX WARN: Code duplicated, block: B:152:0x0386  */
    /* JADX WARN: Code duplicated, block: B:159:0x039a  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0451  */
    /* JADX WARN: Code duplicated, block: B:167:0x0462  */
    /* JADX WARN: Code duplicated, block: B:169:0x0478  */
    /* JADX WARN: Code duplicated, block: B:171:0x048b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0497  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168  */
    /* JADX WARN: Code duplicated, block: B:99:0x016c  */
    /* JADX INFO: renamed from: a */
    public static final void m13755a(e16 e16Var, vs3 vs3Var, w65 w65Var, boolean z, boolean z2, zi3 zi3Var, vi3 vi3Var, zi3 zi3Var2, vi3 vi3Var2, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        zi3 zi3Var3;
        vi3 vi3Var3;
        boolean z5;
        x18 x18VarM22143u;
        boolean z6;
        List listMo8039f;
        String strM17122h;
        TokenMeaning tokenMeaning;
        String strM21897b;
        Object objM22097O;
        p84 p84Var;
        t66 t66Var;
        ui3 ui3Var;
        b16 b16Var;
        boolean z7;
        boolean z8;
        Object objM22097O2;
        int i5;
        Object objM22097O3;
        boolean z9;
        boolean zM22120g;
        Object objM22097O4;
        LessonWord lessonWord;
        boolean z10;
        boolean zM22124i;
        Object objM22097O5;
        int i6;
        int i7;
        int i8;
        int i9;
        fc0 fc0Var = nj0.f52789H;
        vs3Var.getClass();
        w65Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1795962755);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vs3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(w65Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= tj3Var.m22122h(z3) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                if (tj3Var.m22124i(zi3Var)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i & 1572864) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i & 12582912) == 0) {
                if (tj3Var.m22124i(zi3Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((i & 100663296) == 0) {
                if (tj3Var.m22124i(vi3Var2)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i3 |= i6;
            }
            i4 = i3;
            if ((i4 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i4 & 1, z4)) {
                if (i10 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                String strMo8035b = w65Var.mo8035b();
                String strMo8037d = w65Var.mo8037d();
                listMo8039f = w65Var.mo8039f();
                if (listMo8039f.isEmpty()) {
                    listMo8039f = w65Var.mo8036c();
                }
                strM17122h = AbstractC3352my.m17122h(strMo8035b, strMo8037d, listMo8039f);
                if (z6 || !(w65Var instanceof LessonCard)) {
                    tokenMeaning = (TokenMeaning) u91.m22591I0(w65Var.mo8034a());
                    if (tokenMeaning != null || (strM21897b = tokenMeaning.f19596c) == null) {
                        strM21897b = "";
                    }
                } else {
                    strM21897b = t7d.m21897b(((LessonCard) w65Var).f19183f);
                }
                String str = strM21897b;
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                C3549ru c3549ru = eh0.f37236b;
                sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var4 = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var4, sj8VarM20003a);
                zi3 zi3Var5 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var6 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var6, numValueOf);
                vi3 vi3Var4 = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var4);
                zi3 zi3Var7 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c);
                b16Var = b16.f7762a;
                e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var6, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c2);
                boolean zM22124i2 = tj3Var.m22124i(w65Var);
                if ((i4 & 3670016) == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zM22124i2 | z7;
                objM22097O2 = tj3Var.m22097O();
                if (z8 || objM22097O2 == p84Var) {
                    objM22097O2 = new e87(w65Var, vi3Var, t66Var, 1);
                    tj3Var.m22131l0(objM22097O2);
                }
                i5 = (i4 >> 6) & 14;
                j4d.m14287b((i4 & 112) | i5, tj3Var, (ui3) objM22097O2, vs3Var, w65Var);
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new tia(4, t66Var);
                    tj3Var.m22131l0(objM22097O3);
                }
                vi3 vi3Var5 = (vi3) objM22097O3;
                if ((i4 & 29360128) == 8388608) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zM22120g = z9 | tj3Var.m22120g(strM17122h);
                objM22097O4 = tj3Var.m22097O();
                if (zM22120g || objM22097O4 == p84Var) {
                    objM22097O4 = new sy4(zi3Var2, strM17122h, t66Var, 2);
                    tj3Var.m22131l0(objM22097O4);
                }
                o4d.m17800a(vs3Var, zBooleanValue, vi3Var5, (vi3) objM22097O4, tj3Var, ((i4 >> 3) & 14) | 384);
                tj3Var.m22139q(true);
                e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38952a);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarMo3161g = e16VarM21607T.mo3161g(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).mo3161g(new opa(fc0Var));
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52811f, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var6, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c3);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, bb1VarM230a);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var6, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c4);
                sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var, 0);
                int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m5 = tj3Var.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var6, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c5);
                lw9.m16554b(strM17122h, c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 131064);
                if (z) {
                    tj3Var.m22111b0(-1499612258);
                    if ((i4 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zM22124i = tj3Var.m22124i(w65Var) | z10;
                    objM22097O5 = tj3Var.m22097O();
                    if (!zM22124i || objM22097O5 == p84Var) {
                        vi3Var3 = vi3Var2;
                        objM22097O5 = new ty4(vi3Var3, w65Var, 3);
                        tj3Var.m22131l0(objM22097O5);
                    } else {
                        vi3Var3 = vi3Var2;
                    }
                    omd.m18141c((ui3) objM22097O5, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14).mo3161g(new opa(fc0Var)), ge9.m12515a(tj3Var).f38957f), false, null, null, itc.f44563a, tj3Var, 1572864, 60);
                    tj3Var.m22139q(false);
                } else {
                    vi3Var3 = vi3Var2;
                    tj3Var.m22111b0(-1498776188);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                lw9.m16554b(str, AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                if (w65Var instanceof LessonWord) {
                    lessonWord = (LessonWord) w65Var;
                    if (fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) {
                        tj3Var.m22111b0(967533808);
                        zi3Var3 = zi3Var;
                        p4d.m18885a(lessonWord, zi3Var3, tj3Var, ((i4 >> 12) & 112) | i5);
                        tj3Var.m22139q(false);
                    } else {
                        zi3Var3 = zi3Var;
                        tj3Var.m22111b0(967636635);
                        tj3Var.m22139q(false);
                    }
                } else {
                    zi3Var3 = zi3Var;
                    tj3Var.m22111b0(967636635);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                z5 = z6;
            } else {
                zi3Var3 = zi3Var;
                vi3Var3 = vi3Var2;
                tj3Var.m22102U();
                z5 = z3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new le7(e16Var, vs3Var, w65Var, z, z5, zi3Var3, vi3Var, zi3Var2, vi3Var3, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        if ((i & 196608) == 0) {
            if (tj3Var.m22124i(zi3Var)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i & 1572864) == 0) {
            if (tj3Var.m22124i(vi3Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((i & 12582912) == 0) {
            if (tj3Var.m22124i(zi3Var2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((i & 100663296) == 0) {
            if (tj3Var.m22124i(vi3Var2)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        i4 = i3;
        if ((i4 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var.m22099R(i4 & 1, z4)) {
            if (i10 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            String strMo8035b2 = w65Var.mo8035b();
            String strMo8037d2 = w65Var.mo8037d();
            listMo8039f = w65Var.mo8039f();
            if (listMo8039f.isEmpty()) {
                listMo8039f = w65Var.mo8036c();
            }
            strM17122h = AbstractC3352my.m17122h(strMo8035b2, strMo8037d2, listMo8039f);
            if (z6) {
                tokenMeaning = (TokenMeaning) u91.m22591I0(w65Var.mo8034a());
                if (tokenMeaning != null) {
                    strM21897b = "";
                } else {
                    strM21897b = "";
                }
            } else {
                tokenMeaning = (TokenMeaning) u91.m22591I0(w65Var.mo8034a());
                if (tokenMeaning != null) {
                    strM21897b = "";
                } else {
                    strM21897b = "";
                }
            }
            String str2 = strM21897b;
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66Var = (t66) objM22097O;
            C3549ru c3549ru2 = eh0.f37236b;
            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru2, fc0Var, tj3Var, 48);
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var8 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var8, sj8VarM20003a3);
            zi3 zi3Var9 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var9, l77VarM22132m6);
            Integer numValueOf2 = Integer.valueOf(iHashCode6);
            zi3 zi3Var10 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var10, numValueOf2);
            vi3 vi3Var6 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var6);
            zi3 zi3Var11 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var11, e16VarM1322c6);
            b16Var = b16.f7762a;
            e16 e16VarM4430w2 = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52808c, false);
            int iHashCode7 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m7 = tj3Var.m22132m();
            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var8, ht5VarM19966d3);
            oha.m18001g(tj3Var, zi3Var9, l77VarM22132m7);
            AbstractC3393o1.m17747v(iHashCode7, tj3Var, zi3Var10, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var11, e16VarM1322c7);
            boolean zM22124i3 = tj3Var.m22124i(w65Var);
            if ((i4 & 3670016) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zM22124i3 | z7;
            objM22097O2 = tj3Var.m22097O();
            if (z8) {
                objM22097O2 = new e87(w65Var, vi3Var, t66Var, 1);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new e87(w65Var, vi3Var, t66Var, 1);
                tj3Var.m22131l0(objM22097O2);
            }
            i5 = (i4 >> 6) & 14;
            j4d.m14287b((i4 & 112) | i5, tj3Var, (ui3) objM22097O2, vs3Var, w65Var);
            boolean zBooleanValue2 = ((Boolean) t66Var.getValue()).booleanValue();
            objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new tia(4, t66Var);
                tj3Var.m22131l0(objM22097O3);
            }
            vi3 vi3Var7 = (vi3) objM22097O3;
            if ((i4 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            zM22120g = z9 | tj3Var.m22120g(strM17122h);
            objM22097O4 = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O4 = new sy4(zi3Var2, strM17122h, t66Var, 2);
                tj3Var.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new sy4(zi3Var2, strM17122h, t66Var, 2);
                tj3Var.m22131l0(objM22097O4);
            }
            o4d.m17800a(vs3Var, zBooleanValue2, vi3Var7, (vi3) objM22097O4, tj3Var, ((i4 >> 3) & 14) | 384);
            tj3Var.m22139q(true);
            e16 e16VarM21607T2 = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38952a);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarMo3161g2 = e16VarM21607T2.mo3161g(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).mo3161g(new opa(fc0Var));
            ht5 ht5VarM19966d4 = qh0.m19966d(nj0.f52811f, false);
            int iHashCode8 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m8 = tj3Var.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var8, ht5VarM19966d4);
            oha.m18001g(tj3Var, zi3Var9, l77VarM22132m8);
            AbstractC3393o1.m17747v(iHashCode8, tj3Var, zi3Var10, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var11, e16VarM1322c8);
            bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode9 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m9 = tj3Var.m22132m();
            e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var8, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var9, l77VarM22132m9);
            AbstractC3393o1.m17747v(iHashCode9, tj3Var, zi3Var10, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var11, e16VarM1322c9);
            sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru2, nj0.f52817l, tj3Var, 0);
            int iHashCode10 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m10 = tj3Var.m22132m();
            e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var8, sj8VarM20003a4);
            oha.m18001g(tj3Var, zi3Var9, l77VarM22132m10);
            AbstractC3393o1.m17747v(iHashCode10, tj3Var, zi3Var10, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var11, e16VarM1322c10);
            lw9.m16554b(strM17122h, c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 131064);
            if (z) {
                tj3Var.m22111b0(-1499612258);
                if ((i4 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zM22124i = tj3Var.m22124i(w65Var) | z10;
                objM22097O5 = tj3Var.m22097O();
                if (zM22124i) {
                    vi3Var3 = vi3Var2;
                    objM22097O5 = new ty4(vi3Var3, w65Var, 3);
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    vi3Var3 = vi3Var2;
                    objM22097O5 = new ty4(vi3Var3, w65Var, 3);
                    tj3Var.m22131l0(objM22097O5);
                }
                omd.m18141c((ui3) objM22097O5, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14).mo3161g(new opa(fc0Var)), ge9.m12515a(tj3Var).f38957f), false, null, null, itc.f44563a, tj3Var, 1572864, 60);
                tj3Var.m22139q(false);
            } else {
                vi3Var3 = vi3Var2;
                tj3Var.m22111b0(-1498776188);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            lw9.m16554b(str2, AbstractC3584sr.m21611X(c99.m4430w(b16Var, null, 3), 0.0f, ge9.m12515a(tj3Var).f38955d, 0.0f, 0.0f, 13), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            if (w65Var instanceof LessonWord) {
                lessonWord = (LessonWord) w65Var;
                if (fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) {
                    tj3Var.m22111b0(967533808);
                    zi3Var3 = zi3Var;
                    p4d.m18885a(lessonWord, zi3Var3, tj3Var, ((i4 >> 12) & 112) | i5);
                    tj3Var.m22139q(false);
                } else {
                    zi3Var3 = zi3Var;
                    tj3Var.m22111b0(967636635);
                    tj3Var.m22139q(false);
                }
            } else {
                zi3Var3 = zi3Var;
                tj3Var.m22111b0(967636635);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            z5 = z6;
        } else {
            zi3Var3 = zi3Var;
            vi3Var3 = vi3Var2;
            tj3Var.m22102U();
            z5 = z3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new le7(e16Var, vs3Var, w65Var, z, z5, zi3Var3, vi3Var, zi3Var2, vi3Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C1919b m13756b(C0127b c0127b, zi3 zi3Var, ye1 ye1Var) {
        c0127b.getClass();
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = d32.m10013K(tj3Var);
            tj3Var.m22131l0(objM22097O);
        }
        un1 un1Var = (un1) objM22097O;
        boolean zM22120g = tj3Var.m22120g(c0127b);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g || objM22097O2 == p84Var) {
            objM22097O2 = new C1919b(c0127b, un1Var, zi3Var);
            tj3Var.m22131l0(objM22097O2);
        }
        return (C1919b) objM22097O2;
    }
}
