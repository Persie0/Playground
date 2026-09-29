package com.lingq.p055ui.home.menu;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
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
import kotlin.text.C7076b;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6716m;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p537zi.AbstractC10497g;
import ph.C8256b0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/menu/InviteFriendsFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class InviteFriendsFragment extends AbstractC10497g {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25038T0 = {C0204c.m857q(InviteFriendsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentInviteFriendsBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f25039Q0 = C4924a.m10477o0(this, InviteFriendsFragment$binding$2.f25042j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f25040R0;

    /* JADX INFO: renamed from: S0 */
    public ClipboardManager f25041S0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$1] */
    public InviteFriendsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$2
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
        this.f25040R0 = C8573r0.m16711Z(this, C5209i.m11118a(InviteFriendsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.menu.InviteFriendsFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: u0 */
    public static void m9958u0(InviteFriendsFragment inviteFriendsFragment) {
        C5207g.m11111f(inviteFriendsFragment, "this$0");
        InviteFriendsViewModel inviteFriendsViewModelM9961x0 = inviteFriendsFragment.m9961x0();
        C7828f.m15570d(C8573r0.m16767w0(inviteFriendsViewModelM9961x0), null, null, new InviteFriendsViewModel$copyLink$1(inviteFriendsViewModelM9961x0, null), 3);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m9959v0(InviteFriendsFragment inviteFriendsFragment) {
        C5207g.m11111f(inviteFriendsFragment, "this$0");
        InviteFriendsViewModel inviteFriendsViewModelM9961x0 = inviteFriendsFragment.m9961x0();
        C7828f.m15570d(C8573r0.m16767w0(inviteFriendsViewModelM9961x0), null, null, new InviteFriendsViewModel$inviteFriends$1(inviteFriendsViewModelM9961x0, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_invite_friends, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels - 160);
            LinearLayout linearLayout = m9960w0().f44598a;
            C5207g.m11110e(linearLayout, "binding.root");
            C4924a.m10444W(linearLayout, displayMetrics.heightPixels - 160);
        }
        Object systemService = m3576Y().getSystemService("clipboard");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f25041S0 = (ClipboardManager) systemService;
        C8256b0 c8256b0M9960w0 = m9960w0();
        c8256b0M9960w0.f44600c.setOnClickListener(new ViewOnClickListenerC7718c(14, this));
        c8256b0M9960w0.f44599b.setOnClickListener(new ViewOnClickListenerC5062d0(9, this));
        c8256b0M9960w0.f44601d.setOnClickListener(new ViewOnClickListenerC2238x(7, this));
        String strM3600t = m3600t(R.string.invite_friends_description);
        C5207g.m11110e(strM3600t, "getString(R.string.invite_friends_description)");
        List<Integer> list = C6716m.f37937a;
        String strM15254T2 = C7661i.m15254T2(strM3600t, "**", "");
        String strM14302v3 = C7076b.m14302v3(strM3600t, "**", strM3600t);
        String strM14302v4 = C7076b.m14302v3(strM14302v3, "**", strM14302v3);
        c8256b0M9960w0.f44607j.setText(C6716m.m13322g(strM15254T2, C7076b.m14306z3(C7076b.m14302v3(strM3600t, "**", strM3600t), "**"), C7076b.m14306z3(C7076b.m14302v3(strM14302v4, "**", strM14302v4), "**")));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3814x2ffb72df(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: w0 */
    public final C8256b0 m9960w0() {
        return (C8256b0) this.f25039Q0.m10489a(this, f25038T0[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public final InviteFriendsViewModel m9961x0() {
        return (InviteFriendsViewModel) this.f25040R0.getValue();
    }
}
