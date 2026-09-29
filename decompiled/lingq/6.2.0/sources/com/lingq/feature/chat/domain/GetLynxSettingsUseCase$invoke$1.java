package com.lingq.feature.chat.domain;

import com.lingq.core.domain.model.theme.LqTheme;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.vn5;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.GetLynxSettingsUseCase$invoke$1", m4291f = "GetLynxSettingsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLynxSettingsUseCase$invoke$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f25188a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f25189b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LqTheme f25190c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f25191d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f25192e;

    public GetLynxSettingsUseCase$invoke$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        GetLynxSettingsUseCase$invoke$1 getLynxSettingsUseCase$invoke$1 = new GetLynxSettingsUseCase$invoke$1((Continuation) obj6);
        getLynxSettingsUseCase$invoke$1.f25188a = zBooleanValue;
        getLynxSettingsUseCase$invoke$1.f25189b = zBooleanValue2;
        getLynxSettingsUseCase$invoke$1.f25190c = (LqTheme) obj3;
        getLynxSettingsUseCase$invoke$1.f25191d = zBooleanValue3;
        getLynxSettingsUseCase$invoke$1.f25192e = zBooleanValue4;
        return getLynxSettingsUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f25188a;
        boolean z2 = this.f25189b;
        LqTheme lqTheme = this.f25190c;
        boolean z3 = this.f25191d;
        boolean z4 = this.f25192e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new vn5(z, z2, lqTheme, z3, z4);
    }
}
