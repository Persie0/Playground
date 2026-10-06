package p000;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p021j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class apt {

    /* JADX INFO: renamed from: a */
    public volatile aqp f2062a;

    /* JADX INFO: renamed from: b */
    public Executor f2063b;

    /* JADX INFO: renamed from: c */
    public Executor f2064c;

    /* JADX INFO: renamed from: d */
    public aqt f2065d;

    /* JADX INFO: renamed from: f */
    public boolean f2067f;

    /* JADX INFO: renamed from: g */
    public List f2068g;

    /* JADX INFO: renamed from: j */
    public final Map f2071j;

    /* JADX INFO: renamed from: k */
    public final Map f2072k;

    /* JADX INFO: renamed from: e */
    public final apr f2066e = mo1706a();

    /* JADX INFO: renamed from: h */
    public final Map f2069h = new LinkedHashMap();

    /* JADX INFO: renamed from: l */
    private final ReentrantReadWriteLock f2073l = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f2070i = new ThreadLocal();

    public apt() {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.f2071j = mapSynchronizedMap;
        this.f2072k = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: v */
    public static final Object m1817v(Class cls, aqt aqtVar) {
        if (cls.isInstance(aqtVar)) {
            return aqtVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected abstract apr mo1706a();

    /* JADX INFO: renamed from: b */
    protected abstract aqt mo1707b(apm apmVar);

    /* JADX INFO: renamed from: c */
    public final aqt m1818c() {
        aqt aqtVar = this.f2065d;
        if (aqtVar != null) {
            return aqtVar;
        }
        ooc.m18736b(xRFdVyfdeve.mVluPEJqGDoDnex);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m1819d(Callable callable) {
        callable.getClass();
        m1825m();
        try {
            Object objCall = callable.call();
            m1829q();
            return objCall;
        } finally {
            m1827o();
        }
    }

    /* JADX INFO: renamed from: e */
    public List mo1708e(Map map) {
        map.getClass();
        return okv.f46215a;
    }

    /* JADX INFO: renamed from: f */
    protected Map mo1709f() {
        return okw.f46216a;
    }

    /* JADX INFO: renamed from: g */
    public Set mo1710g() {
        return okx.f46217a;
    }

    /* JADX INFO: renamed from: h */
    public final Executor m1820h() {
        Executor executor = this.f2063b;
        if (executor != null) {
            return executor;
        }
        ooc.m18736b("internalQueryExecutor");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Executor m1821i() {
        Executor executor = this.f2064c;
        if (executor != null) {
            return executor;
        }
        ooc.m18736b(IuyLAqNmW.dVGmdJCGV);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Lock m1822j() {
        ReentrantReadWriteLock.ReadLock lock = this.f2073l.readLock();
        lock.getClass();
        return lock;
    }

    /* JADX INFO: renamed from: k */
    public final void m1823k() {
        if (!this.f2067f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1824l() {
        if (!m1830r() && this.f2070i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1825m() {
        m1823k();
        m1823k();
        aqp aqpVarMo1802a = m1818c().mo1802a();
        this.f2066e.m1812c(aqpVarMo1802a);
        if (aqpVarMo1802a.mo1872k()) {
            aqpVarMo1802a.mo1866e();
        } else {
            aqpVarMo1802a.mo1865d();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1826n() {
        aqp aqpVar = this.f2062a;
        if (ooc.m18737c(aqpVar != null ? Boolean.valueOf(aqpVar.mo1871j()) : null, true)) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f2073l.writeLock();
            writeLock.getClass();
            writeLock.lock();
            try {
                apr aprVar = this.f2066e;
                aeh aehVar = aprVar.f2042k;
                aprVar.f2042k = null;
                m1818c().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1827o() {
        m1818c().mo1802a().mo1867f();
        if (m1830r()) {
            return;
        }
        apr aprVar = this.f2066e;
        if (aprVar.f2035d.compareAndSet(false, true)) {
            adq adqVar = aprVar.f2041j;
            aprVar.f2032a.m1820h().execute(aprVar.f2039h);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1828p(aqp aqpVar) {
        apr aprVar = this.f2066e;
        synchronized (aprVar.f2038g) {
            if (aprVar.f2036e) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            aqpVar.mo1868g("PRAGMA temp_store = MEMORY;");
            aqpVar.mo1868g("PRAGMA recursive_triggers='ON';");
            aqpVar.mo1868g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            aprVar.m1812c(aqpVar);
            aprVar.f2040i = aqpVar.mo1873l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            aprVar.f2036e = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1829q() {
        m1818c().mo1802a().mo1869h();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1830r() {
        return m1818c().mo1802a().mo1870i();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1831s() {
        aqp aqpVar = this.f2062a;
        return aqpVar != null && aqpVar.mo1871j();
    }

    /* JADX INFO: renamed from: t */
    public final arf m1832t(String str) {
        m1823k();
        m1824l();
        return m1818c().mo1802a().mo1873l(str);
    }

    /* JADX INFO: renamed from: u */
    public final Cursor m1833u(aqv aqvVar) {
        m1823k();
        m1824l();
        return m1818c().mo1802a().mo1862a(aqvVar);
    }
}
