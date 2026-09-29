package com.lingq.p055ui.onboarding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.Metadata;
import ni.C7796d;
import p067d8.ViewOnClickListenerC5062d0;
import p254m2.C7472a;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.InterfaceC7774a;
import p322pd.C8228i;
import p402u0.C9369l;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8275e1;
import sj.AbstractC9047f;
import tj.C9296f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/onboarding/OnboardingTopicsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class OnboardingTopicsFragment extends AbstractC9047f {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29419D0 = {C0204c.m857q(OnboardingTopicsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentOnboardingTopicsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29420A0;

    /* JADX INFO: renamed from: B0 */
    public C9296f f29421B0;

    /* JADX INFO: renamed from: C0 */
    public C7796d f29422C0;

    /* JADX INFO: renamed from: com.lingq.ui.onboarding.OnboardingTopicsFragment$a */
    public static final class C4506a implements InterfaceC7774a<C9296f.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8275e1 f29423a;

        public C4506a(C8275e1 c8275e1) {
            this.f29423a = c8275e1;
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C9296f.a aVar) {
            C5207g.m11111f(aVar, "it");
            this.f29423a.f44719d.setEnabled(true);
        }
    }

    public OnboardingTopicsFragment() {
        super(R.layout.fragment_onboarding_topics);
        this.f29420A0 = C4924a.m10477o0(this, OnboardingTopicsFragment$binding$2.f29424j);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9369l c9369l = new C9369l(24, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9369l);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C7796d c7796d = this.f29422C0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "onboarding_topics");
        C8275e1 c8275e1M10238n0 = m10238n0();
        c8275e1M10238n0.f44718c.setTitle("");
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8275e1M10238n0.f44718c;
        materialToolbar.setNavigationIcon(drawableM14849b);
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC7718c(26, this));
        m3578a0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(m3599s().getInteger(R.integer.onboarding_topic_grid_columns));
        RecyclerView recyclerView = c8275e1M10238n0.f44717b;
        recyclerView.setLayoutManager(gridLayoutManager);
        C9296f c9296f = new C9296f(m3578a0());
        this.f29421B0 = c9296f;
        c9296f.f48017e = new C4506a(c8275e1M10238n0);
        recyclerView.setAdapter(c9296f);
        MaterialButton materialButton = c8275e1M10238n0.f44719d;
        materialButton.setEnabled(true);
        materialButton.setOnClickListener(new ViewOnClickListenerC5062d0(16, this));
    }

    /* JADX INFO: renamed from: n0 */
    public final C8275e1 m10238n0() {
        return (C8275e1) this.f29420A0.m10489a(this, f29419D0[0]);
    }
}
