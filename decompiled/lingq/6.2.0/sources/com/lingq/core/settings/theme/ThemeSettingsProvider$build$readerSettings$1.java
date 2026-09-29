package com.lingq.core.settings.theme;

import com.lingq.core.domain.model.theme.TextHighlightStyle;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.jz9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsProvider$build$readerSettings$1", m4291f = "ThemeSettingsState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsProvider$build$readerSettings$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f23205a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f23206b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ double f23207c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ TextHighlightStyle f23208d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f23209e;

    public ThemeSettingsProvider$build$readerSettings$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj2).intValue();
        double dDoubleValue = ((Number) obj3).doubleValue();
        ThemeSettingsProvider$build$readerSettings$1 themeSettingsProvider$build$readerSettings$1 = new ThemeSettingsProvider$build$readerSettings$1((Continuation) obj6);
        themeSettingsProvider$build$readerSettings$1.f23205a = (Map) obj;
        themeSettingsProvider$build$readerSettings$1.f23206b = iIntValue;
        themeSettingsProvider$build$readerSettings$1.f23207c = dDoubleValue;
        themeSettingsProvider$build$readerSettings$1.f23208d = (TextHighlightStyle) obj4;
        themeSettingsProvider$build$readerSettings$1.f23209e = (String) obj5;
        return themeSettingsProvider$build$readerSettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f23205a;
        int i = this.f23206b;
        double d = this.f23207c;
        TextHighlightStyle textHighlightStyle = this.f23208d;
        String str = this.f23209e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new jz9(map, i, d, textHighlightStyle, str);
    }
}
