package com.lingq.feature.widget.streak;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakWidget", m4291f = "StreakWidget.kt", m4292l = {81}, m4293m = "createLocalizedContext", m4294v = 2)
final class StreakWidget$createLocalizedContext$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f33868a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2871b f33870c;

    /* JADX INFO: renamed from: d */
    public int f33871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWidget$createLocalizedContext$1(C2871b c2871b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33870c = c2871b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33869b = obj;
        this.f33871d |= Integer.MIN_VALUE;
        return this.f33870c.m9792i(null, null, this);
    }
}
