package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8310k0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class SentenceEditPageFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8310k0> {

    /* JADX INFO: renamed from: j */
    public static final SentenceEditPageFragment$binding$2 f27993j = new SentenceEditPageFragment$binding$2();

    public SentenceEditPageFragment$binding$2() {
        super(1, C8310k0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonEditSentenceBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8310k0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.rvSentence;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvSentence);
        if (recyclerView != null) {
            i10 = R.id.viewProgress;
            if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                return new C8310k0(recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
