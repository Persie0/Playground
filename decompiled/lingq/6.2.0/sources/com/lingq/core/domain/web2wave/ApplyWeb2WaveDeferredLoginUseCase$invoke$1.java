package com.lingq.core.domain.web2wave;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.xm5;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.web2wave.ApplyWeb2WaveDeferredLoginUseCase", m4291f = "ApplyWeb2WaveDeferredLoginUseCase.kt", m4292l = {21, 22, 25, 32, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 46, 50, 61, 65, 74, 79}, m4293m = "invoke", m4294v = 2)
final class ApplyWeb2WaveDeferredLoginUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Web2WaveDeferredLoginStatus f20160a;

    /* JADX INFO: renamed from: b */
    public String f20161b;

    /* JADX INFO: renamed from: c */
    public String f20162c;

    /* JADX INFO: renamed from: d */
    public xm5 f20163d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20164e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1544a f20165f;

    /* JADX INFO: renamed from: g */
    public int f20166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyWeb2WaveDeferredLoginUseCase$invoke$1(C1544a c1544a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20165f = c1544a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20164e = obj;
        this.f20166g |= Integer.MIN_VALUE;
        return this.f20165f.m8228a(this);
    }
}
