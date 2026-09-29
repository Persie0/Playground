package com.lingq.feature.reader.video.state;

import kotlin.Pair;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.hqa;
import p000.m97;
import p000.un1;
import p000.vma;
import p000.wfb;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.state.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2597c {

    /* JADX INFO: renamed from: a */
    public final vma f31551a;

    /* JADX INFO: renamed from: b */
    public final un1 f31552b;

    /* JADX INFO: renamed from: c */
    public final C3244l f31553c;

    /* JADX INFO: renamed from: d */
    public final c18 f31554d;

    /* JADX INFO: renamed from: e */
    public final C3244l f31555e;

    /* JADX INFO: renamed from: f */
    public final c18 f31556f;

    /* JADX INFO: renamed from: g */
    public final C3244l f31557g;

    /* JADX INFO: renamed from: h */
    public final c18 f31558h;

    /* JADX INFO: renamed from: i */
    public final C3244l f31559i;

    /* JADX INFO: renamed from: j */
    public final C3244l f31560j;

    /* JADX INFO: renamed from: k */
    public final c18 f31561k;

    /* JADX INFO: renamed from: l */
    public Integer f31562l;

    /* JADX INFO: renamed from: m */
    public Integer f31563m;

    /* JADX INFO: renamed from: n */
    public boolean f31564n;

    /* JADX INFO: renamed from: o */
    public final C3244l f31565o;

    /* JADX INFO: renamed from: p */
    public final C3244l f31566p;

    /* JADX INFO: renamed from: q */
    public long f31567q;

    /* JADX INFO: renamed from: r */
    public long f31568r;

    /* JADX INFO: renamed from: s */
    public long f31569s;

    /* JADX INFO: renamed from: t */
    public final C3244l f31570t;

    /* JADX INFO: renamed from: u */
    public final C3244l f31571u;

    public C2597c(vma vmaVar, un1 un1Var) {
        vmaVar.getClass();
        un1Var.getClass();
        this.f31551a = vmaVar;
        this.f31552b = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new hqa());
        this.f31553c = c3244lM17114d;
        C3243k c3243k = xi9.f68262a;
        this.f31554d = AbstractC3224d.m15520B(c3244lM17114d, un1Var, c3243k, new hqa());
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f31555e = c3244lM17114d2;
        this.f31556f = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, c3243k, null);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f31557g = c3244lM17114d3;
        this.f31558h = AbstractC3224d.m15520B(c3244lM17114d3, un1Var, c3243k, null);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(new Pair(-1, null));
        this.f31559i = c3244lM17114d4;
        AbstractC3224d.m15520B(c3244lM17114d4, un1Var, c3243k, new Pair(-1, null));
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f31560j = c3244lM17114d5;
        this.f31561k = AbstractC3224d.m15520B(c3244lM17114d5, un1Var, c3243k, null);
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f31565o = c3244lM17114d6;
        this.f31566p = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(null);
        this.f31570t = c3244lM17114d7;
        this.f31571u = c3244lM17114d7;
    }

    /* JADX INFO: renamed from: a */
    public final void m9526a(int i) {
        wfb.m23926u(this.f31552b, null, null, new VideoPlayerStateHolder$initialize$1(this, i, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9527b(long j) {
        C3244l c3244l = this.f31565o;
        if (((Boolean) c3244l.getValue()).booleanValue()) {
            return;
        }
        this.f31568r = j;
        m97 m97Var = (m97) this.f31570t.getValue();
        if (m97Var != null) {
            j = m97Var.m16701e(j);
        }
        this.f31567q = j;
        Boolean bool = Boolean.TRUE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
    }
}
