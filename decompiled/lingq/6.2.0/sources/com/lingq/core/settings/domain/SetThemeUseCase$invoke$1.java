package com.lingq.core.settings.domain;

import com.lingq.core.domain.model.theme.LqTheme;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetThemeUseCase", m4291f = "SetThemeUseCase.kt", m4292l = {16, 17, 21, 28}, m4293m = "invoke", m4294v = 2)
final class SetThemeUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LqTheme f22842a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1869h f22844c;

    /* JADX INFO: renamed from: d */
    public int f22845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetThemeUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22844c = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22843b = obj;
        this.f22845d |= Integer.MIN_VALUE;
        return this.f22844c.m8632a(null, this);
    }
}
