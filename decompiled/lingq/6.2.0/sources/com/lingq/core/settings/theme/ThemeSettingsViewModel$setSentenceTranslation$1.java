package com.lingq.core.settings.theme;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel", m4291f = "ThemeSettingsViewModel.kt", m4292l = {150, 152, 154}, m4293m = "setSentenceTranslation", m4294v = 2)
final class ThemeSettingsViewModel$setSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f23286a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1883c f23288c;

    /* JADX INFO: renamed from: d */
    public int f23289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$setSentenceTranslation$1(C1883c c1883c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23288c = c1883c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23287b = obj;
        this.f23289d |= Integer.MIN_VALUE;
        return C1883c.m8687Y2(this.f23288c, false, this);
    }
}
