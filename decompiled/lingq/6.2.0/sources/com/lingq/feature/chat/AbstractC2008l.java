package com.lingq.feature.chat;

import android.graphics.Color;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.feature.chat.AbstractC2008l;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import p000.AbstractC3122is;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C0812bj;
import p000.C3180kd;
import p000.C3368nd;
import p000.C3587su;
import p000.C3661uu;
import p000.aa1;
import p000.ab1;
import p000.aj3;
import p000.as4;
import p000.aw0;
import p000.b16;
import p000.bb1;
import p000.bj3;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.d87;
import p000.dh9;
import p000.dy0;
import p000.e16;
import p000.e28;
import p000.ec0;
import p000.eh0;
import p000.ey0;
import p000.fa4;
import p000.fe9;
import p000.g54;
import p000.ge9;
import p000.gm5;
import p000.ho5;
import p000.hy0;
import p000.ia4;
import p000.io2;
import p000.jk0;
import p000.jt3;
import p000.jv0;
import p000.jw0;
import p000.jy0;
import p000.l44;
import p000.l6b;
import p000.l77;
import p000.ly0;
import p000.ms5;
import p000.n20;
import p000.n84;
import p000.nj0;
import p000.ny0;
import p000.nz9;
import p000.oha;
import p000.omd;
import p000.oy0;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.ps5;
import p000.qj8;
import p000.r46;
import p000.s70;
import p000.se0;
import p000.se1;
import p000.si8;
import p000.sj8;
import p000.ss5;
import p000.sy0;
import p000.t17;
import p000.t31;
import p000.t66;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.tx0;
import p000.ty0;
import p000.u1d;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.ux5;
import p000.uy0;
import p000.vi3;
import p000.vk9;
import p000.vs3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.xc9;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.chat.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2008l {
    /* JADX WARN: Code duplicated, block: B:183:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:184:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:191:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:192:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:196:0x0503  */
    /* JADX WARN: Code duplicated, block: B:199:0x0513  */
    /* JADX WARN: Code duplicated, block: B:200:0x0515  */
    /* JADX WARN: Code duplicated, block: B:206:0x052a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0552  */
    /* JADX WARN: Code duplicated, block: B:215:0x0563  */
    /* JADX WARN: Code duplicated, block: B:216:0x0565  */
    /* JADX WARN: Code duplicated, block: B:220:0x056e  */
    /* JADX WARN: Code duplicated, block: B:223:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:225:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:231:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:234:0x0696  */
    /* JADX WARN: Code duplicated, block: B:235:0x069a  */
    /* JADX WARN: Code duplicated, block: B:238:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:240:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:241:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:244:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:245:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:248:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:251:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:252:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:256:0x0715  */
    /* JADX WARN: Code duplicated, block: B:258:0x072c  */
    /* JADX WARN: Code duplicated, block: B:259:0x072e  */
    /* JADX WARN: Code duplicated, block: B:263:0x073c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0771  */
    /* JADX WARN: Code duplicated, block: B:273:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:277:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:280:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:282:0x080d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0811  */
    /* JADX WARN: Code duplicated, block: B:288:0x0820  */
    /* JADX WARN: Code duplicated, block: B:291:0x0844  */
    /* JADX WARN: Code duplicated, block: B:292:0x0846  */
    /* JADX WARN: Code duplicated, block: B:296:0x0854  */
    /* JADX WARN: Code duplicated, block: B:299:0x086c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0883  */
    /* JADX INFO: renamed from: a */
    public static final void m8910a(e16 e16Var, nz9 nz9Var, int i, final jw0 jw0Var, String str, String str2, boolean z, boolean z2, final jv0 jv0Var, ye1 ye1Var, int i2, int i3) {
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        boolean z3;
        int i7;
        int i8;
        tj3 tj3Var;
        boolean z4;
        String str5;
        String str6;
        boolean z5;
        Object c2006j;
        String str7;
        int i9;
        int i10;
        jv0 jv0Var2;
        t66 t66Var;
        C0059a c0059a;
        int i11;
        t66 t66Var2;
        p84 p84Var;
        boolean z6;
        boolean zM22124i;
        Object objM22097O;
        int i12;
        boolean z7;
        Object objM22097O2;
        boolean z8;
        boolean zM22124i2;
        Object objM22097O3;
        boolean zM22120g;
        Object objM22097O4;
        boolean z9;
        Object objM22097O5;
        p84 p84Var2;
        boolean z10;
        int i13;
        jv0 jv0Var3;
        p84 p84Var3;
        String str8;
        boolean z11;
        boolean zM22120g2;
        Object objM22097O6;
        boolean z12;
        tj3 tj3Var2;
        boolean z13;
        boolean z14;
        boolean zM22116e;
        Object objM22097O7;
        boolean z15;
        boolean zM22116e2;
        Object objM22097O8;
        boolean z16;
        boolean z17;
        boolean zM22120g3;
        Object objM22097O9;
        boolean z18 = jw0Var.f46249j;
        TranslationState translationState = jw0Var.f46246g;
        final ChatMessage chatMessage = jw0Var.f46240a;
        nz9Var.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(44252646);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var3.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i4 | (tj3Var3.m22124i(nz9Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i14 |= tj3Var3.m22116e(i) ? 256 : 128;
        }
        int i15 = i14 | (tj3Var3.m22124i(jw0Var) ? 2048 : 1024);
        int i16 = i3 & 16;
        if (i16 != 0) {
            i5 = i15 | 24576;
            str3 = str;
        } else {
            str3 = str;
            i5 = i15 | (tj3Var3.m22120g(str3) ? 16384 : 8192);
        }
        int i17 = i3 & 32;
        if (i17 != 0) {
            i6 = i5 | 196608;
            str4 = str2;
        } else {
            str4 = str2;
            i6 = i5 | (tj3Var3.m22120g(str4) ? 131072 : 65536);
        }
        int i18 = i3 & 64;
        if (i18 != 0) {
            i7 = i6 | 1572864;
            z3 = z;
        } else {
            z3 = z;
            i7 = i6 | (tj3Var3.m22122h(z3) ? 1048576 : 524288);
        }
        int i19 = i3 & 128;
        if (i19 != 0) {
            i8 = i7 | 12582912;
        } else {
            i8 = i7 | (tj3Var3.m22122h(z2) ? 8388608 : 4194304);
        }
        int i20 = i8 | (tj3Var3.m22120g(jv0Var) ? 67108864 : 33554432);
        if (tj3Var3.m22099R(i20 & 1, (i20 & 38347923) != 38347922)) {
            String str9 = i16 != 0 ? "" : str3;
            String str10 = i17 == 0 ? str4 : "";
            boolean z19 = i18 != 0 ? true : z3;
            boolean z20 = i19 != 0 ? false : z2;
            boolean z21 = jw0Var.f46251l;
            boolean z22 = jw0Var.f46250k && !z21;
            String str11 = chatMessage.f18923d;
            String str12 = chatMessage.f18925f;
            boolean zM22120g4 = tj3Var3.m22120g(str11);
            Object objM22097O10 = tj3Var3.m22097O();
            String str13 = str10;
            p84 p84Var4 = we1.f66679a;
            if (zM22120g4 || objM22097O10 == p84Var4) {
                objM22097O10 = vk9.m23377M0(chatMessage.f18923d).toString();
                tj3Var3.m22131l0(objM22097O10);
            }
            String str14 = (String) objM22097O10;
            int i21 = chatMessage.f18920a;
            boolean z23 = (z22 || z21) ? false : true;
            boolean zM22116e3 = tj3Var3.m22116e(i21);
            Object objM22097O11 = tj3Var3.m22097O();
            if (zM22116e3 || objM22097O11 == p84Var4) {
                objM22097O11 = AbstractC0278f.m1260j(Boolean.valueOf(z23));
                tj3Var3.m22131l0(objM22097O11);
            }
            t66 t66Var3 = (t66) objM22097O11;
            boolean zM22116e4 = tj3Var3.m22116e(i21);
            Object objM22097O12 = tj3Var3.m22097O();
            String str15 = str9;
            if (zM22116e4 || objM22097O12 == p84Var4) {
                objM22097O12 = AbstractC3489q9.m19771a(z23 ? 1.0f : 0.0f);
                tj3Var3.m22131l0(objM22097O12);
            }
            C0059a c0059a2 = (C0059a) objM22097O12;
            t31 t31Var = (t31) tj3Var3.m22128k(AbstractC0402n.f4814f);
            Object objM22097O13 = tj3Var3.m22097O();
            if (objM22097O13 == p84Var4) {
                objM22097O13 = d32.m10013K(tj3Var3);
                tj3Var3.m22131l0(objM22097O13);
            }
            un1 un1Var = (un1) objM22097O13;
            boolean zM22116e5 = tj3Var3.m22116e(chatMessage.f18920a);
            Object objM22097O14 = tj3Var3.m22097O();
            if (zM22116e5 || objM22097O14 == p84Var4) {
                objM22097O14 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var3.m22131l0(objM22097O14);
            }
            t66 t66Var4 = (t66) objM22097O14;
            boolean z24 = z22;
            boolean zM22116e6 = tj3Var3.m22116e(chatMessage.f18920a);
            Object objM22097O15 = tj3Var3.m22097O();
            if (zM22116e6 || objM22097O15 == p84Var4) {
                objM22097O15 = AbstractC0278f.m1260j(new ia4());
                tj3Var3.m22131l0(objM22097O15);
            }
            t66 t66Var5 = (t66) objM22097O15;
            boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
            e28 e28Var = ((ia4) t66Var5.getValue()).f43856b;
            String str16 = ((ia4) t66Var5.getValue()).f43855a;
            int i22 = i20 & 234881024;
            boolean zM22120g5 = tj3Var3.m22120g(t66Var4) | (i22 == 67108864) | tj3Var3.m22124i(un1Var) | tj3Var3.m22124i(t31Var);
            Object objM22097O16 = tj3Var3.m22097O();
            if (zM22120g5 || objM22097O16 == p84Var4) {
                str7 = str16;
                i9 = i20;
                i10 = 2;
                jv0Var2 = jv0Var;
                c2006j = new C2006j(jv0Var2, un1Var, t66Var4, t31Var, 0);
                t66Var = t66Var4;
                tj3Var3.m22131l0(c2006j);
            } else {
                jv0Var2 = jv0Var;
                c2006j = objM22097O16;
                str7 = str16;
                i9 = i20;
                t66Var = t66Var4;
                i10 = 2;
            }
            vi3 vi3Var = (vi3) c2006j;
            boolean zM22120g6 = tj3Var3.m22120g(t66Var) | (i22 == 67108864);
            Object objM22097O17 = tj3Var3.m22097O();
            if (zM22120g6 || objM22097O17 == p84Var4) {
                objM22097O17 = new hy0(jv0Var2, t66Var, 1);
                tj3Var3.m22131l0(objM22097O17);
            }
            t66 t66Var6 = t66Var;
            u1d.m22390a(zBooleanValue, e28Var, str7, vi3Var, null, (ui3) objM22097O17, tj3Var3, 0, 16);
            TranslationState translationState2 = TranslationState.Showing;
            boolean z25 = translationState == translationState2 && vk9.m23391n0(str12);
            final l44 l44VarM21713i = ss5.m21713i(ss5.m21691R("translationPulse", tj3Var3, 0), 1.0f, 0.3f, ss5.m21687N(ss5.m21703b0(620, 0, io2.f44352d, i10), RepeatMode.Reverse, 0L, 4), "translationPulseAlpha", tj3Var3, 29112, 0);
            t66 t66VarM1263m = AbstractC0278f.m1263m(str14, tj3Var3);
            Object[] objArr = {Integer.valueOf(i21), Boolean.valueOf((boolean) r18), Boolean.valueOf(z24), Boolean.valueOf(str14.length() == 0)};
            boolean zM22122h = (i22 == 67108864) | tj3Var3.m22122h(z21) | tj3Var3.m22120g(t66VarM1263m) | tj3Var3.m22124i(c0059a2) | tj3Var3.m22122h(z24) | tj3Var3.m22120g(str14) | tj3Var3.m22120g(t66Var3) | tj3Var3.m22116e(i21);
            Object objM22097O18 = tj3Var3.m22097O();
            if (zM22122h || objM22097O18 == p84Var4) {
                c0059a = c0059a2;
                ChatSessionScreenKt$ChatMessageTutorItem$3$1 chatSessionScreenKt$ChatMessageTutorItem$3$1 = new ChatSessionScreenKt$ChatMessageTutorItem$3$1(z21, z24, str14, c0059a, jv0Var, i21, t66VarM1263m, t66Var3, null);
                i11 = i21;
                t66Var2 = t66Var3;
                tj3Var3.m22131l0(chatSessionScreenKt$ChatMessageTutorItem$3$1);
                objM22097O18 = chatSessionScreenKt$ChatMessageTutorItem$3$1;
            } else {
                c0059a = c0059a2;
                i11 = i21;
                t66Var2 = t66Var3;
            }
            d32.m10053n(objArr, (zi3) objM22097O18, tj3Var3);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
            si8 si8Var = p58.m18901i(tj3Var3).f64857c;
            b16 b16Var = b16.f7762a;
            final t66 t66Var7 = t66Var2;
            C0059a c0059a3 = c0059a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC3122is.m14092f(AbstractC3584sr.m21609V(pb1.m19045o(b16Var, si8Var), 0.0f, ge9.m12515a(tj3Var3).f38955d, 1), ss5.m21698Y(0.0f, 10000.0f, new n84(300647710790L), 1), 2), ge9.m12515a(tj3Var3).f38955d, ge9.m12515a(tj3Var3).f38952a);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m2 = tj3Var3.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
            vs3 vs3Var = nz9Var.f53461g;
            TextHighlightStyle textHighlightStyle = nz9Var.f53462h;
            List list = jw0Var.f46241b;
            List list2 = jw0Var.f46242c;
            d87 d87Var = jw0Var.f46243d;
            Integer num = jw0Var.f46244e;
            Integer num2 = jw0Var.f46245f;
            int i23 = nz9Var.f53455a;
            boolean z26 = nz9Var.f53463i;
            double d = nz9Var.f53456b;
            if (z26 && d < 1.15d) {
                d = 1.15d;
            }
            double d2 = d;
            ReaderFont readerFont = nz9Var.f53458d;
            String str17 = jw0Var.f46253n;
            final int i24 = i11;
            jt3 jt3Var = new jt3(i, str14, list, list2, d87Var, false, textHighlightStyle, vs3Var, num, num2, true, i23, d2, readerFont, str17, AbstractC3184kh.m15194A(str17), false, null, z20, null, null, null, ((Number) c0059a3.m745d()).floatValue(), 8060960);
            vx9 vx9Var = p58.m18902j(tj3Var3).f71406j;
            boolean zM22124i3 = (i22 == 67108864) | tj3Var3.m22124i(chatMessage);
            Object objM22097O19 = tj3Var3.m22097O();
            if (zM22124i3) {
                p84Var = p84Var4;
            } else {
                p84Var = p84Var4;
                if (objM22097O19 == p84Var) {
                }
                bj3 bj3Var = (bj3) objM22097O19;
                if (i22 != 67108864) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                zM22124i = z6 | tj3Var3.m22124i(chatMessage);
                objM22097O = tj3Var3.m22097O();
                i12 = 6;
                if (zM22124i || objM22097O == p84Var) {
                    objM22097O = new C3180kd(i12, jv0Var, chatMessage);
                    tj3Var3.m22131l0(objM22097O);
                }
                aj3 aj3Var = (aj3) objM22097O;
                if (i22 != 67108864) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                objM22097O2 = tj3Var3.m22097O();
                if (z7 || objM22097O2 == p84Var) {
                    objM22097O2 = new aw0(jv0Var, 4);
                    tj3Var3.m22131l0(objM22097O2);
                }
                ui3 ui3Var2 = (ui3) objM22097O2;
                if (i22 != 67108864) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                zM22124i2 = z8 | tj3Var3.m22124i(chatMessage);
                objM22097O3 = tj3Var3.m22097O();
                if (zM22124i2 || objM22097O3 == p84Var) {
                    objM22097O3 = new s70(21, jv0Var, chatMessage);
                    tj3Var3.m22131l0(objM22097O3);
                }
                vi3 vi3Var3 = (vi3) objM22097O3;
                zM22120g = tj3Var3.m22120g(t66Var5) | tj3Var3.m22120g(t66Var6);
                objM22097O4 = tj3Var3.m22097O();
                if (zM22120g || objM22097O4 == p84Var) {
                    objM22097O4 = new n20(t66Var5, t66Var6, 2);
                    tj3Var3.m22131l0(objM22097O4);
                }
                vi3 vi3Var4 = (vi3) objM22097O4;
                if (i22 != 67108864) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                objM22097O5 = tj3Var3.m22097O();
                if (z9 || objM22097O5 == p84Var) {
                    objM22097O5 = new aw0(jv0Var, 5);
                    tj3Var3.m22131l0(objM22097O5);
                }
                p84Var2 = p84Var;
                AbstractC1932c.m8799a(jt3Var, vx9Var, null, bj3Var, aj3Var, ui3Var2, vi3Var3, vi3Var4, (ui3) objM22097O5, null, tj3Var3, 8, 516);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(ux5.m22984g(b16Var, ge9.m12515a(tj3Var3).f38952a, tj3Var3, b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38955d, 1);
                bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
                int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m3 = tj3Var3.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, bb1VarM230a3);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                if (translationState == translationState2 || vk9.m23391n0(str12)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                AbstractC0054a.m731f(z10, null, AbstractC0070i.m772g(ss5.m21703b0(240, 0, null, 6), 0.0f, 2).m23531a(AbstractC0070i.m770e(ss5.m21703b0(240, 0, null, 6), 14)), AbstractC0070i.m773h(ss5.m21703b0(240, 0, null, 6), 2).m20180a(AbstractC0070i.m776k(ss5.m21703b0(240, 0, null, 6), 14)), null, ci8.m4703P(-2079758484, new C3180kd(7, chatMessage, str15), tj3Var3), tj3Var3, 1600518, 18);
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38957f, true, new gm5(28)), nj0.f52789H, tj3Var3, 48);
                int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m4 = tj3Var3.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                if (z19) {
                    tj3Var3.m22111b0(-1832590634);
                    if (i22 != 67108864) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if ((i9 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    str8 = str14;
                    zM22120g3 = z16 | z17 | tj3Var3.m22120g(str8);
                    objM22097O9 = tj3Var3.m22097O();
                    if (zM22120g3) {
                        p84Var3 = p84Var2;
                    } else {
                        p84Var3 = p84Var2;
                        if (objM22097O9 == p84Var3) {
                            i13 = i;
                            jv0Var3 = jv0Var;
                        }
                        omd.m18141c((ui3) objM22097O9, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(1048614791, new C0812bj(1, t66Var7), tj3Var3), tj3Var3, 1572912, 60);
                        tj3Var3.m22139q(false);
                    }
                    i13 = i;
                    jv0Var3 = jv0Var;
                    objM22097O9 = new jy0(jv0Var3, i13, str8);
                    tj3Var3.m22131l0(objM22097O9);
                    omd.m18141c((ui3) objM22097O9, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(1048614791, new C0812bj(1, t66Var7), tj3Var3), tj3Var3, 1572912, 60);
                    tj3Var3.m22139q(false);
                } else {
                    i13 = i;
                    jv0Var3 = jv0Var;
                    p84Var3 = p84Var2;
                    str8 = str14;
                    tj3Var3.m22111b0(-1831625790);
                    tj3Var3.m22139q(false);
                }
                if (i22 != 67108864) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zM22120g2 = z11 | tj3Var3.m22120g(str8);
                objM22097O6 = tj3Var3.m22097O();
                if (zM22120g2 || objM22097O6 == p84Var3) {
                    objM22097O6 = new jy0(jv0Var3, str8);
                    tj3Var3.m22131l0(objM22097O6);
                }
                omd.m18141c((ui3) objM22097O6, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(-1600016638, new C0812bj(2, r48), tj3Var3), tj3Var3, 1572912, 60);
                if (chatMessage.f18925f.length() > 0 && !z25) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                final int i25 = i13;
                final jv0 jv0Var4 = jv0Var3;
                final boolean z27 = z25;
                AbstractC0054a.m730e(z12, null, null, null, null, ci8.m4703P(-449514360, new aj3() { // from class: ky0
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ((InterfaceC0067f) obj).getClass();
                        tj3 tj3Var4 = (tj3) ((ye1) obj2);
                        jv0 jv0Var5 = jv0Var4;
                        boolean zM22124i4 = tj3Var4.m22124i(jv0Var5);
                        int i26 = i25;
                        boolean zM22116e7 = zM22124i4 | tj3Var4.m22116e(i26);
                        ChatMessage chatMessage2 = chatMessage;
                        boolean zM22124i5 = zM22116e7 | tj3Var4.m22124i(chatMessage2);
                        Object objM22097O20 = tj3Var4.m22097O();
                        if (zM22124i5 || objM22097O20 == we1.f66679a) {
                            objM22097O20 = new by0(jv0Var5, i26, chatMessage2, 1);
                            tj3Var4.m22131l0(objM22097O20);
                        }
                        omd.m18141c((ui3) objM22097O20, c99.m4422o(b16.f7762a, 18.0f), false, null, null, ci8.m4703P(-62902742, new py0(0, l44VarM21713i, jw0Var, t66Var7, z27), tj3Var4), tj3Var4, 1572912, 60);
                        return xfa.f68157a;
                    }
                }, tj3Var3), tj3Var3, 1572870, 30);
                tj3Var2 = tj3Var3;
                AbstractC0054a.m730e(!chatMessage.f18924e.isEmpty(), null, null, null, null, ci8.m4703P(-1515321039, new ly0(jv0Var, i, chatMessage, jw0Var, t66Var7, 0), tj3Var3), tj3Var2, 1572870, 30);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                thb.m22044c(tj3Var2, new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                if (((Boolean) t66Var7.getValue()).booleanValue()) {
                    tj3Var2.m22111b0(-1827954336);
                    ChatMessageRating chatMessageRating = ChatMessageRating.Like;
                    ChatMessageRating chatMessageRating2 = jw0Var.f46248i;
                    boolean z28 = !z18;
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.chat_rate_message_helpful);
                    if (i22 != 67108864) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    zM22116e = z14 | tj3Var2.m22116e(i24);
                    objM22097O7 = tj3Var2.m22097O();
                    if (zM22116e || objM22097O7 == p84Var3) {
                        final int i26 = 0;
                        objM22097O7 = new ui3() { // from class: my0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i27 = i26;
                                xfa xfaVar = xfa.f68157a;
                                int i28 = i24;
                                jv0 jv0Var5 = jv0Var;
                                switch (i27) {
                                    case 0:
                                        jv0Var5.mo8870D(i28, ChatMessageRating.Like);
                                        break;
                                    default:
                                        jv0Var5.mo8870D(i28, ChatMessageRating.Dislike);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O7);
                    }
                    m8915f(chatMessageRating, chatMessageRating2, z28, strM23620a0, (ui3) objM22097O7, tj3Var2, 6);
                    ChatMessageRating chatMessageRating3 = ChatMessageRating.Dislike;
                    ChatMessageRating chatMessageRating4 = jw0Var.f46248i;
                    boolean z29 = !z18;
                    String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.chat_rate_message_unhelpful);
                    if (i22 != 67108864) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    zM22116e2 = z15 | tj3Var2.m22116e(i24);
                    objM22097O8 = tj3Var2.m22097O();
                    if (zM22116e2 || objM22097O8 == p84Var3) {
                        final int i27 = 1;
                        objM22097O8 = new ui3() { // from class: my0
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i28 = i27;
                                xfa xfaVar = xfa.f68157a;
                                int i29 = i24;
                                jv0 jv0Var5 = jv0Var;
                                switch (i28) {
                                    case 0:
                                        jv0Var5.mo8870D(i29, ChatMessageRating.Like);
                                        break;
                                    default:
                                        jv0Var5.mo8870D(i29, ChatMessageRating.Dislike);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O8);
                    }
                    m8915f(chatMessageRating3, chatMessageRating4, z29, strM23620a1, (ui3) objM22097O8, tj3Var2, 6);
                    tj3Var2 = tj3Var2;
                    z13 = false;
                    tj3Var2.m22139q(false);
                } else {
                    z13 = false;
                    tj3Var2.m22111b0(-1826753086);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(true);
                if (jw0Var.f46247h == PhrasesState.Showing) {
                    z13 = true;
                }
                boolean z30 = z19;
                tj3 tj3Var4 = tj3Var2;
                AbstractC0054a.m731f(z13, null, null, null, null, ci8.m4703P(328316578, new ny0(str13, jw0Var, jv0Var, chatMessage, nz9Var, z30), tj3Var2), tj3Var4, 1572870, 30);
                tj3Var = tj3Var4;
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                z5 = z30;
                str6 = str13;
                z4 = z20;
                str5 = str15;
            }
            objM22097O19 = new jk0(1, jv0Var, chatMessage);
            tj3Var3.m22131l0(objM22097O19);
            bj3 bj3Var2 = (bj3) objM22097O19;
            if (i22 != 67108864) {
                z6 = false;
            } else {
                z6 = true;
            }
            zM22124i = z6 | tj3Var3.m22124i(chatMessage);
            objM22097O = tj3Var3.m22097O();
            i12 = 6;
            if (zM22124i) {
                objM22097O = new C3180kd(i12, jv0Var, chatMessage);
                tj3Var3.m22131l0(objM22097O);
            } else {
                objM22097O = new C3180kd(i12, jv0Var, chatMessage);
                tj3Var3.m22131l0(objM22097O);
            }
            aj3 aj3Var2 = (aj3) objM22097O;
            if (i22 != 67108864) {
                z7 = false;
            } else {
                z7 = true;
            }
            objM22097O2 = tj3Var3.m22097O();
            if (z7) {
                objM22097O2 = new aw0(jv0Var, 4);
                tj3Var3.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new aw0(jv0Var, 4);
                tj3Var3.m22131l0(objM22097O2);
            }
            ui3 ui3Var3 = (ui3) objM22097O2;
            if (i22 != 67108864) {
                z8 = false;
            } else {
                z8 = true;
            }
            zM22124i2 = z8 | tj3Var3.m22124i(chatMessage);
            objM22097O3 = tj3Var3.m22097O();
            if (zM22124i2) {
                objM22097O3 = new s70(21, jv0Var, chatMessage);
                tj3Var3.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new s70(21, jv0Var, chatMessage);
                tj3Var3.m22131l0(objM22097O3);
            }
            vi3 vi3Var5 = (vi3) objM22097O3;
            zM22120g = tj3Var3.m22120g(t66Var5) | tj3Var3.m22120g(t66Var6);
            objM22097O4 = tj3Var3.m22097O();
            if (zM22120g) {
                objM22097O4 = new n20(t66Var5, t66Var6, 2);
                tj3Var3.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new n20(t66Var5, t66Var6, 2);
                tj3Var3.m22131l0(objM22097O4);
            }
            vi3 vi3Var6 = (vi3) objM22097O4;
            if (i22 != 67108864) {
                z9 = false;
            } else {
                z9 = true;
            }
            objM22097O5 = tj3Var3.m22097O();
            if (z9) {
                objM22097O5 = new aw0(jv0Var, 5);
                tj3Var3.m22131l0(objM22097O5);
            } else {
                objM22097O5 = new aw0(jv0Var, 5);
                tj3Var3.m22131l0(objM22097O5);
            }
            p84Var2 = p84Var;
            AbstractC1932c.m8799a(jt3Var, vx9Var, null, bj3Var2, aj3Var2, ui3Var3, vi3Var5, vi3Var6, (ui3) objM22097O5, null, tj3Var3, 8, 516);
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(ux5.m22984g(b16Var, ge9.m12515a(tj3Var3).f38952a, tj3Var3, b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38955d, 1);
            bb1 bb1VarM230a4 = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
            int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m5 = tj3Var3.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V2);
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var, bb1VarM230a4);
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c5);
            if (translationState == translationState2) {
                z10 = false;
            } else {
                z10 = false;
            }
            AbstractC0054a.m731f(z10, null, AbstractC0070i.m772g(ss5.m21703b0(240, 0, null, 6), 0.0f, 2).m23531a(AbstractC0070i.m770e(ss5.m21703b0(240, 0, null, 6), 14)), AbstractC0070i.m773h(ss5.m21703b0(240, 0, null, 6), 2).m20180a(AbstractC0070i.m776k(ss5.m21703b0(240, 0, null, 6), 14)), null, ci8.m4703P(-2079758484, new C3180kd(7, chatMessage, str15), tj3Var3), tj3Var3, 1600518, 18);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38957f, true, new gm5(28)), nj0.f52789H, tj3Var3, 48);
            int iHashCode6 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m6 = tj3Var3.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c6);
            if (z19) {
                tj3Var3.m22111b0(-1832590634);
                if (i22 != 67108864) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if ((i9 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                str8 = str14;
                zM22120g3 = z16 | z17 | tj3Var3.m22120g(str8);
                objM22097O9 = tj3Var3.m22097O();
                if (zM22120g3) {
                    p84Var3 = p84Var2;
                    if (objM22097O9 == p84Var3) {
                        i13 = i;
                        jv0Var3 = jv0Var;
                    }
                    omd.m18141c((ui3) objM22097O9, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(1048614791, new C0812bj(1, t66Var7), tj3Var3), tj3Var3, 1572912, 60);
                    tj3Var3.m22139q(false);
                } else {
                    p84Var3 = p84Var2;
                }
                i13 = i;
                jv0Var3 = jv0Var;
                objM22097O9 = new jy0(jv0Var3, i13, str8);
                tj3Var3.m22131l0(objM22097O9);
                omd.m18141c((ui3) objM22097O9, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(1048614791, new C0812bj(1, t66Var7), tj3Var3), tj3Var3, 1572912, 60);
                tj3Var3.m22139q(false);
            } else {
                i13 = i;
                jv0Var3 = jv0Var;
                p84Var3 = p84Var2;
                str8 = str14;
                tj3Var3.m22111b0(-1831625790);
                tj3Var3.m22139q(false);
            }
            if (i22 != 67108864) {
                z11 = false;
            } else {
                z11 = true;
            }
            zM22120g2 = z11 | tj3Var3.m22120g(str8);
            objM22097O6 = tj3Var3.m22097O();
            if (zM22120g2) {
                objM22097O6 = new jy0(jv0Var3, str8);
                tj3Var3.m22131l0(objM22097O6);
            } else {
                objM22097O6 = new jy0(jv0Var3, str8);
                tj3Var3.m22131l0(objM22097O6);
            }
            omd.m18141c((ui3) objM22097O6, c99.m4422o(b16Var, 18.0f), false, null, null, ci8.m4703P(-1600016638, new C0812bj(2, r48), tj3Var3), tj3Var3, 1572912, 60);
            if (chatMessage.f18925f.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            final int i28 = i13;
            final jv0 jv0Var5 = jv0Var3;
            final boolean z210 = z25;
            AbstractC0054a.m730e(z12, null, null, null, null, ci8.m4703P(-449514360, new aj3() { // from class: ky0
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ((InterfaceC0067f) obj).getClass();
                    tj3 tj3Var5 = (tj3) ((ye1) obj2);
                    jv0 jv0Var6 = jv0Var5;
                    boolean zM22124i4 = tj3Var5.m22124i(jv0Var6);
                    int i29 = i28;
                    boolean zM22116e7 = zM22124i4 | tj3Var5.m22116e(i29);
                    ChatMessage chatMessage2 = chatMessage;
                    boolean zM22124i5 = zM22116e7 | tj3Var5.m22124i(chatMessage2);
                    Object objM22097O20 = tj3Var5.m22097O();
                    if (zM22124i5 || objM22097O20 == we1.f66679a) {
                        objM22097O20 = new by0(jv0Var6, i29, chatMessage2, 1);
                        tj3Var5.m22131l0(objM22097O20);
                    }
                    omd.m18141c((ui3) objM22097O20, c99.m4422o(b16.f7762a, 18.0f), false, null, null, ci8.m4703P(-62902742, new py0(0, l44VarM21713i, jw0Var, t66Var7, z210), tj3Var5), tj3Var5, 1572912, 60);
                    return xfa.f68157a;
                }
            }, tj3Var3), tj3Var3, 1572870, 30);
            tj3Var2 = tj3Var3;
            AbstractC0054a.m730e(!chatMessage.f18924e.isEmpty(), null, null, null, null, ci8.m4703P(-1515321039, new ly0(jv0Var, i, chatMessage, jw0Var, t66Var7, 0), tj3Var3), tj3Var2, 1572870, 30);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            thb.m22044c(tj3Var2, new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            if (((Boolean) t66Var7.getValue()).booleanValue()) {
                tj3Var2.m22111b0(-1827954336);
                ChatMessageRating chatMessageRating5 = ChatMessageRating.Like;
                ChatMessageRating chatMessageRating6 = jw0Var.f46248i;
                boolean z211 = !z18;
                String strM23620a2 = vz1.m23620a0(tj3Var2, R$string.chat_rate_message_helpful);
                if (i22 != 67108864) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                zM22116e = z14 | tj3Var2.m22116e(i24);
                objM22097O7 = tj3Var2.m22097O();
                if (zM22116e) {
                    final int i29 = 0;
                    objM22097O7 = new ui3() { // from class: my0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i210 = i29;
                            xfa xfaVar = xfa.f68157a;
                            int i211 = i24;
                            jv0 jv0Var6 = jv0Var;
                            switch (i210) {
                                case 0:
                                    jv0Var6.mo8870D(i211, ChatMessageRating.Like);
                                    break;
                                default:
                                    jv0Var6.mo8870D(i211, ChatMessageRating.Dislike);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O7);
                } else {
                    final int i210 = 0;
                    objM22097O7 = new ui3() { // from class: my0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i211 = i210;
                            xfa xfaVar = xfa.f68157a;
                            int i212 = i24;
                            jv0 jv0Var6 = jv0Var;
                            switch (i211) {
                                case 0:
                                    jv0Var6.mo8870D(i212, ChatMessageRating.Like);
                                    break;
                                default:
                                    jv0Var6.mo8870D(i212, ChatMessageRating.Dislike);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O7);
                }
                m8915f(chatMessageRating5, chatMessageRating6, z211, strM23620a2, (ui3) objM22097O7, tj3Var2, 6);
                ChatMessageRating chatMessageRating7 = ChatMessageRating.Dislike;
                ChatMessageRating chatMessageRating8 = jw0Var.f46248i;
                boolean z212 = !z18;
                String strM23620a3 = vz1.m23620a0(tj3Var2, R$string.chat_rate_message_unhelpful);
                if (i22 != 67108864) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                zM22116e2 = z15 | tj3Var2.m22116e(i24);
                objM22097O8 = tj3Var2.m22097O();
                if (zM22116e2) {
                    final int i211 = 1;
                    objM22097O8 = new ui3() { // from class: my0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i212 = i211;
                            xfa xfaVar = xfa.f68157a;
                            int i213 = i24;
                            jv0 jv0Var6 = jv0Var;
                            switch (i212) {
                                case 0:
                                    jv0Var6.mo8870D(i213, ChatMessageRating.Like);
                                    break;
                                default:
                                    jv0Var6.mo8870D(i213, ChatMessageRating.Dislike);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O8);
                } else {
                    final int i212 = 1;
                    objM22097O8 = new ui3() { // from class: my0
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i213 = i212;
                            xfa xfaVar = xfa.f68157a;
                            int i214 = i24;
                            jv0 jv0Var6 = jv0Var;
                            switch (i213) {
                                case 0:
                                    jv0Var6.mo8870D(i214, ChatMessageRating.Like);
                                    break;
                                default:
                                    jv0Var6.mo8870D(i214, ChatMessageRating.Dislike);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(objM22097O8);
                }
                m8915f(chatMessageRating7, chatMessageRating8, z212, strM23620a3, (ui3) objM22097O8, tj3Var2, 6);
                tj3Var2 = tj3Var2;
                z13 = false;
                tj3Var2.m22139q(false);
            } else {
                z13 = false;
                tj3Var2.m22111b0(-1826753086);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(true);
            if (jw0Var.f46247h == PhrasesState.Showing) {
                z13 = true;
            }
            boolean z31 = z19;
            tj3 tj3Var5 = tj3Var2;
            AbstractC0054a.m731f(z13, null, null, null, null, ci8.m4703P(328316578, new ny0(str13, jw0Var, jv0Var, chatMessage, nz9Var, z31), tj3Var2), tj3Var5, 1572870, 30);
            tj3Var = tj3Var5;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            z5 = z31;
            str6 = str13;
            z4 = z20;
            str5 = str15;
        } else {
            tj3Var = tj3Var3;
            tj3Var.m22102U();
            z4 = z2;
            str5 = str3;
            str6 = str4;
            z5 = z3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new oy0(e16Var, nz9Var, i, jw0Var, str5, str6, z5, z4, jv0Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8911b(final e16 e16Var, final nz9 nz9Var, final int i, final jw0 jw0Var, boolean z, boolean z2, final jv0 jv0Var, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        final boolean z4;
        final boolean z5;
        long j;
        int i7;
        Object c2006j;
        jv0 jv0Var2;
        boolean z6;
        nz9Var.getClass();
        ChatMessage chatMessage = jw0Var.f46240a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-747838211);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i4 | (tj3Var.m22124i(nz9Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i8 |= tj3Var.m22116e(i) ? 256 : 128;
        }
        int i9 = i8 | (tj3Var.m22124i(jw0Var) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
            z3 = z;
        } else {
            z3 = z;
            i5 = i9 | (tj3Var.m22122h(z3) ? 16384 : 8192);
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i6 = i5 | 196608;
        } else {
            i6 = i5 | (tj3Var.m22122h(z2) ? 131072 : 65536);
        }
        int i12 = i6 | (tj3Var.m22120g(jv0Var) ? 1048576 : 524288);
        if (tj3Var.m22099R(i12 & 1, (599187 & i12) != 599186)) {
            boolean z7 = i10 != 0 ? true : z3;
            boolean z8 = i11 != 0 ? false : z2;
            String str = (String) u91.m22592J0(1, nz9Var.f53460f.f70706b);
            aa1 aa1Var = str != null ? new aa1(d32.m10035e(Color.parseColor(str))) : null;
            if (aa1Var == null) {
                tj3Var.m22111b0(-1412970319);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55822G;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1412973543);
                tj3Var.m22139q(false);
                j = aa1Var.f414a;
            }
            long j2 = j;
            t31 t31Var = (t31) tj3Var.m22128k(AbstractC0402n.f4814f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            boolean zM22116e = tj3Var.m22116e(chatMessage.f18920a);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22116e || objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            final t66 t66Var = (t66) objM22097O2;
            boolean zM22116e2 = tj3Var.m22116e(chatMessage.f18920a);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22116e2 || objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(new ia4());
                tj3Var.m22131l0(objM22097O3);
            }
            final t66 t66Var2 = (t66) objM22097O3;
            boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
            e28 e28Var = ((ia4) t66Var2.getValue()).f43856b;
            String str2 = ((ia4) t66Var2.getValue()).f43855a;
            int i13 = i12 & 3670016;
            boolean zM22120g = tj3Var.m22120g(t66Var) | (i13 == 1048576) | tj3Var.m22124i(un1Var) | tj3Var.m22124i(t31Var);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                i7 = i13;
                jv0Var2 = jv0Var;
                z6 = false;
                c2006j = new C2006j(jv0Var2, un1Var, t66Var, t31Var, 1);
                tj3Var.m22131l0(c2006j);
            } else {
                c2006j = objM22097O4;
                i7 = i13;
                jv0Var2 = jv0Var;
                z6 = false;
            }
            vi3 vi3Var = (vi3) c2006j;
            boolean zM22120g2 = tj3Var.m22120g(t66Var) | (i7 != 1048576 ? z6 : true);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                objM22097O5 = new hy0(jv0Var2, t66Var, 2);
                tj3Var.m22131l0(objM22097O5);
            }
            u1d.m22390a(zBooleanValue, e28Var, str2, vi3Var, null, (ui3) objM22097O5, tj3Var, 0, 16);
            final boolean z9 = z7;
            final boolean z10 = z8;
            r46.m20381f(c99.m4427t(e16Var, 150.0f, 310.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64857c, null, te1.m21999m(0, 14, j2, 0L, tj3Var), ci8.m4703P(2115784915, new aj3() { // from class: qy0
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b16 b16Var;
                    jw0 jw0Var2;
                    jv0 jv0Var3;
                    p84 p84Var2;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        zf1 zf1Var = ge9.f40637a;
                        float f = ((fe9) tj3Var2.m22128k(zf1Var)).f38956e;
                        float f2 = ((fe9) tj3Var2.m22128k(zf1Var)).f38952a;
                        b16 b16Var2 = b16.f7762a;
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var2, f, f2);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var2 = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var2);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        nz9 nz9Var2 = nz9Var;
                        vs3 vs3Var = nz9Var2.f53461g;
                        TextHighlightStyle textHighlightStyle = nz9Var2.f53462h;
                        jw0 jw0Var3 = jw0Var;
                        String str3 = jw0Var3.f46240a.f18923d;
                        List list = jw0Var3.f46241b;
                        List list2 = jw0Var3.f46242c;
                        d87 d87Var = jw0Var3.f46243d;
                        Integer num = jw0Var3.f46244e;
                        Integer num2 = jw0Var3.f46245f;
                        int i14 = nz9Var2.f53455a;
                        boolean z11 = nz9Var2.f53463i;
                        double d = nz9Var2.f53456b;
                        if (z11 && d < 1.15d) {
                            d = 1.15d;
                        }
                        double d2 = d;
                        ReaderFont readerFont = nz9Var2.f53458d;
                        String str4 = jw0Var3.f46253n;
                        boolean zM15194A = AbstractC3184kh.m15194A(str4);
                        int i15 = i;
                        jt3 jt3Var = new jt3(i15, str3, list, list2, d87Var, false, textHighlightStyle, vs3Var, num, num2, true, i14, d2, readerFont, str4, zM15194A, false, null, z10, null, null, null, 0.0f, 16449568);
                        vx9 vx9Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71406j;
                        jv0 jv0Var4 = jv0Var;
                        boolean zM22124i = tj3Var2.m22124i(jv0Var4) | tj3Var2.m22124i(jw0Var3);
                        Object objM22097O6 = tj3Var2.m22097O();
                        p84 p84Var3 = we1.f66679a;
                        if (zM22124i || objM22097O6 == p84Var3) {
                            objM22097O6 = new jk0(2, jv0Var4, jw0Var3);
                            tj3Var2.m22131l0(objM22097O6);
                        }
                        bj3 bj3Var = (bj3) objM22097O6;
                        boolean zM22124i2 = tj3Var2.m22124i(jv0Var4) | tj3Var2.m22124i(jw0Var3);
                        Object objM22097O7 = tj3Var2.m22097O();
                        if (zM22124i2 || objM22097O7 == p84Var3) {
                            objM22097O7 = new C3180kd(8, jv0Var4, jw0Var3);
                            tj3Var2.m22131l0(objM22097O7);
                        }
                        aj3 aj3Var = (aj3) objM22097O7;
                        boolean zM22124i3 = tj3Var2.m22124i(jv0Var4);
                        Object objM22097O8 = tj3Var2.m22097O();
                        if (zM22124i3 || objM22097O8 == p84Var3) {
                            objM22097O8 = new aw0(jv0Var4, 2);
                            tj3Var2.m22131l0(objM22097O8);
                        }
                        ui3 ui3Var2 = (ui3) objM22097O8;
                        boolean zM22124i4 = tj3Var2.m22124i(jv0Var4) | tj3Var2.m22124i(jw0Var3);
                        Object objM22097O9 = tj3Var2.m22097O();
                        if (zM22124i4 || objM22097O9 == p84Var3) {
                            objM22097O9 = new s70(19, jv0Var4, jw0Var3);
                            tj3Var2.m22131l0(objM22097O9);
                        }
                        vi3 vi3Var3 = (vi3) objM22097O9;
                        boolean zM22124i5 = tj3Var2.m22124i(jv0Var4);
                        t66 t66Var3 = t66Var2;
                        boolean zM22120g3 = zM22124i5 | tj3Var2.m22120g(t66Var3);
                        t66 t66Var4 = t66Var;
                        boolean zM22120g4 = zM22120g3 | tj3Var2.m22120g(t66Var4);
                        Object objM22097O10 = tj3Var2.m22097O();
                        if (zM22120g4 || objM22097O10 == p84Var3) {
                            objM22097O10 = new C3485q5(jv0Var4, t66Var3, t66Var4, 6);
                            tj3Var2.m22131l0(objM22097O10);
                        }
                        vi3 vi3Var4 = (vi3) objM22097O10;
                        boolean zM22124i6 = tj3Var2.m22124i(jv0Var4);
                        Object objM22097O11 = tj3Var2.m22097O();
                        if (zM22124i6 || objM22097O11 == p84Var3) {
                            objM22097O11 = new aw0(jv0Var4, 3);
                            tj3Var2.m22131l0(objM22097O11);
                        }
                        AbstractC1932c.m8799a(jt3Var, vx9Var, null, bj3Var, aj3Var, ui3Var2, vi3Var3, vi3Var4, (ui3) objM22097O11, null, tj3Var2, 8, 516);
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var2, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 13);
                        sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        if (z9) {
                            tj3Var2.m22111b0(510555163);
                            e16 e16VarM4422o = c99.m4422o(b16Var2, 18.0f);
                            jv0Var3 = jv0Var4;
                            jw0Var2 = jw0Var3;
                            boolean zM22124i7 = tj3Var2.m22124i(jv0Var3) | tj3Var2.m22116e(i15) | tj3Var2.m22124i(jw0Var2);
                            Object objM22097O12 = tj3Var2.m22097O();
                            if (zM22124i7) {
                                p84Var2 = p84Var3;
                            } else {
                                p84Var2 = p84Var3;
                                if (objM22097O12 == p84Var2) {
                                }
                                b16Var = b16Var2;
                                omd.m18141c((ui3) objM22097O12, e16VarM4422o, false, null, null, wnb.f67101b, tj3Var2, 1572912, 60);
                                tj3Var2.m22139q(false);
                            }
                            objM22097O12 = new ay0(jv0Var3, i15, jw0Var2);
                            tj3Var2.m22131l0(objM22097O12);
                            b16Var = b16Var2;
                            omd.m18141c((ui3) objM22097O12, e16VarM4422o, false, null, null, wnb.f67101b, tj3Var2, 1572912, 60);
                            tj3Var2.m22139q(false);
                        } else {
                            b16Var = b16Var2;
                            jw0Var2 = jw0Var3;
                            jv0Var3 = jv0Var4;
                            p84Var2 = p84Var3;
                            tj3Var2.m22111b0(511243797);
                            tj3Var2.m22139q(false);
                        }
                        boolean zM22124i8 = tj3Var2.m22124i(jv0Var3) | tj3Var2.m22124i(jw0Var2);
                        Object objM22097O13 = tj3Var2.m22097O();
                        if (zM22124i8 || objM22097O13 == p84Var2) {
                            objM22097O13 = new ay0(jv0Var3, jw0Var2);
                            tj3Var2.m22131l0(objM22097O13);
                        }
                        omd.m18141c((ui3) objM22097O13, c99.m4422o(b16Var, 18.0f), false, null, null, wnb.f67102c, tj3Var2, 1572912, 60);
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24576, 4);
            tj3Var = tj3Var;
            z5 = z9;
            z4 = z10;
        } else {
            tj3Var.m22102U();
            z4 = z2;
            z5 = z3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ry0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2008l.m8911b(e16Var, nz9Var, i, jw0Var, z5, z4, jv0Var, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8912c(tx0 tx0Var, String str, String str2, t17 t17Var, jv0 jv0Var, ye1 ye1Var, int i, int i2) {
        String str3;
        int i3;
        String str4;
        String str5;
        Object objPrevious;
        long j;
        ChatMessage chatMessage;
        ChatMessage chatMessage2;
        tx0Var.getClass();
        List list = tx0Var.f63037b;
        int i4 = tx0Var.f63041f;
        List list2 = tx0Var.f63040e;
        t17Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-931856797);
        int i5 = (tj3Var.m22124i(tx0Var) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            str3 = str;
        } else {
            str3 = str;
            i3 = i5 | (tj3Var.m22120g(str3) ? 32 : 16);
        }
        int i7 = i2 & 4;
        int i8 = i7 != 0 ? i3 | 384 : i3 | (tj3Var.m22120g(str2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i8 |= tj3Var.m22120g(t17Var) ? 2048 : 1024;
        }
        int i9 = i8 | (tj3Var.m22120g(jv0Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i9 & 1, (i9 & 9363) != 9362)) {
            String str6 = i6 != 0 ? "" : str3;
            String str7 = i7 != 0 ? "" : str2;
            boolean zM22116e = tj3Var.m22116e(i4);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22116e || objM22097O == p84Var) {
                objM22097O = new C0127b(0, 0);
                tj3Var.m22131l0(objM22097O);
            }
            C0127b c0127b = (C0127b) objM22097O;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof jw0) {
                    arrayList.add(obj);
                }
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!fa4.m11650l(((jw0) objPrevious).f46240a.f18921b, "tutor"));
            jw0 jw0Var = (jw0) objPrevious;
            boolean z = jw0Var != null && jw0Var.f46246g == TranslationState.Showing && vk9.m23391n0(jw0Var.f46240a.f18925f);
            boolean z2 = jw0Var != null && jw0Var.f46250k;
            boolean z3 = (tx0Var.f63039d || (list.isEmpty() && !tx0Var.f63038c) || z || z2) ? false : true;
            boolean zM22116e2 = tj3Var.m22116e(i4);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22116e2 || objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            boolean zM22116e3 = tj3Var.m22116e(i4);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22116e3 || objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(list);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var2 = (t66) objM22097O3;
            boolean zM22124i = tj3Var.m22124i(tx0Var) | tj3Var.m22120g(t66Var2);
            String str8 = str7;
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new ChatSessionScreenKt$ChatSessionScreen$1$1(tx0Var, t66Var2, null);
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O4, list);
            boolean z4 = z3;
            String str9 = str6;
            dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) t66Var.getValue()).booleanValue() ? 1.0f : 0.0f, ss5.m21703b0(260, 0, null, 6), "suggestionsAlpha", null, tj3Var, 3120, 20);
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zM22122h = tj3Var.m22122h(z4) | tj3Var.m22120g(t66Var);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22122h || objM22097O5 == p84Var) {
                objM22097O5 = new ChatSessionScreenKt$ChatSessionScreen$2$1(z4, t66Var, null);
                tj3Var.m22131l0(objM22097O5);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O5, boolValueOf);
            int size = list2.size();
            boolean z5 = !list2.isEmpty();
            int size2 = list2.size();
            String str10 = (jw0Var == null || (chatMessage2 = jw0Var.f46240a) == null) ? null : chatMessage2.f18923d;
            String str11 = (jw0Var == null || (chatMessage = jw0Var.f46240a) == null) ? null : chatMessage.f18925f;
            boolean z6 = tx0Var.f63043h;
            m8914e(c0127b, size, z5, size2, str10, str11, z6, z6 || z2 || z, tj3Var, 0);
            String str12 = (String) u91.m22591I0(tx0Var.f63046k.f53460f.f70706b);
            aa1 aa1Var = str12 != null ? new aa1(d32.m10035e(Color.parseColor(str12))) : null;
            if (aa1Var == null) {
                tj3Var.m22111b0(2133921866);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2133918611);
                tj3Var.m22139q(false);
                j = aa1Var.f414a;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21611X(d32.m10007D(c99.m4411d(b16Var, 1.0f), j, ss5.f61356d), 0.0f, t17Var.mo14021d(), 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, t17Var.mo14018a(), 7);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            WeakHashMap weakHashMap = l6b.f49204w;
            Boolean bool = (Boolean) ((xc9) ho5.m13397r(tj3Var).f49207c.f60968d).getValue();
            bool.getClass();
            boolean zM22124i2 = tj3Var.m22124i(tx0Var) | tj3Var.m22120g(c0127b) | tj3Var.m22116e(size);
            Object objM22097O6 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O6 == p84Var) {
                objM22097O6 = new ChatSessionScreenKt$ChatSessionScreen$3$1$1(tx0Var, c0127b, size, null);
                tj3Var.m22131l0(objM22097O6);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O6, bool);
            e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4412e(b16Var, 1.0f), true);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM17728c, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2);
            x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 0.0f, 5);
            boolean zM22124i3 = tj3Var.m22124i(tx0Var) | ((57344 & i9) == 16384) | ((i9 & 112) == 32) | ((i9 & 896) == 256) | tj3Var.m22120g(t66Var2) | tj3Var.m22120g(t66Var) | tj3Var.m22120g(dh9VarM750b);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O7 == p84Var) {
                str5 = str9;
                str4 = str8;
                dy0 dy0Var = new dy0(tx0Var, str5, str4, jv0Var, t66Var, dh9VarM750b, t66Var2);
                tj3Var.m22131l0(dy0Var);
                objM22097O7 = dy0Var;
            } else {
                str5 = str9;
                str4 = str8;
            }
            fa4.m11642c(e16VarM21609V, c0127b, x17VarM21626g, null, null, null, false, null, (vi3) objM22097O7, tj3Var, 0, 504);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            str4 = str2;
            str5 = str3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ey0(tx0Var, str5, str4, t17Var, jv0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8913d(ChatStats chatStats, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1270516089);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(chatStats) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            AbstractC3423or.m18244b(AbstractC3584sr.m21608U(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38952a), null, null, null, 3, 0, ci8.m4703P(-1377964628, new se0(chatStats, i2), tj3Var), tj3Var, 1597440, 46);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(chatStats, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8914e(final C0127b c0127b, final int i, final boolean z, final int i2, final String str, final String str2, final boolean z2, final boolean z3, ye1 ye1Var, final int i3) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1003879532);
        int i4 = i3 | (tj3Var.m22120g(c0127b) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22116e(i2) ? 2048 : 1024) | (tj3Var.m22120g(str) ? 16384 : 8192) | (tj3Var.m22120g(str2) ? 131072 : 65536) | (tj3Var.m22122h(z2) ? 1048576 : 524288) | (tj3Var.m22122h(z3) ? 8388608 : 4194304);
        if (tj3Var.m22099R(i4 & 1, (4793491 & i4) != 4793490)) {
            Object[] objArr = {Integer.valueOf(i2), str, str2, Boolean.valueOf(z2)};
            int i5 = i4 & 896;
            int i6 = i4 & 14;
            int i7 = i4 & 112;
            boolean z4 = (i5 == 256) | (i6 == 4) | (i7 == 32);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z4 || objM22097O == p84Var) {
                objM22097O = new ChatSessionScreenKt$FollowConversationEnd$1$1(z, c0127b, i, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10053n(objArr, (zi3) objM22097O, tj3Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            Integer numValueOf = Integer.valueOf(i);
            boolean z5 = (i5 == 256) | (i6 == 4) | (i7 == 32) | ((i4 & 29360128) == 8388608);
            Object objM22097O2 = tj3Var.m22097O();
            if (z5 || objM22097O2 == p84Var) {
                ChatSessionScreenKt$FollowConversationEnd$2$1 chatSessionScreenKt$FollowConversationEnd$2$1 = new ChatSessionScreenKt$FollowConversationEnd$2$1(z, z3, c0127b, i, null);
                tj3Var.m22131l0(chatSessionScreenKt$FollowConversationEnd$2$1);
                objM22097O2 = chatSessionScreenKt$FollowConversationEnd$2$1;
            }
            d32.m10049l(boolValueOf, numValueOf, (zi3) objM22097O2, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, z, i2, str, str2, z2, z3, i3) { // from class: fy0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f39911b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f39912c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f39913d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f39914e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ String f39915f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ boolean f39916g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f39917h;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2008l.m8914e(this.f39910a, this.f39911b, this.f39912c, this.f39913d, this.f39914e, this.f39915f, this.f39916g, this.f39917h, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8915f(ChatMessageRating chatMessageRating, ChatMessageRating chatMessageRating2, boolean z, String str, ui3 ui3Var, ye1 ye1Var, int i) {
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1368017181);
        int i2 = (tj3Var.m22116e(chatMessageRating2 == null ? -1 : chatMessageRating2.ordinal()) ? 32 : 16) | i | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22120g(str) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = chatMessageRating == chatMessageRating2;
            boolean z4 = chatMessageRating == ChatMessageRating.Like;
            e16 e16VarM4422o = c99.m4422o(b16.f7762a, 28.0f);
            boolean z5 = (57344 & i2) == 16384;
            Object objM22097O = tj3Var.m22097O();
            if (z5 || objM22097O == we1.f66679a) {
                objM22097O = new sy0(0, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            z2 = z;
            omd.m18145e(z3, (vi3) objM22097O, e16VarM4422o, z2, null, null, ci8.m4703P(-172913808, new ty0(str, z4, z3), tj3Var), tj3Var, ((i2 << 3) & 7168) | 12583296);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uy0(chatMessageRating, chatMessageRating2, z2, str, ui3Var, i);
        }
    }
}
