package com.lingq.feature.library.domain;

import java.time.LocalDate;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.e85;
import p000.fa4;
import p000.ws1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.domain.GetLibraryCupBannerUseCase$invoke$1", m4291f = "GetLibraryCupBannerUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLibraryCupBannerUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ws1 f26637a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f26638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2144a f26639c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LocalDate f26640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryCupBannerUseCase$invoke$1(C2144a c2144a, LocalDate localDate, Continuation continuation) {
        super(3, continuation);
        this.f26639c = c2144a;
        this.f26640d = localDate;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLibraryCupBannerUseCase$invoke$1 getLibraryCupBannerUseCase$invoke$1 = new GetLibraryCupBannerUseCase$invoke$1(this.f26639c, this.f26640d, (Continuation) obj3);
        getLibraryCupBannerUseCase$invoke$1.f26637a = (ws1) obj;
        getLibraryCupBannerUseCase$invoke$1.f26638b = (String) obj2;
        return getLibraryCupBannerUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        boolean z;
        ws1 ws1Var = this.f26637a;
        String str = this.f26638b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        e85 e85Var = null;
        if (ws1Var != null) {
            this.f26639c.getClass();
            boolean z2 = false;
            if (ws1Var.f67227c) {
                try {
                    failure = LocalDate.parse(ws1Var.f67233i);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                LocalDate localDate = (LocalDate) failure;
                if (localDate == null) {
                    z = false;
                } else {
                    z = !this.f26640d.isAfter(localDate.plusDays(7L));
                }
            } else {
                z = true;
            }
            if (!z) {
                ws1Var = null;
            }
            if (ws1Var != null) {
                if (str.length() > 0 && fa4.m11650l(ws1Var.f67232h, str)) {
                    z2 = true;
                }
                e85Var = new e85(ws1Var, z2);
            }
        }
        return e85Var;
    }
}
