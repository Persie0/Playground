package com.lingq.p055ui.token;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fk.AbstractC5561c;
import fk.C5570l;
import km.InterfaceC6727j;
import kotlin.Metadata;
import p040c4.C1681f;
import p278nh.C7777d;
import ph.C8381x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/token/TokenParentFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenParentFragment extends AbstractC5561c {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31387S0 = {C0204c.m857q(TokenParentFragment.class, "getBinding()Lcom/lingq/databinding/FragmentTokenParentBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f31388Q0 = C4924a.m10477o0(this, TokenParentFragment$binding$2.f31390j);

    /* JADX INFO: renamed from: R0 */
    public final C1681f f31389R0 = new C1681f(C5209i.m11118a(C5570l.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.token.TokenParentFragment$special$$inlined$navArgs$1
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_token_parent, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        Window window;
        this.f6090a0 = true;
        if (C7777d.m15482c(this)) {
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            float dimension = m3599s().getDimension(R.dimen.token_should_fixed_tablet);
            Dialog dialog = this.f6328G0;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setLayout((int) dimension, displayMetrics.heightPixels - 95);
            }
        }
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
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels);
            ConstraintLayout constraintLayout = ((C8381x1) this.f31388Q0.m10489a(this, f31387S0[0])).f45462a;
            C5207g.m11110e(constraintLayout, "binding.root");
            C4924a.m10444W(constraintLayout, displayMetrics.heightPixels);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("tokenData", ((C5570l) this.f31389R0.getValue()).f34370a);
        bundle2.putBoolean("fromVocabulary", true);
        C7777d.m15485f(C4924a.m10446Y(this), R.id.fragment_container_token, bundle2, true, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
