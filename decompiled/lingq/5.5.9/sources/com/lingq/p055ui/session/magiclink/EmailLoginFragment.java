package com.lingq.p055ui.session.magiclink;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p032bk.AbstractC1609f;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9370m;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8349r;
import sl.InterfaceC9070c;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/session/magiclink/EmailLoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class EmailLoginFragment extends AbstractC1609f {

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30886C0 = {C0204c.m857q(EmailLoginFragment.class, "getBinding()Lcom/lingq/databinding/FragmentEmailLoginBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f30887A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f30888B0;

    /* JADX INFO: renamed from: com.lingq.ui.session.magiclink.EmailLoginFragment$a */
    public static final class C4756a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8349r f30889a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EmailLoginFragment f30890b;

        public C4756a(C8349r c8349r, EmailLoginFragment emailLoginFragment) {
            this.f30889a = c8349r;
            this.f30890b = emailLoginFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f30889a.f45184d.setError(C4924a.m10426E(String.valueOf(charSequence)) ? null : this.f30890b.m3600t(R.string.welcome_please_check_email));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$1] */
    public EmailLoginFragment() {
        super(R.layout.fragment_email_login);
        this.f30887A0 = C4924a.m10477o0(this, EmailLoginFragment$binding$2.f30891j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$2
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
        this.f30888B0 = C8573r0.m16711Z(this, C5209i.m11118a(EmailLoginViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.session.magiclink.EmailLoginFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: n0 */
    public static void m10346n0(C8349r c8349r, EmailLoginFragment emailLoginFragment) {
        C5207g.m11111f(c8349r, "$this_with");
        C5207g.m11111f(emailLoginFragment, "this$0");
        TextInputEditText textInputEditText = c8349r.f45182b;
        if (!C4924a.m10426E(String.valueOf(textInputEditText.getText()))) {
            c8349r.f45184d.setError(emailLoginFragment.m3600t(R.string.welcome_please_check_email));
            return;
        }
        EmailLoginViewModel emailLoginViewModelM10348p0 = emailLoginFragment.m10348p0();
        String strValueOf = String.valueOf(textInputEditText.getText());
        C7828f.m15570d(C8573r0.m16767w0(emailLoginViewModelM10348p0), emailLoginViewModelM10348p0.f30915e, null, new EmailLoginViewModel$requestEmailLogin$1(emailLoginViewModelM10348p0, strValueOf, null), 2);
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(emailLoginFragment.m3578a0(), emailLoginFragment.m3580c0());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9370m c9370m = new C9370m(19, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9370m);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C8349r c8349rM10347o0 = m10347o0();
        MaterialToolbar materialToolbar = c8349rM10347o0.f45185e;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        materialToolbar.setNavigationIcon(C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back));
        List<Integer> list = C6716m.f37937a;
        int iM13333r = C6716m.m13333r(R.attr.primaryTextColor, m3578a0());
        MaterialToolbar materialToolbar2 = c8349rM10347o0.f45185e;
        materialToolbar2.setNavigationIconTint(iM13333r);
        materialToolbar2.setNavigationOnClickListener(new ViewOnClickListenerC5062d0(20, this));
        TextInputEditText textInputEditText = c8349rM10347o0.f45182b;
        C5207g.m11110e(textInputEditText, "etEmail");
        textInputEditText.addTextChangedListener(new C4756a(c8349rM10347o0, this));
        c8349rM10347o0.f45181a.setOnClickListener(new ViewOnClickListenerC9734i(c8349rM10347o0, 15, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4757x73d610c0(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8349r m10347o0() {
        return (C8349r) this.f30887A0.m10489a(this, f30886C0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final EmailLoginViewModel m10348p0() {
        return (EmailLoginViewModel) this.f30888B0.getValue();
    }
}
