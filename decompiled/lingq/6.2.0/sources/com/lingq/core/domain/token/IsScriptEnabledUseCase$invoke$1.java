package com.lingq.core.domain.token;

import com.lingq.core.domain.model.LanguageLearn;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.c32;
import p000.dj3;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.IsScriptEnabledUseCase$invoke$1", m4291f = "IsScriptEnabledUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class IsScriptEnabledUseCase$invoke$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f20086a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f20087b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f20088c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f20089d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f20090e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f20091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsScriptEnabledUseCase$invoke$1(String str, Continuation continuation) {
        super(6, continuation);
        this.f20091f = str;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        IsScriptEnabledUseCase$invoke$1 isScriptEnabledUseCase$invoke$1 = new IsScriptEnabledUseCase$invoke$1(this.f20091f, (Continuation) obj6);
        isScriptEnabledUseCase$invoke$1.f20086a = (String) obj;
        isScriptEnabledUseCase$invoke$1.f20087b = (String) obj2;
        isScriptEnabledUseCase$invoke$1.f20088c = (String) obj3;
        isScriptEnabledUseCase$invoke$1.f20089d = (String) obj4;
        isScriptEnabledUseCase$invoke$1.f20090e = (String) obj5;
        return isScriptEnabledUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f20086a;
        String str2 = this.f20087b;
        String str3 = this.f20088c;
        String str4 = this.f20089d;
        String str5 = this.f20090e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String code = LanguageLearn.Japanese.getCode();
        String str6 = this.f20091f;
        if (fa4.m11650l(str6, code)) {
            str = str3;
        } else if (!fa4.m11650l(str6, LanguageLearn.Mandarin.getCode())) {
            if (fa4.m11650l(str6, LanguageLearn.ChineseTraditional.getCode())) {
                str = str2;
            } else if (fa4.m11650l(str6, LanguageLearn.Cantonese.getCode())) {
                str = str4;
            } else {
                str = AbstractC3184kh.m15230y(str6) ? str5 : "Off";
            }
        }
        return Boolean.valueOf(!fa4.m11650l(str, "Off"));
    }
}
