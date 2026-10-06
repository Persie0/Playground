package p000;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: ed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0152ed extends ArrayAdapter {
    public C0152ed(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, R.id.text1, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
