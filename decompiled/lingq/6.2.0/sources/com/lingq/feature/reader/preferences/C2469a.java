package com.lingq.feature.reader.preferences;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import p000.bw8;
import p000.c18;
import p000.c83;
import p000.em3;
import p000.fm3;
import p000.ly7;
import p000.my7;
import p000.nl3;
import p000.rm3;
import p000.si7;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.wi7;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.preferences.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2469a {
    public static final my7 Companion = new my7();

    /* JADX INFO: renamed from: m */
    public static final List f29834m = vz1.m23605K(new Pair("0.5x", Float.valueOf(0.5f)), new Pair("0.66x", Float.valueOf(0.66f)), new Pair("0.75x", Float.valueOf(0.75f)), new Pair("0.9x", Float.valueOf(0.9f)), new Pair("1x", Float.valueOf(1.0f)), new Pair("1.1x", Float.valueOf(1.1f)), new Pair("1.25x", Float.valueOf(1.25f)), new Pair("1.5x", Float.valueOf(1.5f)), new Pair("1.75x", Float.valueOf(1.75f)), new Pair("2x", Float.valueOf(2.0f)));

    /* JADX INFO: renamed from: a */
    public final si7 f29835a;

    /* JADX INFO: renamed from: b */
    public final un1 f29836b;

    /* JADX INFO: renamed from: c */
    public final c18 f29837c;

    /* JADX INFO: renamed from: d */
    public final c18 f29838d;

    /* JADX INFO: renamed from: e */
    public final c18 f29839e;

    /* JADX INFO: renamed from: f */
    public final c18 f29840f;

    /* JADX INFO: renamed from: g */
    public final c18 f29841g;

    /* JADX INFO: renamed from: h */
    public final c18 f29842h;

    /* JADX INFO: renamed from: i */
    public final c18 f29843i;

    /* JADX INFO: renamed from: j */
    public final c18 f29844j;

    /* JADX INFO: renamed from: k */
    public final c18 f29845k;

    /* JADX INFO: renamed from: l */
    public final c18 f29846l;

    public C2469a(rm3 rm3Var, fm3 fm3Var, fm3 fm3Var2, bw8 bw8Var, fm3 fm3Var3, nl3 nl3Var, nl3 nl3Var2, em3 em3Var, si7 si7Var, un1 un1Var) {
        si7Var.getClass();
        un1Var.getClass();
        this.f29835a = si7Var;
        this.f29836b = un1Var;
        c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) rm3Var.f59534a).f18353K0);
        C3243k c3243k = xi9.f68262a;
        Boolean bool = Boolean.FALSE;
        this.f29837c = AbstractC3224d.m15520B(c83VarM15536o, un1Var, c3243k, bool);
        this.f29838d = AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) fm3Var.f39280a).f18324A1), un1Var, c3243k, bool);
        C1368a c1368a = (C1368a) si7Var;
        wi7 wi7Var = c1368a.f18425l1;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC3224d.m15520B(wi7Var, un1Var, c3243k, fValueOf);
        this.f29839e = AbstractC3224d.m15520B(c1368a.f18365O0, un1Var, c3243k, bool);
        wi7 wi7Var2 = c1368a.f18434o1;
        Boolean bool2 = Boolean.TRUE;
        this.f29840f = AbstractC3224d.m15520B(wi7Var2, un1Var, c3243k, bool2);
        this.f29841g = AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) nl3Var.f52909a).f18369P1), un1Var, c3243k, bool2);
        c18 c18VarM15520B = AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) fm3Var2.f39280a).f18410g1), un1Var, c3243k, bool);
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(c1368a.f18428m1, un1Var, c3243k, fValueOf);
        this.f29842h = c18VarM15520B2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(c1368a.f18431n1, un1Var, c3243k, fValueOf);
        this.f29843i = c18VarM15520B3;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(c1368a.f18452u1, un1Var, c3243k, AudioUnderlineMode.Wave);
        this.f29844j = c18VarM15520B4;
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) fm3Var3.f39280a).f18366O1), un1Var, c3243k, bool2);
        this.f29845k = c18VarM15520B5;
        this.f29846l = AbstractC3224d.m15520B(new C3228h(AbstractC3224d.m15530i(c18VarM15520B, c18VarM15520B2, c18VarM15520B3, c18VarM15520B5, AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) nl3Var2.f52909a).f18419j1), un1Var, c3243k, bool2), new ReaderPreferencesStateHolder$state$1(null)), new C3228h(AbstractC3224d.m15520B(AbstractC3224d.m15536o(((C1368a) em3Var.f37455a).f18464y1), un1Var, c3243k, bool), c18VarM15520B4, new ReaderPreferencesStateHolder$state$2(3, null)), new ReaderPreferencesStateHolder$state$3(3, null)), un1Var, c3243k, new ly7(false, 0.0f, 0.0f, false, false, f29834m, 127));
    }

    /* JADX INFO: renamed from: a */
    public final void m9371a(float f) {
        wfb.m23926u(this.f29836b, null, null, new ReaderPreferencesStateHolder$setSentencePlaybackSpeed$1(this, f, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9372b(float f) {
        wfb.m23926u(this.f29836b, null, null, new ReaderPreferencesStateHolder$setVideoPlaybackSpeed$1(this, f, null), 3);
    }
}
