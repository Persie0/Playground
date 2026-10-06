package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agp extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    private final int f310a;

    /* JADX INFO: renamed from: b */
    private final agt f311b;

    /* JADX INFO: renamed from: c */
    private final int f312c;

    public agp(int i, agt agtVar, int i2) {
        this.f310a = i;
        this.f311b = agtVar;
        this.f312c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(EArqVBjecl.lrIZejzdOl, this.f310a);
        agt agtVar = this.f311b;
        agtVar.f355a.performAction(this.f312c, bundle);
    }
}
