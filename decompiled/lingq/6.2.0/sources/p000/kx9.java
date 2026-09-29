package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.C3299li;
import p000.a34;
import p000.b3c;
import p000.gqb;
import p000.h3c;
import p000.hsb;
import p000.ij6;
import p000.jo0;
import p000.kx9;
import p000.mjb;
import p000.mq7;
import p000.nha;
import p000.y5d;

/* JADX INFO: loaded from: classes2.dex */
public final class kx9 {

    /* JADX INFO: renamed from: h */
    public static final nc0 f48558h = new nc0(5);

    /* JADX INFO: renamed from: i */
    public static boolean f48559i = true;

    /* JADX INFO: renamed from: a */
    public final nc0 f48560a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f48561b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f48562c;

    /* JADX INFO: renamed from: d */
    public final xzc f48563d;

    /* JADX INFO: renamed from: e */
    public final C0984o f48564e;

    /* JADX INFO: renamed from: f */
    public final ekd f48565f;

    /* JADX INFO: renamed from: g */
    public final jx9 f48566g;

    public kx9(C0984o c0984o, xzc xzcVar, jx9 jx9Var) {
        nc0 nc0Var = (jx9Var.mo14183d() == 8 || jx9Var.mo14183d() == 7) ? new nc0(5) : f48558h;
        this.f48561b = new AtomicInteger(0);
        this.f48562c = new AtomicBoolean(false);
        this.f48560a = nc0Var;
        this.f48564e = c0984o;
        this.f48563d = xzcVar;
        this.f48565f = new ekd(g06.m12269c().m12272b(), 1);
        this.f48566g = jx9Var;
    }

