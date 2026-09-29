package com.lingq.p055ui.home.challenges;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p225kk.C6716m;
import p274n8.ViewOnClickListenerC7718c;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8285g;
import si.AbstractC9041y;
import si.C9036t;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengesMonthlyPromptFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengesMonthlyPromptFragment extends AbstractC9041y {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23080T0 = {C0204c.m857q(ChallengesMonthlyPromptFragment.class, "getBinding()Lcom/lingq/databinding/FragmentChallengesMonthlyPromptBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f23081Q0 = C4924a.m10477o0(this, ChallengesMonthlyPromptFragment$binding$2.f23084j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f23082R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f23083S0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$1] */
    public ChallengesMonthlyPromptFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$2
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
        this.f23082R0 = C8573r0.m16711Z(this, C5209i.m11118a(ChallengeMonthlyPromptViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$viewModels$default$5
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
        this.f23083S0 = new C1681f(C5209i.m11118a(C9036t.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.challenges.ChallengesMonthlyPromptFragment$special$$inlined$navArgs$1
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_challenges_monthly_prompt, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) throws ParseException {
        String str;
        C5207g.m11111f(view, "view");
        ChallengeMonthlyPromptViewModel challengeMonthlyPromptViewModel = (ChallengeMonthlyPromptViewModel) this.f23082R0.getValue();
        C7828f.m15570d(C8573r0.m16767w0(challengeMonthlyPromptViewModel), challengeMonthlyPromptViewModel.f22982e, null, new ChallengeMonthlyPromptViewModel$hideNotice$1(challengeMonthlyPromptViewModel, null), 2);
        C8285g c8285g = (C8285g) this.f23081Q0.m10489a(this, f23080T0[0]);
        c8285g.f44772a.setOnClickListener(new ViewOnClickListenerC7718c(9, this));
        Object[] objArr = new Object[1];
        C1681f c1681f = this.f23083S0;
        String str2 = ((C9036t) c1681f.getValue()).f47275a.f22074c;
        C5207g.m11111f(str2, "date");
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).parse(str2);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        try {
            str = new SimpleDateFormat("MMMM", Locale.getDefault()).format(calendar.getTime());
            C5207g.m11110e(str, "{\n        SimpleDateForm…rmat(calendar.time)\n    }");
        } catch (Exception unused) {
            str = "";
        }
        objArr[0] = str;
        c8285g.f44776e.setText(m3599s().getString(R.string.notice_challenges_open, objArr));
        ImageView imageView = c8285g.f44773b;
        C5207g.m11110e(imageView, "ivChallengeImage1");
        String str3 = ((C9036t) c1681f.getValue()).f47276b[0];
        List<Integer> list = C6716m.f37937a;
        C4924a.m10438Q(imageView, str3, C6716m.m13316a(1), C6716m.m13333r(R.attr.backgroundSectionColor, m3578a0()), 0, 8);
        ImageView imageView2 = c8285g.f44774c;
        C5207g.m11110e(imageView2, "ivChallengeImage2");
        C4924a.m10438Q(imageView2, ((C9036t) c1681f.getValue()).f47276b[1], C6716m.m13316a(1), C6716m.m13333r(R.attr.backgroundSectionColor, m3578a0()), 0, 8);
        ImageView imageView3 = c8285g.f44775d;
        C5207g.m11110e(imageView3, "ivChallengeImage3");
        C4924a.m10438Q(imageView3, ((C9036t) c1681f.getValue()).f47276b[2], C6716m.m13316a(1), C6716m.m13333r(R.attr.backgroundSectionColor, m3578a0()), 0, 8);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
