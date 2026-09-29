package com.lingq.core.domain.playlist;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.CanDownloadOnCurrentNetworkUseCase", m4291f = "CanDownloadOnCurrentNetworkUseCase.kt", m4292l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class CanDownloadOnCurrentNetworkUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1519b f19890b;

    /* JADX INFO: renamed from: c */
    public int f19891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanDownloadOnCurrentNetworkUseCase$invoke$1(C1519b c1519b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19890b = c1519b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19889a = obj;
        this.f19891c |= Integer.MIN_VALUE;
        return this.f19890b.m8195a(this);
    }
}
