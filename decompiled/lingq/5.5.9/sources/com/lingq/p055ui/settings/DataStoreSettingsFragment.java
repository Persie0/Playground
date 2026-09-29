package com.lingq.p055ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import ck.AbstractC2033b;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.player.PlayerController;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ni.C7797e;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p133g7.C5708a;
import p216k7.C6627b;
import p225kk.C6714k;
import p225kk.C6716m;
import p259m7.C7493a;
import p260m8.C7499b;
import p273n7.RunnableC7714b;
import p278nh.InterfaceC7788o;
import p301oh.C8049h;
import p322pd.C8228i;
import p338qd.C8573r0;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import p427v3.AbstractC9634a;
import ph.C8327n;
import sl.InterfaceC9070c;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/settings/DataStoreSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DataStoreSettingsFragment extends AbstractC2033b {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30933F0 = {C0204c.m857q(DataStoreSettingsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDataSettingsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f30934A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f30935B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f30936C0;

    /* JADX INFO: renamed from: D0 */
    public C4079a f30937D0;

    /* JADX INFO: renamed from: E0 */
    public C7797e f30938E0;

    /* JADX INFO: renamed from: com.lingq.ui.settings.DataStoreSettingsFragment$a */
    public static final class C4764a implements InterfaceC7788o {
        public C4764a() {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i10, int i11) {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: b */
        public final void mo9848b(int i10, Object obj) {
            int iOrdinal = ViewKeys.DownloadOn3G.ordinal();
            DataStoreSettingsFragment dataStoreSettingsFragment = DataStoreSettingsFragment.this;
            if (i10 == iOrdinal) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DataStoreSettingsFragment.f30933F0;
                DataStoreSettingsViewModel dataStoreSettingsViewModelM10349n0 = dataStoreSettingsFragment.m10349n0();
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreSettingsViewModelM10349n0), dataStoreSettingsViewModelM10349n0.f30974e, null, new DataStoreSettingsViewModel$updateDownloadOnMobile$1(dataStoreSettingsViewModelM10349n0, zBooleanValue, null), 2);
                return;
            }
            if (i10 == ViewKeys.LanguageFeedLevels.ordinal()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = DataStoreSettingsFragment.f30933F0;
                DataStoreSettingsViewModel dataStoreSettingsViewModelM10349n1 = dataStoreSettingsFragment.m10349n0();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreSettingsViewModelM10349n1), dataStoreSettingsViewModelM10349n1.f30974e, null, new DataStoreSettingsViewModel$updateFeedLevels$1(obj, dataStoreSettingsViewModelM10349n1, null), 2);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: c */
        public final void mo9849c(String str, int i10) {
            C5207g.m11111f(str, "value");
            int iOrdinal = ViewKeys.LessonSettings.ordinal();
            DataStoreSettingsFragment dataStoreSettingsFragment = DataStoreSettingsFragment.this;
            if (i10 == iOrdinal) {
                NavController navControllerM16725g0 = C8573r0.m16725g0(dataStoreSettingsFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToLessonSettings) == null) {
                    return;
                }
                navControllerM16725g0.m3992m(R.id.actionToLessonSettings, bundle, null);
                return;
            }
            if ((i10 == ViewKeys.ActivitiesSettings.ordinal() || i10 == ViewKeys.FlashCardsSettings.ordinal()) || i10 == ViewKeys.ReversFlashCardsSettings.ordinal()) {
                NavController navControllerM16725g1 = C8573r0.m16725g0(dataStoreSettingsFragment);
                NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g2 == null || navDestinationM3986g2.m4016i(R.id.actionToReviewSettings) == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("viewKey", i10);
                navControllerM16725g1.m3992m(R.id.actionToReviewSettings, bundle2, null);
                return;
            }
            if (i10 == ViewKeys.DailyLingQ.ordinal()) {
                NavController navControllerM16725g2 = C8573r0.m16725g0(dataStoreSettingsFragment);
                Bundle bundle3 = new Bundle();
                NavDestination navDestinationM3986g3 = navControllerM16725g2.m3986g();
                if (navDestinationM3986g3 == null || navDestinationM3986g3.m4016i(R.id.actionToNotificationsSettings) == null) {
                    return;
                }
                navControllerM16725g2.m3992m(R.id.actionToNotificationsSettings, bundle3, null);
                return;
            }
            if (((i10 == ViewKeys.DailyGoal.ordinal() || i10 == ViewKeys.InterfaceLanguage.ordinal()) || i10 == ViewKeys.Theme.ordinal()) || i10 == ViewKeys.Topics.ordinal()) {
                NavController navControllerM16725g3 = C8573r0.m16725g0(dataStoreSettingsFragment);
                NavDestination navDestinationM3986g4 = navControllerM16725g3.m3986g();
                if (navDestinationM3986g4 == null || navDestinationM3986g4.m4016i(R.id.actionToSelection) == null) {
                    return;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("isSingleSelection", true);
                bundle4.putInt("viewKey", i10);
                navControllerM16725g3.m3992m(R.id.actionToSelection, bundle4, null);
                return;
            }
            if (i10 != ViewKeys.ClearCache.ordinal()) {
                if (i10 == ViewKeys.RestartTutorial.ordinal()) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = DataStoreSettingsFragment.f30933F0;
                    DataStoreSettingsViewModel dataStoreSettingsViewModelM10349n0 = dataStoreSettingsFragment.m10349n0();
                    C7828f.m15570d(C8573r0.m16767w0(dataStoreSettingsViewModelM10349n0), null, null, new DataStoreSettingsViewModel$resetTutorialAndMoveToLibrary$1(dataStoreSettingsViewModelM10349n0, null), 3);
                    return;
                }
                if (i10 == ViewKeys.UserLogOut.ordinal()) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = DataStoreSettingsFragment.f30933F0;
                    C9249b c9249b = new C9249b(dataStoreSettingsFragment.m3576Y());
                    c9249b.setTitle(dataStoreSettingsFragment.m3600t(R.string.ui_log_out));
                    c9249b.f599a.f579f = dataStoreSettingsFragment.m3600t(R.string.welcome_are_you_sure);
                    c9249b.m17610c(dataStoreSettingsFragment.m3600t(R.string.ui_cancel), null);
                    c9249b.m17612e(dataStoreSettingsFragment.m3600t(R.string.ui_yes), new DialogInterfaceOnClickListenerC8634f(4, dataStoreSettingsFragment));
                    c9249b.m876a();
                    return;
                }
                if (i10 == ViewKeys.EmailSupport.ordinal()) {
                    C7797e c7797e = dataStoreSettingsFragment.f30938E0;
                    if (c7797e != null) {
                        c7797e.m15508a(dataStoreSettingsFragment.m3576Y());
                        return;
                    } else {
                        C5207g.m11117l("utils");
                        throw null;
                    }
                }
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr3 = DataStoreSettingsFragment.f30933F0;
            DataStoreSettingsViewModel dataStoreSettingsViewModelM10349n1 = dataStoreSettingsFragment.m10349n0();
            Context contextM3578a0 = dataStoreSettingsFragment.m3578a0();
            C6627b c6627bM13257b = C6627b.m13257b();
            Iterator it = c6627bM13257b.f37573a.entrySet().iterator();
            while (it.hasNext()) {
                c6627bM13257b.m13258a((C7493a) ((Map.Entry) it.next()).getValue());
            }
            C5708a.m12072a().f34717a.f34720b.execute(new RunnableC7714b(0));
            dataStoreSettingsViewModelM10349n1.f30980k.mo10653c();
            PlayerController playerController = dataStoreSettingsViewModelM10349n1.f30976g;
            playerController.pause();
            playerController.m9415p0(false);
            ArrayList arrayListM13315a = C6714k.m13315a(new File(C0166e.m765k(contextM3578a0.getFilesDir().toString(), "/tracks/")));
            if (arrayListM13315a != null) {
                Iterator it2 = arrayListM13315a.iterator();
                loop1: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop1;
                        }
                        File file = (File) it2.next();
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
                dataStoreSettingsViewModelM10349n1.m10351m2(contextM3578a0);
                dataStoreSettingsViewModelM10349n1.m10350l2();
            }
            C7828f.m15570d(C8573r0.m16767w0(dataStoreSettingsViewModelM10349n1), dataStoreSettingsViewModelM10349n1.f30974e, null, new DataStoreSettingsViewModel$clearDownloadsTable$1(dataStoreSettingsViewModelM10349n1, null), 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$1] */
    public DataStoreSettingsFragment() {
        super(R.layout.fragment_data_settings);
        this.f30934A0 = C4924a.m10477o0(this, DataStoreSettingsFragment$binding$2.f30940j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$2
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
        this.f30935B0 = C8573r0.m16711Z(this, C5209i.m11118a(DataStoreSettingsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$viewModels$default$5
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
        this.f30936C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.settings.DataStoreSettingsFragment$special$$inlined$activityViewModels$default$3
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 400L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(0, false);
        c8228i.f48293c = 400L;
        m3591j0(c8228i);
        C8327n c8327n = (C8327n) this.f30934A0.m10489a(this, f30933F0[0]);
        c8327n.f45043b.setTitle(m3600t(R.string.settings_text_settings));
        MaterialToolbar materialToolbar = c8327n.f45043b;
        materialToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.colorOnSurface, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC5062d0(21, this));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8327n.f45042a;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(5)));
        C4079a c4079a = new C4079a(m3578a0(), new C4764a());
        this.f30937D0 = c4079a;
        recyclerView.setAdapter(c4079a);
        m10349n0().m10351m2(m3578a0());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4765xa00ecfad(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final DataStoreSettingsViewModel m10349n0() {
        return (DataStoreSettingsViewModel) this.f30935B0.getValue();
    }
}
