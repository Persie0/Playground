package com.lingq.p055ui.home.vocabulary;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4031c implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f26334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VocabularyAdapter.AbstractC3988b f26335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<String> f26336c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26337d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f26338e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f26339f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyAdapter f26340g;

    public C4031c(Ref$BooleanRef ref$BooleanRef, VocabularyAdapter.AbstractC3988b abstractC3988b, List<String> list, String str, String str2, String str3, VocabularyAdapter vocabularyAdapter) {
        this.f26334a = ref$BooleanRef;
        this.f26335b = abstractC3988b;
        this.f26336c = list;
        this.f26337d = str;
        this.f26338e = str2;
        this.f26339f = str3;
        this.f26340g = vocabularyAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        VocabularyAdapter.SelectedContent selectedContent;
        if (this.f26334a.f38122a) {
            TextView textView = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                List<Integer> list = C6716m.f37937a;
                Context context = this.f26335b.f7054a.getContext();
                C5207g.m11110e(context, "holder.itemView.context");
                textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
            }
            String str = this.f26336c.get(i10);
            if (C5207g.m11106a(str, this.f26337d)) {
                selectedContent = VocabularyAdapter.SelectedContent.All;
            } else if (C5207g.m11106a(str, this.f26338e)) {
                selectedContent = VocabularyAdapter.SelectedContent.Phrases;
            } else {
                selectedContent = C5207g.m11106a(str, this.f26339f) ? VocabularyAdapter.SelectedContent.SrsDue : VocabularyAdapter.SelectedContent.All;
            }
            this.f26340g.f26078g.mo9795a(selectedContent);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
