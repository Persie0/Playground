package com.lingq.core.data.repository;

import com.lingq.core.domain.model.language.LanguageContextNotification;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {325, 336}, m4293m = "updateEmailNotification", m4294v = 2)
final class LanguageRepositoryImpl$updateEmailNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15227a;

    /* JADX INFO: renamed from: b */
    public LanguageContextNotification f15228b;

    /* JADX INFO: renamed from: c */
    public boolean f15229c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15230d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1293i f15231e;

    /* JADX INFO: renamed from: f */
    public int f15232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateEmailNotification$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15231e = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15230d = obj;
        this.f15232f |= Integer.MIN_VALUE;
        return this.f15231e.m7219p(null, false, this);
    }
}
