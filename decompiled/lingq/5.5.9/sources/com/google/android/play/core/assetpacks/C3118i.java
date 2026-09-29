package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import p290o6.C7967l0;
import p338qd.C8561n0;
import p338qd.C8576s0;
import p338qd.C8579t0;
import p338qd.InterfaceC8585v0;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3118i {

    /* JADX INFO: renamed from: g */
    public static final C7967l0 f15933g = new C7967l0("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: a */
    public final C3112c f15934a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9268p f15935b;

    /* JADX INFO: renamed from: c */
    public final C8561n0 f15936c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f15937d;

    /* JADX INFO: renamed from: e */
    public final HashMap f15938e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final ReentrantLock f15939f = new ReentrantLock();

    public C3118i(C3112c c3112c, InterfaceC9268p interfaceC9268p, C8561n0 c8561n0, InterfaceC9268p interfaceC9268p2) {
        this.f15934a = c3112c;
        this.f15935b = interfaceC9268p;
        this.f15936c = c8561n0;
        this.f15937d = interfaceC9268p2;
    }

    /* JADX INFO: renamed from: e */
    public static String m8987e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new zzck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m8988a(int i10) {
        C8579t0 c8579t0M8990c = m8990c(i10);
        C8576s0 c8576s0 = c8579t0M8990c.f46010c;
        int i11 = c8576s0.f45995d;
        if (!(i11 == 5 || i11 == 6 || i11 == 4)) {
            throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
        }
        C3112c c3112c = this.f15934a;
        String str = c8576s0.f45992a;
        int i12 = c8579t0M8990c.f46009b;
        long j10 = c8576s0.f45993b;
        if (c3112c.m8969c(str, i12, j10).exists()) {
            C3112c.m8967g(c3112c.m8969c(str, i12, j10));
        }
        int i13 = c8576s0.f45995d;
        if (i13 == 5 || i13 == 6) {
            if (!c3112c.m8974j(str, i12, j10).exists()) {
            } else {
                C3112c.m8967g(c3112c.m8974j(str, i12, j10));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8989b() {
        this.f15939f.unlock();
    }

    /* JADX INFO: renamed from: c */
    public final C8579t0 m8990c(int i10) {
        HashMap map = this.f15938e;
        Integer numValueOf = Integer.valueOf(i10);
        C8579t0 c8579t0 = (C8579t0) map.get(numValueOf);
        if (c8579t0 != null) {
            return c8579t0;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", numValueOf), i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final Object m8991d(InterfaceC8585v0 interfaceC8585v0) {
        ReentrantLock reentrantLock = this.f15939f;
        try {
            reentrantLock.lock();
            Object objZza = interfaceC8585v0.zza();
            reentrantLock.unlock();
            return objZza;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
