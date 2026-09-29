package com.lingq.p055ui.imports.userImport;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.commons.p053ui.UserImportSourceType;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fj.AbstractC5543d;
import fj.C5546g;
import fj.InterfaceC5547h;
import java.util.ArrayList;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7785l;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8288g2;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportSelectionFragment extends AbstractC5543d {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26680E0 = {C0204c.m857q(UserImportSelectionFragment.class, "getBinding()Lcom/lingq/databinding/FragmentUserImportSelectionBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f26681A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f26682B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f26683C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f26684D0;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionFragment$a */
    public static final class C4102a implements VocabularyFilterSelectionAdapter.InterfaceC4040d {
        public C4102a() {
        }

        @Override // com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.InterfaceC4040d
        /* JADX INFO: renamed from: a */
        public final void mo10068a(String str) {
        }

        @Override // com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.InterfaceC4040d
        /* JADX INFO: renamed from: b */
        public final void mo10069b(String str) {
            C5207g.m11111f(str, "filter");
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportSelectionFragment.f26680E0;
            UserImportSelectionViewModel userImportSelectionViewModelM10094o0 = UserImportSelectionFragment.this.m10094o0();
            C5546g value = userImportSelectionViewModelM10094o0.mo10080T1().getValue();
            int i10 = UserImportSelectionViewModel.C4118a.f26743a[userImportSelectionViewModelM10094o0.f26731g.ordinal()];
            InterfaceC5547h interfaceC5547h = userImportSelectionViewModelM10094o0.f26729e;
            if (i10 == 1) {
                value.getClass();
                value.f34283d = str;
                interfaceC5547h.mo10085v0(value);
            } else if (i10 == 2) {
                value.getClass();
                value.f34282c = str;
                interfaceC5547h.mo10085v0(value);
            } else if (i10 == 3) {
                value.getClass();
                value.f34284e = str;
                value.f34285f = "";
                interfaceC5547h.mo10085v0(value);
            } else if (i10 == 4) {
                value.getClass();
                value.f34280a = str;
                interfaceC5547h.mo10085v0(value);
            }
            userImportSelectionViewModelM10094o0.f26726I.mo14371k(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$1] */
    public UserImportSelectionFragment() {
        super(R.layout.fragment_user_import_selection);
        this.f26681A0 = C4924a.m10477o0(this, UserImportSelectionFragment$binding$2.f26686j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$2
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
        this.f26682B0 = C8573r0.m16711Z(this, C5209i.m11118a(UserImportSelectionViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$delegateViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f26687b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f26683C0 = C8573r0.m16711Z(this, C5209i.m11118a(UserImportParentViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$viewModels$default$9
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
        this.f26684D0 = new C1681f(C5209i.m11118a(C4132a.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionFragment$special$$inlined$navArgs$1
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
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        int i10;
        int i11 = 0;
        int i12 = 1;
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 180L;
        m3585f0(c8228iM29r);
        m10093n0().f44815c.setOnClickListener(new ViewOnClickListenerC2238x(13, this));
        if (((C4132a) this.f26684D0.getValue()).f26837a == UserImportDetailType.Course) {
            LinearLayout linearLayout = m10093n0().f44814b;
            C5207g.m11110e(linearLayout, "binding.viewAdd");
            C4924a.m10457e0(linearLayout);
            m10093n0().f44814b.setOnClickListener(new ViewOnClickListenerC2239y(22, this));
        }
        RecyclerView recyclerView = m10093n0().f44813a;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = m10093n0().f44813a;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView2.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter = new VocabularyFilterSelectionAdapter(new C4102a());
        m10093n0().f44813a.setAdapter(vocabularyFilterSelectionAdapter);
        UserImportSelectionViewModel userImportSelectionViewModelM10094o0 = m10094o0();
        Context contextM3578a1 = m3578a0();
        int i13 = UserImportSelectionViewModel.C4118a.f26743a[userImportSelectionViewModelM10094o0.f26731g.ordinal()];
        StateFlowImpl stateFlowImpl = userImportSelectionViewModelM10094o0.f26736l;
        if (i13 == 1) {
            LearningLevel[] learningLevelArrValues = LearningLevel.values();
            ArrayList arrayList = new ArrayList(learningLevelArrValues.length);
            int length = learningLevelArrValues.length;
            while (i11 < length) {
                LearningLevel learningLevel = learningLevelArrValues[i11];
                arrayList.add(new C7785l(null, C4924a.m10434M(learningLevel, contextM3578a1), C5207g.m11106a(learningLevel.getServerName(), userImportSelectionViewModelM10094o0.mo10080T1().getValue().f34283d), learningLevel.getServerName(), 1));
                i11++;
            }
            stateFlowImpl.setValue(arrayList);
        } else if (i13 == 2) {
            C7828f.m15570d(C8573r0.m16767w0(userImportSelectionViewModelM10094o0), null, null, new UserImportSelectionViewModel$fetchUserCourses$1(userImportSelectionViewModelM10094o0, null), 3);
        } else if (i13 == 3) {
            UserImportSourceType[] userImportSourceTypeArrValues = UserImportSourceType.values();
            ArrayList arrayList2 = new ArrayList(userImportSourceTypeArrValues.length);
            int length2 = userImportSourceTypeArrValues.length;
            while (i11 < length2) {
                UserImportSourceType userImportSourceType = userImportSourceTypeArrValues[i11];
                C5207g.m11111f(userImportSourceType, "<this>");
                int i14 = C4924a.a.f32102q[userImportSourceType.ordinal()];
                if (i14 == i12) {
                    i10 = R.string.user_import_url;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = R.string.user_import_text;
                }
                arrayList2.add(new C7785l(Integer.valueOf(i10), null, C5207g.m11106a(userImportSourceType.name(), userImportSelectionViewModelM10094o0.mo10080T1().getValue().f34284e), userImportSourceType.name(), 2));
                i11++;
                i12 = 1;
            }
            stateFlowImpl.setValue(arrayList2);
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4103x6316e4af(this, Lifecycle.State.STARTED, null, this, vocabularyFilterSelectionAdapter), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8288g2 m10093n0() {
        return (C8288g2) this.f26681A0.m10489a(this, f26680E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final UserImportSelectionViewModel m10094o0() {
        return (UserImportSelectionViewModel) this.f26682B0.getValue();
    }
}
