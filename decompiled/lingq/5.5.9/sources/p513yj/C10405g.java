package p513yj;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lingq.p055ui.review.views.speaking.MatchTextView;
import dm.C5207g;
import p265mj.C7570d;

/* JADX INFO: renamed from: yj.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10405g extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatchTextView f52207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7570d f52208b;

    public C10405g(MatchTextView matchTextView, C7570d c7570d) {
        this.f52207a = matchTextView;
        this.f52208b = c7570d;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5207g.m11111f(view, "widget");
        InterfaceC10406h interfaceC10406h = this.f52207a.f30470h;
        if (interfaceC10406h != null) {
            interfaceC10406h.mo10309a(this.f52208b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "ds");
    }
}
