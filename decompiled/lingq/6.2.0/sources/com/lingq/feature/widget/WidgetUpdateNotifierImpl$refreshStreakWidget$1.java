package com.lingq.feature.widget;

import android.content.Context;
import com.lingq.feature.widget.streak.C2870a;
import com.lingq.feature.widget.streak.StreakDataUpdateWorker;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.widget.WidgetUpdateNotifierImpl$refreshStreakWidget$1", m4291f = "WidgetUpdateNotifierImpl.kt", m4292l = {20, 21}, m4293m = "invokeSuspend", m4294v = 2)
final class WidgetUpdateNotifierImpl$refreshStreakWidget$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2864b f33832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetUpdateNotifierImpl$refreshStreakWidget$1(C2864b c2864b, Continuation continuation) {
        super(2, continuation);
        this.f33832b = c2864b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WidgetUpdateNotifierImpl$refreshStreakWidget$1(this.f33832b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetUpdateNotifierImpl$refreshStreakWidget$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33831a;
        xfa xfaVar = xfa.f68157a;
        C2864b c2864b = this.f33832b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f33831a = 1;
            obj = C2864b.m9777a(c2864b, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((Boolean) obj).booleanValue()) {
            C2870a c2870a = StreakDataUpdateWorker.Companion;
            Context context = c2864b.f33834a;
            this.f33831a = 2;
            if (c2870a.m9790e(context, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
