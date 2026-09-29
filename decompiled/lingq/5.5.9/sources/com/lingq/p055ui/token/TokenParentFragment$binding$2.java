package com.lingq.p055ui.token;

import ae.C0062b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8381x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class TokenParentFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8381x1> {

    /* JADX INFO: renamed from: j */
    public static final TokenParentFragment$binding$2 f31390j = new TokenParentFragment$binding$2();

    public TokenParentFragment$binding$2() {
        super(1, C8381x1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentTokenParentBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8381x1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_container_token)) != null) {
            return new C8381x1((ConstraintLayout) view2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.fragment_container_token)));
    }
}
