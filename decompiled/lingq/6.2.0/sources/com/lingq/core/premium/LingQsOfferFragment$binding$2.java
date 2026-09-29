package com.lingq.core.premium;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.hg3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LingQsOfferFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LingQsOfferFragment$binding$2 f22349i = new LingQsOfferFragment$binding$2(1, hg3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/core/premium/databinding/FragmentUpgradeLingqsOfferBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnCloseUpgrade;
        ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
        if (imageButton != null) {
            i = R$id.btnUpgrade;
            MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
            if (materialButton != null) {
                i = R$id.tv_desc;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    i = R$id.tv_title;
                    if (((TextView) lfa.m16159c(view, i)) != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i = R$id.viewProgress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i);
                        if (circularProgressIndicator != null) {
                            return new hg3(imageButton, materialButton, textView, frameLayout, circularProgressIndicator);
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
