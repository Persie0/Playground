package com.lingq.feature.review;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.hf3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReviewSessionCompleteFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReviewSessionCompleteFragment$binding$2 f31758i = new ReviewSessionCompleteFragment$binding$2(1, hf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/review/databinding/FragmentReviewSessionCompleteBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.rvContent;
        RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
        if (recyclerView == null) {
            C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            return null;
        }
        RecyclerView recyclerView2 = (RecyclerView) lfa.m16159c(view, R$id.rvHeader);
        return new hf3(recyclerView, recyclerView2);
    }
}
