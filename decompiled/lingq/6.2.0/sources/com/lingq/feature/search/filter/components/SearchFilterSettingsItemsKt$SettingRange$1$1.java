package com.lingq.feature.search.filter.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.oq7;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.search.filter.components.SearchFilterSettingsItemsKt$SettingRange$1$1", m4291f = "SearchFilterSettingsItems.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchFilterSettingsItemsKt$SettingRange$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi3 f32920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oq7 f32921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f32922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilterSettingsItemsKt$SettingRange$1$1(zi3 zi3Var, oq7 oq7Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f32920a = zi3Var;
        this.f32921b = oq7Var;
        this.f32922c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchFilterSettingsItemsKt$SettingRange$1$1(this.f32920a, this.f32921b, this.f32922c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchFilterSettingsItemsKt$SettingRange$1$1 searchFilterSettingsItemsKt$SettingRange$1$1 = (SearchFilterSettingsItemsKt$SettingRange$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchFilterSettingsItemsKt$SettingRange$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f32922c;
        boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
        xfa xfaVar = xfa.f68157a;
        if (!zBooleanValue) {
            return xfaVar;
        }
        oq7 oq7Var = this.f32921b;
        this.f32920a.invoke(new Integer((int) oq7Var.f54738d.m19861h()), new Integer((int) oq7Var.f54739e.m19861h()));
        t66Var.setValue(Boolean.FALSE);
        return xfaVar;
    }
}
