package androidx.room;

import android.os.Looper;
import androidx.room.coroutines.AbstractC0745f;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.LingQDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NotImplementedError;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3352my;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.b64;
import p000.bi8;
import p000.bk8;
import p000.by8;
import p000.c9a;
import p000.cl9;
import p000.fa4;
import p000.hi1;
import p000.ik8;
import p000.kn1;
import p000.lq2;
import p000.np6;
import p000.sb2;
import p000.sy0;
import p000.u91;
import p000.ui3;
import p000.v91;
import p000.vl1;
import p000.xg3;
import p000.yn9;
import p000.z21;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0746d {
    public static final bi8 Companion = new bi8();

    /* JADX INFO: renamed from: a */
    public vl1 f6954a;

    /* JADX INFO: renamed from: b */
    public kn1 f6955b;

    /* JADX INFO: renamed from: c */
    public Executor f6956c;

    /* JADX INFO: renamed from: d */
    public by8 f6957d;

    /* JADX INFO: renamed from: e */
    public sb2 f6958e;

    /* JADX INFO: renamed from: f */
    public C0736a f6959f;

    /* JADX INFO: renamed from: g */
    public final b64 f6960g;

    /* JADX INFO: renamed from: h */
    public boolean f6961h;

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f6962i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f6963j;

    /* JADX INFO: renamed from: k */
    public boolean f6964k;

    public AbstractC0746d() {
        new RoomDatabase$closeBarrier$1(0, this, AbstractC0746d.class, "onClosed", "onClosed()V", 0);
        b64 b64Var = new b64();
        b64Var.f8006a = new AtomicInteger(0);
        b64Var.f8007b = new AtomicBoolean(false);
        this.f6960g = b64Var;
        this.f6962i = new ThreadLocal();
        this.f6963j = new LinkedHashMap();
        this.f6964k = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m2828a() {
        if (this.f6961h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C3386nv.m17633t("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2829b() {
        if (!m2840m() || m2841n()) {
            return;
        }
        kn1 kn1Var = (kn1) this.f6962i.get();
        if ((kn1Var != null ? (c9a) kn1Var.get(c9a.f9771b) : null) == null) {
            return;
        }
        C3386nv.m17633t("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    /* JADX INFO: renamed from: c */
    public final void m2830c() {
        m2828a();
        m2828a();
        xg3 xg3VarMo397I = m2837j().mo397I();
        if (!xg3VarMo397I.m24493S()) {
            AbstractC0745f.m2827a(new InvalidationTracker$syncBlocking$1(m2836i(), null));
        }
        if (xg3VarMo397I.f68178a.isWriteAheadLoggingEnabled()) {
            xg3VarMo397I.m24495b();
        } else {
            xg3VarMo397I.m24494a();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2831d();

    /* JADX INFO: renamed from: e */
    public List mo2832e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC3194a.m15363P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            z21 z21Var = (z21) entry.getKey();
            z21Var.getClass();
            Class clsMo16595a = z21Var.mo16595a();
            clsMo16595a.getClass();
            linkedHashMap2.put(clsMo16595a, entry.getValue());
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0736a mo2833f();

    /* JADX INFO: renamed from: g */
    public lq2 mo2834g() {
        throw new NotImplementedError(0);
    }

    /* JADX INFO: renamed from: h */
    public final void m2835h() {
        m2837j().mo397I().m24497e();
        if (m2841n()) {
            return;
        }
        C0736a c0736aM2836i = m2836i();
        c0736aM2836i.f6818b.m2856e(c0736aM2836i.f6821e, c0736aM2836i.f6822f);
    }

    /* JADX INFO: renamed from: i */
    public final C0736a m2836i() {
        C0736a c0736a = this.f6959f;
        if (c0736a != null) {
            return c0736a;
        }
        fa4.m11636J("internalTracker");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final yn9 m2837j() {
        sb2 sb2Var = this.f6958e;
        if (sb2Var == null) {
            fa4.m11636J("connectionManager");
            throw null;
        }
        yn9 yn9Var = (yn9) sb2Var.f60618h;
        if (yn9Var != null) {
            return yn9Var;
        }
        C3386nv.m17633t("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public Set mo2838k() {
        return u91.m22627s1(new ArrayList(v91.m23189q0(EmptySet.f47640a, 10)));
    }

    /* JADX INFO: renamed from: l */
    public LinkedHashMap mo2839l() {
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(EmptySet.f47640a, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        return new LinkedHashMap(iM15363P);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2840m() {
        sb2 sb2Var = this.f6958e;
        if (sb2Var != null) {
            return ((yn9) sb2Var.f60618h) != null;
        }
        fa4.m11636J("connectionManager");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2841n() {
        return m2843p() && m2837j().mo397I().m24493S();
    }

    /* JADX INFO: renamed from: o */
    public final void m2842o(bk8 bk8Var) throws Exception {
        bk8Var.getClass();
        C0736a c0736aM2836i = m2836i();
        C0750h c0750h = c0736aM2836i.f6818b;
        c0750h.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA query_only");
        try {
            ik8VarMo2873e0.mo2876a0();
            boolean z = ik8VarMo2873e0.getBoolean();
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            if (!z) {
                AbstractC3695vr.m23496g(bk8Var, "PRAGMA temp_store = MEMORY");
                AbstractC3695vr.m23496g(bk8Var, "PRAGMA recursive_triggers = 1");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c0750h.f6976d) {
                    AbstractC3695vr.m23496g(bk8Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    AbstractC3695vr.m23496g(bk8Var, cl9.m4839V("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                np6 np6Var = c0750h.f6980h;
                ReentrantLock reentrantLock = np6Var.f53097a;
                reentrantLock.lock();
                try {
                    np6Var.f53100d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (c0736aM2836i.f6823g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2843p() {
        sb2 sb2Var = this.f6958e;
        if (sb2Var == null) {
            fa4.m11636J("connectionManager");
            throw null;
        }
        xg3 xg3Var = (xg3) sb2Var.f60619i;
        if (xg3Var != null) {
            return xg3Var.isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m2844q(String... strArr) {
        m2828a();
        m2829b();
        AbstractC0745f.m2827a(new RoomDatabase$performClear$1((LingQDatabase_Impl) this, strArr, null));
    }

    /* JADX INFO: renamed from: r */
    public final Object m2845r(ui3 ui3Var) {
        if (!m2840m()) {
            return AbstractC0758a.m2859b(this, false, true, new sy0(4, ui3Var));
        }
        m2830c();
        try {
            Object objMo0a = ui3Var.mo0a();
            m2846s();
            return objMo0a;
        } finally {
            m2835h();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2846s() {
        m2837j().mo397I().m24502u();
    }

    /* JADX INFO: renamed from: t */
    public final Object m2847t(boolean z, zi3 zi3Var, ContinuationImpl continuationImpl) {
        sb2 sb2Var = this.f6958e;
        if (sb2Var != null) {
            return ((hi1) sb2Var.f60617g).mo2813v(z, zi3Var, continuationImpl);
        }
        fa4.m11636J("connectionManager");
        throw null;
    }
}
