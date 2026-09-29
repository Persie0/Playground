package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.review.views.unscrambler.SentenceBuilderView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8329n1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewActivityUnscrambleFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8329n1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewActivityUnscrambleFragment$binding$2 f30073j = new ReviewActivityUnscrambleFragment$binding$2();

    public ReviewActivityUnscrambleFragment$binding$2() {
        super(1, C8329n1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewActivityUnscrambleBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8329n1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.tvDescription;
        if (((TextView) C0062b.m298P0(view2, R.id.tvDescription)) != null) {
            i10 = R.id.tvTranslation;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvTranslation);
            if (textView != null) {
                i10 = R.id.viewData;
                if (((LinearLayout) C0062b.m298P0(view2, R.id.viewData)) != null) {
                    i10 = R.id.viewProgress;
                    if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                        i10 = R.id.viewSentenceBuilder;
                        SentenceBuilderView sentenceBuilderView = (SentenceBuilderView) C0062b.m298P0(view2, R.id.viewSentenceBuilder);
                        if (sentenceBuilderView != null) {
                            return new C8329n1(textView, sentenceBuilderView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
