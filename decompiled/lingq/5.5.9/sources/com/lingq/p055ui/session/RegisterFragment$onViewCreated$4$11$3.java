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
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$3", m19206f = "RegisterFragment.kt", m19207l = {290}, m19208m = "invokeSuspend")
public final class RegisterFragment$onViewCreated$4$11$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30760e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisterFragment f30761f;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$3$1", m19206f = "RegisterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47451 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30762e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RegisterFragment f30763f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47451(RegisterFragment registerFragment, InterfaceC9968c<? super C47451> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30763f = registerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47451 c47451 = new C47451(this.f30763f, interfaceC9968c);
            c47451.f30762e = obj;
            return c47451;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47451) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x007c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f30762e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            if (((Boolean) pair.f38013b).booleanValue()) {
                RegisterFragment registerFragment = this.f30763f;
                C6704a c6704a = registerFragment.f30740G0;
                if (c6704a == null) {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
                c6704a.m13310l((iIntValue == 2 || iIntValue != 3) ? "Facebook" : "Google");
                NavController navControllerM16725g0 = C8573r0.m16725g0(registerFragment);
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToFinishingFragment) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("username", "");
                    bundle.putString("password", "");
                    navControllerM16725g0.m3992m(R.id.actionToFinishingFragment, bundle, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$onViewCreated$4$11$3(RegisterFragment registerFragment, InterfaceC9968c<? super RegisterFragment$onViewCreated$4$11$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30761f = registerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RegisterFragment$onViewCreated$4$11$3(this.f30761f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RegisterFragment$onViewCreated$4$11$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30760e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            RegisterFragment registerFragment = this.f30761f;
            AuthenticationViewModel authenticationViewModelM10343q0 = registerFragment.m10343q0();
            C47451 c47451 = new C47451(registerFragment, null);
            this.f30760e = 1;
            if (C0062b.m369m0(authenticationViewModelM10343q0.f30536N, c47451, this) == coroutineSingletons) {
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
