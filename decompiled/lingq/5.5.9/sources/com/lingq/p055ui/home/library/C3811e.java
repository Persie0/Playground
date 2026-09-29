package com.lingq.p055ui.home.library;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.library.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3811e implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f25012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CollectionsAdapter.AbstractC3740b f25013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<String> f25014c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CollectionsAdapter f25015d;

    public C3811e(Ref$BooleanRef ref$BooleanRef, CollectionsAdapter.AbstractC3740b abstractC3740b, ArrayList arrayList, CollectionsAdapter collectionsAdapter) {
        this.f25012a = ref$BooleanRef;
        this.f25013b = abstractC3740b;
        this.f25014c = arrayList;
        this.f25015d = collectionsAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        if (this.f25012a.f38122a) {
            Sort sort = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            CollectionsAdapter.AbstractC3740b abstractC3740b = this.f25013b;
            if (textView != null) {
                List<Integer> list = C6716m.f37937a;
                Context context = abstractC3740b.f7054a.getContext();
                C5207g.m11110e(context, "holder.itemView.context");
                textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
            }
            for (Sort sort2 : Sort.values()) {
                if (C5207g.m11106a(abstractC3740b.f7054a.getContext().getString(C4924a.m10465i0(sort2)), this.f25014c.get(i10))) {
                    sort = sort2;
                    break;
                }
            }
            if (sort != null) {
                this.f25015d.f24478f.mo9806f(sort);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
