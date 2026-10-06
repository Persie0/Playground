package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyf extends kfv {

    /* JADX INFO: renamed from: a */
    public final dxx f12891a;

    /* JADX INFO: renamed from: b */
    public final imu f12892b;

    /* JADX INFO: renamed from: c */
    private final cem f12893c;

    /* JADX INFO: renamed from: d */
    private final Executor f12894d;

    /* JADX INFO: renamed from: e */
    private final Set f12895e = new HashSet();

    public dyf(dxx dxxVar, cem cemVar, imu imuVar, Executor executor) {
        this.f12891a = dxxVar;
        this.f12893c = cemVar;
        this.f12894d = executor;
        this.f12892b = imuVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        if (this.f12895e.isEmpty()) {
            return;
        }
        this.f12894d.execute(new bmj(this, kppVar, this.f12893c.m3566d(), 15));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m6920i(String str) {
        this.f12895e.add(str);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m6921j(String str) {
        this.f12895e.remove(str);
    }
}
