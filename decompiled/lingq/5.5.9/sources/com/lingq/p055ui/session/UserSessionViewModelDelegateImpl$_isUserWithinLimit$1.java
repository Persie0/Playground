package com.lingq.p055ui.session;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.ProfileAccount;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/domain/ProfileAccount;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl$_isUserWithinLimit$1", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {77}, m19208m = "invokeSuspend")
final class UserSessionViewModelDelegateImpl$_isUserWithinLimit$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, ProfileAccount, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30815e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f30816f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ProfileAccount f30817g;

    public UserSessionViewModelDelegateImpl$_isUserWithinLimit$1(InterfaceC9968c<? super UserSessionViewModelDelegateImpl$_isUserWithinLimit$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        UserSessionViewModelDelegateImpl$_isUserWithinLimit$1 userSessionViewModelDelegateImpl$_isUserWithinLimit$1 = new UserSessionViewModelDelegateImpl$_isUserWithinLimit$1(interfaceC9968c);
        userSessionViewModelDelegateImpl$_isUserWithinLimit$1.f30816f = interfaceC7117d;
        userSessionViewModelDelegateImpl$_isUserWithinLimit$1.f30817g = profileAccount;
        return userSessionViewModelDelegateImpl$_isUserWithinLimit$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30815e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f30816f;
            ProfileAccount profileAccount = this.f30817g;
            int i11 = profileAccount.f17809i;
            Integer num = profileAccount.f17808h;
            boolean z10 = false;
            if (i11 < (num != null ? num.intValue() : 0)) {
                z10 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f30816f = null;
            this.f30815e = 1;
            if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
