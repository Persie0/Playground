package com.lingq.p055ui;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.shared.domain.Login;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$2$1", m19206f = "StartFragment.kt", m19207l = {82}, m19208m = "invokeSuspend")
public final class StartFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22394e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StartFragment f22395f;

    /* JADX INFO: renamed from: com.lingq.ui.StartFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Login;", "login", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$2$1$1", m19206f = "StartFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34341 extends SuspendLambda implements InterfaceC2056p<Login, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22396e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StartFragment f22397f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34341(StartFragment startFragment, InterfaceC9968c<? super C34341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22397f = startFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34341 c34341 = new C34341(this.f22397f, interfaceC9968c);
            c34341.f22396e = obj;
            return c34341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Login login, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34341) mo1336a(login, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = ((Login) this.f22396e).f17773b;
            boolean z10 = !(str == null || str.length() == 0);
            StartFragment startFragment = this.f22397f;
            if (z10) {
                ((AuthenticationViewModel) startFragment.f22375C0.getValue()).m10329n2();
            } else {
                NavController navControllerM16725g0 = C8573r0.m16725g0(startFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToOnboarding) != null) {
                    navControllerM16725g0.m3992m(R.id.actionToOnboarding, bundle, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartFragment$onViewCreated$2$1(StartFragment startFragment, InterfaceC9968c<? super StartFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22395f = startFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StartFragment$onViewCreated$2$1(this.f22395f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StartFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22394e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            StartFragment startFragment = this.f22395f;
            InterfaceC5180b interfaceC5180b = startFragment.f22378F0;
            if (interfaceC5180b == null) {
                C5207g.m11117l("profileStore");
                throw null;
            }
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = interfaceC5180b.mo9613b();
            C34341 c34341 = new C34341(startFragment, null);
            this.f22394e = 1;
            if (C0062b.m369m0(profileStoreImpl$special$$inlined$map$3Mo9613b, c34341, this) == coroutineSingletons) {
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
