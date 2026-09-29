package com.lingq.p055ui.home;

import ae.C0062b;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.AbstractC3274b;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
import kh.C6678e;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$10", m19206f = "HomeFragment.kt", m19207l = {423}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$10 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22694e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22695f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$10$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/commons/controllers/b;", "navigate", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$10$1", m19206f = "HomeFragment.kt", m19207l = {432, 451, 517}, m19208m = "invokeSuspend")
    public static final class C34681 extends SuspendLambda implements InterfaceC2056p<AbstractC3274b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22696e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f22697f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ HomeFragment f22698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34681(HomeFragment homeFragment, InterfaceC9968c<? super C34681> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22698g = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34681 c34681 = new C34681(this.f22698g, interfaceC9968c);
            c34681.f22697f = obj;
            return c34681;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3274b abstractC3274b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34681) mo1336a(abstractC3274b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LessonPath url;
            AbstractC3274b abstractC3274b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22696e;
            HomeFragment homeFragment = this.f22698g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                AbstractC3274b abstractC3274b2 = (AbstractC3274b) this.f22697f;
                if (abstractC3274b2 instanceof AbstractC3274b.c) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                    LinearLayout linearLayout = homeFragment.m9769r0().f45270d;
                    C5207g.m11110e(linearLayout, "binding.viewProgress");
                    C4924a.m10457e0(linearLayout);
                    TextView textView = homeFragment.m9769r0().f45269c;
                    Locale locale = Locale.getDefault();
                    String strM3600t = homeFragment.m3600t(R.string.deep_link_language_switching);
                    C5207g.m11110e(strM3600t, "getString(R.string.deep_link_language_switching)");
                    AbstractC3274b.c cVar = (AbstractC3274b.c) abstractC3274b2;
                    String str = String.format(locale, strM3600t, Arrays.copyOf(new Object[]{C4924a.m10439R(homeFragment.m3578a0(), cVar.f16684a)}, 1));
                    C5207g.m11110e(str, "format(locale, format, *args)");
                    textView.setText(str);
                    HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
                    this.f22697f = abstractC3274b2;
                    this.f22696e = 1;
                    if (homeViewModelM9770s0.mo501d(cVar.f16684a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    abstractC3274b = abstractC3274b2;
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = HomeFragment.f22653M0;
                    LinearLayout linearLayout2 = homeFragment.m9769r0().f45270d;
                    C5207g.m11110e(linearLayout2, "binding.viewProgress");
                    C4924a.m10442U(linearLayout2);
                    homeFragment.m9770s0().mo9319q(((AbstractC3274b.c) abstractC3274b).f16685b);
                } else if (abstractC3274b2 instanceof AbstractC3274b.h) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_library, new Integer(R.id.fragment_library));
                } else if (abstractC3274b2 instanceof AbstractC3274b.l) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_playlist, new Integer(R.id.fragment_playlist));
                    AbstractC3274b.l lVar = (AbstractC3274b.l) abstractC3274b2;
                    if (lVar.f16697b != null) {
                        LinearLayout linearLayout3 = homeFragment.m9769r0().f45270d;
                        C5207g.m11110e(linearLayout3, "binding.viewProgress");
                        C4924a.m10457e0(linearLayout3);
                        homeFragment.m9769r0().f45269c.setText("");
                        HomeViewModel homeViewModelM9770s1 = homeFragment.m9770s0();
                        int iIntValue = lVar.f16697b.intValue();
                        this.f22696e = 2;
                        if (homeViewModelM9770s1.m9778n2(iIntValue, lVar.f16696a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = HomeFragment.f22653M0;
                        LinearLayout linearLayout4 = homeFragment.m9769r0().f45270d;
                        C5207g.m11110e(linearLayout4, "binding.viewProgress");
                        C4924a.m10442U(linearLayout4);
                    }
                } else if (abstractC3274b2 instanceof AbstractC3274b.r) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_vocabulary, new Integer(R.id.fragment_vocabulary));
                } else if (abstractC3274b2 instanceof AbstractC3274b.n) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_vocabulary, new Integer(R.id.fragment_vocabulary));
                    homeFragment.m9770s0().f22743S.mo16479j(new HomeViewModel.AbstractC3479a.h(true, EmptyList.f38032a, ((AbstractC3274b.n) abstractC3274b2).f16699a, 4));
                } else if (abstractC3274b2 instanceof AbstractC3274b.g) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_library, new Integer(R.id.fragment_library));
                    HomeViewModel homeViewModelM9770s2 = homeFragment.m9770s0();
                    AbstractC3274b.g gVar = (AbstractC3274b.g) abstractC3274b2;
                    int i11 = gVar.f16689a;
                    String str2 = gVar.f16691c;
                    String str3 = gVar.f16690b;
                    if (str3 == null && str2 == null) {
                        url = LessonPath.Deeplink.f22158a;
                    } else {
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        url = new LessonPath.URL(str3, str2);
                    }
                    homeViewModelM9770s2.m9776l2(i11, 0, "", url);
                } else if (abstractC3274b2 instanceof AbstractC3274b.e) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_library, new Integer(R.id.fragment_library));
                    C4924a.m10447Z(C8573r0.m16725g0(homeFragment), new C6678e(((AbstractC3274b.e) abstractC3274b2).f16687a, LessonPath.Deeplink.f22158a));
                } else if (abstractC3274b2 instanceof AbstractC3274b.o) {
                    HomeFragment.m9767p0(homeFragment, R.id.nav_graph_library, new Integer(R.id.fragment_library));
                    LinearLayout linearLayout5 = homeFragment.m9769r0().f45270d;
                    C5207g.m11110e(linearLayout5, "binding.viewProgress");
                    C4924a.m10457e0(linearLayout5);
                    homeFragment.m9769r0().f45269c.setText("");
                    HomeViewModel homeViewModelM9770s3 = homeFragment.m9770s0();
                    AbstractC3274b.o oVar = (AbstractC3274b.o) abstractC3274b2;
                    String str4 = oVar.f16700a;
                    this.f22696e = 3;
                    if (homeViewModelM9770s3.m9779o2(str4, oVar.f16701b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = HomeFragment.f22653M0;
                    LinearLayout linearLayout6 = homeFragment.m9769r0().f45270d;
                    C5207g.m11110e(linearLayout6, "binding.viewProgress");
                    C4924a.m10442U(linearLayout6);
                } else if (abstractC3274b2 instanceof AbstractC3274b.f) {
                    NavController navControllerM16725g0 = C8573r0.m16725g0(homeFragment);
                    Bundle bundle = new Bundle();
                    NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToInviteFriends) != null) {
                        navControllerM16725g0.m3992m(R.id.actionToInviteFriends, bundle, null);
                    }
                }
            } else if (i10 == 1) {
                abstractC3274b = (AbstractC3274b) this.f22697f;
                C7499b.m14977z0(obj);
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = HomeFragment.f22653M0;
                LinearLayout linearLayout7 = homeFragment.m9769r0().f45270d;
                C5207g.m11110e(linearLayout7, "binding.viewProgress");
                C4924a.m10442U(linearLayout7);
                homeFragment.m9770s0().mo9319q(((AbstractC3274b.c) abstractC3274b).f16685b);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = HomeFragment.f22653M0;
                LinearLayout linearLayout8 = homeFragment.m9769r0().f45270d;
                C5207g.m11110e(linearLayout8, "binding.viewProgress");
                C4924a.m10442U(linearLayout8);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = HomeFragment.f22653M0;
                LinearLayout linearLayout9 = homeFragment.m9769r0().f45270d;
                C5207g.m11110e(linearLayout9, "binding.viewProgress");
                C4924a.m10442U(linearLayout9);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$10(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$10> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22695f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$10(this.f22695f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$10) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22694e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22695f;
            InterfaceC7137r<AbstractC3274b> interfaceC7137rMo9320y1 = homeFragment.m9770s0().mo9320y1();
            C34681 c34681 = new C34681(homeFragment, null);
            this.f22694e = 1;
            if (C0062b.m369m0(interfaceC7137rMo9320y1, c34681, this) == coroutineSingletons) {
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
