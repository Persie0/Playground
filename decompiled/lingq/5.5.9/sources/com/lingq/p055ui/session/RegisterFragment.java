package com.lingq.p055ui.session;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.C0204c;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import bb.C1350a;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C7076b;
import ni.C7796d;
import ni.C7797e;
import no.C7828f;
import org.joda.time.DateTime;
import p003a2.C0009a;
import p015ak.AbstractC0105b;
import p015ak.ViewOnClickListenerC0111h;
import p046cb.C1760b;
import p067d8.ViewOnClickListenerC5062d0;
import p070db.C5133m;
import p071dc.C5142a;
import p071dc.C5143b;
import p071dc.C5146e;
import p152hb.C5965e;
import p152hb.C5978i0;
import p152hb.C6000p1;
import p152hb.C6003q1;
import p152hb.C6009s1;
import p152hb.C6027y1;
import p152hb.InterfaceC5968f;
import p176ib.C6254b;
import p176ib.C6272i;
import p176ib.C6282n;
import p225kk.C6704a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p274n8.C7729n;
import p278nh.C7776c;
import p286o2.C7906f;
import p291o7.InterfaceC8000j;
import p322pd.C8228i;
import p326q.AbstractC8451g;
import p326q.C8446b;
import p326q.C8452h;
import p338qd.C8573r0;
import p402u0.C9370m;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8287g1;
import sj.C9050i;
import sj.ViewOnClickListenerC9058q;
import sl.InterfaceC9070c;
import tk.C9312p;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/session/RegisterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RegisterFragment extends AbstractC0105b {

    /* JADX INFO: renamed from: J0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30733J0 = {C0204c.m857q(RegisterFragment.class, "getBinding()Lcom/lingq/databinding/FragmentRegisterBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f30734A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f30735B0;

    /* JADX INFO: renamed from: C0 */
    public CallbackManagerImpl f30736C0;

    /* JADX INFO: renamed from: D0 */
    public String f30737D0;

    /* JADX INFO: renamed from: E0 */
    public C5978i0 f30738E0;

    /* JADX INFO: renamed from: F0 */
    public String f30739F0;

    /* JADX INFO: renamed from: G0 */
    public C6704a f30740G0;

    /* JADX INFO: renamed from: H0 */
    public C7797e f30741H0;

    /* JADX INFO: renamed from: I0 */
    public C7796d f30742I0;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC4739a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8287g1 f30743a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RegisterFragment f30744b;

        public ViewTreeObserverOnGlobalLayoutListenerC4739a(C8287g1 c8287g1, RegisterFragment registerFragment) {
            this.f30743a = c8287g1;
            this.f30744b = registerFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C8287g1 c8287g1 = this.f30743a;
            c8287g1.f44800d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ScrollView scrollView = c8287g1.f44800d;
            int measuredHeight = scrollView.getMeasuredHeight() - scrollView.getChildAt(0).getHeight();
            TextView textView = c8287g1.f44809m;
            TextView textView2 = c8287g1.f44808l;
            RegisterFragment registerFragment = this.f30744b;
            if (measuredHeight < 0) {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setTransformationMethod(null);
                textView.setMovementMethod(C7776c.f42711a);
                List<Integer> list = C6716m.f37937a;
                Context contextM3578a0 = registerFragment.m3578a0();
                String strM3600t = registerFragment.m3600t(R.string.welcome_by_using_lingq);
                C5207g.m11110e(strM3600t, "getString(R.string.welcome_by_using_lingq)");
                textView.setText(C6716m.m13332q(contextM3578a0, strM3600t), TextView.BufferType.SPANNABLE);
                return;
            }
            textView2.setVisibility(0);
            textView.setVisibility(8);
            textView2.setTransformationMethod(null);
            textView2.setMovementMethod(C7776c.f42711a);
            List<Integer> list2 = C6716m.f37937a;
            Context contextM3578a1 = registerFragment.m3578a0();
            String strM3600t2 = registerFragment.m3600t(R.string.welcome_by_using_lingq);
            C5207g.m11110e(strM3600t2, "getString(R.string.welcome_by_using_lingq)");
            textView2.setText(C6716m.m13332q(contextM3578a1, strM3600t2), TextView.BufferType.SPANNABLE);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$b */
    public static final class C4740b implements InterfaceC8000j<C7729n> {
        public C4740b() {
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: a */
        public final void mo10337a() {
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: b */
        public final void mo10338b(FacebookException facebookException) {
            Toast.makeText(RegisterFragment.this.m3578a0(), facebookException.getMessage(), 0).show();
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: c */
        public final void mo10339c(C7729n c7729n) {
            Date date = AccessToken.f11370l;
            AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
            String str = accessTokenM6595b != null ? accessTokenM6595b.f11375e : null;
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.f30737D0 = str;
            registerFragment.m10340n0(2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$c */
    public static final class C4741c implements TextWatcher {
        public C4741c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            AuthenticationViewModel.m10328s2(RegisterFragment.this.m10343q0(), String.valueOf(charSequence), null, 2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$d */
    public static final class C4742d implements TextWatcher {
        public C4742d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            AuthenticationViewModel.m10328s2(RegisterFragment.this.m10343q0(), null, String.valueOf(charSequence), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$1] */
    public RegisterFragment() {
        super(R.layout.fragment_register);
        this.f30734A0 = C4924a.m10477o0(this, RegisterFragment$binding$2.f30746j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$2
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
        this.f30735B0 = C8573r0.m16711Z(this, C5209i.m11118a(AuthenticationViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.session.RegisterFragment$special$$inlined$viewModels$default$5
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: D */
    public final void mo3559D(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        super.mo3559D(i10, i11, intent);
        if (i10 != 9001) {
            CallbackManagerImpl callbackManagerImpl = this.f30736C0;
            if (callbackManagerImpl != null) {
                callbackManagerImpl.mo6662a(i10, i11, intent);
            }
        } else if (intent != null) {
            C1350a.f8183b.getClass();
            C1760b c1760bM10912b = C5133m.m10912b(intent);
            if (c1760bM10912b.f9660a.m7534q() && (googleSignInAccount = c1760bM10912b.f9661b) != null) {
                this.f30739F0 = googleSignInAccount.f13806g;
                m10340n0(3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        C5978i0 c5978i0 = this.f30738E0;
        if (c5978i0 != null) {
            c5978i0.m12430m(m3576Y());
        }
        C5978i0 c5978i1 = this.f30738E0;
        if (c5978i1 != null) {
            c5978i1.mo7556d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        int i10 = 18;
        C9371n c9371n = new C9371n(18, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9371n);
        int i11 = 1;
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C7796d c7796d = this.f30742I0;
        boolean z10 = false;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "onboarding_register");
        C6704a c6704a = this.f30740G0;
        if (c6704a == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        c6704a.f37891b.edit().clear().commit();
        this.f30736C0 = new CallbackManagerImpl();
        C8287g1 c8287g1M10341o0 = m10341o0();
        MaterialToolbar materialToolbar = c8287g1M10341o0.f44802f;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        materialToolbar.setNavigationIcon(C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back));
        MaterialToolbar materialToolbar2 = c8287g1M10341o0.f44802f;
        List<Integer> list = C6716m.f37937a;
        materialToolbar2.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        c8287g1M10341o0.f44802f.setNavigationOnClickListener(new ViewOnClickListenerC9058q(i11, this));
        c8287g1M10341o0.f44802f.setOnMenuItemClickListener(new C9370m(18, c8287g1M10341o0));
        c8287g1M10341o0.f44805i.setOnClickListener(new ViewOnClickListenerC5062d0(i10, this));
        Drawable drawableM14849b = C7472a.c.m14849b(m3578a0(), R.drawable.com_facebook_button_icon);
        if (drawableM14849b != null) {
            drawableM14849b.setBounds(0, 0, (int) (drawableM14849b.getIntrinsicWidth() * 1.45f), (int) (drawableM14849b.getIntrinsicHeight() * 1.45f));
            m10341o0().f44797a.setCompoundDrawables(drawableM14849b, null, null, null);
            m10341o0().f44797a.setCompoundDrawablePadding(m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_textpadding));
            m10341o0().f44797a.setPadding(m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_lr), m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_top), 0, m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_bottom));
        }
        CallbackManagerImpl callbackManagerImpl = this.f30736C0;
        if (callbackManagerImpl != null) {
            c8287g1M10341o0.f44797a.setPermissions("email");
            c8287g1M10341o0.f44797a.m6737j(callbackManagerImpl, new C4740b());
        }
        c8287g1M10341o0.f44801e.setOnClickListener(new ViewOnClickListenerC2238x(28, this));
        GoogleSignInOptions.C2540a c2540a = new GoogleSignInOptions.C2540a(GoogleSignInOptions.f13818l);
        c2540a.f13830a.add(GoogleSignInOptions.f13813I);
        c2540a.f13830a.add(GoogleSignInOptions.f13812H);
        c2540a.f13830a.add(GoogleSignInOptions.f13814J);
        c2540a.m7525b();
        GoogleSignInOptions googleSignInOptionsM7524a = c2540a.m7524a();
        Context contextM3578a1 = m3578a0();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C8446b c8446b = new C8446b();
        C8446b c8446b2 = new C8446b();
        C2548c c2548c = C2548c.f13920d;
        C5143b c5143b = C5146e.f33122a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = contextM3578a1.getMainLooper();
        String packageName = contextM3578a1.getPackageName();
        String name = contextM3578a1.getClass().getName();
        ActivityC0979t activityC0979tM3576Y = m3576Y();
        AbstractC2544c.b bVar = new AbstractC2544c.b() { // from class: ak.g
            @Override // p152hb.InterfaceC5980j
            /* JADX INFO: renamed from: j */
            public final void mo494j(ConnectionResult connectionResult) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
                C5207g.m11111f(connectionResult, "it");
            }
        };
        C5965e c5965e = new C5965e(activityC0979tM3576Y);
        C2542a<GoogleSignInOptions> c2542a = C1350a.f8182a;
        C6272i.m12916j(c2542a, "Api must not be null");
        c8446b2.put(c2542a, googleSignInOptionsM7524a);
        C2542a.d dVar = c2542a.f13884a;
        C6272i.m12916j(dVar, "Base client builder must not be null");
        List listMo4929a = dVar.mo4929a(googleSignInOptionsM7524a);
        hashSet2.addAll(listMo4929a);
        hashSet.addAll(listMo4929a);
        C6272i.m12907a("must call addApi() to add at least one API", !c8446b2.isEmpty());
        C5142a c5142a = C5142a.f33121a;
        C2542a<C5142a> c2542a2 = C5146e.f33123b;
        if (c8446b2.containsKey(c2542a2)) {
            c5142a = (C5142a) c8446b2.getOrDefault(c2542a2, null);
        }
        C8446b c8446b3 = c8446b2;
        C6254b c6254b = new C6254b(null, hashSet, c8446b, packageName, name, c5142a);
        Map<C2542a<?>, C6282n> map = c6254b.f36442d;
        C8446b c8446b4 = new C8446b();
        C8446b c8446b5 = new C8446b();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((AbstractC8451g.c) c8446b3.keySet()).iterator();
        C2542a c2542a3 = null;
        C8452h c8452h = c8446b3;
        while (true) {
            AbstractC8451g.a aVar = (AbstractC8451g.a) it;
            if (!aVar.hasNext()) {
                C8287g1 c8287g1 = c8287g1M10341o0;
                C2542a c2542a4 = c2542a3;
                ArrayList arrayList4 = arrayList3;
                C8446b c8446b6 = c8446b5;
                C8446b c8446b7 = c8446b4;
                if (c2542a4 != null) {
                    boolean zEquals = hashSet.equals(hashSet2);
                    Object[] objArr = {c2542a4.f13886c};
                    if (!zEquals) {
                        throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                    }
                }
                C5978i0 c5978i0 = new C5978i0(contextM3578a1, new ReentrantLock(), mainLooper, c6254b, c2548c, c5143b, c8446b7, arrayList, arrayList2, c8446b6, 0, C5978i0.m12423n(c8446b6.values(), true), arrayList4);
                Set<AbstractC2544c> set = AbstractC2544c.f13900a;
                synchronized (set) {
                    set.add(c5978i0);
                }
                InterfaceC5968f interfaceC5968fM7571c = LifecycleCallback.m7571c(c5965e);
                C6003q1 c6003q1 = (C6003q1) interfaceC5968fM7571c.mo12395c(C6003q1.class, "AutoManageHelper");
                if (c6003q1 == null) {
                    c6003q1 = new C6003q1(interfaceC5968fM7571c);
                }
                boolean z11 = c6003q1.f35578f.indexOfKey(0) < 0;
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append("Already managing a GoogleApiClient with id 0");
                C6272i.m12917k(sb2.toString(), z11);
                C6009s1 c6009s1 = c6003q1.f35615c.get();
                boolean z12 = c6003q1.f35614b;
                String strValueOf = String.valueOf(c6009s1);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 49);
                sb3.append("starting AutoManage for client 0 ");
                sb3.append(z12);
                sb3.append(" ");
                sb3.append(strValueOf);
                Log.d("AutoManageHelper", sb3.toString());
                C6000p1 c6000p1 = new C6000p1(c6003q1, 0, c5978i0, bVar);
                c5978i0.m12429l(c6000p1);
                c6003q1.f35578f.put(0, c6000p1);
                if (c6003q1.f35614b && c6009s1 == null) {
                    Log.d("AutoManageHelper", "connecting ".concat(c5978i0.toString()));
                    c5978i0.mo7555a();
                }
                this.f30738E0 = c5978i0;
                Typeface typefaceM15674a = C7906f.m15674a(R.font.font_rubik, m3578a0());
                c8287g1.f44807k.setInputType(129);
                c8287g1.f44807k.setTypeface(typefaceM15674a, 1);
                c8287g1.f44798b.setOnClickListener(new ViewOnClickListenerC0111h(0, this));
                c8287g1.f44805i.setText(m3600t(R.string.welcome_already_signed_up) + " " + m3600t(R.string.welcome_log_in_button));
                TextInputEditText textInputEditText = c8287g1.f44810n;
                C5207g.m11110e(textInputEditText, "tvUsername");
                textInputEditText.addTextChangedListener(new C4741c());
                TextInputEditText textInputEditText2 = c8287g1.f44804h;
                C5207g.m11110e(textInputEditText2, "tvEmail");
                textInputEditText2.addTextChangedListener(new C4742d());
                c8287g1.f44800d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4739a(c8287g1, this));
                C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4748x255ab6f3(this, Lifecycle.State.STARTED, null, this, c8287g1), 3);
                return;
            }
            C2542a c2542a5 = (C2542a) aVar.next();
            C8452h c8452h2 = c8452h;
            Object orDefault = c8452h2.getOrDefault(c2542a5, z10);
            boolean z13 = map.get(c2542a5) != null ? i11 : 0;
            c8446b4.put(c2542a5, Boolean.valueOf(z13));
            C6027y1 c6027y1 = new C6027y1(c2542a5, z13);
            arrayList3.add(c6027y1);
            C2542a.a<?, O> aVar2 = c2542a5.f13884a;
            C6272i.m12915i(aVar2);
            Map<C2542a<?>, C6282n> map2 = map;
            C2542a c2542a6 = c2542a3;
            ArrayList arrayList5 = arrayList3;
            C8287g1 c8287g2 = c8287g1M10341o0;
            C8446b c8446b8 = c8446b5;
            C8446b c8446b9 = c8446b4;
            C2542a.e eVarMo4928b = aVar2.mo4928b(contextM3578a1, mainLooper, c6254b, (O) orDefault, c6027y1, c6027y1);
            c8446b8.put(c2542a5.f13885b, eVarMo4928b);
            if (!eVarMo4928b.mo7539c()) {
                c2542a3 = c2542a6;
            } else {
                if (c2542a6 != null) {
                    String str = c2542a5.f13886c;
                    String str2 = c2542a6.f13886c;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                    sb4.append(str);
                    sb4.append(" cannot be used with ");
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
                c2542a3 = c2542a5;
            }
            c8446b5 = c8446b8;
            c8446b4 = c8446b9;
            c8452h = c8452h2;
            map = map2;
            arrayList3 = arrayList5;
            c8287g1M10341o0 = c8287g2;
            i11 = 1;
            z10 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:40:0x0171  */
    /* JADX WARN: Code duplicated, block: B:41:0x017a  */
    /* JADX WARN: Code duplicated, block: B:43:0x017d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0184  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x0203  */
    /* JADX WARN: Code duplicated, block: B:57:0x0205  */
    /* JADX WARN: Code duplicated, block: B:59:0x0208  */
    /* JADX WARN: Code duplicated, block: B:65:0x0227  */
    /* JADX WARN: Code duplicated, block: B:68:0x022c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0247  */
    /* JADX WARN: Code duplicated, block: B:73:0x024e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x0258  */
    /* JADX WARN: Code duplicated, block: B:78:0x025b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0292  */
    /* JADX WARN: Code duplicated, block: B:82:0x0299  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n0 */
    public final void m10340n0(int i10) {
        String str;
        boolean z10;
        View currentFocus;
        IBinder windowToken;
        String strM15515h;
        AbstractC4949k abstractC4949kM10564b;
        Map map;
        Context context;
        String networkCountryIso;
        boolean z11;
        boolean z12;
        String str2;
        String str3;
        String strM15515h2;
        AbstractC4949k abstractC4949kM10564b2;
        Map map2;
        String str4;
        if (m10342p0().m15512e()) {
            Bundle bundle = new Bundle();
            String str5 = C9050i.f47331a;
            bundle.putString("Registration started client", "android");
            bundle.putString("Registration started date", new DateTime().toString());
            bundle.putString("Registration started language", str5);
            if (i10 == 1) {
                str = "Email";
            } else if (i10 == 2) {
                str = "Facebook";
            } else if (i10 != 3) {
                str = "Email";
            } else {
                str = "Google";
            }
            bundle.putString("Registration started method", str);
            C7796d c7796d = this.f30742I0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(bundle, "Registration started");
            String string = C7076b.m14277B3(String.valueOf(m10341o0().f44803g.getText())).toString();
            C5207g.m11111f(string, "<set-?>");
            C9050i.f47335e = string;
            if (i10 != 1) {
                if (i10 == 2) {
                    AuthenticationViewModel authenticationViewModelM10343q0 = m10343q0();
                    C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10343q0), null, null, new AuthenticationViewModel$registerFacebook$1(authenticationViewModelM10343q0, this.f30737D0, m10342p0().m15511d(), str5, null), 3);
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    AuthenticationViewModel authenticationViewModelM10343q1 = m10343q0();
                    C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10343q1), null, null, new AuthenticationViewModel$registerGoogle$1(authenticationViewModelM10343q1, this.f30739F0, m10342p0().m15511d(), str5, null), 3);
                    return;
                }
            }
            C8287g1 c8287g1M10341o0 = m10341o0();
            c8287g1M10341o0.f44810n.setError(null);
            TextInputEditText textInputEditText = c8287g1M10341o0.f44807k;
            textInputEditText.setError(null);
            TextInputEditText textInputEditText2 = c8287g1M10341o0.f44806j;
            textInputEditText2.setError(null);
            TextInputEditText textInputEditText3 = c8287g1M10341o0.f44804h;
            textInputEditText3.setError(null);
            TextInputEditText textInputEditText4 = c8287g1M10341o0.f44810n;
            String string2 = C7076b.m14277B3(String.valueOf(textInputEditText4.getText())).toString();
            String string3 = C7076b.m14277B3(String.valueOf(textInputEditText.getText())).toString();
            String string4 = C7076b.m14277B3(String.valueOf(textInputEditText2.getText())).toString();
            String string5 = C7076b.m14277B3(String.valueOf(textInputEditText3.getText())).toString();
            String string6 = C7076b.m14277B3(String.valueOf(c8287g1M10341o0.f44803g.getText())).toString();
            if (TextUtils.isEmpty(string3)) {
                textInputEditText.setError(m3600t(R.string.register_field_filled));
                z10 = true;
            } else {
                z10 = false;
                textInputEditText = null;
            }
            if (TextUtils.isEmpty(string4)) {
                textInputEditText2.setError(m3600t(R.string.register_field_filled));
                z10 = true;
            } else {
                textInputEditText2 = textInputEditText;
            }
            if (!TextUtils.isEmpty(string5)) {
                if (C4924a.m10426E(string5)) {
                    textInputEditText3 = textInputEditText2;
                } else {
                    textInputEditText3.setError(m3600t(R.string.register_email_valid));
                }
                if (TextUtils.isEmpty(string2)) {
                    textInputEditText4.setError(m3600t(R.string.register_field_filled));
                    z10 = true;
                } else {
                    textInputEditText4 = textInputEditText3;
                }
                if (z10) {
                    C5207g.m11108c(textInputEditText4);
                    textInputEditText4.requestFocus();
                } else {
                    RelativeLayout relativeLayout = c8287g1M10341o0.f44799c;
                    C5207g.m11110e(relativeLayout, "progressLayout");
                    C4924a.m10442U(relativeLayout);
                    currentFocus = m3576Y().getCurrentFocus();
                    Object systemService = m3576Y().getSystemService("input_method");
                    C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    if (currentFocus != null) {
                        windowToken = currentFocus.getWindowToken();
                    } else {
                        windowToken = null;
                    }
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
                if (z10) {
                }
                C7797e c7797eM10342p0 = m10342p0();
                strM15515h = c7797eM10342p0.m15515h("country_list.txt");
                abstractC4949kM10564b = new C4955q(new C4955q.a()).m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                if (strM15515h != null) {
                    map = (Map) abstractC4949kM10564b.m10532b(strM15515h);
                } else {
                    map = null;
                }
                context = c7797eM10342p0.f42873a;
                Object systemService2 = context.getSystemService("phone");
                C5207g.m11109d(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                networkCountryIso = ((TelephonyManager) systemService2).getNetworkCountryIso();
                C5207g.m11110e(networkCountryIso, "current");
                if (networkCountryIso.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    networkCountryIso = context.getResources().getConfiguration().getLocales().get(0).getCountry();
                }
                if (map != null || map.isEmpty()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    str2 = "Canada";
                } else {
                    C5207g.m11110e(networkCountryIso, "current");
                    Locale locale = Locale.US;
                    C5207g.m11110e(locale, "US");
                    String upperCase = networkCountryIso.toUpperCase(locale);
                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    str2 = (String) map.get(upperCase);
                    if (str2 != null) {
                        str2 = "Korea, North";
                    } else if (C5207g.m11106a(str2, "Canada")) {
                        str2 = "Canada";
                    }
                }
                if (C5207g.m11106a(str2, "Canada")) {
                    str3 = "BC";
                } else {
                    str3 = null;
                }
                String str6 = C9050i.f47332b;
                AuthenticationViewModel authenticationViewModelM10343q2 = m10343q0();
                Integer numValueOf = Integer.valueOf(Integer.parseInt(str6));
                strM15515h2 = m10342p0().m15515h("language_list.txt");
                abstractC4949kM10564b2 = new C4955q(new C4955q.a()).m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                if (strM15515h2 != null) {
                    map2 = (Map) abstractC4949kM10564b2.m10532b(strM15515h2);
                } else {
                    map2 = null;
                }
                Locale locale2 = Locale.getDefault();
                if (map2 != null || (str4 = (String) map2.get(locale2.getLanguage())) == null) {
                    str4 = "English";
                }
                C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10343q2), null, null, new AuthenticationViewModel$register$1(authenticationViewModelM10343q2, string2, string5, string3, string4, str2, str3, numValueOf, str4, str5, string6, null), 3);
            }
            textInputEditText3.setError(m3600t(R.string.register_field_filled));
            z10 = true;
            if (TextUtils.isEmpty(string2)) {
                textInputEditText4.setError(m3600t(R.string.register_field_filled));
                z10 = true;
            } else {
                textInputEditText4 = textInputEditText3;
            }
            if (z10) {
                C5207g.m11108c(textInputEditText4);
                textInputEditText4.requestFocus();
            } else {
                RelativeLayout relativeLayout2 = c8287g1M10341o0.f44799c;
                C5207g.m11110e(relativeLayout2, "progressLayout");
                C4924a.m10442U(relativeLayout2);
                currentFocus = m3576Y().getCurrentFocus();
                Object systemService3 = m3576Y().getSystemService("input_method");
                C5207g.m11109d(systemService3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager2 = (InputMethodManager) systemService3;
                if (currentFocus != null) {
                    windowToken = currentFocus.getWindowToken();
                } else {
                    windowToken = null;
                }
                inputMethodManager2.hideSoftInputFromWindow(windowToken, 0);
            }
            if (z10) {
                C7797e c7797eM10342p1 = m10342p0();
                strM15515h = c7797eM10342p1.m15515h("country_list.txt");
                abstractC4949kM10564b = new C4955q(new C4955q.a()).m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                if (strM15515h != null) {
                    map = (Map) abstractC4949kM10564b.m10532b(strM15515h);
                } else {
                    map = null;
                }
                context = c7797eM10342p1.f42873a;
                Object systemService4 = context.getSystemService("phone");
                C5207g.m11109d(systemService4, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                networkCountryIso = ((TelephonyManager) systemService4).getNetworkCountryIso();
                C5207g.m11110e(networkCountryIso, "current");
                if (networkCountryIso.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    networkCountryIso = context.getResources().getConfiguration().getLocales().get(0).getCountry();
                }
                if (map != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (z12) {
                    C5207g.m11110e(networkCountryIso, "current");
                    Locale locale3 = Locale.US;
                    C5207g.m11110e(locale3, "US");
                    String upperCase2 = networkCountryIso.toUpperCase(locale3);
                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    str2 = (String) map.get(upperCase2);
                    if (str2 != null) {
                        str2 = "Korea, North";
                    } else if (C5207g.m11106a(str2, "Canada")) {
                        str2 = "Canada";
                    }
                } else {
                    str2 = "Canada";
                }
                if (C5207g.m11106a(str2, "Canada")) {
                    str3 = "BC";
                } else {
                    str3 = null;
                }
                String str7 = C9050i.f47332b;
                AuthenticationViewModel authenticationViewModelM10343q3 = m10343q0();
                Integer numValueOf2 = Integer.valueOf(Integer.parseInt(str7));
                strM15515h2 = m10342p0().m15515h("language_list.txt");
                abstractC4949kM10564b2 = new C4955q(new C4955q.a()).m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                if (strM15515h2 != null) {
                    map2 = (Map) abstractC4949kM10564b2.m10532b(strM15515h2);
                } else {
                    map2 = null;
                }
                Locale locale4 = Locale.getDefault();
                if (map2 != null) {
                    str4 = "English";
                } else {
                    str4 = "English";
                }
                C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10343q3), null, null, new AuthenticationViewModel$register$1(authenticationViewModelM10343q3, string2, string5, string3, string4, str2, str3, numValueOf2, str4, str5, string6, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final C8287g1 m10341o0() {
        return (C8287g1) this.f30734A0.m10489a(this, f30733J0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final C7797e m10342p0() {
        C7797e c7797e = this.f30741H0;
        if (c7797e != null) {
            return c7797e;
        }
        C5207g.m11117l("utils");
        throw null;
    }

    /* JADX INFO: renamed from: q0 */
    public final AuthenticationViewModel m10343q0() {
        return (AuthenticationViewModel) this.f30735B0.getValue();
    }
}
