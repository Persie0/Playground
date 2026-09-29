package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ProfileUpdateWorker", m4291f = "ProfileUpdateWorker.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class ProfileUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ProfileUpdateWorker f16803b;

    /* JADX INFO: renamed from: c */
    public int f16804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUpdateWorker$doWork$1(ProfileUpdateWorker profileUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16803b = profileUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16802a = obj;
        this.f16804c |= Integer.MIN_VALUE;
        return this.f16803b.mo2213d(this);
    }
}
