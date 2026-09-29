package com.lingq.core.data.repository;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1604, 1615, 1629}, m4293m = "fetchSentenceTranslation", m4294v = 2)
final class LessonRepositoryImpl$fetchSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15394a;

    /* JADX INFO: renamed from: b */
    public ArrayList f15395b;

    /* JADX INFO: renamed from: c */
    public int f15396c;

    /* JADX INFO: renamed from: d */
    public int f15397d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15398e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15399f;

    /* JADX INFO: renamed from: g */
    public int f15400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchSentenceTranslation$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15399f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15398e = obj;
        this.f15400g |= Integer.MIN_VALUE;
        return this.f15399f.m7306z(0, 0, null, null, this);
    }
}
