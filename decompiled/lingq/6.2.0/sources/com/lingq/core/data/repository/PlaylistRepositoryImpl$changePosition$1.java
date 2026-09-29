package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bd7;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {712, 714, 716}, m4293m = "changePosition", m4294v = 2)
final class PlaylistRepositoryImpl$changePosition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15900a;

    /* JADX INFO: renamed from: b */
    public String f15901b;

    /* JADX INFO: renamed from: c */
    public bd7 f15902c;

    /* JADX INFO: renamed from: d */
    public int f15903d;

    /* JADX INFO: renamed from: e */
    public int f15904e;

    /* JADX INFO: renamed from: f */
    public int f15905f;

    /* JADX INFO: renamed from: g */
    public int f15906g;

    /* JADX INFO: renamed from: h */
    public int f15907h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f15908i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1302r f15909j;

    /* JADX INFO: renamed from: k */
    public int f15910k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$changePosition$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15909j = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15908i = obj;
        this.f15910k |= Integer.MIN_VALUE;
        return this.f15909j.m7346f(0, 0, 0, 0, null, null, this);
    }
}
