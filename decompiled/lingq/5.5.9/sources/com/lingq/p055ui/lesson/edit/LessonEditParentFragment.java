package com.lingq.p055ui.lesson.edit;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p040c4.C1689n;
import p204jj.AbstractC6480a;
import p204jj.C6486g;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/LessonEditParentFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonEditParentFragment extends AbstractC6480a {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f27870U0 = {C0204c.m857q(LessonEditParentFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonEditParentBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final C1681f f27871Q0 = new C1681f(C5209i.m11118a(C6486g.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$navArgs$1
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

    /* JADX INFO: renamed from: R0 */
    public final FragmentViewBindingDelegate f27872R0 = C4924a.m10477o0(this, LessonEditParentFragment$binding$2.f27875j);

    /* JADX INFO: renamed from: S0 */
    public final C1038i0 f27873S0;

    /* JADX INFO: renamed from: T0 */
    public final C1038i0 f27874T0;

    public LessonEditParentFragment() {
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f27913b;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f27873S0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonEditParentViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$4
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a2 = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$lessonViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                Fragment fragment = this.f27876b.m3579b0().m3594l().f6181x;
                C5207g.m11108c(fragment);
                return fragment;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a2.mo807E();
            }
        });
        this.f27874T0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.edit.LessonEditParentFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
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
    public static final LessonEditParentViewModel m10154u0(LessonEditParentFragment lessonEditParentFragment) {
        return (LessonEditParentViewModel) lessonEditParentFragment.f27873S0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_lesson_edit_parent, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        this.f6323B0 = false;
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        if (C7777d.m15481b(this)) {
            Dialog dialog2 = this.f6328G0;
            View viewFindViewById = dialog2 != null ? dialog2.findViewById(R.id.design_bottom_sheet) : null;
            if (viewFindViewById != null) {
                BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
                C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
                bottomSheetBehaviorM8602w.m8606D(3);
            }
        }
        Fragment fragmentM3615C = m3594l().m3615C(R.id.nav_host_fragment_lesson_edit);
        C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController navControllerM16725g0 = C8573r0.m16725g0((NavHostFragment) fragmentM3615C);
        C6486g c6486g = (C6486g) this.f27871Q0.getValue();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("lessonId", c6486g.f37087a);
        bundle2.putInt("sentenceIndex", c6486g.f37089c);
        bundle2.putBoolean("hasAudio", c6486g.f37088b);
        navControllerM16725g0.m4001w(((C1689n) navControllerM16725g0.f6750B.getValue()).m5417b(R.navigation.nav_graph_lesson_edit), bundle2);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4273x5e956f7f(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
