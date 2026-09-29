package com.lingq.p055ui.onboarding;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.Metadata;
import ni.C7796d;
import ni.C7797e;
import p076di.InterfaceC5179a;
import p118fe.C5509a;
import p322pd.C8227h;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8390z0;
import sj.AbstractC9044c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/onboarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class OnboardingFragment extends AbstractC9044c {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29401E0 = {C0204c.m857q(OnboardingFragment.class, "getBinding()Lcom/lingq/databinding/FragmentOnboardingBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29402A0;

    /* JADX INFO: renamed from: B0 */
    public C7796d f29403B0;

    /* JADX INFO: renamed from: C0 */
    public C7797e f29404C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC5179a f29405D0;

    public OnboardingFragment() {
        super(R.layout.fragment_onboarding);
        this.f29402A0 = C4924a.m10477o0(this, OnboardingFragment$binding$2.f29406j);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(19, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C8227h c8227h = new C8227h();
        c8227h.f48293c = 300L;
        m3585f0(c8227h);
        C8227h c8227h2 = new C8227h();
        c8227h2.f48293c = 300L;
        m3587g0(c8227h2);
        C7796d c7796d = this.f29403B0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15507d("existing_user", "no");
        C7796d c7796d2 = this.f29403B0;
        if (c7796d2 == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d2.m15505b(null, "onboarding_get_started");
        C8390z0 c8390z0 = (C8390z0) this.f29402A0.m10489a(this, f29401E0[0]);
        c8390z0.f45497b.setOnClickListener(new ViewOnClickListenerC2238x(23, this));
        c8390z0.f45496a.setOnClickListener(new ViewOnClickListenerC2239y(29, this));
    }
}
