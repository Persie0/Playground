package com.lingq.feature.reader.content.domain;

import com.lingq.core.datastore.C1368a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.fm3;
import p000.n83;
import p000.nl3;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2263b {

    /* JADX INFO: renamed from: a */
    public final nl3 f27985a;

    /* JADX INFO: renamed from: b */
    public final fm3 f27986b;

    public C2263b(nl3 nl3Var, fm3 fm3Var) {
        this.f27985a = nl3Var;
        this.f27986b = fm3Var;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m9258a(String str, c83 c83Var) {
        str.getClass();
        return AbstractC3224d.m15532k(c83Var, AbstractC3224d.m15536o(this.f27985a.m17484a(str)), AbstractC3224d.m15536o(AbstractC3224d.m15536o(((C1368a) this.f27986b.f39280a).f18385X0)), new VideoTextProvider$observeSentenceParagraphs$1(str, null));
    }
}
