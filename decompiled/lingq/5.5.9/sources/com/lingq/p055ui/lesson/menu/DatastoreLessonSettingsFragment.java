package com.lingq.p055ui.lesson.menu;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
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
import no.C7828f;
import p003a2.C0009a;
import p224kj.AbstractC6700b;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.InterfaceC7788o;
import p301oh.C8049h;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8333o;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/menu/DatastoreLessonSettingsFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DatastoreLessonSettingsFragment extends AbstractC6700b {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28128T0 = {C0204c.m857q(DatastoreLessonSettingsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDatastoreLessonSettingsBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f28129Q0 = C4924a.m10477o0(this, DatastoreLessonSettingsFragment$binding$2.f28133j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f28130R0;

    /* JADX INFO: renamed from: S0 */
    public C4079a f28131S0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$a */
    public static final class C4308a implements InterfaceC7788o {
        public C4308a() {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i10, int i11) {
            int iOrdinal = ViewKeys.LessonFontSize.ordinal();
            DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = DatastoreLessonSettingsFragment.this;
            if (i10 == iOrdinal) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u0 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u0), datastoreLessonSettingsViewModelM10183u0.f28188k, null, new DatastoreLessonSettingsViewModel$setLessonFontSize$1(datastoreLessonSettingsViewModelM10183u0, i11, null), 2);
                return;
            }
            if (i10 == ViewKeys.LessonLineSpacing.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u1 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u1), datastoreLessonSettingsViewModelM10183u1.f28188k, null, new DatastoreLessonSettingsViewModel$setLessonLineSpacing$1(datastoreLessonSettingsViewModelM10183u1, i11, null), 2);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: b */
        public final void mo9848b(int i10, Object obj) {
            int iOrdinal = ViewKeys.PagesMovesToKnown.ordinal();
            DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = DatastoreLessonSettingsFragment.this;
            if (i10 == iOrdinal) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u0 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u0), datastoreLessonSettingsViewModelM10183u0.f28188k, null, new DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1(datastoreLessonSettingsViewModelM10183u0, zBooleanValue, null), 2);
                return;
            }
            if (i10 == ViewKeys.StatusBar.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u1 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u1), datastoreLessonSettingsViewModelM10183u1.f28188k, null, new DatastoreLessonSettingsViewModel$setStatusBar$1(datastoreLessonSettingsViewModelM10183u1, zBooleanValue2, null), 2);
                return;
            }
            if (i10 == ViewKeys.AutoPlayTextToSpeech.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u2 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u2), datastoreLessonSettingsViewModelM10183u2.f28188k, null, new DatastoreLessonSettingsViewModel$setAutoTTS$1(datastoreLessonSettingsViewModelM10183u2, zBooleanValue3, null), 2);
                return;
            }
            if (i10 == ViewKeys.UseDeviceTextToSpeech.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u3 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u3), datastoreLessonSettingsViewModelM10183u3.f28188k, null, new DatastoreLessonSettingsViewModel$setUseDeviceTts$1(datastoreLessonSettingsViewModelM10183u3, zBooleanValue4, null), 2);
                return;
            }
            if (i10 == ViewKeys.AutoCreateLingQs.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u4 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u4), datastoreLessonSettingsViewModelM10183u4.f28188k, null, new DatastoreLessonSettingsViewModel$setAutoLingQCreation$1(datastoreLessonSettingsViewModelM10183u4, zBooleanValue5, null), 2);
                return;
            }
            if (i10 == ViewKeys.ShowSpacesBetweenWords.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u5 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u5), datastoreLessonSettingsViewModelM10183u5.f28188k, null, new DatastoreLessonSettingsViewModel$setShowSpacesBetweenWords$1(datastoreLessonSettingsViewModelM10183u5, zBooleanValue6, null), 2);
                return;
            }
            if (i10 == ViewKeys.TapToPage.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u6 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u6), datastoreLessonSettingsViewModelM10183u6.f28188k, null, new DatastoreLessonSettingsViewModel$setTapToPage$1(datastoreLessonSettingsViewModelM10183u6, zBooleanValue7, null), 2);
                return;
            }
            if (i10 == ViewKeys.StreakMilestonesShow.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u7 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u7), datastoreLessonSettingsViewModelM10183u7.f28188k, null, new DatastoreLessonSettingsViewModel$setShowStreakMilestones$1(datastoreLessonSettingsViewModelM10183u7, zBooleanValue8, null), 2);
                return;
            }
            if (i10 == ViewKeys.ShowVocabulary.ordinal()) {
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u8 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u8), datastoreLessonSettingsViewModelM10183u8.f28188k, null, new DatastoreLessonSettingsViewModel$setShowVocabulary$1(datastoreLessonSettingsViewModelM10183u8, zBooleanValue9, null), 2);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: c */
        public final void mo9849c(String str, int i10) {
            C5207g.m11111f(str, "value");
            boolean z10 = (((((((i10 == ViewKeys.LessonFont.ordinal() || i10 == ViewKeys.LessonLightHighlight.ordinal()) || i10 == ViewKeys.LessonDarkHighlight.ordinal()) || i10 == ViewKeys.AddDictionaryLanguage.ordinal()) || i10 == ViewKeys.ChineseType.ordinal()) || i10 == ViewKeys.ChineseTraditionType.ordinal()) || i10 == ViewKeys.JapaneseType.ordinal()) || i10 == ViewKeys.CantoneseType.ordinal()) || i10 == ViewKeys.TTSVoice.ordinal();
            DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = DatastoreLessonSettingsFragment.this;
            if (!z10) {
                if (i10 == ViewKeys.DictionaryLocale.ordinal()) {
                    DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u0 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
                    C7828f.m15570d(C8573r0.m16767w0(datastoreLessonSettingsViewModelM10183u0), datastoreLessonSettingsViewModelM10183u0.f28188k, null, new DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1(datastoreLessonSettingsViewModelM10183u0, str, null), 2);
                    return;
                }
                return;
            }
            NavController navControllerM16725g0 = C8573r0.m16725g0(datastoreLessonSettingsFragment);
            NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
            if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToSelection) == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSingleSelection", true);
            bundle.putInt("viewKey", i10);
            navControllerM16725g0.m3992m(R.id.actionToSelection, bundle, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$1] */
    public DatastoreLessonSettingsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$2
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
        this.f28130R0 = C8573r0.m16711Z(this, C5209i.m11118a(DatastoreLessonSettingsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$special$$inlined$viewModels$default$5
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
    public static final DatastoreLessonSettingsViewModel m10183u0(DatastoreLessonSettingsFragment datastoreLessonSettingsFragment) {
        return (DatastoreLessonSettingsViewModel) datastoreLessonSettingsFragment.f28130R0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_datastore_lesson_settings, viewGroup, false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        InterfaceC6727j<?>[] interfaceC6727jArr = f28128T0;
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f28129Q0;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels);
            LinearLayout linearLayout = ((C8333o) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45094a;
            C5207g.m11110e(linearLayout, "binding.root");
            C4924a.m10444W(linearLayout, displayMetrics.heightPixels);
        }
        C8333o c8333o = (C8333o) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0]);
        c8333o.f45096c.setTitle(m3600t(R.string.settings_text_lesson_settings));
        MaterialToolbar materialToolbar = c8333o.f45096c;
        materialToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.colorOnSurface, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2238x(17, this));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8333o.f45095b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(5)));
        C4079a c4079a = new C4079a(m3578a0(), new C4308a());
        this.f28131S0 = c4079a;
        recyclerView.setAdapter(c4079a);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((C8333o) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45095b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.start();
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4309xd123dde5(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme;
    }
}
