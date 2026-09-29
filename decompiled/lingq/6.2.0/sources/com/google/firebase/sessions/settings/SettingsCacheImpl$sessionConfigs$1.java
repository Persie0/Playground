package com.google.firebase.sessions.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", m4291f = "SettingsCache.kt", m4292l = {64}, m4293m = "invokeSuspend")
final class SettingsCacheImpl$sessionConfigs$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1171c f13888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$sessionConfigs$1(C1171c c1171c, Continuation continuation) {
        super(2, continuation);
        this.f13888b = c1171c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsCacheImpl$sessionConfigs$1(this.f13888b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsCacheImpl$sessionConfigs$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13887a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        c83 data = this.f13888b.f13904b.getData();
        this.f13887a = 1;
        Object objM15541t = AbstractC3224d.m15541t(data, this);
        return objM15541t == coroutineSingletons ? coroutineSingletons : objM15541t;
    }
}
