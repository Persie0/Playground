package com.lingq.feature.reader.reader.domain;

import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.datastore.C1369b;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3513qw;
import p000.n83;
import p000.nm7;
import p000.xo1;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2498b {

    /* JADX INFO: renamed from: a */
    public final y95 f30276a;

    /* JADX INFO: renamed from: b */
    public final xo1 f30277b;

    /* JADX INFO: renamed from: c */
    public final nm7 f30278c;

    public C2498b(y95 y95Var, xo1 xo1Var, nm7 nm7Var) {
        y95Var.getClass();
        xo1Var.getClass();
        nm7Var.getClass();
        this.f30276a = y95Var;
        this.f30277b = xo1Var;
        this.f30278c = nm7Var;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m9399a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15532k(((C1296l) this.f30276a).m7315j(i), ((C1290f) this.f30277b).m7183g(str), new C3513qw(((C1369b) this.f30278c).f18480m, 15), new ObserveCourseSubscriptionStateUseCase$invoke$2(i, null));
    }
}
