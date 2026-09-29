package com.lingq.core.token;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.lingq.feature.token.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.tf3;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TokenParentFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final TokenParentFragment$binding$2 f23320i = new TokenParentFragment$binding$2(1, tf3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/token/databinding/FragmentTokenParentBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.nav_host_fragment_token_container;
        if (((FragmentContainerView) lfa.m16159c(view, i)) != null) {
            return new tf3((ConstraintLayout) view);
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
