package com.lingq.core.settings.theme;

import com.lingq.core.domain.store.AudioUnderlineMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.lz9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsProvider$build$readingDisplaySettings$1", m4291f = "ThemeSettingsState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsProvider$build$readingDisplaySettings$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AudioUnderlineMode f23215a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23216b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23217c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f23218d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f23219e;

    public ThemeSettingsProvider$build$readingDisplaySettings$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        ThemeSettingsProvider$build$readingDisplaySettings$1 themeSettingsProvider$build$readingDisplaySettings$1 = new ThemeSettingsProvider$build$readingDisplaySettings$1((Continuation) obj6);
        themeSettingsProvider$build$readingDisplaySettings$1.f23215a = (AudioUnderlineMode) obj;
        themeSettingsProvider$build$readingDisplaySettings$1.f23216b = zBooleanValue;
        themeSettingsProvider$build$readingDisplaySettings$1.f23217c = zBooleanValue2;
        themeSettingsProvider$build$readingDisplaySettings$1.f23218d = (String) obj4;
        themeSettingsProvider$build$readingDisplaySettings$1.f23219e = (String) obj5;
        return themeSettingsProvider$build$readingDisplaySettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AudioUnderlineMode audioUnderlineMode = this.f23215a;
        boolean z = this.f23216b;
        boolean z2 = this.f23217c;
        String str = this.f23218d;
        String str2 = this.f23219e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new lz9(audioUnderlineMode, z, z2, str, str2);
    }
}
