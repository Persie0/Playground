package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8311k1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewActivityMultiAndClozeFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8311k1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewActivityMultiAndClozeFragment$binding$2 f29880j = new ReviewActivityMultiAndClozeFragment$binding$2();

    public ReviewActivityMultiAndClozeFragment$binding$2() {
        super(1, C8311k1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewActivityMultiAndClozeBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8311k1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnTts;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnTts);
        if (imageButton != null) {
            i10 = R.id.tv_alt_script;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tv_alt_script);
            if (textView != null) {
                i10 = R.id.tvDescription;
                TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvDescription);
                if (textView2 != null) {
                    i10 = R.id.tv_first_option;
                    TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tv_first_option);
                    if (textView3 != null) {
                        i10 = R.id.tv_fourth_option;
                        TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tv_fourth_option);
                        if (textView4 != null) {
                            i10 = R.id.tv_second_option;
                            TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tv_second_option);
                            if (textView5 != null) {
                                i10 = R.id.tvTerm;
                                TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tvTerm);
                                if (textView6 != null) {
                                    i10 = R.id.tv_third_option;
                                    TextView textView7 = (TextView) C0062b.m298P0(view2, R.id.tv_third_option);
                                    if (textView7 != null) {
                                        i10 = R.id.viewData;
                                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewData);
                                        if (linearLayout != null) {
                                            i10 = R.id.viewProgress;
                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                            if (circularProgressIndicator != null) {
                                                return new C8311k1(imageButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, circularProgressIndicator);
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
