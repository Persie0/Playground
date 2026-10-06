package p000;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: ea */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0149ea implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AlertController$RecycleListView f13033a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0153ee f13034b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0150eb f13035c;

    public C0149ea(C0150eb c0150eb, AlertController$RecycleListView alertController$RecycleListView, C0153ee c0153ee) {
        this.f13035c = c0150eb;
        this.f13033a = alertController$RecycleListView;
        this.f13034b = c0153ee;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.f13035c.f13181s;
        if (zArr != null) {
            zArr[i] = this.f13033a.isItemChecked(i);
        }
        this.f13035c.f13185w.onClick(this.f13034b.f13559b, i, this.f13033a.isItemChecked(i));
    }
}
