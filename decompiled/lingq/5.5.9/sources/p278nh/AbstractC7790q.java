package p278nh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dm.C5207g;
import java.util.ArrayList;

/* JADX INFO: renamed from: nh.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7790q<T> extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: d */
    public ArrayList<b> f42818d;

    /* JADX INFO: renamed from: nh.q$a */
    public static abstract class a extends RecyclerView.AbstractC1109b0 {
        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: nh.q$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f42819a;

        /* JADX INFO: renamed from: b */
        public final Object f42820b;

        public b(int i10, Object obj) {
            this.f42819a = i10;
            this.f42820b = obj;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        return m15495p(i10).f42819a;
    }

    /* JADX INFO: renamed from: p */
    public final b m15495p(int i10) {
        b bVar = m15496q().get(i10);
        C5207g.m11110e(bVar, "items[position]");
        return bVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final ArrayList<b> m15496q() {
        ArrayList<b> arrayList = this.f42818d;
        if (arrayList != null) {
            return arrayList;
        }
        C5207g.m11117l("items");
        throw null;
    }
}
