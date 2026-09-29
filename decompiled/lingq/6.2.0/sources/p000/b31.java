package p000;

import androidx.lifecycle.Lifecycle$Event;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b31 {

    /* JADX INFO: renamed from: a */
    public final HashMap f7834a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f7835b;

    public b31(HashMap map) {
        this.f7835b = map;
        for (Map.Entry entry : map.entrySet()) {
            Lifecycle$Event lifecycle$Event = (Lifecycle$Event) entry.getValue();
            List arrayList = (List) this.f7834a.get(lifecycle$Event);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7834a.put(lifecycle$Event, arrayList);
            }
            arrayList.add((c31) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3205a(List list, ub5 ub5Var, Lifecycle$Event lifecycle$Event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c31 c31Var = (c31) list.get(size);
                Method method = c31Var.f9386b;
                try {
                    int i = c31Var.f9385a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, ub5Var);
                    } else if (i == 2) {
                        method.invoke(obj, ub5Var, lifecycle$Event);
                    }
                } catch (IllegalAccessException e) {
                    v63.m23141s(e);
                    return;
                } catch (InvocationTargetException e2) {
                    ij6.m13958p("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
