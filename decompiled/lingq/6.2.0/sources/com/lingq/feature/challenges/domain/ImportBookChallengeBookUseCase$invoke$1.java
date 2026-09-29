package com.lingq.feature.challenges.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.domain.ImportBookChallengeBookUseCase", m4291f = "ImportBookChallengeBookUseCase.kt", m4292l = {28, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 53, 56}, m4293m = "invoke", m4294v = 2)
final class ImportBookChallengeBookUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f24736H;

    /* JADX INFO: renamed from: a */
    public String f24737a;

    /* JADX INFO: renamed from: b */
    public String f24738b;

    /* JADX INFO: renamed from: c */
    public String f24739c;

    /* JADX INFO: renamed from: d */
    public byte[] f24740d;

    /* JADX INFO: renamed from: e */
    public Integer f24741e;

    /* JADX INFO: renamed from: f */
    public ProfileAccount f24742f;

    /* JADX INFO: renamed from: g */
    public Lesson f24743g;

    /* JADX INFO: renamed from: h */
    public boolean f24744h;

    /* JADX INFO: renamed from: i */
    public boolean f24745i;

    /* JADX INFO: renamed from: j */
    public boolean f24746j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f24747k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1983b f24748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportBookChallengeBookUseCase$invoke$1(C1983b c1983b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24748l = c1983b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24747k = obj;
        this.f24736H |= Integer.MIN_VALUE;
        return this.f24748l.m8847a(null, null, null, null, false, null, false, false, this);
    }
}
