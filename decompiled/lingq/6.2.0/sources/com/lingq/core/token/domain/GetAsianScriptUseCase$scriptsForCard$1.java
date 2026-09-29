package com.lingq.core.token.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAsianScriptUseCase", m4291f = "GetAsianScriptUseCase.kt", m4292l = {79}, m4293m = "scriptsForCard", m4294v = 2)
final class GetAsianScriptUseCase$scriptsForCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23782a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1905b f23784c;

    /* JADX INFO: renamed from: d */
    public int f23785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAsianScriptUseCase$scriptsForCard$1(C1905b c1905b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23784c = c1905b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23783b = obj;
        this.f23785d |= Integer.MIN_VALUE;
        return this.f23784c.m8718e(null, null, this);
    }
}
