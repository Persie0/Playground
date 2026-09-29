package com.lingq.feature.statistics;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.qf3;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class StatsShareFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final StatsShareFragment$binding$2 f33329i = new StatsShareFragment$binding$2(1, qf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/statistics/databinding/FragmentStatsShareBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnShare;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
        if (materialButton != null) {
            i = R$id.goalsView;
            ComposeView composeView = (ComposeView) lfa.m16159c(view, i);
            if (composeView != null) {
                i = R$id.ivLanguageFlag;
                ImageView imageView = (ImageView) lfa.m16159c(view, i);
                if (imageView != null) {
                    i = R$id.ivLingqLogo;
                    if (((ImageView) lfa.m16159c(view, i)) != null) {
                        i = R$id.llStats;
                        LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                        if (linearLayout != null) {
                            i = R$id.streakView;
                            ComposeView composeView2 = (ComposeView) lfa.m16159c(view, i);
                            if (composeView2 != null) {
                                i = R$id.tvKnownWords;
                                TextView textView = (TextView) lfa.m16159c(view, i);
                                if (textView != null) {
                                    return new qf3(materialButton, composeView, imageView, linearLayout, composeView2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
