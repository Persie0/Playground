package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import android.os.Trace;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfm {
    /* JADX INFO: renamed from: a */
    public static boolean m6056a(float f, float f2) {
        double dAbs = Math.abs(Math.toDegrees(f));
        double dAbs2 = Math.abs(Math.toDegrees(f2 - f));
        if (dAbs <= 1.0d) {
            return dAbs2 >= 0.1d;
        }
        return dAbs2 >= 0.5d;
    }

    /* JADX INFO: renamed from: b */
    public static void m6057b(dhy dhyVar, dhv dhvVar, kpb kpbVar, dja djaVar) {
        dhyVar.mo6187n(dhf.f11044e, Float.valueOf(1.3229325E7f));
        dhyVar.mo6187n(dhf.f11045f, Float.valueOf(3.807744E7f));
        dhyVar.mo6189p(dib.f11288av, "Pixel-2H19-Droidfood-Discuss@google.com");
        dhyVar.mo6189p(dib.f11289aw, "Pixel-2H19-Dogfood-Discuss@google.com");
        djg djgVar = (djg) dhyVar;
        djgVar.mo6194u(dib.f11333bn, true);
        djgVar.mo6194u(dib.f11237X, kpbVar.f36771d);
        djgVar.mo6194u(dib.f11337br, true);
        djgVar.mo6194u(dib.f11340bu, true);
        dhyVar.mo6186m(dib.f11372n, 1000);
        dhyVar.mo6186m(dib.f11376r, 60);
        djgVar.mo6194u(dib.f11292az, false);
        djgVar.mo6194u(dib.f11285as, false);
        djgVar.mo6192s(dib.f11350cd, false);
        dhyVar.mo6187n(dib.f11280an, Float.valueOf(0.615f));
        dhyVar.mo6186m(dib.f11362d, 2);
        djgVar.mo6194u(dib.f11342bw, true);
        djgVar.mo6194u(dib.f11313bT, false);
        djgVar.mo6194u(dhu.f11205g, true);
        djgVar.mo6194u(dhu.f11206h, true);
        djgVar.mo6194u(dhs.f11164b, true);
        djgVar.mo6194u(dhh.f11067T, true);
        djgVar.mo6194u(dhh.f11065R, true);
        djgVar.mo6194u(dhh.f11061N, true);
        djgVar.mo6194u(dhh.f11069V, true);
        djgVar.mo6194u(dhh.f11070W, true);
        djgVar.mo6194u(dhh.f11071X, true);
        djgVar.mo6194u(dhh.f11073Z, true);
        djgVar.mo6194u(dhh.f11075aa, true);
        djgVar.mo6194u(dhh.f11080af, false);
        djgVar.mo6194u(dik.f11607e, djaVar.m6200b(dja.ENG));
        djgVar.mo6194u(dil.f11624j, true);
        djgVar.mo6194u(did.f11471y, false);
        djgVar.mo6194u(did.f11442au, false);
        djgVar.mo6194u(did.f11441at, true);
        dhyVar.mo6186m(did.f11448b, 0);
        djgVar.mo6194u(did.f11420aD, false);
        djgVar.mo6194u(dig.f11496j, true);
        djgVar.mo6194u(dig.f11495i, true);
        djgVar.mo6194u(dht.f11185m, false);
        djgVar.mo6192s(dii.f11531g, false);
        djgVar.mo6194u(dii.f11542r, true);
        djgVar.mo6194u(dii.f11535k, false);
        djgVar.mo6194u(dij.f11569S, true);
        djgVar.mo6194u(dij.f11565O, true);
        djgVar.mo6194u(dij.f11596t, true);
        djgVar.mo6194u(dij.f11587k, true);
        dhyVar.mo6186m(dil.f11616b, Integer.valueOf(((Integer) dhvVar.mo6173a(dil.f11617c).get()).intValue() * 4));
        dhyVar.mo6186m(dil.f11615a, 500);
        djgVar.mo6194u(dio.f11683y, false);
        djgVar.mo6194u(dio.f11682x, true);
        djgVar.mo6194u(dio.f11650G, true);
        dhyVar.mo6186m(dio.f11660b, 2328);
        dhyVar.mo6186m(dio.f11661c, 1746);
        dhyVar.mo6186m(dio.f11662d, 2);
        djgVar.mo6194u(dio.f11653J, false);
        djgVar.mo6194u(dio.f11654K, false);
        djgVar.mo6194u(dio.f11655L, false);
        djgVar.mo6194u(dio.f11679u, false);
        djgVar.mo6194u(dib.f11273ag, true);
        djgVar.mo6194u(dib.f11276aj, true);
        djgVar.mo6194u(dib.f11279am, false);
        djgVar.mo6194u(diz.f11753a, false);
        djgVar.mo6194u(dhm.f11138c, true);
        djgVar.mo6194u(die.f11474b, false);
        djgVar.mo6194u(dis.f11705a, false);
        djgVar.mo6194u(dhp.f11153j, false);
        djgVar.mo6194u(dhu.f11202d, false);
        djgVar.mo6194u(dib.f11357ck, false);
        djgVar.mo6194u(did.f11397H, false);
        djgVar.mo6194u(did.f11398I, false);
    }

    /* JADX INFO: renamed from: c */
    public static Pair m6058c(fki fkiVar) {
        ing ingVar = new ing();
        float[] fArr = new float[16];
        inr.m11532d(fkiVar.f22374a, ingVar);
        ingVar.m11511b(fArr);
        float fAsin = (float) Math.asin(fArr[5]);
        double d = -Math.asin(fArr[4]);
        float f = fArr[6];
        float f2 = (float) d;
        if (f > 0.0f) {
            fAsin = -fAsin;
            f2 = -f2;
        }
        return new Pair(Float.valueOf(fAsin), Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: d */
    public static int m6059d(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static nps m6061f(Context context) {
        if (context instanceof ckc) {
            return ((ckc) context).mo3834c();
        }
        if (context instanceof ContextWrapper) {
            return m6061f(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Context does not supply an early-readiness Future.");
    }

    /* JADX INFO: renamed from: g */
    public static kba m6062g() {
        final int threadPriority = Process.getThreadPriority(0);
        Trace.beginSection("boost:-8");
        Process.setThreadPriority(-8);
        return new kba() { // from class: cko
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                Process.setThreadPriority(threadPriority);
                Trace.endSection();
            }
        };
    }
}
