package com.lingq.feature.challenges;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.md3;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ChallengesFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ChallengesFragment$binding$2 f24442i = new ChallengesFragment$binding$2(1, md3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/challenges/databinding/FragmentChallengesBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.viewChallenges;
        ComposeView composeView = (ComposeView) lfa.m16159c(view, i);
        if (composeView != null) {
            return new md3(composeView);
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
