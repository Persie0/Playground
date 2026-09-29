package com.lingq.feature.statistics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsUpdateViewModel$cupBanner$lambda$0$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$cupBanner$lambda$0$$inlined$map$1$2", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2802xf3de9c0e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33247a;

    /* JADX INFO: renamed from: b */
    public int f33248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f33249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2802xf3de9c0e(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f33249c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33247a = obj;
        this.f33248b |= Integer.MIN_VALUE;
        return this.f33249c.emit(null, this);
    }
}
