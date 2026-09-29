package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.lesson.LessonProgressBar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8316l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class SentenceEditPagerFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8316l0> {

    /* JADX INFO: renamed from: j */
    public static final SentenceEditPagerFragment$binding$2 f28091j = new SentenceEditPagerFragment$binding$2();

    public SentenceEditPagerFragment$binding$2() {
        super(1, C8316l0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonEditSentencePagerBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8316l0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnDone;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnDone);
        if (textView != null) {
            i10 = R.id.lpbSentences;
            LessonProgressBar lessonProgressBar = (LessonProgressBar) C0062b.m298P0(view2, R.id.lpbSentences);
            if (lessonProgressBar != null) {
                i10 = R.id.pagerSentences;
                ViewPager2 viewPager2 = (ViewPager2) C0062b.m298P0(view2, R.id.pagerSentences);
                if (viewPager2 != null) {
                    i10 = R.id.progress_view;
                    if (((LinearLayout) C0062b.m298P0(view2, R.id.progress_view)) != null) {
                        i10 = R.id.view_back;
                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.view_back);
                        if (linearLayout != null) {
                            i10 = R.id.viewProgress;
                            if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                i10 = R.id.viewTop;
                                if (((RelativeLayout) C0062b.m298P0(view2, R.id.viewTop)) != null) {
                                    return new C8316l0(textView, lessonProgressBar, viewPager2, linearLayout);
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
