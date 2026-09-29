package com.amplitude.core.utilities;

import com.amplitude.android.storage.C0898b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.br5;
import p000.c32;
import p000.dr5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$removeCallbackByInsertId$1$1", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$removeCallbackByInsertId$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dr5 f11243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$removeCallbackByInsertId$1$1(C0915c c0915c, dr5 dr5Var, Continuation continuation) {
        super(2, continuation);
        this.f11242a = c0915c;
        this.f11243b = dr5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$removeCallbackByInsertId$1$1(this.f11242a, this.f11243b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$removeCallbackByInsertId$1$1 fileResponseHandler$removeCallbackByInsertId$1$1 = (FileResponseHandler$removeCallbackByInsertId$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$removeCallbackByInsertId$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0898b c0898b = this.f11242a.f11264a;
        String str = (String) ((br5) this.f11243b.m10610a()).get(1);
        c0898b.getClass();
        str.getClass();
        c0898b.f10993e.remove(str);
        return xfa.f68157a;
    }
}
