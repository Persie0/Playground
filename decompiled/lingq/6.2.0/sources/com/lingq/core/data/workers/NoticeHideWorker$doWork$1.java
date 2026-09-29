package com.lingq.core.data.workers;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.NoticeHideWorker", m4291f = "NoticeHideWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class NoticeHideWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Iterator f16768a;

    /* JADX INFO: renamed from: b */
    public int f16769b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16770c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ NoticeHideWorker f16771d;

    /* JADX INFO: renamed from: e */
    public int f16772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeHideWorker$doWork$1(NoticeHideWorker noticeHideWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16771d = noticeHideWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16770c = obj;
        this.f16772e |= Integer.MIN_VALUE;
        return this.f16771d.mo2213d(this);
    }
}
