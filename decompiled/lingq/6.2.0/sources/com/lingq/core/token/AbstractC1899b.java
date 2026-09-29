package com.lingq.core.token;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.AbstractC1900c;
import com.lingq.core.token.C1898a;
import com.lingq.core.token.TokenPopupAnchor;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.components.AbstractC1901a;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.token.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3445p2;
import p000.C3578sl;
import p000.C3587su;
import p000.a5b;
import p000.aa1;
import p000.ab1;
import p000.aj3;
import p000.b16;
import p000.bb1;
import p000.bbd;
import p000.bg9;
import p000.bgc;
import p000.bna;
import p000.c7a;
import p000.c99;
import p000.cg7;
import p000.ci0;
import p000.ci8;
import p000.cx8;
import p000.d32;
import p000.dh9;
import p000.dl9;
import p000.dn7;
import p000.dr3;
import p000.dt6;
import p000.e05;
import p000.e16;
import p000.e81;
import p000.ec0;
import p000.eh0;
import p000.eo1;
import p000.eq8;
import p000.f5a;
import p000.fb2;
import p000.fe9;
import p000.fmc;
import p000.fqc;
import p000.fz4;
import p000.gc0;
import p000.ge9;
import p000.gi5;
import p000.gj4;
import p000.gq6;
import p000.h4a;
import p000.hj4;
import p000.ho5;
import p000.ht5;
import p000.i4a;
import p000.ipb;
import p000.ix0;
import p000.kid;
import p000.ks8;
import p000.l44;
import p000.l4a;
import p000.l6b;
import p000.l77;
import p000.lw9;
import p000.m4a;
import p000.ms5;
import p000.mv3;
import p000.n84;
import p000.nj0;
import p000.no1;
import p000.nw4;
import p000.oha;
import p000.ow8;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pk9;
import p000.ps5;
import p000.px0;
import p000.qh0;
import p000.qk9;
import p000.qv2;
import p000.r3a;
import p000.r4a;
import p000.se1;
import p000.sk1;
import p000.ss5;
import p000.t66;
import p000.t7d;
import p000.thb;
import p000.tj3;
import p000.u29;
import p000.u91;
import p000.ub5;
import p000.ui0;
import p000.ui3;
import p000.un1;
import p000.vh9;
import p000.vi0;
import p000.vi3;
import p000.vq7;
import p000.vs2;
import p000.vs3;
import p000.vv9;
import p000.vx9;
import p000.vz1;
import p000.w65;
import p000.wb3;
import p000.we1;
import p000.we9;
import p000.ww8;
import p000.x17;
import p000.x18;
import p000.xc5;
import p000.xfa;
import p000.xj2;
import p000.xwc;
import p000.y7d;
import p000.ye1;
import p000.yn8;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.token.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1899b {
    /* JADX INFO: renamed from: a */
    public static final void m8692a(f5a f5aVar, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        TokenStatus tokenStatusM24984c;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(499170705);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(f5aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            w65 w65Var = f5aVar.f38474f;
            if (w65Var instanceof LessonCard) {
                LessonCard lessonCard = (LessonCard) w65Var;
                tokenStatusM24984c = y7d.m24984c(lessonCard.f19188k, lessonCard.f19189l);
            } else if (w65Var instanceof LessonWord) {
                String str = ((LessonWord) w65Var).f19322i;
                str.getClass();
                if (str.equals(WordStatus.New.getValue())) {
                    tokenStatusM24984c = TokenStatus.New;
                } else if (str.equals(WordStatus.Known.getValue())) {
                    tokenStatusM24984c = TokenStatus.Known;
                } else {
                    tokenStatusM24984c = str.equals(WordStatus.Ignored.getValue()) ? TokenStatus.Ignored : TokenStatus.New;
                }
            } else {
                tokenStatusM24984c = TokenStatus.New;
            }
            vs3 vs3Var = f5aVar.f38463U;
            boolean z = (i2 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new cx8(vi3Var, 28);
                tj3Var.m22131l0(objM22097O);
            }
            kid.m15265a(vs3Var, tokenStatusM24984c, (vi3) objM22097O, c99.m4429v(b16.f7762a), tj3Var, 3072);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new i4a(f5aVar, vi3Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x020b  */
    /* JADX WARN: Code duplicated, block: B:116:0x020e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0212  */
    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:122:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0229  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0283  */
    /* JADX WARN: Code duplicated, block: B:132:0x0287  */
    /* JADX WARN: Code duplicated, block: B:133:0x0289  */
    /* JADX WARN: Code duplicated, block: B:136:0x0296  */
    /* JADX WARN: Code duplicated, block: B:138:0x029a  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0128  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: b */
    public static final void m8693b(final boolean z, final List list, final boolean z2, final boolean z3, boolean z4, boolean z5, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        final boolean z6;
        boolean z7;
        int i4;
        boolean z8;
        int i5;
        final int i6;
        boolean z9;
        final vi3 vi3Var2;
        List list2;
        final boolean z10;
        x18 x18VarM22143u;
        boolean z11;
        final boolean z12;
        final boolean z13;
        boolean zIsEmpty;
        b16 b16Var;
        xc5 xc5VarM8704m;
        final TokenMeaning tokenMeaning;
        int i7;
        boolean z14;
        boolean z15;
        Object objM22097O;
        int i8;
        boolean z16;
        boolean z17;
        boolean zM22124i;
        Object objM22097O2;
        int i9;
        final int i10;
        boolean z18;
        final TokenMeaning tokenMeaning2;
        boolean z19;
        boolean z20;
        boolean zM22124i2;
        Object objM22097O3;
        String strM23620a0;
        x18 x18VarM22143u2;
        int i11;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-373893626);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z6 = z2;
            i3 |= tj3Var.m22122h(z6) ? 256 : 128;
        } else {
            z6 = z2;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22122h(z3) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                z7 = z4;
                i3 |= tj3Var.m22122h(z7) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z8 = z5;
                    if (tj3Var.m22122h(z8)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if (tj3Var.m22124i(vi3Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i6 = 0;
                if ((599187 & i3) != 599186) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (tj3Var.m22099R(i3 & 1, z9)) {
                    if (i12 != 0) {
                        z11 = false;
                    } else {
                        z11 = z7;
                    }
                    z12 = z11;
                    if (i4 != 0) {
                        z13 = false;
                    } else {
                        z13 = z8;
                    }
                    zIsEmpty = list.isEmpty();
                    b16Var = b16.f7762a;
                    xc5VarM8704m = null;
                    if (zIsEmpty) {
                        tj3Var.m22111b0(-1814479022);
                        if (!z12 && z13) {
                            tj3Var.m22111b0(1465492516);
                            strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable_offline);
                            tj3Var.m22139q(false);
                        } else if (z12) {
                            tj3Var.m22111b0(1465495804);
                            strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1465498202);
                            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                            tj3Var.m22139q(false);
                        }
                        String str = strM23620a0;
                        vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
                        if (z12) {
                            tj3Var.m22111b0(-1813934601);
                        } else {
                            tj3Var.m22111b0(1465505880);
                            xc5VarM8704m = m8704m(tj3Var);
                        }
                        tj3Var.m22139q(false);
                        vx9 vx9VarM23583a = vx9.m23583a(vx9Var, xc5VarM8704m, new wb3(1), 33554414);
                        zf1 zf1Var = ge9.f40637a;
                        lw9.m16554b(str, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38965n, ((fe9) tj3Var.m22128k(zf1Var)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23583a, tj3Var, 0, 0, 131068);
                        tj3Var.m22139q(false);
                        x18VarM22143u2 = tj3Var.m22143u();
                        if (x18VarM22143u2 != null) {
                            final int i13 = 0;
                            x18VarM22143u2.f67642d = new zi3() { // from class: o4a
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    int i14 = i13;
                                    xfa xfaVar = xfa.f68157a;
                                    int i15 = i;
                                    switch (i14) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iM19383z = pk9.m19383z(i15 | 1);
                                            AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iM19383z2 = pk9.m19383z(i15 | 1);
                                            AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z2, i2);
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    list2 = list;
                    boolean z21 = z13;
                    vi3Var2 = vi3Var;
                    tj3Var.m22111b0(-1813700612);
                    tj3Var.m22139q(false);
                    p84 p84Var = we1.f66679a;
                    if (z3 || !z) {
                        tj3Var.m22111b0(-1813253127);
                        tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                        boolean zM22124i3 = tj3Var.m22124i(tokenMeaning);
                        i7 = i3 & 3670016;
                        if (i7 == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM22124i3;
                        objM22097O = tj3Var.m22097O();
                        if (z15 || objM22097O == p84Var) {
                            objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                            tj3Var.m22131l0(objM22097O);
                        }
                        e16 e16VarM8793f = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                        i8 = i3 & 14;
                        if (i8 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i7 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                        objM22097O2 = tj3Var.m22097O();
                        if (zM22124i || objM22097O2 == p84Var) {
                            objM22097O2 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i14 = i6;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning;
                                    vi3 vi3Var3 = vi3Var2;
                                    boolean z22 = z;
                                    switch (i14) {
                                        case 0:
                                            if (!z22) {
                                                vi3Var3.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var3.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z22) {
                                                vi3Var3.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var3.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O2);
                        }
                        i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                        tj3Var = tj3Var;
                        i10 = 1;
                        t7d.m21896a(e16VarM8793f, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                        if (list2.size() > 1) {
                            tj3Var.m22111b0(-1812261561);
                            tokenMeaning2 = (TokenMeaning) list2.get(1);
                            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                            if (i8 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (i7 == 1048576) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                            objM22097O3 = tj3Var.m22097O();
                            if (zM22124i2 || objM22097O3 == p84Var) {
                                objM22097O3 = new ui3() { // from class: p4a
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i14 = i10;
                                        xfa xfaVar = xfa.f68157a;
                                        TokenMeaning tokenMeaning3 = tokenMeaning2;
                                        vi3 vi3Var3 = vi3Var2;
                                        boolean z22 = z;
                                        switch (i14) {
                                            case 0:
                                                if (!z22) {
                                                    vi3Var3.invoke(new d2a(tokenMeaning3));
                                                } else {
                                                    vi3Var3.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                                }
                                                break;
                                            default:
                                                if (!z22) {
                                                    vi3Var3.invoke(new d2a(tokenMeaning3));
                                                } else {
                                                    vi3Var3.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                                }
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var.m22131l0(objM22097O3);
                            }
                            t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                            z18 = false;
                            tj3Var.m22139q(false);
                        } else {
                            z18 = false;
                            tj3Var.m22111b0(-1811472580);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(z18);
                    } else {
                        tj3Var.m22111b0(-1813638643);
                        boolean zM22124i4 = tj3Var.m22124i(list2) | ((3670016 & i3) == 1048576);
                        Object objM22097O4 = tj3Var.m22097O();
                        if (zM22124i4 || objM22097O4 == p84Var) {
                            objM22097O4 = new we9(4, vi3Var2, list2);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        ipb.m14072a(i3 & 112, tj3Var, (ui3) objM22097O4, null, list2);
                        tj3Var.m22139q(false);
                        tj3Var = tj3Var;
                    }
                    z10 = z21;
                    z7 = z12;
                } else {
                    vi3Var2 = vi3Var;
                    list2 = list;
                    tj3Var.m22102U();
                    z10 = z8;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    final boolean z22 = z7;
                    final int i14 = 1;
                    final List list3 = list2;
                    final vi3 vi3Var3 = vi3Var2;
                    x18VarM22143u.f67642d = new zi3() { // from class: o4a
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = i14;
                            xfa xfaVar = xfa.f68157a;
                            int i16 = i;
                            switch (i15) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i16 | 1);
                                    AbstractC1899b.m8693b(z, list3, z2, z3, z22, z10, vi3Var3, (ye1) obj, iM19383z, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM19383z2 = pk9.m19383z(i16 | 1);
                                    AbstractC1899b.m8693b(z, list3, z2, z3, z22, z10, vi3Var3, (ye1) obj, iM19383z2, i2);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                }
            }
            i3 |= 196608;
            z8 = z5;
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i6 = 0;
            if ((599187 & i3) != 599186) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z9)) {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z7;
                }
                z12 = z11;
                if (i4 != 0) {
                    z13 = false;
                } else {
                    z13 = z8;
                }
                zIsEmpty = list.isEmpty();
                b16Var = b16.f7762a;
                xc5VarM8704m = null;
                if (zIsEmpty) {
                    tj3Var.m22111b0(-1814479022);
                    if (!z12) {
                        if (z12) {
                            tj3Var.m22111b0(1465495804);
                            strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1465498202);
                            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                            tj3Var.m22139q(false);
                        }
                    } else if (z12) {
                        tj3Var.m22111b0(1465495804);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1465498202);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                        tj3Var.m22139q(false);
                    }
                    String str2 = strM23620a0;
                    vx9 vx9Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
                    if (z12) {
                        tj3Var.m22111b0(1465505880);
                        xc5VarM8704m = m8704m(tj3Var);
                    } else {
                        tj3Var.m22111b0(-1813934601);
                    }
                    tj3Var.m22139q(false);
                    vx9 vx9VarM23583a2 = vx9.m23583a(vx9Var2, xc5VarM8704m, new wb3(1), 33554414);
                    zf1 zf1Var2 = ge9.f40637a;
                    lw9.m16554b(str2, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var2)).f38965n, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23583a2, tj3Var, 0, 0, 131068);
                    tj3Var.m22139q(false);
                    x18VarM22143u2 = tj3Var.m22143u();
                    if (x18VarM22143u2 != null) {
                        final int i15 = 0;
                        x18VarM22143u2.f67642d = new zi3() { // from class: o4a
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                int i16 = i15;
                                xfa xfaVar = xfa.f68157a;
                                int i17 = i;
                                switch (i16) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iM19383z = pk9.m19383z(i17 | 1);
                                        AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iM19383z2 = pk9.m19383z(i17 | 1);
                                        AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z2, i2);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                list2 = list;
                boolean z23 = z13;
                vi3Var2 = vi3Var;
                tj3Var.m22111b0(-1813700612);
                tj3Var.m22139q(false);
                p84 p84Var2 = we1.f66679a;
                if (z3) {
                    tj3Var.m22111b0(-1813253127);
                    tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                    boolean zM22124i5 = tj3Var.m22124i(tokenMeaning);
                    i7 = i3 & 3670016;
                    if (i7 == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM22124i5;
                    objM22097O = tj3Var.m22097O();
                    if (z15) {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM8793f2 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                    i8 = i3 & 14;
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i7 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22124i) {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var4 = vi3Var2;
                                boolean z24 = z;
                                switch (i16) {
                                    case 0:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var4 = vi3Var2;
                                boolean z24 = z;
                                switch (i16) {
                                    case 0:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                    tj3Var = tj3Var;
                    i10 = 1;
                    t7d.m21896a(e16VarM8793f2, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                    if (list2.size() > 1) {
                        tj3Var.m22111b0(-1812261561);
                        tokenMeaning2 = (TokenMeaning) list2.get(1);
                        pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                        if (i8 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i7 == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2) {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i16 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var4 = vi3Var2;
                                    boolean z24 = z;
                                    switch (i16) {
                                        case 0:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i16 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var4 = vi3Var2;
                                    boolean z24 = z;
                                    switch (i16) {
                                        case 0:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        }
                        t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                        z18 = false;
                        tj3Var.m22139q(false);
                    } else {
                        z18 = false;
                        tj3Var.m22111b0(-1811472580);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z18);
                } else {
                    tj3Var.m22111b0(-1813253127);
                    tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                    boolean zM22124i6 = tj3Var.m22124i(tokenMeaning);
                    i7 = i3 & 3670016;
                    if (i7 == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM22124i6;
                    objM22097O = tj3Var.m22097O();
                    if (z15) {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM8793f3 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                    i8 = i3 & 14;
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i7 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22124i) {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var4 = vi3Var2;
                                boolean z24 = z;
                                switch (i16) {
                                    case 0:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i16 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var4 = vi3Var2;
                                boolean z24 = z;
                                switch (i16) {
                                    case 0:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z24) {
                                            vi3Var4.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                    tj3Var = tj3Var;
                    i10 = 1;
                    t7d.m21896a(e16VarM8793f3, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                    if (list2.size() > 1) {
                        tj3Var.m22111b0(-1812261561);
                        tokenMeaning2 = (TokenMeaning) list2.get(1);
                        pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                        if (i8 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i7 == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2) {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i16 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var4 = vi3Var2;
                                    boolean z24 = z;
                                    switch (i16) {
                                        case 0:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i16 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var4 = vi3Var2;
                                    boolean z24 = z;
                                    switch (i16) {
                                        case 0:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z24) {
                                                vi3Var4.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var4.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        }
                        t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                        z18 = false;
                        tj3Var.m22139q(false);
                    } else {
                        z18 = false;
                        tj3Var.m22111b0(-1811472580);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z18);
                }
                z10 = z23;
                z7 = z12;
            } else {
                vi3Var2 = vi3Var;
                list2 = list;
                tj3Var.m22102U();
                z10 = z8;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final boolean z24 = z7;
                final int i16 = 1;
                final List list4 = list2;
                final vi3 vi3Var4 = vi3Var2;
                x18VarM22143u.f67642d = new zi3() { // from class: o4a
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        xfa xfaVar = xfa.f68157a;
                        int i18 = i;
                        switch (i17) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i18 | 1);
                                AbstractC1899b.m8693b(z, list4, z2, z3, z24, z10, vi3Var4, (ye1) obj, iM19383z, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i18 | 1);
                                AbstractC1899b.m8693b(z, list4, z2, z3, z24, z10, vi3Var4, (ye1) obj, iM19383z2, i2);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
        }
        i3 |= 24576;
        z7 = z4;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z8 = z5;
                if (tj3Var.m22122h(z8)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i6 = 0;
            if ((599187 & i3) != 599186) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z9)) {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z7;
                }
                z12 = z11;
                if (i4 != 0) {
                    z13 = false;
                } else {
                    z13 = z8;
                }
                zIsEmpty = list.isEmpty();
                b16Var = b16.f7762a;
                xc5VarM8704m = null;
                if (zIsEmpty) {
                    tj3Var.m22111b0(-1814479022);
                    if (!z12) {
                        if (z12) {
                            tj3Var.m22111b0(1465495804);
                            strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1465498202);
                            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                            tj3Var.m22139q(false);
                        }
                    } else if (z12) {
                        tj3Var.m22111b0(1465495804);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1465498202);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                        tj3Var.m22139q(false);
                    }
                    String str3 = strM23620a0;
                    vx9 vx9Var3 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
                    if (z12) {
                        tj3Var.m22111b0(1465505880);
                        xc5VarM8704m = m8704m(tj3Var);
                    } else {
                        tj3Var.m22111b0(-1813934601);
                    }
                    tj3Var.m22139q(false);
                    vx9 vx9VarM23583a3 = vx9.m23583a(vx9Var3, xc5VarM8704m, new wb3(1), 33554414);
                    zf1 zf1Var3 = ge9.f40637a;
                    lw9.m16554b(str3, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var3)).f38965n, ((fe9) tj3Var.m22128k(zf1Var3)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23583a3, tj3Var, 0, 0, 131068);
                    tj3Var.m22139q(false);
                    x18VarM22143u2 = tj3Var.m22143u();
                    if (x18VarM22143u2 != null) {
                        final int i17 = 0;
                        x18VarM22143u2.f67642d = new zi3() { // from class: o4a
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                int i18 = i17;
                                xfa xfaVar = xfa.f68157a;
                                int i19 = i;
                                switch (i18) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iM19383z = pk9.m19383z(i19 | 1);
                                        AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iM19383z2 = pk9.m19383z(i19 | 1);
                                        AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z2, i2);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                list2 = list;
                boolean z25 = z13;
                vi3Var2 = vi3Var;
                tj3Var.m22111b0(-1813700612);
                tj3Var.m22139q(false);
                p84 p84Var3 = we1.f66679a;
                if (z3) {
                    tj3Var.m22111b0(-1813253127);
                    tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                    boolean zM22124i7 = tj3Var.m22124i(tokenMeaning);
                    i7 = i3 & 3670016;
                    if (i7 == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM22124i7;
                    objM22097O = tj3Var.m22097O();
                    if (z15) {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM8793f4 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                    i8 = i3 & 14;
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i7 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22124i) {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i18 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var5 = vi3Var2;
                                boolean z26 = z;
                                switch (i18) {
                                    case 0:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i18 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var5 = vi3Var2;
                                boolean z26 = z;
                                switch (i18) {
                                    case 0:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                    tj3Var = tj3Var;
                    i10 = 1;
                    t7d.m21896a(e16VarM8793f4, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                    if (list2.size() > 1) {
                        tj3Var.m22111b0(-1812261561);
                        tokenMeaning2 = (TokenMeaning) list2.get(1);
                        pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                        if (i8 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i7 == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2) {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i18 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var5 = vi3Var2;
                                    boolean z26 = z;
                                    switch (i18) {
                                        case 0:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i18 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var5 = vi3Var2;
                                    boolean z26 = z;
                                    switch (i18) {
                                        case 0:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        }
                        t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                        z18 = false;
                        tj3Var.m22139q(false);
                    } else {
                        z18 = false;
                        tj3Var.m22111b0(-1811472580);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z18);
                } else {
                    tj3Var.m22111b0(-1813253127);
                    tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                    boolean zM22124i8 = tj3Var.m22124i(tokenMeaning);
                    i7 = i3 & 3670016;
                    if (i7 == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM22124i8;
                    objM22097O = tj3Var.m22097O();
                    if (z15) {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM8793f5 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                    i8 = i3 & 14;
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i7 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22124i) {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i18 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var5 = vi3Var2;
                                boolean z26 = z;
                                switch (i18) {
                                    case 0:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i18 = i6;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning;
                                vi3 vi3Var5 = vi3Var2;
                                boolean z26 = z;
                                switch (i18) {
                                    case 0:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z26) {
                                            vi3Var5.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                    tj3Var = tj3Var;
                    i10 = 1;
                    t7d.m21896a(e16VarM8793f5, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                    if (list2.size() > 1) {
                        tj3Var.m22111b0(-1812261561);
                        tokenMeaning2 = (TokenMeaning) list2.get(1);
                        pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                        if (i8 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i7 == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2) {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i18 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var5 = vi3Var2;
                                    boolean z26 = z;
                                    switch (i18) {
                                        case 0:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        } else {
                            objM22097O3 = new ui3() { // from class: p4a
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i18 = i10;
                                    xfa xfaVar = xfa.f68157a;
                                    TokenMeaning tokenMeaning3 = tokenMeaning2;
                                    vi3 vi3Var5 = vi3Var2;
                                    boolean z26 = z;
                                    switch (i18) {
                                        case 0:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                        default:
                                            if (!z26) {
                                                vi3Var5.invoke(new d2a(tokenMeaning3));
                                            } else {
                                                vi3Var5.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            };
                            tj3Var.m22131l0(objM22097O3);
                        }
                        t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                        z18 = false;
                        tj3Var.m22139q(false);
                    } else {
                        z18 = false;
                        tj3Var.m22111b0(-1811472580);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z18);
                }
                z10 = z25;
                z7 = z12;
            } else {
                vi3Var2 = vi3Var;
                list2 = list;
                tj3Var.m22102U();
                z10 = z8;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final boolean z26 = z7;
                final int i18 = 1;
                final List list5 = list2;
                final vi3 vi3Var5 = vi3Var2;
                x18VarM22143u.f67642d = new zi3() { // from class: o4a
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        xfa xfaVar = xfa.f68157a;
                        int i110 = i;
                        switch (i19) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i110 | 1);
                                AbstractC1899b.m8693b(z, list5, z2, z3, z26, z10, vi3Var5, (ye1) obj, iM19383z, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(i110 | 1);
                                AbstractC1899b.m8693b(z, list5, z2, z3, z26, z10, vi3Var5, (ye1) obj, iM19383z2, i2);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
        }
        i3 |= 196608;
        z8 = z5;
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(vi3Var)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i6 = 0;
        if ((599187 & i3) != 599186) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z9)) {
            if (i12 != 0) {
                z11 = false;
            } else {
                z11 = z7;
            }
            z12 = z11;
            if (i4 != 0) {
                z13 = false;
            } else {
                z13 = z8;
            }
            zIsEmpty = list.isEmpty();
            b16Var = b16.f7762a;
            xc5VarM8704m = null;
            if (zIsEmpty) {
                tj3Var.m22111b0(-1814479022);
                if (!z12) {
                    if (z12) {
                        tj3Var.m22111b0(1465495804);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1465498202);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                        tj3Var.m22139q(false);
                    }
                } else if (z12) {
                    tj3Var.m22111b0(1465495804);
                    strM23620a0 = vz1.m23620a0(tj3Var, R$string.lingq_translation_unavailable);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1465498202);
                    strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_loading_translation);
                    tj3Var.m22139q(false);
                }
                String str4 = strM23620a0;
                vx9 vx9Var4 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
                if (z12) {
                    tj3Var.m22111b0(1465505880);
                    xc5VarM8704m = m8704m(tj3Var);
                } else {
                    tj3Var.m22111b0(-1813934601);
                }
                tj3Var.m22139q(false);
                vx9 vx9VarM23583a4 = vx9.m23583a(vx9Var4, xc5VarM8704m, new wb3(1), 33554414);
                zf1 zf1Var4 = ge9.f40637a;
                lw9.m16554b(str4, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var4)).f38965n, ((fe9) tj3Var.m22128k(zf1Var4)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23583a4, tj3Var, 0, 0, 131068);
                tj3Var.m22139q(false);
                x18VarM22143u2 = tj3Var.m22143u();
                if (x18VarM22143u2 != null) {
                    final int i19 = 0;
                    x18VarM22143u2.f67642d = new zi3() { // from class: o4a
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i110 = i19;
                            xfa xfaVar = xfa.f68157a;
                            int i111 = i;
                            switch (i110) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i111 | 1);
                                    AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM19383z2 = pk9.m19383z(i111 | 1);
                                    AbstractC1899b.m8693b(z, list, z6, z3, z12, z13, vi3Var, (ye1) obj, iM19383z2, i2);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            list2 = list;
            boolean z27 = z13;
            vi3Var2 = vi3Var;
            tj3Var.m22111b0(-1813700612);
            tj3Var.m22139q(false);
            p84 p84Var4 = we1.f66679a;
            if (z3) {
                tj3Var.m22111b0(-1813253127);
                tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                boolean zM22124i9 = tj3Var.m22124i(tokenMeaning);
                i7 = i3 & 3670016;
                if (i7 == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM22124i9;
                objM22097O = tj3Var.m22097O();
                if (z15) {
                    objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM8793f6 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                i8 = i3 & 14;
                if (i8 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i7 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                objM22097O2 = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O2 = new ui3() { // from class: p4a
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i110 = i6;
                            xfa xfaVar = xfa.f68157a;
                            TokenMeaning tokenMeaning3 = tokenMeaning;
                            vi3 vi3Var6 = vi3Var2;
                            boolean z28 = z;
                            switch (i110) {
                                case 0:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                                default:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui3() { // from class: p4a
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i110 = i6;
                            xfa xfaVar = xfa.f68157a;
                            TokenMeaning tokenMeaning3 = tokenMeaning;
                            vi3 vi3Var6 = vi3Var2;
                            boolean z28 = z;
                            switch (i110) {
                                case 0:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                                default:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                }
                i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                tj3Var = tj3Var;
                i10 = 1;
                t7d.m21896a(e16VarM8793f6, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                if (list2.size() > 1) {
                    tj3Var.m22111b0(-1812261561);
                    tokenMeaning2 = (TokenMeaning) list2.get(1);
                    pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                    if (i8 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i7 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                    objM22097O3 = tj3Var.m22097O();
                    if (zM22124i2) {
                        objM22097O3 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i110 = i10;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning2;
                                vi3 vi3Var6 = vi3Var2;
                                boolean z28 = z;
                                switch (i110) {
                                    case 0:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i110 = i10;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning2;
                                vi3 vi3Var6 = vi3Var2;
                                boolean z28 = z;
                                switch (i110) {
                                    case 0:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    }
                    t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                    z18 = false;
                    tj3Var.m22139q(false);
                } else {
                    z18 = false;
                    tj3Var.m22111b0(-1811472580);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z18);
            } else {
                tj3Var.m22111b0(-1813253127);
                tokenMeaning = (TokenMeaning) u91.m22589G0(list2);
                boolean zM22124i10 = tj3Var.m22124i(tokenMeaning);
                i7 = i3 & 3670016;
                if (i7 == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM22124i10;
                objM22097O = tj3Var.m22097O();
                if (z15) {
                    objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new r3a(3, tokenMeaning, vi3Var2);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM8793f7 = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                i8 = i3 & 14;
                if (i8 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i7 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM22124i = z16 | z17 | tj3Var.m22124i(tokenMeaning);
                objM22097O2 = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O2 = new ui3() { // from class: p4a
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i110 = i6;
                            xfa xfaVar = xfa.f68157a;
                            TokenMeaning tokenMeaning3 = tokenMeaning;
                            vi3 vi3Var6 = vi3Var2;
                            boolean z28 = z;
                            switch (i110) {
                                case 0:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                                default:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new ui3() { // from class: p4a
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i110 = i6;
                            xfa xfaVar = xfa.f68157a;
                            TokenMeaning tokenMeaning3 = tokenMeaning;
                            vi3 vi3Var6 = vi3Var2;
                            boolean z28 = z;
                            switch (i110) {
                                case 0:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                                default:
                                    if (!z28) {
                                        vi3Var6.invoke(new d2a(tokenMeaning3));
                                    } else {
                                        vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                }
                i9 = ((i3 << 3) & 7168) | ((i3 << 6) & 896);
                tj3Var = tj3Var;
                i10 = 1;
                t7d.m21896a(e16VarM8793f7, tokenMeaning, z, z2, (ui3) objM22097O2, tj3Var, i9, 0);
                if (list2.size() > 1) {
                    tj3Var.m22111b0(-1812261561);
                    tokenMeaning2 = (TokenMeaning) list2.get(1);
                    pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1));
                    if (i8 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i7 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zM22124i2 = z19 | z20 | tj3Var.m22124i(tokenMeaning2);
                    objM22097O3 = tj3Var.m22097O();
                    if (zM22124i2) {
                        objM22097O3 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i110 = i10;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning2;
                                vi3 vi3Var6 = vi3Var2;
                                boolean z28 = z;
                                switch (i110) {
                                    case 0:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new ui3() { // from class: p4a
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i110 = i10;
                                xfa xfaVar = xfa.f68157a;
                                TokenMeaning tokenMeaning3 = tokenMeaning2;
                                vi3 vi3Var6 = vi3Var2;
                                boolean z28 = z;
                                switch (i110) {
                                    case 0:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                    default:
                                        if (!z28) {
                                            vi3Var6.invoke(new d2a(tokenMeaning3));
                                        } else {
                                            vi3Var6.invoke(new d3a(tokenMeaning3, TokenPopupAnchor.Expanded));
                                        }
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    }
                    t7d.m21896a(null, tokenMeaning2, z, z2, (ui3) objM22097O3, tj3Var, i9, 1);
                    z18 = false;
                    tj3Var.m22139q(false);
                } else {
                    z18 = false;
                    tj3Var.m22111b0(-1811472580);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z18);
            }
            z10 = z27;
            z7 = z12;
        } else {
            vi3Var2 = vi3Var;
            list2 = list;
            tj3Var.m22102U();
            z10 = z8;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final boolean z28 = z7;
            final int i110 = 1;
            final List list6 = list2;
            final vi3 vi3Var6 = vi3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: o4a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i111 = i110;
                    xfa xfaVar = xfa.f68157a;
                    int i112 = i;
                    switch (i111) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i112 | 1);
                            AbstractC1899b.m8693b(z, list6, z2, z3, z28, z10, vi3Var6, (ye1) obj, iM19383z, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(i112 | 1);
                            AbstractC1899b.m8693b(z, list6, z2, z3, z28, z10, vi3Var6, (ye1) obj, iM19383z2, i2);
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m8694c(final f5a f5aVar, final boolean z, final vi3 vi3Var, ye1 ye1Var, final int i) {
        vi3 vi3Var2;
        x18 x18VarM22143u;
        zi3 zi3Var;
        e16 e16VarM21611X;
        int i2;
        b16 b16Var;
        ci0 ci0Var;
        w65 w65Var;
        t66 t66Var;
        Continuation continuation;
        float f;
        int i3;
        p84 p84Var;
        f5a f5aVar2;
        int i4;
        float f2;
        int i5;
        tj3 tj3Var;
        boolean z2;
        int i6;
        p84 p84Var2;
        int i7;
        int i8;
        int i9;
        f5a f5aVar3;
        int i10;
        boolean z3;
        int i11;
        p84 p84Var3;
        w65 w65Var2;
        p84 p84Var4;
        boolean z4;
        p84 p84Var5;
        boolean z5;
        p84 p84Var6;
        w65 w65Var3;
        char c;
        float f3;
        t66 t66Var2;
        int i12;
        p84 p84Var7;
        int i13;
        tj3 tj3Var2;
        int i14;
        float f4;
        boolean z6;
        p84 p84Var8;
        b16 b16Var2;
        int i15;
        boolean z7;
        float f5;
        int i16;
        int i17;
        tj3 tj3Var3;
        mv3 mv3Var = ss5.f61356d;
        ec0 ec0Var = nj0.f52791J;
        C3587su c3587su = eh0.f37238d;
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(713642986);
        int i18 = (i & 6) == 0 ? (tj3Var4.m22124i(f5aVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i18 |= tj3Var4.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i18 |= tj3Var4.m22124i(vi3Var) ? 256 : 128;
        }
        int i19 = i18;
        if (tj3Var4.m22099R(i19 & 1, (i19 & 147) != 146)) {
            w65 w65Var4 = f5aVar.f38474f;
            List list = f5aVar.f38490v;
            List list2 = f5aVar.f38488t;
            List<TokenRelatedPhrase> list3 = list;
            List list4 = f5aVar.f38486r;
            w65 w65Var5 = f5aVar.f38474f;
            b16 b16Var3 = b16.f7762a;
            if (w65Var4 == null && f5aVar.f38472d) {
                tj3Var4.m22111b0(50267038);
                dn7.m10495d(c99.m4412e(b16Var3, 1.0f), 0L, 0L, 0, 0.0f, tj3Var4, 6);
                tj3Var4.m22139q(false);
                x18VarM22143u = tj3Var4.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i20 = 0;
                zi3Var = new zi3() { // from class: q4a
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = i20;
                        xfa xfaVar = xfa.f68157a;
                        int i22 = i;
                        vi3 vi3Var3 = vi3Var;
                        boolean z8 = z;
                        f5a f5aVar4 = f5aVar;
                        ye1 ye1Var2 = (ye1) obj;
                        ((Integer) obj2).intValue();
                        switch (i21) {
                            case 0:
                                AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i22 | 1));
                                break;
                            case 1:
                                AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i22 | 1));
                                break;
                            default:
                                AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i22 | 1));
                                break;
                        }
                        return xfaVar;
                    }
                };
            } else {
                tj3Var4.m22111b0(50353528);
                tj3Var4.m22139q(false);
                if (w65Var4 == null) {
                    x18VarM22143u = tj3Var4.m22143u();
                    if (x18VarM22143u == null) {
                        return;
                    }
                    final int i21 = 2;
                    zi3Var = new zi3() { // from class: q4a
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            xfa xfaVar = xfa.f68157a;
                            int i23 = i;
                            vi3 vi3Var3 = vi3Var;
                            boolean z8 = z;
                            f5a f5aVar4 = f5aVar;
                            ye1 ye1Var2 = (ye1) obj;
                            ((Integer) obj2).intValue();
                            switch (i22) {
                                case 0:
                                    AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i23 | 1));
                                    break;
                                case 1:
                                    AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i23 | 1));
                                    break;
                                default:
                                    AbstractC1899b.m8694c(f5aVar4, z8, vi3Var3, ye1Var2, pk9.m19383z(i23 | 1));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                } else {
                    boolean z8 = (w65Var5 instanceof LessonCard) && !list4.isEmpty();
                    yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var4);
                    Object objM22097O = tj3Var4.m22097O();
                    p84 p84Var9 = we1.f66679a;
                    if (objM22097O == p84Var9) {
                        objM22097O = AbstractC0278f.m1260j(5);
                        tj3Var4.m22131l0(objM22097O);
                    }
                    final t66 t66Var3 = (t66) objM22097O;
                    boolean z9 = z || f5aVar.f38444B;
                    fb2 fb2Var = (fb2) tj3Var4.m22128k(AbstractC0402n.f4816h);
                    Object objM22097O2 = tj3Var4.m22097O();
                    if (objM22097O2 == p84Var9) {
                        objM22097O2 = AbstractC0278f.m1260j(new xj2(64.0f));
                        tj3Var4.m22131l0(objM22097O2);
                    }
                    t66 t66Var4 = (t66) objM22097O2;
                    gc0 gc0Var = nj0.f52808c;
                    boolean z10 = z8;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m = tj3Var4.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, b16Var3);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var2 = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var2, ht5VarM19966d);
                    zi3 zi3Var3 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var3, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    fb2 fb2Var2 = fb2Var;
                    zi3 zi3Var4 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var4, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var3);
                    zi3 zi3Var5 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var5, e16VarM1322c);
                    ci0 ci0Var2 = ci0.f10109a;
                    if (z) {
                        tj3Var4.m22111b0(-912650384);
                        e16VarM21611X = AbstractC3584sr.m21611X(c99.m4411d(d32.m10007D(ci0Var2.mo3727a(b16Var3, gc0Var), ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55824I, mv3Var), 1.0f), 0.0f, 0.0f, 0.0f, ((xj2) t66Var4.getValue()).f68285a, 7);
                        i2 = 0;
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-912372128);
                        e16VarM21611X = AbstractC3584sr.m21611X(c99.m4429v(d32.m10007D(ci0Var2.mo3727a(b16Var3, gc0Var), ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55824I, mv3Var)), 0.0f, 0.0f, 0.0f, z9 ? ((xj2) t66Var4.getValue()).f68285a : 0.0f, 7);
                        i2 = 0;
                        tj3Var4.m22139q(false);
                    }
                    e16 e16VarM3912B0 = bna.m3912B0(e16VarM21611X, yn8VarM3972r0, z, 12);
                    bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var4, i2);
                    int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m2 = tj3Var4.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM3912B0);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var2, bb1VarM230a);
                    oha.m18001g(tj3Var4, zi3Var3, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var4, tj3Var4, vi3Var3);
                    oha.m18001g(tj3Var4, zi3Var5, e16VarM1322c2);
                    if (z10) {
                        tj3Var4.m22111b0(480810502);
                        if (z) {
                            boolean z11 = false;
                            continuation = null;
                            tj3Var4.m22111b0(481413576);
                            int i22 = i19 & 14;
                            int i23 = i19 & 896;
                            t66 t66Var5 = t66Var3;
                            bbd.m3598a(f5aVar, z, vi3Var, tj3Var4, i19 & 1022, 0);
                            String strM23620a0 = vz1.m23620a0(tj3Var4, R$string.meanings_saved);
                            vx9 vx9Var = ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m;
                            zf1 zf1Var = ge9.f40637a;
                            int i24 = 2;
                            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(b16Var3, ((fe9) tj3Var4.m22128k(zf1Var)).f38965n, 0.0f, 2), 0.0f, ((fe9) tj3Var4.m22128k(zf1Var)).f38956e, 0.0f, ((fe9) tj3Var4.m22128k(zf1Var)).f38952a, 5);
                            b16 b16Var4 = b16Var3;
                            w65Var3 = w65Var5;
                            c = 4;
                            f3 = 1.0f;
                            int i25 = i19;
                            t66Var2 = t66Var4;
                            int i26 = 256;
                            p84 p84Var10 = p84Var9;
                            float f6 = 0.0f;
                            ci0Var = ci0Var2;
                            lw9.m16554b(strM23620a0, e16VarM21611X2, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var4, 0, 0, 131068);
                            tj3 tj3Var5 = tj3Var4;
                            tj3Var5.m22111b0(-122994703);
                            int i27 = 0;
                            for (Object obj : list4) {
                                int i28 = i27 + 1;
                                if (i27 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                                tj3Var5.m22106Y(1947500526, Integer.valueOf(tokenMeaning.f19594a));
                                TokenMeaning tokenMeaning2 = f5aVar.f38481m;
                                boolean z12 = (tokenMeaning2 == null || tokenMeaning.f19594a != tokenMeaning2.f19594a) ? z11 : true;
                                boolean z13 = f5aVar.f38492x;
                                boolean z14 = list4.size() > 1;
                                boolean z15 = i23 == i26;
                                Object objM22097O3 = tj3Var5.m22097O();
                                if (z15 || objM22097O3 == p84Var10) {
                                    objM22097O3 = new ww8(vi3Var, 5);
                                    tj3Var5.m22131l0(objM22097O3);
                                }
                                zi3 zi3Var6 = (zi3) objM22097O3;
                                boolean z16 = i23 == 256;
                                Object objM22097O4 = tj3Var5.m22097O();
                                if (z16 || objM22097O4 == p84Var10) {
                                    objM22097O4 = new cx8(vi3Var, 29);
                                    tj3Var5.m22131l0(objM22097O4);
                                }
                                vi3 vi3Var4 = (vi3) objM22097O4;
                                boolean zM22116e = (i23 == 256) | tj3Var5.m22116e(i27);
                                Object objM22097O5 = tj3Var5.m22097O();
                                if (zM22116e || objM22097O5 == p84Var10) {
                                    objM22097O5 = new eo1(vi3Var, i27);
                                    tj3Var5.m22131l0(objM22097O5);
                                }
                                vi3 vi3Var5 = (vi3) objM22097O5;
                                boolean zM22122h = tj3Var5.m22122h(z12) | (i23 == 256);
                                Object objM22097O6 = tj3Var5.m22097O();
                                if (zM22122h || objM22097O6 == p84Var10) {
                                    objM22097O6 = new vq7(vi3Var, z12);
                                    tj3Var5.m22131l0(objM22097O6);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O6;
                                tj3 tj3Var6 = tj3Var5;
                                int i29 = i27;
                                AbstractC1901a.m8709a(tokenMeaning, z13, z14, z12, zi3Var6, vi3Var4, vi3Var5, ui3Var2, tj3Var6, 0, 0);
                                if (i29 != vz1.m23602H(list4)) {
                                    tj3Var6.m22111b0(244547476);
                                    zf1 zf1Var2 = ge9.f40637a;
                                    b16 b16Var5 = b16Var4;
                                    b16Var2 = b16Var5;
                                    i15 = i23;
                                    tj3Var3 = tj3Var6;
                                    p84Var8 = p84Var10;
                                    f5 = 0.0f;
                                    i16 = 2;
                                    i17 = 256;
                                    pb1.m19031a(0.0f, 0, 6, 0L, tj3Var3, AbstractC3584sr.m21611X(b16Var5, ((fe9) tj3Var6.m22128k(zf1Var2)).f38965n, 0.0f, ((fe9) tj3Var6.m22128k(zf1Var2)).f38960i, 0.0f, 10));
                                    z7 = false;
                                    tj3Var3.m22139q(false);
                                } else {
                                    p84Var8 = p84Var10;
                                    b16Var2 = b16Var4;
                                    i15 = i23;
                                    z7 = false;
                                    f5 = 0.0f;
                                    i16 = 2;
                                    i17 = 256;
                                    tj3Var3 = tj3Var6;
                                    tj3Var3.m22111b0(244933798);
                                    tj3Var3.m22139q(false);
                                }
                                tj3Var3.m22139q(z7);
                                f6 = f5;
                                b16Var4 = b16Var2;
                                i25 = i25;
                                i23 = i15;
                                p84Var10 = p84Var8;
                                i22 = i22;
                                i24 = i16;
                                z11 = z7;
                                tj3Var5 = tj3Var3;
                                t66Var5 = t66Var5;
                                i27 = i28;
                                i26 = i17;
                            }
                            i12 = i26;
                            p84Var7 = p84Var10;
                            final t66 t66Var6 = t66Var5;
                            i13 = i24;
                            int i30 = i22;
                            boolean z17 = z11;
                            tj3Var2 = tj3Var5;
                            i14 = i25;
                            f4 = f6;
                            b16Var = b16Var4;
                            tj3Var2.m22139q(z17);
                            m8697f(f5aVar, vi3Var, tj3Var2, i30 | ((i14 >> 3) & 112));
                            int iIntValue = ((Number) t66Var6.getValue()).intValue();
                            boolean zM22124i = tj3Var2.m22124i(f5aVar);
                            Object objM22097O7 = tj3Var2.m22097O();
                            if (zM22124i || objM22097O7 == p84Var7) {
                                z6 = false;
                                final Object[] objArr = null == true ? 1 : 0;
                                objM22097O7 = new ui3() { // from class: n4a
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i31 = objArr;
                                        xfa xfaVar = xfa.f68157a;
                                        t66 t66Var7 = t66Var6;
                                        f5a f5aVar4 = f5aVar;
                                        switch (i31) {
                                            case 0:
                                                if (((Number) t66Var7.getValue()).intValue() + 5 <= f5aVar4.f38488t.size()) {
                                                    t66Var7.setValue(Integer.valueOf(((Number) t66Var7.getValue()).intValue() + 5));
                                                } else {
                                                    t66Var7.setValue(Integer.valueOf(f5aVar4.f38488t.size()));
                                                }
                                                break;
                                            default:
                                                if (((Number) t66Var7.getValue()).intValue() + 5 <= f5aVar4.f38488t.size()) {
                                                    t66Var7.setValue(Integer.valueOf(((Number) t66Var7.getValue()).intValue() + 5));
                                                } else {
                                                    t66Var7.setValue(Integer.valueOf(f5aVar4.f38488t.size()));
                                                }
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O7);
                            } else {
                                z6 = false;
                            }
                            bgc.m3708b(f5aVar, iIntValue, vi3Var, (ui3) objM22097O7, tj3Var2, i14 & 910);
                            tj3Var2.m22139q(z6);
                        } else {
                            tj3Var4.m22111b0(480730057);
                            bbd.m3598a(f5aVar, false, vi3Var, tj3Var4, (i19 & 14) | 48 | (i19 & 896), 0);
                            continuation = null;
                            tj3Var2 = tj3Var4;
                            m8693b(true, f5aVar.f38486r, f5aVar.f38492x, f5aVar.f38493y, false, false, vi3Var, tj3Var2, ((i19 << 12) & 3670016) | 6, 48);
                            tj3Var2.m22139q(false);
                            z6 = false;
                            b16Var = b16Var3;
                            i14 = i19;
                            ci0Var = ci0Var2;
                            w65Var3 = w65Var5;
                            p84Var7 = p84Var9;
                            t66Var2 = t66Var4;
                            f4 = 0.0f;
                            i13 = 2;
                            i12 = 256;
                            c = 4;
                            f3 = 1.0f;
                        }
                        tj3Var2.m22139q(z6);
                        f5aVar2 = f5aVar;
                        vi3Var2 = vi3Var;
                        tj3Var = tj3Var2;
                        f2 = f4;
                        i3 = i14;
                        p84Var = p84Var7;
                        i4 = i13;
                        i5 = i12;
                        w65Var = w65Var3;
                        f = f3;
                        t66Var = t66Var2;
                    } else {
                        b16Var = b16Var3;
                        ci0Var = ci0Var2;
                        list3 = list3;
                        w65Var = w65Var5;
                        t66Var = t66Var4;
                        fb2Var2 = fb2Var2;
                        continuation = null;
                        f = 1.0f;
                        tj3Var4.m22111b0(485038282);
                        int i31 = i19 & 14;
                        bbd.m3598a(f5aVar, z, vi3Var, tj3Var4, i19 & 1022, 0);
                        if (z) {
                            vi3Var2 = vi3Var;
                            i3 = i19;
                            w65Var = w65Var;
                            tj3Var4.m22111b0(487028079);
                            m8697f(f5aVar, vi3Var2, tj3Var4, ((i3 >> 3) & 112) | i31);
                            int iIntValue2 = ((Number) t66Var3.getValue()).intValue();
                            boolean zM22124i2 = tj3Var4.m22124i(f5aVar);
                            Object objM22097O8 = tj3Var4.m22097O();
                            if (zM22124i2 || objM22097O8 == p84Var9) {
                                final int i32 = 1;
                                objM22097O8 = new ui3() { // from class: n4a
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i33 = i32;
                                        xfa xfaVar = xfa.f68157a;
                                        t66 t66Var7 = t66Var3;
                                        f5a f5aVar4 = f5aVar;
                                        switch (i33) {
                                            case 0:
                                                if (((Number) t66Var7.getValue()).intValue() + 5 <= f5aVar4.f38488t.size()) {
                                                    t66Var7.setValue(Integer.valueOf(((Number) t66Var7.getValue()).intValue() + 5));
                                                } else {
                                                    t66Var7.setValue(Integer.valueOf(f5aVar4.f38488t.size()));
                                                }
                                                break;
                                            default:
                                                if (((Number) t66Var7.getValue()).intValue() + 5 <= f5aVar4.f38488t.size()) {
                                                    t66Var7.setValue(Integer.valueOf(((Number) t66Var7.getValue()).intValue() + 5));
                                                } else {
                                                    t66Var7.setValue(Integer.valueOf(f5aVar4.f38488t.size()));
                                                }
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var4.m22131l0(objM22097O8);
                            }
                            p84Var = p84Var9;
                            f5aVar2 = f5aVar;
                            i4 = 2;
                            f2 = 0.0f;
                            i5 = 256;
                            bgc.m3708b(f5aVar2, iIntValue2, vi3Var2, (ui3) objM22097O8, tj3Var4, i3 & 910);
                            tj3Var = tj3Var4;
                            z2 = false;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(485221306);
                            if (f5aVar.f38453K && f5aVar.f38487s.isEmpty() && list2.isEmpty()) {
                                tj3Var4.m22111b0(485344531);
                                i7 = 2;
                                i8 = 256;
                                i6 = i19;
                                p84Var2 = p84Var9;
                                lw9.m16554b(vz1.m23620a0(tj3Var4, f5aVar.f38454L ? R$string.lingq_translation_unavailable_offline : R$string.lingq_translation_unavailable), AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a, 1), 0L, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var4, 0, 0, 131036);
                                z3 = false;
                                tj3Var4.m22139q(false);
                            } else {
                                i6 = i19;
                                p84Var2 = p84Var9;
                                i7 = 2;
                                i8 = 256;
                                if (f5aVar.f38452J && list2.isEmpty()) {
                                    tj3Var4.m22111b0(485975195);
                                    lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.core.p012ui.R$string.lingq_loading_translation), AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23583a(((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71407k, m8704m(tj3Var4), new wb3(1), 33554414), tj3Var4, 0, 0, 131068);
                                    z3 = false;
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(486444101);
                                    i9 = 256;
                                    p84Var = p84Var2;
                                    f5aVar3 = f5aVar;
                                    i10 = 2;
                                    i3 = i6;
                                    m8693b(false, f5aVar.f38487s, f5aVar.f38492x, false, f5aVar.f38453K, f5aVar.f38454L, vi3Var, tj3Var4, (3670016 & (i6 << 12)) | 3078, 0);
                                    vi3Var2 = vi3Var;
                                    z3 = false;
                                    tj3Var4.m22139q(false);
                                }
                                tj3Var4.m22139q(z3);
                                z2 = z3;
                                tj3Var = tj3Var4;
                                f5aVar2 = f5aVar3;
                                i4 = i10;
                                f2 = 0.0f;
                                i5 = i9;
                            }
                            f5aVar3 = f5aVar;
                            i9 = i8;
                            p84Var = p84Var2;
                            i10 = i7;
                            i3 = i6;
                            vi3Var2 = vi3Var;
                            tj3Var4.m22139q(z3);
                            z2 = z3;
                            tj3Var = tj3Var4;
                            f5aVar2 = f5aVar3;
                            i4 = i10;
                            f2 = 0.0f;
                            i5 = i9;
                        }
                        tj3Var.m22139q(z2);
                    }
                    if (z) {
                        tj3Var.m22111b0(487983468);
                        if ((w65Var instanceof e05) || ((w65Var instanceof LessonCard) && ((LessonCard) w65Var).f19182e)) {
                            tj3Var4 = tj3Var;
                            i11 = i3;
                            w65Var2 = w65Var;
                            p84Var4 = p84Var;
                            tj3Var4.m22111b0(490507860);
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var.m22111b0(488074608);
                            p84 p84Var11 = p84Var;
                            tj3 tj3Var7 = tj3Var;
                            i11 = i3;
                            w65Var2 = w65Var;
                            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.lingq_related_phrases), AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var).f38965n, f2, i4), 0.0f, ge9.m12515a(tj3Var).f38963l, 0.0f, ge9.m12515a(tj3Var).f38952a, 5), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var7, 0, 0, 131068);
                            if (f5aVar2.f38448F) {
                                tj3Var7.m22111b0(488615310);
                                e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, f), ge9.m12515a(tj3Var7).f38965n, ge9.m12515a(tj3Var7).f38952a);
                                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                                p84Var5 = p84Var11;
                                int iHashCode3 = Long.hashCode(tj3Var7.f62385T);
                                l77 l77VarM22132m3 = tj3Var7.m22132m();
                                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var7, e16VarM21608U);
                                se1.f60731q.getClass();
                                ui3 ui3Var3 = C0352b.f4299b;
                                tj3Var7.m22119f0();
                                if (tj3Var7.f62384S) {
                                    tj3Var7.m22130l(ui3Var3);
                                } else {
                                    tj3Var7.m22137o0();
                                }
                                oha.m18001g(tj3Var7, C0352b.f4303f, ht5VarM19966d2);
                                oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m3);
                                oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode3));
                                oha.m18000f(tj3Var7, C0352b.f4305h);
                                oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c3);
                                tj3Var4 = tj3Var7;
                                dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var4, 0, 63);
                                tj3Var4.m22139q(true);
                                z5 = false;
                                tj3Var4.m22139q(false);
                            } else {
                                p84Var5 = p84Var11;
                                tj3Var4 = tj3Var7;
                                if (list3.isEmpty()) {
                                    tj3Var4.m22111b0(489196033);
                                    lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.lingq_no_phrases_available), AbstractC3584sr.m21608U(b16Var, ge9.m12515a(tj3Var4).f38965n, ge9.m12515a(tj3Var4).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71407k, tj3Var4, 0, 0, 131068);
                                    z5 = false;
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(489668349);
                                    for (TokenRelatedPhrase tokenRelatedPhrase : list3) {
                                        boolean zM22124i3 = ((i11 & 896) == i5) | tj3Var4.m22124i(tokenRelatedPhrase) | tj3Var4.m22124i(f5aVar2);
                                        Object objM22097O9 = tj3Var4.m22097O();
                                        if (zM22124i3) {
                                            p84Var6 = p84Var5;
                                        } else {
                                            p84Var6 = p84Var5;
                                            if (objM22097O9 == p84Var6) {
                                            }
                                            fmc.m11946a(tokenRelatedPhrase, (ui3) objM22097O9, tj3Var4, 0);
                                            thb.m22044c(tj3Var4, c99.m4414g(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                            p84Var5 = p84Var6;
                                        }
                                        objM22097O9 = new u29(1, vi3Var2, tokenRelatedPhrase, f5aVar2);
                                        tj3Var4.m22131l0(objM22097O9);
                                        fmc.m11946a(tokenRelatedPhrase, (ui3) objM22097O9, tj3Var4, 0);
                                        thb.m22044c(tj3Var4, c99.m4414g(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                        p84Var5 = p84Var6;
                                    }
                                    p84Var4 = p84Var5;
                                    z5 = false;
                                    tj3Var4.m22139q(false);
                                }
                                tj3Var4.m22139q(z5);
                            }
                            p84Var4 = p84Var5;
                            tj3Var4.m22139q(z5);
                        }
                        if (w65Var2 instanceof LessonCard) {
                            tj3Var4.m22111b0(490670951);
                            p84Var3 = p84Var4;
                            lw9.m16554b(vz1.m23620a0(tj3Var4, com.lingq.core.p012ui.R$string.card_notes), AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var4).f38965n, f2, 2), 0.0f, ge9.m12515a(tj3Var4).f38963l, 0.0f, ge9.m12515a(tj3Var4).f38952a, 5), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71409m, tj3Var4, 0, 0, 131068);
                            boolean zM22120g = tj3Var4.m22120g(String.valueOf(((LessonCard) w65Var2).f19186i));
                            Object objM22097O10 = tj3Var4.m22097O();
                            if (zM22120g || objM22097O10 == p84Var3) {
                                objM22097O10 = AbstractC0278f.m1260j(new vv9(f5aVar2.f38491w, 6, 0L));
                                tj3Var4.m22131l0(objM22097O10);
                            }
                            t66 t66Var7 = (t66) objM22097O10;
                            String str = f5aVar2.f38467Y;
                            int i33 = i11 & 896;
                            boolean zM22124i4 = tj3Var4.m22124i(f5aVar2) | tj3Var4.m22120g(t66Var7) | (i33 == i5);
                            Object objM22097O11 = tj3Var4.m22097O();
                            if (zM22124i4 || objM22097O11 == p84Var3) {
                                objM22097O11 = new TokenPopupContentKt$Content$3$1$6$1(f5aVar2, vi3Var2, t66Var7, continuation);
                                tj3Var4.m22131l0(objM22097O11);
                            }
                            d32.m10047k(tj3Var4, (zi3) objM22097O11, str);
                            vv9 vv9Var = (vv9) t66Var7.getValue();
                            e16 e16VarM21611X3 = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var4).f38965n, f2, 2), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38952a, 7);
                            vx9 vx9Var2 = p58.m18902j(tj3Var4).f71407k;
                            boolean zM22120g2 = (i33 == i5) | tj3Var4.m22120g(t66Var7);
                            Object objM22097O12 = tj3Var4.m22097O();
                            if (zM22120g2 || objM22097O12 == p84Var3) {
                                objM22097O12 = new ix0(vi3Var2, t66Var7, 21);
                                tj3Var4.m22131l0(objM22097O12);
                            }
                            bna.m3940b(vv9Var, (vi3) objM22097O12, e16VarM21611X3, false, vx9Var2, null, fqc.f39500a, ci8.m4703P(1727569523, new r4a(f5aVar2, vi3Var2, 0), tj3Var4), null, null, null, false, 12, 3, null, null, tj3Var4, 817889280, 918552576, 7470424);
                            z4 = false;
                            tj3Var4.m22139q(false);
                        } else {
                            p84Var3 = p84Var4;
                            z4 = false;
                            tj3Var4.m22111b0(494158420);
                            tj3Var4.m22139q(false);
                        }
                        tj3Var4.m22139q(z4);
                    } else {
                        tj3Var4 = tj3Var;
                        i11 = i3;
                        p84Var3 = p84Var;
                        tj3Var4.m22111b0(494172308);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(true);
                    e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, nj0.f52815j);
                    fb2 fb2Var3 = fb2Var2;
                    boolean zM22120g3 = tj3Var4.m22120g(fb2Var3);
                    Object objM22097O13 = tj3Var4.m22097O();
                    if (zM22120g3 || objM22097O13 == p84Var3) {
                        objM22097O13 = new no1(fb2Var3, t66Var, 4);
                        tj3Var4.m22131l0(objM22097O13);
                    }
                    e16 e16VarM24741N = xwc.m24741N(e16VarMo3727a, (vi3) objM22097O13);
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                    int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m4 = tj3Var4.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM24741N);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var4);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c4);
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38963l));
                    if (z9) {
                        tj3Var4.m22111b0(-1639239031);
                        m8692a(f5aVar2, vi3Var2, tj3Var4, (i11 & 14) | ((i11 >> 3) & 112));
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-1639175605);
                        tj3Var4.m22139q(false);
                    }
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(true);
                }
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        vi3Var2 = vi3Var;
        tj3Var4.m22102U();
        x18VarM22143u = tj3Var4.m22143u();
        if (x18VarM22143u != null) {
            final int i34 = 1;
            final vi3 vi3Var6 = vi3Var2;
            zi3Var = new zi3() { // from class: q4a
                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    int i210 = i34;
                    xfa xfaVar = xfa.f68157a;
                    int i211 = i;
                    vi3 vi3Var7 = vi3Var6;
                    boolean z18 = z;
                    f5a f5aVar4 = f5aVar;
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).intValue();
                    switch (i210) {
                        case 0:
                            AbstractC1899b.m8694c(f5aVar4, z18, vi3Var7, ye1Var2, pk9.m19383z(i211 | 1));
                            break;
                        case 1:
                            AbstractC1899b.m8694c(f5aVar4, z18, vi3Var7, ye1Var2, pk9.m19383z(i211 | 1));
                            break;
                        default:
                            AbstractC1899b.m8694c(f5aVar4, z18, vi3Var7, ye1Var2, pk9.m19383z(i211 | 1));
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8695d(boolean z, boolean z2, ye1 ye1Var, int i) {
        x17 x17VarM21622e;
        boolean z3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-769116269);
        int i2 = (tj3Var.m22122h(z) ? 4 : 2) | i | (tj3Var.m22122h(z2) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            dh9 dh9VarM750b = AbstractC0060b.m750b((z || z2) ? 0.2f : 0.0f, ss5.m21698Y(0.75f, 400.0f, null, 4), "HighlightScrim", null, tj3Var, 3120, 20);
            if (z) {
                tj3Var.m22111b0(908250724);
                WeakHashMap weakHashMap = l6b.f49204w;
                C3578sl c3578sl = ho5.m13397r(tj3Var).f49210f;
                vh9 vh9Var = AbstractC0402n.f4816h;
                fb2 fb2Var = (fb2) tj3Var.m22128k(vh9Var);
                float fMo905T = fb2Var.mo905T(c3578sl.mo3999a(fb2Var));
                C3578sl c3578sl2 = ho5.m13397r(tj3Var).f49209e;
                fb2 fb2Var2 = (fb2) tj3Var.m22128k(vh9Var);
                float fMo905T2 = fb2Var2.mo905T(c3578sl2.mo4001c(fb2Var2));
                zf1 zf1Var = ge9.f40637a;
                x17VarM21622e = new x17(((fe9) tj3Var.m22128k(zf1Var)).f38952a, fMo905T, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, fMo905T2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(908550928);
                tj3Var.m22139q(false);
                x17VarM21622e = AbstractC3584sr.m21622e(0.0f, 0.0f, 3);
            }
            if (((Number) dh9VarM750b.getValue()).floatValue() > 0.0f) {
                tj3Var.m22111b0(908640146);
                b16 b16Var = b16.f7762a;
                e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                long j = aa1.f403b;
                e16 e16VarM10007D = d32.m10007D(e16VarM4411d, aa1.m198b(((Number) dh9VarM750b.getValue()).floatValue(), j), ss5.f61356d);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
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
                if (z2) {
                    z3 = false;
                    tj3Var.m22111b0(17343214);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(16966502);
                    e16 e16VarM10007D2 = d32.m10007D(AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), x17VarM21622e), aa1.m198b(((Number) dh9VarM750b.getValue()).floatValue() * 0.5f, j), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d);
                    z3 = false;
                    qh0.m19963a(e16VarM10007D2, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                tj3Var.m22139q(z3);
            } else {
                tj3Var.m22111b0(909221551);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new e81(i, z, z2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8696e(f5a f5aVar, zi3 zi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-588508110);
        int i2 = (tj3Var.m22124i(f5aVar) ? 4 : 2) | i | 48 | (tj3Var.m22124i(zi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
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
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new cg7(zi3Var, 28);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM1407b = AbstractC0309d.m1407b(pb1.m19025M(b16Var, (vi3) objM22097O), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1048571);
            TokenPopupData tokenPopupData = f5aVar.f38475g;
            boolean z2 = tokenPopupData != null && tokenPopupData.f23441O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new ow8(13);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC1900c.m8705a(e16VarM1407b, f5aVar, false, z2, 0.0f, (vi3) objM22097O2, tj3Var, ((i2 << 6) & 896) | 1575942, 16);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(f5aVar, i, 22, zi3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8697f(f5a f5aVar, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        int i3;
        Object c3445p2;
        t66 t66Var;
        f5aVar.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-273602431);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(f5aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC0300b interfaceC0300b = (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i);
            Object[] objArr = new Object[0];
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ks8(22);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66VarM24744Q = xwc.m24744Q(objArr, (ui3) objM22097O, tj3Var2, 384);
            vv9 vv9Var = (vv9) t66VarM24744Q.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var2.m22128k(zf1Var)).f38965n, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38963l, 7);
            hj4 hj4Var = new hj4(0, 7, null, 119);
            boolean zM22120g = tj3Var2.m22120g(t66VarM24744Q) | tj3Var2.m22124i(f5aVar) | ((i2 & 112) == 32) | tj3Var2.m22124i(interfaceC0300b);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                t66Var = t66VarM24744Q;
                c3445p2 = new C3445p2((Object) f5aVar, vi3Var, (Object) interfaceC0300b, (Object) t66Var, 19);
                tj3Var2.m22131l0(c3445p2);
            } else {
                c3445p2 = objM22097O2;
                t66Var = t66VarM24744Q;
            }
            gj4 gj4Var = new gj4((vi3) c3445p2, null, 62);
            boolean zM22120g2 = tj3Var2.m22120g(t66Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O3 == p84Var) {
                objM22097O3 = new dt6(24, t66Var);
                tj3Var2.m22131l0(objM22097O3);
            }
            tj3Var = tj3Var2;
            i3 = 2;
            bna.m3940b(vv9Var, (vi3) objM22097O3, e16VarM21611X, false, null, fqc.f39501b, null, null, null, hj4Var, gj4Var, true, 0, 0, null, null, tj3Var, 1572864, 12779520, 8159160);
        } else {
            tj3Var = tj3Var2;
            i3 = 2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new i4a(f5aVar, vi3Var, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x030f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0311  */
    /* JADX WARN: Code duplicated, block: B:109:0x0315  */
    /* JADX WARN: Code duplicated, block: B:119:0x0413  */
    /* JADX WARN: Code duplicated, block: B:129:0x044b  */
    /* JADX WARN: Code duplicated, block: B:132:0x047c  */
    /* JADX WARN: Code duplicated, block: B:133:0x047e  */
    /* JADX WARN: Code duplicated, block: B:137:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x054b  */
    /* JADX WARN: Code duplicated, block: B:156:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:159:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:163:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:169:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:177:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x0657  */
    /* JADX WARN: Code duplicated, block: B:181:0x0659  */
    /* JADX WARN: Code duplicated, block: B:184:0x0661  */
    /* JADX WARN: Code duplicated, block: B:187:0x0666  */
    /* JADX WARN: Code duplicated, block: B:188:0x0668  */
    /* JADX WARN: Code duplicated, block: B:192:0x067b  */
    /* JADX WARN: Code duplicated, block: B:193:0x067d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x0687  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0215  */
    /* JADX WARN: Code duplicated, block: B:81:0x022c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0246  */
    /* JADX WARN: Code duplicated, block: B:91:0x0285  */
    /* JADX WARN: Code duplicated, block: B:94:0x028c  */
    /* JADX WARN: Code duplicated, block: B:95:0x028f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0299  */
    /* JADX INFO: renamed from: g */
    public static final void m8698g(f5a f5aVar, final vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        int i3;
        Object objValueOf;
        Object objValueOf2;
        int i4;
        boolean z;
        boolean zM22120g;
        Object objM22097O;
        t66 t66Var;
        boolean zM22120g2;
        Object objM22097O2;
        t66 t66Var2;
        boolean zM22120g3;
        Object objM22097O3;
        t66 t66Var3;
        Object objM22097O4;
        C0059a c0059a;
        boolean zM22120g4;
        Object objM22097O5;
        t66 t66Var4;
        boolean zM22120g5;
        Object objM22097O6;
        t66 t66Var5;
        float f;
        int i5;
        boolean z2;
        Object objM22097O7;
        boolean zM22122h;
        Object objM22097O8;
        boolean z3;
        TokenPopupData tokenPopupData;
        w65 w65Var;
        int i6;
        t66 t66Var6;
        t66 t66Var7;
        p84 p84Var;
        fb2 fb2Var;
        t66 t66Var8;
        float f2;
        int i7;
        tj3 tj3Var2;
        float f3;
        t66 t66Var9;
        float f4;
        C0059a c0059a2;
        boolean z4;
        t66 t66Var10;
        final t66 t66Var11;
        p84 p84Var2;
        boolean z5;
        TokenMeaning tokenMeaning;
        TokenPopupAnchor tokenPopupAnchor;
        final t66 t66Var12;
        int i8;
        boolean z6;
        float f5;
        C0059a c0059a3;
        boolean zM22114d;
        Object tokenPopupContainerKt$TokenPopupContainer$2$1;
        float f6;
        float f7;
        C0059a c0059a4;
        tj3 tj3Var3;
        final t66 t66Var13;
        fb2 fb2Var2;
        float f8;
        float f9;
        int i9;
        final t66 t66Var14;
        boolean zM22120g6;
        Object objM22097O9;
        tj3 tj3Var4;
        f5a f5aVar2;
        fb2 fb2Var3;
        TokenPopupData tokenPopupData2;
        boolean z7;
        Object objM22097O10;
        p84 p84Var3;
        l4a l4aVar;
        boolean zM22124i;
        Object objM22097O11;
        f5a f5aVar3;
        final f5a f5aVar4;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objM22097O12;
        p84 p84Var4;
        int i10;
        int i11;
        Object objM22097O13;
        f5a f5aVar5 = f5aVar;
        vi3 vi3Var2 = vi3Var;
        f5aVar5.getClass();
        List list = f5aVar5.f38487s;
        List list2 = f5aVar5.f38486r;
        int i12 = f5aVar5.f38446D;
        w65 w65Var2 = f5aVar5.f38474f;
        boolean z11 = f5aVar5.f38472d;
        TokenPopupData tokenPopupData3 = f5aVar5.f38475g;
        vi3Var2.getClass();
        tj3 tj3Var5 = (tj3) ye1Var;
        tj3Var5.m22115d0(607940881);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var5.m22124i(f5aVar5) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var5.m22124i(vi3Var2) ? 32 : 16;
        }
        if (tj3Var5.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O14 = tj3Var5.m22097O();
            p84 p84Var5 = we1.f66679a;
            if (objM22097O14 == p84Var5) {
                objM22097O14 = d32.m10013K(tj3Var5);
                tj3Var5.m22131l0(objM22097O14);
            }
            final un1 un1Var = (un1) objM22097O14;
            final dr3 dr3Var = (dr3) tj3Var5.m22128k(AbstractC0402n.f4820l);
            fb2 fb2Var4 = (fb2) tj3Var5.m22128k(AbstractC0402n.f4816h);
            vh9 vh9Var = AbstractC0402n.f4830v;
            final a5b a5bVar = (a5b) tj3Var5.m22128k(vh9Var);
            WeakHashMap weakHashMap = l6b.f49204w;
            int i13 = ho5.m13397r(tj3Var5).f49210f.m21441e().f49117b;
            float f10 = i13;
            float f11 = ho5.m13397r(tj3Var5).f49209e.m21441e().f49119d;
            a5b a5bVar2 = (a5b) tj3Var5.m22128k(vh9Var);
            boolean zM22120g7 = tj3Var5.m22120g(a5bVar2);
            Object objM22097O15 = tj3Var5.m22097O();
            if (zM22120g7 || objM22097O15 == p84Var5) {
                objValueOf = Integer.valueOf((int) (((nw4) a5bVar2).m17654a() & 4294967295L));
                tj3Var5.m22131l0(objValueOf);
            } else {
                objValueOf = objM22097O15;
            }
            final int iIntValue = ((Number) objValueOf).intValue();
            boolean zM22120g8 = tj3Var5.m22120g(a5bVar2);
            Object objM22097O16 = tj3Var5.m22097O();
            if (zM22120g8 || objM22097O16 == p84Var5) {
                objValueOf2 = Integer.valueOf((int) (((nw4) a5bVar2).m17654a() >> 32));
                tj3Var5.m22131l0(objValueOf2);
            } else {
                objValueOf2 = objM22097O16;
            }
            int iIntValue2 = ((Number) objValueOf2).intValue();
            boolean zM22116e = tj3Var5.m22116e(i13);
            Object objM22097O17 = tj3Var5.m22097O();
            if (zM22116e || objM22097O17 == p84Var5) {
                objM22097O17 = Float.valueOf(fb2Var4.mo912g0(0.0f));
                tj3Var5.m22131l0(objM22097O17);
            }
            float fFloatValue = ((Number) objM22097O17).floatValue();
            boolean zM22116e2 = tj3Var5.m22116e(i13);
            Object objM22097O18 = tj3Var5.m22097O();
            if (zM22116e2 || objM22097O18 == p84Var5) {
                objM22097O18 = Float.valueOf(f10);
                tj3Var5.m22131l0(objM22097O18);
            }
            float fFloatValue2 = ((Number) objM22097O18).floatValue();
            Object objM22097O19 = tj3Var5.m22097O();
            if (objM22097O19 == p84Var5) {
                objM22097O19 = Float.valueOf(iIntValue2 * 0.2f);
                tj3Var5.m22131l0(objM22097O19);
            }
            final float fFloatValue3 = ((Number) objM22097O19).floatValue();
            Object objM22097O20 = tj3Var5.m22097O();
            if (objM22097O20 == p84Var5) {
                objM22097O20 = Float.valueOf(iIntValue * 0.15f);
                tj3Var5.m22131l0(objM22097O20);
            }
            final float fFloatValue4 = ((Number) objM22097O20).floatValue();
            Object objM22097O21 = tj3Var5.m22097O();
            if (objM22097O21 == p84Var5) {
                objM22097O21 = Float.valueOf(iIntValue * 0.15f);
                tj3Var5.m22131l0(objM22097O21);
            }
            final float fFloatValue5 = ((Number) objM22097O21).floatValue();
            if (tokenPopupData3 != null) {
                i4 = iIntValue2;
                z = tokenPopupData3.f23441O;
                zM22120g = tj3Var5.m22120g(tokenPopupData3);
                objM22097O = tj3Var5.m22097O();
                if (zM22120g || objM22097O == p84Var5) {
                    objM22097O = AbstractC0278f.m1260j(null);
                    tj3Var5.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                zM22120g2 = tj3Var5.m22120g(tokenPopupData3);
                objM22097O2 = tj3Var5.m22097O();
                int i14 = i2;
                if (zM22120g2 || objM22097O2 == p84Var5) {
                    objM22097O2 = AbstractC0278f.m1260j(new n84(0L));
                    tj3Var5.m22131l0(objM22097O2);
                }
                t66Var2 = (t66) objM22097O2;
                zM22120g3 = tj3Var5.m22120g(tokenPopupData3);
                objM22097O3 = tj3Var5.m22097O();
                if (zM22120g3 || objM22097O3 == p84Var5) {
                    objM22097O3 = AbstractC0278f.m1260j(PopupInteractionState.Idle);
                    tj3Var5.m22131l0(objM22097O3);
                }
                t66Var3 = (t66) objM22097O3;
                objM22097O4 = tj3Var5.m22097O();
                if (objM22097O4 == p84Var5) {
                    objM22097O4 = new C0059a(new gq6(0L), pk9.f56368m, null, 12);
                    tj3Var5.m22131l0(objM22097O4);
                }
                c0059a = (C0059a) objM22097O4;
                zM22120g4 = tj3Var5.m22120g(tokenPopupData3);
                objM22097O5 = tj3Var5.m22097O();
                if (zM22120g4 || objM22097O5 == p84Var5) {
                    objM22097O5 = AbstractC0278f.m1260j(Boolean.valueOf(z));
                    tj3Var5.m22131l0(objM22097O5);
                }
                t66Var4 = (t66) objM22097O5;
                zM22120g5 = tj3Var5.m22120g(tokenPopupData3);
                objM22097O6 = tj3Var5.m22097O();
                if (zM22120g5 || objM22097O6 == p84Var5) {
                    objM22097O6 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var5.m22131l0(objM22097O6);
                }
                t66Var5 = (t66) objM22097O6;
                final bg9 bg9VarM21698Y = ss5.m21698Y(0.75f, 400.0f, null, 4);
                final bg9 bg9VarM21698Y2 = ss5.m21698Y(0.95f, 200.0f, null, 4);
                final bg9 bg9VarM21698Y3 = ss5.m21698Y(0.75f, 400.0f, null, 4);
                bg9 bg9VarM21698Y4 = ss5.m21698Y(0.75f, 400.0f, null, 4);
                if (((PopupInteractionState) t66Var3.getValue()) != PopupInteractionState.AnimatingToDismiss || tokenPopupData3 == null) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                i5 = i14 & 112;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM22097O7 = tj3Var5.m22097O();
                if (z2 || objM22097O7 == p84Var5) {
                    objM22097O7 = new cx8(vi3Var2, 27);
                    tj3Var5.m22131l0(objM22097O7);
                }
                final dh9 dh9VarM750b = AbstractC0060b.m750b(f, bg9VarM21698Y4, "PopupAlpha", (vi3) objM22097O7, tj3Var5, 3120, 4);
                zM22122h = tj3Var5.m22122h(f5aVar5.f38444B) | tj3Var5.m22120g(tokenPopupData3) | tj3Var5.m22120g(w65Var2) | tj3Var5.m22116e(i12) | tj3Var5.m22120g(list2) | tj3Var5.m22120g(list);
                objM22097O8 = tj3Var5.m22097O();
                if (!zM22122h || objM22097O8 == p84Var5) {
                    if (i12 < 1) {
                        i12 = 1;
                    }
                    if (i12 > 2) {
                        i12 = 2;
                    }
                    z3 = z11;
                    tokenPopupData = tokenPopupData3;
                    w65Var = w65Var2;
                    i6 = i5;
                    t66Var6 = t66Var2;
                    t66Var7 = t66Var4;
                    p84Var = p84Var5;
                    fb2Var = fb2Var4;
                    t66Var8 = t66Var3;
                    f2 = f10;
                    i7 = i4;
                    tj3Var2 = tj3Var5;
                    f3 = fFloatValue2;
                    t66Var9 = t66Var;
                    f4 = f11;
                    c0059a2 = c0059a;
                    objM22097O8 = f5a.m11558a(f5aVar5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, m8703l(i12, list2), m8703l(i12, list), null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -393217, 2097151);
                    tj3Var2.m22131l0(objM22097O8);
                } else {
                    p84Var = p84Var5;
                    w65Var = w65Var2;
                    i6 = i5;
                    tokenPopupData = tokenPopupData3;
                    tj3Var2 = tj3Var5;
                    t66Var8 = t66Var3;
                    z3 = z11;
                    f4 = f11;
                    c0059a2 = c0059a;
                    f2 = f10;
                    i7 = i4;
                    f3 = fFloatValue2;
                    t66Var9 = t66Var;
                    t66Var6 = t66Var2;
                    t66Var7 = t66Var4;
                    fb2Var = fb2Var4;
                }
                f5a f5aVar6 = (f5a) objM22097O8;
                if (!((Boolean) t66Var5.getValue()).booleanValue() || tokenPopupData == null || z3 || w65Var == null || !f5aVar5.f38445C) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && z4) {
                    tj3Var2.m22111b0(-707218099);
                    t66Var10 = t66Var5;
                    t66Var11 = t66Var6;
                    boolean zM22120g9 = tj3Var2.m22120g(t66Var10) | tj3Var2.m22120g(t66Var11);
                    Object objM22097O22 = tj3Var2.m22097O();
                    p84Var2 = p84Var;
                    if (zM22120g9 || objM22097O22 == p84Var2) {
                        objM22097O22 = new px0(t66Var10, t66Var11, 2);
                        tj3Var2.m22131l0(objM22097O22);
                    }
                    z5 = false;
                    m8696e(f5aVar6, (zi3) objM22097O22, tj3Var2, 0);
                    tj3Var2.m22139q(false);
                } else {
                    t66Var10 = t66Var5;
                    t66Var11 = t66Var6;
                    p84Var2 = p84Var;
                    z5 = false;
                    tj3Var2.m22111b0(-707060495);
                    tj3Var2.m22139q(false);
                }
                Pair pair = f5aVar5.f38480l;
                tokenMeaning = (TokenMeaning) pair.f47623a;
                tokenPopupAnchor = (TokenPopupAnchor) pair.f47624b;
                t66Var12 = t66Var7;
                boolean zM22116e3 = tj3Var2.m22116e(tokenPopupAnchor.ordinal()) | tj3Var2.m22120g(t66Var12);
                i8 = i6;
                if (i8 == 32) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                f5 = f3;
                c0059a3 = c0059a2;
                zM22114d = zM22116e3 | z6 | tj3Var2.m22114d(fFloatValue) | tj3Var2.m22114d(f5) | tj3Var2.m22124i(c0059a3) | tj3Var2.m22124i(tokenMeaning);
                Object objM22097O23 = tj3Var2.m22097O();
                if (!zM22114d || objM22097O23 == p84Var2) {
                    f6 = fFloatValue;
                    f7 = f5;
                    c0059a4 = c0059a3;
                    tj3Var3 = tj3Var2;
                    tokenPopupContainerKt$TokenPopupContainer$2$1 = new TokenPopupContainerKt$TokenPopupContainer$2$1(tokenPopupAnchor, vi3Var, f6, f7, c0059a4, tokenMeaning, t66Var12, null);
                    tj3Var3.m22131l0(tokenPopupContainerKt$TokenPopupContainer$2$1);
                } else {
                    tj3Var3 = tj3Var2;
                    tokenPopupContainerKt$TokenPopupContainer$2$1 = objM22097O23;
                    f6 = fFloatValue;
                    f7 = f5;
                    c0059a4 = c0059a3;
                }
                d32.m10047k(tj3Var3, (zi3) tokenPopupContainerKt$TokenPopupContainer$2$1, tokenPopupAnchor);
                n84 n84Var = new n84(((n84) t66Var11.getValue()).f52482a);
                t66Var13 = t66Var9;
                boolean zM22124i2 = tj3Var3.m22124i(f5aVar5) | tj3Var3.m22120g(t66Var13) | tj3Var3.m22120g(t66Var11);
                fb2Var2 = fb2Var;
                f8 = f4;
                boolean zM22120g10 = zM22124i2 | tj3Var3.m22120g(fb2Var2) | tj3Var3.m22116e(iIntValue) | tj3Var3.m22114d(f8);
                f9 = f2;
                boolean zM22114d2 = zM22120g10 | tj3Var3.m22114d(f9);
                i9 = i7;
                boolean zM22116e4 = zM22114d2 | tj3Var3.m22116e(i9) | tj3Var3.m22114d(f6) | tj3Var3.m22114d(f7) | tj3Var3.m22124i(c0059a4) | tj3Var3.m22120g(t66Var12);
                t66Var14 = t66Var8;
                zM22120g6 = zM22116e4 | tj3Var3.m22120g(t66Var14);
                objM22097O9 = tj3Var3.m22097O();
                if (!zM22120g6 || objM22097O9 == p84Var2) {
                    tj3Var4 = tj3Var3;
                    f5aVar2 = f5aVar5;
                    t66 t66Var15 = t66Var11;
                    objM22097O9 = new TokenPopupContainerKt$TokenPopupContainer$3$1(f5aVar2, fb2Var2, f6, f7, c0059a4, t66Var13, t66Var15, iIntValue, f8, f9, i9, t66Var12, t66Var14, null);
                    fb2Var3 = fb2Var2;
                    t66Var11 = t66Var15;
                    t66Var12 = t66Var12;
                    tj3Var4.m22131l0(objM22097O9);
                } else {
                    fb2Var3 = fb2Var2;
                    f5aVar2 = f5aVar5;
                    tj3Var4 = tj3Var3;
                }
                tokenPopupData2 = tokenPopupData;
                d32.m10049l(tokenPopupData2, n84Var, (zi3) objM22097O9, tj3Var4);
                if (tokenPopupData2 != null || z3 || ((gq6) t66Var13.getValue()) == null || !((Boolean) t66Var10.getValue()).booleanValue() || n84.m17279a(((n84) t66Var11.getValue()).f52482a, 0L)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                objM22097O10 = tj3Var4.m22097O();
                p84Var3 = p84Var2;
                if (objM22097O10 == p84Var3) {
                    objM22097O10 = new l4a();
                    tj3Var4.m22131l0(objM22097O10);
                }
                l4aVar = (l4a) objM22097O10;
                zM22124i = tj3Var4.m22124i(f5aVar2) | tj3Var4.m22124i(l4aVar);
                objM22097O11 = tj3Var4.m22097O();
                if (zM22124i || objM22097O11 == p84Var3) {
                    objM22097O11 = new qk9(7, f5aVar2, l4aVar);
                    tj3Var4.m22131l0(objM22097O11);
                }
                d32.m10064x((ui3) objM22097O11, tj3Var4);
                f5aVar3 = l4aVar.f49055a;
                if (f5aVar3 != null || !z || !z3) {
                    f5aVar3 = null;
                }
                if (f5aVar3 == null) {
                    f5aVar4 = f5aVar2;
                } else {
                    f5aVar4 = f5aVar3;
                }
                if (!z || z7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.0f, 3);
                qv2 qv2VarM773h = AbstractC0070i.m773h(ss5.m21703b0(60, 0, null, 6), 2);
                final float f12 = f7;
                tj3 tj3Var6 = tj3Var4;
                final boolean z12 = z;
                final f5a f5aVar7 = f5aVar2;
                final float f13 = f6;
                final C0059a c0059a5 = c0059a4;
                final fb2 fb2Var5 = fb2Var3;
                aj3 aj3Var = new aj3() { // from class: g4a
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f14;
                        t66 t66Var16;
                        e16 e16VarM22061t;
                        ye1 ye1Var2 = (ye1) obj2;
                        ((Integer) obj3).getClass();
                        ((InterfaceC0067f) obj).getClass();
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        gc0 gc0Var = nj0.f52808c;
                        ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                        tj3 tj3Var7 = (tj3) ye1Var2;
                        int iHashCode = Long.hashCode(tj3Var7.f62385T);
                        l77 l77VarM22132m = tj3Var7.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(ye1Var2, e16VarM4411d);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3 tj3Var8 = (tj3) ye1Var2;
                        tj3Var8.m22119f0();
                        if (tj3Var8.f62384S) {
                            tj3Var8.m22130l(ui3Var);
                        } else {
                            tj3Var8.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(ye1Var2, zi3Var, ht5VarM19966d);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(ye1Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(ye1Var2, zi3Var3, numValueOf);
                        vi3 vi3Var3 = C0352b.f4305h;
                        oha.m18000f(ye1Var2, vi3Var3);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(ye1Var2, zi3Var4, e16VarM1322c);
                        Object objM22097O24 = tj3Var8.m22097O();
                        p84 p84Var6 = we1.f66679a;
                        if (objM22097O24 == p84Var6) {
                            objM22097O24 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var8.m22131l0(objM22097O24);
                        }
                        t66 t66Var17 = (t66) objM22097O24;
                        dh9 dh9VarM749a = AbstractC0060b.m749a(((Boolean) t66Var17.getValue()).booleanValue() ? 16.0f : 8.0f, bg9VarM21698Y3, "HighlightElevation", ye1Var2, 432, 8);
                        f5a f5aVar8 = f5aVar7;
                        TokenPopupData tokenPopupData4 = f5aVar8.f38475g;
                        t66 t66Var18 = t66Var12;
                        if (tokenPopupData4 == null || tokenPopupData4.f23441O) {
                            tj3Var8.m22111b0(-709108721);
                            tj3Var8.m22139q(false);
                        } else {
                            tj3Var8.m22111b0(-709186562);
                            AbstractC1899b.m8695d(((Boolean) t66Var17.getValue()).booleanValue(), AbstractC1899b.m8699h(t66Var18), ye1Var2, 0);
                            tj3Var8.m22139q(false);
                        }
                        C0059a c0059a6 = c0059a5;
                        long j = ((gq6) c0059a6.m745d()).f41189a;
                        Object objM22097O25 = tj3Var8.m22097O();
                        if (objM22097O25 == p84Var6) {
                            objM22097O25 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var8.m22131l0(objM22097O25);
                        }
                        t66 t66Var19 = (t66) objM22097O25;
                        boolean z13 = z12;
                        fb2 fb2Var6 = fb2Var5;
                        if (z13) {
                            tj3Var8.m22111b0(-708922628);
                            WeakHashMap weakHashMap2 = l6b.f49204w;
                            xj2 xj2Var = new xj2(fb2Var6.mo905T(ho5.m13397r(ye1Var2).f49207c.m21441e().f49119d) - 128.0f);
                            xj2 xj2Var2 = new xj2(0.0f);
                            if (xj2Var.compareTo(xj2Var2) < 0) {
                                xj2Var = xj2Var2;
                            }
                            tj3Var8.m22139q(false);
                            f14 = xj2Var.f68285a;
                        } else {
                            tj3Var8.m22111b0(-708712789);
                            tj3Var8.m22139q(false);
                            f14 = 0.0f;
                        }
                        boolean zM22118f = tj3Var8.m22118f(j);
                        Object objM22097O26 = tj3Var8.m22097O();
                        if (zM22118f || objM22097O26 == p84Var6) {
                            objM22097O26 = new C3405od(3, j);
                            tj3Var8.m22131l0(objM22097O26);
                        }
                        e16 e16VarM19527w = pvc.m19527w(b16Var, (vi3) objM22097O26);
                        boolean zM8699h = AbstractC1899b.m8699h(t66Var18);
                        t66 t66Var20 = t66Var11;
                        e16 e16VarM1407b = AbstractC0309d.m1407b(c99.m4426s(e16VarM19527w, zM8699h ? (int) (((nw4) a5bVar).m17654a() >> 32) : fb2Var6.mo905T((int) (((n84) t66Var20.getValue()).f52482a >> 32))), 0.0f, 0.0f, ((Number) dh9VarM750b.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 1048571);
                        Boolean bool = (Boolean) t66Var18.getValue();
                        bool.getClass();
                        boolean zM22120g11 = tj3Var8.m22120g(t66Var18);
                        float f15 = f14;
                        un1 un1Var2 = un1Var;
                        boolean zM22124i3 = zM22120g11 | tj3Var8.m22124i(un1Var2);
                        dr3 dr3Var2 = dr3Var;
                        boolean zM22124i4 = zM22124i3 | tj3Var8.m22124i(dr3Var2);
                        t66 t66Var21 = t66Var14;
                        boolean zM22120g12 = zM22124i4 | tj3Var8.m22120g(t66Var21) | tj3Var8.m22124i(c0059a6);
                        t66 t66Var22 = t66Var13;
                        boolean zM22120g13 = zM22120g12 | tj3Var8.m22120g(t66Var22);
                        int i15 = iIntValue;
                        boolean zM22116e5 = zM22120g13 | tj3Var8.m22116e(i15) | tj3Var8.m22120g(t66Var20);
                        float f16 = f12;
                        boolean zM22114d3 = zM22116e5 | tj3Var8.m22114d(f16);
                        float f17 = f13;
                        boolean zM22114d4 = zM22114d3 | tj3Var8.m22114d(f17);
                        vi3 vi3Var4 = vi3Var;
                        boolean zM22120g14 = zM22114d4 | tj3Var8.m22120g(vi3Var4) | tj3Var8.m22120g(fb2Var6);
                        Object objM22097O27 = tj3Var8.m22097O();
                        if (zM22120g14 || objM22097O27 == p84Var6) {
                            t66Var16 = t66Var18;
                            objM22097O27 = new C1898a(t66Var16, un1Var2, fb2Var6, dr3Var2, t66Var17, t66Var19, c0059a6, i15, fFloatValue3, fFloatValue4, fFloatValue5, f16, f17, bg9VarM21698Y2, bg9VarM21698Y, t66Var21, t66Var22, t66Var20, vi3Var4);
                            tj3Var8.m22131l0(objM22097O27);
                        } else {
                            t66Var16 = t66Var18;
                        }
                        e16 e16VarM13200b = hcd.m13200b(mo9.m16957a(e16VarM1407b, bool, (PointerInputEventHandler) objM22097O27), 2.0f);
                        ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                        int iHashCode2 = Long.hashCode(tj3Var8.f62385T);
                        l77 l77VarM22132m2 = tj3Var8.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(ye1Var2, e16VarM13200b);
                        tj3Var8.m22119f0();
                        if (tj3Var8.f62384S) {
                            tj3Var8.m22130l(ui3Var);
                        } else {
                            tj3Var8.m22137o0();
                        }
                        oha.m18001g(ye1Var2, zi3Var, ht5VarM19966d2);
                        oha.m18001g(ye1Var2, zi3Var2, l77VarM22132m2);
                        oha.m18001g(ye1Var2, zi3Var3, Integer.valueOf(iHashCode2));
                        oha.m18000f(ye1Var2, vi3Var3);
                        oha.m18001g(ye1Var2, zi3Var4, e16VarM1322c2);
                        if (z13) {
                            e16VarM22061t = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, f15, 7);
                        } else {
                            TokenPopupData tokenPopupData5 = f5aVar8.f38475g;
                            e16VarM22061t = (tokenPopupData5 != null ? tokenPopupData5.f23452h : null) == TokenControllerType.Vocabulary ? b16Var : thb.m22061t(b16Var);
                        }
                        boolean zBooleanValue = ((Boolean) t66Var16.getValue()).booleanValue();
                        float f18 = ((xj2) dh9VarM749a.getValue()).f68285a;
                        boolean zM22120g15 = tj3Var8.m22120g(r35);
                        Object objM22097O28 = tj3Var8.m22097O();
                        if (zM22120g15 || objM22097O28 == p84Var6) {
                            objM22097O28 = new cx8(vi3Var4, 26);
                            tj3Var8.m22131l0(objM22097O28);
                        }
                        AbstractC1900c.m8705a(e16VarM22061t, f5aVar4, zBooleanValue, z13, f18, (vi3) objM22097O28, ye1Var2, 6, 0);
                        tj3Var8.m22139q(true);
                        tj3Var8.m22139q(true);
                        return xfa.f68157a;
                    }
                };
                f5aVar5 = f5aVar7;
                vi3Var2 = vi3Var;
                tj3Var = tj3Var6;
                AbstractC0054a.m729d(z8, null, vs2VarM772g, qv2VarM773h, null, ci8.m4703P(1226262841, aj3Var, tj3Var), tj3Var, 200064, 18);
                c7a c7aVar = f5aVar5.f38464V;
                boolean zM22124i3 = tj3Var.m22124i(f5aVar5);
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zM22124i3 | z9;
                objM22097O12 = tj3Var.m22097O();
                if (z10) {
                    p84Var4 = p84Var3;
                } else {
                    p84Var4 = p84Var3;
                    if (objM22097O12 == p84Var4) {
                        i3 = 0;
                    }
                    ui3 ui3Var = (ui3) objM22097O12;
                    boolean zM22124i4 = tj3Var.m22124i(f5aVar5);
                    if (i8 == 32) {
                        i10 = 1;
                    } else {
                        i10 = i3;
                    }
                    i11 = i10 | (zM22124i4 ? 1 : 0);
                    objM22097O13 = tj3Var.m22097O();
                    if (i11 == 0 || objM22097O13 == p84Var4) {
                        objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                        tj3Var.m22131l0(objM22097O13);
                    }
                    AbstractC1915b.m8789b(c7aVar, ui3Var, (ui3) objM22097O13, tj3Var, i3);
                }
                i3 = 0;
                objM22097O12 = new h4a(f5aVar5, vi3Var2, 0);
                tj3Var.m22131l0(objM22097O12);
                ui3 ui3Var2 = (ui3) objM22097O12;
                boolean zM22124i5 = tj3Var.m22124i(f5aVar5);
                if (i8 == 32) {
                    i10 = 1;
                } else {
                    i10 = i3;
                }
                i11 = i10 | (zM22124i5 ? 1 : 0);
                objM22097O13 = tj3Var.m22097O();
                if (i11 == 0) {
                    objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                    tj3Var.m22131l0(objM22097O13);
                } else {
                    objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                    tj3Var.m22131l0(objM22097O13);
                }
                AbstractC1915b.m8789b(c7aVar, ui3Var2, (ui3) objM22097O13, tj3Var, i3);
            } else {
                i4 = iIntValue2;
            }
            zM22120g = tj3Var5.m22120g(tokenPopupData3);
            objM22097O = tj3Var5.m22097O();
            if (zM22120g) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var5.m22131l0(objM22097O);
            } else {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var5.m22131l0(objM22097O);
            }
            t66Var = (t66) objM22097O;
            zM22120g2 = tj3Var5.m22120g(tokenPopupData3);
            objM22097O2 = tj3Var5.m22097O();
            int i15 = i2;
            if (zM22120g2) {
                objM22097O2 = AbstractC0278f.m1260j(new n84(0L));
                tj3Var5.m22131l0(objM22097O2);
            } else {
                objM22097O2 = AbstractC0278f.m1260j(new n84(0L));
                tj3Var5.m22131l0(objM22097O2);
            }
            t66Var2 = (t66) objM22097O2;
            zM22120g3 = tj3Var5.m22120g(tokenPopupData3);
            objM22097O3 = tj3Var5.m22097O();
            if (zM22120g3) {
                objM22097O3 = AbstractC0278f.m1260j(PopupInteractionState.Idle);
                tj3Var5.m22131l0(objM22097O3);
            } else {
                objM22097O3 = AbstractC0278f.m1260j(PopupInteractionState.Idle);
                tj3Var5.m22131l0(objM22097O3);
            }
            t66Var3 = (t66) objM22097O3;
            objM22097O4 = tj3Var5.m22097O();
            if (objM22097O4 == p84Var5) {
                objM22097O4 = new C0059a(new gq6(0L), pk9.f56368m, null, 12);
                tj3Var5.m22131l0(objM22097O4);
            }
            c0059a = (C0059a) objM22097O4;
            zM22120g4 = tj3Var5.m22120g(tokenPopupData3);
            objM22097O5 = tj3Var5.m22097O();
            if (zM22120g4) {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.valueOf(z));
                tj3Var5.m22131l0(objM22097O5);
            } else {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.valueOf(z));
                tj3Var5.m22131l0(objM22097O5);
            }
            t66Var4 = (t66) objM22097O5;
            zM22120g5 = tj3Var5.m22120g(tokenPopupData3);
            objM22097O6 = tj3Var5.m22097O();
            if (zM22120g5) {
                objM22097O6 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var5.m22131l0(objM22097O6);
            } else {
                objM22097O6 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var5.m22131l0(objM22097O6);
            }
            t66Var5 = (t66) objM22097O6;
            final bg9 bg9VarM21698Y5 = ss5.m21698Y(0.75f, 400.0f, null, 4);
            final bg9 bg9VarM21698Y6 = ss5.m21698Y(0.95f, 200.0f, null, 4);
            final bg9 bg9VarM21698Y7 = ss5.m21698Y(0.75f, 400.0f, null, 4);
            bg9 bg9VarM21698Y8 = ss5.m21698Y(0.75f, 400.0f, null, 4);
            if (((PopupInteractionState) t66Var3.getValue()) != PopupInteractionState.AnimatingToDismiss) {
                f = 0.0f;
            } else {
                f = 0.0f;
            }
            i5 = i15 & 112;
            if (i5 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objM22097O7 = tj3Var5.m22097O();
            if (z2) {
                objM22097O7 = new cx8(vi3Var2, 27);
                tj3Var5.m22131l0(objM22097O7);
            } else {
                objM22097O7 = new cx8(vi3Var2, 27);
                tj3Var5.m22131l0(objM22097O7);
            }
            final dh9 dh9VarM750b2 = AbstractC0060b.m750b(f, bg9VarM21698Y8, "PopupAlpha", (vi3) objM22097O7, tj3Var5, 3120, 4);
            zM22122h = tj3Var5.m22122h(f5aVar5.f38444B) | tj3Var5.m22120g(tokenPopupData3) | tj3Var5.m22120g(w65Var2) | tj3Var5.m22116e(i12) | tj3Var5.m22120g(list2) | tj3Var5.m22120g(list);
            objM22097O8 = tj3Var5.m22097O();
            if (zM22122h) {
                if (i12 < 1) {
                    i12 = 1;
                }
                if (i12 > 2) {
                    i12 = 2;
                }
                z3 = z11;
                tokenPopupData = tokenPopupData3;
                w65Var = w65Var2;
                i6 = i5;
                t66Var6 = t66Var2;
                t66Var7 = t66Var4;
                p84Var = p84Var5;
                fb2Var = fb2Var4;
                t66Var8 = t66Var3;
                f2 = f10;
                i7 = i4;
                tj3Var2 = tj3Var5;
                f3 = fFloatValue2;
                t66Var9 = t66Var;
                f4 = f11;
                c0059a2 = c0059a;
                objM22097O8 = f5a.m11558a(f5aVar5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, m8703l(i12, list2), m8703l(i12, list), null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -393217, 2097151);
                tj3Var2.m22131l0(objM22097O8);
            } else {
                if (i12 < 1) {
                    i12 = 1;
                }
                if (i12 > 2) {
                    i12 = 2;
                }
                z3 = z11;
                tokenPopupData = tokenPopupData3;
                w65Var = w65Var2;
                i6 = i5;
                t66Var6 = t66Var2;
                t66Var7 = t66Var4;
                p84Var = p84Var5;
                fb2Var = fb2Var4;
                t66Var8 = t66Var3;
                f2 = f10;
                i7 = i4;
                tj3Var2 = tj3Var5;
                f3 = fFloatValue2;
                t66Var9 = t66Var;
                f4 = f11;
                c0059a2 = c0059a;
                objM22097O8 = f5a.m11558a(f5aVar5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, m8703l(i12, list2), m8703l(i12, list), null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -393217, 2097151);
                tj3Var2.m22131l0(objM22097O8);
            }
            f5a f5aVar8 = (f5a) objM22097O8;
            if (((Boolean) t66Var5.getValue()).booleanValue()) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z) {
                t66Var10 = t66Var5;
                t66Var11 = t66Var6;
                p84Var2 = p84Var;
                z5 = false;
                tj3Var2.m22111b0(-707060495);
                tj3Var2.m22139q(false);
            } else {
                t66Var10 = t66Var5;
                t66Var11 = t66Var6;
                p84Var2 = p84Var;
                z5 = false;
                tj3Var2.m22111b0(-707060495);
                tj3Var2.m22139q(false);
            }
            Pair pair2 = f5aVar5.f38480l;
            tokenMeaning = (TokenMeaning) pair2.f47623a;
            tokenPopupAnchor = (TokenPopupAnchor) pair2.f47624b;
            t66Var12 = t66Var7;
            boolean zM22116e5 = tj3Var2.m22116e(tokenPopupAnchor.ordinal()) | tj3Var2.m22120g(t66Var12);
            i8 = i6;
            if (i8 == 32) {
                z6 = true;
            } else {
                z6 = z5;
            }
            f5 = f3;
            c0059a3 = c0059a2;
            zM22114d = zM22116e5 | z6 | tj3Var2.m22114d(fFloatValue) | tj3Var2.m22114d(f5) | tj3Var2.m22124i(c0059a3) | tj3Var2.m22124i(tokenMeaning);
            Object objM22097O24 = tj3Var2.m22097O();
            if (zM22114d) {
                f6 = fFloatValue;
                f7 = f5;
                c0059a4 = c0059a3;
                tj3Var3 = tj3Var2;
                tokenPopupContainerKt$TokenPopupContainer$2$1 = new TokenPopupContainerKt$TokenPopupContainer$2$1(tokenPopupAnchor, vi3Var, f6, f7, c0059a4, tokenMeaning, t66Var12, null);
                tj3Var3.m22131l0(tokenPopupContainerKt$TokenPopupContainer$2$1);
            } else {
                f6 = fFloatValue;
                f7 = f5;
                c0059a4 = c0059a3;
                tj3Var3 = tj3Var2;
                tokenPopupContainerKt$TokenPopupContainer$2$1 = new TokenPopupContainerKt$TokenPopupContainer$2$1(tokenPopupAnchor, vi3Var, f6, f7, c0059a4, tokenMeaning, t66Var12, null);
                tj3Var3.m22131l0(tokenPopupContainerKt$TokenPopupContainer$2$1);
            }
            d32.m10047k(tj3Var3, (zi3) tokenPopupContainerKt$TokenPopupContainer$2$1, tokenPopupAnchor);
            n84 n84Var2 = new n84(((n84) t66Var11.getValue()).f52482a);
            t66Var13 = t66Var9;
            boolean zM22124i6 = tj3Var3.m22124i(f5aVar5) | tj3Var3.m22120g(t66Var13) | tj3Var3.m22120g(t66Var11);
            fb2Var2 = fb2Var;
            f8 = f4;
            boolean zM22120g11 = zM22124i6 | tj3Var3.m22120g(fb2Var2) | tj3Var3.m22116e(iIntValue) | tj3Var3.m22114d(f8);
            f9 = f2;
            boolean zM22114d3 = zM22120g11 | tj3Var3.m22114d(f9);
            i9 = i7;
            boolean zM22116e6 = zM22114d3 | tj3Var3.m22116e(i9) | tj3Var3.m22114d(f6) | tj3Var3.m22114d(f7) | tj3Var3.m22124i(c0059a4) | tj3Var3.m22120g(t66Var12);
            t66Var14 = t66Var8;
            zM22120g6 = zM22116e6 | tj3Var3.m22120g(t66Var14);
            objM22097O9 = tj3Var3.m22097O();
            if (zM22120g6) {
                tj3Var4 = tj3Var3;
                f5aVar2 = f5aVar5;
                t66 t66Var16 = t66Var11;
                objM22097O9 = new TokenPopupContainerKt$TokenPopupContainer$3$1(f5aVar2, fb2Var2, f6, f7, c0059a4, t66Var13, t66Var16, iIntValue, f8, f9, i9, t66Var12, t66Var14, null);
                fb2Var3 = fb2Var2;
                t66Var11 = t66Var16;
                t66Var12 = t66Var12;
                tj3Var4.m22131l0(objM22097O9);
            } else {
                tj3Var4 = tj3Var3;
                f5aVar2 = f5aVar5;
                t66 t66Var17 = t66Var11;
                objM22097O9 = new TokenPopupContainerKt$TokenPopupContainer$3$1(f5aVar2, fb2Var2, f6, f7, c0059a4, t66Var13, t66Var17, iIntValue, f8, f9, i9, t66Var12, t66Var14, null);
                fb2Var3 = fb2Var2;
                t66Var11 = t66Var17;
                t66Var12 = t66Var12;
                tj3Var4.m22131l0(objM22097O9);
            }
            tokenPopupData2 = tokenPopupData;
            d32.m10049l(tokenPopupData2, n84Var2, (zi3) objM22097O9, tj3Var4);
            if (tokenPopupData2 != null) {
                z7 = false;
            } else {
                z7 = false;
            }
            objM22097O10 = tj3Var4.m22097O();
            p84Var3 = p84Var2;
            if (objM22097O10 == p84Var3) {
                objM22097O10 = new l4a();
                tj3Var4.m22131l0(objM22097O10);
            }
            l4aVar = (l4a) objM22097O10;
            zM22124i = tj3Var4.m22124i(f5aVar2) | tj3Var4.m22124i(l4aVar);
            objM22097O11 = tj3Var4.m22097O();
            if (zM22124i) {
                objM22097O11 = new qk9(7, f5aVar2, l4aVar);
                tj3Var4.m22131l0(objM22097O11);
            } else {
                objM22097O11 = new qk9(7, f5aVar2, l4aVar);
                tj3Var4.m22131l0(objM22097O11);
            }
            d32.m10064x((ui3) objM22097O11, tj3Var4);
            f5aVar3 = l4aVar.f49055a;
            if (f5aVar3 != null) {
                f5aVar3 = null;
            } else {
                f5aVar3 = null;
            }
            if (f5aVar3 == null) {
                f5aVar4 = f5aVar2;
            } else {
                f5aVar4 = f5aVar3;
            }
            if (z) {
                z8 = true;
            } else {
                z8 = true;
            }
            vs2 vs2VarM772g2 = AbstractC0070i.m772g(null, 0.0f, 3);
            qv2 qv2VarM773h2 = AbstractC0070i.m773h(ss5.m21703b0(60, 0, null, 6), 2);
            final float f14 = f7;
            tj3 tj3Var7 = tj3Var4;
            final boolean z13 = z;
            final f5a f5aVar9 = f5aVar2;
            final float f15 = f6;
            final C0059a c0059a6 = c0059a4;
            final fb2 fb2Var6 = fb2Var3;
            aj3 aj3Var2 = new aj3() { // from class: g4a
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f16;
                    t66 t66Var18;
                    e16 e16VarM22061t;
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).getClass();
                    ((InterfaceC0067f) obj).getClass();
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    gc0 gc0Var = nj0.f52808c;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    tj3 tj3Var8 = (tj3) ye1Var2;
                    int iHashCode = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m = tj3Var8.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(ye1Var2, e16VarM4411d);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3 tj3Var9 = (tj3) ye1Var2;
                    tj3Var9.m22119f0();
                    if (tj3Var9.f62384S) {
                        tj3Var9.m22130l(ui3Var3);
                    } else {
                        tj3Var9.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(ye1Var2, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(ye1Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(ye1Var2, zi3Var3, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(ye1Var2, vi3Var3);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(ye1Var2, zi3Var4, e16VarM1322c);
                    Object objM22097O25 = tj3Var9.m22097O();
                    p84 p84Var6 = we1.f66679a;
                    if (objM22097O25 == p84Var6) {
                        objM22097O25 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var9.m22131l0(objM22097O25);
                    }
                    t66 t66Var19 = (t66) objM22097O25;
                    dh9 dh9VarM749a = AbstractC0060b.m749a(((Boolean) t66Var19.getValue()).booleanValue() ? 16.0f : 8.0f, bg9VarM21698Y7, "HighlightElevation", ye1Var2, 432, 8);
                    f5a f5aVar10 = f5aVar9;
                    TokenPopupData tokenPopupData4 = f5aVar10.f38475g;
                    t66 t66Var110 = t66Var12;
                    if (tokenPopupData4 == null || tokenPopupData4.f23441O) {
                        tj3Var9.m22111b0(-709108721);
                        tj3Var9.m22139q(false);
                    } else {
                        tj3Var9.m22111b0(-709186562);
                        AbstractC1899b.m8695d(((Boolean) t66Var19.getValue()).booleanValue(), AbstractC1899b.m8699h(t66Var110), ye1Var2, 0);
                        tj3Var9.m22139q(false);
                    }
                    C0059a c0059a7 = c0059a6;
                    long j = ((gq6) c0059a7.m745d()).f41189a;
                    Object objM22097O26 = tj3Var9.m22097O();
                    if (objM22097O26 == p84Var6) {
                        objM22097O26 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var9.m22131l0(objM22097O26);
                    }
                    t66 t66Var111 = (t66) objM22097O26;
                    boolean z14 = z13;
                    fb2 fb2Var7 = fb2Var6;
                    if (z14) {
                        tj3Var9.m22111b0(-708922628);
                        WeakHashMap weakHashMap2 = l6b.f49204w;
                        xj2 xj2Var = new xj2(fb2Var7.mo905T(ho5.m13397r(ye1Var2).f49207c.m21441e().f49119d) - 128.0f);
                        xj2 xj2Var2 = new xj2(0.0f);
                        if (xj2Var.compareTo(xj2Var2) < 0) {
                            xj2Var = xj2Var2;
                        }
                        tj3Var9.m22139q(false);
                        f16 = xj2Var.f68285a;
                    } else {
                        tj3Var9.m22111b0(-708712789);
                        tj3Var9.m22139q(false);
                        f16 = 0.0f;
                    }
                    boolean zM22118f = tj3Var9.m22118f(j);
                    Object objM22097O27 = tj3Var9.m22097O();
                    if (zM22118f || objM22097O27 == p84Var6) {
                        objM22097O27 = new C3405od(3, j);
                        tj3Var9.m22131l0(objM22097O27);
                    }
                    e16 e16VarM19527w = pvc.m19527w(b16Var, (vi3) objM22097O27);
                    boolean zM8699h = AbstractC1899b.m8699h(t66Var110);
                    t66 t66Var20 = t66Var11;
                    e16 e16VarM1407b = AbstractC0309d.m1407b(c99.m4426s(e16VarM19527w, zM8699h ? (int) (((nw4) a5bVar).m17654a() >> 32) : fb2Var7.mo905T((int) (((n84) t66Var20.getValue()).f52482a >> 32))), 0.0f, 0.0f, ((Number) dh9VarM750b2.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 1048571);
                    Boolean bool = (Boolean) t66Var110.getValue();
                    bool.getClass();
                    boolean zM22120g12 = tj3Var9.m22120g(t66Var110);
                    float f17 = f16;
                    un1 un1Var2 = un1Var;
                    boolean zM22124i7 = zM22120g12 | tj3Var9.m22124i(un1Var2);
                    dr3 dr3Var2 = dr3Var;
                    boolean zM22124i8 = zM22124i7 | tj3Var9.m22124i(dr3Var2);
                    t66 t66Var21 = t66Var14;
                    boolean zM22120g13 = zM22124i8 | tj3Var9.m22120g(t66Var21) | tj3Var9.m22124i(c0059a7);
                    t66 t66Var22 = t66Var13;
                    boolean zM22120g14 = zM22120g13 | tj3Var9.m22120g(t66Var22);
                    int i16 = iIntValue;
                    boolean zM22116e7 = zM22120g14 | tj3Var9.m22116e(i16) | tj3Var9.m22120g(t66Var20);
                    float f18 = f14;
                    boolean zM22114d4 = zM22116e7 | tj3Var9.m22114d(f18);
                    float f19 = f15;
                    boolean zM22114d5 = zM22114d4 | tj3Var9.m22114d(f19);
                    vi3 vi3Var4 = vi3Var;
                    boolean zM22120g15 = zM22114d5 | tj3Var9.m22120g(vi3Var4) | tj3Var9.m22120g(fb2Var7);
                    Object objM22097O28 = tj3Var9.m22097O();
                    if (zM22120g15 || objM22097O28 == p84Var6) {
                        t66Var18 = t66Var110;
                        objM22097O28 = new C1898a(t66Var18, un1Var2, fb2Var7, dr3Var2, t66Var19, t66Var111, c0059a7, i16, fFloatValue3, fFloatValue4, fFloatValue5, f18, f19, bg9VarM21698Y6, bg9VarM21698Y5, t66Var21, t66Var22, t66Var20, vi3Var4);
                        tj3Var9.m22131l0(objM22097O28);
                    } else {
                        t66Var18 = t66Var110;
                    }
                    e16 e16VarM13200b = hcd.m13200b(mo9.m16957a(e16VarM1407b, bool, (PointerInputEventHandler) objM22097O28), 2.0f);
                    ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                    int iHashCode2 = Long.hashCode(tj3Var9.f62385T);
                    l77 l77VarM22132m2 = tj3Var9.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(ye1Var2, e16VarM13200b);
                    tj3Var9.m22119f0();
                    if (tj3Var9.f62384S) {
                        tj3Var9.m22130l(ui3Var3);
                    } else {
                        tj3Var9.m22137o0();
                    }
                    oha.m18001g(ye1Var2, zi3Var, ht5VarM19966d2);
                    oha.m18001g(ye1Var2, zi3Var2, l77VarM22132m2);
                    oha.m18001g(ye1Var2, zi3Var3, Integer.valueOf(iHashCode2));
                    oha.m18000f(ye1Var2, vi3Var3);
                    oha.m18001g(ye1Var2, zi3Var4, e16VarM1322c2);
                    if (z14) {
                        e16VarM22061t = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, f17, 7);
                    } else {
                        TokenPopupData tokenPopupData5 = f5aVar10.f38475g;
                        e16VarM22061t = (tokenPopupData5 != null ? tokenPopupData5.f23452h : null) == TokenControllerType.Vocabulary ? b16Var : thb.m22061t(b16Var);
                    }
                    boolean zBooleanValue = ((Boolean) t66Var18.getValue()).booleanValue();
                    float f110 = ((xj2) dh9VarM749a.getValue()).f68285a;
                    boolean zM22120g16 = tj3Var9.m22120g(r35);
                    Object objM22097O29 = tj3Var9.m22097O();
                    if (zM22120g16 || objM22097O29 == p84Var6) {
                        objM22097O29 = new cx8(vi3Var4, 26);
                        tj3Var9.m22131l0(objM22097O29);
                    }
                    AbstractC1900c.m8705a(e16VarM22061t, f5aVar4, zBooleanValue, z14, f110, (vi3) objM22097O29, ye1Var2, 6, 0);
                    tj3Var9.m22139q(true);
                    tj3Var9.m22139q(true);
                    return xfa.f68157a;
                }
            };
            f5aVar5 = f5aVar9;
            vi3Var2 = vi3Var;
            tj3Var = tj3Var7;
            AbstractC0054a.m729d(z8, null, vs2VarM772g2, qv2VarM773h2, null, ci8.m4703P(1226262841, aj3Var2, tj3Var), tj3Var, 200064, 18);
            c7a c7aVar2 = f5aVar5.f38464V;
            boolean zM22124i7 = tj3Var.m22124i(f5aVar5);
            if (i8 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zM22124i7 | z9;
            objM22097O12 = tj3Var.m22097O();
            if (z10) {
                p84Var4 = p84Var3;
                if (objM22097O12 == p84Var4) {
                    i3 = 0;
                }
                ui3 ui3Var3 = (ui3) objM22097O12;
                boolean zM22124i8 = tj3Var.m22124i(f5aVar5);
                if (i8 == 32) {
                    i10 = 1;
                } else {
                    i10 = i3;
                }
                i11 = i10 | (zM22124i8 ? 1 : 0);
                objM22097O13 = tj3Var.m22097O();
                if (i11 == 0) {
                    objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                    tj3Var.m22131l0(objM22097O13);
                } else {
                    objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                    tj3Var.m22131l0(objM22097O13);
                }
                AbstractC1915b.m8789b(c7aVar2, ui3Var3, (ui3) objM22097O13, tj3Var, i3);
            } else {
                p84Var4 = p84Var3;
            }
            i3 = 0;
            objM22097O12 = new h4a(f5aVar5, vi3Var2, 0);
            tj3Var.m22131l0(objM22097O12);
            ui3 ui3Var4 = (ui3) objM22097O12;
            boolean zM22124i9 = tj3Var.m22124i(f5aVar5);
            if (i8 == 32) {
                i10 = 1;
            } else {
                i10 = i3;
            }
            i11 = i10 | (zM22124i9 ? 1 : 0);
            objM22097O13 = tj3Var.m22097O();
            if (i11 == 0) {
                objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                tj3Var.m22131l0(objM22097O13);
            } else {
                objM22097O13 = new h4a(f5aVar5, vi3Var2, 1);
                tj3Var.m22131l0(objM22097O13);
            }
            AbstractC1915b.m8789b(c7aVar2, ui3Var4, (ui3) objM22097O13, tj3Var, i3);
        } else {
            tj3Var = tj3Var5;
            i3 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new i4a(f5aVar5, vi3Var2, i, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m8699h(t66 t66Var) {
        return ((Boolean) t66Var.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static final void m8700i(f5a f5aVar, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        f5aVar.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(175695229);
        int i2 = (tj3Var.m22124i(f5aVar) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            m8694c(f5aVar, z, vi3Var, tj3Var, i2 & 1022);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new m4a(f5aVar, z, vi3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8701j(C1909e c1909e, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(16380250);
        int i2 = 4;
        int i3 = (tj3Var.m22124i(c1909e) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1909e.f23886X, tj3Var);
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            boolean zM22124i = tj3Var.m22124i(c1909e) | tj3Var.m22124i(ub5Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new TokenPopupContainerKt$TokenPopupRoute$1$1(c1909e, ub5Var, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, xfa.f68157a);
            f5a f5aVar = (f5a) t66VarM2513c.getValue();
            boolean zM22124i2 = tj3Var.m22124i(c1909e);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new fz4(c1909e, 3);
                tj3Var.m22131l0(objM22097O2);
            }
            m8698g(f5aVar, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dl9(c1909e, i, i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8702k(t66 t66Var, boolean z) {
        t66Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l */
    public static final List m8703l(int i, List list) {
        if (i <= 0 || list.size() >= i) {
            return list;
        }
        int i2 = 0;
        if (list.isEmpty()) {
            ArrayList arrayList = new ArrayList(i);
            while (i2 < i) {
                arrayList.add(new TokenMeaning(i2 - Integer.MIN_VALUE, null, "placeholder", 0, false, null, false, 0, 1018));
                i2++;
            }
            return arrayList;
        }
        TokenMeaning tokenMeaning = (TokenMeaning) u91.m22597O0(list);
        List list2 = list;
        int size = i - list.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i2 < size) {
            arrayList2.add(TokenMeaning.m8127a(tokenMeaning, i2 - Integer.MIN_VALUE, null, null, 1022));
            i2++;
        }
        return u91.m22603U0(arrayList2, list2);
    }

    /* JADX INFO: renamed from: m */
    public static final xc5 m8704m(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        long j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
        l44 l44VarM21713i = ss5.m21713i(ss5.m21691R("textShimmerInfinite", tj3Var, 0), 0.0f, 1000.0f, ss5.m21687N(ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, null, 6), null, 0L, 6), "textShimmer", tj3Var, 29112, 0);
        return ui0.m22747c(vi0.Companion, vz1.m23605K(new aa1(aa1.m198b(0.5f, j)), new aa1(aa1.m198b(1.0f, j)), new aa1(aa1.m198b(0.5f, j))), (((long) Float.floatToRawIntBits(((Number) l44VarM21713i.getValue()).floatValue() - 300.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) l44VarM21713i.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 8);
    }
}
