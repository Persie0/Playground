package p135g9;

import android.support.v4.media.session.C0166e;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: renamed from: g9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5717a {

    /* JADX INFO: renamed from: a */
    public static final SparseArray<Priority> f34733a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public static final HashMap<Priority, Integer> f34734b;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f34734b = map;
        map.put(Priority.DEFAULT, 0);
        map.put(Priority.VERY_LOW, 1);
        map.put(Priority.HIGHEST, 2);
        for (Priority priority : map.keySet()) {
            f34733a.append(f34734b.get(priority).intValue(), priority);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m12075a(Priority priority) {
        Integer num = f34734b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    /* JADX INFO: renamed from: b */
    public static Priority m12076b(int i10) {
        Priority priority = f34733a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(C0166e.m761g("Unknown Priority for value ", i10));
    }
}
