package com.lingq.p055ui;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.imports.ImportData;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.shared.domain.Login;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p076di.InterfaceC5180b;
import p225kk.C6704a;
import p260m8.C7499b;
import p302oi.AbstractC8052c;
import p302oi.C8055f;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8361t1;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/StartFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StartFragment extends AbstractC8052c {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f22372H0 = {C0204c.m857q(StartFragment.class, "getBinding()Lcom/lingq/databinding/FragmentStartBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f22373A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f22374B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f22375C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f22376D0;

    /* JADX INFO: renamed from: E0 */
    public C6704a f22377E0;

    /* JADX INFO: renamed from: F0 */
    public InterfaceC5180b f22378F0;

    /* JADX INFO: renamed from: G0 */
    public C7796d f22379G0;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.lingq.ui.StartFragment$special$$inlined$viewModels$default$1] */
    public StartFragment() {
        super(R.layout.fragment_start);
        this.f22373A0 = C4924a.m10477o0(this, StartFragment$binding$2.f22380j);
        this.f22374B0 = C8573r0.m16711Z(this, C5209i.m11118a(MainViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.StartFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.StartFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.StartFragment$special$$inlined$activityViewModels$default$3
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
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.StartFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.StartFragment$special$$inlined$viewModels$default$2
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
        this.f22375C0 = C8573r0.m16711Z(this, C5209i.m11118a(AuthenticationViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.StartFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.StartFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.StartFragment$special$$inlined$viewModels$default$5
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
        this.f22376D0 = new C1681f(C5209i.m11118a(C8055f.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.StartFragment$special$$inlined$navArgs$1
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
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        String str = ((Login) C7828f.m15572f(EmptyCoroutineContext.f38093a, new StartFragment$onViewCreated$login$1(this, null))).f17773b;
        if (!(str == null || str.length() == 0)) {
            ((C8361t1) this.f22373A0.m10489a(this, f22372H0[0])).f45283a.setBackground(m3578a0().getDrawable(R.drawable.im_launch_screen));
        }
        C0987y.m3825g(this, "upgradeClosed", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.StartFragment$onViewCreated$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str2, Bundle bundle2) {
                C5207g.m11111f(str2, "requestKey");
                C5207g.m11111f(bundle2, "bundle");
                C4924a.m10447Z(C8573r0.m16725g0(this.f22393b), C8573r0.m16661A());
                return C9072e.f47360a;
            }
        });
        int i10 = m3577Z().getInt("currentTrack", 0);
        int i11 = m3577Z().getInt("lessonTrack", 0);
        int i12 = m3577Z().getInt("currentCourse", 0);
        C6704a c6704aM9748n0 = m9748n0();
        C1681f c1681f = this.f22376D0;
        c6704aM9748n0.f37891b.edit().putString("importData_4", c6704aM9748n0.f37890a.m10563a(ImportData.class).m10535e(((C8055f) c1681f.getValue()).f43744a)).apply();
        m9748n0().m13307i(i10);
        m9748n0().m13309k(i11);
        m9748n0().m13304f(i12);
        C6704a c6704aM9748n1 = m9748n0();
        String string = m3577Z().getString("currentCourseTitle");
        if (string == null) {
            string = "";
        }
        c6704aM9748n1.m13305g(string);
        if (!C7661i.m15250P2(((C8055f) c1681f.getValue()).f43745b)) {
            MainViewModel mainViewModel = (MainViewModel) this.f22374B0.getValue();
            String str2 = ((C8055f) c1681f.getValue()).f43745b;
            C5207g.m11111f(str2, "language");
            C7828f.m15570d(C8573r0.m16767w0(mainViewModel), mainViewModel.f22261H, null, new MainViewModel$updateUserActiveLanguage$1(mainViewModel, str2, null), 2);
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3433x89ccdd75(this, Lifecycle.State.STARTED, null, this, i10, i11, i12), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C6704a m9748n0() {
        C6704a c6704a = this.f22377E0;
        if (c6704a != null) {
            return c6704a;
        }
        C5207g.m11117l("appSettings");
        throw null;
    }
}
