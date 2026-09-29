package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import p000.AbstractC3355n0;
import p000.C0843cd;
import p000.C2924dd;
import p000.nv4;
import p000.o2d;

/* JADX INFO: renamed from: com.google.common.util.concurrent.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1113c extends AbstractC3355n0 {

    /* JADX INFO: renamed from: j */
    public static final o2d f13527j;

    /* JADX INFO: renamed from: k */
    public static final nv4 f13528k = new nv4(AbstractC1113c.class);

    /* JADX INFO: renamed from: h */
    public volatile Set f13529h;

    /* JADX INFO: renamed from: i */
    public volatile int f13530i;

    static {
        Throwable th;
        o2d c2924dd;
        try {
            c2924dd = new C0843cd(AtomicReferenceFieldUpdater.newUpdater(AbstractC1113c.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC1113c.class, "i"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c2924dd = new C2924dd();
        }
        f13527j = c2924dd;
        if (th != null) {
            f13528k.m17640a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
