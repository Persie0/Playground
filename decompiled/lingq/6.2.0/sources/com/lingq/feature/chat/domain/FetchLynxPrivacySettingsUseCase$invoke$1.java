package com.lingq.feature.chat.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.rn5;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.FetchLynxPrivacySettingsUseCase", m4291f = "LynxPrivacyUseCases.kt", m4292l = {24, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m4293m = "invoke", m4294v = 2)
final class FetchLynxPrivacySettingsUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public rn5 f25163a;

    /* JADX INFO: renamed from: b */
    public Boolean f25164b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25165c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1997b f25166d;

    /* JADX INFO: renamed from: e */
    public int f25167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLynxPrivacySettingsUseCase$invoke$1(C1997b c1997b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25166d = c1997b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25165c = obj;
        this.f25167e |= Integer.MIN_VALUE;
        return this.f25166d.m8860a(null, this);
    }
}
