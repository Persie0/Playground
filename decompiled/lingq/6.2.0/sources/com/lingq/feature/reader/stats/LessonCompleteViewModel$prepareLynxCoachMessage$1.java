package com.lingq.feature.reader.stats;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel", m4291f = "LessonCompleteViewModel.kt", m4292l = {593, 596}, m4293m = "prepareLynxCoachMessage", m4294v = 2)
final class LessonCompleteViewModel$prepareLynxCoachMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f30620a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30622c;

    /* JADX INFO: renamed from: d */
    public int f30623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$prepareLynxCoachMessage$1(C2535j c2535j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30622c = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30621b = obj;
        this.f30623d |= Integer.MIN_VALUE;
        return this.f30622c.m9464Z2(this);
    }
}
