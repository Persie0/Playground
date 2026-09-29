package com.lingq.core.settings.theme;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.yz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel", m4291f = "ThemeSettingsViewModel.kt", m4292l = {120, 121, 124}, m4293m = "setReaderTheme", m4294v = 2)
final class ThemeSettingsViewModel$setReaderTheme$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public yz7 f23282a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1883c f23284c;

    /* JADX INFO: renamed from: d */
    public int f23285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$setReaderTheme$1(C1883c c1883c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23284c = c1883c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23283b = obj;
        this.f23285d |= Integer.MIN_VALUE;
        return C1883c.m8686X2(this.f23284c, null, this);
    }
}
