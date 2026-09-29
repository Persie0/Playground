package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8285g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ChallengesMonthlyPromptFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8285g> {

    /* JADX INFO: renamed from: j */
    public static final ChallengesMonthlyPromptFragment$binding$2 f23084j = new ChallengesMonthlyPromptFragment$binding$2();

    public ChallengesMonthlyPromptFragment$binding$2() {
        super(1, C8285g.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentChallengesMonthlyPromptBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8285g mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnJoinOrLeave;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnJoinOrLeave);
        if (materialButton != null) {
            i10 = R.id.ivChallengeImage1;
            ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivChallengeImage1);
            if (imageView != null) {
                i10 = R.id.ivChallengeImage2;
                ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivChallengeImage2);
                if (imageView2 != null) {
                    i10 = R.id.ivChallengeImage3;
                    ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.ivChallengeImage3);
                    if (imageView3 != null) {
                        i10 = R.id.tvDescription;
                        if (((TextView) C0062b.m298P0(view2, R.id.tvDescription)) != null) {
                            i10 = R.id.tvTitle;
                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                            if (textView != null) {
                                return new C8285g(materialButton, imageView, imageView2, imageView3, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
