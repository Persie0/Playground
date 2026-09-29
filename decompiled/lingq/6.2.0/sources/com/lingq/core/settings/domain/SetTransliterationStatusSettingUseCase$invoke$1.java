package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetTransliterationStatusSettingUseCase", m4291f = "SetTransliterationStatusSettingUseCase.kt", m4292l = {13, 14}, m4293m = "invoke", m4294v = 2)
final class SetTransliterationStatusSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22850a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1869h f22852c;

    /* JADX INFO: renamed from: d */
    public int f22853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTransliterationStatusSettingUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22852c = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22851b = obj;
        this.f22853d |= Integer.MIN_VALUE;
        return this.f22852c.m8634c(false, this);
    }
}
