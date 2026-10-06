package p000;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aps {

    /* JADX INFO: renamed from: b */
    public Executor f2048b;

    /* JADX INFO: renamed from: c */
    public aqs f2049c;

    /* JADX INFO: renamed from: d */
    private final Context f2050d;

    /* JADX INFO: renamed from: e */
    private final Class f2051e;

    /* JADX INFO: renamed from: f */
    private final String f2052f;

    /* JADX INFO: renamed from: i */
    private Executor f2055i;

    /* JADX INFO: renamed from: j */
    private boolean f2056j;

    /* JADX INFO: renamed from: l */
    private boolean f2058l;

    /* JADX INFO: renamed from: n */
    private Set f2060n;

    /* JADX INFO: renamed from: a */
    public final List f2047a = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f2053g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List f2054h = new ArrayList();

    /* JADX INFO: renamed from: k */
    private boolean f2057k = true;

    /* JADX INFO: renamed from: o */
    private final bkn f2061o = new bkn((byte[]) null, (byte[]) null);

    /* JADX INFO: renamed from: m */
    private final Set f2059m = new LinkedHashSet();

    public aps(Context context, Class cls, String str) {
        this.f2050d = context;
        this.f2051e = cls;
        this.f2052f = str;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final apt m1813a() {
        Executor executor = this.f2048b;
        if (executor == null && this.f2055i == null) {
            Executor executor2 = C0933qk.f47490a;
            this.f2055i = executor2;
            this.f2048b = executor2;
        } else if (executor != null && this.f2055i == null) {
            this.f2055i = executor;
        } else if (executor == null) {
            this.f2048b = this.f2055i;
        }
        Set set = this.f2060n;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (!(!this.f2059m.contains(Integer.valueOf(iIntValue)))) {
                    throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue);
                }
            }
        }
        aqs ardVar = this.f2049c;
        if (ardVar == null) {
            ardVar = new ard();
        }
        aqs aqsVar = ardVar;
        Context context = this.f2050d;
        String str = this.f2052f;
        bkn bknVar = this.f2061o;
        List list = this.f2047a;
        boolean z = this.f2056j;
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        int i = true != ((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        Executor executor3 = this.f2048b;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor4 = this.f2055i;
        if (executor4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        apm apmVar = new apm(context, str, aqsVar, bknVar, list, z, i, executor3, executor4, this.f2057k, this.f2058l, this.f2059m, this.f2053g, this.f2054h, null, null, null);
        apt aptVar = (apt) aek.m349h(this.f2051e);
        aptVar.f2065d = aptVar.mo1707b(apmVar);
        Set setMo1710g = aptVar.mo1710g();
        BitSet bitSet = new BitSet();
        Iterator it2 = setMo1710g.iterator();
        while (true) {
            int i2 = -1;
            if (!it2.hasNext()) {
                int size = apmVar.f2025l.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        if (!bitSet.get(size)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
                Iterator it3 = aptVar.mo1708e(aptVar.f2069h).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    aqc aqcVar = (aqc) it3.next();
                    bkn bknVar2 = apmVar.f2027n;
                    int i4 = aqcVar.f2109a;
                    int i5 = aqcVar.f2110b;
                    ?? r8 = bknVar2.f3651a;
                    Integer numValueOf = Integer.valueOf(i4);
                    if (r8.containsKey(numValueOf)) {
                        Map map = (Map) r8.get(numValueOf);
                        if (map == null) {
                            map = okw.f46216a;
                        }
                        if (!map.containsKey(Integer.valueOf(i5))) {
                        }
                    }
                    apmVar.f2027n.m2588i(aqcVar);
                }
                if (((apz) apt.m1817v(apz.class, aptVar.m1818c())) != null || ((apf) apt.m1817v(apf.class, aptVar.m1818c())) != null) {
                    throw null;
                }
                boolean z2 = apmVar.f2026m == 3;
                arc arcVar = (arc) aptVar.m1818c();
                if (arcVar.f2182f.mo18587b()) {
                    afj.m508h(arcVar.m1882b(), z2);
                }
                arcVar.f2183g = z2;
                aptVar.f2068g = apmVar.f2017d;
                aptVar.f2063b = apmVar.f2019f;
                aptVar.f2064c = new beb(apmVar.f2020g, 1, null);
                aptVar.f2067f = apmVar.f2018e;
                Map mapMo1709f = aptVar.mo1709f();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapMo1709f.entrySet()) {
                    Class cls = (Class) entry.getKey();
                    for (Class cls2 : (List) entry.getValue()) {
                        int size2 = apmVar.f2024k.size() - 1;
                        if (size2 < 0) {
                            size2 = -1;
                            break;
                        }
                        while (true) {
                            int i6 = size2 - 1;
                            if (cls2.isAssignableFrom(apmVar.f2024k.get(size2).getClass())) {
                                bitSet2.set(size2);
                                break;
                            }
                            if (i6 < 0) {
                                size2 = -1;
                                break;
                            }
                            size2 = i6;
                        }
                        if (size2 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                        }
                        aptVar.f2072k.put(cls2, apmVar.f2024k.get(size2));
                    }
                }
                int size3 = apmVar.f2024k.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i7 = size3 - 1;
                        if (!bitSet2.get(size3)) {
                            throw new IllegalArgumentException("Unexpected type converter " + apmVar.f2024k.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                        if (i7 >= 0) {
                            size3 = i7;
                        }
                    }
                }
                return aptVar;
            }
            Class cls3 = (Class) it2.next();
            int size4 = apmVar.f2025l.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i8 = size4 - 1;
                    if (cls3.isAssignableFrom(apmVar.f2025l.get(size4).getClass())) {
                        bitSet.set(size4);
                        i2 = size4;
                        break;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    size4 = i8;
                }
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.");
            }
            aptVar.f2069h.put(cls3, apmVar.f2025l.get(i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1814b(aqc... aqcVarArr) {
        if (this.f2060n == null) {
            this.f2060n = new HashSet();
        }
        for (int i = 0; i <= 0; i++) {
            aqc aqcVar = aqcVarArr[i];
            Set set = this.f2060n;
            set.getClass();
            set.add(Integer.valueOf(aqcVar.f2109a));
            Set set2 = this.f2060n;
            set2.getClass();
            set2.add(Integer.valueOf(aqcVar.f2110b));
        }
        this.f2061o.m2588i((aqc[]) Arrays.copyOf(aqcVarArr, 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m1815c() {
        this.f2056j = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1816d() {
        this.f2057k = false;
        this.f2058l = true;
    }
}
