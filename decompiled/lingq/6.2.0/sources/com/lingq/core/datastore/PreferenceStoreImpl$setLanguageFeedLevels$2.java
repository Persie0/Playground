package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.LearningLevel;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.lf0;
import p000.sk9;
import p000.xfa;
import p000.zi3;
import p000.zs2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setLanguageFeedLevels$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setLanguageFeedLevels$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f17589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLanguageFeedLevels$2(C1368a c1368a, Map map, Continuation continuation) {
        super(2, continuation);
        this.f17588b = c1368a;
        this.f17589c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setLanguageFeedLevels$2 preferenceStoreImpl$setLanguageFeedLevels$2 = new PreferenceStoreImpl$setLanguageFeedLevels$2(this.f17588b, this.f17589c, continuation);
        preferenceStoreImpl$setLanguageFeedLevels$2.f17587a = obj;
        return preferenceStoreImpl$setLanguageFeedLevels$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setLanguageFeedLevels$2 preferenceStoreImpl$setLanguageFeedLevels$2 = (PreferenceStoreImpl$setLanguageFeedLevels$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setLanguageFeedLevels$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17587a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1368a c1368a = this.f17588b;
        mutablePreferences.set(c1368a.f18349J, c1368a.f18390a.m10322b(new je5(sk9.f60959a, new je5(new zs2("com.lingq.core.domain.model.LearningLevel", LearningLevel.values()), lf0.f49579a)), this.f17589c));
        return xfa.f68157a;
    }
}
