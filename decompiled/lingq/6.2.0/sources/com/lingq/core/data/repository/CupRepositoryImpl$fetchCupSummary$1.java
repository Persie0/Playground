package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38}, m4293m = "fetchCupSummary", m4294v = 2)
final class CupRepositoryImpl$fetchCupSummary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1291g f15083b;

    /* JADX INFO: renamed from: c */
    public int f15084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$fetchCupSummary$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15083b = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15082a = obj;
        this.f15084c |= Integer.MIN_VALUE;
        return this.f15083b.m7190c(this);
    }
}
