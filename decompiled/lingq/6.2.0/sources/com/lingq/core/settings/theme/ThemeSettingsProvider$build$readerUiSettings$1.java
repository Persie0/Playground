package com.lingq.core.settings.theme;

import com.lingq.core.domain.model.reader.ReaderPageMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.kz9;
import p000.vj2;
import p000.vs3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsProvider$build$readerUiSettings$1", m4291f = "ThemeSettingsState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsProvider$build$readerUiSettings$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vs3 f23210a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ vj2 f23211b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23212c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23213d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ ReaderPageMode f23214e;

    public ThemeSettingsProvider$build$readerUiSettings$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        ThemeSettingsProvider$build$readerUiSettings$1 themeSettingsProvider$build$readerUiSettings$1 = new ThemeSettingsProvider$build$readerUiSettings$1((Continuation) obj6);
        themeSettingsProvider$build$readerUiSettings$1.f23210a = (vs3) obj;
        themeSettingsProvider$build$readerUiSettings$1.f23211b = (vj2) obj2;
        themeSettingsProvider$build$readerUiSettings$1.f23212c = zBooleanValue;
        themeSettingsProvider$build$readerUiSettings$1.f23213d = zBooleanValue2;
        themeSettingsProvider$build$readerUiSettings$1.f23214e = (ReaderPageMode) obj5;
        return themeSettingsProvider$build$readerUiSettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        vs3 vs3Var = this.f23210a;
        vj2 vj2Var = this.f23211b;
        boolean z = this.f23212c;
        boolean z2 = this.f23213d;
        ReaderPageMode readerPageMode = this.f23214e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new kz9(vs3Var, vj2Var, z, z2, readerPageMode);
    }
}
