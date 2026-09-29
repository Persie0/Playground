package com.lingq.feature.reader.reader.p017ui;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.reader.pagination.AbstractC2463a;
import com.lingq.feature.reader.reader.p017ui.AbstractC2506c;
import com.lingq.feature.reader.video.C2583a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.sequences.AbstractC3204c;
import kotlin.sequences.C3202a;
import kotlin.sequences.C3203b;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.ab1;
import p000.ac7;
import p000.as4;
import p000.b16;
import p000.bb1;
import p000.bj3;
import p000.bx7;
import p000.c99;
import p000.cd4;
import p000.cg7;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.e28;
import p000.eh0;
import p000.fb2;
import p000.fe9;
import p000.fy9;
import p000.ge9;
import p000.h85;
import p000.ht5;
import p000.hz4;
import p000.ia4;
import p000.ix0;
import p000.jy7;
import p000.l70;
import p000.l77;
import p000.lx0;
import p000.ly7;
import p000.mbb;
import p000.mo9;
import p000.n84;
import p000.nj0;
import p000.nz9;
import p000.o72;
import p000.oha;
import p000.ov7;
import p000.ox7;
import p000.p84;
import p000.pb1;
import p000.pbb;
import p000.pv7;
import p000.qc9;
import p000.qh0;
import p000.qjc;
import p000.qv7;
import p000.s54;
import p000.sc9;
import p000.se1;
import p000.t31;
import p000.t66;
import p000.t9a;
import p000.th7;
import p000.thb;
import p000.tj3;
import p000.tv7;
import p000.u1d;
import p000.u65;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.un7;
import p000.v08;
import p000.v27;
import p000.v91;
import p000.vi3;
import p000.we1;
import p000.wfb;
import p000.wh7;
import p000.x18;
import p000.xfa;
import p000.xfd;
import p000.xz7;
import p000.ye1;
import p000.yz4;
import p000.z91;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ui.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2506c {
    /* JADX INFO: renamed from: a */
    public static final void m9413a(final yz4 yz4Var, final v08 v08Var, final nz9 nz9Var, bx7 bx7Var, final jy7 jy7Var, final ly7 ly7Var, final float f, final vi3 vi3Var, final vi3 vi3Var2, ye1 ye1Var, final int i) {
        final vi3 vi3Var3;
        final bx7 bx7Var2;
        tj3 tj3Var;
        boolean z;
        final yz4 yz4Var2;
        Map map;
        jy7 jy7Var2;
        p84 p84Var;
        t66 t66Var;
        un1 un1Var;
        vi3 vi3Var4;
        vi3 vi3Var5;
        qc9 qc9Var;
        String str;
        Map map2;
        un1 un1Var2;
        boolean z2;
        tj3 tj3Var2;
        boolean z3;
        o72 o72Var;
        boolean z4;
        tj3 tj3Var3;
        tj3 tj3Var4;
        t66 t66Var2;
        qc9 qc9Var2;
        boolean z5;
        Object readerContentKt$ReaderContent$2$1;
        Boolean bool;
        Object readerContentKt$ReaderContent$3$1;
        Integer num;
        yz4Var.getClass();
        List list = yz4Var.f70668b;
        Map mapM15360M = yz4Var.f70674h;
        List list2 = yz4Var.f70670d;
        int i2 = yz4Var.f70680n;
        v08Var.getClass();
        nz9Var.getClass();
        boolean z6 = nz9Var.f53466l;
        bx7Var.getClass();
        jy7Var.getClass();
        ly7Var.getClass();
        float f2 = ly7Var.f50309c;
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var5 = (tj3) ye1Var;
        tj3Var5.m22115d0(-1287853530);
        int i3 = i | (tj3Var5.m22124i(yz4Var) ? 4 : 2) | (tj3Var5.m22124i(v08Var) ? 32 : 16) | (tj3Var5.m22124i(nz9Var) ? 256 : 128) | (tj3Var5.m22124i(bx7Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= tj3Var5.m22124i(jy7Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var5.m22124i(ly7Var) ? 131072 : 65536;
        }
        int i4 = i3 | (tj3Var5.m22114d(f) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i4 |= tj3Var5.m22124i(vi3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= tj3Var5.m22124i(vi3Var2) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if (tj3Var5.m22099R(i5 & 1, (i5 & 38347923) != 38347922)) {
            fb2 fb2Var = (fb2) tj3Var5.m22128k(AbstractC0402n.f4816h);
            final Lesson lesson = yz4Var.f70667a;
            boolean zM22120g = tj3Var5.m22120g(mapM15360M) | tj3Var5.m22122h(z6);
            Object objM22097O = tj3Var5.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22120g || objM22097O == p84Var2) {
                if (!z6) {
                    mapM15360M = AbstractC3194a.m15360M();
                }
                tj3Var5.m22131l0(mapM15360M);
                objM22097O = mapM15360M;
            }
            Map map3 = (Map) objM22097O;
            int iMo916w0 = fb2Var.mo916w0(f);
            zf1 zf1Var = ge9.f40637a;
            int iMo916w1 = fb2Var.mo916w0(((fe9) tj3Var5.m22128k(zf1Var)).f38961j);
            int iMo916w2 = fb2Var.mo916w0((((fe9) tj3Var5.m22128k(zf1Var)).f38963l * 2.0f) + 65.0f);
            int iMo916w3 = fb2Var.mo916w0(64.0f);
            fb2 fb2Var2 = fb2Var;
            Object objM22097O2 = tj3Var5.m22097O();
            if (objM22097O2 == p84Var2) {
                objM22097O2 = AbstractC0278f.m1260j(new n84(0L));
                tj3Var5.m22131l0(objM22097O2);
            }
            t66 t66Var3 = (t66) objM22097O2;
            u65 u65Var = yz4Var.f70669c;
            long j = ((n84) t66Var3.getValue()).f52482a;
            String str2 = yz4Var.f70672f;
            boolean z7 = yz4Var.f70673g;
            String str3 = yz4Var.f70684r;
            int i6 = i5 & 234881024;
            boolean z8 = i6 == 67108864;
            Object objM22097O3 = tj3Var5.m22097O();
            if (z8 || objM22097O3 == p84Var2) {
                objM22097O3 = new wh7(vi3Var2, 5);
                tj3Var5.m22131l0(objM22097O3);
            }
            AbstractC2463a.m9357a(u65Var, map3, j, iMo916w2, iMo916w3, iMo916w0, iMo916w1, nz9Var, str2, z7, str3, (vi3) objM22097O3, tj3Var5, 16777216 | ((i5 << 15) & 29360128));
            Map map4 = map3;
            String str4 = (!yz4Var.f70686t || lesson == null) ? null : lesson.f19162u;
            Object objM22097O4 = tj3Var5.m22097O();
            if (objM22097O4 == p84Var2) {
                objM22097O4 = AbstractC0278f.m1260j(null);
                tj3Var5.m22131l0(objM22097O4);
            }
            t66 t66Var4 = (t66) objM22097O4;
            Object objM22097O5 = tj3Var5.m22097O();
            if (objM22097O5 == p84Var2) {
                objM22097O5 = AbstractC0278f.m1256f(0.0f);
                tj3Var5.m22131l0(objM22097O5);
            }
            qc9 qc9Var3 = (qc9) objM22097O5;
            Object objM22097O6 = tj3Var5.m22097O();
            if (objM22097O6 == p84Var2) {
                objM22097O6 = AbstractC0278f.m1256f(0.0f);
                tj3Var5.m22131l0(objM22097O6);
            }
            qc9 qc9Var4 = (qc9) objM22097O6;
            Object objM22097O7 = tj3Var5.m22097O();
            if (objM22097O7 == p84Var2) {
                objM22097O7 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var5.m22131l0(objM22097O7);
            }
            t66 t66Var5 = (t66) objM22097O7;
            Object objM22097O8 = tj3Var5.m22097O();
            if (objM22097O8 == p84Var2) {
                objM22097O8 = AbstractC0278f.m1260j(null);
                tj3Var5.m22131l0(objM22097O8);
            }
            t66 t66Var6 = (t66) objM22097O8;
            boolean zM22120g2 = tj3Var5.m22120g(list);
            Object objM22097O9 = tj3Var5.m22097O();
            if (zM22120g2 || objM22097O9 == p84Var2) {
                List<LessonSentence> list3 = list;
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P >= 16 ? iM15363P : 16);
                for (LessonSentence lessonSentence : list3) {
                    linkedHashMap.put(Integer.valueOf(lessonSentence.f19256d), lessonSentence.f19257e);
                }
                tj3Var5.m22131l0(linkedHashMap);
                objM22097O9 = linkedHashMap;
            }
            Map map5 = (Map) objM22097O9;
            if (str4 != null) {
                tj3Var5.m22111b0(-676572750);
                boolean z9 = !fy9.m12247b(t9a.m21912b(tj3Var5));
                tj3Var5.m22139q(false);
                z = z9;
            } else {
                tj3Var5.m22111b0(501130858);
                tj3Var5.m22139q(false);
                z = false;
            }
            boolean zM22114d = tj3Var5.m22114d(f2);
            Object objM22097O10 = tj3Var5.m22097O();
            if (zM22114d || objM22097O10 == p84Var2) {
                int i7 = (int) f2;
                ac7 ac7Var = new ac7(f2 == i7 ? AbstractC3393o1.m17732g(i7, "x") : f2 + "x", f2);
                tj3Var5.m22131l0(ac7Var);
                objM22097O10 = ac7Var;
            }
            ac7 ac7Var2 = (ac7) objM22097O10;
            Object objM22097O11 = tj3Var5.m22097O();
            if (objM22097O11 == p84Var2) {
                objM22097O11 = d32.m10013K(tj3Var5);
                tj3Var5.m22131l0(objM22097O11);
            }
            un1 un1Var3 = (un1) objM22097O11;
            if (str4 != null) {
                tj3Var5.m22111b0(502539844);
                Float fValueOf = Float.valueOf(qc9Var3.m19861h());
                Boolean boolValueOf = Boolean.valueOf(m9415c(t66Var5));
                boolean zM22124i = tj3Var5.m22124i(yz4Var) | tj3Var5.m22124i(jy7Var) | tj3Var5.m22124i(map5);
                Object objM22097O12 = tj3Var5.m22097O();
                if (zM22124i || objM22097O12 == p84Var2) {
                    map = map5;
                    bool = boolValueOf;
                    p84Var = p84Var2;
                    readerContentKt$ReaderContent$2$1 = new ReaderContentKt$ReaderContent$2$1(t66Var5, yz4Var, jy7Var, map, qc9Var3, t66Var6, t66Var4, null);
                    t66Var5 = t66Var5;
                    jy7Var2 = jy7Var;
                    t66Var6 = t66Var6;
                    tj3Var5.m22131l0(readerContentKt$ReaderContent$2$1);
                } else {
                    map = map5;
                    p84Var = p84Var2;
                    readerContentKt$ReaderContent$2$1 = objM22097O12;
                    bool = boolValueOf;
                    jy7Var2 = jy7Var;
                }
                d32.m10049l(fValueOf, bool, (zi3) readerContentKt$ReaderContent$2$1, tj3Var5);
                Object objM22097O13 = tj3Var5.m22097O();
                if (objM22097O13 == p84Var) {
                    objM22097O13 = AbstractC0278f.m1257g(i2);
                    tj3Var5.m22131l0(objM22097O13);
                }
                sc9 sc9Var = (sc9) objM22097O13;
                Integer numValueOf = Integer.valueOf(i2);
                boolean zM22124i2 = tj3Var5.m22124i(yz4Var2) | tj3Var5.m22124i(jy7Var2) | tj3Var5.m22124i(map) | tj3Var5.m22124i(ly7Var) | tj3Var5.m22124i(un1Var3);
                Object objM22097O14 = tj3Var5.m22097O();
                if (zM22124i2 || objM22097O14 == p84Var) {
                    num = numValueOf;
                    t66 t66Var7 = t66Var6;
                    Map map6 = map;
                    readerContentKt$ReaderContent$3$1 = new ReaderContentKt$ReaderContent$3$1(yz4Var, sc9Var, ly7Var, jy7Var, map6, t66Var5, qc9Var3, un1Var3, t66Var7, t66Var4, null);
                    jy7Var2 = jy7Var;
                    map = map6;
                    qc9Var3 = qc9Var3;
                    un1Var = un1Var3;
                    t66Var4 = t66Var4;
                    t66Var = t66Var7;
                    tj3Var5.m22131l0(readerContentKt$ReaderContent$3$1);
                } else {
                    readerContentKt$ReaderContent$3$1 = objM22097O14;
                    num = numValueOf;
                    t66Var = t66Var6;
                    un1Var = un1Var3;
                }
                d32.m10047k(tj3Var5, (zi3) readerContentKt$ReaderContent$3$1, num);
                tj3Var5.m22139q(false);
            } else {
                yz4Var2 = yz4Var;
                t66Var5 = t66Var5;
                map = map5;
                qc9Var4 = qc9Var4;
                map4 = map4;
                ac7Var2 = ac7Var2;
                str4 = str4;
                i6 = i6;
                fb2Var2 = fb2Var2;
                jy7Var2 = jy7Var;
                p84Var = p84Var2;
                t66Var = t66Var6;
                un1Var = un1Var3;
                tj3Var5.m22111b0(503639228);
                tj3Var5.m22139q(false);
            }
            e16 e16VarM4428u = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(e16VarM4428u, 1.0f);
            boolean z10 = i6 == 67108864;
            Object objM22097O15 = tj3Var5.m22097O();
            if (z10 || objM22097O15 == p84Var) {
                vi3Var4 = vi3Var2;
                objM22097O15 = new ix0(vi3Var4, t66Var3, 13);
                tj3Var5.m22131l0(objM22097O15);
            } else {
                vi3Var4 = vi3Var2;
            }
            e16 e16VarM19025M = pb1.m19025M(e16VarM4411d, (vi3) objM22097O15);
            fb2 fb2Var3 = fb2Var2;
            boolean zM22120g3 = tj3Var5.m22120g(fb2Var3) | (i6 == 67108864);
            Object objM22097O16 = tj3Var5.m22097O();
            if (zM22120g3 || objM22097O16 == p84Var) {
                objM22097O16 = new h85(29, fb2Var3, vi3Var4);
                tj3Var5.m22131l0(objM22097O16);
            }
            e16 e16VarM8793f = AbstractC1915b.m8793f(e16VarM19025M, (vi3) objM22097O16);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
            un1 un1Var4 = un1Var;
            Map map7 = map;
            int iHashCode = Long.hashCode(tj3Var5.f62385T);
            l77 l77VarM22132m = tj3Var5.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var5, e16VarM8793f);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var5.m22119f0();
            if (tj3Var5.f62384S) {
                tj3Var5.m22130l(ui3Var);
            } else {
                tj3Var5.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var5, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var5, zi3Var2, l77VarM22132m);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var5, zi3Var3, numValueOf2);
            vi3 vi3Var6 = C0352b.f4305h;
            oha.m18000f(tj3Var5, vi3Var6);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var5, zi3Var4, e16VarM1322c);
            if (str4 != null) {
                tj3Var5.m22111b0(1609568905);
                String str5 = yz4Var2.f70684r;
                boolean zM9415c = m9415c(t66Var5);
                pbb pbbVar = (pbb) t66Var4.getValue();
                Object objM22097O17 = tj3Var5.m22097O();
                if (objM22097O17 == p84Var) {
                    t66Var2 = t66Var;
                    objM22097O17 = new un7(2, t66Var4);
                    tj3Var5.m22131l0(objM22097O17);
                } else {
                    t66Var2 = t66Var;
                }
                ui3 ui3Var2 = (ui3) objM22097O17;
                boolean z11 = i6 == 67108864;
                Object objM22097O18 = tj3Var5.m22097O();
                if (z11 || objM22097O18 == p84Var) {
                    qc9Var2 = qc9Var4;
                    objM22097O18 = new ov7(vi3Var4, t66Var5, qc9Var2);
                    tj3Var5.m22131l0(objM22097O18);
                } else {
                    qc9Var2 = qc9Var4;
                }
                vi3 vi3Var7 = (vi3) objM22097O18;
                boolean z12 = i6 == 67108864;
                Object objM22097O19 = tj3Var5.m22097O();
                if (z12 || objM22097O19 == p84Var) {
                    z5 = true;
                    objM22097O19 = new s54(1, vi3Var4, qc9Var3);
                    tj3Var5.m22131l0(objM22097O19);
                } else {
                    z5 = true;
                }
                vi3 vi3Var8 = (vi3) objM22097O19;
                boolean z13 = i6 == 67108864 ? z5 : false;
                Object objM22097O20 = tj3Var5.m22097O();
                if (z13 || objM22097O20 == p84Var) {
                    objM22097O20 = new ov7(vi3Var4, qc9Var2, t66Var5);
                    tj3Var5.m22131l0(objM22097O20);
                }
                vi3 vi3Var9 = (vi3) objM22097O20;
                map2 = map7;
                boolean zM22124i3 = tj3Var5.m22124i(yz4Var2) | tj3Var5.m22124i(jy7Var2) | tj3Var5.m22124i(map2) | tj3Var5.m22124i(un1Var4);
                Object objM22097O21 = tj3Var5.m22097O();
                if (zM22124i3 || objM22097O21 == p84Var) {
                    qc9 qc9Var5 = qc9Var3;
                    un1Var2 = un1Var4;
                    objM22097O21 = new pv7(yz4Var2, jy7Var2, map2, qc9Var5, un1Var2, t66Var2, t66Var4);
                    qc9Var = qc9Var5;
                    tj3Var5.m22131l0(objM22097O21);
                } else {
                    qc9Var = qc9Var3;
                    un1Var2 = un1Var4;
                }
                ui3 ui3Var3 = (ui3) objM22097O21;
                Object objM22097O22 = tj3Var5.m22097O();
                if (objM22097O22 == p84Var) {
                    objM22097O22 = new un7(3, t66Var4);
                    tj3Var5.m22131l0(objM22097O22);
                }
                ui3 ui3Var4 = (ui3) objM22097O22;
                C2583a.Companion.getClass();
                ArrayList arrayList = C2583a.f31341c0;
                boolean z14 = i6 == 67108864;
                Object objM22097O23 = tj3Var5.m22097O();
                if (z14 || objM22097O23 == p84Var) {
                    objM22097O23 = new wh7(vi3Var4, 6);
                    tj3Var5.m22131l0(objM22097O23);
                }
                vi3 vi3Var10 = (vi3) objM22097O23;
                boolean z15 = (i5 & 29360128) == 8388608;
                Object objM22097O24 = tj3Var5.m22097O();
                if (z15 || objM22097O24 == p84Var) {
                    vi3Var5 = vi3Var;
                    objM22097O24 = new th7(vi3Var5, 21);
                    tj3Var5.m22131l0(objM22097O24);
                } else {
                    vi3Var5 = vi3Var;
                }
                ui3 ui3Var5 = (ui3) objM22097O24;
                e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4428u, f, 0.0f, 2);
                if (z) {
                    e16VarM4428u = c99.m4428u(e16VarM4428u, 0.0f, 480.0f, 1);
                }
                str = str4;
                xfd.m24488a(str, str5, zM9415c, ac7Var2, pbbVar, ui3Var2, vi3Var7, vi3Var8, vi3Var9, ui3Var3, ui3Var4, arrayList, vi3Var10, ui3Var5, e16VarM21609V.mo3161g(e16VarM4428u), tj3Var5, 196608);
                tj3 tj3Var6 = tj3Var5;
                z2 = false;
                tj3Var6.m22139q(false);
                tj3Var2 = tj3Var6;
            } else {
                vi3Var5 = vi3Var;
                vi3Var6 = vi3Var6;
                qc9Var = qc9Var3;
                t66Var5 = t66Var5;
                zi3Var4 = zi3Var4;
                tj3 tj3Var7 = tj3Var5;
                str = str4;
                map2 = map7;
                un1Var2 = un1Var4;
                z2 = false;
                tj3Var7.m22111b0(1611576434);
                tj3Var7.m22139q(false);
                tj3Var2 = tj3Var7;
            }
            if (!yz4Var2.m25388b()) {
                tj3Var2.m22111b0(1611632048);
                as4 as4Var = new as4(1.0f, true);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, z2);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var6);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                boolean z16 = (i5 & 29360128) == 8388608;
                Object objM22097O25 = tj3Var2.m22097O();
                if (z16 || objM22097O25 == p84Var) {
                    objM22097O25 = new th7(vi3Var5, 23);
                    tj3Var2.m22131l0(objM22097O25);
                }
                qjc.m20010a(0, tj3Var2, (ui3) objM22097O25);
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
                bx7Var2 = bx7Var;
                tj3Var4 = tj3Var2;
                vi3Var3 = vi3Var4;
                z3 = true;
            } else if (yz4Var2.f70667a == null || yz4Var2.f70669c == null || yz4Var2.f70675i || yz4Var2.f70677k != null || yz4Var2.f70678l.f57649a || !yz4Var2.m25388b()) {
                bx7Var2 = bx7Var;
                tj3 tj3Var8 = tj3Var2;
                vi3Var3 = vi3Var4;
                z3 = true;
                tj3Var8.m22111b0(1626133042);
                tj3Var8.m22139q(false);
                tj3Var4 = tj3Var8;
            } else {
                tj3Var2.m22111b0(1612569488);
                int iM15945h = l70.m15945h(i2, 0, list2.size() - 1);
                boolean zM22124i4 = tj3Var2.m22124i(yz4Var2);
                Object objM22097O26 = tj3Var2.m22097O();
                if (zM22124i4 || objM22097O26 == p84Var) {
                    objM22097O26 = new hz4(yz4Var2, 18);
                    tj3Var2.m22131l0(objM22097O26);
                }
                o72 o72VarM23066b = v27.m23066b(iM15945h, tj3Var2, (ui3) objM22097O26);
                boolean zM22120g4 = tj3Var2.m22120g(o72VarM23066b) | (i6 == 67108864);
                Object objM22097O27 = tj3Var2.m22097O();
                if (zM22120g4 || objM22097O27 == p84Var) {
                    objM22097O27 = new ReaderContentKt$ReaderContent$6$10$1(o72VarM23066b, vi3Var4, null);
                    tj3Var2.m22131l0(objM22097O27);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O27, o72VarM23066b);
                Integer numValueOf3 = Integer.valueOf(i2);
                Integer numValueOf4 = Integer.valueOf(list2.size());
                boolean zM22124i5 = tj3Var2.m22124i(yz4Var2) | tj3Var2.m22120g(o72VarM23066b);
                Object objM22097O28 = tj3Var2.m22097O();
                if (zM22124i5 || objM22097O28 == p84Var) {
                    objM22097O28 = new ReaderContentKt$ReaderContent$6$11$1(yz4Var2, o72VarM23066b, null);
                    tj3Var2.m22131l0(objM22097O28);
                }
                d32.m10049l(numValueOf3, numValueOf4, (zi3) objM22097O28, tj3Var2);
                float fMo912g0 = fb2Var3.mo912g0(80.0f);
                boolean zM22120g5 = tj3Var2.m22120g(list2);
                Object objM22097O29 = tj3Var2.m22097O();
                Object obj = objM22097O29;
                if (zM22120g5 || objM22097O29 == p84Var) {
                    List list4 = list2;
                    list4.getClass();
                    C3203b c3203bM15416l0 = AbstractC3204c.m15416l0(new z91(list4, 0), new qv7(0));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C3202a c3202a = new C3202a(c3203bM15416l0);
                    while (c3202a.hasNext()) {
                        xz7 xz7Var = (xz7) c3202a.next();
                        Integer numValueOf5 = Integer.valueOf(xz7Var.f69010g);
                        Object obj2 = linkedHashMap2.get(numValueOf5);
                        if (obj2 == null && !linkedHashMap2.containsKey(numValueOf5)) {
                            obj2 = 0;
                        }
                        linkedHashMap2.put(numValueOf5, Integer.valueOf(Math.max(((Number) obj2).intValue(), xz7Var.f69007d)));
                    }
                    tj3Var2.m22131l0(linkedHashMap2);
                    obj = linkedHashMap2;
                }
                final Map map8 = (Map) obj;
                boolean z17 = yz4Var2.f70685s;
                e16 e16VarM4412e = c99.m4412e(new as4(1.0f, true), 1.0f);
                Object[] objArr = {Boolean.valueOf(ly7Var.f50307a), Boolean.valueOf(yz4Var2.f70685s), Integer.valueOf(o72VarM23066b.mo1039n())};
                boolean zM22124i6 = tj3Var2.m22124i(ly7Var) | tj3Var2.m22120g(o72VarM23066b) | tj3Var2.m22114d(fMo912g0) | tj3Var2.m22124i(yz4Var2) | tj3Var2.m22124i(un1Var2) | (i6 == 67108864);
                Object objM22097O30 = tj3Var2.m22097O();
                if (zM22124i6 || objM22097O30 == p84Var) {
                    yz4 yz4Var3 = yz4Var2;
                    tv7 tv7Var = new tv7(ly7Var, o72VarM23066b, fMo912g0, yz4Var3, un1Var2, vi3Var4);
                    o72Var = o72VarM23066b;
                    yz4Var2 = yz4Var3;
                    tj3Var2.m22131l0(tv7Var);
                    objM22097O30 = tv7Var;
                } else {
                    o72Var = o72VarM23066b;
                }
                e16 e16VarM16958b = mo9.m16958b(e16VarM4412e, objArr, (PointerInputEventHandler) objM22097O30);
                boolean zM22124i7 = tj3Var2.m22124i(yz4Var2);
                Object objM22097O31 = tj3Var2.m22097O();
                if (zM22124i7 || objM22097O31 == p84Var) {
                    objM22097O31 = new cg7(yz4Var2, 2);
                    tj3Var2.m22131l0(objM22097O31);
                }
                bx7Var2 = bx7Var;
                final un1 un1Var5 = un1Var2;
                tj3 tj3Var9 = tj3Var2;
                p84 p84Var3 = p84Var;
                int i8 = i6;
                final String str6 = str;
                final Map map9 = map4;
                final t66 t66Var8 = t66Var5;
                final qc9 qc9Var6 = qc9Var;
                final Map map10 = map2;
                bj3 bj3Var = new bj3() { // from class: rv7
                    /* JADX WARN: Code duplicated, block: B:98:0x0278  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r20v0, types: [zi3] */
                    /* JADX WARN: Type inference failed for: r20v4, types: [f00] */
                    @Override // p000.bj3
                    /* JADX INFO: renamed from: e */
                    public final Object mo825e(Object obj3, Object obj4, Object obj5, Object obj6) {
                        String str7;
                        String str8;
                        String str9;
                        vi3 vi3Var11;
                        f00 f00Var;
                        boolean z18;
                        boolean z19;
                        boolean z20;
                        int i9;
                        String str10;
                        int size;
                        int i10;
                        String str11;
                        Object next;
                        Double dValueOf;
                        Float f3;
                        Double dValueOf2;
                        Float f4;
                        int iIntValue = ((Integer) obj4).intValue();
                        ye1 ye1Var2 = (ye1) obj5;
                        ((Integer) obj6).getClass();
                        gc0 gc0Var = nj0.f52808c;
                        ((o27) obj3).getClass();
                        yz4 yz4Var4 = yz4Var2;
                        List list5 = yz4Var4.f70670d;
                        Map map11 = yz4Var4.f70683q;
                        ox7 ox7Var = (ox7) u91.m22592J0(iIntValue, list5);
                        if (ox7Var != null) {
                            int i11 = ox7Var.f55128a;
                            tj3 tj3Var10 = (tj3) ye1Var2;
                            tj3Var10.m22111b0(823740484);
                            v08 v08Var2 = v08Var;
                            d27 d27Var = (d27) v08Var2.f64662a.get(Integer.valueOf(i11));
                            EmptyList emptyList = EmptyList.f47638a;
                            if (d27Var == null) {
                                d27Var = new d27(emptyList, emptyList, emptyList);
                            }
                            d27 d27Var2 = d27Var;
                            boolean z21 = iIntValue == yz4Var4.f70670d.size() - 1;
                            String str12 = yz4Var4.f70684r;
                            Lesson lesson2 = lesson;
                            if (lesson2 == null || (str7 = lesson2.f19143b) == null) {
                                str7 = "";
                            }
                            if (lesson2 == null || (str8 = lesson2.f19150i) == null) {
                                str8 = "";
                            }
                            if (lesson2 == null || (str9 = lesson2.f19146e) == null) {
                                str9 = "";
                            }
                            float f5 = f;
                            ey7 ey7Var = new ey7(str12, str7, str8, str9, f5, ox7Var, d27Var2, map9);
                            b16 b16Var = b16.f7762a;
                            e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                            int iHashCode3 = Long.hashCode(tj3Var10.f62385T);
                            l77 l77VarM22132m3 = tj3Var10.m22132m();
                            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var10, e16VarM4411d2);
                            se1.f60731q.getClass();
                            ui3 ui3Var6 = C0352b.f4299b;
                            tj3Var10.m22119f0();
                            if (tj3Var10.f62384S) {
                                tj3Var10.m22130l(ui3Var6);
                            } else {
                                tj3Var10.m22137o0();
                            }
                            oha.m18001g(tj3Var10, C0352b.f4303f, ht5VarM19966d2);
                            oha.m18001g(tj3Var10, C0352b.f4302e, l77VarM22132m3);
                            oha.m18001g(tj3Var10, C0352b.f4304g, Integer.valueOf(iHashCode3));
                            oha.m18000f(tj3Var10, C0352b.f4305h);
                            oha.m18001g(tj3Var10, C0352b.f4301d, e16VarM1322c3);
                            boolean z22 = yz4Var4.f70686t;
                            bx7 bx7Var3 = bx7Var2;
                            jy7 jy7Var3 = jy7Var;
                            ly7 ly7Var2 = ly7Var;
                            nz9 nz9Var2 = nz9Var;
                            vi3 vi3Var12 = vi3Var2;
                            p84 p84Var4 = we1.f66679a;
                            Object f00Var2 = null;
                            if (z22) {
                                tj3Var10.m22111b0(866006421);
                                List list6 = (List) v08Var2.f64663b.get(Integer.valueOf(i11));
                                List list7 = list6 == null ? emptyList : list6;
                                xz7 xz7Var2 = bx7Var3.f9137a;
                                if (xz7Var2 != null) {
                                    i9 = xz7Var2.f69010g;
                                } else {
                                    xz7 xz7Var3 = (xz7) u91.m22591I0(ox7Var.f55132e);
                                    i9 = xz7Var3 != null ? xz7Var3.f69010g : 0;
                                }
                                String str13 = ox7Var.f55131d;
                                qx8 qx8Var = (qx8) map11.get(Integer.valueOf(i9));
                                if (qx8Var == null) {
                                    qx8Var = new qx8();
                                }
                                if (qx8Var.f58344e.length() > 0) {
                                    Set setEntrySet = map11.entrySet();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = setEntrySet.iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = it;
                                        Object next2 = it2.next();
                                        Map.Entry entry = (Map.Entry) next2;
                                        String str14 = str13;
                                        if (((qx8) entry.getValue()).f58344e.length() > 0 && ((Number) entry.getKey()).intValue() <= i9) {
                                            arrayList2.add(next2);
                                        }
                                        it = it2;
                                        str13 = str14;
                                    }
                                    str10 = str13;
                                    size = arrayList2.size();
                                } else {
                                    str10 = str13;
                                    size = 0;
                                }
                                String str15 = str6;
                                if (str15 == null || !AbstractC2506c.m9415c(t66Var8)) {
                                    i10 = size;
                                    str15 = str15;
                                } else {
                                    Iterator it3 = jy7Var3.f46408p.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            i10 = size;
                                            next = null;
                                            break;
                                        }
                                        next = it3.next();
                                        i10 = size;
                                        if (((LessonTranslationSentence) next).f19292a == i9) {
                                            break;
                                        }
                                        size = i10;
                                    }
                                    LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) next;
                                    int i12 = i9;
                                    List list8 = (List) map10.get(Integer.valueOf(i9));
                                    if (lessonTranslationSentence == null || (dValueOf = lessonTranslationSentence.f19294c) == null) {
                                        dValueOf = (list8 == null || (f3 = (Float) u91.m22592J0(0, list8)) == null) ? null : Double.valueOf(f3.floatValue());
                                    }
                                    if (lessonTranslationSentence == null || (dValueOf2 = lessonTranslationSentence.f19295d) == null) {
                                        dValueOf2 = (list8 == null || (f4 = (Float) u91.m22592J0(1, list8)) == null) ? null : Double.valueOf(f4.floatValue());
                                    }
                                    if (dValueOf == null || dValueOf2 == null) {
                                        i9 = i12;
                                    } else {
                                        qc9 qc9Var7 = qc9Var6;
                                        Double d = dValueOf2;
                                        if (qc9Var7.m19861h() < dValueOf.doubleValue() || qc9Var7.m19861h() >= d.doubleValue()) {
                                            i9 = i12;
                                        } else {
                                            i9 = i12;
                                            f00Var2 = new f00(i12, (long) (dValueOf.doubleValue() * 1000.0d), (long) ((d.doubleValue() - dValueOf.doubleValue()) * 1000.0d), System.nanoTime(), (long) (qc9Var7.m19861h() * 1000.0f), ly7Var2.f50309c, 0);
                                        }
                                    }
                                }
                                List list9 = ly7Var2.f50314h;
                                boolean z23 = jy7Var3.f46401i;
                                Integer num2 = jy7Var3.f46398f;
                                boolean z24 = z23 && num2 != null && num2.intValue() == i9;
                                boolean z25 = jy7Var3.f46402j && num2 != null && num2.intValue() == i9;
                                float f6 = ly7Var2.f50308b;
                                boolean z26 = qx8Var.f58340a;
                                String str16 = (String) yz4Var4.f70674h.get(Integer.valueOf(i9));
                                String str17 = qx8Var.f58343d;
                                if (str17 == null) {
                                    str11 = (str16 == null && (str16 = qx8Var.f58342c) == null) ? "" : str16;
                                } else {
                                    str11 = str17;
                                }
                                hx8 hx8Var = new hx8(i9, str10, z24, z25, f6, z26, str11, qx8Var.f58341b, qx8Var.f58344e, i10, qx8Var.f58345f, list7, ly7Var2.f50311e, ly7Var2.f50312f);
                                ?? r20 = f00Var2;
                                n2d.m17194c(ey7Var, nz9Var2, bx7Var3, hx8Var, list9, str15 == null, r20, r20 != 0 ? ly7Var2.f50313g : AudioUnderlineMode.Off, vi3Var12, tj3Var10, 64);
                                vi3Var11 = vi3Var12;
                                tj3Var10 = tj3Var10;
                                tj3Var10.m22139q(false);
                            } else {
                                vi3Var11 = vi3Var12;
                                tj3Var10.m22111b0(870962081);
                                f00 f00Var3 = jy7Var3.f46407o;
                                if (f00Var3 != null) {
                                    Integer num3 = (Integer) map8.get(Integer.valueOf(f00Var3.f38127a));
                                    if (num3 != null) {
                                        if (num3.intValue() != f00Var3.f38133g) {
                                            f00Var3 = new f00(f00Var3.f38127a, f00Var3.f38128b, f00Var3.f38129c, f00Var3.f38130d, f00Var3.f38131e, f00Var3.f38132f, num3.intValue());
                                        }
                                    }
                                    f00Var = f00Var3;
                                } else {
                                    f00Var = null;
                                }
                                AudioUnderlineMode audioUnderlineMode = ly7Var2.f50313g;
                                if (iIntValue == yz4Var4.f70680n) {
                                    tj3Var10.m22111b0(871838389);
                                    boolean zM22120g6 = tj3Var10.m22120g(vi3Var11);
                                    Object objM22097O32 = tj3Var10.m22097O();
                                    if (zM22120g6 || objM22097O32 == p84Var4) {
                                        objM22097O32 = new ks3(vi3Var11, 23);
                                        tj3Var10.m22131l0(objM22097O32);
                                    }
                                    f00Var2 = (zi3) objM22097O32;
                                    z18 = false;
                                    tj3Var10.m22139q(false);
                                } else {
                                    z18 = false;
                                    tj3Var10.m22111b0(871992458);
                                    tj3Var10.m22139q(false);
                                }
                                zjc.m25680b(ey7Var, nz9Var2, bx7Var3, f00Var, audioUnderlineMode, vi3Var11, f00Var2, tj3Var10, 64);
                                tj3Var10.m22139q(z18);
                            }
                            if (z21) {
                                tj3Var10.m22111b0(872140298);
                                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(d32.m10007D(c99.m4412e(ci0.f10109a.mo3727a(b16Var, nj0.f52815j), 1.0f), ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d), f5, 0.0f, 2), 0.0f, 16.0f, 1);
                                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                                int iHashCode4 = Long.hashCode(tj3Var10.f62385T);
                                l77 l77VarM22132m4 = tj3Var10.m22132m();
                                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var10, e16VarM21609V2);
                                se1.f60731q.getClass();
                                ui3 ui3Var7 = C0352b.f4299b;
                                tj3Var10.m22119f0();
                                if (tj3Var10.f62384S) {
                                    tj3Var10.m22130l(ui3Var7);
                                } else {
                                    tj3Var10.m22137o0();
                                }
                                oha.m18001g(tj3Var10, C0352b.f4303f, ht5VarM19966d3);
                                oha.m18001g(tj3Var10, C0352b.f4302e, l77VarM22132m4);
                                oha.m18001g(tj3Var10, C0352b.f4304g, Integer.valueOf(iHashCode4));
                                oha.m18000f(tj3Var10, C0352b.f4305h);
                                oha.m18001g(tj3Var10, C0352b.f4301d, e16VarM1322c4);
                                e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 48.0f);
                                boolean zM22120g7 = tj3Var10.m22120g(vi3Var11);
                                Object objM22097O33 = tj3Var10.m22097O();
                                if (zM22120g7 || objM22097O33 == p84Var4) {
                                    objM22097O33 = new th7(vi3Var11, 22);
                                    tj3Var10.m22131l0(objM22097O33);
                                }
                                ss5.m21711g(e16VarM4414g, false, null, 0L, null, null, (ui3) objM22097O33, ci8.m4703P(191744998, new se0(yz4Var4, 28), tj3Var10), tj3Var10, 12582918, 62);
                                z20 = true;
                                tj3Var10.m22139q(true);
                                z19 = false;
                                tj3Var10.m22139q(false);
                            } else {
                                z19 = false;
                                z20 = true;
                                tj3Var10.m22111b0(873590447);
                                tj3Var10.m22139q(false);
                            }
                            tj3Var10.m22139q(z20);
                            tj3Var10.m22139q(z19);
                        } else {
                            tj3 tj3Var11 = (tj3) ye1Var2;
                            tj3Var11.m22111b0(832114638);
                            tj3Var11.m22139q(false);
                        }
                        return xfa.f68157a;
                    }
                };
                vi3Var3 = vi3Var2;
                thb.m22042a(o72Var, e16VarM16958b, null, null, 1, null, null, false, z17, (vi3) objM22097O31, null, null, null, ci8.m4703P(-2064342028, bj3Var, tj3Var9), tj3Var9, 24576, 14828);
                tj3 tj3Var10 = tj3Var9;
                final Context context = (Context) tj3Var10.m22128k(AbstractC0394f.f4761b);
                final t31 t31Var = (t31) tj3Var10.m22128k(AbstractC0402n.f4814f);
                ia4 ia4Var = bx7Var2.f9142f;
                if (ia4Var == null) {
                    tj3Var10.m22111b0(1624898807);
                    z4 = false;
                    tj3Var10.m22139q(false);
                    z3 = true;
                    tj3Var3 = tj3Var10;
                } else {
                    z4 = false;
                    tj3Var10.m22111b0(1624898808);
                    e28 e28Var = ia4Var.f43856b;
                    String str7 = ia4Var.f43855a;
                    boolean zM22124i8 = tj3Var10.m22124i(un1Var5) | tj3Var10.m22124i(t31Var) | tj3Var10.m22124i(context);
                    Object objM22097O32 = tj3Var10.m22097O();
                    if (zM22124i8 || objM22097O32 == p84Var3) {
                        objM22097O32 = new vi3() { // from class: com.lingq.feature.reader.reader.ui.a
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                String str8 = (String) obj3;
                                str8.getClass();
                                wfb.m23926u(un1Var5, null, null, new ReaderContentKt$ReaderContent$6$15$1$1$1(t31Var, str8, null), 3);
                                Toast.makeText(context, R$string.share_copied_clipboard, 0).show();
                                return xfa.f68157a;
                            }
                        };
                        tj3Var10.m22131l0(objM22097O32);
                    }
                    vi3 vi3Var11 = (vi3) objM22097O32;
                    boolean zM22124i9 = tj3Var10.m22124i(context);
                    Object objM22097O33 = tj3Var10.m22097O();
                    if (zM22124i9 || objM22097O33 == p84Var3) {
                        z3 = true;
                        objM22097O33 = new lx0(context, 1);
                        tj3Var10.m22131l0(objM22097O33);
                    } else {
                        z3 = true;
                    }
                    vi3 vi3Var12 = (vi3) objM22097O33;
                    boolean z18 = i8 == 67108864 ? z3 : false;
                    Object objM22097O34 = tj3Var10.m22097O();
                    if (z18 || objM22097O34 == p84Var3) {
                        objM22097O34 = new th7(vi3Var3, 24);
                        tj3Var10.m22131l0(objM22097O34);
                    }
                    u1d.m22390a(true, e28Var, str7, vi3Var11, vi3Var12, (ui3) objM22097O34, tj3Var10, 6, 0);
                    tj3 tj3Var11 = tj3Var10;
                    tj3Var11.m22139q(false);
                    tj3Var3 = tj3Var11;
                }
                tj3Var3.m22139q(z4);
                tj3Var4 = tj3Var3;
            }
            tj3Var4.m22139q(z3);
            tj3Var = tj3Var4;
        } else {
            vi3Var3 = vi3Var2;
            bx7Var2 = bx7Var;
            tj3Var5.m22102U();
            tj3Var = tj3Var5;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final bx7 bx7Var3 = bx7Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: nv7
                @Override // p000.zi3
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    AbstractC2506c.m9413a(yz4Var, v08Var, nz9Var, bx7Var3, jy7Var, ly7Var, f, vi3Var, vi3Var3, (ye1) obj3, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Pair m9414b(yz4 yz4Var, jy7 jy7Var, Map map) {
        xz7 xz7Var;
        Object next;
        Double dValueOf;
        Float f;
        Float f2;
        Double d;
        ox7 ox7Var = (ox7) u91.m22592J0(yz4Var.f70680n, yz4Var.f70670d);
        Double dValueOf2 = null;
        if (ox7Var == null || (xz7Var = (xz7) u91.m22591I0(ox7Var.f55132e)) == null) {
            return new Pair(null, null);
        }
        int i = xz7Var.f69010g;
        Iterator it = jy7Var.f46408p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LessonTranslationSentence) next).f19292a != i);
        LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) next;
        List list = (List) map.get(Integer.valueOf(i));
        if (lessonTranslationSentence == null || (dValueOf = lessonTranslationSentence.f19294c) == null) {
            dValueOf = (list == null || (f = (Float) u91.m22592J0(0, list)) == null) ? null : Double.valueOf(f.floatValue());
        }
        if (lessonTranslationSentence != null && (d = lessonTranslationSentence.f19295d) != null) {
            dValueOf2 = d;
        } else if (list != null && (f2 = (Float) u91.m22592J0(1, list)) != null) {
            dValueOf2 = Double.valueOf(f2.floatValue());
        }
        return new Pair(dValueOf, dValueOf2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9415c(t66 t66Var) {
        return ((Boolean) t66Var.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static final void m9416d(un1 un1Var, t66 t66Var, t66 t66Var2, double d) {
        cd4 cd4Var = (cd4) t66Var.getValue();
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
        t66Var2.setValue(new mbb((int) (d * 1000.0d)));
        t66Var.setValue(wfb.m23926u(un1Var, null, null, new ReaderContentKt$ReaderContent$seekAndPlay$1(t66Var2, null), 3));
    }
}
