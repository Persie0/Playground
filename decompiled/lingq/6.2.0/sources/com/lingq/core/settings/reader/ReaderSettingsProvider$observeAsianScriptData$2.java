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
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeAsianScriptData$2", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeAsianScriptData$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f23026a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f23027b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f23028c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f23029d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f23030e;

    public ReaderSettingsProvider$observeAsianScriptData$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderSettingsProvider$observeAsianScriptData$2 readerSettingsProvider$observeAsianScriptData$2 = new ReaderSettingsProvider$observeAsianScriptData$2((Continuation) obj6);
        readerSettingsProvider$observeAsianScriptData$2.f23026a = (String) obj;
        readerSettingsProvider$observeAsianScriptData$2.f23027b = (String) obj2;
        readerSettingsProvider$observeAsianScriptData$2.f23028c = (String) obj3;
        readerSettingsProvider$observeAsianScriptData$2.f23029d = (String) obj4;
        readerSettingsProvider$observeAsianScriptData$2.f23030e = (String) obj5;
        return readerSettingsProvider$observeAsianScriptData$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f23026a;
        String str2 = this.f23027b;
        String str3 = this.f23028c;
        String str4 = this.f23029d;
        String str5 = this.f23030e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new kn8(str, str2, str3, str4, str5);
    }
}
