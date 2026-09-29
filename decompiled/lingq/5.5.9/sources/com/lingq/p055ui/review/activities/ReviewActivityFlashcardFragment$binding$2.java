package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8299i1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewActivityFlashcardFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8299i1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewActivityFlashcardFragment$binding$2 f29780j = new ReviewActivityFlashcardFragment$binding$2();

    public ReviewActivityFlashcardFragment$binding$2() {
        super(1, C8299i1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewActivityFlashcardBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8299i1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnTts;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnTts);
        if (imageButton != null) {
            i10 = R.id.tv_phrase;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tv_phrase);
            if (textView != null) {
                i10 = R.id.tv_term;
                TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tv_term);
                if (textView2 != null) {
                    i10 = R.id.tv_translation;
                    TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tv_translation);
                    if (textView3 != null) {
                        i10 = R.id.viewBottom;
                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewBottom);
                        if (linearLayout != null) {
                            i10 = R.id.viewFlashcard;
                            RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewFlashcard);
                            if (relativeLayout != null) {
                                i10 = R.id.viewLearn;
                                ViewLearnProgress viewLearnProgress = (ViewLearnProgress) C0062b.m298P0(view2, R.id.viewLearn);
                                if (viewLearnProgress != null) {
                                    return new C8299i1(imageButton, textView, textView2, textView3, linearLayout, relativeLayout, viewLearnProgress);
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
