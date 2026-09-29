package com.lingq.p055ui.home.vocabulary;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.activity.result.InterfaceC0202a;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.AbstractC0986x;
import androidx.fragment.app.C0964m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.views.PagesIndicator;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.p055ui.token.TokenViewState;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.ExportType;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dj.AbstractC5184b;
import dj.C5192j;
import dm.C5207g;
import dm.C5209i;
import fk.C5574p;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p035c.C1643c;
import p045c9.C1750d;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6704a;
import p254m2.C7472a;
import p260m8.C7499b;
import p264mi.C7563c;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.InterfaceC7774a;
import p301oh.C8043b;
import p338qd.C8573r0;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import p427v3.AbstractC9634a;
import ph.C8389z;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/VocabularyFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyFragment extends AbstractC5184b {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26133G0 = {C0204c.m857q(VocabularyFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeVocabularyBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f26134A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f26135B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f26136C0;

    /* JADX INFO: renamed from: D0 */
    public VocabularyAdapter f26137D0;

    /* JADX INFO: renamed from: E0 */
    public C0964m f26138E0;

    /* JADX INFO: renamed from: F0 */
    public C6704a f26139F0;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$a */
    public static final class C3997a implements InterfaceC0202a<Boolean> {
        public C3997a() {
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(Boolean bool) {
            if (bool.booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
                VocabularyFragment.this.m10021p0().f45490c.performClick();
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$b */
    public static final class C3998b implements VocabularyAdapter.InterfaceC3990d {
        public C3998b() {
        }

        @Override // com.lingq.p055ui.home.vocabulary.VocabularyAdapter.InterfaceC3990d
        /* JADX INFO: renamed from: a */
        public final void mo10015a() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyViewModel vocabularyViewModelM10022q0 = VocabularyFragment.this.m10022q0();
            AbstractC4033e.a aVar = AbstractC4033e.a.f26343a;
            C5207g.m11111f(aVar, "navigation");
            vocabularyViewModelM10022q0.f26238Y.mo14371k(aVar);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$c */
    public static final class C3999c implements PagesIndicator.InterfaceC3279a {
        public C3999c() {
        }

        @Override // com.lingq.commons.p053ui.views.PagesIndicator.InterfaceC3279a
        /* JADX INFO: renamed from: a */
        public final void mo9358a() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyViewModel vocabularyViewModelM10022q0 = VocabularyFragment.this.m10022q0();
            vocabularyViewModelM10022q0.f26236W.mo14371k(new Pair(vocabularyViewModelM10022q0.f26232S.getValue(), vocabularyViewModelM10022q0.f26231R.getValue()));
        }

        @Override // com.lingq.commons.p053ui.views.PagesIndicator.InterfaceC3279a
        /* JADX INFO: renamed from: b */
        public final void mo9359b(boolean z10) {
            VocabularyFragment vocabularyFragment = VocabularyFragment.this;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
                VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
                StateFlowImpl stateFlowImpl = vocabularyViewModelM10022q0.f26232S;
                int iIntValue = ((Number) stateFlowImpl.getValue()).intValue();
                if (iIntValue < ((Number) vocabularyViewModelM10022q0.f26231R.getValue()).intValue()) {
                    stateFlowImpl.setValue(Integer.valueOf(iIntValue + 1));
                    vocabularyViewModelM10022q0.m10061q2();
                }
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = VocabularyFragment.f26133G0;
                VocabularyViewModel vocabularyViewModelM10022q1 = vocabularyFragment.m10022q0();
                StateFlowImpl stateFlowImpl2 = vocabularyViewModelM10022q1.f26232S;
                int iIntValue2 = ((Number) stateFlowImpl2.getValue()).intValue();
                if (2 <= iIntValue2 && iIntValue2 <= ((Number) vocabularyViewModelM10022q1.f26231R.getValue()).intValue()) {
                    stateFlowImpl2.setValue(Integer.valueOf(iIntValue2 - 1));
                    vocabularyViewModelM10022q1.m10061q2();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$d */
    public static final class C4000d implements InterfaceC7774a<C7563c> {
        public C4000d() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C7563c c7563c) {
            C7563c c7563c2 = c7563c;
            C5207g.m11111f(c7563c2, "card");
            C4924a.m10447Z(C8573r0.m16725g0(VocabularyFragment.this), new C5192j(new TokenData(c7563c2.f41680b, TokenType.CardType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Vocabulary, null, 0, null, 924)));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$e */
    public static final class C4001e implements InterfaceC7774a<String> {
        public C4001e() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(String str) {
            String str2 = str;
            C5207g.m11111f(str2, "it");
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = VocabularyFragment.this;
            vocabularyFragment.m10022q0().f26224K.setValue(str2);
            vocabularyFragment.m10022q0().m10058o2();
            vocabularyFragment.m10022q0().m10061q2();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$f */
    public static final class C4002f implements InterfaceC7774a<VocabularyAdapter.SelectedContent> {
        public C4002f() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(VocabularyAdapter.SelectedContent selectedContent) {
            VocabularyAdapter.SelectedContent selectedContent2 = selectedContent;
            C5207g.m11111f(selectedContent2, "it");
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = VocabularyFragment.this;
            vocabularyFragment.m10022q0().m10058o2();
            vocabularyFragment.m10022q0().f26223J.setValue(selectedContent2);
            vocabularyFragment.m10022q0().m10061q2();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$g */
    public static final class C4003g implements VocabularyAdapter.InterfaceC3991e {
        public C4003g() {
        }

        @Override // com.lingq.p055ui.home.vocabulary.VocabularyAdapter.InterfaceC3991e
        /* JADX INFO: renamed from: a */
        public final void mo10016a(String str, int i10) {
            C5207g.m11111f(str, "term");
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment.this.m10022q0().m10063r2(str, i10);
        }
    }

    public VocabularyFragment() {
        super(R.layout.fragment_home_vocabulary);
        this.f26134A0 = C4924a.m10477o0(this, VocabularyFragment$binding$2.f26142j);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f26220b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f26135B0 = C8573r0.m16711Z(this, C5209i.m11118a(VocabularyViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$viewModels$default$3
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$viewModels$default$4
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
        this.f26136C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
                C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
                return c1046m0Mo796n;
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i = this.m3576Y().mo470i();
                C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static void m10019n0(VocabularyFragment vocabularyFragment, C8389z c8389z) {
        C5207g.m11111f(vocabularyFragment, "this$0");
        C5207g.m11111f(c8389z, "$this_with");
        VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
        C7828f.m15570d(C8573r0.m16767w0(vocabularyViewModelM10022q0), null, null, new VocabularyViewModel$refreshCards$1(vocabularyViewModelM10022q0, null), 3);
        C7828f.m15570d(C7499b.m14906H(vocabularyFragment), null, null, new VocabularyFragment$onViewCreated$2$1$1(c8389z, null), 3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o0 */
    public static final void m10020o0(VocabularyFragment vocabularyFragment, ExportType exportType, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (z10) {
                VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
                C5207g.m11111f(exportType, "exportType");
                C7828f.m15570d(C8573r0.m16767w0(vocabularyViewModelM10022q0), vocabularyViewModelM10022q0.f26253i, null, new VocabularyViewModel$exportAll$1(vocabularyViewModelM10022q0, exportType, null), 2);
                return;
            } else {
                VocabularyViewModel vocabularyViewModelM10022q1 = vocabularyFragment.m10022q0();
                C5207g.m11111f(exportType, "exportType");
                C7828f.m15570d(C8573r0.m16767w0(vocabularyViewModelM10022q1), vocabularyViewModelM10022q1.f26253i, null, new VocabularyViewModel$export$1(vocabularyViewModelM10022q1, exportType, null), 2);
                return;
            }
        }
        if (C7472a.m14841a(vocabularyFragment.m3578a0(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            if (z10) {
                VocabularyViewModel vocabularyViewModelM10022q2 = vocabularyFragment.m10022q0();
                C5207g.m11111f(exportType, "exportType");
                C7828f.m15570d(C8573r0.m16767w0(vocabularyViewModelM10022q2), vocabularyViewModelM10022q2.f26253i, null, new VocabularyViewModel$exportAll$1(vocabularyViewModelM10022q2, exportType, null), 2);
                return;
            } else {
                VocabularyViewModel vocabularyViewModelM10022q3 = vocabularyFragment.m10022q0();
                C5207g.m11111f(exportType, "exportType");
                C7828f.m15570d(C8573r0.m16767w0(vocabularyViewModelM10022q3), vocabularyViewModelM10022q3.f26253i, null, new VocabularyViewModel$export$1(vocabularyViewModelM10022q3, exportType, null), 2);
                return;
            }
        }
        AbstractC0986x<?> abstractC0986x = vocabularyFragment.f6078P;
        if (!(abstractC0986x != null ? abstractC0986x.mo3810n0("android.permission.WRITE_EXTERNAL_STORAGE") : false)) {
            C0964m c0964m = vocabularyFragment.f26138E0;
            if (c0964m != null) {
                c0964m.mo844a("android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            } else {
                C5207g.m11117l("requestPermissionLauncher");
                throw null;
            }
        }
        C9249b c9249b = new C9249b(vocabularyFragment.m3578a0());
        c9249b.setTitle(vocabularyFragment.m3600t(R.string.share_image_permission_title));
        c9249b.f599a.f579f = vocabularyFragment.m3600t(R.string.share_image_permission_desc);
        c9249b.m17612e(vocabularyFragment.m3600t(R.string.ui_ok), new DialogInterfaceOnClickListenerC8634f(3, vocabularyFragment));
        c9249b.m17610c(vocabularyFragment.m3600t(R.string.ui_cancel), null);
        c9249b.m876a();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        ((HomeViewModel) this.f26136C0.getValue()).mo9724L();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$8] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        this.f26138E0 = m3575X(new C3997a(), new C1643c());
        C8389z c8389zM10021p0 = m10021p0();
        c8389zM10021p0.f45494g.setColorSchemeResources(R.color.indigo_lightest, R.color.yellow_dark, R.color.green);
        c8389zM10021p0.f45494g.setOnRefreshListener(new C1750d(this, 8, c8389zM10021p0));
        c8389zM10021p0.f45490c.setOnClickListener(new ViewOnClickListenerC4032d(1, this));
        c8389zM10021p0.f45489b.setOnClickListener(new ViewOnClickListenerC7718c(21, this));
        c8389zM10021p0.f45491d.setOnClickListener(new ViewOnClickListenerC5062d0(10, this));
        this.f26137D0 = new VocabularyAdapter(new C4000d(), new C4001e(), new C4002f(), new VocabularyAdapter.InterfaceC3992f() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$8
            @Override // com.lingq.p055ui.home.vocabulary.VocabularyAdapter.InterfaceC3992f
            /* JADX INFO: renamed from: a */
            public final void mo10017a(final String str, int i10, Integer num, View view2) {
                C5207g.m11111f(str, "term");
                C5207g.m11111f(view2, "viewAsAnchor");
                TokenControllerType tokenControllerType = TokenControllerType.Vocabulary;
                final VocabularyFragment vocabularyFragment = this.f26158a;
                new C5574p(view2, i10, num, tokenControllerType, new InterfaceC2052l<TokenStatusMenuItem, C9072e>() { // from class: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$8$statusClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$2$8$statusClicked$1$a */
                    public /* synthetic */ class C4006a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f26161a;

                        static {
                            int[] iArr = new int[TokenStatusMenuItem.values().length];
                            try {
                                iArr[TokenStatusMenuItem.Ignore.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.New.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Recognized.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Familiar.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Learned.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Known.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            f26161a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(TokenStatusMenuItem tokenStatusMenuItem) {
                        TokenStatusMenuItem tokenStatusMenuItem2 = tokenStatusMenuItem;
                        C5207g.m11111f(tokenStatusMenuItem2, "item");
                        int i11 = C4006a.f26161a[tokenStatusMenuItem2.ordinal()];
                        String str2 = str;
                        VocabularyFragment vocabularyFragment2 = vocabularyFragment;
                        switch (i11) {
                            case 1:
                                InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.Ignored.getValue());
                                break;
                            case 2:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.New.getValue());
                                break;
                            case 3:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.Recognized.getValue());
                                break;
                            case 4:
                                InterfaceC6727j<Object>[] interfaceC6727jArr4 = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.Familiar.getValue());
                                break;
                            case 5:
                                InterfaceC6727j<Object>[] interfaceC6727jArr5 = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.Learned.getValue());
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr6 = VocabularyFragment.f26133G0;
                                vocabularyFragment2.m10022q0().m10063r2(str2, CardStatus.Known.getValue());
                                break;
                        }
                        return C9072e.f47360a;
                    }
                });
            }
        }, new C4003g(), new C3998b());
        m10021p0().f45488a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8389zM10021p0.f45493f;
        recyclerView.setLayoutManager(linearLayoutManager);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        VocabularyAdapter vocabularyAdapter = this.f26137D0;
        if (vocabularyAdapter == null) {
            C5207g.m11117l("vocabularyAdapter");
            throw null;
        }
        recyclerView.setAdapter(vocabularyAdapter);
        c8389zM10021p0.f45492e.setOnPageSelectedListener(new C3999c());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4004x99d6f139(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final C8389z m10021p0() {
        return (C8389z) this.f26134A0.m10489a(this, f26133G0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final VocabularyViewModel m10022q0() {
        return (VocabularyViewModel) this.f26135B0.getValue();
    }
}
