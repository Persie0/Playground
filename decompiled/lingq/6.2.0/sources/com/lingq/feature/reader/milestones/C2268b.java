package com.lingq.feature.reader.milestones;

import com.lingq.feature.reader.milestones.domain.C2270b;
import com.lingq.feature.reader.milestones.domain.C2271c;
import com.lingq.feature.reader.milestones.state.C2272a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.cz5;
import p000.hi8;
import p000.un1;
import p000.wfb;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2268b {

    /* JADX INFO: renamed from: a */
    public final cz5 f28168a;

    /* JADX INFO: renamed from: b */
    public final C2270b f28169b;

    /* JADX INFO: renamed from: c */
    public final C2271c f28170c;

    /* JADX INFO: renamed from: d */
    public final hi8 f28171d;

    /* JADX INFO: renamed from: e */
    public final C2272a f28172e;

    /* JADX INFO: renamed from: f */
    public final un1 f28173f;

    /* JADX INFO: renamed from: g */
    public final C3244l f28174g;

    /* JADX INFO: renamed from: h */
    public final c18 f28175h;

    public C2268b(cz5 cz5Var, C2270b c2270b, C2271c c2271c, hi8 hi8Var, C2272a c2272a, un1 un1Var) {
        cz5Var.getClass();
        un1Var.getClass();
        this.f28168a = cz5Var;
        this.f28169b = c2270b;
        this.f28170c = c2271c;
        this.f28171d = hi8Var;
        this.f28172e = c2272a;
        this.f28173f = un1Var;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f28174g = c3244lM17114d;
        this.f28175h = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, bool);
    }

    /* JADX INFO: renamed from: a */
    public final void m9278a(int i, String str) {
        wfb.m23926u(this.f28173f, null, null, new ReaderMilestonesManager$start$1(this, i, str, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9279b(int i) {
        wfb.m23926u(this.f28173f, null, null, new ReaderMilestonesManager$updateStreakChallenge$1(this, i, null), 3);
    }
}
