package com.lingq.core.domain.stats;

import com.lingq.core.data.repository.C1294j;
import kotlinx.coroutines.flow.C3228h;
import p000.oo4;

/* JADX INFO: renamed from: com.lingq.core.domain.stats.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528c {

    /* JADX INFO: renamed from: a */
    public final oo4 f19987a;

    /* JADX INFO: renamed from: b */
    public final C1529d f19988b;

    public C1528c(oo4 oo4Var, C1529d c1529d) {
        oo4Var.getClass();
        this.f19987a = oo4Var;
        this.f19988b = c1529d;
    }

    /* JADX INFO: renamed from: a */
    public final C3228h m8207a(String str) {
        str.getClass();
        return new C3228h(this.f19988b.m8208a(), ((C1294j) this.f19987a).m7237k(str), new GetStreakWeekUseCase$invoke$1(3, null));
    }
}
