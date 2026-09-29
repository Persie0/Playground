package p240ld;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0327l0;

/* JADX INFO: renamed from: ld.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7317q implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7318r f40989a;

    public C7317q(C7318r c7318r) {
        this.f40989a = c7318r;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object item;
        C7318r c7318r = this.f40989a;
        if (i10 < 0) {
            C0327l0 c0327l0 = c7318r.f40990e;
            item = !c0327l0.mo893a() ? null : c0327l0.f1279c.getSelectedItem();
        } else {
            item = c7318r.getAdapter().getItem(i10);
        }
        C7318r.m14730a(c7318r, item);
        AdapterView.OnItemClickListener onItemClickListener = c7318r.getOnItemClickListener();
        C0327l0 c0327l1 = c7318r.f40990e;
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                view = c0327l1.mo893a() ? c0327l1.f1279c.getSelectedView() : null;
                i10 = !c0327l1.mo893a() ? -1 : c0327l1.f1279c.getSelectedItemPosition();
                j10 = !c0327l1.mo893a() ? Long.MIN_VALUE : c0327l1.f1279c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c0327l1.f1279c, view, i10, j10);
        }
        c0327l1.dismiss();
    }
}
