package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azb implements ayo, bbp {

    /* JADX INFO: renamed from: g */
    private static final String f2746g = ayc.m2100b("Processor");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f2747a;

    /* JADX INFO: renamed from: h */
    private final Context f2753h;

    /* JADX INFO: renamed from: i */
    private final axp f2754i;

    /* JADX INFO: renamed from: k */
    private final C1058va f2756k;

    /* JADX INFO: renamed from: c */
    public final Map f2749c = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f2748b = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Set f2751e = new HashSet();

    /* JADX INFO: renamed from: j */
    private final List f2755j = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final Object f2752f = new Object();

    /* JADX INFO: renamed from: d */
    public final Map f2750d = new HashMap();

    public azb(Context context, axp axpVar, C1058va c1058va, WorkDatabase workDatabase, byte[] bArr) {
        this.f2753h = context;
        this.f2754i = axpVar;
        this.f2756k = c1058va;
        this.f2747a = workDatabase;
    }

    /* JADX INFO: renamed from: f */
    public static void m2110f(azs azsVar) {
        if (azsVar == null) {
            ayc.m2099a();
            return;
        }
        azsVar.f2798e = true;
        azsVar.m2137c();
        azsVar.f2800g.cancel(true);
        if (azsVar.f2797d == null || !azsVar.f2800g.isCancelled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("WorkSpec ");
            sb.append(azsVar.f2796c);
            sb.append(" is already done. Not interrupting.");
            ayc.m2099a();
        } else {
            azsVar.f2797d.m2098h();
        }
        ayc.m2099a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: h */
    private final void m2111h(bcj bcjVar) {
        this.f2756k.f47803b.execute(new RunnableC0058bd(this, bcjVar, 16));
    }

    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        synchronized (this.f2752f) {
            azs azsVar = (azs) this.f2749c.get(bcjVar.f2946a);
            if (azsVar != null && bcjVar.equals(bbu.m2189b(azsVar.f2796c))) {
                this.f2749c.remove(bcjVar.f2946a);
            }
            ayc.m2099a();
            getClass().getSimpleName();
            Iterator it = this.f2755j.iterator();
            while (it.hasNext()) {
                ((ayo) it.next()).mo1714a(bcjVar, z);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2112b(ayo ayoVar) {
        synchronized (this.f2752f) {
            this.f2755j.add(ayoVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2113c(ayo ayoVar) {
        synchronized (this.f2752f) {
            this.f2755j.remove(ayoVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2114d() {
        synchronized (this.f2752f) {
            if (this.f2748b.isEmpty()) {
                Intent intent = new Intent(this.f2753h, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f2753h.startService(intent);
                } catch (Throwable th) {
                    ayc.m2099a();
                    Log.e(f2746g, "Unable to stop foreground service", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2115e(String str) {
        boolean z;
        synchronized (this.f2752f) {
            z = true;
            if (!this.f2749c.containsKey(str) && !this.f2748b.containsKey(str)) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    /* JADX INFO: renamed from: g */
    public final boolean m2116g(bkn bknVar) {
        Object obj = bknVar.f3651a;
        bcj bcjVar = (bcj) obj;
        String str = bcjVar.f2946a;
        ArrayList arrayList = new ArrayList();
        bcv bcvVar = (bcv) this.f2747a.m1819d(new ghf(this, arrayList, str, 1));
        if (bcvVar == null) {
            ayc.m2099a();
            String str2 = f2746g;
            StringBuilder sb = new StringBuilder();
            sb.append("Didn't find WorkSpec for id ");
            sb.append(obj);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(obj.toString()));
            m2111h(bcjVar);
            return false;
        }
        synchronized (this.f2752f) {
            if (m2115e(str)) {
                Set set = (Set) this.f2750d.get(str);
                if (((bcj) ((bkn) set.iterator().next()).f3651a).f2947b == ((bcj) obj).f2947b) {
                    set.add(bknVar);
                    ayc.m2099a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Work ");
                    sb2.append(obj);
                    sb2.append(" is already enqueued for processing");
                } else {
                    m2111h((bcj) obj);
                }
                return false;
            }
            if (bcvVar.f2980q != ((bcj) obj).f2947b) {
                m2111h((bcj) obj);
                return false;
            }
            azs azsVar = new azs(new ljf(this.f2753h, this.f2754i, this.f2756k, this, this.f2747a, bcvVar, arrayList, (byte[]) null), null, null, null, null);
            bev bevVar = azsVar.f2799f;
            bevVar.mo2282d(new aza(this, (bcj) bknVar.f3651a, bevVar, 0), this.f2756k.f47803b);
            this.f2749c.put(str, azsVar);
            HashSet hashSet = new HashSet();
            hashSet.add(bknVar);
            this.f2750d.put(str, hashSet);
            ((beb) this.f2756k.f47802a).execute(azsVar);
            ayc.m2099a();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getClass().getSimpleName());
            sb3.append(": processing ");
            sb3.append(obj);
            return true;
        }
    }
}
