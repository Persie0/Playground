package com.lingq.feature.review.activities;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.review.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.df3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivityMultiAndClozeFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivityMultiAndClozeFragment$binding$2 f32023i = new ReviewActivityMultiAndClozeFragment$binding$2(1, df3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivityMultiAndClozeBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnTts;
        ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
        if (imageButton != null) {
            i = R$id.ibEditCard;
            if (((ImageButton) lfa.m16159c(view, i)) != null) {
                i = R$id.tv_alt_script;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    i = R$id.tvDescription;
                    TextView textView2 = (TextView) lfa.m16159c(view, i);
                    if (textView2 != null) {
                        i = R$id.tv_first_option;
                        TextView textView3 = (TextView) lfa.m16159c(view, i);
                        if (textView3 != null) {
                            i = R$id.tv_fourth_option;
                            TextView textView4 = (TextView) lfa.m16159c(view, i);
                            if (textView4 != null) {
                                i = R$id.tv_second_option;
                                TextView textView5 = (TextView) lfa.m16159c(view, i);
                                if (textView5 != null) {
                                    i = R$id.tvTerm;
                                    TextView textView6 = (TextView) lfa.m16159c(view, i);
                                    if (textView6 != null) {
                                        i = R$id.tv_third_option;
                                        TextView textView7 = (TextView) lfa.m16159c(view, i);
                                        if (textView7 != null) {
                                            i = R$id.viewData;
                                            LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                                            if (linearLayout != null) {
                                                i = R$id.viewProgress;
                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i);
                                                if (circularProgressIndicator != null) {
                                                    return new df3(imageButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, circularProgressIndicator);
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
