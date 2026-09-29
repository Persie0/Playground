package com.lingq.p055ui.home;

import ae.C0065e;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.Lifecycle;
import androidx.view.LifecycleCoroutineScopeImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingq.p055ui.imports.ImportData;
import com.lingq.player.PlayerController;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import com.squareup.moshi.AbstractC4949k;
import dm.C5207g;
import dm.C5209i;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kh.C6679f;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import mo.C7661i;
import ni.C7796d;
import ni.C7797e;
import no.C7828f;
import no.C7832g0;
import no.InterfaceC7882z;
import p040c4.C1688m;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p108f4.C5467a;
import p118fe.C5509a;
import p136gc.AbstractC5751g;
import p225kk.C6704a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p368ri.AbstractC8809a;
import p368ri.C8812d;
import p378s3.C8953b;
import p402u0.C9369l;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p464wl.InterfaceC9968c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p490xl.InterfaceC10224c;
import ph.C8359t;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class HomeFragment extends AbstractC8809a {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22653M0 = {C0204c.m857q(HomeFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f22654A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f22655B0;

    /* JADX INFO: renamed from: C0 */
    public C1688m f22656C0;

    /* JADX INFO: renamed from: D0 */
    public ArrayAdapter<String> f22657D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f22658E0;

    /* JADX INFO: renamed from: F0 */
    public C7797e f22659F0;

    /* JADX INFO: renamed from: G0 */
    public C7796d f22660G0;

    /* JADX INFO: renamed from: H0 */
    public InterfaceC5179a f22661H0;

    /* JADX INFO: renamed from: I0 */
    public C6704a f22662I0;

    /* JADX INFO: renamed from: J0 */
    public PlayerController f22663J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC5180b f22664K0;

    /* JADX INFO: renamed from: L0 */
    public InterfaceC5182d f22665L0;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$a */
    public static final class ViewOnLayoutChangeListenerC3460a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC3460a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C5207g.m11111f(view, "view");
            view.removeOnLayoutChangeListener(this);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment.this.m9769r0().f45267a.setSelectedItemId(R.id.nav_graph_playlist);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$b */
    public static final class ViewOnLayoutChangeListenerC3461b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f22668b;

        public ViewOnLayoutChangeListenerC3461b(int i10) {
            this.f22668b = i10;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C5207g.m11111f(view, "view");
            view.removeOnLayoutChangeListener(this);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment.this.m9770s0().m9776l2(this.f22668b, 0, "", LessonPath.Unknown.f22167a);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$c */
    public static final class ViewOnLayoutChangeListenerC3462c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f22670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f22671b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeFragment f22672c;

        public ViewOnLayoutChangeListenerC3462c(int i10, String str, HomeFragment homeFragment) {
            this.f22670a = i10;
            this.f22671b = str;
            this.f22672c = homeFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C5207g.m11111f(view, "view");
            view.removeOnLayoutChangeListener(this);
            String str = this.f22671b;
            C5207g.m11111f(str, "courseTitle");
            C4924a.m10447Z(C8573r0.m16725g0(this.f22672c), new C6679f(str, this.f22670a));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$d */
    public static final class C3463d implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2056p f22673a;

        public C3463d(InterfaceC2056p interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "function");
            this.f22673a = interfaceC2056p;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Number) this.f22673a.mo1337m0(obj, obj2)).intValue();
        }
    }

    public HomeFragment() {
        super(R.layout.fragment_home);
        this.f22654A0 = C4924a.m10477o0(this, HomeFragment$binding$2.f22669j);
        this.f22655B0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
                C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
                return c1046m0Mo796n;
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.HomeFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i = this.m3576Y().mo470i();
                C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        C5207g.m11111f(C5209i.m11118a(C8812d.class), "navArgsClass");
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9765n0(AbstractC5751g abstractC5751g, HomeFragment homeFragment, AbstractC5751g abstractC5751g2) {
        C5207g.m11111f(abstractC5751g, "$taskToken");
        C5207g.m11111f(homeFragment, "this$0");
        C5207g.m11111f(abstractC5751g2, "taskId");
        String str = (String) abstractC5751g.mo12107i();
        String str2 = (String) abstractC5751g2.mo12107i();
        String str3 = Build.MODEL;
        if (homeFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
            HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
            C7828f.m15570d(C8573r0.m16767w0(homeViewModelM9770s0), homeViewModelM9770s0.f22733I, null, new HomeViewModel$registerFirebase$1(homeViewModelM9770s0, str, str2, str3, null), 2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o0 */
    public static void m9766o0(HomeFragment homeFragment, DialogInterface dialogInterface, int i10) {
        UserDictionaryLocale userDictionaryLocale;
        Object next;
        String strM10439R;
        ArrayAdapter<String> arrayAdapter;
        C5207g.m11111f(homeFragment, "this$0");
        List list = (List) homeFragment.m9770s0().f22742R.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strM10439R = C4924a.m10439R(homeFragment.m3578a0(), ((UserDictionaryLocale) next).f21721a);
                arrayAdapter = homeFragment.f22657D0;
                if (arrayAdapter == null) {
                    C5207g.m11117l("localesAdapter");
                    throw null;
                }
            } while (!C5207g.m11106a(strM10439R, arrayAdapter.getItem(i10)));
            userDictionaryLocale = (UserDictionaryLocale) next;
        } else {
            userDictionaryLocale = null;
        }
        if (userDictionaryLocale != null) {
            HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
            String str = userDictionaryLocale.f21721a;
            C5207g.m11111f(str, "locale");
            C7828f.m15570d(C8573r0.m16767w0(homeViewModelM9770s0), homeViewModelM9770s0.f22733I, null, new HomeViewModel$updateActiveLocale$1(homeViewModelM9770s0, str, null), 2);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m9767p0(HomeFragment homeFragment, int i10, Integer num) {
        if (homeFragment.m9769r0().f45267a.getSelectedItemId() != i10) {
            homeFragment.m9769r0().f45267a.setSelectedItemId(i10);
        }
        num.intValue();
        NavDestination navDestinationM3986g = C8573r0.m16725g0(homeFragment).m3986g();
        if (C5207g.m11106a(navDestinationM3986g != null ? Integer.valueOf(navDestinationM3986g.f6834h) : null, num)) {
            return;
        }
        C1688m c1688m = homeFragment.f22656C0;
        if (c1688m != null) {
            c1688m.m3996q(num.intValue(), false);
        } else {
            C5207g.m11117l("navController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        m9770s0().mo9731b0(true);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        FirebaseMessaging firebaseMessaging;
        String str;
        String str2;
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(14, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 200L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 200L;
        c8228i2.f48294d = new C8953b();
        m3587g0(c8228i2);
        C8228i c8228i3 = new C8228i(1, true);
        c8228i3.f48293c = 200L;
        c8228i3.f48294d = new C8953b();
        m3589h0(c8228i3);
        C0987y.m3825g(this, "lessonImportedFromWeb", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.home.HomeFragment$onViewCreated$5

            /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$5$1 */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$5$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
            final class C34651 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ HomeFragment f22681e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f22682f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34651(HomeFragment homeFragment, int i10, InterfaceC9968c<? super C34651> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22681e = homeFragment;
                    this.f22682f = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C34651(this.f22681e, this.f22682f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C34651) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                    this.f22681e.m9770s0().m9776l2(this.f22682f, 0, "", LessonPath.Unknown.f22167a);
                    return C9072e.f47360a;
                }
            }

            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str3, Bundle bundle2) {
                Bundle bundle3 = bundle2;
                C5207g.m11111f(str3, "requestKey");
                C5207g.m11111f(bundle3, "bundle");
                int i10 = bundle3.getInt("lessonImportedId");
                if (i10 != 0) {
                    HomeFragment homeFragment = this.f22680b;
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplM14906H = C7499b.m14906H(homeFragment);
                    C7178b c7178b = C7832g0.f42930a;
                    C7828f.m15570d(lifecycleCoroutineScopeImplM14906H, C7162l.f40438a, null, new C34651(homeFragment, i10, null), 2);
                }
                return C9072e.f47360a;
            }
        });
        C0987y.m3825g(this, "lessonImported", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.home.HomeFragment$onViewCreated$6

            /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$6$1 */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$6$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
            final class C34661 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ HomeFragment f22684e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f22685f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Bundle f22686g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34661(HomeFragment homeFragment, int i10, Bundle bundle, InterfaceC9968c<? super C34661> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22684e = homeFragment;
                    this.f22685f = i10;
                    this.f22686g = bundle;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C34661(this.f22684e, this.f22685f, this.f22686g, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C34661) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                    HomeViewModel homeViewModelM9770s0 = this.f22684e.m9770s0();
                    LessonPath lessonPath = (LessonPath) this.f22686g.getParcelable("lessonPath");
                    if (lessonPath == null) {
                        lessonPath = LessonPath.Unknown.f22167a;
                    }
                    homeViewModelM9770s0.m9776l2(this.f22685f, 0, "", lessonPath);
                    return C9072e.f47360a;
                }
            }

            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str3, Bundle bundle2) {
                Bundle bundle3 = bundle2;
                C5207g.m11111f(str3, "requestKey");
                C5207g.m11111f(bundle3, "bundle");
                int i10 = bundle3.getInt("lessonImportedId");
                if (i10 != 0) {
                    HomeFragment homeFragment = this.f22683b;
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplM14906H = C7499b.m14906H(homeFragment);
                    C7178b c7178b = C7832g0.f42930a;
                    C7828f.m15570d(lifecycleCoroutineScopeImplM14906H, C7162l.f40438a, null, new C34661(homeFragment, i10, bundle3, null), 2);
                }
                return C9072e.f47360a;
            }
        });
        if (m9768q0().m13299a().length() == 0) {
            m9768q0().m13303e("Control");
        }
        C8359t c8359tM9769r0 = m9769r0();
        Fragment fragmentM3615C = m3594l().m3615C(R.id.nav_host_fragment);
        C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f22656C0 = ((NavHostFragment) fragmentM3615C).m4035m0();
        BottomNavigationView bottomNavigationView = c8359tM9769r0.f45267a;
        C5207g.m11110e(bottomNavigationView, "bottomNavigationView");
        C1688m c1688m = this.f22656C0;
        if (c1688m == null) {
            C5207g.m11117l("navController");
            throw null;
        }
        bottomNavigationView.setOnItemSelectedListener(new C9369l(2, c1688m));
        c1688m.m3982b(new C5467a(new WeakReference(bottomNavigationView), c1688m));
        c8359tM9769r0.f45267a.setOnItemReselectedListener(new C9371n(13, this));
        C3260w c3260w = FirebaseMessaging.f16304m;
        synchronized (FirebaseMessaging.class) {
            try {
                firebaseMessaging = FirebaseMessaging.getInstance(C0065e.m434b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        firebaseMessaging.m9230c().mo12100b(new C9369l(19, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3464xa4f401f2(this, Lifecycle.State.STARTED, null, this), 3);
        C6704a c6704aM9768q0 = m9768q0();
        AbstractC4949k abstractC4949kM10563a = c6704aM9768q0.f37890a.m10563a(ImportData.class);
        String string = c6704aM9768q0.f37891b.getString("importData_4", "{}");
        ImportData importData = (ImportData) abstractC4949kM10563a.m10532b(string != null ? string : "{}");
        if (importData != null && (str = importData.f26551a) != null && (str2 = importData.f26552b) != null && importData.f26553c != null) {
            C6704a c6704aM9768q1 = m9768q0();
            c6704aM9768q1.f37891b.edit().putString("importData_4", c6704aM9768q1.f37890a.m10563a(ImportData.class).m10535e(null)).apply();
            NavController navControllerM16725g0 = C8573r0.m16725g0(this);
            NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
            if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToImport) != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", str2);
                bundle2.putString("title", str);
                navControllerM16725g0.m3992m(R.id.actionToImport, bundle2, null);
            }
        }
        if (m9768q0().f37891b.getInt("currentTrack", 0) != 0) {
            m9768q0().m13307i(0);
            m9768q0().m13309k(0);
            m9768q0().m13304f(0);
            m9768q0().m13305g("");
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3460a());
        }
        if (m9768q0().f37891b.getInt("lessonTrack", 0) != 0) {
            int i10 = m9768q0().f37891b.getInt("lessonTrack", 0);
            m9768q0().m13309k(0);
            m9768q0().m13307i(0);
            m9768q0().m13304f(0);
            m9768q0().m13305g("");
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3461b(i10));
        }
        if (m9768q0().f37891b.getInt("currentCourse", 0) != 0) {
            int i11 = m9768q0().f37891b.getInt("currentCourse", 0);
            String string2 = m9768q0().f37891b.getString("currentCourseTitle", "");
            if (string2 == null) {
                string2 = "";
            }
            m9768q0().m13309k(0);
            m9768q0().m13307i(0);
            m9768q0().m13304f(0);
            m9768q0().m13305g("");
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3462c(i11, string2, this));
        }
        String str3 = "";
        String string3 = m9768q0().f37891b.getString("deeplinkURL", str3);
        if (string3 != null) {
            str3 = string3;
        }
        if (!C7661i.m15250P2(str3)) {
            HomeViewModel homeViewModelM9770s0 = m9770s0();
            String str4 = "";
            String string4 = m9768q0().f37891b.getString("deeplinkURL", str4);
            if (string4 != null) {
                str4 = string4;
            }
            homeViewModelM9770s0.mo9317Z(str4, 400L);
            m9768q0().m13308j("");
        }
        CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(m3578a0(), null);
        if (cleverTapAPIM6420g != null) {
            if (!cleverTapAPIM6420g.f10981b.f43471a.f10999e) {
                C2181a c2181aM6429f = cleverTapAPIM6420g.m6429f();
                String strM6428e = cleverTapAPIM6420g.m6428e();
                c2181aM6429f.getClass();
                C2181a.m6452d(strM6428e, "Resuming InApp Notifications...");
                cleverTapAPIM6420g.f10981b.f43478h.m6509k();
                return;
            }
            C2181a c2181aM6429f2 = cleverTapAPIM6420g.m6429f();
            String strM6428e2 = cleverTapAPIM6420g.m6428e();
            c2181aM6429f2.getClass();
            C2181a.m6452d(strM6428e2, "CleverTap instance is set for Analytics only! Cannot resume InApp Notifications.");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final C6704a m9768q0() {
        C6704a c6704a = this.f22662I0;
        if (c6704a != null) {
            return c6704a;
        }
        C5207g.m11117l("appSettings");
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public final C8359t m9769r0() {
        return (C8359t) this.f22654A0.m10489a(this, f22653M0[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final HomeViewModel m9770s0() {
        return (HomeViewModel) this.f22655B0.getValue();
    }
}
