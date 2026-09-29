package com.lingq.feature.imports;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e24;
import p000.fa4;
import p000.g24;
import p000.ika;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportScreenKt$UserImportScreen$1$1", m4291f = "UserImportScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportScreenKt$UserImportScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g24 f26026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f26027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f26028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportScreenKt$UserImportScreen$1$1(g24 g24Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f26026a = g24Var;
        this.f26027b = t66Var;
        this.f26028c = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportScreenKt$UserImportScreen$1$1(this.f26026a, this.f26027b, this.f26028c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UserImportScreenKt$UserImportScreen$1$1 userImportScreenKt$UserImportScreen$1$1 = (UserImportScreenKt$UserImportScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        userImportScreenKt$UserImportScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        g24 g24Var = this.f26026a;
        if (g24Var instanceof e24) {
            ika ikaVar = ((e24) g24Var).f36614a;
            String str = ikaVar.f44242f;
            t66 t66Var = this.f26027b;
            if (!fa4.m11650l(str, (String) t66Var.getValue()) && fa4.m11650l(ikaVar.f44241e, "URL")) {
                t66Var.setValue(ikaVar.f44242f);
            }
            if (!fa4.m11650l(ikaVar.f44243g, (String) t66Var.getValue()) && !fa4.m11650l(ikaVar.f44241e, "URL")) {
                t66Var.setValue(ikaVar.f44243g);
            }
            String str2 = ikaVar.f44238b;
            t66 t66Var2 = this.f26028c;
            if (!fa4.m11650l(str2, (String) t66Var2.getValue())) {
                t66Var2.setValue(ikaVar.f44238b);
            }
        }
        return xfa.f68157a;
    }
}
