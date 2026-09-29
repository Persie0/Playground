package com.lingq.core.settings.reader;

import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3625tv;
import p000.c32;
import p000.dj3;
import p000.kn8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeAsianScriptData$3", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeAsianScriptData$3 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Profile f23031a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23032b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23033c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ kn8 f23034d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ kn8 f23035e;

    public ReaderSettingsProvider$observeAsianScriptData$3(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        ReaderSettingsProvider$observeAsianScriptData$3 readerSettingsProvider$observeAsianScriptData$3 = new ReaderSettingsProvider$observeAsianScriptData$3((Continuation) obj6);
        readerSettingsProvider$observeAsianScriptData$3.f23031a = (Profile) obj;
        readerSettingsProvider$observeAsianScriptData$3.f23032b = zBooleanValue;
        readerSettingsProvider$observeAsianScriptData$3.f23033c = zBooleanValue2;
        readerSettingsProvider$observeAsianScriptData$3.f23034d = (kn8) obj4;
        readerSettingsProvider$observeAsianScriptData$3.f23035e = (kn8) obj5;
        return readerSettingsProvider$observeAsianScriptData$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Profile profile = this.f23031a;
        boolean z = this.f23032b;
        boolean z2 = this.f23033c;
        kn8 kn8Var = this.f23034d;
        kn8 kn8Var2 = this.f23035e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (profile == null) {
            profile = null;
        }
        if (profile == null || (str = profile.f19666o) == null) {
            str = "";
        }
        return new C3625tv(str, z, z2, kn8Var.f47557a, kn8Var.f47558b, kn8Var.f47559c, kn8Var.f47560d, kn8Var.f47561e, kn8Var2.f47557a, kn8Var2.f47558b, kn8Var2.f47559c, kn8Var2.f47560d, kn8Var2.f47561e);
    }
}
