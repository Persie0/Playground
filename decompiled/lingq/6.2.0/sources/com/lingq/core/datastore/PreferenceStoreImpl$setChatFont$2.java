package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.domain.model.theme.ReaderFont;
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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setChatFont$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setChatFont$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderFont f17544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setChatFont$2(C1368a c1368a, String str, ReaderFont readerFont, Continuation continuation) {
        super(2, continuation);
        this.f17542b = c1368a;
        this.f17543c = str;
        this.f17544d = readerFont;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setChatFont$2 preferenceStoreImpl$setChatFont$2 = new PreferenceStoreImpl$setChatFont$2(this.f17542b, this.f17543c, this.f17544d, continuation);
        preferenceStoreImpl$setChatFont$2.f17541a = obj;
        return preferenceStoreImpl$setChatFont$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setChatFont$2 preferenceStoreImpl$setChatFont$2 = (PreferenceStoreImpl$setChatFont$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setChatFont$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17541a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1368a c1368a = this.f17542b;
        df4 df4Var = c1368a.f18390a;
        Preferences.Key key = c1368a.f18417j;
        String str = (String) mutablePreferences.get(key);
        if (str == null) {
            str = "{}";
        }
        sk9 sk9Var = sk9.f60959a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(sk9Var, sk9Var), AbstractC3194a.m15368U((Map) df4Var.m10321a(str, new je5(sk9Var, sk9Var)), new Pair(this.f17543c, bq1.m4057h0(this.f17544d)))));
        return xfa.f68157a;
    }
}
