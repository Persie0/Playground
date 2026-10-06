package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djs {

    /* JADX INFO: renamed from: a */
    public static final nbh f11815a = nbh.m17259h("com/google/android/apps/camera/data/FallbackJpegsRestorer");

    /* JADX INFO: renamed from: b */
    public final gxq f11816b;

    /* JADX INFO: renamed from: c */
    public final Executor f11817c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f11818d = new AtomicBoolean(false);

    public djs(gxq gxqVar, Executor executor) {
        this.f11816b = gxqVar;
        this.f11817c = executor;
    }
}
