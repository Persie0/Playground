package com.lingq.feature.reader.reader.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.domain.FetchCourseUseCase", m4291f = "FetchCourseUseCase.kt", m4292l = {21}, m4293m = "invoke", m4294v = 2)
final class FetchCourseUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f30260a;

    /* JADX INFO: renamed from: b */
    public String f30261b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30262c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2497a f30263d;

    /* JADX INFO: renamed from: e */
    public int f30264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCourseUseCase$invoke$1(C2497a c2497a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30263d = c2497a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30262c = obj;
        this.f30264e |= Integer.MIN_VALUE;
        return this.f30263d.m9398a(0, null, this);
    }
}
