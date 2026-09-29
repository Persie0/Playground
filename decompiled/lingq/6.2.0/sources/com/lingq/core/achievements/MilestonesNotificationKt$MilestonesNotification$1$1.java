package com.lingq.core.achievements;

import android.graphics.Bitmap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.MilestonesNotificationKt$MilestonesNotification$1$1", m4291f = "MilestonesNotification.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MilestonesNotificationKt$MilestonesNotification$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vi3 f14174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f14175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f14176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesNotificationKt$MilestonesNotification$1$1(vi3 vi3Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f14174a = vi3Var;
        this.f14175b = t66Var;
        this.f14176c = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MilestonesNotificationKt$MilestonesNotification$1$1(this.f14174a, this.f14175b, this.f14176c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MilestonesNotificationKt$MilestonesNotification$1$1 milestonesNotificationKt$MilestonesNotification$1$1 = (MilestonesNotificationKt$MilestonesNotification$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        milestonesNotificationKt$MilestonesNotification$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f14175b;
        if (((Bitmap) t66Var.getValue()) != null) {
            this.f14174a.invoke((Bitmap) t66Var.getValue());
            this.f14176c.setValue(Boolean.FALSE);
        }
        return xfa.f68157a;
    }
}
