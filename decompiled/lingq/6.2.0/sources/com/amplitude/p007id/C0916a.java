package com.amplitude.p007id;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.bl2;
import p000.eh0;
import p000.fa4;
import p000.gz3;
import p000.ho2;
import p000.nn1;
import p000.ph2;
import p000.r46;
import p000.t62;
import p000.u91;
import p000.v72;
import p000.vl1;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: com.amplitude.id.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0916a {

    /* JADX INFO: renamed from: a */
    public final bl2 f11274a;

    /* JADX INFO: renamed from: b */
    public final vl1 f11275b;

    /* JADX INFO: renamed from: c */
    public final ReentrantReadWriteLock f11276c;

    /* JADX INFO: renamed from: d */
    public gz3 f11277d;

    /* JADX INFO: renamed from: e */
    public final Object f11278e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f11279f;

    public C0916a(bl2 bl2Var) {
        v72 v72Var = ph2.f56212a;
        nn1 nn1VarMo387Z = t62.f61909c.mo387Z(1);
        this.f11274a = bl2Var;
        this.f11275b = vz1.m23619a(eh0.m11113J(r46.m20384i(), nn1VarMo387Z));
        this.f11276c = new ReentrantReadWriteLock(true);
        this.f11277d = new gz3(null, null);
        this.f11278e = new Object();
        this.f11279f = new LinkedHashSet();
        m5172b(bl2Var.m3833N(), IdentityUpdateType.Initialized);
    }

    /* JADX INFO: renamed from: a */
    public final gz3 m5171a() {
        ReentrantReadWriteLock.ReadLock lock = this.f11276c.readLock();
        lock.lock();
        try {
            return this.f11277d;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX INFO: renamed from: b */
    public final void m5172b(gz3 gz3Var, IdentityUpdateType identityUpdateType) {
        Set setM22627s1;
        gz3 gz3Var2;
        identityUpdateType.getClass();
        gz3 gz3VarM5171a = m5171a();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f11276c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f11277d = gz3Var;
            IdentityUpdateType identityUpdateType2 = IdentityUpdateType.Initialized;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (gz3Var.equals(gz3VarM5171a)) {
                return;
            }
            synchronized (this.f11278e) {
                setM22627s1 = u91.m22627s1(this.f11279f);
            }
            if (identityUpdateType != IdentityUpdateType.Initialized) {
                boolean zM11650l = fa4.m11650l(gz3Var.f41547a, gz3VarM5171a.f41547a);
                boolean z = !zM11650l;
                boolean zM11650l2 = fa4.m11650l(gz3Var.f41548b, gz3VarM5171a.f41548b);
                boolean z2 = !zM11650l2;
                if (zM11650l && zM11650l2) {
                    gz3Var2 = gz3Var;
                } else {
                    gz3Var2 = gz3Var;
                    wfb.m23926u(this.f11275b, null, null, new IdentityManagerImpl$persistIdentity$1(z, this, gz3Var2, z2, null), 3);
                }
            } else {
                gz3Var2 = gz3Var;
            }
            Iterator it = setM22627s1.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!fa4.m11650l(gz3Var2.f41547a, gz3VarM5171a.f41547a) || !fa4.m11650l(gz3Var2.f41548b, gz3VarM5171a.f41548b)) {
                        throw null;
                    }
                    throw null;
                }
                ho2.m13383c();
            }
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
