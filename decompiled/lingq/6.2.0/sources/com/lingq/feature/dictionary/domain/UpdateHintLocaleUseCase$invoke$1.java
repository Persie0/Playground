package com.lingq.feature.dictionary.domain;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.domain.UpdateHintLocaleUseCase", m4291f = "UpdateHintLocaleUseCase.kt", m4292l = {20, 24, 32}, m4293m = "invoke", m4294v = 2)
final class UpdateHintLocaleUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25805a;

    /* JADX INFO: renamed from: b */
    public String f25806b;

    /* JADX INFO: renamed from: c */
    public TokenMeaning f25807c;

    /* JADX INFO: renamed from: d */
    public String f25808d;

    /* JADX INFO: renamed from: e */
    public String f25809e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f25810f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2060a f25811g;

    /* JADX INFO: renamed from: h */
    public int f25812h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateHintLocaleUseCase$invoke$1(C2060a c2060a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25811g = c2060a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25810f = obj;
        this.f25812h |= Integer.MIN_VALUE;
        return this.f25811g.m8977a(null, null, null, null, null, this);
    }
}
