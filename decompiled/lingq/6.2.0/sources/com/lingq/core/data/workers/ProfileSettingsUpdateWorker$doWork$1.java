package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ProfileSettingsUpdateWorker", m4291f = "ProfileSettingsUpdateWorker.kt", m4292l = {32, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class ProfileSettingsUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ProfileSettingsUpdateWorker f16797b;

    /* JADX INFO: renamed from: c */
    public int f16798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsUpdateWorker$doWork$1(ProfileSettingsUpdateWorker profileSettingsUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16797b = profileSettingsUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16796a = obj;
        this.f16798c |= Integer.MIN_VALUE;
        return this.f16797b.mo2213d(this);
    }
}
