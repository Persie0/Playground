package com.lingq.p055ui.token;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.DisplayMetrics;
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
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fk.AbstractC5559a;
import fk.C5563e;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import p003a2.C0009a;
import p040c4.C1681f;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p427v3.AbstractC9634a;
import ph.C8376w1;
import sj.ViewOnClickListenerC9058q;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/token/TokenEditFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenEditFragment extends AbstractC5559a {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31188T0 = {C0204c.m857q(TokenEditFragment.class, "getBinding()Lcom/lingq/databinding/FragmentTokenEditBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f31189Q0 = C4924a.m10477o0(this, TokenEditFragment$binding$2.f31193j);

    /* JADX INFO: renamed from: R0 */
    public final C1681f f31190R0 = new C1681f(C5209i.m11118a(C5563e.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$navArgs$1
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

    /* JADX INFO: renamed from: S0 */
    public final C1038i0 f31191S0;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenEditFragment$a */
    public /* synthetic */ class C4786a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31192a;

        static {
            int[] iArr = new int[TokenEditType.values().length];
            try {
                iArr[TokenEditType.Note.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenEditType.NewMeaning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenEditType.SavedMeaning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31192a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$1] */
    public TokenEditFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$2
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
        this.f31191S0 = C8573r0.m16711Z(this, C5209i.m11118a(TokenEditViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.token.TokenEditFragment$special$$inlined$viewModels$default$5
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_token_edit, viewGroup, false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        int dimensionPixelSize = m3578a0().getResources().getDimensionPixelSize(R.dimen.view_should_fixed_tablet);
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -1;
            }
            layoutParams.width = dimensionPixelSize;
            viewFindViewById.setLayoutParams(layoutParams);
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels - 200);
            bottomSheetBehaviorM8602w.m8603A(true);
        }
        C8376w1 c8376w1 = (C8376w1) this.f31189Q0.m10489a(this, f31188T0[0]);
        c8376w1.f45433a.setOnClickListener(new ViewOnClickListenerC9058q(3, this));
        c8376w1.f45434b.setOnClickListener(new ViewOnClickListenerC9466e(c8376w1, 19, this));
        C1681f c1681f = this.f31190R0;
        int i10 = C4786a.f31192a[((C5563e) c1681f.getValue()).f34360a.f31185a.ordinal()];
        TextView textView = c8376w1.f45436d;
        if (i10 == 1) {
            textView.setText(m3600t(R.string.card_notes));
        } else if (i10 == 2) {
            textView.setText(m3600t(R.string.card_type_new_meaning_here));
        } else if (i10 == 3) {
            textView.setText(m3600t(R.string.meanings_saved));
        }
        c8376w1.f45435c.setText(((C5563e) c1681f.getValue()).f34360a.f31186b);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
