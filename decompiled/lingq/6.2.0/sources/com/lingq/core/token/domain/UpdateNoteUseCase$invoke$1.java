package com.lingq.core.token.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.UpdateNoteUseCase", m4291f = "UpdateNoteUseCase.kt", m4292l = {10, 12}, m4293m = "invoke", m4294v = 2)
final class UpdateNoteUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23839a;

    /* JADX INFO: renamed from: b */
    public String f23840b;

    /* JADX INFO: renamed from: c */
    public String f23841c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f23842d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1906c f23843e;

    /* JADX INFO: renamed from: f */
    public int f23844f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNoteUseCase$invoke$1(C1906c c1906c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23843e = c1906c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23842d = obj;
        this.f23844f |= Integer.MIN_VALUE;
        return this.f23843e.m8723c(null, null, null, this);
    }
}
