package p497y2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10279a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f51735a;

    /* JADX INFO: renamed from: b */
    public final C10284f f51736b;

    /* JADX INFO: renamed from: c */
    public final int f51737c;

    public C10279a(int i10, C10284f c10284f, int i11) {
        this.f51735a = i10;
        this.f51736b = c10284f;
        this.f51737c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f51735a);
        this.f51736b.f51739a.performAction(this.f51737c, bundle);
    }
}
