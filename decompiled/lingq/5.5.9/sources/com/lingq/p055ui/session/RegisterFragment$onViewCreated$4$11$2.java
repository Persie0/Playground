package com.lingq.p055ui.session;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8287g1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$2", m19206f = "RegisterFragment.kt", m19207l = {276}, m19208m = "invokeSuspend")
public final class RegisterFragment$onViewCreated$4$11$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30754e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisterFragment f30755f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8287g1 f30756g;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "result", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$2$1", m19206f = "RegisterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47441 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f30757e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RegisterFragment f30758f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C8287g1 f30759g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47441(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30758f = registerFragment;
            this.f30759g = c8287g1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47441 c47441 = new C47441(this.f30759g, this.f30758f, interfaceC9968c);
            c47441.f30757e = ((Boolean) obj).booleanValue();
            return c47441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47441) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f30757e) {
                RegisterFragment registerFragment = this.f30758f;
                C6704a c6704a = registerFragment.f30740G0;
                if (c6704a == null) {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
                c6704a.m13310l("Email");
                C8287g1 c8287g1 = this.f30759g;
                String strValueOf = String.valueOf(c8287g1.f44810n.getText());
                String strValueOf2 = String.valueOf(c8287g1.f44807k.getText());
                NavController navControllerM16725g0 = C8573r0.m16725g0(registerFragment);
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToFinishingFragment) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("username", strValueOf);
                    bundle.putString("password", strValueOf2);
                    navControllerM16725g0.m3992m(R.id.actionToFinishingFragment, bundle, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$onViewCreated$4$11$2(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30755f = registerFragment;
        this.f30756g = c8287g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RegisterFragment$onViewCreated$4$11$2(this.f30756g, this.f30755f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RegisterFragment$onViewCreated$4$11$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30754e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            RegisterFragment registerFragment = this.f30755f;
            AuthenticationViewModel authenticationViewModelM10343q0 = registerFragment.m10343q0();
            C47441 c47441 = new C47441(this.f30756g, registerFragment, null);
            this.f30754e = 1;
            if (C0062b.m369m0(authenticationViewModelM10343q0.f30534L, c47441, this) == coroutineSingletons) {
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
