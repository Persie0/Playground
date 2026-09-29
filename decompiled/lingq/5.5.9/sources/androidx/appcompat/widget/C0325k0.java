package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.widget.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325k0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0327l0 f1257a;

    public C0325k0(C0327l0 c0327l0) {
        this.f1257a = c0327l0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        C0314g0 c0314g0;
        if (i10 == -1 || (c0314g0 = this.f1257a.f1279c) == null) {
            return;
        }
        c0314g0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
