package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.OfferRepositoryImpl", m4291f = "OfferRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 42, 43}, m4293m = "networkGetOffers", m4294v = 2)
final class OfferRepositoryImpl$networkGetOffers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f15864a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1301q f15866c;

    /* JADX INFO: renamed from: d */
    public int f15867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferRepositoryImpl$networkGetOffers$1(C1301q c1301q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15866c = c1301q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15865b = obj;
        this.f15867d |= Integer.MIN_VALUE;
        return this.f15866c.m7338a(this);
    }
}
