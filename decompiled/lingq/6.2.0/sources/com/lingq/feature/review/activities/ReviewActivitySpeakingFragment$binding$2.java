package com.lingq.feature.review.activities;

import android.view.View;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.views.speaking.AudioMatchView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.ff3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewActivitySpeakingFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewActivitySpeakingFragment$binding$2 f32142i = new ReviewActivitySpeakingFragment$binding$2(1, ff3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewActivitySpeakingBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.viewAudioMatch;
        AudioMatchView audioMatchView = (AudioMatchView) lfa.m16159c(view, i);
        if (audioMatchView != null) {
            i = R$id.viewProgress;
            if (((CircularProgressIndicator) lfa.m16159c(view, i)) != null) {
                return new ff3(audioMatchView);
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
