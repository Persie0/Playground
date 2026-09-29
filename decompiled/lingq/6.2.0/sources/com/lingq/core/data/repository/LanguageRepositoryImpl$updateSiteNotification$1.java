package com.lingq.core.data.repository;

import com.lingq.core.domain.model.language.LanguageContextNotification;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {359, 370}, m4293m = "updateSiteNotification", m4294v = 2)
final class LanguageRepositoryImpl$updateSiteNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15248a;

    /* JADX INFO: renamed from: b */
    public LanguageContextNotification f15249b;

    /* JADX INFO: renamed from: c */
    public boolean f15250c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15251d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1293i f15252e;

    /* JADX INFO: renamed from: f */
    public int f15253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateSiteNotification$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15252e = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15251d = obj;
        this.f15253f |= Integer.MIN_VALUE;
        return this.f15252e.m7223t(null, false, this);
    }
}
