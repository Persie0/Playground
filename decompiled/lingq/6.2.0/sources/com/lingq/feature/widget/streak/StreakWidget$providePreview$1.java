package com.lingq.feature.widget.streak;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ky1;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakWidget", m4291f = "StreakWidget.kt", m4292l = {66, 70}, m4293m = "providePreview", m4294v = 2)
final class StreakWidget$providePreview$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ky1 f33876a;

    /* JADX INFO: renamed from: b */
    public int f33877b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33878c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2871b f33879d;

    /* JADX INFO: renamed from: e */
    public int f33880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWidget$providePreview$1(C2871b c2871b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33879d = c2871b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33878c = obj;
        this.f33880e |= Integer.MIN_VALUE;
        return this.f33879d.mo2236e(null, 0, this);
    }
}
