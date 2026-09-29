package com.lingq.p055ui.onboarding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.Metadata;
import ni.C7796d;
import p040c4.C1676a;
import p118fe.C5509a;
import p225kk.C6716m;
import p254m2.C7472a;
import p278nh.InterfaceC7774a;
import p322pd.C8228i;
import p338qd.C8573r0;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8263c1;
import sj.AbstractC9045d;
import sj.C9050i;
import tj.C9293c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/onboarding/OnboardingLanguageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class OnboardingLanguageFragment extends AbstractC9045d {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29407D0 = {C0204c.m857q(OnboardingLanguageFragment.class, "getBinding()Lcom/lingq/databinding/FragmentOnboardingLanguageBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29408A0;

    /* JADX INFO: renamed from: B0 */
    public C9293c f29409B0;

    /* JADX INFO: renamed from: C0 */
    public C7796d f29410C0;

    /* JADX INFO: renamed from: com.lingq.ui.onboarding.OnboardingLanguageFragment$a */
    public static final class C4504a implements InterfaceC7774a<C9293c.a> {
        public C4504a() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C9293c.a aVar) {
            C9293c.a aVar2 = aVar;
            C5207g.m11111f(aVar2, "data");
            InterfaceC6727j<Object>[] interfaceC6727jArr = OnboardingLanguageFragment.f29407D0;
            OnboardingLanguageFragment onboardingLanguageFragment = OnboardingLanguageFragment.this;
            onboardingLanguageFragment.getClass();
            String str = C9050i.f47331a;
            String str2 = aVar2.f48005a;
            C5207g.m11111f(str2, "<set-?>");
            C9050i.f47331a = str2;
            C4924a.m10447Z(C8573r0.m16725g0(onboardingLanguageFragment), new C1676a(R.id.actionToOnboardingLevel));
        }
    }

    public OnboardingLanguageFragment() {
        super(R.layout.fragment_onboarding_language);
        this.f29408A0 = C4924a.m10477o0(this, OnboardingLanguageFragment$binding$2.f29412j);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(20, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, true);
        c8228i2.f48293c = 300L;
        m3587g0(c8228i2);
        C8228i c8228i3 = new C8228i(0, false);
        c8228i3.f48293c = 300L;
        m3589h0(c8228i3);
        C7796d c7796d = this.f29410C0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "onboarding_language");
        C8263c1 c8263c1 = (C8263c1) this.f29408A0.m10489a(this, f29407D0[0]);
        c8263c1.f44639c.setTitle("");
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8263c1.f44639c;
        materialToolbar.setNavigationIcon(drawableM14849b);
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2238x(24, this));
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8263c1.f44638b;
        recyclerView.setLayoutManager(linearLayoutManager);
        C9293c c9293c = new C9293c(m3578a0());
        this.f29409B0 = c9293c;
        recyclerView.setAdapter(c9293c);
        C9293c c9293c2 = this.f29409B0;
        if (c9293c2 != null) {
            c9293c2.f48004e = new C4504a();
        } else {
            C5207g.m11117l("chooseLanguageAdapter");
            throw null;
        }
    }
}
