package com.lingq.p055ui.token.dictionaries;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.RunnableC0893g;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.token.DictionaryData;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import hk.AbstractC6077h;
import hk.C6073d;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C7076b;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p301oh.C8045d;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p427v3.AbstractC9634a;
import ph.C8298i0;
import si.ViewOnClickListenerC9029m;
import sl.InterfaceC9070c;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionaryContentFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "a", "b", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionaryContentFragment extends AbstractC6077h {

    /* JADX INFO: renamed from: Q0 */
    public C4902a f31856Q0;

    /* JADX INFO: renamed from: R0 */
    public final FragmentViewBindingDelegate f31857R0 = C4924a.m10477o0(this, DictionaryContentFragment$binding$2.f31864j);

    /* JADX INFO: renamed from: S0 */
    public final C1038i0 f31858S0;

    /* JADX INFO: renamed from: T0 */
    public final C1681f f31859T0;

    /* JADX INFO: renamed from: U0 */
    public ClipboardManager f31860U0;

    /* JADX INFO: renamed from: V0 */
    public CharSequence f31861V0;

    /* JADX INFO: renamed from: W0 */
    public InterfaceC3275c f31862W0;

    /* JADX INFO: renamed from: Y0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31855Y0 = {C0204c.m857q(DictionaryContentFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonDictionaryContentBinding;")};

    /* JADX INFO: renamed from: X0 */
    public static final C4892a f31854X0 = new C4892a();

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$a */
    public static final class C4892a {
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$b */
    public final class C4893b extends WebViewClient {
        public C4893b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment.this.m10397v0().f31406H0.mo14371k(Boolean.FALSE);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment.this.m10397v0().f31406H0.mo14371k(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$c */
    public static final class ViewOnKeyListenerC4894c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8298i0 f31865a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DictionaryContentFragment f31866b;

        public ViewOnKeyListenerC4894c(C8298i0 c8298i0, DictionaryContentFragment dictionaryContentFragment) {
            this.f31865a = c8298i0;
            this.f31866b = dictionaryContentFragment;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (!(keyEvent != null && keyEvent.getAction() == 0) || i10 != 4) {
                return false;
            }
            C8298i0 c8298i0 = this.f31865a;
            c8298i0.f44883k.setLayerType(1, null);
            WebView webView = c8298i0.f44883k;
            C5207g.m11110e(webView, "wvDictionary");
            C4924a.m10442U(webView);
            this.f31866b.mo3766m0();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$d */
    public static final class C4895d implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DictionaryData f31868b;

        public C4895d(DictionaryData dictionaryData) {
            this.f31868b = dictionaryData;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            C5207g.m11109d(textView, "null cannot be cast to non-null type android.view.View");
            C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment.this.m10398w0(textView, this.f31868b);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$e */
    public static final class C4896e implements InterfaceC7774a<UserDictionaryData> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8298i0 f31869a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DictionaryData f31870b;

        public C4896e(C8298i0 c8298i0, DictionaryData dictionaryData) {
            this.f31869a = c8298i0;
            this.f31870b = dictionaryData;
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(UserDictionaryData userDictionaryData) {
            UserDictionaryData userDictionaryData2 = userDictionaryData;
            C5207g.m11111f(userDictionaryData2, "dict");
            this.f31869a.f44883k.loadUrl(userDictionaryData2.m9703b(this.f31870b.f31171a));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$f */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC4897f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f31871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f31872b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C8298i0 f31873c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DictionaryContentFragment f31874d;

        public ViewTreeObserverOnGlobalLayoutListenerC4897f(View view, View view2, C8298i0 c8298i0, DictionaryContentFragment dictionaryContentFragment) {
            this.f31871a = view;
            this.f31872b = view2;
            this.f31873c = c8298i0;
            this.f31874d = dictionaryContentFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.f31871a;
            if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                return;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view2 = this.f31872b;
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new ViewOnKeyListenerC4894c(this.f31873c, this.f31874d));
        }
    }

    public DictionaryContentFragment() {
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f31899b.m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f31858S0 = C8573r0.m16711Z(this, C5209i.m11118a(TokenViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$special$$inlined$viewModels$default$4
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
        this.f31859T0 = new C1681f(C5209i.m11118a(C6073d.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.token.dictionaries.DictionaryContentFragment$special$$inlined$navArgs$1
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
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_lesson_dictionary_content, viewGroup, false);
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
            bottomSheetBehaviorM8602w.f14828K = false;
            ConstraintLayout constraintLayout = m10396u0().f44873a;
            C5207g.m11110e(constraintLayout, "binding.root");
            C4924a.m10444W(constraintLayout, displayMetrics.heightPixels);
        }
        C6073d c6073d = (C6073d) this.f31859T0.getValue();
        C8298i0 c8298i0M10396u0 = m10396u0();
        TextView textView = c8298i0M10396u0.f44880h;
        DictionaryData dictionaryData = c6073d.f35797a;
        textView.setText(dictionaryData.f31171a);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4897f(view, view, c8298i0M10396u0, this));
        int i10 = 24;
        c8298i0M10396u0.f44876d.setOnClickListener(new ViewOnClickListenerC6464i(this, i10, dictionaryData));
        c8298i0M10396u0.f44874b.setOnClickListener(new ViewOnClickListenerC9466e(this, i10, c8298i0M10396u0));
        c8298i0M10396u0.f44877e.setOnEditorActionListener(new C4895d(dictionaryData));
        c8298i0M10396u0.f44875c.setOnClickListener(new ViewOnClickListenerC9029m(this, 23, dictionaryData));
        Object systemService = m3576Y().getSystemService("clipboard");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f31860U0 = (ClipboardManager) systemService;
        c8298i0M10396u0.f44881i.setOnClickListener(new ViewOnClickListenerC9734i(this, 21, c8298i0M10396u0));
        c8298i0M10396u0.f44879g.setText(C7076b.m14277B3(dictionaryData.f31173c).toString());
        m10396u0().f44882j.m4935d();
        view.postDelayed(new RunnableC0893g(4, c8298i0M10396u0, this, dictionaryData), 500L);
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView = c8298i0M10396u0.f44878f;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8045d(16));
        C4902a c4902a = new C4902a(new C4896e(c8298i0M10396u0, dictionaryData));
        this.f31856Q0 = c4902a;
        recyclerView.setAdapter(c4902a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4898x35052d6(this, Lifecycle.State.STARTED, null, this), 3);
        m10397v0().m10382w2();
        m10397v0().m10383x2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: u0 */
    public final C8298i0 m10396u0() {
        return (C8298i0) this.f31857R0.m10489a(this, f31855Y0[0]);
    }

    /* JADX INFO: renamed from: v0 */
    public final TokenViewModel m10397v0() {
        return (TokenViewModel) this.f31858S0.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10398w0(View view, DictionaryData dictionaryData) {
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(m3578a0(), view);
        if (m10396u0().f44877e.getText() != null && !C5207g.m11106a(String.valueOf(m10396u0().f44877e.getText()), "")) {
            String str = dictionaryData.f31174d;
            Editable text = m10396u0().f44877e.getText();
            C5207g.m11108c(text);
            TokenViewModel.m10374s2(m10397v0(), new TokenMeaning(0, str, text.toString(), 0, false, m10397v0().mo507p1(), true, 0), true);
            WebView webView = m10396u0().f44883k;
            C5207g.m11110e(webView, "binding.wvDictionary");
            C4924a.m10442U(webView);
        }
        mo3766m0();
    }
}
