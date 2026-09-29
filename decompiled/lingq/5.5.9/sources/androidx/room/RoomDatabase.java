package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import mo.C7661i;
import p208k.C6560c;
import p208k.ExecutorC6559b;
import p213k4.C6581a;
import p213k4.C6586f;
import p213k4.C6588h;
import p213k4.C6596p;
import p213k4.ExecutorC6598r;
import p213k4.InterfaceC6582b;
import p234l4.AbstractC7252b;
import p234l4.InterfaceC7251a;
import p260m8.C7499b;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7917c;
import p288o4.InterfaceC7919e;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC7916b f7510a;

    /* JADX INFO: renamed from: b */
    public Executor f7511b;

    /* JADX INFO: renamed from: c */
    public ExecutorC6598r f7512c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7917c f7513d;

    /* JADX INFO: renamed from: f */
    public boolean f7515f;

    /* JADX INFO: renamed from: g */
    public List<? extends AbstractC1181b> f7516g;

    /* JADX INFO: renamed from: k */
    public final Map<String, Object> f7520k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f7521l;

    /* JADX INFO: renamed from: e */
    public final C6586f f7514e = mo4556g();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f7517h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final ReentrantReadWriteLock f7518i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j */
    public final ThreadLocal<Integer> f7519j = new ThreadLocal<>();

    @Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m13365d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "(Ljava/lang/String;I)V", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "resolve", "context", "Landroid/content/Context;", "resolve$room_runtime_release", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            C5207g.m11111f(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            C5207g.m11111f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !isLowRamDevice((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$a */
    public static class C1180a<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a */
        public final Context f7522a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f7523b;

        /* JADX INFO: renamed from: c */
        public final String f7524c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f7525d;

        /* JADX INFO: renamed from: e */
        public final ArrayList f7526e;

        /* JADX INFO: renamed from: f */
        public final ArrayList f7527f;

        /* JADX INFO: renamed from: g */
        public Executor f7528g;

        /* JADX INFO: renamed from: h */
        public Executor f7529h;

        /* JADX INFO: renamed from: i */
        public InterfaceC7917c.c f7530i;

        /* JADX INFO: renamed from: j */
        public boolean f7531j;

        /* JADX INFO: renamed from: k */
        public JournalMode f7532k;

        /* JADX INFO: renamed from: l */
        public boolean f7533l;

        /* JADX INFO: renamed from: m */
        public boolean f7534m;

        /* JADX INFO: renamed from: n */
        public final long f7535n;

        /* JADX INFO: renamed from: o */
        public final C1182c f7536o;

        /* JADX INFO: renamed from: p */
        public final LinkedHashSet f7537p;

        /* JADX INFO: renamed from: q */
        public HashSet f7538q;

        public C1180a(Context context, Class<T> cls, String str) {
            C5207g.m11111f(context, "context");
            this.f7522a = context;
            this.f7523b = cls;
            this.f7524c = str;
            this.f7525d = new ArrayList();
            this.f7526e = new ArrayList();
            this.f7527f = new ArrayList();
            this.f7532k = JournalMode.AUTOMATIC;
            this.f7533l = true;
            this.f7535n = -1L;
            this.f7536o = new C1182c();
            this.f7537p = new LinkedHashSet();
        }

        /* JADX INFO: renamed from: a */
        public final void m4569a(AbstractC7252b... abstractC7252bArr) {
            C5207g.m11111f(abstractC7252bArr, "migrations");
            if (this.f7538q == null) {
                this.f7538q = new HashSet();
            }
            for (AbstractC7252b abstractC7252b : abstractC7252bArr) {
                HashSet hashSet = this.f7538q;
                C5207g.m11108c(hashSet);
                hashSet.add(Integer.valueOf(abstractC7252b.f40733a));
                HashSet hashSet2 = this.f7538q;
                C5207g.m11108c(hashSet2);
                hashSet2.add(Integer.valueOf(abstractC7252b.f40734b));
            }
            this.f7536o.m4572a((AbstractC7252b[]) Arrays.copyOf(abstractC7252bArr, abstractC7252bArr.length));
        }

        /* JADX INFO: renamed from: b */
        public final T m4570b() {
            boolean zContainsKey;
            Executor executor = this.f7528g;
            if (executor == null && this.f7529h == null) {
                ExecutorC6559b executorC6559b = C6560c.f37355c;
                this.f7529h = executorC6559b;
                this.f7528g = executorC6559b;
            } else if (executor != null && this.f7529h == null) {
                this.f7529h = executor;
            } else if (executor == null) {
                this.f7528g = this.f7529h;
            }
            HashSet hashSet = this.f7538q;
            LinkedHashSet linkedHashSet = this.f7537p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!(!linkedHashSet.contains(Integer.valueOf(iIntValue)))) {
                        throw new IllegalArgumentException(C0166e.m761g("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                    }
                }
            }
            InterfaceC7917c.c c7499b = this.f7530i;
            if (c7499b == null) {
                c7499b = new C7499b();
            }
            InterfaceC7917c.c cVar = c7499b;
            if (this.f7535n > 0) {
                if (this.f7524c != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
            }
            Context context = this.f7522a;
            String str = this.f7524c;
            C1182c c1182c = this.f7536o;
            ArrayList arrayList = this.f7525d;
            boolean z10 = this.f7531j;
            JournalMode journalModeResolve$room_runtime_release = this.f7532k.resolve$room_runtime_release(context);
            Executor executor2 = this.f7528g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor3 = this.f7529h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C6581a c6581a = new C6581a(context, str, cVar, c1182c, arrayList, z10, journalModeResolve$room_runtime_release, executor2, executor3, this.f7533l, this.f7534m, linkedHashSet, this.f7526e, this.f7527f);
            Class<T> cls = this.f7523b;
            C5207g.m11111f(cls, "klass");
            Package r10 = cls.getPackage();
            C5207g.m11108c(r10);
            String name = r10.getName();
            String canonicalName = cls.getCanonicalName();
            C5207g.m11108c(canonicalName);
            C5207g.m11110e(name, "fullPackage");
            if (!(name.length() == 0)) {
                canonicalName = canonicalName.substring(name.length() + 1);
                C5207g.m11110e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String strConcat = C7661i.m15253S2(canonicalName, '.', '_').concat("_Impl");
            try {
                Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader());
                C5207g.m11109d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                T t10 = (T) cls2.newInstance();
                t10.getClass();
                t10.f7513d = t10.mo4557h(c6581a);
                Set<Class<? extends InterfaceC7251a>> setMo4560k = t10.mo4560k();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends InterfaceC7251a>> it2 = setMo4560k.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = t10.f7517h;
                    int i10 = -1;
                    List<InterfaceC7251a> list = c6581a.f37421p;
                    if (zHasNext) {
                        Class<? extends InterfaceC7251a> next = it2.next();
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i11 = size - 1;
                                if (next.isAssignableFrom(list.get(size).getClass())) {
                                    bitSet.set(size);
                                    i10 = size;
                                    break;
                                }
                                if (i11 < 0) {
                                    break;
                                }
                                size = i11;
                            }
                        }
                        if (!(i10 >= 0)) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(next, list.get(i10));
                    } else {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i12 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                }
                                if (i12 < 0) {
                                    break;
                                }
                                size2 = i12;
                            }
                        }
                        for (AbstractC7252b abstractC7252b : t10.mo4558i(linkedHashMap)) {
                            int i13 = abstractC7252b.f40733a;
                            C1182c c1182c2 = c6581a.f37409d;
                            LinkedHashMap linkedHashMap2 = c1182c2.f7539a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                                Map mapM13459L0 = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                                if (mapM13459L0 == null) {
                                    mapM13459L0 = C6753d.m13459L0();
                                }
                                zContainsKey = mapM13459L0.containsKey(Integer.valueOf(abstractC7252b.f40734b));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                c1182c2.m4572a(abstractC7252b);
                            }
                        }
                        C6596p c6596p = (C6596p) RoomDatabase.m4549t(C6596p.class, t10.m4559j());
                        if (c6596p != null) {
                            c6596p.f37490a = c6581a;
                        }
                        C1184a c1184a = (C1184a) RoomDatabase.m4549t(C1184a.class, t10.m4559j());
                        C6586f c6586f = t10.f7514e;
                        if (c1184a != null) {
                            c6586f.getClass();
                            C5207g.m11111f(null, "autoCloser");
                            throw null;
                        }
                        t10.m4559j().setWriteAheadLoggingEnabled(c6581a.f37412g == JournalMode.WRITE_AHEAD_LOGGING);
                        t10.f7516g = c6581a.f37410e;
                        t10.f7511b = c6581a.f37413h;
                        t10.f7512c = new ExecutorC6598r(c6581a.f37414i);
                        t10.f7515f = c6581a.f37411f;
                        Intent intent = c6581a.f37415j;
                        if (intent != null) {
                            String str2 = c6581a.f37407b;
                            if (str2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            c6586f.getClass();
                            Context context2 = c6581a.f37406a;
                            C5207g.m11111f(context2, "context");
                            Executor executor4 = c6586f.f37427a.f7511b;
                            if (executor4 == null) {
                                C5207g.m11117l("internalQueryExecutor");
                                throw null;
                            }
                            c6586f.f37437k = new C6588h(context2, str2, intent, c6586f, executor4);
                        }
                        Map<Class<?>, List<Class<?>>> mapMo4561l = t10.mo4561l();
                        BitSet bitSet2 = new BitSet();
                        Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = mapMo4561l.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            List<Object> list2 = c6581a.f37420o;
                            if (!zHasNext2) {
                                int size3 = list2.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i14 = size3 - 1;
                                        if (!bitSet2.get(size3)) {
                                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i14 >= 0) {
                                            size3 = i14;
                                        }
                                    }
                                }
                                return t10;
                            }
                            Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                            Class<?> key = next2.getKey();
                            for (Class<?> cls3 : next2.getValue()) {
                                int size4 = list2.size() - 1;
                                if (size4 < 0) {
                                    size4 = -1;
                                    break;
                                }
                                while (true) {
                                    int i15 = size4 - 1;
                                    if (cls3.isAssignableFrom(list2.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i15 < 0) {
                                        size4 = -1;
                                        break;
                                    }
                                    size4 = i15;
                                }
                                if (!(size4 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                t10.f7521l.put(cls3, list2.get(size4));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$b */
    public static abstract class AbstractC1181b {
        /* JADX INFO: renamed from: a */
        public void mo4571a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$c */
    public static class C1182c {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f7539a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final void m4572a(AbstractC7252b... abstractC7252bArr) {
            C5207g.m11111f(abstractC7252bArr, "migrations");
            for (AbstractC7252b abstractC7252b : abstractC7252bArr) {
                int i10 = abstractC7252b.f40733a;
                LinkedHashMap linkedHashMap = this.f7539a;
                Integer numValueOf = Integer.valueOf(i10);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i11 = abstractC7252b.f40734b;
                if (treeMap2.containsKey(Integer.valueOf(i11))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + abstractC7252b);
                }
                treeMap2.put(Integer.valueOf(i11), abstractC7252b);
            }
        }
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C5207g.m11110e(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f7520k = mapSynchronizedMap;
        this.f7521l = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: t */
    public static Object m4549t(Class cls, InterfaceC7917c interfaceC7917c) {
        if (cls.isInstance(interfaceC7917c)) {
            return interfaceC7917c;
        }
        if (interfaceC7917c instanceof InterfaceC6582b) {
            return m4549t(cls, ((InterfaceC6582b) interfaceC7917c).mo4577j());
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m4550a() {
        if (this.f7515f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m4551b() {
        if (!(m4562m() || this.f7519j.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4552c() {
        m4550a();
        m4550a();
        InterfaceC7916b interfaceC7916bMo4578n0 = m4559j().mo4578n0();
        this.f7514e.m13179f(interfaceC7916bMo4578n0);
        if (interfaceC7916bMo4578n0.mo4596f1()) {
            interfaceC7916bMo4578n0.mo4595c0();
        } else {
            interfaceC7916bMo4578n0.mo4597k();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4553d();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m4554e() {
        InterfaceC7916b interfaceC7916b = this.f7510a;
        if (C5207g.m11106a(interfaceC7916b != null ? Boolean.valueOf(interfaceC7916b.isOpen()) : null, Boolean.TRUE)) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f7518i.writeLock();
            C5207g.m11110e(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                this.f7514e.m13178e();
                m4559j().close();
                writeLock.unlock();
            } catch (Throwable th2) {
                writeLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC7920f m4555f(String str) {
        C5207g.m11111f(str, "sql");
        m4550a();
        m4551b();
        return m4559j().mo4578n0().mo4588B(str);
    }

    /* JADX INFO: renamed from: g */
    public abstract C6586f mo4556g();

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC7917c mo4557h(C6581a c6581a);

    /* JADX INFO: renamed from: i */
    public List mo4558i(LinkedHashMap linkedHashMap) {
        C5207g.m11111f(linkedHashMap, "autoMigrationSpecs");
        return EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC7917c m4559j() {
        InterfaceC7917c interfaceC7917c = this.f7513d;
        if (interfaceC7917c != null) {
            return interfaceC7917c;
        }
        C5207g.m11117l("internalOpenHelper");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public Set<Class<? extends InterfaceC7251a>> mo4560k() {
        return EmptySet.f38034a;
    }

    /* JADX INFO: renamed from: l */
    public Map<Class<?>, List<Class<?>>> mo4561l() {
        return C6753d.m13459L0();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4562m() {
        return m4559j().mo4578n0().mo4589S0();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m4563n() {
        m4559j().mo4578n0().mo4601w0();
        if (!m4562m()) {
            C6586f c6586f = this.f7514e;
            if (c6586f.f37432f.compareAndSet(false, true)) {
                Executor executor = c6586f.f37427a.f7511b;
                if (executor != null) {
                    executor.execute(c6586f.f37440n);
                } else {
                    C5207g.m11117l("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4564o(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        C6586f c6586f = this.f7514e;
        c6586f.getClass();
        synchronized (c6586f.f37439m) {
            if (c6586f.f37433g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            frameworkSQLiteDatabase.mo4600u("PRAGMA temp_store = MEMORY;");
            frameworkSQLiteDatabase.mo4600u("PRAGMA recursive_triggers='ON';");
            frameworkSQLiteDatabase.mo4600u("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c6586f.m13179f(frameworkSQLiteDatabase);
            c6586f.f37434h = frameworkSQLiteDatabase.mo4588B("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c6586f.f37433g = true;
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4565p() {
        InterfaceC7916b interfaceC7916b = this.f7510a;
        boolean z10 = false;
        if (interfaceC7916b != null && interfaceC7916b.isOpen()) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: q */
    public final Cursor m4566q(InterfaceC7919e interfaceC7919e, CancellationSignal cancellationSignal) {
        C5207g.m11111f(interfaceC7919e, "query");
        m4550a();
        m4551b();
        return cancellationSignal != null ? m4559j().mo4578n0().mo4602y(interfaceC7919e, cancellationSignal) : m4559j().mo4578n0().mo4594b1(interfaceC7919e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final <V> V m4567r(Callable<V> callable) {
        m4552c();
        try {
            V vCall = callable.call();
            m4568s();
            m4563n();
            return vCall;
        } catch (Throwable th2) {
            m4563n();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4568s() {
        m4559j().mo4578n0().mo4590Z();
    }
}
