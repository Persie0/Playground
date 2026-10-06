package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guq {

    /* JADX INFO: renamed from: a */
    public static final nbh f26447a = nbh.m17259h("com/google/android/apps/camera/rewind/RewindBuffer");

    /* JADX INFO: renamed from: d */
    public final ktz f26450d = inr.m11545q(new gup(0));

    /* JADX INFO: renamed from: b */
    public final ReentrantReadWriteLock f26448b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f26449c = new ConcurrentHashMap();

    public guq() {
        new AtomicBoolean(false);
    }
}
