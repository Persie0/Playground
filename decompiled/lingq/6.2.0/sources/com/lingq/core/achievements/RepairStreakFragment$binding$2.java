package com.lingq.core.achievements;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.af3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RepairStreakFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final RepairStreakFragment$binding$2 f14180i = new RepairStreakFragment$binding$2(1, af3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/core/achievements/databinding/FragmentRepairStreakBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnNotNow;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
        if (materialButton != null) {
            i = R$id.btnRepair;
            MaterialButton materialButton2 = (MaterialButton) lfa.m16159c(view, i);
            if (materialButton2 != null) {
                i = R$id.ivStreak;
                if (((ImageView) lfa.m16159c(view, i)) != null) {
                    i = R$id.llRepairActions;
                    if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                        i = R$id.tvDescription;
                        if (((TextView) lfa.m16159c(view, i)) != null) {
                            i = R$id.tvError;
                            TextView textView = (TextView) lfa.m16159c(view, i);
                            if (textView != null) {
                                i = R$id.tvRepair;
                                TextView textView2 = (TextView) lfa.m16159c(view, i);
                                if (textView2 != null) {
                                    i = R$id.tvTitle;
                                    TextView textView3 = (TextView) lfa.m16159c(view, i);
                                    if (textView3 != null) {
                                        i = R$id.viewError;
                                        RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i);
                                        if (relativeLayout != null) {
                                            i = R$id.viewProgress;
                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i);
                                            if (circularProgressIndicator != null) {
                                                return new af3(materialButton, materialButton2, textView, textView2, textView3, relativeLayout, circularProgressIndicator);
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
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
