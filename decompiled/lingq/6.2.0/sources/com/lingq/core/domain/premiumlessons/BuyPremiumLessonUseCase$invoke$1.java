package com.lingq.core.domain.premiumlessons;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.premiumlessons.BuyPremiumLessonUseCase", m4291f = "BuyPremiumLessonUseCase.kt", m4292l = {13, 14, 16}, m4293m = "invoke", m4294v = 2)
final class BuyPremiumLessonUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f19952a;

    /* JADX INFO: renamed from: b */
    public int f19953b;

    /* JADX INFO: renamed from: c */
    public int f19954c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19955d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1525a f19956e;

    /* JADX INFO: renamed from: f */
    public int f19957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumLessonUseCase$invoke$1(C1525a c1525a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19956e = c1525a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19955d = obj;
        this.f19957f |= Integer.MIN_VALUE;
        return this.f19956e.m8202a(0, 0, 0, this);
    }
}
