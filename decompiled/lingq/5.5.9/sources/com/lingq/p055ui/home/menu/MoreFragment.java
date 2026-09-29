package com.lingq.p055ui.home.menu;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.menu.MoreFragment;
import com.lingq.p055ui.home.menu.MoreViewModel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import dm.C5212l;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7138s;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p537zi.AbstractC10498h;
import ph.C8374w;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/menu/MoreFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MoreFragment extends AbstractC10498h {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25104E0 = {C0204c.m857q(MoreFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeMoreBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f25105A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f25106B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f25107C0;

    /* JADX INFO: renamed from: D0 */
    public C7796d f25108D0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$1] */
    public MoreFragment() {
        super(R.layout.fragment_home_more);
        this.f25105A0 = C4924a.m10477o0(this, MoreFragment$binding$2.f25109j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$2
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
        this.f25106B0 = C8573r0.m16711Z(this, C5209i.m11118a(MoreViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$viewModels$default$5
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
        this.f25107C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.menu.MoreFragment$special$$inlined$activityViewModels$default$3
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
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        MoreViewModel moreViewModelM9963o0 = m9963o0();
        C7828f.m15570d(C8573r0.m16767w0(moreViewModelM9963o0), null, null, new MoreViewModel$updateNotifications$1(moreViewModelM9963o0, null), 3);
        ((HomeViewModel) this.f25107C0.getValue()).mo9724L();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C7796d c7796d = this.f25108D0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "show_app_menu");
        C0987y.m3825g(this, "lessonImportedFromUser", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.home.menu.MoreFragment$onViewCreated$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str, Bundle bundle2) {
                Bundle bundle3 = bundle2;
                C5207g.m11111f(str, "<anonymous parameter 0>");
                C5207g.m11111f(bundle3, "bundle");
                int i10 = bundle3.getInt("lessonImportedId");
                if (i10 != 0) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                    ((HomeViewModel) this.f25116b.f25107C0.getValue()).m9776l2(i10, 0, "", LessonPath.Unknown.f22167a);
                }
                return C9072e.f47360a;
            }
        });
        C8374w c8374wM9962n0 = m9962n0();
        MaterialCardView materialCardView = (MaterialCardView) c8374wM9962n0.f45427k.f44618c;
        C5207g.m11110e(materialCardView, "viewUpgradeBanner.root");
        C4924a.m10442U(materialCardView);
        final int i10 = 0;
        ((MaterialCardView) c8374wM9962n0.f45427k.f44618c).setOnClickListener(new View.OnClickListener(this) { // from class: zi.j

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52445b;

            {
                this.f52445b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                MoreFragment moreFragment = this.f52445b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        ((HomeViewModel) moreFragment.f25107C0.getValue()).f22743S.mo16479j(new HomeViewModel.AbstractC3479a.i());
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToUserImport) != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("url", "");
                            bundle2.putString("title", "");
                            navControllerM16725g0.m3992m(R.id.actionToUserImport, bundle2, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + moreFragment.m3576Y().getPackageName()));
                        intent.addFlags(1208483840);
                        try {
                            moreFragment.m3595l0(intent);
                        } catch (ActivityNotFoundException unused) {
                            moreFragment.m3595l0(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + moreFragment.m3576Y().getPackageName())));
                        }
                        break;
                }
            }
        });
        c8374wM9962n0.f45417a.setOnClickListener(new View.OnClickListener(this) { // from class: zi.k

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52447b;

            {
                this.f52447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                MoreFragment moreFragment = this.f52447b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSettings) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToSettings, bundle2, null);
                        }
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g1 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle3 = new Bundle();
                        NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                        if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToInviteFriends) != null) {
                            navControllerM16725g1.m3992m(R.id.actionToInviteFriends, bundle3, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g2 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle4 = new Bundle();
                        NavDestination navDestinationM3986g3 = navControllerM16725g2.m3986g();
                        if (navDestinationM3986g3 != null && navDestinationM3986g3.m4016i(R.id.actionToHelp) != null) {
                            navControllerM16725g2.m3992m(R.id.actionToHelp, bundle4, null);
                        }
                        break;
                }
            }
        });
        c8374wM9962n0.f45419c.setOnClickListener(new View.OnClickListener(this) { // from class: zi.l

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52449b;

            {
                this.f52449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                String str2;
                int i11 = i10;
                MoreFragment moreFragment = this.f52449b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(moreFragment), C5212l.m11171o());
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        MoreViewModel moreViewModelM9963o0 = moreFragment.m9963o0();
                        C7138s c7138s = moreViewModelM9963o0.f25146f;
                        UserLanguage value = moreViewModelM9963o0.mo509w0().getValue();
                        if (value == null || (str = value.f21734i) == null) {
                            str = "en";
                        }
                        UserLanguage value2 = moreViewModelM9963o0.mo509w0().getValue();
                        if (value2 == null || (str2 = value2.f21735j) == null) {
                            str2 = "";
                        }
                        c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/grammar-resource/", str2, "/"));
                        break;
                }
            }
        });
        c8374wM9962n0.f45425i.setOnClickListener(new View.OnClickListener(this) { // from class: zi.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52451b;

            {
                this.f52451b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                MoreFragment moreFragment = this.f52451b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToNotifications) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToNotifications, bundle2, null);
                            break;
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        List<Integer> list = C6716m.f37937a;
                        C6716m.m13329n(moreFragment.m3578a0(), "https://www.lingq.com/en/forum/active-threads/", Integer.valueOf(R.string.lingq_forum), C8573r0.m16725g0(moreFragment));
                        break;
                }
            }
        });
        final int i11 = 1;
        c8374wM9962n0.f45423g.setOnClickListener(new View.OnClickListener(this) { // from class: zi.j

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52445b;

            {
                this.f52445b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                MoreFragment moreFragment = this.f52445b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        ((HomeViewModel) moreFragment.f25107C0.getValue()).f22743S.mo16479j(new HomeViewModel.AbstractC3479a.i());
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToUserImport) != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("url", "");
                            bundle2.putString("title", "");
                            navControllerM16725g0.m3992m(R.id.actionToUserImport, bundle2, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + moreFragment.m3576Y().getPackageName()));
                        intent.addFlags(1208483840);
                        try {
                            moreFragment.m3595l0(intent);
                        } catch (ActivityNotFoundException unused) {
                            moreFragment.m3595l0(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + moreFragment.m3576Y().getPackageName())));
                        }
                        break;
                }
            }
        });
        c8374wM9962n0.f45424h.setOnClickListener(new View.OnClickListener(this) { // from class: zi.k

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52447b;

            {
                this.f52447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                MoreFragment moreFragment = this.f52447b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSettings) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToSettings, bundle2, null);
                        }
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g1 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle3 = new Bundle();
                        NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                        if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToInviteFriends) != null) {
                            navControllerM16725g1.m3992m(R.id.actionToInviteFriends, bundle3, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g2 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle4 = new Bundle();
                        NavDestination navDestinationM3986g3 = navControllerM16725g2.m3986g();
                        if (navDestinationM3986g3 != null && navDestinationM3986g3.m4016i(R.id.actionToHelp) != null) {
                            navControllerM16725g2.m3992m(R.id.actionToHelp, bundle4, null);
                        }
                        break;
                }
            }
        });
        c8374wM9962n0.f45421e.setOnClickListener(new View.OnClickListener(this) { // from class: zi.l

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52449b;

            {
                this.f52449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                String str2;
                int i12 = i11;
                MoreFragment moreFragment = this.f52449b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(moreFragment), C5212l.m11171o());
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        MoreViewModel moreViewModelM9963o0 = moreFragment.m9963o0();
                        C7138s c7138s = moreViewModelM9963o0.f25146f;
                        UserLanguage value = moreViewModelM9963o0.mo509w0().getValue();
                        if (value == null || (str = value.f21734i) == null) {
                            str = "en";
                        }
                        UserLanguage value2 = moreViewModelM9963o0.mo509w0().getValue();
                        if (value2 == null || (str2 = value2.f21735j) == null) {
                            str2 = "";
                        }
                        c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/grammar-resource/", str2, "/"));
                        break;
                }
            }
        });
        c8374wM9962n0.f45420d.setOnClickListener(new View.OnClickListener(this) { // from class: zi.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52451b;

            {
                this.f52451b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                MoreFragment moreFragment = this.f52451b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToNotifications) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToNotifications, bundle2, null);
                            break;
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        List<Integer> list = C6716m.f37937a;
                        C6716m.m13329n(moreFragment.m3578a0(), "https://www.lingq.com/en/forum/active-threads/", Integer.valueOf(R.string.lingq_forum), C8573r0.m16725g0(moreFragment));
                        break;
                }
            }
        });
        final int i12 = 2;
        c8374wM9962n0.f45426j.setOnClickListener(new View.OnClickListener(this) { // from class: zi.j

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52445b;

            {
                this.f52445b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                MoreFragment moreFragment = this.f52445b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        ((HomeViewModel) moreFragment.f25107C0.getValue()).f22743S.mo16479j(new HomeViewModel.AbstractC3479a.i());
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToUserImport) != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("url", "");
                            bundle2.putString("title", "");
                            navControllerM16725g0.m3992m(R.id.actionToUserImport, bundle2, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + moreFragment.m3576Y().getPackageName()));
                        intent.addFlags(1208483840);
                        try {
                            moreFragment.m3595l0(intent);
                        } catch (ActivityNotFoundException unused) {
                            moreFragment.m3595l0(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + moreFragment.m3576Y().getPackageName())));
                        }
                        break;
                }
            }
        });
        c8374wM9962n0.f45422f.setOnClickListener(new View.OnClickListener(this) { // from class: zi.k

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MoreFragment f52447b;

            {
                this.f52447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                MoreFragment moreFragment = this.f52447b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g0 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSettings) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToSettings, bundle2, null);
                        }
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g1 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle3 = new Bundle();
                        NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                        if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToInviteFriends) != null) {
                            navControllerM16725g1.m3992m(R.id.actionToInviteFriends, bundle3, null);
                        }
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = MoreFragment.f25104E0;
                        C5207g.m11111f(moreFragment, "this$0");
                        NavController navControllerM16725g2 = C8573r0.m16725g0(moreFragment);
                        Bundle bundle4 = new Bundle();
                        NavDestination navDestinationM3986g3 = navControllerM16725g2.m3986g();
                        if (navDestinationM3986g3 != null && navDestinationM3986g3.m4016i(R.id.actionToHelp) != null) {
                            navControllerM16725g2.m3992m(R.id.actionToHelp, bundle4, null);
                        }
                        break;
                }
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3823x6c6e7ce8(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8374w m9962n0() {
        return (C8374w) this.f25105A0.m10489a(this, f25104E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final MoreViewModel m9963o0() {
        return (MoreViewModel) this.f25106B0.getValue();
    }
}
