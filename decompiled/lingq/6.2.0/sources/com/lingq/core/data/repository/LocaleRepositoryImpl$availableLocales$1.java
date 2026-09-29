package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LocaleRepositoryImpl", m4291f = "LocaleRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38}, m4293m = "availableLocales", m4294v = 2)
final class LocaleRepositoryImpl$availableLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15822a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1297m f15823b;

    /* JADX INFO: renamed from: c */
    public int f15824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleRepositoryImpl$availableLocales$1(C1297m c1297m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15823b = c1297m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15822a = obj;
        this.f15824c |= Integer.MIN_VALUE;
        return this.f15823b.m7327a(this);
    }
}
