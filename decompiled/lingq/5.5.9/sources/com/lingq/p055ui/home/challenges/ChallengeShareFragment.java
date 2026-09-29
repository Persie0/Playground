package com.lingq.p055ui.home.challenges;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.p055ui.home.challenges.ChallengeShareFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareViewModel;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettings;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettingsType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Arrays;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.C7138s;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.C7777d;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8267d;
import si.AbstractC9039w;
import si.C9026j;
import si.ViewOnClickListenerC9019c;
import si.ViewOnClickListenerC9024h;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeShareFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeShareFragment extends AbstractC9039w {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22987T0 = {C0204c.m857q(ChallengeShareFragment.class, "getBinding()Lcom/lingq/databinding/FragmentChallengeShareBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f22988Q0 = C4924a.m10477o0(this, ChallengeShareFragment$binding$2.f22991j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f22989R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f22990S0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$1] */
    public ChallengeShareFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$2
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
        this.f22989R0 = C8573r0.m16711Z(this, C5209i.m11118a(ChallengeShareViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$5
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
        this.f22990S0 = new C1681f(C5209i.m11118a(C9026j.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.challenges.ChallengeShareFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_challenge_share, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        if (C7777d.m15481b(this)) {
            Dialog dialog = this.f6328G0;
            View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
            if (viewFindViewById != null) {
                BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
                C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
                bottomSheetBehaviorM8602w.m8606D(3);
            }
        }
        C8267d c8267d = (C8267d) this.f22988Q0.m10489a(this, f22987T0[0]);
        TextView textView = c8267d.f44660f;
        String strM3600t = m3600t(R.string.challenges_share);
        C5207g.m11110e(strM3600t, "getString(R.string.challenges_share)");
        String str = String.format(strM3600t, Arrays.copyOf(new Object[]{((C9026j) this.f22990S0.getValue()).f47262b}, 1));
        C5207g.m11110e(str, "format(format, *args)");
        textView.setText(str);
        c8267d.f44657c.setOnClickListener(new ViewOnClickListenerC9019c(1, this));
        c8267d.f44659e.setOnClickListener(new ViewOnClickListenerC9024h(0, this));
        c8267d.f44658d.setOnClickListener(new ViewOnClickListenerC7718c(8, this));
        c8267d.f44656b.setOnClickListener(new View.OnClickListener() { // from class: si.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                ChallengeSocialSettingsType challengeSocialSettingsType;
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
                ChallengeShareFragment challengeShareFragment = this.f47260a;
                C5207g.m11111f(challengeShareFragment, "this$0");
                ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
                ChallengeDetail challengeDetail = (ChallengeDetail) challengeShareViewModelM9790u0.f23027J.getValue();
                if (challengeDetail != null) {
                    StringBuilder sbM855o = C0204c.m855o("https://www.lingq.com/", challengeShareViewModelM9790u0.mo507p1(), "/learn/", challengeShareViewModelM9790u0.mo498E1(), "/web/community/challenges/");
                    sbM855o.append(challengeDetail.f21634b);
                    String string = sbM855o.toString();
                    C7138s c7138s = challengeShareViewModelM9790u0.f23025H;
                    ChallengeSocialSettings challengeSocialSettings = challengeDetail.f21645m;
                    if (challengeSocialSettings == null || (challengeSocialSettingsType = challengeSocialSettings.f21654b) == null || (str2 = challengeSocialSettingsType.f21661a) == null) {
                        str2 = "";
                    }
                    c7138s.mo14371k(new Pair(string, str2));
                }
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3505x5ac4160f(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: u0 */
    public final ChallengeShareViewModel m9790u0() {
        return (ChallengeShareViewModel) this.f22989R0.getValue();
    }
}
