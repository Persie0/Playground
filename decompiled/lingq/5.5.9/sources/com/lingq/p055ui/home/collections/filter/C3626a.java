package com.lingq.p055ui.home.collections.filter;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3626a implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CollectionsSearchFilterSelectionAdapter f23669a;

    public C3626a(CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter) {
        this.f23669a = collectionsSearchFilterSelectionAdapter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        this.f23669a.f23481e.mo9850a(String.valueOf(textView != null ? textView.getText() : null));
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            C6716m.m13321f(textView.getContext(), textView);
        }
        return true;
    }
}
