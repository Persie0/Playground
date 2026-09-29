package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.CollapsibleToolbar;
import com.lingq.commons.p053ui.views.PagesIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8389z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class VocabularyFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8389z> {

    /* JADX INFO: renamed from: j */
    public static final VocabularyFragment$binding$2 f26142j = new VocabularyFragment$binding$2();

    public VocabularyFragment$binding$2() {
        super(1, C8389z.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomeVocabularyBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8389z mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.btnAdd;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnAdd);
            if (imageButton != null) {
                i10 = R.id.btnMore;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnMore);
                if (imageButton2 != null) {
                    i10 = R.id.btnReview;
                    MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnReview);
                    if (materialButton != null) {
                        i10 = R.id.collapse_toolbar;
                        if (((CollapsibleToolbar) C0062b.m298P0(view2, R.id.collapse_toolbar)) != null) {
                            i10 = R.id.fragment_container_token;
                            if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_container_token)) != null) {
                                i10 = R.id.ivPlaylist;
                                if (((ImageView) C0062b.m298P0(view2, R.id.ivPlaylist)) != null) {
                                    i10 = R.id.pagesIndicator;
                                    PagesIndicator pagesIndicator = (PagesIndicator) C0062b.m298P0(view2, R.id.pagesIndicator);
                                    if (pagesIndicator != null) {
                                        i10 = R.id.rvVocabulary;
                                        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvVocabulary);
                                        if (recyclerView != null) {
                                            i10 = R.id.swipe_container;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                                            if (swipeRefreshLayout != null) {
                                                i10 = R.id.tvTitle;
                                                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                                                    i10 = R.id.viewProgress;
                                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                                    if (circularProgressIndicator != null) {
                                                        i10 = R.id.viewVocabulary;
                                                        if (((FrameLayout) C0062b.m298P0(view2, R.id.viewVocabulary)) != null) {
                                                            return new C8389z((CoordinatorLayout) view2, imageButton, imageButton2, materialButton, pagesIndicator, recyclerView, swipeRefreshLayout, circularProgressIndicator);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
