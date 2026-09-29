package p000;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk7 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f51439a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f51440b;

    static {
        HashMap map = new HashMap();
        f51440b = map;
        map.put(Priority.DEFAULT, 0);
        map.put(Priority.VERY_LOW, 1);
        map.put(Priority.HIGHEST, 2);
        for (Priority priority : map.keySet()) {
            f51439a.append(((Integer) f51440b.get(priority)).intValue(), priority);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16869a(Priority priority) {
        Integer num = (Integer) f51440b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        ij6.m13966x(priority, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static Priority m16870b(int i) {
        Priority priority = (Priority) f51439a.get(i);
        if (priority != null) {
            return priority;
        }
        C3386nv.m17626m(ux5.m22988k(i, "Unknown Priority for value "));
        return null;
    }
}
