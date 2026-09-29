package com.lingq.feature.widget.streak;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakWidget", m4291f = "StreakWidget.kt", m4292l = {94}, m4293m = "widgetContent", m4294v = 2)
final class StreakWidget$widgetContent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2871b f33882b;

    /* JADX INFO: renamed from: c */
    public int f33883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWidget$widgetContent$1(C2871b c2871b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33882b = c2871b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33881a = obj;
        this.f33883c |= Integer.MIN_VALUE;
        return this.f33882b.m9793j(null, null, null, this);
    }
}
