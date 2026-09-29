package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.ToggleActivityUseCase", m4291f = "ToggleActivityUseCase.kt", m4292l = {73, 74, 75, 76, 77, 81, 82}, m4293m = "canChangeActivities", m4294v = 2)
final class ToggleActivityUseCase$canChangeActivities$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22873a;

    /* JADX INFO: renamed from: b */
    public Boolean[] f22874b;

    /* JADX INFO: renamed from: c */
    public Boolean[] f22875c;

    /* JADX INFO: renamed from: d */
    public int f22876d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22877e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1870i f22878f;

    /* JADX INFO: renamed from: g */
    public int f22879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleActivityUseCase$canChangeActivities$1(C1870i c1870i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22878f = c1870i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22877e = obj;
        this.f22879g |= Integer.MIN_VALUE;
        return this.f22878f.m8635a(false, this);
    }
}
