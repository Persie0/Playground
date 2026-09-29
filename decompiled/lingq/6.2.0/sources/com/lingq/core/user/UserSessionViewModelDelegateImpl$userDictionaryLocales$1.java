package com.lingq.core.user;

import com.lingq.core.domain.model.user.Profile;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$userDictionaryLocales$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$userDictionaryLocales$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24281a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24282b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Profile f24283c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$userDictionaryLocales$1 userSessionViewModelDelegateImpl$userDictionaryLocales$1 = new UserSessionViewModelDelegateImpl$userDictionaryLocales$1(3, (Continuation) obj3);
        userSessionViewModelDelegateImpl$userDictionaryLocales$1.f24282b = (e83) obj;
        userSessionViewModelDelegateImpl$userDictionaryLocales$1.f24283c = (Profile) obj2;
        return userSessionViewModelDelegateImpl$userDictionaryLocales$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24282b;
        Profile profile = this.f24283c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24281a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = profile.f19669r;
            this.f24282b = null;
            this.f24283c = null;
            this.f24281a = 1;
            if (e83Var.emit(list, this) == coroutineSingletons) {
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
