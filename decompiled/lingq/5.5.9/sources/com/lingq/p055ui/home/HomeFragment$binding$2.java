package com.lingq.p055ui.home;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8359t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class HomeFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8359t> {

    /* JADX INFO: renamed from: j */
    public static final HomeFragment$binding$2 f22669j = new HomeFragment$binding$2();

    public HomeFragment$binding$2() {
        super(1, C8359t.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomeBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8359t mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.bottom_navigation_view;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) C0062b.m298P0(view2, R.id.bottom_navigation_view);
        if (bottomNavigationView != null) {
            i10 = R.id.fragment_top;
            if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_top)) != null) {
                i10 = R.id.nav_host_fragment;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C0062b.m298P0(view2, R.id.nav_host_fragment);
                if (fragmentContainerView != null) {
                    i10 = R.id.tvSwitchLanguage;
                    TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvSwitchLanguage);
                    if (textView != null) {
                        i10 = R.id.viewProgress;
                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewProgress);
                        if (linearLayout != null) {
                            return new C8359t(bottomNavigationView, fragmentContainerView, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
