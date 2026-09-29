package com.lingq.core.domain.lesson;

import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.d65;
import p000.y95;
import p000.yl3;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1383e {

    /* JADX INFO: renamed from: a */
    public final d65 f18729a;

    /* JADX INFO: renamed from: b */
    public final y95 f18730b;

    public C1383e(d65 d65Var, y95 y95Var) {
        d65Var.getClass();
        y95Var.getClass();
        this.f18729a = d65Var;
        this.f18730b = y95Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m7994a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15521C(AbstractC1543a.m8226a(new yl3(this, i, 3), new GetLessonInfoUseCase$invoke$2(this, str, i, null)), new GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1(null, this, i)));
    }
}
