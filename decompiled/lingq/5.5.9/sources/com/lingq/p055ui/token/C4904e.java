package com.lingq.p055ui.token;

import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.text.C7076b;
import no.C7828f;
import p278nh.InterfaceC7774a;

/* JADX INFO: renamed from: com.lingq.ui.token.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C4904e implements InterfaceC7774a<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TokenFragment f31908a;

    public C4904e(TokenFragment tokenFragment) {
        this.f31908a = tokenFragment;
    }

    @Override // p278nh.InterfaceC7774a
    /* JADX INFO: renamed from: a */
    public final void mo9795a(String str) {
        String str2 = str;
        C5207g.m11111f(str2, "data");
        InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
        TokenViewModel tokenViewModelM10363o0 = this.f31908a.m10363o0();
        String string = C7076b.m14277B3(str2).toString();
        C5207g.m11111f(string, "tag");
        C7828f.m15570d(tokenViewModelM10363o0.f31409J, null, null, new TokenViewModel$updateWithTag$1(tokenViewModelM10363o0, string, null), 3);
    }
}
