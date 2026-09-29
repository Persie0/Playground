package com.lingq.core.settings.theme;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel", m4291f = "ThemeSettingsViewModel.kt", m4292l = {99, 104}, m4293m = "setLineHeight", m4294v = 2)
final class ThemeSettingsViewModel$setLineHeight$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public double f23278a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1883c f23280c;

    /* JADX INFO: renamed from: d */
    public int f23281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$setLineHeight$1(C1883c c1883c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23280c = c1883c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23279b = obj;
        this.f23281d |= Integer.MIN_VALUE;
        return C1883c.m8685W2(this.f23280c, 0.0d, this);
    }
}
