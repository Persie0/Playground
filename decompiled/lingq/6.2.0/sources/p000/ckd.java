package p000;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzxd;
import com.google.common.base.AbstractC1081a;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.C1116f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ckd {

    /* JADX INFO: renamed from: a */
    public final String f10200a;

    /* JADX INFO: renamed from: b */
    public final C3780y1 f10201b;

    /* JADX INFO: renamed from: c */
    public final rkd f10202c;

    /* JADX INFO: renamed from: d */
    public final C1116f f10203d;

    /* JADX INFO: renamed from: e */
    public final a34 f10204e;

    /* JADX INFO: renamed from: f */
    public final a34 f10205f = new a34(new cdb(this), AbstractC1120j.m6404a());

    /* JADX INFO: renamed from: g */
    public final Object f10206g;

    /* JADX INFO: renamed from: h */
    public final to2 f10207h;

    /* JADX INFO: renamed from: i */
    public List f10208i;

    public ckd(rkd rkdVar, C3780y1 c3780y1) {
        Object obj = new Object();
        this.f10206g = obj;
        this.f10208i = new ArrayList();
        this.f10202c = rkdVar;
        this.f10201b = c3780y1;
        this.f10200a = rkdVar.f59452a;
        this.f10204e = new a34(new jh9(rkdVar, 10), AbstractC1120j.m6404a());
        this.f10203d = new C1116f();
        this.f10207h = new to2();
        i8d i8dVar = new i8d(this, 3);
        synchronized (obj) {
            this.f10208i.add(i8dVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3817z1 m4825a(q8d q8dVar, c26 c26Var) {
        i8d i8dVar = new i8d(q8dVar, 2);
        int i = jmd.f45851a;
        ubd ubdVar = new ubd(3, qld.m20020a(), i8dVar);
        kmd kmdVar = lmd.f49848a;
        bna.m3979v(kmdVar, "ticker");
        switch (kmdVar.f47527a) {
            case 0:
                SystemClock.elapsedRealtimeNanos();
                break;
            default:
                SystemClock.elapsedRealtime();
                break;
        }
        String strConcat = "Update ".concat(String.valueOf(this.f10200a));
        zzxd zzxdVar = zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS;
        this.f10207h.getClass();
        zld zldVarM22257l = to2.m22257l(strConcat, zzxdVar);
        try {
            AbstractC1112b abstractC1112bM62e = this.f10205f.m62e();
            C1116f c1116f = this.f10203d;
            c1116f.m6394a(new nha(abstractC1112bM62e), AbstractC1120j.m6404a());
            ListenableFuture listenableFutureM6394a = c1116f.m6394a(jmd.m14556a(new C3329mb(this, abstractC1112bM62e, ubdVar, c26Var, 22)), AbstractC1120j.m6404a());
            AbstractC1118h.propagateCancellation(listenableFutureM6394a, abstractC1112bM62e);
            AbstractC1118h.m6400d(this.f10201b);
            C3817z1 c3817z1M6402f = AbstractC1118h.m6402f(listenableFutureM6394a, AbstractC1081a.m6266c(), AbstractC1120j.m6404a());
            zldVarM22257l.m25697a(c3817z1M6402f);
            zldVarM22257l.close();
            return c3817z1M6402f;
        } catch (Throwable th) {
            try {
                zldVarM22257l.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
