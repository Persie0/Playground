package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8365u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class DictionariesManageFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8365u0> {

    /* JADX INFO: renamed from: j */
    public static final DictionariesManageFragment$binding$2 f31781j = new DictionariesManageFragment$binding$2();

    public DictionariesManageFragment$binding$2() {
        super(1, C8365u0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentManageDictionariesBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8365u0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.rvDictionaries;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvDictionaries);
        if (recyclerView != null) {
            i10 = R.id.tvClose;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvClose);
            if (textView != null) {
                i10 = R.id.tvDictionary;
                if (((TextView) C0062b.m298P0(view2, R.id.tvDictionary)) != null) {
                    return new C8365u0((RelativeLayout) view2, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
