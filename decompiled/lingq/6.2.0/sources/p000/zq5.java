package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lingq.feature.review.views.speaking.AudioMatchView;
import com.lingq.feature.review.views.speaking.MatchTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zq5 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatchTextView f71971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xz7 f71972b;

    public zq5(MatchTextView matchTextView, xz7 xz7Var) {
        this.f71971a = matchTextView;
        this.f71972b = xz7Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        ar5 ar5Var = this.f71971a.f32800g;
        if (ar5Var != null) {
            AudioMatchView audioMatchView = (AudioMatchView) ((C3440oy) ar5Var).f55160b;
            int i = AudioMatchView.f32785N;
            ve9 ve9Var = audioMatchView.f32787M;
            if (ve9Var != null) {
                ve9Var.mo4445a(this.f71972b);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
    }
}
