package com.lingq.feature.review.activities;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.views.speaking.MatchPairView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.cf3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivityMatchingFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivityMatchingFragment$binding$2 f31973i = new ReviewActivityMatchingFragment$binding$2(1, cf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivityMatchingBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.tvMatchPairs;
        if (((TextView) lfa.m16159c(view, i)) != null) {
            i = R$id.viewMatchPair;
            MatchPairView matchPairView = (MatchPairView) lfa.m16159c(view, i);
            if (matchPairView != null) {
                i = R$id.viewProgress;
                if (((CircularProgressIndicator) lfa.m16159c(view, i)) != null) {
                    return new cf3(matchPairView);
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
