package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3061h3 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f41733a;

    /* JADX INFO: renamed from: b */
    public final C0797b4 f41734b;

    /* JADX INFO: renamed from: c */
    public final int f41735c;

    public C3061h3(int i, C0797b4 c0797b4, int i2) {
        this.f41733a = i;
        this.f41734b = c0797b4;
        this.f41735c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f41733a);
        this.f41734b.f7900a.performAction(this.f41735c, bundle);
    }
}
