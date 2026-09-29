package com.lingq.feature.reader.milestones.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.domain.UpdateStreakChallengeUseCase", m4291f = "UpdateStreakChallengeUseCase.kt", m4292l = {26, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class UpdateStreakChallengeUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f28188a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2271c f28190c;

    /* JADX INFO: renamed from: d */
    public int f28191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateStreakChallengeUseCase$invoke$1(C2271c c2271c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28190c = c2271c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28189b = obj;
        this.f28191d |= Integer.MIN_VALUE;
        return this.f28190c.m9282a(0, this);
    }
}
