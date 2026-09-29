package com.lingq.p055ui.home.vocabulary;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4030b implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ VocabularyAdapter f26333a;

    public C4030b(VocabularyAdapter vocabularyAdapter) {
        this.f26333a = vocabularyAdapter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        this.f26333a.f26077f.mo9795a(String.valueOf(textView != null ? textView.getText() : null));
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            C6716m.m13321f(textView.getContext(), textView);
        }
        return true;
    }
}
