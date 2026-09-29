package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {993, DescriptorProtos.Edition.EDITION_2023_VALUE}, m4293m = "updateLessonPreview", m4294v = 2)
final class LessonRepositoryImpl$updateLessonPreview$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15610a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15612c;

    /* JADX INFO: renamed from: d */
    public int f15613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonPreview$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15612c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15611b = obj;
        this.f15613d |= Integer.MIN_VALUE;
        return this.f15612c.m7279h0(0, null, this);
    }
}
