package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8280f0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonCompleteFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8280f0> {

    /* JADX INFO: renamed from: j */
    public static final LessonCompleteFragment$binding$2 f28902j = new LessonCompleteFragment$binding$2();

    public LessonCompleteFragment$binding$2() {
        super(1, C8280f0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonCompleteBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8280f0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.btnNextLesson;
            Button button = (Button) C0062b.m298P0(view2, R.id.btnNextLesson);
            if (button != null) {
                i10 = R.id.rvStats;
                RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvStats);
                if (recyclerView != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                    if (materialToolbar != null) {
                        i10 = R.id.tv_session_complete;
                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tv_session_complete);
                        if (textView != null) {
                            i10 = R.id.tvViewAll;
                            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvViewAll);
                            if (textView2 != null) {
                                i10 = R.id.viewCompleted;
                                NestedScrollView nestedScrollView = (NestedScrollView) C0062b.m298P0(view2, R.id.viewCompleted);
                                if (nestedScrollView != null) {
                                    i10 = R.id.viewContent;
                                    RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewContent);
                                    if (relativeLayout != null) {
                                        return new C8280f0(appBarLayout, button, recyclerView, materialToolbar, textView, textView2, nestedScrollView, relativeLayout);
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
