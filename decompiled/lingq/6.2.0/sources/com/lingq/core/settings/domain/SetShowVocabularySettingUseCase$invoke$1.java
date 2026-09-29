package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetShowVocabularySettingUseCase", m4291f = "SetShowVocabularySettingUseCase.kt", m4292l = {13, 14}, m4293m = "invoke", m4294v = 2)
final class SetShowVocabularySettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22834a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1869h f22836c;

    /* JADX INFO: renamed from: d */
    public int f22837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetShowVocabularySettingUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22836c = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22835b = obj;
        this.f22837d |= Integer.MIN_VALUE;
        return this.f22836c.m8634c(false, this);
    }
}
