package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1072, 1086}, m4293m = "syncLessonAudioProgress", m4294v = 2)
final class LessonRepositoryImpl$syncLessonAudioProgress$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15528a;

    /* JADX INFO: renamed from: b */
    public Integer f15529b;

    /* JADX INFO: renamed from: c */
    public String f15530c;

    /* JADX INFO: renamed from: d */
    public int f15531d;

    /* JADX INFO: renamed from: e */
    public int f15532e;

    /* JADX INFO: renamed from: f */
    public int f15533f;

    /* JADX INFO: renamed from: g */
    public double f15534g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f15535h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15536i;

    /* JADX INFO: renamed from: j */
    public int f15537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncLessonAudioProgress$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15536i = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15535h = obj;
        this.f15537j |= Integer.MIN_VALUE;
        return this.f15536i.m7263U(null, 0, 0.0d, null, this);
    }
}
