package com.lingq.core.settings.domain;

import com.lingq.core.settings.ViewKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.UpdateReviewSettingUseCase", m4291f = "UpdateReviewSettingUseCase.kt", m4292l = {21, 22}, m4293m = "invoke", m4294v = 2)
final class UpdateReviewSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22896a;

    /* JADX INFO: renamed from: b */
    public ViewKeys f22897b;

    /* JADX INFO: renamed from: c */
    public boolean f22898c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22899d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1872k f22900e;

    /* JADX INFO: renamed from: f */
    public int f22901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateReviewSettingUseCase$invoke$1(C1872k c1872k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22900e = c1872k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22899d = obj;
        this.f22901f |= Integer.MIN_VALUE;
        return this.f22900e.m8641a(null, null, this, false);
    }
}
