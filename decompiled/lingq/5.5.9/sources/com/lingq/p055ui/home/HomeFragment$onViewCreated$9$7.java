package com.lingq.p055ui.home;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import kh.C6686m;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$7", m19206f = "HomeFragment.kt", m19207l = {393}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22720e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22721f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$7$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$7$1", m19206f = "HomeFragment.kt", m19207l = {394, 395}, m19208m = "invokeSuspend")
    public static final class C34741 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22722e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22723f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34741(HomeFragment homeFragment, InterfaceC9968c<? super C34741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22723f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C34741(this.f22723f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34741) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22722e;
            HomeFragment homeFragment = this.f22723f;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
                C7828f.m15570d(C8573r0.m16767w0(homeViewModelM9770s0), homeViewModelM9770s0.f22733I, null, new HomeViewModel$clearDatabase$1(homeViewModelM9770s0, null), 2);
                homeFragment.m9770s0().mo9729Y1();
                homeFragment.m9768q0().f37891b.edit().clear().commit();
                C4924a.m10447Z(C8573r0.m16725g0(homeFragment), new C6686m(null, ""));
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC5180b interfaceC5180b = homeFragment.f22664K0;
            if (interfaceC5180b == null) {
                C5207g.m11117l("profileStore");
                throw null;
            }
            this.f22722e = 1;
            if (interfaceC5180b.mo9617f(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            InterfaceC5182d interfaceC5182d = homeFragment.f22665L0;
            if (interfaceC5182d == null) {
                C5207g.m11117l("utilStore");
                throw null;
            }
            this.f22722e = 2;
            if (interfaceC5182d.mo9683g(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = HomeFragment.f22653M0;
            HomeViewModel homeViewModelM9770s1 = homeFragment.m9770s0();
            C7828f.m15570d(C8573r0.m16767w0(homeViewModelM9770s1), homeViewModelM9770s1.f22733I, null, new HomeViewModel$clearDatabase$1(homeViewModelM9770s1, null), 2);
            homeFragment.m9770s0().mo9729Y1();
            homeFragment.m9768q0().f37891b.edit().clear().commit();
            C4924a.m10447Z(C8573r0.m16725g0(homeFragment), new C6686m(null, ""));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$7(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22721f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$7(this.f22721f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22720e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22721f;
            HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
            C34741 c34741 = new C34741(homeFragment, null);
            this.f22720e = 1;
            if (C0062b.m369m0(homeViewModelM9770s0.f22746V, c34741, this) == coroutineSingletons) {
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
