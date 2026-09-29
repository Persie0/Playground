package com.lingq.p020ui;

import com.lingq.core.domain.model.language.LanguageToLearn;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$updateUserLanguage$1", m4291f = "HomeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$updateUserLanguage$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f33992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f33993b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HomeViewModel$updateUserLanguage$1 homeViewModel$updateUserLanguage$1 = new HomeViewModel$updateUserLanguage$1(3, (Continuation) obj3);
        homeViewModel$updateUserLanguage$1.f33992a = (List) obj;
        homeViewModel$updateUserLanguage$1.f33993b = (String) obj2;
        return homeViewModel$updateUserLanguage$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f33992a;
        String str = this.f33993b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = null;
        if (vk9.m23391n0(str) || list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (fa4.m11650l(((LanguageToLearn) obj3).f19113a, str)) {
                obj2 = obj3;
                break;
            }
        }
        return (LanguageToLearn) obj2;
    }
}
