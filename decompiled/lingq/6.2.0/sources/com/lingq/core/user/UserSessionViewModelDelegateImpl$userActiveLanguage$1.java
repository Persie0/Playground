package com.lingq.core.user;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.user.UserSessionViewModelDelegateImpl$userActiveLanguage$1", m4291f = "UserSessionViewModelDelegate.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class UserSessionViewModelDelegateImpl$userActiveLanguage$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24278b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Profile f24279c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1939a f24280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$userActiveLanguage$1(C1939a c1939a, Continuation continuation) {
        super(3, continuation);
        this.f24280d = c1939a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserSessionViewModelDelegateImpl$userActiveLanguage$1 userSessionViewModelDelegateImpl$userActiveLanguage$1 = new UserSessionViewModelDelegateImpl$userActiveLanguage$1(this.f24280d, (Continuation) obj3);
        userSessionViewModelDelegateImpl$userActiveLanguage$1.f24278b = (e83) obj;
        userSessionViewModelDelegateImpl$userActiveLanguage$1.f24279c = (Profile) obj2;
        return userSessionViewModelDelegateImpl$userActiveLanguage$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24278b;
        Profile profile = this.f24279c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24277a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7215l = ((C1293i) this.f24280d.f24290b).m7215l(profile.f19666o);
            this.f24278b = null;
            this.f24279c = null;
            this.f24277a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7215l, this) == coroutineSingletons) {
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
