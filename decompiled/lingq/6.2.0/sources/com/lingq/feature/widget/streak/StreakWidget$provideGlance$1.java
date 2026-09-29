package com.lingq.feature.widget.streak;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ky1;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakWidget", m4291f = "StreakWidget.kt", m4292l = {50, 54}, m4293m = "provideGlance", m4294v = 2)
final class StreakWidget$provideGlance$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ky1 f33872a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2871b f33874c;

    /* JADX INFO: renamed from: d */
    public int f33875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWidget$provideGlance$1(C2871b c2871b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33874c = c2871b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33873b = obj;
        this.f33875d |= Integer.MIN_VALUE;
        return this.f33874c.mo2235d(null, this);
    }
}
