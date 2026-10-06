package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kgq {
    /* JADX INFO: renamed from: b */
    public static kgi m14212b(kmg kmgVar, kbc kbcVar) {
        kgh kghVarM14208a = kgi.m14208a();
        kghVarM14208a.m14206k(kgj.SURFACE_VIEW);
        kghVarM14208a.m14197b(kmgVar);
        kghVarM14208a.m14204i(kbcVar);
        return kghVarM14208a.m14196a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m14213c(int i) {
        switch (i) {
            case 1:
                return "ANY";
            case 2:
                return "IMMEDIATE_LOCKED";
            case 3:
                return "CONVERGED";
            case 4:
                return "LOCKED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14214d(int i) {
        if (i == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static kfy m14215e(CaptureRequest.Key key, Object obj) {
        return new kfy(key, obj);
    }

    /* JADX INFO: renamed from: f */
    public static Set m14216f(Iterable iterable) {
        mxi mxiVarM17132D = mxk.m17132D();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mxiVarM17132D.mo17072d(((CaptureRequest.Key) it.next()).getName());
        }
        return mxiVarM17132D.mo17127f();
    }
}
