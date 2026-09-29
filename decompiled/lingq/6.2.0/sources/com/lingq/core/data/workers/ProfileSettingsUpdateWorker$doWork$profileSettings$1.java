package com.lingq.core.data.workers;

import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.df4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ProfileSettingsUpdateWorker$doWork$profileSettings$1", m4291f = "ProfileSettingsUpdateWorker.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ProfileSettingsUpdateWorker$doWork$profileSettings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileSettingsUpdateWorker f16799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsUpdateWorker$doWork$profileSettings$1(ProfileSettingsUpdateWorker profileSettingsUpdateWorker, String str, Continuation continuation) {
        super(2, continuation);
        this.f16799a = profileSettingsUpdateWorker;
        this.f16800b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileSettingsUpdateWorker$doWork$profileSettings$1(this.f16799a, this.f16800b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileSettingsUpdateWorker$doWork$profileSettings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        df4 df4Var = this.f16799a.f16795i;
        df4Var.getClass();
        return df4Var.m10321a(this.f16800b, ProfileSettings.Companion.serializer());
    }
}
