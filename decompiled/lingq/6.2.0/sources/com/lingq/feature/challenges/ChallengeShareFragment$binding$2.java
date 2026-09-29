package com.lingq.feature.challenges;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.ld3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ChallengeShareFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ChallengeShareFragment$binding$2 f24416i = new ChallengeShareFragment$binding$2(1, ld3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/challenges/databinding/FragmentChallengeShareBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnShare;
        Button button = (Button) lfa.m16159c(view, i);
        if (button != null) {
            i = R$id.ivBadge;
            ImageView imageView = (ImageView) lfa.m16159c(view, i);
            if (imageView != null) {
                i = R$id.tvDescription;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    return new ld3(button, imageView, textView);
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
