package com.lingq.core.settings.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.kn8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeAsianScriptData$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeAsianScriptData$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f23021a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f23022b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f23023c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f23024d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f23025e;

    public ReaderSettingsProvider$observeAsianScriptData$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderSettingsProvider$observeAsianScriptData$1 readerSettingsProvider$observeAsianScriptData$1 = new ReaderSettingsProvider$observeAsianScriptData$1((Continuation) obj6);
        readerSettingsProvider$observeAsianScriptData$1.f23021a = (String) obj;
        readerSettingsProvider$observeAsianScriptData$1.f23022b = (String) obj2;
        readerSettingsProvider$observeAsianScriptData$1.f23023c = (String) obj3;
        readerSettingsProvider$observeAsianScriptData$1.f23024d = (String) obj4;
        readerSettingsProvider$observeAsianScriptData$1.f23025e = (String) obj5;
        return readerSettingsProvider$observeAsianScriptData$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f23021a;
        String str2 = this.f23022b;
        String str3 = this.f23023c;
        String str4 = this.f23024d;
        String str5 = this.f23025e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new kn8(str, str2, str3, str4, str5);
    }
}
