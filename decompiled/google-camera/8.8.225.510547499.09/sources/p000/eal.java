package p000;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eal implements kni {

    /* JADX INFO: renamed from: b */
    private final kni f13069b;

    /* JADX INFO: renamed from: c */
    private final jvb f13070c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f13071d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final Set f13068a = new HashSet();

    public eal(kni kniVar, jvb jvbVar) {
        this.f13069b = kniVar;
        this.f13070c = jvbVar;
    }

    @Override // p000.kni
    /* JADX INFO: renamed from: a */
    public final knh mo7000a(String str) {
        knh knhVarMo7000a = this.f13069b.mo7000a(str);
        if (knhVarMo7000a == null) {
            return null;
        }
        if (!this.f13071d.getAndSet(true)) {
            this.f13070c.m13537d(new dev(this, 18));
        }
        eak eakVar = new eak(this, knhVarMo7000a);
        synchronized (this) {
            this.f13068a.add(eakVar);
        }
        return eakVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7001b() {
        if (!this.f13068a.isEmpty()) {
            throw new IllegalStateException(String.format(Locale.US, "%d gyro sessions, e.g. %s, leaked", Integer.valueOf(this.f13068a.size()), ((knh) this.f13068a.iterator().next()).mo6998a()));
        }
    }
}
