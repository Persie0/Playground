package com.lingq.feature.reader.old.tutorial;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingq.feature.reader.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.uf3;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LessonFirstLingQCongratsFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonFirstLingQCongratsFragment$binding$2 f29552i = new LessonFirstLingQCongratsFragment$binding$2(1, uf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentTooltipsFirstLingqBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnContinue;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
        if (materialButton != null) {
            i = R$id.tvTitle;
            TextView textView = (TextView) lfa.m16159c(view, i);
            if (textView != null) {
                i = R$id.tvTitle1;
                TextView textView2 = (TextView) lfa.m16159c(view, i);
                if (textView2 != null) {
                    i = R$id.tvTitle2;
                    if (((TextView) lfa.m16159c(view, i)) != null) {
                        i = R$id.tvTitle3;
                        if (((TextView) lfa.m16159c(view, i)) != null) {
                            i = R$id.tvTitle4;
                            if (((TextView) lfa.m16159c(view, i)) != null) {
                                i = R$id.tvTitle5;
                                if (((TextView) lfa.m16159c(view, i)) != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    return new uf3(relativeLayout, materialButton, textView, textView2, relativeLayout);
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
