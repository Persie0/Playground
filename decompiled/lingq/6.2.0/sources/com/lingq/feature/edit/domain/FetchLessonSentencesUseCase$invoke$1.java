package com.lingq.feature.edit.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.domain.FetchLessonSentencesUseCase", m4291f = "FetchLessonSentencesUseCase.kt", m4292l = {10, 11}, m4293m = "invoke", m4294v = 2)
final class FetchLessonSentencesUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25967a;

    /* JADX INFO: renamed from: b */
    public int f25968b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25969c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2081a f25970d;

    /* JADX INFO: renamed from: e */
    public int f25971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLessonSentencesUseCase$invoke$1(C2081a c2081a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25970d = c2081a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25969c = obj;
        this.f25971e |= Integer.MIN_VALUE;
        return this.f25970d.m8994a(0, null, this);
    }
}
