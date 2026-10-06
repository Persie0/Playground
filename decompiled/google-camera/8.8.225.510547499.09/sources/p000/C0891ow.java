package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: ow */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0891ow extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0892ox f46699a;

    public C0891ow(C0892ox c0892ox) {
        this.f46699a = c0892ox;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.f46699a.f46753d;
        outline.setOval(0, 0, i, i);
    }
}
