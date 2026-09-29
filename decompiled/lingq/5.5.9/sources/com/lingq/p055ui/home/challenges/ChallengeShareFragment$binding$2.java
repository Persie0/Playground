package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8267d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ChallengeShareFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8267d> {

    /* JADX INFO: renamed from: j */
    public static final ChallengeShareFragment$binding$2 f22991j = new ChallengeShareFragment$binding$2();

    public ChallengeShareFragment$binding$2() {
        super(1, C8267d.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentChallengeShareBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8267d mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.ivBadge;
        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivBadge);
        if (imageView != null) {
            i10 = R.id.ivEmail;
            ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivEmail);
            if (imageView2 != null) {
                i10 = R.id.ivFacebook;
                ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.ivFacebook);
                if (imageView3 != null) {
                    i10 = R.id.ivInstagram;
                    ImageView imageView4 = (ImageView) C0062b.m298P0(view2, R.id.ivInstagram);
                    if (imageView4 != null) {
                        i10 = R.id.ivTwitter;
                        ImageView imageView5 = (ImageView) C0062b.m298P0(view2, R.id.ivTwitter);
                        if (imageView5 != null) {
                            i10 = R.id.tvDescription;
                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvDescription);
                            if (textView != null) {
                                return new C8267d(imageView, imageView2, imageView3, imageView4, imageView5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
