package com.lingq.feature.onboarding.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ym5;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.domain.FetchUserDataUseCase", m4291f = "FetchUserDataUseCase.kt", m4292l = {21, 22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24, 26, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m4293m = "invoke", m4294v = 2)
final class FetchUserDataUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ym5 f27218a;

    /* JADX INFO: renamed from: b */
    public ym5 f27219b;

    /* JADX INFO: renamed from: c */
    public List f27220c;

    /* JADX INFO: renamed from: d */
    public List f27221d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f27222e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2207a f27223f;

    /* JADX INFO: renamed from: g */
    public int f27224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchUserDataUseCase$invoke$1(C2207a c2207a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27223f = c2207a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27222e = obj;
        this.f27224g |= Integer.MIN_VALUE;
        return this.f27223f.m9136a(this);
    }
}
