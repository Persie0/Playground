package com.lingq.feature.reader.old.settings;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingq.core.achievements.views.StreakActivityLevelView;
import com.lingq.feature.reader.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.vi3;
import p000.ze3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LessonReviewMenuFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonReviewMenuFragment$binding$2 f29432i = new LessonReviewMenuFragment$binding$2(1, ze3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentReaderReviewMenuBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.tvLessonTitle;
        TextView textView = (TextView) lfa.m16159c(view, i);
        if (textView != null) {
            i = R$id.tvLingQs;
            TextView textView2 = (TextView) lfa.m16159c(view, i);
            if (textView2 != null) {
                i = R$id.tvLingQsLabel;
                if (((TextView) lfa.m16159c(view, i)) != null) {
                    i = R$id.tvPages;
                    TextView textView3 = (TextView) lfa.m16159c(view, i);
                    if (textView3 != null) {
                        i = R$id.tvReviewAll;
                        TextView textView4 = (TextView) lfa.m16159c(view, i);
                        if (textView4 != null) {
                            i = R$id.tvReviewDue;
                            TextView textView5 = (TextView) lfa.m16159c(view, i);
                            if (textView5 != null) {
                                i = R$id.tvReviewPage;
                                TextView textView6 = (TextView) lfa.m16159c(view, i);
                                if (textView6 != null) {
                                    i = R$id.tvVocabulary;
                                    TextView textView7 = (TextView) lfa.m16159c(view, i);
                                    if (textView7 != null) {
                                        i = R$id.tvWords;
                                        TextView textView8 = (TextView) lfa.m16159c(view, i);
                                        if (textView8 != null) {
                                            i = R$id.tvWordsLabel;
                                            if (((TextView) lfa.m16159c(view, i)) != null) {
                                                i = R$id.viewCurrentStreak;
                                                StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) lfa.m16159c(view, i);
                                                if (streakActivityLevelView != null) {
                                                    i = R$id.viewLessonInfo;
                                                    if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                                                        i = R$id.viewMenu;
                                                        CardView cardView = (CardView) lfa.m16159c(view, i);
                                                        if (cardView != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                            i = R$id.viewReviewMenu;
                                                            LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                                                            if (linearLayout != null) {
                                                                i = R$id.viewStreak;
                                                                CardView cardView2 = (CardView) lfa.m16159c(view, i);
                                                                if (cardView2 != null) {
                                                                    return new ze3(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, streakActivityLevelView, cardView, relativeLayout, linearLayout, cardView2);
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
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
