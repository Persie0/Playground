package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8306j2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class VocabularyFilterFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8306j2> {

    /* JADX INFO: renamed from: j */
    public static final VocabularyFilterFragment$binding$2 f26352j = new VocabularyFilterFragment$binding$2();

    public VocabularyFilterFragment$binding$2() {
        super(1, C8306j2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentVocabularyFilterBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8306j2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.settingsRecycler);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.settingsRecycler)));
        }
        return new C8306j2(recyclerView);
    }
}
