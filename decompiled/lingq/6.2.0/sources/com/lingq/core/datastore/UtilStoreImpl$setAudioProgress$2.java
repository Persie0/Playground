package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.df4;
import p000.je5;
import p000.l84;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setAudioProgress$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setAudioProgress$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setAudioProgress$2(C1371d c1371d, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18214b = c1371d;
        this.f18215c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setAudioProgress$2 utilStoreImpl$setAudioProgress$2 = new UtilStoreImpl$setAudioProgress$2(this.f18214b, this.f18215c, continuation);
        utilStoreImpl$setAudioProgress$2.f18213a = obj;
        return utilStoreImpl$setAudioProgress$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setAudioProgress$2 utilStoreImpl$setAudioProgress$2 = (UtilStoreImpl$setAudioProgress$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setAudioProgress$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18213a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18214b;
        Preferences.Key key = c1371d.f18568e;
        df4 df4Var = c1371d.f18564a;
        l84 l84Var = l84.f49294a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(l84Var, l84Var), this.f18215c));
        return xfa.f68157a;
    }
}
