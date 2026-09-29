package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.data.repository.NoticeRepositoryImpl", m4291f = "NoticeRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "hideNotices", m4294v = 2)
final class NoticeRepositoryImpl$hideNotices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f15843a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1299o f15845c;

    /* JADX INFO: renamed from: d */
    public int f15846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeRepositoryImpl$hideNotices$1(C1299o c1299o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15845c = c1299o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15844b = obj;
        this.f15846d |= Integer.MIN_VALUE;
        return this.f15845c.m7333b(null, null, this);
    }
}
