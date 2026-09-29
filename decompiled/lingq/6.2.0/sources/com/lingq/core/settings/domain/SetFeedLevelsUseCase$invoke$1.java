package com.lingq.core.settings.domain;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetFeedLevelsUseCase", m4291f = "SetFeedLevelsUseCase.kt", m4292l = {21, 42, 43}, m4293m = "invoke", m4294v = 2)
final class SetFeedLevelsUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22801a;

    /* JADX INFO: renamed from: b */
    public Map f22802b;

    /* JADX INFO: renamed from: c */
    public int f22803c;

    /* JADX INFO: renamed from: d */
    public int f22804d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22805e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1863b f22806f;

    /* JADX INFO: renamed from: g */
    public int f22807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetFeedLevelsUseCase$invoke$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22806f = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22805e = obj;
        this.f22807g |= Integer.MIN_VALUE;
        return this.f22806f.m8621d(0, 0, null, this);
    }
}
