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
import p000.ef3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivityResultFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivityResultFragment$binding$2 f32073i = new ReviewActivityResultFragment$binding$2(1, ef3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivityResultBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnTts;
        ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
        if (imageButton != null) {
            i = R$id.ibEditCard;
            ImageButton imageButton2 = (ImageButton) lfa.m16159c(view, i);
            if (imageButton2 != null) {
                i = R$id.rvTags;
                RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
                if (recyclerView != null) {
                    i = R$id.tv_alt_script;
                    TextView textView = (TextView) lfa.m16159c(view, i);
                    if (textView != null) {
                        i = R$id.tvAnswered;
                        TextView textView2 = (TextView) lfa.m16159c(view, i);
                        if (textView2 != null) {
                            i = R$id.tvNotes;
                            TextView textView3 = (TextView) lfa.m16159c(view, i);
                            if (textView3 != null) {
                                i = R$id.tv_phrase;
                                TextView textView4 = (TextView) lfa.m16159c(view, i);
                                if (textView4 != null) {
                                    i = R$id.tvResult;
                                    TextView textView5 = (TextView) lfa.m16159c(view, i);
                                    if (textView5 != null) {
                                        i = R$id.tv_term;
                                        TextView textView6 = (TextView) lfa.m16159c(view, i);
                                        if (textView6 != null) {
                                            i = R$id.tv_translation;
                                            TextView textView7 = (TextView) lfa.m16159c(view, i);
                                            if (textView7 != null) {
                                                i = R$id.viewBottom;
                                                LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                                                if (linearLayout != null) {
                                                    i = R$id.viewLearn;
                                                    ViewLearnProgress viewLearnProgress = (ViewLearnProgress) lfa.m16159c(view, i);
                                                    if (viewLearnProgress != null) {
                                                        i = R$id.viewResult;
                                                        RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i);
                                                        if (relativeLayout != null) {
                                                            return new ef3(imageButton, imageButton2, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, viewLearnProgress, relativeLayout);
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
