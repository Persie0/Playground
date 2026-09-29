package com.lingq.p055ui.home.vocabulary.filter;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C4083e implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ VocabularyFilterSelectionAdapter f26550a;

    public C4083e(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter) {
        this.f26550a = vocabularyFilterSelectionAdapter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        this.f26550a.f26375e.mo10068a(String.valueOf(textView != null ? textView.getText() : null));
        if (textView == null) {
            return true;
        }
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(textView.getContext(), textView);
        return true;
    }
}
