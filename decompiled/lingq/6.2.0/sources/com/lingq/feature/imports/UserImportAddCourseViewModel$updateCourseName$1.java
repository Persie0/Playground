package com.lingq.feature.imports;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.eka;
import p000.fka;
import p000.ika;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportAddCourseViewModel$updateCourseName$1", m4291f = "UserImportAddCourseViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportAddCourseViewModel$updateCourseName$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fka f26000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportAddCourseViewModel$updateCourseName$1(String str, fka fkaVar, Continuation continuation) {
        super(2, continuation);
        this.f25999a = str;
        this.f26000b = fkaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportAddCourseViewModel$updateCourseName$1(this.f25999a, this.f26000b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UserImportAddCourseViewModel$updateCourseName$1 userImportAddCourseViewModel$updateCourseName$1 = (UserImportAddCourseViewModel$updateCourseName$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        userImportAddCourseViewModel$updateCourseName$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = this.f25999a;
        boolean zM23391n0 = vk9.m23391n0(str);
        xfa xfaVar = xfa.f68157a;
        if (!zM23391n0) {
            fka fkaVar = this.f26000b;
            ika ikaVar = (ika) fkaVar.f39234b.mo9014u2().getValue();
            if (eka.f37398a[fkaVar.f39235c.ordinal()] == 1) {
                ikaVar.getClass();
                ikaVar.f44239c = str;
                fkaVar.f39234b.mo9011N0(ikaVar);
            }
        }
        return xfaVar;
    }
}
