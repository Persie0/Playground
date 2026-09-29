package p000;

import com.google.android.gms.internal.clearcut.C0950c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class owb extends mvb {

    /* JADX INFO: renamed from: c */
    public static final Class f55113c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // p000.mvb
    /* JADX INFO: renamed from: a */
    public final void mo17059a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) b5c.m3320k(obj, j);
        if (list instanceof lvb) {
            objUnmodifiableList = ((lvb) list).mo5295W();
        } else if (f55113c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        b5c.m3313d(obj, j, objUnmodifiableList);
    }

    @Override // p000.mvb
    /* JADX INFO: renamed from: b */
    public final void mo17060b(Object obj, long j, Object obj2) {
        List list;
        List list2;
        List list3 = (List) b5c.m3320k(obj2, j);
        int size = list3.size();
        List list4 = (List) b5c.m3320k(obj, j);
        if (list4.isEmpty()) {
            List c0950c = list4 instanceof lvb ? new C0950c(size) : new ArrayList(size);
            b5c.m3313d(obj, j, c0950c);
            list2 = c0950c;
        } else {
            if (f55113c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                list = arrayList;
            } else if (list4 instanceof l4c) {
                list2 = list4;
                C0950c c0950c2 = new C0950c(list4.size() + size);
                c0950c2.addAll((l4c) list4);
                list = c0950c2;
            }
            b5c.m3313d(obj, j, list);
            list2 = list;
        }
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        b5c.m3313d(obj, j, list3);
    }
}
