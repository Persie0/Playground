package p000;

import android.content.Context;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p021j$.util.Collection$EL;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyn {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f26850f = 0;

    /* JADX INFO: renamed from: g */
    private static final SimpleDateFormat f26851g;

    /* JADX INFO: renamed from: a */
    public final long f26852a;

    /* JADX INFO: renamed from: b */
    public final gyx f26853b;

    /* JADX INFO: renamed from: c */
    public final Context f26854c;

    /* JADX INFO: renamed from: d */
    public final String f26855d;

    /* JADX INFO: renamed from: e */
    public final kbo f26856e;

    /* JADX INFO: renamed from: h */
    private final msi f26857h;

    /* JADX INFO: renamed from: i */
    private final dzk f26858i;

    /* JADX INFO: renamed from: j */
    private String f26859j = null;

    /* JADX INFO: renamed from: k */
    private final Map f26860k = new HashMap();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f26851g = simpleDateFormat;
    }

    public gyn(msi msiVar, long j, dzk dzkVar, String str, kbo kboVar, gyx gyxVar, Context context) {
        this.f26857h = msiVar;
        this.f26852a = j;
        this.f26858i = dzkVar == null ? dzk.NONE : dzkVar;
        this.f26855d = str;
        this.f26856e = kboVar.mo6314a("GcaMediaGroup");
        this.f26853b = gyxVar;
        this.f26854c = context;
    }

    /* JADX INFO: renamed from: j */
    private final synchronized gyj m9978j(String str, boolean z) {
        gyj gyjVar;
        if (z) {
            lku.m15616K(Collection$EL.stream(this.f26860k.keySet()).noneMatch(fjv.f22317k), "Already created a primary item: %s", this.f26860k);
        }
        gyjVar = new gyj(this, m9983c().mo14690a(str), this.f26858i, z);
        this.f26860k.put(gyjVar, gym.PENDING);
        return gyjVar;
    }

    /* JADX INFO: renamed from: k */
    private final synchronized void m9979k() {
        this.f26856e.mo13944f(pIeXJQLZLfgIN.uwxkYfNSYewyQ.concat(toString()));
        gyj gyjVar = null;
        gyj gyjVar2 = null;
        for (gyj gyjVar3 : this.f26860k.keySet()) {
            if (gyjVar3.f26833b) {
                lku.m15619N(gyjVar2 == null, "Found multiple primaries (%s and %s) in %s: %s", gyjVar2, gyjVar3, this, this.f26860k);
                gyjVar2 = gyjVar3;
            } else if (gyjVar == null && this.f26860k.get(gyjVar3) == gym.PUBLISH) {
                gyjVar = gyjVar3;
            }
        }
        Map map = this.f26860k;
        gyjVar2.getClass();
        if (map.get(gyjVar2) != gym.PUBLISH) {
            if (gyjVar == null) {
                this.f26856e.mo13947i(String.format(Locale.ROOT, "No published files found for %s: %s", this, this.f26860k));
                m9983c().mo14691b();
                return;
            }
            try {
                FileInputStream fileInputStreamMo14684d = gyjVar.f26832a.mo14684d();
                try {
                    kxk.m15014g(fileInputStreamMo14684d, gyjVar2.f26832a);
                    gyjVar2.m9977b();
                    gyjVar.m9976a();
                    fileInputStreamMo14684d.close();
                } catch (Throwable th) {
                    try {
                        fileInputStreamMo14684d.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f26856e.mo13948j(String.format(Locale.ROOT, "Error publishing %s: %s", this, this.f26860k), e);
                m9983c().mo14691b();
            }
        }
        for (gyj gyjVar4 : this.f26860k.keySet()) {
            gym gymVar = (gym) this.f26860k.get(gyjVar4);
            gymVar.getClass();
            switch (gymVar.ordinal()) {
                case 0:
                    gyjVar4.f26832a.mo14687g();
                    break;
                case 1:
                case 2:
                    gyjVar4.f26832a.mo14686f();
                    break;
            }
        }
        this.f26856e.mo13944f("State before publishing: ".concat(this.f26860k.toString()));
        m9983c().mo14693d();
    }

    /* JADX INFO: renamed from: l */
    private final synchronized boolean m9980l() {
        boolean z;
        z = this.f26859j == null;
        if (z) {
            this.f26859j = "Ignored";
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final gyj m9981a(String str) {
        return m9978j(str, true);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kqc m9982b() {
        return ((gyj) Collection$EL.stream(this.f26860k.keySet()).filter(fjv.f22317k).findFirst().get()).f26832a;
    }

    /* JADX INFO: renamed from: c */
    public final kqg m9983c() {
        return (kqg) this.f26857h.mo6051a();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m9984d() {
        if (m9980l()) {
            Iterator it = this.f26860k.keySet().iterator();
            while (it.hasNext()) {
                ((gyj) it.next()).f26832a.mo14686f();
            }
            m9983c().mo14691b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9985e(kqf kqfVar) {
        m9983c().mo14692c(kqfVar);
    }

    /* JADX INFO: renamed from: f */
    final synchronized void m9986f(gyj gyjVar, gym gymVar) {
        lku.m15617L(this.f26860k.containsKey(gyjVar), "Trying to mark as published %s not contained in %s", gyjVar, this.f26860k);
        this.f26860k.put(gyjVar, gymVar);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m9987g() {
        if (m9980l()) {
            m9979k();
        }
    }

    /* JADX INFO: renamed from: h */
    public final gyj m9988h() {
        return m9978j("jpg", false);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized gyj m9989i() {
        gyj gyjVar;
        gyjVar = new gyj(this, m9983c().mo14696g(), this.f26858i, false);
        this.f26860k.put(gyjVar, gym.PENDING);
        return gyjVar;
    }

    public final String toString() {
        String strConcat = mro.m16832b(this.f26855d) ? "" : "-".concat(String.valueOf(this.f26855d));
        return KMNlNMe.GFyIesQ + f26851g.format(new Date(this.f26852a)) + strConcat + " MediaGroup(" + String.valueOf(this.f26858i) + ", " + String.valueOf(this.f26853b) + ")";
    }
}
