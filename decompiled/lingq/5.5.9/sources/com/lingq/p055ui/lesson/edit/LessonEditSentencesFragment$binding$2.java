package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8322m0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonEditSentencesFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8322m0> {

    /* JADX INFO: renamed from: j */
    public static final LessonEditSentencesFragment$binding$2 f27928j = new LessonEditSentencesFragment$binding$2();

    public LessonEditSentencesFragment$binding$2() {
        super(1, C8322m0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonEditSentencesBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8322m0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnDone;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnDone);
        if (textView != null) {
            i10 = R.id.rvSentences;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvSentences);
            if (recyclerView != null) {
                i10 = R.id.tvLessonTitle;
                if (((TextView) C0062b.m298P0(view2, R.id.tvLessonTitle)) != null) {
                    i10 = R.id.viewProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                    if (circularProgressIndicator != null) {
                        return new C8322m0(textView, recyclerView, circularProgressIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
