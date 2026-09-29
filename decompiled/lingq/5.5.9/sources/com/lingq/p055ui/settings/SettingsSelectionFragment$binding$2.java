package com.lingq.p055ui.settings;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8356s1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class SettingsSelectionFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8356s1> {

    /* JADX INFO: renamed from: j */
    public static final SettingsSelectionFragment$binding$2 f31029j = new SettingsSelectionFragment$binding$2();

    public SettingsSelectionFragment$binding$2() {
        super(1, C8356s1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentSettingsSelectionBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8356s1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.rvSelections;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvSelections);
        if (recyclerView != null) {
            i10 = R.id.tvTitle;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
            if (textView != null) {
                return new C8356s1((LinearLayout) view2, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
