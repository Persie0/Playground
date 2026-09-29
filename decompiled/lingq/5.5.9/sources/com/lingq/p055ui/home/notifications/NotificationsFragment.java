package com.lingq.p055ui.home.notifications;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import no.C7828f;
import p003a2.C0009a;
import p014aj.AbstractC0087d;
import p014aj.C0091h;
import p203ji.C6479a;
import p225kk.AbstractC6707d;
import p225kk.C6706c;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p290o6.C7946b;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p385sf.C9000b;
import p402u0.C9370m;
import p427v3.AbstractC9634a;
import ph.C8370v0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/notifications/NotificationsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationsFragment extends AbstractC0087d {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25285F0 = {C0204c.m857q(NotificationsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentNotificationsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f25286A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f25287B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f25288C0;

    /* JADX INFO: renamed from: D0 */
    public C0091h f25289D0;

    /* JADX INFO: renamed from: E0 */
    public LinearLayoutManager f25290E0;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsFragment$a */
    public static final class C3862a implements InterfaceC7774a<C6479a> {
        public C3862a() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C6479a c6479a) {
            C6479a c6479a2 = c6479a;
            C5207g.m11111f(c6479a2, "notification");
            boolean z10 = c6479a2.f37058g;
            NotificationsFragment notificationsFragment = NotificationsFragment.this;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsFragment.f25285F0;
                notificationsFragment.m9969p0().m9971m2(C9000b.m17251q(Integer.valueOf(c6479a2.f37052a)), false);
            }
            String str = c6479a2.f37056e;
            if (str != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = NotificationsFragment.f25285F0;
                AbstractC6707d abstractC6707dM13314b = new C6706c(str, notificationsFragment.m9969p0().mo498E1(), true).m13314b();
                if (!(abstractC6707dM13314b instanceof AbstractC6707d.m)) {
                    notificationsFragment.m9969p0().f25369k.mo14371k(str);
                    return;
                }
                AbstractC6707d.m mVar = (AbstractC6707d.m) abstractC6707dM13314b;
                if (mVar.f37920a == null) {
                    notificationsFragment.m9969p0().f25369k.mo14371k(str);
                    return;
                }
                HomeViewModel homeViewModel = (HomeViewModel) notificationsFragment.f25288C0.getValue();
                homeViewModel.f22743S.mo16479j(new HomeViewModel.AbstractC3479a.h(true, true, mVar.f37920a, EmptyList.f38032a, mVar.f37921b));
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsFragment$b */
    public static final class C3863b extends RecyclerView.AbstractC1125r {
        public C3863b() {
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: b */
        public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
            C5207g.m11111f(recyclerView, "recyclerView");
            NotificationsFragment notificationsFragment = NotificationsFragment.this;
            LinearLayoutManager linearLayoutManager = notificationsFragment.f25290E0;
            if (linearLayoutManager == null) {
                C5207g.m11117l("linearLayoutManager");
                throw null;
            }
            int iM4286J = -1;
            View viewM4124U0 = linearLayoutManager.m4124U0(linearLayoutManager.m4326y() - 1, -1, true, false);
            if (viewM4124U0 != null) {
                iM4286J = RecyclerView.AbstractC1120m.m4286J(viewM4124U0);
            }
            C0091h c0091h = notificationsFragment.f25289D0;
            if (c0091h == null) {
                C5207g.m11117l("notificationsAdapter");
                throw null;
            }
            if (iM4286J == c0091h.mo4226e() - 5) {
                NotificationsViewModel notificationsViewModelM9969p0 = notificationsFragment.m9969p0();
                if (!((Boolean) notificationsViewModelM9969p0.f25354H.getValue()).booleanValue()) {
                    notificationsViewModelM9969p0.f25359M.mo14371k(C9072e.f47360a);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$1] */
    public NotificationsFragment() {
        super(R.layout.fragment_notifications);
        this.f25286A0 = C4924a.m10477o0(this, NotificationsFragment$binding$2.f25293j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f25287B0 = C8573r0.m16711Z(this, C5209i.m11118a(NotificationsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f25288C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.notifications.NotificationsFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9967n0(NotificationsFragment notificationsFragment, C8370v0 c8370v0) {
        C5207g.m11111f(notificationsFragment, "this$0");
        C5207g.m11111f(c8370v0, "$this_with");
        notificationsFragment.m9969p0().m9970l2();
        C7828f.m15570d(C7499b.m14906H(notificationsFragment), null, null, new NotificationsFragment$onViewCreated$3$3$1(c8370v0, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 400L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3587g0(c8228i);
        C8370v0 c8370v0M9968o0 = m9968o0();
        c8370v0M9968o0.f45351d.setTitle(m3600t(R.string.lingq_notifications));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8370v0M9968o0.f45351d;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2239y(17, this));
        materialToolbar.mo1059k(R.menu.menu_notifications);
        materialToolbar.setOnMenuItemClickListener(new C9370m(13, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8370v0M9968o0.f45350c;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C7946b(this, 15, c8370v0M9968o0));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.f25290E0 = linearLayoutManager;
        RecyclerView recyclerView = c8370v0M9968o0.f45348a;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(m3578a0(), R.drawable.dr_item_divider), 0));
        C0091h c0091h = new C0091h(new C3862a());
        this.f25289D0 = c0091h;
        recyclerView.setAdapter(c0091h);
        recyclerView.m4203i(new C3863b());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3864xb9792e7b(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8370v0 m9968o0() {
        return (C8370v0) this.f25286A0.m10489a(this, f25285F0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final NotificationsViewModel m9969p0() {
        return (NotificationsViewModel) this.f25287B0.getValue();
    }
}
