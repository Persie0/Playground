package com.lingq.feature.review.activities;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.core.token.components.ViewLearnProgress;
import com.lingq.feature.review.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.bf3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivityFlashcardFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivityFlashcardFragment$binding$2 f31919i = new ReviewActivityFlashcardFragment$binding$2(1, bf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivityFlashcardBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnTts;
        ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
        if (imageButton != null) {
            i = R$id.ibEditCard;
            if (((ImageButton) lfa.m16159c(view, i)) != null) {
                i = R$id.rvTags;
                RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
                if (recyclerView != null) {
                    i = R$id.tv_alt_script;
                    TextView textView = (TextView) lfa.m16159c(view, i);
                    if (textView != null) {
                        i = R$id.tv_phrase;
                        TextView textView2 = (TextView) lfa.m16159c(view, i);
                        if (textView2 != null) {
                            i = R$id.tv_term;
                            TextView textView3 = (TextView) lfa.m16159c(view, i);
                            if (textView3 != null) {
                                i = R$id.tv_translation;
                                TextView textView4 = (TextView) lfa.m16159c(view, i);
                                if (textView4 != null) {
                                    i = R$id.viewBottom;
                                    LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                                    if (linearLayout != null) {
                                        i = R$id.viewFlashcard;
                                        RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i);
                                        if (relativeLayout != null) {
                                            i = R$id.viewLearn;
                                            ViewLearnProgress viewLearnProgress = (ViewLearnProgress) lfa.m16159c(view, i);
                                            if (viewLearnProgress != null) {
                                                return new bf3(imageButton, recyclerView, textView, textView2, textView3, textView4, linearLayout, relativeLayout, viewLearnProgress);
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
