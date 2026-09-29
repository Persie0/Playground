package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8288g2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UserImportSelectionFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8288g2> {

    /* JADX INFO: renamed from: j */
    public static final UserImportSelectionFragment$binding$2 f26686j = new UserImportSelectionFragment$binding$2();

    public UserImportSelectionFragment$binding$2() {
        super(1, C8288g2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUserImportSelectionBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8288g2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.selections;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.selections);
        if (recyclerView != null) {
            i10 = R.id.viewAdd;
            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewAdd);
            if (linearLayout != null) {
                i10 = R.id.view_back;
                LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.view_back);
                if (linearLayout2 != null) {
                    i10 = R.id.viewProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                    if (circularProgressIndicator != null) {
                        return new C8288g2(recyclerView, linearLayout, linearLayout2, circularProgressIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
