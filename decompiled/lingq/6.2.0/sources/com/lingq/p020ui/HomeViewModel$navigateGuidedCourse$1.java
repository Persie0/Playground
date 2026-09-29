package com.lingq.p020ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel", m4291f = "HomeViewModel.kt", m4292l = {287}, m4293m = "navigateGuidedCourse", m4294v = 2)
final class HomeViewModel$navigateGuidedCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f33965a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2888d f33967c;

    /* JADX INFO: renamed from: d */
    public int f33968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$navigateGuidedCourse$1(C2888d c2888d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33967c = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33966b = obj;
        this.f33968d |= Integer.MIN_VALUE;
        return this.f33967c.m9809X2(0, null, this);
    }
}
