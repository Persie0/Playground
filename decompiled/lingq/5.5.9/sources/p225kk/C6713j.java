package p225kk;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import cm.InterfaceC2041a;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: kk.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6713j extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2041a<C9072e> f37934a;

    public C6713j(InterfaceC2041a<C9072e> interfaceC2041a) {
        this.f37934a = interfaceC2041a;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5207g.m11111f(view, "widget");
        InterfaceC2041a<C9072e> interfaceC2041a = this.f37934a;
        if (interfaceC2041a != null) {
            interfaceC2041a.mo807E();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "ds");
        textPaint.setUnderlineText(true);
    }
}
