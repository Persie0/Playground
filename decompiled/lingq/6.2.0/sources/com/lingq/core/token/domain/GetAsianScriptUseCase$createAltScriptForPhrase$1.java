package com.lingq.core.token.domain;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAsianScriptUseCase", m4291f = "GetAsianScriptUseCase.kt", m4292l = {138}, m4293m = "createAltScriptForPhrase", m4294v = 2)
final class GetAsianScriptUseCase$createAltScriptForPhrase$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23754a;

    /* JADX INFO: renamed from: b */
    public Collection f23755b;

    /* JADX INFO: renamed from: c */
    public Iterator f23756c;

    /* JADX INFO: renamed from: d */
    public int f23757d;

    /* JADX INFO: renamed from: e */
    public int f23758e;

    /* JADX INFO: renamed from: f */
    public int f23759f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23760g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1905b f23761h;

    /* JADX INFO: renamed from: i */
    public int f23762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAsianScriptUseCase$createAltScriptForPhrase$1(C1905b c1905b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23761h = c1905b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23760g = obj;
        this.f23762i |= Integer.MIN_VALUE;
        return this.f23761h.m8715a(null, null, this);
    }
}
