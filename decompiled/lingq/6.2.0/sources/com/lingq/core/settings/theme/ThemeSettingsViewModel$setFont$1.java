package com.lingq.core.settings.theme;

import com.lingq.core.domain.model.theme.ReaderFont;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel", m4291f = "ThemeSettingsViewModel.kt", m4292l = {109, 113, 115}, m4293m = "setFont", m4294v = 2)
final class ThemeSettingsViewModel$setFont$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ReaderFont f23273a;

    /* JADX INFO: renamed from: b */
    public boolean f23274b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23275c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1883c f23276d;

    /* JADX INFO: renamed from: e */
    public int f23277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$setFont$1(C1883c c1883c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23276d = c1883c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23275c = obj;
        this.f23277e |= Integer.MIN_VALUE;
        return C1883c.m8684V2(this.f23276d, null, false, this);
    }
}
