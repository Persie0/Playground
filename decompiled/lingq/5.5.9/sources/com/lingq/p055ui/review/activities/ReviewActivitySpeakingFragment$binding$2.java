package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.view.View;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.review.views.speaking.AudioMatchView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8323m1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewActivitySpeakingFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8323m1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewActivitySpeakingFragment$binding$2 f29995j = new ReviewActivitySpeakingFragment$binding$2();

    public ReviewActivitySpeakingFragment$binding$2() {
        super(1, C8323m1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewActivitySpeakingBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8323m1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.viewAudioMatch;
        AudioMatchView audioMatchView = (AudioMatchView) C0062b.m298P0(view2, R.id.viewAudioMatch);
        if (audioMatchView != null) {
            i10 = R.id.viewProgress;
            if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                return new C8323m1(audioMatchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
