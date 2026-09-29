package com.lingq.feature.imports;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.ika;
import p000.m14;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importDataWithConnectivity$1", m4291f = "UserImportViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$importDataWithConnectivity$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ika f26099a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f26100b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        UserImportViewModel$importDataWithConnectivity$1 userImportViewModel$importDataWithConnectivity$1 = new UserImportViewModel$importDataWithConnectivity$1(3, (Continuation) obj3);
        userImportViewModel$importDataWithConnectivity$1.f26099a = (ika) obj;
        userImportViewModel$importDataWithConnectivity$1.f26100b = zBooleanValue;
        return userImportViewModel$importDataWithConnectivity$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ika ikaVar = this.f26099a;
        boolean z = this.f26100b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new m14(ikaVar, z);
    }
}
