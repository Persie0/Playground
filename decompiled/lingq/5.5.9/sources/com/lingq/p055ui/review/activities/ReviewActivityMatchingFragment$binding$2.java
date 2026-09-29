package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.review.views.speaking.MatchPairView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8305j1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewActivityMatchingFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8305j1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewActivityMatchingFragment$binding$2 f29821j = new ReviewActivityMatchingFragment$binding$2();

    public ReviewActivityMatchingFragment$binding$2() {
        super(1, C8305j1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewActivityMatchingBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8305j1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.tvMatchPairs;
        if (((TextView) C0062b.m298P0(view2, R.id.tvMatchPairs)) != null) {
            i10 = R.id.viewMatchPair;
            MatchPairView matchPairView = (MatchPairView) C0062b.m298P0(view2, R.id.viewMatchPair);
            if (matchPairView != null) {
                i10 = R.id.viewProgress;
                if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                    return new C8305j1(matchPairView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
