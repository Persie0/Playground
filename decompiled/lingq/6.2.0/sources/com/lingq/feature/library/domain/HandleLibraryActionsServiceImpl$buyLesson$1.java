package com.lingq.feature.library.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.domain.HandleLibraryActionsServiceImpl", m4291f = "HandleLibraryActionsService.kt", m4292l = {58}, m4293m = "buyLesson", m4294v = 2)
final class HandleLibraryActionsServiceImpl$buyLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2145b f26642b;

    /* JADX INFO: renamed from: c */
    public int f26643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleLibraryActionsServiceImpl$buyLesson$1(C2145b c2145b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26642b = c2145b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26641a = obj;
        this.f26643c |= Integer.MIN_VALUE;
        return this.f26642b.m9062a(null, 0, 0, this);
    }
}
