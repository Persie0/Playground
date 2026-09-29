package com.lingq.feature.statistics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33212a;

    /* JADX INFO: renamed from: b */
    public int f33213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f33214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$special$$inlined$filterNot$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f33214c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33212a = obj;
        this.f33213b |= Integer.MIN_VALUE;
        return this.f33214c.emit(null, this);
    }
}
