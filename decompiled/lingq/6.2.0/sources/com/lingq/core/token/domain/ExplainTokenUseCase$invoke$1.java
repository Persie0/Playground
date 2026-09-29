package com.lingq.core.token.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.ExplainTokenUseCase", m4291f = "ExplainTokenUseCase.kt", m4292l = {24, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 56}, m4293m = "invoke", m4294v = 2)
final class ExplainTokenUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f23739H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C1904a f23740I;

    /* JADX INFO: renamed from: J */
    public int f23741J;

    /* JADX INFO: renamed from: a */
    public String f23742a;

    /* JADX INFO: renamed from: b */
    public Integer f23743b;

    /* JADX INFO: renamed from: c */
    public String f23744c;

    /* JADX INFO: renamed from: d */
    public String f23745d;

    /* JADX INFO: renamed from: e */
    public String f23746e;

    /* JADX INFO: renamed from: f */
    public int f23747f;

    /* JADX INFO: renamed from: g */
    public int f23748g;

    /* JADX INFO: renamed from: h */
    public int f23749h;

    /* JADX INFO: renamed from: i */
    public int f23750i;

    /* JADX INFO: renamed from: j */
    public int f23751j;

    /* JADX INFO: renamed from: k */
    public int f23752k;

    /* JADX INFO: renamed from: l */
    public boolean f23753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplainTokenUseCase$invoke$1(C1904a c1904a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23740I = c1904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23739H = obj;
        this.f23741J |= Integer.MIN_VALUE;
        return this.f23740I.m8711b(null, 0, null, null, null, 0, 0, false, this);
    }
}
