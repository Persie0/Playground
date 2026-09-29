package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1661, 1675, 1676}, m4293m = "searchUserForSharedBy", m4294v = 2)
final class LessonRepositoryImpl$searchUserForSharedBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15481a;

    /* JADX INFO: renamed from: b */
    public String f15482b;

    /* JADX INFO: renamed from: c */
    public Results f15483c;

    /* JADX INFO: renamed from: d */
    public ArrayList f15484d;

    /* JADX INFO: renamed from: e */
    public int f15485e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15486f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1295k f15487g;

    /* JADX INFO: renamed from: h */
    public int f15488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$searchUserForSharedBy$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15487g = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15486f = obj;
        this.f15488h |= Integer.MIN_VALUE;
        return this.f15487g.m7260R(null, null, this);
    }
}
