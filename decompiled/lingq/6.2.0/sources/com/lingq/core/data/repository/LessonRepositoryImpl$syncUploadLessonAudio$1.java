package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLessonUpload;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2241, 2242, 2243}, m4293m = "syncUploadLessonAudio", m4294v = 2)
final class LessonRepositoryImpl$syncUploadLessonAudio$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15569a;

    /* JADX INFO: renamed from: b */
    public ResultLessonUpload f15570b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15571c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15572d;

    /* JADX INFO: renamed from: e */
    public int f15573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncUploadLessonAudio$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15572d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15571c = obj;
        this.f15573e |= Integer.MIN_VALUE;
        return this.f15572d.m7269a0(0, null, null, this);
    }
}
