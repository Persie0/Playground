package com.lingq.feature.dictionary;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.ae3;
import p000.lfa;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DictionariesManageFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final DictionariesManageFragment$binding$2 f25726i = new DictionariesManageFragment$binding$2(1, ae3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/dictionary/databinding/FragmentManageDictionariesBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.rvDictionaries;
        RecyclerView recyclerView = (RecyclerView) lfa.m16159c(view, i);
        if (recyclerView != null) {
            i = R$id.tvClose;
            TextView textView = (TextView) lfa.m16159c(view, i);
            if (textView != null) {
                i = R$id.tvDictionary;
                if (((TextView) lfa.m16159c(view, i)) != null) {
                    return new ae3((RelativeLayout) view, recyclerView, textView);
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
