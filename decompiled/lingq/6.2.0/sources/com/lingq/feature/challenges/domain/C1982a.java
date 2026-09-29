package com.lingq.feature.challenges.domain;

import kotlin.coroutines.Continuation;
import p000.s13;
import p000.vz1;
import p000.xo1;

/* JADX INFO: renamed from: com.lingq.feature.challenges.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1982a {
    private static final s13 Companion = new s13();

    /* JADX INFO: renamed from: a */
    public final xo1 f24754a;

    public C1982a(xo1 xo1Var) {
        xo1Var.getClass();
        this.f24754a = xo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m8846a(String str, String str2, Continuation continuation) {
        return vz1.m23649s(new FetchBookChallengeCoursesUseCase$invoke$2(this, str, str2, null), continuation);
    }
}
