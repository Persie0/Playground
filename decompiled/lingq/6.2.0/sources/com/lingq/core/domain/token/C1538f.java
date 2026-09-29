package com.lingq.core.domain.token;

import com.lingq.core.datastore.C1368a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.n83;
import p000.si7;

/* JADX INFO: renamed from: com.lingq.core.domain.token.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1538f {

    /* JADX INFO: renamed from: a */
    public final si7 f20104a;

    public C1538f(si7 si7Var) {
        si7Var.getClass();
        this.f20104a = si7Var;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m8224a(String str) {
        str.getClass();
        C1368a c1368a = (C1368a) this.f20104a;
        return AbstractC3224d.m15530i(AbstractC3224d.m15536o(c1368a.f18389Z0), AbstractC3224d.m15536o(c1368a.f18395b1), AbstractC3224d.m15536o(c1368a.f18392a1), AbstractC3224d.m15536o(c1368a.f18398c1), AbstractC3224d.m15536o(c1368a.f18401d1), new IsScriptEnabledUseCase$invoke$1(str, null));
    }
}
