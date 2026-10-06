package p000;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: dz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0147dz extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AlertController$RecycleListView f12947a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0150eb f12948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147dz(C0150eb c0150eb, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.f12948b = c0150eb;
        this.f12947a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f12948b.f13181s;
        if (zArr != null && zArr[i]) {
            this.f12947a.setItemChecked(i, true);
        }
        return view2;
    }
}
