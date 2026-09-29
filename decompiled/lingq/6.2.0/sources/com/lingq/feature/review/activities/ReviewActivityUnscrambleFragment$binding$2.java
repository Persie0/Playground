package com.lingq.feature.review.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.gf3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivityUnscrambleFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivityUnscrambleFragment$binding$2 f32213i = new ReviewActivityUnscrambleFragment$binding$2(1, gf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivityUnscrambleBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.tvDescription;
        if (((TextView) lfa.m16159c(view, i)) != null) {
            i = R$id.tvTranslation;
            TextView textView = (TextView) lfa.m16159c(view, i);
            if (textView != null) {
                i = R$id.viewData;
                if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                    i = R$id.viewProgress;
                    if (((CircularProgressIndicator) lfa.m16159c(view, i)) != null) {
                        i = R$id.viewSentenceBuilder;
                        SentenceBuilderView sentenceBuilderView = (SentenceBuilderView) lfa.m16159c(view, i);
                        if (sentenceBuilderView != null) {
                            return new gf3(textView, sentenceBuilderView);
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
