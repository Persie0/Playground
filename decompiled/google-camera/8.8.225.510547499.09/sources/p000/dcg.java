package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcg extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f10508a;

    public dcg(Runnable runnable) {
        this.f10508a = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f10508a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
