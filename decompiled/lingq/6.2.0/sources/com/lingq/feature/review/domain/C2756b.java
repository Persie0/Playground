package com.lingq.feature.review.domain;

import p000.hm5;
import p000.nn1;
import p000.un1;
import p000.wfb;
import p000.zm3;

/* JADX INFO: renamed from: com.lingq.feature.review.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2756b {

    /* JADX INFO: renamed from: a */
    public final hm5 f32468a;

    /* JADX INFO: renamed from: b */
    public final zm3 f32469b;

    /* JADX INFO: renamed from: c */
    public final nn1 f32470c;

    /* JADX INFO: renamed from: d */
    public final un1 f32471d;

    public C2756b(hm5 hm5Var, zm3 zm3Var, nn1 nn1Var, un1 un1Var) {
        hm5Var.getClass();
        un1Var.getClass();
        this.f32468a = hm5Var;
        this.f32469b = zm3Var;
        this.f32470c = nn1Var;
        this.f32471d = un1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m9601a(String str, Long l) {
        str.getClass();
        if (l != null) {
            wfb.m23926u(this.f32471d, this.f32470c, null, new ReviewAnalyticsDelegate$trackSpeakingTime$1(l.longValue(), this, str, null), 2);
        }
    }
}
