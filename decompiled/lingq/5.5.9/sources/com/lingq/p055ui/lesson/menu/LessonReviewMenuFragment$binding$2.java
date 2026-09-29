package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8340p0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonReviewMenuFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8340p0> {

    /* JADX INFO: renamed from: j */
    public static final LessonReviewMenuFragment$binding$2 f28274j = new LessonReviewMenuFragment$binding$2();

    public LessonReviewMenuFragment$binding$2() {
        super(1, C8340p0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonReviewMenuBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8340p0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.tvLessonTitle;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvLessonTitle);
        if (textView != null) {
            i10 = R.id.tvLingQs;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvLingQs);
            if (textView2 != null) {
                i10 = R.id.tvLingQsLabel;
                if (((TextView) C0062b.m298P0(view2, R.id.tvLingQsLabel)) != null) {
                    i10 = R.id.tvPages;
                    TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvPages);
                    if (textView3 != null) {
                        i10 = R.id.tvReviewAll;
                        TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvReviewAll);
                        if (textView4 != null) {
                            i10 = R.id.tvReviewDue;
                            TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tvReviewDue);
                            if (textView5 != null) {
                                i10 = R.id.tvReviewPage;
                                TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tvReviewPage);
                                if (textView6 != null) {
                                    i10 = R.id.tvVocabulary;
                                    TextView textView7 = (TextView) C0062b.m298P0(view2, R.id.tvVocabulary);
                                    if (textView7 != null) {
                                        i10 = R.id.tvWords;
                                        TextView textView8 = (TextView) C0062b.m298P0(view2, R.id.tvWords);
                                        if (textView8 != null) {
                                            i10 = R.id.tvWordsLabel;
                                            if (((TextView) C0062b.m298P0(view2, R.id.tvWordsLabel)) != null) {
                                                i10 = R.id.viewCenter;
                                                if (C0062b.m298P0(view2, R.id.viewCenter) != null) {
                                                    i10 = R.id.viewCurrentStreak;
                                                    StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) C0062b.m298P0(view2, R.id.viewCurrentStreak);
                                                    if (streakActivityLevelView != null) {
                                                        i10 = R.id.viewMenu;
                                                        CardView cardView = (CardView) C0062b.m298P0(view2, R.id.viewMenu);
                                                        if (cardView != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view2;
                                                            i10 = R.id.viewReviewMenu;
                                                            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewReviewMenu);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.viewStreak;
                                                                CardView cardView2 = (CardView) C0062b.m298P0(view2, R.id.viewStreak);
                                                                if (cardView2 != null) {
                                                                    return new C8340p0(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, streakActivityLevelView, cardView, relativeLayout, linearLayout, cardView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
