package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.ResetTutorialUseCase", m4291f = "ResetTutorialUseCase.kt", m4292l = {22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 26}, m4293m = "invoke", m4294v = 2)
final class ResetTutorialUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1865d f22794b;

    /* JADX INFO: renamed from: c */
    public int f22795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetTutorialUseCase$invoke$1(C1865d c1865d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22794b = c1865d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22793a = obj;
        this.f22795c |= Integer.MIN_VALUE;
        return this.f22794b.m8626a(this);
    }
}
