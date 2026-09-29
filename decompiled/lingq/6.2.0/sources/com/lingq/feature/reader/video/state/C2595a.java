package com.lingq.feature.reader.video.state;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1537e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.feature.reader.content.C2260a;
import com.lingq.feature.reader.content.domain.C2263b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.bed;
import p000.c18;
import p000.cx1;
import p000.em3;
import p000.m83;
import p000.p08;
import p000.qj2;
import p000.ql3;
import p000.u91;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xi9;
import p000.xz7;
import p000.yz4;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2595a {

    /* JADX INFO: renamed from: a */
    public final C2263b f31524a;

    /* JADX INFO: renamed from: b */
    public final C1537e f31525b;

    /* JADX INFO: renamed from: c */
    public final C1533a f31526c;

    /* JADX INFO: renamed from: d */
    public final C3139j9 f31527d;

    /* JADX INFO: renamed from: e */
    public final qj2 f31528e;

    /* JADX INFO: renamed from: f */
    public final ql3 f31529f;

    /* JADX INFO: renamed from: g */
    public final C2260a f31530g;

    /* JADX INFO: renamed from: h */
    public final un1 f31531h;

    /* JADX INFO: renamed from: i */
    public final C3244l f31532i;

    /* JADX INFO: renamed from: j */
    public final C3244l f31533j;

    /* JADX INFO: renamed from: k */
    public final C3244l f31534k;

    /* JADX INFO: renamed from: l */
    public final c18 f31535l;

    /* JADX INFO: renamed from: m */
    public final C3244l f31536m;

    /* JADX INFO: renamed from: n */
    public final C3244l f31537n;

    /* JADX INFO: renamed from: o */
    public final c18 f31538o;

    /* JADX INFO: renamed from: p */
    public final c18 f31539p;

    /* JADX INFO: renamed from: q */
    public final c18 f31540q;

    public C2595a(C2263b c2263b, C1537e c1537e, C1533a c1533a, C3139j9 c3139j9, qj2 qj2Var, ql3 ql3Var, em3 em3Var, C2260a c2260a, C2596b c2596b, v72 v72Var, un1 un1Var) {
        c2260a.getClass();
        un1Var.getClass();
        this.f31524a = c2263b;
        this.f31525b = c1537e;
        this.f31526c = c1533a;
        this.f31527d = c3139j9;
        this.f31528e = qj2Var;
        this.f31529f = ql3Var;
        this.f31530g = c2260a;
        this.f31531h = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f31532i = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(0);
        this.f31533j = c3244lM17114d2;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f31534k = c3244lM17114d3;
        C3235e c3235eM15521C = AbstractC3224d.m15521C(c3244lM17114d3, new VideoContentStateHolder$words$1(this, null));
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, un1Var, c3243k, AbstractC3194a.m15360M());
        this.f31535l = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d3, new VideoContentStateHolder$cards$1(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3228h(c3244lM17114d, c3244lM17114d2, new VideoContentStateHolder$phrases$1(3, null)), new VideoContentStateHolder$phrases$2(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(emptyList);
        this.f31536m = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(emptyList);
        this.f31537n = c3244lM17114d5;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(AbstractC3224d.m15544w(AbstractC3224d.m15531j(AbstractC3224d.m15532k(c3244lM17114d5, AbstractC3224d.m15536o(new p08(c2260a.f27957w, 16)), c3244lM17114d4, new VideoContentStateHolder$paragraphs$2(4, null)), AbstractC3224d.m15532k(c18VarM15520B, c18VarM15520B2, c18VarM15520B3, new VideoContentStateHolder$paragraphs$3(4, null)), c2596b.f31545e, AbstractC3224d.m15536o(((C1368a) em3Var.f37455a).f18387Y0), new VideoContentStateHolder$paragraphs$4(this, null)), v72Var), un1Var, c3243k, emptyList);
        this.f31538o = c18VarM15520B4;
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15544w(new C3228h(c18VarM15520B4, c18VarM15520B, new VideoContentStateHolder$completionData$1(this, null)), v72Var), un1Var, c3243k, new Pair(-1, 0));
        this.f31539p = c18VarM15520B5;
        this.f31540q = AbstractC3224d.m15520B(new cx1(c18VarM15520B5, 10), un1Var, c3243k, -1);
    }

    /* JADX INFO: renamed from: a */
    public final int m9519a() {
        return ((Number) ((Pair) ((C3244l) this.f31539p.f9311a).getValue()).f47624b).intValue();
    }

    /* JADX INFO: renamed from: b */
    public final TokenFragmentData m9520b(List list) {
        Object next;
        String str;
        if (list.isEmpty()) {
            return new TokenFragmentData();
        }
        int i = ((xz7) u91.m22589G0(list)).f69010g;
        Iterator it = ((yz4) ((C3244l) this.f31530g.f27957w.f9311a).getValue()).f70668b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LessonSentence) next).f19256d != i);
        LessonSentence lessonSentence = (LessonSentence) next;
        if (lessonSentence == null || (str = lessonSentence.f19254b) == null) {
            str = "";
        }
        Iterable iterable = (Iterable) this.f31534k.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((xz7) obj).f69010g == i) {
                arrayList.add(obj);
            }
        }
        return bed.m3675a(arrayList, list, str, AbstractC3184kh.m15194A((String) this.f31532i.getValue()));
    }

    /* JADX INFO: renamed from: c */
    public final Locale m9521c() {
        Locale localeForLanguageTag = Locale.forLanguageTag((String) this.f31532i.getValue());
        localeForLanguageTag.getClass();
        return localeForLanguageTag;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m9522d(int i) {
        Object next;
        Iterator it = ((Iterable) this.f31534k.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xz7) next).f69009f != i);
        xz7 xz7Var = (xz7) next;
        if (xz7Var != null) {
            return Integer.valueOf(xz7Var.f69010g);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m9523e(int i) {
        Object next;
        Iterator it = ((Iterable) this.f31534k.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xz7) next).f69010g != i);
        xz7 xz7Var = (xz7) next;
        if (xz7Var != null) {
            return Integer.valueOf(xz7Var.f69009f);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m9524f(int i, String str) {
        C3244l c3244l = this.f31532i;
        c3244l.getClass();
        c3244l.m15572j(null, str);
        Integer numValueOf = Integer.valueOf(i);
        C3244l c3244l2 = this.f31533j;
        c3244l2.getClass();
        c3244l2.m15572j(null, numValueOf);
        String str2 = (String) c3244l.getValue();
        C2260a c2260a = this.f31530g;
        m83 m83Var = new m83(this.f31524a.m9258a(str2, AbstractC3224d.m15536o(new p08(c2260a.f27957w, 14))), new VideoContentStateHolder$observeSentenceTokens$2(this, null), 2);
        un1 un1Var = this.f31531h;
        AbstractC3224d.m15545x(m83Var, un1Var);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new p08(c2260a.f27957w, 15)), new VideoContentStateHolder$observeTimestamps$2(this, null)), new VideoContentStateHolder$observeTimestamps$3(this, null), 2), un1Var);
        wfb.m23926u(un1Var, null, null, new VideoContentStateHolder$initialize$1(this, str, i, null), 3);
    }
}
