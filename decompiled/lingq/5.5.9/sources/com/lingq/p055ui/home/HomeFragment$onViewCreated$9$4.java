package com.lingq.p055ui.home;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import kh.C6684k;
import kh.C6685l;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$4", m19206f = "HomeFragment.kt", m19207l = {293}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22708e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22709f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/HomeViewModel$a;", "event", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$4$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34711 extends SuspendLambda implements InterfaceC2056p<HomeViewModel.AbstractC3479a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22710e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22711f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34711(HomeFragment homeFragment, InterfaceC9968c<? super C34711> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22711f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34711 c34711 = new C34711(this.f22711f, interfaceC9968c);
            c34711.f22710e = obj;
            return c34711;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(HomeViewModel.AbstractC3479a abstractC3479a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34711) mo1336a(abstractC3479a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            HomeViewModel.AbstractC3479a abstractC3479a = (HomeViewModel.AbstractC3479a) this.f22710e;
            boolean zM11106a = C5207g.m11106a(abstractC3479a, HomeViewModel.AbstractC3479a.b.f22771a);
            boolean z10 = true;
            HomeFragment homeFragment = this.f22711f;
            if (zM11106a) {
                NavDestination navDestinationM3986g = C8573r0.m16725g0(homeFragment).m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.f6834h != R.id.fragment_language_selector) {
                    z10 = false;
                }
                if (z10) {
                    C8573r0.m16725g0(homeFragment).m3995p();
                }
            } else if (C5207g.m11106a(abstractC3479a, HomeViewModel.AbstractC3479a.c.f22772a)) {
                NavDestination navDestinationM3986g2 = C8573r0.m16725g0(homeFragment).m3986g();
                if (navDestinationM3986g2 == null || navDestinationM3986g2.f6834h != R.id.fragment_home) {
                    z10 = false;
                }
                if (z10) {
                    NavController navControllerM16725g0 = C8573r0.m16725g0(homeFragment);
                    Bundle bundle = new Bundle();
                    NavDestination navDestinationM3986g3 = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g3 != null && navDestinationM3986g3.m4016i(R.id.languageOpenAction) != null) {
                        navControllerM16725g0.m3992m(R.id.languageOpenAction, bundle, null);
                    }
                }
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.d) {
                HomeViewModel.AbstractC3479a.d dVar = (HomeViewModel.AbstractC3479a.d) abstractC3479a;
                C4924a.m10447Z(C8573r0.m16725g0(homeFragment), C0062b.m279J(dVar.f22773a, dVar.f22774b, dVar.f22775c, dVar.f22776d, 16));
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.h) {
                HomeViewModel.AbstractC3479a.h hVar = (HomeViewModel.AbstractC3479a.h) abstractC3479a;
                homeFragment.m9768q0().m13311m(C6744b.m13393y0(hVar.f22789d.toArray(new String[0])));
                C4924a.m10447Z(C8573r0.m16725g0(homeFragment), C5206f.m11020r0(-1, null, hVar.f22787b, hVar.f22786a, 0, hVar.f22788c, hVar.f22790e, null, 146));
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.j) {
                HomeViewModel.AbstractC3479a.j jVar = (HomeViewModel.AbstractC3479a.j) abstractC3479a;
                String str = jVar.f22792a;
                C5207g.m11111f(str, "vocabularyLanguageFromDeeplink");
                String str2 = jVar.f22793b;
                C5207g.m11111f(str2, "lotd");
                NavController navControllerM16725g1 = C8573r0.m16725g0(homeFragment);
                NavDestination navDestinationM3986g4 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g4 != null && navDestinationM3986g4.m4016i(R.id.actionToVocabulary) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("vocabularyLanguageFromDeeplink", str);
                    bundle2.putString("lotd", str2);
                    navControllerM16725g1.m3992m(R.id.actionToVocabulary, bundle2, null);
                }
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.i) {
                NavController navControllerM16725g2 = C8573r0.m16725g0(homeFragment);
                String str3 = ((HomeViewModel.AbstractC3479a.i) abstractC3479a).f22791a;
                C5207g.m11111f(str3, "attemptedAction");
                NavDestination navDestinationM3986g5 = navControllerM16725g2.m3986g();
                if (navDestinationM3986g5 != null && navDestinationM3986g5.m4016i(R.id.actionToUpgrade) != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("attemptedAction", str3);
                    bundle3.putString("offer", "");
                    navControllerM16725g2.m3992m(R.id.actionToUpgrade, bundle3, null);
                }
            } else if (C5207g.m11106a(abstractC3479a, HomeViewModel.AbstractC3479a.a.f22770a)) {
                NavController navControllerM16725g3 = C8573r0.m16725g0(homeFragment);
                NavDestination navDestinationM3986g6 = navControllerM16725g3.m3986g();
                if (navDestinationM3986g6 != null && navDestinationM3986g6.m4016i(R.id.actionToUpgrade) != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("attemptedAction", "Home Screen Button Click");
                    bundle4.putString("offer", "");
                    navControllerM16725g3.m3992m(R.id.actionToUpgrade, bundle4, null);
                }
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.e) {
                HomeViewModel.AbstractC3479a.e eVar = (HomeViewModel.AbstractC3479a.e) abstractC3479a;
                String str4 = eVar.f22778a;
                C5207g.m11111f(str4, "source");
                String str5 = eVar.f22779b;
                C5207g.m11111f(str5, "url");
                C4924a.m10447Z(C8573r0.m16725g0(homeFragment), new C6685l(eVar.f22780c, eVar.f22781d, str4, str5));
            } else if (C5207g.m11106a(abstractC3479a, HomeViewModel.AbstractC3479a.f.f22782a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                homeFragment.m9769r0().f45267a.setSelectedItemId(R.id.nav_graph_library);
            } else if (abstractC3479a instanceof HomeViewModel.AbstractC3479a.g) {
                HomeViewModel.AbstractC3479a.g gVar = (HomeViewModel.AbstractC3479a.g) abstractC3479a;
                C4924a.m10447Z(C8573r0.m16725g0(homeFragment), new C6684k(gVar.f22783a, gVar.f22784b, gVar.f22785c));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$4(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22709f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$4(this.f22709f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22708e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22709f;
            HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
            C34711 c34711 = new C34711(homeFragment, null);
            this.f22708e = 1;
            if (C0062b.m369m0(homeViewModelM9770s0.f22744T, c34711, this) == coroutineSingletons) {
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
