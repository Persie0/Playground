package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "Lcom/lingq/shared/domain/Profile;", "profile", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl$userLanguages$1", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {101}, m19208m = "invokeSuspend")
final class UserSessionViewModelDelegateImpl$userLanguages$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends UserLanguage>>, Profile, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30838e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f30839f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UserSessionViewModelDelegateImpl f30840g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$userLanguages$1(UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl, InterfaceC9968c<? super UserSessionViewModelDelegateImpl$userLanguages$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f30840g = userSessionViewModelDelegateImpl;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends UserLanguage>> interfaceC7117d, Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        UserSessionViewModelDelegateImpl$userLanguages$1 userSessionViewModelDelegateImpl$userLanguages$1 = new UserSessionViewModelDelegateImpl$userLanguages$1(this.f30840g, interfaceC9968c);
        userSessionViewModelDelegateImpl$userLanguages$1.f30839f = interfaceC7117d;
        return userSessionViewModelDelegateImpl$userLanguages$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30838e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f30839f;
            UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl = this.f30840g;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(userSessionViewModelDelegateImpl.f30792b.mo6016b(), userSessionViewModelDelegateImpl.f30795e);
            this.f30838e = 1;
            if (C0062b.m280J0(this, interfaceC7116cM307S0, interfaceC7117d) == coroutineSingletons) {
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
