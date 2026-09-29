package com.google.firebase.sessions.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3438ow;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", m4291f = "SettingsCache.kt", m4292l = {73}, m4293m = "invokeSuspend")
final class SettingsCacheImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1171c f13886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$1(C1171c c1171c, Continuation continuation) {
        super(2, continuation);
        this.f13886b = c1171c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsCacheImpl$1(this.f13886b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsCacheImpl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13885a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1171c c1171c = this.f13886b;
            c83 data = c1171c.f13904b.getData();
            C3438ow c3438ow = new C3438ow(c1171c.f13905c, i2);
            this.f13885a = 1;
            if (data.collect(c3438ow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
