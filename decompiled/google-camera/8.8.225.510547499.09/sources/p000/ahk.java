package p000;

import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahk {
    /* JADX INFO: renamed from: a */
    public static void m677a(ListView listView, int i) {
        listView.scrollListBy(i);
    }

    /* JADX INFO: renamed from: b */
    static boolean m678b(ListView listView, int i) {
        return listView.canScrollList(i);
    }
}
