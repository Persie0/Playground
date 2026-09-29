package com.lingq.core.settings.domain;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SyncFeedLevelsFromLanguageUseCase", m4291f = "SyncFeedLevelsFromLanguageUseCase.kt", m4292l = {12, 18}, m4293m = "invoke", m4294v = 2)
final class SyncFeedLevelsFromLanguageUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22863a;

    /* JADX INFO: renamed from: b */
    public List f22864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1867f f22866d;

    /* JADX INFO: renamed from: e */
    public int f22867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncFeedLevelsFromLanguageUseCase$invoke$1(C1867f c1867f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22866d = c1867f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22865c = obj;
        this.f22867e |= Integer.MIN_VALUE;
        return this.f22866d.m8630c(null, null, this);
    }
}
