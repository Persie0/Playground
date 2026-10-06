package p021j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.zone.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0497g {

    /* JADX INFO: renamed from: a */
    private static final CopyOnWriteArrayList f33107a;

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f33108b;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f33107a = copyOnWriteArrayList;
        f33108b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C0495e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected AbstractC0497g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C0493c m12497a(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("zoneId");
        }
        ConcurrentHashMap concurrentHashMap = f33108b;
        AbstractC0497g abstractC0497g = (AbstractC0497g) concurrentHashMap.get(str);
        if (abstractC0497g != null) {
            return abstractC0497g.mo12495b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C0494d("No time-zone data files registered");
        }
        throw new C0494d("Unknown time-zone ID: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m12498d(AbstractC0497g abstractC0497g) {
        if (abstractC0497g == null) {
            throw new NullPointerException("provider");
        }
        synchronized (AbstractC0497g.class) {
            for (String str : abstractC0497g.mo12496c()) {
                if (str == null) {
                    throw new NullPointerException("zoneId");
                }
                if (((AbstractC0497g) f33108b.putIfAbsent(str, abstractC0497g)) != null) {
                    throw new C0494d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(abstractC0497g));
                }
            }
            Collections.unmodifiableSet(new HashSet(f33108b.keySet()));
        }
        f33107a.add(abstractC0497g);
    }

    /* JADX INFO: renamed from: b */
    protected abstract C0493c mo12495b(String str);

    /* JADX INFO: renamed from: c */
    protected abstract Set mo12496c();
}
