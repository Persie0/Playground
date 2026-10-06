package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flc {

    /* JADX INFO: renamed from: a */
    public final kbo f22456a;

    /* JADX INFO: renamed from: b */
    public final fky f22457b;

    /* JADX INFO: renamed from: c */
    public final long f22458c;

    /* JADX INFO: renamed from: d */
    public final Set f22459d = new HashSet();

    /* JADX INFO: renamed from: e */
    public boolean f22460e = false;

    /* JADX INFO: renamed from: f */
    public long f22461f = 0;

    public flc(kbo kboVar, fky fkyVar, dhv dhvVar) {
        this.f22456a = kboVar.mo6314a("LongPressTrimming");
        this.f22457b = fkyVar;
        this.f22458c = TimeUnit.MICROSECONDS.convert(((Integer) dhvVar.mo6173a(dii.f11526b).get()).intValue(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized flf m8541a(long j, flf flfVar) {
        return new flb(this, j, flfVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8542b() {
        this.f22460e = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final synchronized boolean m8543c() {
        return this.f22460e;
    }
}
