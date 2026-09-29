package com.lingq.p055ui.review;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8341p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewSessionCompleteFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8341p1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewSessionCompleteFragment$binding$2 f29538j = new ReviewSessionCompleteFragment$binding$2();

    public ReviewSessionCompleteFragment$binding$2() {
        super(1, C8341p1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewSessionCompleteBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8341p1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvContent);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.rvContent)));
        }
        RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(view2, R.id.rvHeader);
        return new C8341p1(recyclerView, recyclerView2);
    }
}
