package com.lingq.feature.reader.stats;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zx4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel", m4291f = "LessonCompleteViewModel.kt", m4292l = {511, 512, 519, 538, 567}, m4293m = "loadLynxCoach", m4294v = 2)
final class LessonCompleteViewModel$loadLynxCoach$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f30591a;

    /* JADX INFO: renamed from: b */
    public zx4 f30592b;

    /* JADX INFO: renamed from: c */
    public int f30593c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f30594d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2535j f30595e;

    /* JADX INFO: renamed from: f */
    public int f30596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$loadLynxCoach$1(C2535j c2535j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30595e = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30594d = obj;
        this.f30596f |= Integer.MIN_VALUE;
        return C2535j.m9461W2(this.f30595e, false, this);
    }
}
