package p000;

import android.content.Context;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class irt extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f31953a;

    public irt(Context context) {
        this.f31953a = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f31953a.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
    }
}
