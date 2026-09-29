package com.lingq.feature.reader.old.tutorial;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.lingq.feature.reader.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.vi3;
import p000.xe3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LessonMoveKnownFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonMoveKnownFragment$binding$2 f29568i = new LessonMoveKnownFragment$binding$2(1, xe3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentReaderMoveKnownBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnCancel;
        Button button = (Button) lfa.m16159c(view, i);
        if (button != null) {
            i = R$id.btnKnowWords;
            Button button2 = (Button) lfa.m16159c(view, i);
            if (button2 != null) {
                i = R$id.cardView;
                MaterialCardView materialCardView = (MaterialCardView) lfa.m16159c(view, i);
                if (materialCardView != null) {
                    i = R$id.rvWords;
                    RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
                    if (recyclerView != null) {
                        i = R$id.tvSaveLabel;
                        if (((TextView) lfa.m16159c(view, i)) != null) {
                            i = R$id.tvTitle;
                            TextView textView = (TextView) lfa.m16159c(view, i);
                            if (textView != null) {
                                i = R$id.tvTitleMessage;
                                TextView textView2 = (TextView) lfa.m16159c(view, i);
                                if (textView2 != null) {
                                    i = R$id.viewBottom;
                                    if (((ConstraintLayout) lfa.m16159c(view, i)) != null) {
                                        return new xe3(button, button2, materialCardView, recyclerView, textView, textView2, (FrameLayout) view);
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
