package com.lingq.core.domain.chat;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.datastore.C1368a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3513qw;
import p000.C3540rl;
import p000.fm3;
import p000.n83;
import p000.nl3;
import p000.qv0;
import p000.wa2;

/* JADX INFO: renamed from: com.lingq.core.domain.chat.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1373a {

    /* JADX INFO: renamed from: a */
    public final C1374b f18618a;

    /* JADX INFO: renamed from: b */
    public final wa2 f18619b;

    /* JADX INFO: renamed from: c */
    public final fm3 f18620c;

    /* JADX INFO: renamed from: d */
    public final nl3 f18621d;

    public C1373a(C1374b c1374b, wa2 wa2Var, fm3 fm3Var, nl3 nl3Var) {
        this.f18618a = c1374b;
        this.f18619b = wa2Var;
        this.f18620c = fm3Var;
        this.f18621d = nl3Var;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m7979a(String str, int i, String str2) {
        C3540rl c3540rl = new C3540rl(this.f18618a.m7980a(str, i, str2), 5);
        C1315c c1315c = ((C1289e) this.f18619b.f66560a).f16467a;
        return AbstractC3224d.m15531j(c3540rl, new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, false, new String[]{"ChatSentenceEntity"}, new qv0(i, c1315c, 2)))), 8), AbstractC3224d.m15536o(((C1368a) this.f18620c.f39280a).f18385X0), this.f18621d.m17484a(str), new GetChatTokensUseCase$invoke$2(this, str, null));
    }
}
