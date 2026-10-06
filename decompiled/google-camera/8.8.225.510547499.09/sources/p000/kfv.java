package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kfv {
    /* JADX INFO: renamed from: A */
    public static String m14164A(long j) {
        return m14169p(j % 1000, 3);
    }

    /* JADX INFO: renamed from: B */
    public static String m14165B(long j) {
        return m14169p(j, 2);
    }

    /* JADX INFO: renamed from: C */
    public static void m14166C(kbz kbzVar, String str, Runnable runnable) {
        try {
            kbzVar.mo13961e(str);
            runnable.run();
        } finally {
            kbzVar.mo13962f();
        }
    }

    /* JADX INFO: renamed from: D */
    public static String m14167D() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < stackTrace.length; i++) {
            sb.append("\t");
            sb.append(stackTrace[i]);
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static String m14168E(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    /* JADX INFO: renamed from: p */
    private static String m14169p(long j, int i) {
        return lku.m15666t(Long.toString(j), i);
    }

    /* JADX INFO: renamed from: s */
    public static void m14170s(key keyVar, kfu kfuVar) {
        keyVar.mo7050k(new kfp(kfuVar, keyVar));
    }

    /* JADX INFO: renamed from: t */
    public static void m14171t(key keyVar) {
        if (keyVar.mo7044e() || keyVar.mo7045f()) {
            return;
        }
        kfs kfsVar = new kfs();
        keyVar.mo7050k(kfsVar);
        kfsVar.m14162p();
    }

    /* JADX INFO: renamed from: u */
    public static void m14172u(key keyVar) {
        if (keyVar.mo7044e() || keyVar.mo7047h() || keyVar.mo7045f()) {
            return;
        }
        kfq kfqVar = new kfq();
        keyVar.mo7050k(kfqVar);
        kfqVar.m14162p();
    }

    /* JADX INFO: renamed from: v */
    public static void m14173v(key keyVar) {
        if (keyVar.mo7044e() || keyVar.mo7048i() || keyVar.mo7045f()) {
            return;
        }
        kfr kfrVar = new kfr();
        keyVar.mo7050k(kfrVar);
        kfrVar.m14162p();
    }

    /* JADX INFO: renamed from: w */
    public static void m14174w(kiq kiqVar, kfu kfuVar) {
        key keyVarM14357a = kiqVar.m14357a();
        if (keyVarM14357a != null) {
            m14170s(keyVarM14357a, kfuVar);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m14175y(short s) {
        return ((s & (-16)) != -64 || s == -60 || s == -56 || s == -52) ? false : true;
    }

    /* JADX INFO: renamed from: aZ */
    public void mo5454aZ(kgg kggVar, long j) {
    }

    /* JADX INFO: renamed from: ba */
    public void mo5455ba(kll kllVar) {
    }

    /* JADX INFO: renamed from: bb */
    public void mo4006bb() {
    }

    /* JADX INFO: renamed from: bc */
    public void mo4007bc() {
    }

    /* JADX INFO: renamed from: bi */
    public void mo5510bi() {
    }

    /* JADX INFO: renamed from: bj */
    public void mo6427bj(kpl kplVar) {
    }

    /* JADX INFO: renamed from: bk */
    public void mo9226bk(long j, int i) {
    }

    /* JADX INFO: renamed from: bl */
    public void mo9227bl(long j, int i, long j2) {
    }

    /* JADX INFO: renamed from: bm */
    public void mo9228bm(long j, Set set) {
    }

    /* JADX INFO: renamed from: bn */
    public void mo8901bn(kfd kfdVar) {
    }

    /* JADX INFO: renamed from: bo */
    public void mo6748bo(kpp kppVar) {
    }

    /* JADX INFO: renamed from: bu */
    public void mo3408bu(kpp kppVar) {
    }

    /* JADX INFO: renamed from: bv */
    public void mo9229bv(long j, int i) {
    }

    /* JADX INFO: renamed from: bw */
    public Executor mo11578bw() {
        return null;
    }

    /* JADX INFO: renamed from: bx */
    public void mo9369bx() {
    }
}
