package com.lingq.p055ui.home.library;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.library.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C3812f implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CollectionsAdapter f25016a;

    public C3812f(CollectionsAdapter collectionsAdapter) {
        this.f25016a = collectionsAdapter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        this.f25016a.f24478f.mo9801a(String.valueOf(textView != null ? textView.getText() : null));
        if (textView == null) {
            return true;
        }
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(textView.getContext(), textView);
        return true;
    }
}
