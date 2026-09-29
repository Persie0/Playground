package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bq1;
import p000.c32;
import p000.df4;
import p000.je5;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setReaderFont$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setReaderFont$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashMap f17618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1368a f17619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setReaderFont$2(C1368a c1368a, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f17618b = linkedHashMap;
        this.f17619c = c1368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setReaderFont$2 preferenceStoreImpl$setReaderFont$2 = new PreferenceStoreImpl$setReaderFont$2(this.f17619c, this.f17618b, continuation);
        preferenceStoreImpl$setReaderFont$2.f17617a = obj;
        return preferenceStoreImpl$setReaderFont$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setReaderFont$2 preferenceStoreImpl$setReaderFont$2 = (PreferenceStoreImpl$setReaderFont$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setReaderFont$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17617a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LinkedHashMap linkedHashMap = this.f17618b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), bq1.m4057h0((ReaderFont) entry.getValue())));
        }
        Map mapM15370W = AbstractC3194a.m15370W(arrayList);
        C1368a c1368a = this.f17619c;
        Preferences.Key key = c1368a.f18402e;
        df4 df4Var = c1368a.f18390a;
        sk9 sk9Var = sk9.f60959a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(sk9Var, sk9Var), mapM15370W));
        return xfa.f68157a;
    }
}
