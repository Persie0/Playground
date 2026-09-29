package com.lingq.p055ui.review.settings;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0987y;
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
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.InterfaceC7788o;
import p301oh.C8049h;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p488xj.AbstractC10212b;
import ph.C8339p;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/review/settings/DatastoreReviewSettingsFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DatastoreReviewSettingsFragment extends AbstractC10212b {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30337T0 = {C0204c.m857q(DatastoreReviewSettingsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDatastoreReviewSettingsBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f30338Q0 = C4924a.m10477o0(this, DatastoreReviewSettingsFragment$binding$2.f30342j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f30339R0;

    /* JADX INFO: renamed from: S0 */
    public C4079a f30340S0;

    /* JADX INFO: renamed from: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$a */
    public static final class C4685a implements InterfaceC7788o {
        public C4685a() {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i10, int i11) {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: b */
        public final void mo9848b(int i10, Object obj) {
            int iOrdinal = ViewKeys.ShuffleCards.ordinal();
            DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = DatastoreReviewSettingsFragment.this;
            if (i10 == iOrdinal) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u0 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u0), dataStoreReviewSettingsViewModelM10304u0.f30214f, null, new DataStoreReviewSettingsViewModel$setShouldShuffleCards$1(dataStoreReviewSettingsViewModelM10304u0, zBooleanValue, null), 2);
                return;
            }
            if (i10 == ViewKeys.Flashcards.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u1 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u1), dataStoreReviewSettingsViewModelM10304u1.f30214f, null, new DataStoreReviewSettingsViewModel$setIsFlashCardActive$1(dataStoreReviewSettingsViewModelM10304u1, zBooleanValue2, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcards.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u2 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u2), dataStoreReviewSettingsViewModelM10304u2.f30214f, null, new DataStoreReviewSettingsViewModel$setIsFlashCardReverseActive$1(dataStoreReviewSettingsViewModelM10304u2, zBooleanValue3, null), 2);
                return;
            }
            if (i10 == ViewKeys.Cloze.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u3 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u3), dataStoreReviewSettingsViewModelM10304u3.f30214f, null, new DataStoreReviewSettingsViewModel$setIsClozeActive$1(dataStoreReviewSettingsViewModelM10304u3, zBooleanValue4, null), 2);
                return;
            }
            if (i10 == ViewKeys.MultipleChoice.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u4 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u4), dataStoreReviewSettingsViewModelM10304u4.f30214f, null, new DataStoreReviewSettingsViewModel$setIsMultiChoiceActive$1(dataStoreReviewSettingsViewModelM10304u4, zBooleanValue5, null), 2);
                return;
            }
            if (i10 == ViewKeys.Dictation.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u5 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u5), dataStoreReviewSettingsViewModelM10304u5.f30214f, null, new DataStoreReviewSettingsViewModel$setIsDictationActive$1(dataStoreReviewSettingsViewModelM10304u5, zBooleanValue6, null), 2);
                return;
            }
            if (i10 == ViewKeys.Unscramble.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u6 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u6), dataStoreReviewSettingsViewModelM10304u6.f30214f, null, new DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1(dataStoreReviewSettingsViewModelM10304u6, zBooleanValue7, null), 2);
                return;
            }
            if (i10 == ViewKeys.Speaking.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u7 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u7), dataStoreReviewSettingsViewModelM10304u7.f30214f, null, new DataStoreReviewSettingsViewModel$setIsSpeakingActive$1(dataStoreReviewSettingsViewModelM10304u7, zBooleanValue8, null), 2);
                return;
            }
            if (i10 == ViewKeys.Matching.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u8 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u8), dataStoreReviewSettingsViewModelM10304u8.f30214f, null, new DataStoreReviewSettingsViewModel$setIsMatchingActive$1(dataStoreReviewSettingsViewModelM10304u8, zBooleanValue9, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsFrontTerm.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u9 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue10 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u9), dataStoreReviewSettingsViewModelM10304u9.f30214f, null, new DataStoreReviewSettingsViewModel$setIsFlashCardFrontTermActive$1(dataStoreReviewSettingsViewModelM10304u9, zBooleanValue10, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsFrontPhrase.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u10 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue11 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u10), dataStoreReviewSettingsViewModelM10304u10.f30214f, null, new C4668xd5089b4f(dataStoreReviewSettingsViewModelM10304u10, zBooleanValue11, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsFrontTranslation.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u11 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue12 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u11), dataStoreReviewSettingsViewModelM10304u11.f30214f, null, new C4670x26bc8e61(dataStoreReviewSettingsViewModelM10304u11, zBooleanValue12, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsFrontStatusBar.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u12 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue13 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u12), dataStoreReviewSettingsViewModelM10304u12.f30214f, null, new C4669x37448388(dataStoreReviewSettingsViewModelM10304u12, zBooleanValue13, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsBackTerm.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u13 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue14 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u13), dataStoreReviewSettingsViewModelM10304u13.f30214f, null, new DataStoreReviewSettingsViewModel$setIsFlashCardBackTermActive$1(dataStoreReviewSettingsViewModelM10304u13, zBooleanValue14, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsBackPhrase.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u14 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue15 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u14), dataStoreReviewSettingsViewModelM10304u14.f30214f, null, new C4665x39abe899(dataStoreReviewSettingsViewModelM10304u14, zBooleanValue15, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsBackTranslation.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u15 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue16 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u15), dataStoreReviewSettingsViewModelM10304u15.f30214f, null, new C4667x1367ff57(dataStoreReviewSettingsViewModelM10304u15, zBooleanValue16, null), 2);
                return;
            }
            if (i10 == ViewKeys.FlashcardsBackStatusBar.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u16 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue17 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u16), dataStoreReviewSettingsViewModelM10304u16.f30214f, null, new C4666x9be7d0d2(dataStoreReviewSettingsViewModelM10304u16, zBooleanValue17, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsFrontTerm.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u17 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue18 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u17), dataStoreReviewSettingsViewModelM10304u17.f30214f, null, new C4677x9ebc800c(dataStoreReviewSettingsViewModelM10304u17, zBooleanValue18, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsFrontPhrase.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u18 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue19 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u18), dataStoreReviewSettingsViewModelM10304u18.f30214f, null, new C4675x178a9619(dataStoreReviewSettingsViewModelM10304u18, zBooleanValue19, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsFrontTranslation.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u19 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue20 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u19), dataStoreReviewSettingsViewModelM10304u19.f30214f, null, new C4678x4119c1d7(dataStoreReviewSettingsViewModelM10304u19, zBooleanValue20, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsFrontStatusBar.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u20 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue21 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u20), dataStoreReviewSettingsViewModelM10304u20.f30214f, null, new C4676x79c67e52(dataStoreReviewSettingsViewModelM10304u20, zBooleanValue21, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsBackTerm.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u21 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue22 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u21), dataStoreReviewSettingsViewModelM10304u21.f30214f, null, new C4673xbbfb7c02(dataStoreReviewSettingsViewModelM10304u21, zBooleanValue22, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsBackPhrase.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u22 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue23 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u22), dataStoreReviewSettingsViewModelM10304u22.f30214f, null, new C4671xe0fa6c8f(dataStoreReviewSettingsViewModelM10304u22, zBooleanValue23, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsBackTranslation.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u23 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue24 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u23), dataStoreReviewSettingsViewModelM10304u23.f30214f, null, new C4674xfb7b8521(dataStoreReviewSettingsViewModelM10304u23, zBooleanValue24, null), 2);
                return;
            }
            if (i10 == ViewKeys.ReverseFlashcardsBackStatusBar.ordinal()) {
                DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u24 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue25 = ((Boolean) obj).booleanValue();
                C7828f.m15570d(C8573r0.m16767w0(dataStoreReviewSettingsViewModelM10304u24), dataStoreReviewSettingsViewModelM10304u24.f30214f, null, new C4672x433654c8(dataStoreReviewSettingsViewModelM10304u24, zBooleanValue25, null), 2);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: c */
        public final void mo9849c(String str, int i10) {
            C5207g.m11111f(str, "value");
            boolean z10 = i10 == ViewKeys.FlashCardsSettings.ordinal() || i10 == ViewKeys.ReversFlashCardsSettings.ordinal();
            DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = DatastoreReviewSettingsFragment.this;
            if (z10) {
                NavController navControllerM16725g0 = C8573r0.m16725g0(datastoreReviewSettingsFragment);
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToReviewSettings) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("viewKey", i10);
                    navControllerM16725g0.m3992m(R.id.actionToReviewSettings, bundle, null);
                }
            } else if (i10 == ViewKeys.CardsPerSession.ordinal()) {
                String strM3600t = datastoreReviewSettingsFragment.m3600t(R.string.activities_settings_input_cards);
                C5207g.m11110e(strM3600t, "getString(R.string.activ…ies_settings_input_cards)");
                NavController navControllerM16725g1 = C8573r0.m16725g0(datastoreReviewSettingsFragment);
                NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToSettingsEdit) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("title", strM3600t);
                    bundle2.putInt("viewKey", i10);
                    navControllerM16725g1.m3992m(R.id.actionToSettingsEdit, bundle2, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$1] */
    public DatastoreReviewSettingsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$2
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
        this.f30339R0 = C8573r0.m16711Z(this, C5209i.m11118a(DataStoreReviewSettingsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$special$$inlined$viewModels$default$5
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
    public static final DataStoreReviewSettingsViewModel m10304u0(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment) {
        return (DataStoreReviewSettingsViewModel) datastoreReviewSettingsFragment.f30339R0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_datastore_review_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f30338Q0;
        InterfaceC6727j<?>[] interfaceC6727jArr = f30337T0;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels);
            ConstraintLayout constraintLayout = ((C8339p) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45119a;
            C5207g.m11110e(constraintLayout, "binding.root");
            C4924a.m10444W(constraintLayout, displayMetrics.heightPixels);
        }
        C0987y.m3824f(new Bundle(), this, "reviewSettingsClosed");
        C8339p c8339p = (C8339p) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0]);
        c8339p.f45121c.setNavigationIcon(R.drawable.ic_arrow_back);
        List<Integer> list = C6716m.f37937a;
        int iM13333r = C6716m.m13333r(R.attr.colorOnSurface, m3578a0());
        MaterialToolbar materialToolbar = c8339p.f45121c;
        materialToolbar.setNavigationIconTint(iM13333r);
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2238x(26, this));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8339p.f45120b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(5)));
        C4079a c4079a = new C4079a(m3578a0(), new C4685a());
        this.f30340S0 = c4079a;
        recyclerView.setAdapter(c4079a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4686xd44ee005(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme;
    }
}
