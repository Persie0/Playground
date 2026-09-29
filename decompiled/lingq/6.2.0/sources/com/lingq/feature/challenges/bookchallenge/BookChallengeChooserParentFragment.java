package com.lingq.feature.challenges.bookchallenge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.designsystem.R$style;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3028g7;
import p000.InterfaceC2991f7;
import p000.ad3;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.or1;
import p000.qt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.xe0;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class BookChallengeChooserParentFragment extends qt3 {

    /* JADX INFO: renamed from: S0 */
    public final w41 f24511S0;

    /* JADX INFO: renamed from: T0 */
    public int f24512T0;

    /* JADX INFO: renamed from: U0 */
    public final ad3 f24513U0;

    public BookChallengeChooserParentFragment() {
        super(0);
        final C1965xbb4ad42 c1965xbb4ad42 = new C1965xbb4ad42(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c1965xbb4ad42.mo0a();
            }
        });
        this.f24511S0 = new w41(y38.m24933a(C1972c.class), new ui3() { // from class: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24530b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        this.f24513U0 = (ad3) m2088P(new InterfaceC2991f7() { // from class: com.lingq.feature.challenges.bookchallenge.a
            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                Intent intent;
                Uri data;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.f1007a != -1 || (intent = activityResult.f1008b) == null || (data = intent.getData()) == null) {
                    return;
                }
                BookChallengeChooserParentFragment bookChallengeChooserParentFragment = this.f24540a;
                wfb.m23926u(AbstractC0708b.m2508a(bookChallengeChooserParentFragment.m2112n()), null, null, new BookChallengeChooserParentFragment$filePickerLauncher$1$1$1(bookChallengeChooserParentFragment, data, null), 3);
            }
        }, new C3028g7(1));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-1528149428, true, new xe0(this, 0)));
    }

    /* JADX INFO: renamed from: A0 */
    public final C1972c m8811A0() {
        return (C1972c) this.f24511S0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1964x3d0f0e7e(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
