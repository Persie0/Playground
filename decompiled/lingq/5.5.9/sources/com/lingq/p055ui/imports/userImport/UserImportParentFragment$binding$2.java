package com.lingq.p055ui.imports.userImport;

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
import ph.C8282f2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UserImportParentFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8282f2> {

    /* JADX INFO: renamed from: j */
    public static final UserImportParentFragment$binding$2 f26644j = new UserImportParentFragment$binding$2();

    public UserImportParentFragment$binding$2() {
        super(1, C8282f2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUserImportParentBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8282f2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        if (((FragmentContainerView) C0062b.m298P0(view2, R.id.nav_host_fragment_user_import)) != null) {
            return new C8282f2((ConstraintLayout) view2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.nav_host_fragment_user_import)));
    }
}
