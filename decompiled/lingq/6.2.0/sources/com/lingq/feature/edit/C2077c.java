package com.lingq.feature.edit;

import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1297m;
import com.lingq.feature.edit.domain.C2081a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.a15;
import p000.b15;
import p000.c15;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d15;
import p000.e15;
import p000.eh9;
import p000.f15;
import p000.fa4;
import p000.fx8;
import p000.g15;
import p000.gm5;
import p000.h15;
import p000.i15;
import p000.j15;
import p000.k15;
import p000.kx8;
import p000.l15;
import p000.l83;
import p000.lda;
import p000.m15;
import p000.m23;
import p000.n15;
import p000.nl8;
import p000.o15;
import p000.o23;
import p000.p15;
import p000.pg9;
import p000.q15;
import p000.qj2;
import p000.sca;
import p000.t15;
import p000.t66;
import p000.u15;
import p000.w15;
import p000.web;
import p000.wfb;
import p000.wta;
import p000.x05;
import p000.x15;
import p000.xc9;
import p000.xi9;
import p000.y05;
import p000.yw8;
import p000.z05;

/* JADX INFO: renamed from: com.lingq.feature.edit.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2077c extends wta {

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap f25931A;

    /* JADX INFO: renamed from: b */
    public final m23 f25932b;

    /* JADX INFO: renamed from: c */
    public final C2081a f25933c;

    /* JADX INFO: renamed from: d */
    public final o23 f25934d;

    /* JADX INFO: renamed from: e */
    public final qj2 f25935e;

    /* JADX INFO: renamed from: f */
    public final m23 f25936f;

    /* JADX INFO: renamed from: g */
    public final C3139j9 f25937g;

    /* JADX INFO: renamed from: h */
    public final C2081a f25938h;

    /* JADX INFO: renamed from: i */
    public final web f25939i;

    /* JADX INFO: renamed from: j */
    public final cma f25940j;

    /* JADX INFO: renamed from: k */
    public final sca f25941k;

    /* JADX INFO: renamed from: l */
    public final int f25942l;

    /* JADX INFO: renamed from: m */
    public final boolean f25943m;

    /* JADX INFO: renamed from: n */
    public final t66 f25944n;

    /* JADX INFO: renamed from: o */
    public final C3244l f25945o;

    /* JADX INFO: renamed from: p */
    public final c18 f25946p;

    /* JADX INFO: renamed from: q */
    public final t66 f25947q;

    /* JADX INFO: renamed from: r */
    public final C3244l f25948r;

    /* JADX INFO: renamed from: s */
    public final C3244l f25949s;

    /* JADX INFO: renamed from: t */
    public final C3244l f25950t;

    /* JADX INFO: renamed from: u */
    public final C3244l f25951u;

    /* JADX INFO: renamed from: v */
    public final C3244l f25952v;

    /* JADX INFO: renamed from: w */
    public final C3244l f25953w;

    /* JADX INFO: renamed from: x */
    public final C3244l f25954x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashSet f25955y;

    /* JADX INFO: renamed from: z */
    public pg9 f25956z;

    public C2077c(m23 m23Var, C2081a c2081a, o23 o23Var, qj2 qj2Var, m23 m23Var2, C3139j9 c3139j9, C2081a c2081a2, web webVar, cma cmaVar, sca scaVar, nl8 nl8Var) {
        cmaVar.getClass();
        scaVar.getClass();
        nl8Var.getClass();
        this.f25932b = m23Var;
        this.f25933c = c2081a;
        this.f25934d = o23Var;
        this.f25935e = qj2Var;
        this.f25936f = m23Var2;
        this.f25937g = c3139j9;
        this.f25938h = c2081a2;
        this.f25939i = webVar;
        this.f25940j = cmaVar;
        this.f25941k = scaVar;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        this.f25942l = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) nl8Var.m17488b("sentenceIndex");
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Boolean bool = (Boolean) nl8Var.m17488b("hasAudio");
        this.f25943m = bool != null ? bool.booleanValue() : false;
        this.f25944n = AbstractC0278f.m1260j(new w15(t15.f61745a, false, false));
        int i = 3;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new fx8(i));
        this.f25945o = c3244lM17114d;
        this.f25946p = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, new fx8(i));
        t66 t66VarM1260j = AbstractC0278f.m1260j(new yw8(0, false));
        this.f25947q = t66VarM1260j;
        this.f25948r = AbstractC3352my.m17114d(0);
        Boolean bool2 = Boolean.FALSE;
        this.f25949s = AbstractC3352my.m17114d(bool2);
        this.f25950t = AbstractC3352my.m17114d(0L);
        this.f25951u = AbstractC3352my.m17114d(bool2);
        this.f25952v = AbstractC3352my.m17114d(bool2);
        this.f25953w = AbstractC3352my.m17114d("");
        this.f25954x = AbstractC3352my.m17114d("");
        this.f25955y = new LinkedHashSet();
        this.f25931A = new LinkedHashMap();
        wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$4(this, null), 3);
        yw8 yw8Var = (yw8) ((xc9) t66VarM1260j).getValue();
        boolean zM15194A = AbstractC3184kh.m15194A(cmaVar.mo4589b2());
        int i2 = yw8Var.f70595a;
        yw8Var.getClass();
        ((xc9) t66VarM1260j).setValue(new yw8(i2, zM15194A));
        if (iIntValue > 0) {
            m8988W2(iIntValue);
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8987V2(q15 q15Var) {
        q15Var.getClass();
        if (q15Var instanceof k15) {
            m8988W2(((k15) q15Var).f46551a);
            return;
        }
        boolean z = q15Var instanceof e15;
        sca scaVar = this.f25941k;
        if (z) {
            scaVar.mo8482P();
            t66 t66Var = this.f25944n;
            ((xc9) t66Var).setValue(w15.m23674a((w15) ((xc9) t66Var).getValue(), t15.f61745a, false, 6));
            return;
        }
        boolean z2 = q15Var instanceof i15;
        C3244l c3244l = this.f25949s;
        C3244l c3244l2 = this.f25952v;
        C3244l c3244l3 = this.f25951u;
        C3244l c3244l4 = this.f25948r;
        if (z2) {
            int i = ((i15) q15Var).f43329a + 1;
            if (((Number) c3244l4.getValue()).intValue() != i) {
                c3244l4.m15572j(null, Integer.valueOf(i));
                Boolean bool = Boolean.FALSE;
                c3244l3.getClass();
                c3244l3.m15572j(null, bool);
                c3244l2.getClass();
                c3244l2.m15572j(null, bool);
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                scaVar.mo8482P();
                return;
            }
            return;
        }
        if (q15Var instanceof f15) {
            scaVar.mo8482P();
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$onDone$1(this, null), 3);
            return;
        }
        if (q15Var instanceof l15) {
            String str = ((l15) q15Var).f48895a;
            int iIntValue = ((Number) c3244l4.getValue()).intValue();
            AbstractC1263a.m7046a(this.f25956z);
            this.f25956z = wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$onSentenceTextChanged$1(this, iIntValue, str, null), 3);
            return;
        }
        boolean z3 = q15Var instanceof o15;
        C3244l c3244l5 = this.f25953w;
        if (z3) {
            o15 o15Var = (o15) q15Var;
            String str2 = o15Var.f53587a;
            String str3 = o15Var.f53588b;
            if (fa4.m11650l(c3244l5.getValue(), str2)) {
                int iIntValue2 = ((Number) c3244l4.getValue()).intValue();
                AbstractC1263a.m7046a(this.f25956z);
                this.f25956z = wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$onTranslationChanged$1(this, iIntValue2, str2, str3, null), 3);
                return;
            }
            return;
        }
        boolean z4 = q15Var instanceof g15;
        C3244l c3244l6 = this.f25954x;
        if (z4) {
            g15 g15Var = (g15) q15Var;
            String str4 = g15Var.f40048a;
            String str5 = g15Var.f40049b;
            if (fa4.m11650l(c3244l6.getValue(), str4)) {
                int iIntValue3 = ((Number) c3244l4.getValue()).intValue();
                AbstractC1263a.m7046a(this.f25956z);
                this.f25956z = wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$onNoteChanged$1(this, iIntValue3, str4, str5, null), 3);
                return;
            }
            return;
        }
        if (q15Var instanceof n15) {
            c3244l3.m15572j(null, Boolean.valueOf(!((Boolean) c3244l3.getValue()).booleanValue()));
            return;
        }
        if (q15Var instanceof m15) {
            c3244l2.m15572j(null, Boolean.valueOf(!((Boolean) c3244l2.getValue()).booleanValue()));
            return;
        }
        if (q15Var instanceof y05) {
            String str6 = ((y05) q15Var).f69051a;
            int iIntValue4 = ((Number) c3244l4.getValue()).intValue();
            Boolean bool2 = Boolean.TRUE;
            c3244l3.getClass();
            c3244l3.m15572j(null, bool2);
            AbstractC1263a.m7046a(this.f25956z);
            this.f25956z = wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$addTranslation$1(this, iIntValue4, str6, null), 3);
            return;
        }
        if (q15Var instanceof x05) {
            String str7 = ((x05) q15Var).f67590a;
            int iIntValue5 = ((Number) c3244l4.getValue()).intValue();
            Boolean bool3 = Boolean.TRUE;
            c3244l2.getClass();
            c3244l2.m15572j(null, bool3);
            AbstractC1263a.m7046a(this.f25956z);
            this.f25956z = wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$addNote$1(this, iIntValue5, str7, null), 3);
            return;
        }
        if (q15Var instanceof p15) {
            c3244l5.m15571i(((p15) q15Var).f55429a);
            return;
        }
        if (q15Var instanceof h15) {
            c3244l6.m15571i(((h15) q15Var).f41661a);
            return;
        }
        if (q15Var instanceof c15) {
            c15 c15Var = (c15) q15Var;
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$adjustAudioTimestamp$1(this, ((Number) c3244l4.getValue()).intValue(), c15Var.f9309a, c15Var.f9310b, null), 3);
            return;
        }
        if (q15Var instanceof d15) {
            d15 d15Var = (d15) q15Var;
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$setAudioTimestamp$1(this, ((Number) c3244l4.getValue()).intValue(), d15Var.f34833a, d15Var.f34834b, null), 3);
            return;
        }
        if (q15Var instanceof a15) {
            kx8 kx8Var = (kx8) m8989X2(((Number) c3244l4.getValue()).intValue() - 1).getValue();
            c3244l.m15572j(null, Boolean.valueOf(!((Boolean) c3244l.getValue()).booleanValue()));
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$toggleAudioPlay$1(this, kx8Var, null), 3);
        } else if (q15Var instanceof z05) {
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$audioCopyPrevious$1(((Number) c3244l4.getValue()).intValue(), this, null), 3);
        } else if (q15Var instanceof b15) {
            wfb.m23926u(lda.m16103C(this), null, null, new LessonEditViewModel$audioStartPlusThree$1(((Number) c3244l4.getValue()).intValue(), this, null), 3);
        } else if (q15Var instanceof j15) {
            scaVar.mo8482P();
        } else {
            gm5.m12750e();
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8988W2(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C3244l c3244l = this.f25948r;
        c3244l.getClass();
        c3244l.m15572j(null, numValueOf);
        Boolean bool = Boolean.FALSE;
        C3244l c3244l2 = this.f25951u;
        c3244l2.getClass();
        c3244l2.m15572j(null, bool);
        C3244l c3244l3 = this.f25952v;
        c3244l3.getClass();
        c3244l3.m15572j(null, bool);
        C3244l c3244l4 = this.f25949s;
        c3244l4.getClass();
        c3244l4.m15572j(null, bool);
        this.f25941k.mo8482P();
        t66 t66Var = this.f25944n;
        ((xc9) t66Var).setValue(w15.m23674a((w15) ((xc9) t66Var).getValue(), new u15(i), false, 6));
    }

    /* JADX INFO: renamed from: X2 */
    public final eh9 m8989X2(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f25931A;
        Object objM15520B = linkedHashMap.get(numValueOf);
        if (objM15520B == null) {
            objM15520B = AbstractC3224d.m15520B(new x15(new c83[]{new l83(((C1295k) this.f25934d.f53649a).m7253K(this.f25942l, i), new LessonEditViewModel$buildPageStateFlow$1(3, null), 1), this.f25951u, this.f25952v, this.f25949s, this.f25950t, ((C1297m) this.f25939i.f66742a).m7329c(), this.f25948r}, i + 1, this), lda.m16103C(this), xi9.f68262a, new kx8(null, null, null, null, 1023));
            linkedHashMap.put(numValueOf, objM15520B);
        }
        return (eh9) objM15520B;
    }
}
