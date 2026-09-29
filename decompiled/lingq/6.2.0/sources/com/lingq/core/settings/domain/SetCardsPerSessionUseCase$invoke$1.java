package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetCardsPerSessionUseCase", m4291f = "SetCardsPerSessionUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class SetCardsPerSessionUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f22796a;

    /* JADX INFO: renamed from: b */
    public int f22797b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1866e f22799d;

    /* JADX INFO: renamed from: e */
    public int f22800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCardsPerSessionUseCase$invoke$1(C1866e c1866e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22799d = c1866e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22798c = obj;
        this.f22800e |= Integer.MIN_VALUE;
        return this.f22799d.m8627a(0, this);
    }
}
