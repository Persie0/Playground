package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1797, 1798, 1801}, m4293m = "updateSaveRemove", m4294v = 2)
final class LessonRepositoryImpl$updateSaveRemove$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15683a;

    /* JADX INFO: renamed from: b */
    public int f15684b;

    /* JADX INFO: renamed from: c */
    public boolean f15685c;

    /* JADX INFO: renamed from: d */
    public String f15686d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15687e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15688f;

    /* JADX INFO: renamed from: g */
    public int f15689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateSaveRemove$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15688f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15687e = obj;
        this.f15689g |= Integer.MIN_VALUE;
        return this.f15688f.m7297q0(0, 0, false, null, this);
    }
}
