package com.lingq.core.token.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetPopularLocalePreferenceUseCase", m4291f = "GetAndUpdatePopularLocalePreferenceUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 33}, m4293m = "updatePreference", m4294v = 2)
final class GetPopularLocalePreferenceUseCase$updatePreference$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23807a;

    /* JADX INFO: renamed from: b */
    public String f23808b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1906c f23810d;

    /* JADX INFO: renamed from: e */
    public int f23811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPopularLocalePreferenceUseCase$updatePreference$1(C1906c c1906c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23810d = c1906c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23809c = obj;
        this.f23811e |= Integer.MIN_VALUE;
        return this.f23810d.m8725e(null, null, this);
    }
}
