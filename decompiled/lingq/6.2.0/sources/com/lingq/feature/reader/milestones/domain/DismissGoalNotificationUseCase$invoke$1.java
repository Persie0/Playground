package com.lingq.feature.reader.milestones.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.go3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.domain.DismissGoalNotificationUseCase", m4291f = "DismissGoalNotificationUseCase.kt", m4292l = {29}, m4293m = "invoke", m4294v = 2)
final class DismissGoalNotificationUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public go3 f28176a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2269a f28178c;

    /* JADX INFO: renamed from: d */
    public int f28179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissGoalNotificationUseCase$invoke$1(C2269a c2269a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28178c = c2269a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28177b = obj;
        this.f28179d |= Integer.MIN_VALUE;
        return this.f28178c.m9280a(null, this);
    }
}
