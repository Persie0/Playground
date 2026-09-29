package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setDailyGoalMet$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setDailyGoalMet$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setDailyGoalMet$2(C1371d c1371d, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18217b = c1371d;
        this.f18218c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setDailyGoalMet$2 utilStoreImpl$setDailyGoalMet$2 = new UtilStoreImpl$setDailyGoalMet$2(this.f18217b, this.f18218c, continuation);
        utilStoreImpl$setDailyGoalMet$2.f18216a = obj;
        return utilStoreImpl$setDailyGoalMet$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setDailyGoalMet$2 utilStoreImpl$setDailyGoalMet$2 = (UtilStoreImpl$setDailyGoalMet$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setDailyGoalMet$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18216a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18217b;
        mutablePreferences.set(c1371d.f18574k, c1371d.f18564a.m10322b(new je5(sk9.f60959a, DailyGoalMet.Companion.serializer()), this.f18218c));
        return xfa.f68157a;
    }
}
