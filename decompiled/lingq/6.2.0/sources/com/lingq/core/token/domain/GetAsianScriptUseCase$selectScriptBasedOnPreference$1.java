package com.lingq.core.token.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAsianScriptUseCase", m4291f = "GetAsianScriptUseCase.kt", m4292l = {156}, m4293m = "selectScriptBasedOnPreference", m4294v = 2)
final class GetAsianScriptUseCase$selectScriptBasedOnPreference$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23790a;

    /* JADX INFO: renamed from: b */
    public String f23791b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23792c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1905b f23793d;

    /* JADX INFO: renamed from: e */
    public int f23794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAsianScriptUseCase$selectScriptBasedOnPreference$1(C1905b c1905b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23793d = c1905b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23792c = obj;
        this.f23794e |= Integer.MIN_VALUE;
        return this.f23793d.m8720g(null, null, null, this);
    }
}
