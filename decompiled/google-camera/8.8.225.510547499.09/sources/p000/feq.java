package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class feq {

    /* JADX INFO: renamed from: d */
    private static final nbh f21546d = nbh.m17259h("com/google/android/apps/camera/memory/MemoryManager");

    /* JADX INFO: renamed from: b */
    public final Executor f21548b;

    /* JADX INFO: renamed from: e */
    private final long f21550e;

    /* JADX INFO: renamed from: c */
    public final EnumMap f21549c = new EnumMap(fel.class);

    /* JADX INFO: renamed from: a */
    public final Object f21547a = new Object();

    public feq(lbn lbnVar, Executor executor, byte[] bArr) {
        this.f21550e = lbnVar.f37881a;
        this.f21548b = executor;
    }

    /* JADX INFO: renamed from: b */
    private final long m8301b() {
        long j;
        synchronized (this.f21547a) {
            Iterator it = this.f21549c.keySet().iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += ((Long) ((jwf) ((AmbientModeSupport.AmbientController) ((fep) this.f21549c.get((fel) it.next())).f21544c).m1663m()).f34942d).longValue();
            }
            j = this.f21550e - jLongValue;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final void m8302a() {
        boolean z;
        synchronized (this.f21547a) {
            m8301b();
            for (fel felVar : this.f21549c.keySet()) {
                Object obj = ((fep) this.f21549c.get(felVar)).f21542a;
                synchronized (this.f21547a) {
                    long jM8301b = m8301b();
                    long jLongValue = ((Long) ((jwp) ((AmbientModeSupport.AmbientController) ((fep) this.f21549c.get(felVar)).f21544c).m1662l()).f34961a).longValue();
                    z = false;
                    if (jLongValue < 0) {
                        ((nbe) ((nbe) f21546d.m17252c()).mo17276G(2157)).mo17300y("Feature (%s) reports negative shot memory: %d. Disabling.", felVar.name(), jLongValue);
                    } else {
                        z = jLongValue <= jM8301b;
                        felVar.name();
                    }
                }
                ((jwf) obj).mo3415bf(Boolean.valueOf(z));
            }
        }
    }
}
