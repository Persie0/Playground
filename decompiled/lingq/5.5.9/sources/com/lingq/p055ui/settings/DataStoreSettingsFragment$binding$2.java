package com.lingq.p055ui.settings;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8327n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class DataStoreSettingsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8327n> {

    /* JADX INFO: renamed from: j */
    public static final DataStoreSettingsFragment$binding$2 f30940j = new DataStoreSettingsFragment$binding$2();

    public DataStoreSettingsFragment$binding$2() {
        super(1, C8327n.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentDataSettingsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8327n mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.settingsRecycler;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.settingsRecycler);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                if (materialToolbar != null) {
                    return new C8327n(recyclerView, materialToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
