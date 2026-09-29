package com.lingq.feature.more;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1304t;
import com.lingq.core.datastore.C1369b;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.g41;
import p000.lda;
import p000.nm7;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.more.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2160a extends wta {

    /* JADX INFO: renamed from: b */
    public final C1304t f26833b;

    /* JADX INFO: renamed from: c */
    public final nm7 f26834c;

    /* JADX INFO: renamed from: d */
    public final C3244l f26835d;

    /* JADX INFO: renamed from: e */
    public final c18 f26836e;

    /* JADX INFO: renamed from: f */
    public final c18 f26837f;

    /* JADX INFO: renamed from: g */
    public final c18 f26838g;

    /* JADX INFO: renamed from: h */
    public final C3244l f26839h;

    /* JADX INFO: renamed from: i */
    public final c18 f26840i;

    public C2160a(C1304t c1304t, nm7 nm7Var) {
        c1304t.getClass();
        nm7Var.getClass();
        this.f26833b = c1304t;
        this.f26834c = nm7Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f26835d = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f26836e = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, "");
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C1369b c1369b = (C1369b) nm7Var;
        this.f26837f = AbstractC3224d.m15520B(c1369b.f18485r, lda.m16103C(this), c3243k, 0);
        this.f26838g = AbstractC3224d.m15520B(c1369b.f18486s, lda.m16103C(this), c3243k, 0);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f26839h = c3244lM17114d2;
        this.f26840i = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        wfb.m23926u(lda.m16103C(this), null, null, new InviteFriendsViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new InviteFriendsViewModel$observeReferrals$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new InviteFriendsViewModel$fetchReferrals$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new InviteFriendsViewModel$fetchReferralStats$1(this, null), 3);
    }
}
