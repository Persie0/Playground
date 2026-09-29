package com.lingq.p055ui.session.magiclink;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p015ak.ViewOnClickListenerC0111h;
import p032bk.AbstractC1608e;
import p032bk.C1604a;
import p040c4.C1681f;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8291h;
import sj.ViewOnClickListenerC9058q;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/session/magiclink/CheckEmailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CheckEmailFragment extends AbstractC1608e {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30844E0 = {C0204c.m857q(CheckEmailFragment.class, "getBinding()Lcom/lingq/databinding/FragmentCheckEmailBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f30845A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f30846B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f30847C0;

    /* JADX INFO: renamed from: D0 */
    public int f30848D0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$1] */
    public CheckEmailFragment() {
        super(R.layout.fragment_check_email);
        this.f30845A0 = C4924a.m10477o0(this, CheckEmailFragment$binding$2.f30849j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$2
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
        this.f30846B0 = C8573r0.m16711Z(this, C5209i.m11118a(CheckEmailViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$viewModels$default$5
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
        this.f30847C0 = new C1681f(C5209i.m11118a(C1604a.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.session.magiclink.CheckEmailFragment$special$$inlined$navArgs$1
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
        this.f30848D0 = -1;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m10344n0(CheckEmailFragment checkEmailFragment) {
        C5207g.m11111f(checkEmailFragment, "this$0");
        CheckEmailViewModel checkEmailViewModel = (CheckEmailViewModel) checkEmailFragment.f30846B0.getValue();
        C7828f.m15570d(C8573r0.m16767w0(checkEmailViewModel), checkEmailViewModel.f30871e, null, new CheckEmailViewModel$resendMessage$1(checkEmailViewModel, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9371n c9371n = new C9371n(19, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9371n);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C8291h c8291hM10345o0 = m10345o0();
        MaterialToolbar materialToolbar = c8291hM10345o0.f44829d;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        materialToolbar.setNavigationIcon(C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back));
        List<Integer> list = C6716m.f37937a;
        int iM13333r = C6716m.m13333r(R.attr.primaryTextColor, m3578a0());
        MaterialToolbar materialToolbar2 = c8291hM10345o0.f44829d;
        materialToolbar2.setNavigationIconTint(iM13333r);
        materialToolbar2.setNavigationOnClickListener(new ViewOnClickListenerC9058q(2, this));
        Locale locale = Locale.getDefault();
        String strM3600t = m3600t(R.string.login_tap_magic_link);
        C5207g.m11110e(strM3600t, "getString(R.string.login_tap_magic_link)");
        C1681f c1681f = this.f30847C0;
        String strM613i = C0141b.m613i(new Object[]{((C1604a) c1681f.getValue()).f9096a}, 1, locale, strM3600t, "format(locale, format, *args)");
        TextView textView = c8291hM10345o0.f44830e;
        textView.setText(strM613i);
        Locale locale2 = Locale.getDefault();
        String strM3600t2 = m3600t(R.string.login_tap_magic_link);
        C5207g.m11110e(strM3600t2, "getString(R.string.login_tap_magic_link)");
        C4924a.m10453c0(textView, C0141b.m613i(new Object[]{((C1604a) c1681f.getValue()).f9096a}, 1, locale2, strM3600t2, "format(locale, format, *args)"), ((C1604a) c1681f.getValue()).f9096a, R.attr.blueWordBorderColor, null, 24);
        c8291hM10345o0.f44826a.setOnClickListener(new ViewOnClickListenerC0111h(1, this));
        c8291hM10345o0.f44827b.setOnClickListener(new ViewOnClickListenerC5062d0(19, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4750x68123247(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8291h m10345o0() {
        return (C8291h) this.f30845A0.m10489a(this, f30844E0[0]);
    }
}
