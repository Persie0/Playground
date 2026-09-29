package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1164, 1167, 1174, 1177}, m4293m = "updateIsTaken", m4294v = 2)
final class LessonRepositoryImpl$updateIsTaken$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15574a;

    /* JADX INFO: renamed from: b */
    public boolean f15575b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15576c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15577d;

    /* JADX INFO: renamed from: e */
    public int f15578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateIsTaken$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15577d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15576c = obj;
        this.f15578e |= Integer.MIN_VALUE;
        return this.f15577d.m7270b0(0, false, this);
    }
}
