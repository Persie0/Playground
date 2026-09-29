package com.lingq.core.domain.theme;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.cl9;
import p000.fa4;
import p000.vk9;
import p000.vs3;
import p000.xfa;
import p000.yz7;
import p000.zz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.theme.GetHighlightColorForThemeUseCase$invoke$1", m4291f = "GetHighlightColorForThemeUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetHighlightColorForThemeUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f19992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f19993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1530a f19994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHighlightColorForThemeUseCase$invoke$1(C1530a c1530a, Continuation continuation) {
        super(3, continuation);
        this.f19994c = c1530a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetHighlightColorForThemeUseCase$invoke$1 getHighlightColorForThemeUseCase$invoke$1 = new GetHighlightColorForThemeUseCase$invoke$1(this.f19994c, (Continuation) obj3);
        getHighlightColorForThemeUseCase$invoke$1.f19992a = (String) obj;
        getHighlightColorForThemeUseCase$invoke$1.f19993b = (String) obj2;
        return getHighlightColorForThemeUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f19992a;
        String strM4839V = this.f19993b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        zz7 zz7Var = zz7.f72426a;
        yz7 yz7VarM25898a = zz7.m25898a(str);
        boolean z = (this.f19994c.f19996b.f7369a.getResources().getConfiguration().uiMode & 48) == 32;
        Object obj2 = null;
        if (fa4.m11650l(yz7VarM25898a != null ? yz7VarM25898a.f70705a : null, "default")) {
            strM4839V = z ? cl9.m4839V(strM4839V, "Light", "Dark") : cl9.m4839V(strM4839V, "Dark", "Light");
        } else if (z && vk9.m23380c0(strM4839V, "Light", false)) {
            strM4839V = cl9.m4839V(strM4839V, "Light", "Dark");
        } else if (!z && vk9.m23380c0(strM4839V, "Dark", false)) {
            strM4839V = cl9.m4839V(strM4839V, "Dark", "Light");
        }
        if (yz7VarM25898a != null) {
            for (Object obj3 : yz7VarM25898a.f70707c) {
                if (fa4.m11650l(((vs3) obj3).f65845a, strM4839V)) {
                    obj2 = obj3;
                    break;
                }
            }
            obj2 = (vs3) obj2;
        }
        return obj2 == null ? zz7.f72431f : obj2;
    }
}
