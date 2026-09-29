package com.lingq.core.common.util;

import java.util.concurrent.ConcurrentHashMap;
import p000.c83;
import p000.cd4;
import p000.g41;
import p000.nn1;
import p000.pg9;
import p000.ph2;
import p000.pn1;
import p000.un1;
import p000.vi3;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.core.common.util.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1263a {
    /* JADX INFO: renamed from: a */
    public static final void m7046a(cd4 cd4Var) {
        if (cd4Var == null || !cd4Var.mo4538b()) {
            return;
        }
        cd4Var.mo4537a(null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7047b(un1 un1Var, nn1 nn1Var, String str, vi3 vi3Var) {
        un1Var.getClass();
        nn1Var.getClass();
        ConcurrentHashMap concurrentHashMap = pn1.f56492a;
        pn1.m19406b(un1Var, str, wfb.m23926u(un1Var, nn1Var, null, new CoroutineJobManager$cancelAndLaunch$1(vi3Var, null), 2));
    }

    /* JADX INFO: renamed from: c */
    public static void m7048c(g41 g41Var, String str, vi3 vi3Var) {
        m7047b(g41Var, ph2.f56212a, str, vi3Var);
    }

    /* JADX INFO: renamed from: d */
    public static final pg9 m7049d(c83 c83Var, un1 un1Var, String str, nn1 nn1Var) {
        un1Var.getClass();
        str.getClass();
        nn1Var.getClass();
        ConcurrentHashMap concurrentHashMap = pn1.f56492a;
        pg9 pg9VarM23926u = wfb.m23926u(un1Var, nn1Var, null, new CoroutineJobManagerKt$cancellableLaunchIn$1(c83Var, null), 2);
        pn1.m19406b(un1Var, str, pg9VarM23926u);
        return pg9VarM23926u;
    }

    /* JADX INFO: renamed from: e */
    public static pg9 m7050e(c83 c83Var, g41 g41Var, String str) {
        return m7049d(c83Var, g41Var, str, ph2.f56212a);
    }
}
