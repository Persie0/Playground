package com.lingq.p020ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lingq.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.rd3;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HomeFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final HomeFragment$binding$2 f33898i = new HomeFragment$binding$2(1, rd3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomeBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.bottom_navigation_view;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) lfa.m16159c(view, i);
        if (bottomNavigationView != null) {
            i = R$id.nav_host_fragment;
            if (((FragmentContainerView) lfa.m16159c(view, i)) != null) {
                i = R$id.tvSwitchLanguage;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    i = R$id.viewBetaDialog;
                    ComposeView composeView = (ComposeView) lfa.m16159c(view, i);
                    if (composeView != null) {
                        i = R$id.viewProgress;
                        LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                        if (linearLayout != null) {
                            return new rd3(bottomNavigationView, textView, composeView, linearLayout);
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
