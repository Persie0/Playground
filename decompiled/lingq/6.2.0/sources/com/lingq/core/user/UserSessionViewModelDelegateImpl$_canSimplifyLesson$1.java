package com.lingq.core.user;

import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dj3;
import p000.e83;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$_canSimplifyLesson$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$_canSimplifyLesson$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public int f24198a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24199b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f24200c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f24201d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f24202e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ SubscriptionDetails f24203f;

    public UserSessionViewModelDelegateImpl$_canSimplifyLesson$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        UserSessionViewModelDelegateImpl$_canSimplifyLesson$1 userSessionViewModelDelegateImpl$_canSimplifyLesson$1 = new UserSessionViewModelDelegateImpl$_canSimplifyLesson$1((Continuation) obj6);
        userSessionViewModelDelegateImpl$_canSimplifyLesson$1.f24199b = (e83) obj;
        userSessionViewModelDelegateImpl$_canSimplifyLesson$1.f24200c = zBooleanValue;
        userSessionViewModelDelegateImpl$_canSimplifyLesson$1.f24201d = zBooleanValue2;
        userSessionViewModelDelegateImpl$_canSimplifyLesson$1.f24202e = zBooleanValue3;
        userSessionViewModelDelegateImpl$_canSimplifyLesson$1.f24203f = (SubscriptionDetails) obj5;
        return userSessionViewModelDelegateImpl$_canSimplifyLesson$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        e83 e83Var = this.f24199b;
        boolean z2 = this.f24200c;
        boolean z3 = this.f24201d;
        boolean z4 = this.f24202e;
        SubscriptionDetails subscriptionDetails = this.f24203f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24198a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (z2) {
                Boolean bool = subscriptionDetails.f19846n;
                Boolean bool2 = Boolean.TRUE;
                if (fa4.m11650l(bool, bool2) || fa4.m11650l(subscriptionDetails.f19847o, bool2)) {
                    z = true;
                } else if (!z3 || z4) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (z3) {
                z = true;
            } else {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f24199b = null;
            this.f24203f = null;
            this.f24200c = z2;
            this.f24201d = z3;
            this.f24202e = z4;
            this.f24198a = 1;
            if (e83Var.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
