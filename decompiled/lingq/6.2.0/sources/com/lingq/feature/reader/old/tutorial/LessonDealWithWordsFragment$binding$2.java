package com.lingq.feature.reader.old.tutorial;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.feature.reader.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.vi3;
import p000.wd3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LessonDealWithWordsFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonDealWithWordsFragment$binding$2 f29494i = new LessonDealWithWordsFragment$binding$2(1, wd3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentLessonDealWithWordsBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnCancel;
        Button button = (Button) lfa.m16159c(view, i);
        if (button != null) {
            i = R$id.rvWords;
            RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
            if (recyclerView != null) {
                i = R$id.tvDontShowAgain;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    i = R$id.tvSubTitle;
                    if (((TextView) lfa.m16159c(view, i)) != null) {
                        i = R$id.tvTitle;
                        TextView textView2 = (TextView) lfa.m16159c(view, i);
                        if (textView2 != null) {
                            i = R$id.viewBottom;
                            if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                return new wd3(constraintLayout, button, recyclerView, textView, textView2, constraintLayout);
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
