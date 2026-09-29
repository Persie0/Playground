package com.lingq.core.user;

import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {90}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24234a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24235b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Profile f24236c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1 userSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1 = new UserSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1(3, (Continuation) obj3);
        userSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1.f24235b = (e83) obj;
        userSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1.f24236c = (Profile) obj2;
        return userSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24235b;
        Profile profile = this.f24236c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24234a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = profile.f19655d;
            Boolean boolValueOf = Boolean.valueOf(fa4.m11650l(str, "chief") || fa4.m11650l(str, "librarian"));
            this.f24235b = null;
            this.f24236c = null;
            this.f24234a = 1;
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
