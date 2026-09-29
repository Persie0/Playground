package com.lingq.core.settings.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2", m4291f = "GetDailyLingqSettingsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22756a;

    /* JADX INFO: renamed from: b */
    public int f22757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f22758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDailyLingqSettingsUseCase$invoke$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f22758c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22756a = obj;
        this.f22757b |= Integer.MIN_VALUE;
        return this.f22758c.emit(null, this);
    }
}
