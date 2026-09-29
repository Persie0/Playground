package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.ToggleActivityUseCase", m4291f = "ToggleActivityUseCase.kt", m4292l = {90, 91, 92}, m4293m = "canChangeStudySentence", m4294v = 2)
final class ToggleActivityUseCase$canChangeStudySentence$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Boolean[] f22880a;

    /* JADX INFO: renamed from: b */
    public Boolean[] f22881b;

    /* JADX INFO: renamed from: c */
    public int f22882c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22883d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1870i f22884e;

    /* JADX INFO: renamed from: f */
    public int f22885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleActivityUseCase$canChangeStudySentence$1(C1870i c1870i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22884e = c1870i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22883d = obj;
        this.f22885f |= Integer.MIN_VALUE;
        return this.f22884e.m8636b(this);
    }
}
