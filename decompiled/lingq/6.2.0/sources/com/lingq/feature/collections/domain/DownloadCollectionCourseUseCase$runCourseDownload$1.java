package com.lingq.feature.collections.domain;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.u45;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.DownloadCollectionCourseUseCase", m4291f = "DownloadCollectionCourseUseCase.kt", m4292l = {61, 71, 73}, m4293m = "runCourseDownload", m4294v = 2)
final class DownloadCollectionCourseUseCase$runCourseDownload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25615a;

    /* JADX INFO: renamed from: b */
    public Iterator f25616b;

    /* JADX INFO: renamed from: c */
    public u45 f25617c;

    /* JADX INFO: renamed from: d */
    public int f25618d;

    /* JADX INFO: renamed from: e */
    public int f25619e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f25620f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2037c f25621g;

    /* JADX INFO: renamed from: h */
    public int f25622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadCollectionCourseUseCase$runCourseDownload$1(C2037c c2037c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25621g = c2037c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25620f = obj;
        this.f25622h |= Integer.MIN_VALUE;
        return C2037c.m8957a(this.f25621g, null, 0, this);
    }
}
