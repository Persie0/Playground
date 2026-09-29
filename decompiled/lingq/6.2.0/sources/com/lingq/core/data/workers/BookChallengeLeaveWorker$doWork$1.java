package com.lingq.core.data.workers;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.BookChallengeLeaveWorker", m4291f = "BookChallengeLeaveWorker.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class BookChallengeLeaveWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BookChallengeLeaveWorker f16602b;

    /* JADX INFO: renamed from: c */
    public int f16603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookChallengeLeaveWorker$doWork$1(BookChallengeLeaveWorker bookChallengeLeaveWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16602b = bookChallengeLeaveWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16601a = obj;
        this.f16603c |= Integer.MIN_VALUE;
        return this.f16602b.mo2213d(this);
    }
}
