package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmr {

    /* JADX INFO: renamed from: a */
    public static final nbh f28356a = nbh.m17259h("com/google/android/apps/camera/storage/spacechecker/StorageSpaceCheckerImpl");

    /* JADX INFO: renamed from: b */
    public final kbz f28357b;

    /* JADX INFO: renamed from: c */
    public final kpa f28358c;

    /* JADX INFO: renamed from: d */
    public final dhv f28359d;

    /* JADX INFO: renamed from: e */
    public final hlw f28360e;

    /* JADX INFO: renamed from: f */
    private final Executor f28361f;

    public hmr(hlw hlwVar, Executor executor, kbz kbzVar, kpa kpaVar, dhv dhvVar) {
        this.f28360e = hlwVar;
        this.f28361f = executor;
        this.f28357b = kbzVar;
        this.f28358c = kpaVar;
        this.f28359d = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final nps m10468a() {
        return m10469b(this.f28361f);
    }

    /* JADX INFO: renamed from: b */
    public final nps m10469b(Executor executor) {
        return kxk.m14969O(new bdv(this, 13), executor);
    }
}
