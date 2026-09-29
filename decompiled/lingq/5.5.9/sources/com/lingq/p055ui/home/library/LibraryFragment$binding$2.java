package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.CollapsibleToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8369v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LibraryFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8369v> {

    /* JADX INFO: renamed from: j */
    public static final LibraryFragment$binding$2 f24647j = new LibraryFragment$binding$2();

    public LibraryFragment$binding$2() {
        super(1, C8369v.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomeLibraryBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8369v mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.btnSearch;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnSearch);
            if (imageButton != null) {
                i10 = R.id.btnSettings;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnSettings);
                if (imageButton2 != null) {
                    i10 = R.id.collapse_toolbar;
                    CollapsibleToolbar collapsibleToolbar = (CollapsibleToolbar) C0062b.m298P0(view2, R.id.collapse_toolbar);
                    if (collapsibleToolbar != null) {
                        i10 = R.id.ivFlag;
                        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivFlag);
                        if (imageView != null) {
                            i10 = R.id.rvCollections;
                            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvCollections);
                            if (recyclerView != null) {
                                i10 = R.id.swipe_container;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                                if (swipeRefreshLayout != null) {
                                    i10 = R.id.tvChangeLanguage;
                                    TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvChangeLanguage);
                                    if (textView != null) {
                                        i10 = R.id.tvLanguage;
                                        TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvLanguage);
                                        if (textView2 != null) {
                                            i10 = R.id.viewFlag;
                                            FrameLayout frameLayout = (FrameLayout) C0062b.m298P0(view2, R.id.viewFlag);
                                            if (frameLayout != null) {
                                                i10 = R.id.viewProgress;
                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                                if (circularProgressIndicator != null) {
                                                    return new C8369v((CoordinatorLayout) view2, appBarLayout, imageButton, imageButton2, collapsibleToolbar, imageView, recyclerView, swipeRefreshLayout, textView, textView2, frameLayout, circularProgressIndicator);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
