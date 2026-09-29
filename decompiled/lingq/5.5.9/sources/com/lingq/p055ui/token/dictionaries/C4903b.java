package com.lingq.p055ui.token.dictionaries;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4903b implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DictionariesManageAdapter.AbstractC4873a f31904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DictionariesManageAdapter.AbstractC4874b.c f31905b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<String> f31906c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DictionariesManageAdapter f31907d;

    public C4903b(DictionariesManageAdapter.AbstractC4873a abstractC4873a, DictionariesManageAdapter.AbstractC4874b.c cVar, List<String> list, DictionariesManageAdapter dictionariesManageAdapter) {
        this.f31904a = abstractC4873a;
        this.f31905b = cVar;
        this.f31906c = list;
        this.f31907d = dictionariesManageAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object obj = null;
        View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            Context context = this.f31904a.f7054a.getContext();
            C5207g.m11110e(context, "holder.itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
        }
        for (Object obj2 : this.f31905b.f31772a) {
            if (C5207g.m11106a(((UserDictionaryLocale) obj2).f21722b, this.f31906c.get(i10))) {
                obj = obj2;
                break;
            }
        }
        UserDictionaryLocale userDictionaryLocale = (UserDictionaryLocale) obj;
        if (userDictionaryLocale != null) {
            this.f31907d.f31765f.mo10390b(userDictionaryLocale.f21721a);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