    /* JADX INFO: renamed from: a */
    public final tld m15712a(final Executor executor, Callable callable, final gw9 gw9Var) {
        lda.m16133s(this.f48561b.get() > 0);
        if (((tld) gw9Var.f41432b).mo5970l()) {
            tld tldVar = new tld();
            tldVar.m22204s();
            return tldVar;
        }
        final m58 m58Var = new m58(11);
        final wr9 wr9Var = new wr9((gw9) m58Var.f50618b);
        this.f48560a.m17334m(new xmc(this, gw9Var, m58Var, callable, wr9Var, 3), new Executor() { // from class: wzc
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((tld) gw9Var.f41432b).mo5970l()) {
                        m58Var.m16641d();
                    } else {
                        wr9Var.m24137a(e);
                    }
                    throw e;
                }
            }
        });
        return wr9Var.f67208a;
    }

    /* JADX INFO: renamed from: b */
    public final js9 m15713b(z54 z54Var) {
        js9 js9VarMo9915a;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                js9VarMo9915a = this.f48563d.mo9915a(z54Var);
                m15714c(zzou.NO_ERROR, jElapsedRealtime, z54Var);
                f48559i = false;
            } catch (MlKitException e) {
                m15714c(e.f13906a == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, jElapsedRealtime, z54Var);
                throw e;
            }
        }
        return js9VarMo9915a;
    }

    /* JADX INFO: renamed from: c */
    public final void m15714c(zzou zzouVar, long j, z54 z54Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f48564e.m5479b(new e74(this, jElapsedRealtime, zzouVar, z54Var), zzov.ON_DEVICE_TEXT_DETECT);
        mq7 mq7Var = new mq7(14, false);
        mq7Var.f51733b = zzouVar;
        mq7Var.f51734c = Boolean.valueOf(f48559i);
        vf9 vf9Var = new vf9();
        vf9Var.f65323a = umb.m22832a(this.f48566g.mo14183d());
        mq7Var.f51735d = new vgd(vf9Var);
        final b3c b3cVar = new b3c(mq7Var);
        final nha nhaVar = new nha(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor executorM6772c = C1172a.m6772c();
        final C0984o c0984o = this.f48564e;
        executorM6772c.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.n
            @Override // java.lang.Runnable
            public final void run() {
                final C0984o c0984o2 = c0984o;
                HashMap map = c0984o2.f12069j;
                final zzov zzovVar2 = zzovVar;
                if (!map.containsKey(zzovVar2)) {
                    zzba zzbaVar = new zzba();
                    zzao zzaoVar = new zzao();
                    if (!zzbaVar.isEmpty()) {
                        ij6.m13959q();
                        throw null;
                    }
                    zzaoVar.f12070c = zzbaVar;
                    map.put(zzovVar2, zzaoVar);
                }
                hsb hsbVar = (gqb) map.get(zzovVar2);
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                zzba zzbaVar2 = (zzba) ((zzal) hsbVar).f12070c;
                b3c b3cVar2 = b3cVar;
                Collection collection = (Collection) zzbaVar2.get(b3cVar2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    zzbaVar2.put(b3cVar2, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (c0984o2.m5481d(zzovVar2, jElapsedRealtime2)) {
                    c0984o2.f12068i.put(zzovVar2, Long.valueOf(jElapsedRealtime2));
                    Executor executorM6772c2 = C1172a.m6772c();
                    final nha nhaVar2 = nhaVar;
                    executorM6772c2.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0984o c0984o3 = c0984o2;
                            HashMap map2 = c0984o3.f12069j;
                            zzov zzovVar3 = zzovVar2;
                            hsb hsbVar2 = (gqb) map2.get(zzovVar3);
                            if (hsbVar2 != null) {
                                AbstractC0975f abstractC0975f = (AbstractC0975f) hsbVar2;
                                C0973d c0973d = abstractC0975f.f12034a;
                                if (c0973d == null) {
                                    zzal zzalVar = (zzal) abstractC0975f;
                                    C0973d c0973d2 = new C0973d(zzalVar, zzalVar.f12070c);
                                    abstractC0975f.f12034a = c0973d2;
                                    c0973d = c0973d2;
                                }
                                for (Object obj : c0973d) {
                                    zzaa zzaaVar = (zzaa) hsbVar2;
                                    Object arrayList2 = (Collection) ((zzba) zzaaVar.f12070c).get(obj);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList(3);
                                    }
                                    List list = (List) arrayList2;
                                    ArrayList arrayList3 = new ArrayList(list instanceof RandomAccess ? new mjb(zzaaVar, obj, list, null) : new C0974e(zzaaVar, obj, list, null));
                                    Collections.sort(arrayList3);
                                    a34 a34Var = new a34();
                                    Iterator it = arrayList3.iterator();
                                    long jLongValue = 0;
                                    while (it.hasNext()) {
                                        jLongValue += ((Long) it.next()).longValue();
                                    }
                                    a34Var.f175c = Long.valueOf((jLongValue / ((long) arrayList3.size())) & Long.MAX_VALUE);
                                    a34Var.f173a = Long.valueOf(C0984o.m5478a(arrayList3, 100.0d) & Long.MAX_VALUE);
                                    a34Var.f178f = Long.valueOf(C0984o.m5478a(arrayList3, 75.0d) & Long.MAX_VALUE);
                                    a34Var.f177e = Long.valueOf(C0984o.m5478a(arrayList3, 50.0d) & Long.MAX_VALUE);
                                    a34Var.f176d = Long.valueOf(C0984o.m5478a(arrayList3, 25.0d) & Long.MAX_VALUE);
                                    a34Var.f174b = Long.valueOf(Long.MAX_VALUE & C0984o.m5478a(arrayList3, 0.0d));
                                    y5d y5dVar = new y5d(a34Var);
                                    int size = arrayList3.size();
                                    kx9 kx9Var = (kx9) nhaVar2.f52742a;
                                    b3c b3cVar3 = (b3c) obj;
                                    a34 a34Var2 = new a34();
                                    a34Var2.f175c = kx9Var.f48566g.mo14186g() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
                                    mq7 mq7Var2 = new mq7(13, false);
                                    mq7Var2.f51734c = Integer.valueOf(size & Integer.MAX_VALUE);
                                    mq7Var2.f51733b = b3cVar3;
                                    mq7Var2.f51735d = y5dVar;
                                    a34Var2.f178f = new h3c(mq7Var2);
                                    C1172a.m6772c().execute(new jo0(c0984o3, new C3299li(a34Var2, 0), zzovVar3, c0984o3.m5480c(), 13, false));
                                }
                                map2.remove(zzovVar3);
                            }
                        }
                    });
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        ekd ekdVar = this.f48565f;
        int iMo14187h = this.f48566g.mo14187h();
        int iZza = zzouVar.zza();
        synchronized (ekdVar) {
            AtomicLong atomicLong = ekdVar.f37402b;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ekdVar.f37402b.get() <= 1800000) {
                return;
            }
            ekdVar.f37401a.m317d(new TelemetryData(0, Arrays.asList(new MethodInvocation(iMo14187h, iZza, 0, j2, jCurrentTimeMillis, null, null, 0, -1)))).mo5961c(new rr3(ekdVar, jElapsedRealtime2, 5));
        }
    }
}
