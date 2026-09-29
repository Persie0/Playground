package com.lingq.p055ui.token;

import android.view.KeyEvent;
import android.widget.TextView;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.text.C7076b;
import no.C7828f;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.token.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4867d implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TokenFragment f31725a;

    public C4867d(TokenFragment tokenFragment) {
        this.f31725a = tokenFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
        TokenViewModel tokenViewModelM10363o0 = this.f31725a.m10363o0();
        String string = C7076b.m14277B3(String.valueOf(textView != null ? textView.getText() : null)).toString();
        C5207g.m11111f(string, "tag");
        C7828f.m15570d(tokenViewModelM10363o0.f31409J, null, null, new TokenViewModel$updateWithTag$1(tokenViewModelM10363o0, string, null), 3);
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            C6716m.m13321f(textView.getContext(), textView);
        }
        return true;
    }
}
