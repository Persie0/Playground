package com.lingq.p055ui.home.search;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.search.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3985a implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchAdapter f26070a;

    public C3985a(SearchAdapter searchAdapter) {
        this.f26070a = searchAdapter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        this.f26070a.f25941e.mo10005a(String.valueOf(textView != null ? textView.getText() : null));
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            C6716m.m13321f(textView.getContext(), textView);
        }
        return true;
    }
}
