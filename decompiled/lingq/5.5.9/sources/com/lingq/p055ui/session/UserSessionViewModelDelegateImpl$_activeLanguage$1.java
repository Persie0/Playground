package com.lingq.p055ui.session;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/domain/Profile;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl$_activeLanguage$1", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {65}, m19208m = "invokeSuspend")
final class UserSessionViewModelDelegateImpl$_activeLanguage$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super String>, Profile, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30803e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f30804f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Profile f30805g;

    public UserSessionViewModelDelegateImpl$_activeLanguage$1(InterfaceC9968c<? super UserSessionViewModelDelegateImpl$_activeLanguage$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super String> interfaceC7117d, Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        UserSessionViewModelDelegateImpl$_activeLanguage$1 userSessionViewModelDelegateImpl$_activeLanguage$1 = new UserSessionViewModelDelegateImpl$_activeLanguage$1(interfaceC9968c);
        userSessionViewModelDelegateImpl$_activeLanguage$1.f30804f = interfaceC7117d;
        userSessionViewModelDelegateImpl$_activeLanguage$1.f30805g = profile;
        return userSessionViewModelDelegateImpl$_activeLanguage$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30803e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f30804f;
            String str = this.f30805g.f17795o;
            this.f30804f = null;
            this.f30803e = 1;
            if (interfaceC7117d.mo1339r(str, this) == coroutineSingletons) {
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
