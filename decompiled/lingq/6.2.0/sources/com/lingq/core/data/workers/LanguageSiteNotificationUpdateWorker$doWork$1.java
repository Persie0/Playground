package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.LanguageSiteNotificationUpdateWorker", m4291f = "LanguageSiteNotificationUpdateWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class LanguageSiteNotificationUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageSiteNotificationUpdateWorker f16696b;

    /* JADX INFO: renamed from: c */
    public int f16697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSiteNotificationUpdateWorker$doWork$1(LanguageSiteNotificationUpdateWorker languageSiteNotificationUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16696b = languageSiteNotificationUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16695a = obj;
        this.f16697c |= Integer.MIN_VALUE;
        return this.f16696b.mo2213d(this);
    }
}
