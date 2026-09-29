package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ifa extends ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(true);
    }
}
