package com.lingq.core.settings.reader;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.rz7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeTtsPreferences$basePrefs$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeTtsPreferences$basePrefs$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23056a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23057b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23058c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f23059d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Map f23060e;

    public ReaderSettingsProvider$observeTtsPreferences$basePrefs$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ReaderSettingsProvider$observeTtsPreferences$basePrefs$1 readerSettingsProvider$observeTtsPreferences$basePrefs$1 = new ReaderSettingsProvider$observeTtsPreferences$basePrefs$1((Continuation) obj6);
        readerSettingsProvider$observeTtsPreferences$basePrefs$1.f23056a = zBooleanValue;
        readerSettingsProvider$observeTtsPreferences$basePrefs$1.f23057b = zBooleanValue2;
        readerSettingsProvider$observeTtsPreferences$basePrefs$1.f23058c = zBooleanValue3;
        readerSettingsProvider$observeTtsPreferences$basePrefs$1.f23059d = (Map) obj4;
        readerSettingsProvider$observeTtsPreferences$basePrefs$1.f23060e = (Map) obj5;
        return readerSettingsProvider$observeTtsPreferences$basePrefs$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23056a;
        boolean z2 = this.f23057b;
        boolean z3 = this.f23058c;
        Map map = this.f23059d;
        Map map2 = this.f23060e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new rz7(z, z2, z3, map, map2);
    }
}
