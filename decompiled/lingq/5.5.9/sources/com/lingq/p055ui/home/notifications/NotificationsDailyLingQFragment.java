package com.lingq.p055ui.home.notifications;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.C0204c;
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
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingQFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p014aj.AbstractC0085b;
import p014aj.C0093j;
import p040c4.C1681f;
import p260m8.C7499b;
import p337qc.C8518a;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8375w0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/notifications/NotificationsDailyLingQFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationsDailyLingQFragment extends AbstractC0085b {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25179T0 = {C0204c.m857q(NotificationsDailyLingQFragment.class, "getBinding()Lcom/lingq/databinding/FragmentNotificationsDailyLingqBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f25180Q0 = C4924a.m10477o0(this, NotificationsDailyLingQFragment$binding$2.f25183j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f25181R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f25182S0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$1] */
    public NotificationsDailyLingQFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$2
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
        this.f25181R0 = C8573r0.m16711Z(this, C5209i.m11118a(NotificationsDailyLingQViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$viewModels$default$5
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
        this.f25182S0 = new C1681f(C5209i.m11118a(C0093j.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.notifications.NotificationsDailyLingQFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m9964u0(NotificationsDailyLingQFragment notificationsDailyLingQFragment, boolean z10) {
        C5207g.m11111f(notificationsDailyLingQFragment, "this$0");
        NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = notificationsDailyLingQFragment.m9966w0();
        Boolean boolValueOf = Boolean.valueOf(z10);
        StateFlowImpl stateFlowImpl = notificationsDailyLingQViewModelM9966w0.f25216j;
        if (C5207g.m11106a(boolValueOf, stateFlowImpl.getValue())) {
            return;
        }
        stateFlowImpl.setValue(Boolean.valueOf(z10));
        C7828f.m15570d(C8573r0.m16767w0(notificationsDailyLingQViewModelM9966w0), notificationsDailyLingQViewModelM9966w0.f25211e, null, new NotificationsDailyLingQViewModel$updateEmailNotification$1(notificationsDailyLingQViewModelM9966w0, z10, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_notifications_daily_lingq, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C8375w0 c8375w0M9965v0 = m9965v0();
        c8375w0M9965v0.f45431d.setText(((C0093j) this.f25182S0.getValue()).f249b);
        c8375w0M9965v0.f45432e.setOnClickListener(new View.OnClickListener() { // from class: aj.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
                NotificationsDailyLingQFragment notificationsDailyLingQFragment = this.f247a;
                C5207g.m11111f(notificationsDailyLingQFragment, "this$0");
                String str = ((C0093j) notificationsDailyLingQFragment.f25182S0.getValue()).f248a;
                C5207g.m11111f(str, "code");
                NavController navControllerM16725g0 = C8573r0.m16725g0(notificationsDailyLingQFragment);
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToSelection) == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("code", str);
                navControllerM16725g0.m3992m(R.id.actionToSelection, bundle2, null);
            }
        });
        c8375w0M9965v0.f45428a.setOnCheckedChangeListener(new C8518a(1, this));
        c8375w0M9965v0.f45429b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lingq.ui.home.notifications.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = NotificationsDailyLingQFragment.f25179T0;
                NotificationsDailyLingQFragment notificationsDailyLingQFragment = this.f25391a;
                C5207g.m11111f(notificationsDailyLingQFragment, "this$0");
                NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = notificationsDailyLingQFragment.m9966w0();
                Boolean boolValueOf = Boolean.valueOf(z10);
                StateFlowImpl stateFlowImpl = notificationsDailyLingQViewModelM9966w0.f25218l;
                if (!C5207g.m11106a(boolValueOf, stateFlowImpl.getValue())) {
                    stateFlowImpl.setValue(Boolean.valueOf(z10));
                    C7828f.m15570d(C8573r0.m16767w0(notificationsDailyLingQViewModelM9966w0), notificationsDailyLingQViewModelM9966w0.f25211e, null, new NotificationsDailyLingQViewModel$updateSiteNotification$1(notificationsDailyLingQViewModelM9966w0, z10, null), 2);
                }
            }
        });
        NotificationsDailyLingQViewModel notificationsDailyLingQViewModelM9966w0 = m9966w0();
        C7828f.m15570d(C8573r0.m16767w0(notificationsDailyLingQViewModelM9966w0), notificationsDailyLingQViewModelM9966w0.f25211e, null, new NotificationsDailyLingQViewModel$getDailyLingqSettings$1(notificationsDailyLingQViewModelM9966w0, null), 2);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3836x7a91a69d(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: v0 */
    public final C8375w0 m9965v0() {
        return (C8375w0) this.f25180Q0.m10489a(this, f25179T0[0]);
    }

    /* JADX INFO: renamed from: w0 */
    public final NotificationsDailyLingQViewModel m9966w0() {
        return (NotificationsDailyLingQViewModel) this.f25181R0.getValue();
    }
}
