package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {280, 282}, m4293m = "updateFeedLevels", m4294v = 2)
final class LanguageRepositoryImpl$updateFeedLevels$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15233a;

    /* JADX INFO: renamed from: b */
    public List f15234b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15235c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15236d;

    /* JADX INFO: renamed from: e */
    public int f15237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateFeedLevels$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15236d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15235c = obj;
        this.f15237e |= Integer.MIN_VALUE;
        return this.f15236d.m7220q(null, null, this);
    }
}
