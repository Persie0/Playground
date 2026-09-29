package p213k4;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.RoomDatabase;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import mo.C7661i;
import p081e0.C5298b1;
import p229l.C7203b;
import p260m8.C7499b;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: k4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6586f {

    /* JADX INFO: renamed from: o */
    public static final String[] f37426o = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f37427a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f37428b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Set<String>> f37429c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f37430d;

    /* JADX INFO: renamed from: e */
    public final String[] f37431e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f37432f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f37433g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC7920f f37434h;

    /* JADX INFO: renamed from: i */
    public final b f37435i;

    /* JADX INFO: renamed from: j */
    public final C7203b<c, d> f37436j;

    /* JADX INFO: renamed from: k */
    public C6588h f37437k;

    /* JADX INFO: renamed from: l */
    public final Object f37438l;

    /* JADX INFO: renamed from: m */
    public final Object f37439m;

    /* JADX INFO: renamed from: n */
    public final RunnableC6587g f37440n;

    /* JADX INFO: renamed from: k4.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m13180a(String str, String str2) {
            C5207g.m11111f(str, "tableName");
            C5207g.m11111f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* JADX INFO: renamed from: k4.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long[] f37441a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f37442b;

        /* JADX INFO: renamed from: c */
        public final int[] f37443c;

        /* JADX INFO: renamed from: d */
        public boolean f37444d;

        public b(int i10) {
            this.f37441a = new long[i10];
            this.f37442b = new boolean[i10];
            this.f37443c = new int[i10];
        }

        /* JADX INFO: renamed from: a */
        public final int[] m13181a() {
            synchronized (this) {
                if (!this.f37444d) {
                    return null;
                }
                long[] jArr = this.f37441a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = this.f37442b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f37443c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f37443c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f37444d = false;
                return (int[]) this.f37443c.clone();
            }
        }
    }

    /* JADX INFO: renamed from: k4.f$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final String[] f37445a;

        public c(String[] strArr) {
            C5207g.m11111f(strArr, "tables");
            this.f37445a = strArr;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo4545a(Set<String> set);
    }

    /* JADX INFO: renamed from: k4.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final c f37446a;

        /* JADX INFO: renamed from: b */
        public final int[] f37447b;

        /* JADX INFO: renamed from: c */
        public final String[] f37448c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f37449d;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public d(c cVar, int[] iArr, String[] strArr) {
            C5207g.m11111f(cVar, "observer");
            this.f37446a = cVar;
            this.f37447b = iArr;
            this.f37448c = strArr;
            boolean z10 = true;
            this.f37449d = (strArr.length == 0) ^ true ? C7499b.m14972w0(strArr[0]) : EmptySet.f38034a;
            if (iArr.length != strArr.length) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: a */
        public final void m13182a(Set<Integer> set) {
            Set<String> set2;
            C5207g.m11111f(set, "invalidatedTablesIds");
            int[] iArr = this.f37447b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    int length2 = iArr.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr[i10]))) {
                            setBuilder.add(this.f37448c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    C7499b.m14940g(setBuilder);
                    set2 = setBuilder;
                } else {
                    set2 = set.contains(Integer.valueOf(iArr[0])) ? this.f37449d : EmptySet.f38034a;
                }
            } else {
                set2 = EmptySet.f38034a;
            }
            if (!set2.isEmpty()) {
                this.f37446a.mo4545a(set2);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: b */
        public final void m13183b(String[] strArr) {
            Set<String> set;
            String[] strArr2 = this.f37448c;
            int length = strArr2.length;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (C7661i.m15249O2(str2, str)) {
                                setBuilder.add(str2);
                            }
                        }
                    }
                    C7499b.m14940g(setBuilder);
                    set = setBuilder;
                } else {
                    for (String str3 : strArr) {
                        if (C7661i.m15249O2(str3, strArr2[0])) {
                            z10 = true;
                            break;
                        }
                    }
                    set = z10 ? this.f37449d : EmptySet.f38034a;
                }
            } else {
                set = EmptySet.f38034a;
            }
            if (!set.isEmpty()) {
                this.f37446a.mo4545a(set);
            }
        }
    }

    public C6586f(RoomDatabase roomDatabase, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        C5207g.m11111f(roomDatabase, "database");
        this.f37427a = roomDatabase;
        this.f37428b = map;
        this.f37429c = map2;
        this.f37432f = new AtomicBoolean(false);
        this.f37435i = new b(strArr.length);
        new C5298b1(roomDatabase);
        this.f37436j = new C7203b<>();
        this.f37438l = new Object();
        this.f37439m = new Object();
        this.f37430d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f37430d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.f37428b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f37431e = strArr2;
        Iterator<Map.Entry<String, String>> it = this.f37428b.entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    this.f37440n = new RunnableC6587g(this);
                    return;
                }
                Map.Entry<String, String> next = it.next();
                String value = next.getValue();
                Locale locale2 = Locale.US;
                C5207g.m11110e(locale2, "US");
                String lowerCase3 = value.toLowerCase(locale2);
                C5207g.m11110e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                if (this.f37430d.containsKey(lowerCase3)) {
                    String lowerCase4 = next.getKey().toLowerCase(locale2);
                    C5207g.m11110e(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                    LinkedHashMap linkedHashMap = this.f37430d;
                    linkedHashMap.put(lowerCase4, C6753d.m13460M0(lowerCase3, linkedHashMap));
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: a */
    public final void m13174a(c cVar) {
        d dVarMo14516f;
        boolean z10;
        C5207g.m11111f(cVar, "observer");
        String[] strArr = cVar.f37445a;
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.f37429c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map.get(lowerCase2);
                C5207g.m11108c(set);
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        C7499b.m14940g(setBuilder);
        Object[] array = setBuilder.toArray(new String[0]);
        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr2 = (String[]) array;
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.f37430d;
            Locale locale2 = Locale.US;
            C5207g.m11110e(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            C5207g.m11110e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] iArrM13452t0 = C6752c.m13452t0(arrayList);
        d dVar = new d(cVar, iArrM13452t0, strArr2);
        synchronized (this.f37436j) {
            try {
                dVarMo14516f = this.f37436j.mo14516f(cVar, dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVarMo14516f == null) {
            b bVar = this.f37435i;
            int[] iArrCopyOf = Arrays.copyOf(iArrM13452t0, iArrM13452t0.length);
            bVar.getClass();
            C5207g.m11111f(iArrCopyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i10 : iArrCopyOf) {
                    long[] jArr = bVar.f37441a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        bVar.f37444d = true;
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            }
            if (z10) {
                RoomDatabase roomDatabase = this.f37427a;
                if (roomDatabase.m4565p()) {
                    m13179f(roomDatabase.m4559j().mo4578n0());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13175b() {
        if (!this.f37427a.m4565p()) {
            return false;
        }
        if (!this.f37433g) {
            this.f37427a.m4559j().mo4578n0();
        }
        if (this.f37433g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: c */
    public final void m13176c(c cVar) {
        d dVarMo14517g;
        boolean z10;
        C5207g.m11111f(cVar, "observer");
        synchronized (this.f37436j) {
            dVarMo14517g = this.f37436j.mo14517g(cVar);
        }
        if (dVarMo14517g != null) {
            b bVar = this.f37435i;
            int[] iArr = dVarMo14517g.f37447b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            bVar.getClass();
            C5207g.m11111f(iArrCopyOf, "tableIds");
            synchronized (bVar) {
                try {
                    z10 = false;
                    for (int i10 : iArrCopyOf) {
                        long[] jArr = bVar.f37441a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            bVar.f37444d = true;
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                RoomDatabase roomDatabase = this.f37427a;
                if (roomDatabase.m4565p()) {
                    m13179f(roomDatabase.m4559j().mo4578n0());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13177d(InterfaceC7916b interfaceC7916b, int i10) {
        interfaceC7916b.mo4600u("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f37431e[i10];
        String[] strArr = f37426o;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.m13180a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            C5207g.m11110e(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC7916b.mo4600u(str3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13178e() {
        C6588h c6588h = this.f37437k;
        if (c6588h != null && c6588h.f37459i.compareAndSet(false, true)) {
            c cVar = c6588h.f37456f;
            if (cVar == null) {
                C5207g.m11117l("observer");
                throw null;
            }
            c6588h.f37452b.m13176c(cVar);
            try {
                InterfaceC6585e interfaceC6585e = c6588h.f37457g;
                if (interfaceC6585e != null) {
                    interfaceC6585e.mo4548n0(c6588h.f37458h, c6588h.f37455e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            c6588h.f37454d.unbindService(c6588h.f37460j);
        }
        this.f37437k = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m13179f(InterfaceC7916b interfaceC7916b) {
        C5207g.m11111f(interfaceC7916b, "database");
        if (interfaceC7916b.mo4589S0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f37427a.f7518i.readLock();
            C5207g.m11110e(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f37438l) {
                    int[] iArrM13181a = this.f37435i.m13181a();
                    if (iArrM13181a == null) {
                        lock.unlock();
                        return;
                    }
                    if (interfaceC7916b.mo4596f1()) {
                        interfaceC7916b.mo4595c0();
                    } else {
                        interfaceC7916b.mo4597k();
                    }
                    try {
                        int length = iArrM13181a.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrM13181a[i10];
                            int i13 = i11 + 1;
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    String str = this.f37431e[i11];
                                    String[] strArr = f37426o;
                                    for (int i14 = 0; i14 < 3; i14++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + a.m13180a(str, strArr[i14]);
                                        C5207g.m11110e(str2, "StringBuilder().apply(builderAction).toString()");
                                        interfaceC7916b.mo4600u(str2);
                                    }
                                }
                                i10++;
                                i11 = i13;
                            } else {
                                m13177d(interfaceC7916b, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        interfaceC7916b.mo4590Z();
                        interfaceC7916b.mo4601w0();
                        C9072e c9072e = C9072e.f47360a;
                        lock.unlock();
                    } catch (Throwable th2) {
                        interfaceC7916b.mo4601w0();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
