package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khe implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36011a;

    /* JADX INFO: renamed from: b */
    private final oju f36012b;

    public khe(oju ojuVar, oju ojuVar2) {
        this.f36011a = ojuVar;
        this.f36012b = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, kpx] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kpx] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kbo] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        mrm mrmVar;
        kpz kpzVarMo9570a;
        long j;
        kkt kktVar;
        boolean z;
        lji ljiVar = ((kla) this.f36011a).get();
        mws mwsVar = ((khc) this.f36012b).get().f35843g;
        ljiVar.f38390h.mo13961e("createStreamMap");
        mxi mxiVarM17132D = mxk.m17132D();
        mxi mxiVarM17132D2 = mxk.m17132D();
        mxi mxiVarM17132D3 = mxk.m17132D();
        nba it = mwsVar.iterator();
        while (it.hasNext()) {
            kgi kgiVar = (kgi) it.next();
            kmg kmgVar = (kmg) kgiVar.f35900b.mo16811e(((kfn) ljiVar.f38389g).f35837a);
            boolean zContains = ljiVar.f38387e.contains(kmgVar);
            if (!kmgVar.equals(((kfn) ljiVar.f38389g).f35837a) && !zContains) {
                String strConcat = !ljiVar.f38387e.isEmpty() ? " or one of its physical cameras: ".concat(String.valueOf(String.valueOf(ljiVar.f38387e))) : "";
                ljiVar.f38388f.mo13947i("Stream configuration is invalid. Camera-" + kmgVar.f36540a + " does not match " + String.valueOf(((kfn) ljiVar.f38389g).f35837a) + strConcat + ". " + String.valueOf(kgiVar) + KMNlNMe.yQvuqrrFb);
            } else if (kgiVar.f35899a == kgj.f35913a) {
                Object obj = ljiVar.f38386d;
                kbc kbcVar = kgiVar.f35902d;
                int i = kgiVar.f35903e;
                int iMax = Math.max(3, Math.min(kgiVar.f35904f + 2, ljiVar.f38383a));
                mrm mrmVar2 = kgiVar.f35905g;
                mrm mrmVar3 = kgiVar.f35906h;
                boolean z2 = kgiVar.f35911m;
                jvb jvbVar = new jvb();
                String strM15698r = lle.m15698r(i, kbcVar.f35517a);
                mca mcaVar = (mca) obj;
                nba nbaVar = it;
                kbo kboVarMo6314a = mcaVar.f39920h.mo6314a(strM15698r);
                Object obj2 = mcaVar.f39913a;
                Handler handlerM13558f = jvh.m13558f(jvbVar, strM15698r);
                boolean z3 = ((kpa) mcaVar.f39919g).f36760c;
                boolean zMo16813g = mrmVar2.mo16813g();
                mxi mxiVar = mxiVarM17132D3;
                mxi mxiVar2 = mxiVarM17132D2;
                int iIntValue = ((Integer) mcaVar.f39915c.mo14560m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
                if (zMo16813g) {
                    mrmVar = mrmVar2;
                    kpzVarMo9570a = mcaVar.f39921i.mo9571b(kbcVar.f35517a, kbcVar.f35518b, i, iMax, ((Long) mrmVar2.mo16809c()).longValue());
                } else {
                    mrmVar = mrmVar2;
                    if (mrmVar.mo16813g()) {
                        kboVarMo6314a.mo13947i("Ignoring flags (" + Long.toHexString(((Long) mrmVar.mo16809c()).longValue()) + "). They are not supported on the current OS.");
                    }
                    kpzVarMo9570a = mcaVar.f39921i.mo9570a(kbcVar.f35517a, kbcVar.f35518b, i, iMax);
                }
                jvbVar.m13537d(kpzVarMo9570a);
                if (iIntValue != 1) {
                    kboVarMo6314a = kboVarMo6314a;
                    j = 0;
                    kboVarMo6314a.mo13944f("Using fuzzy timestamp matching.");
                    kktVar = new kkt(0L, 8333333L);
                } else if (zMo16813g && mrmVar.mo16813g() && (((Long) mrmVar.mo16809c()).longValue() & 65536) != 0) {
                    long j2 = -((lbn) mcaVar.f39918f).f37881a;
                    kboVarMo6314a.mo13944f("Using fuzzy timestamp matching with an initial offset of: " + j2 + "ns");
                    kboVarMo6314a = kboVarMo6314a;
                    kktVar = new kkt(j2, 8333333L);
                    j = 0;
                } else {
                    kboVarMo6314a.mo13944f("Using exact timestamp matching.");
                    j = 0;
                    kktVar = new kkt(0L, 0L);
                }
                long jM15724j = lme.m15724j(i, kbcVar);
                if (jM15724j <= j || !z2) {
                    z = zContains;
                    kboVarMo6314a.mo13944f("Skipping memory reservation.");
                } else {
                    try {
                        if (((mca) obj).f39915c.mo14554g(i, kbcVar) < 67000000) {
                            int iM14978X = kxk.m14978X(((Byte) mcaVar.f39915c.mo14560m(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, (byte) 2)).byteValue(), 2, 8);
                            int iM1591W = (int) ((((AmbientDelegate) mcaVar.f39917e).m1591W() / 2) / jM15724j);
                            if (iM14978X > iM1591W) {
                                iM14978X = iM1591W;
                            }
                            long j3 = ((long) iM14978X) * jM15724j;
                            double d = j3;
                            Double.isNaN(d);
                            Locale locale = Locale.ROOT;
                            z = zContains;
                            double d2 = jM15724j;
                            Double.isNaN(d2);
                            kboVarMo6314a.mo13944f(String.format(locale, "Reserved %6.2f MiB(%6.2f MiB/image * %s) to estimate HAL memory usage.", Double.valueOf(d / 1048576.0d), Double.valueOf(d2 / 1048576.0d), Integer.valueOf(iM14978X)));
                            knw knwVarM1594Z = ((AmbientDelegate) mcaVar.f39917e).m1594Z(j3);
                            if (knwVarM1594Z != null) {
                                jvbVar.m13537d(knwVarM1594Z);
                            }
                        } else {
                            z = zContains;
                        }
                    } catch (IllegalArgumentException e) {
                    }
                }
                final kkw kkwVar = new kkw(kpzVarMo9570a, jvbVar, new juy(handlerM13558f), kboVarMo6314a, mcaVar.f39914b, (lpe) mcaVar.f39916d, kktVar, null, null, null, null);
                kpzVarMo9570a.mo14514i(new kpy() { // from class: kkv
                    @Override // p000.kpy
                    /* JADX INFO: renamed from: ca */
                    public final void mo8395ca() {
                        kkwVar.m14469a();
                    }
                }, handlerM13558f);
                ((jvb) ljiVar.f38384b).m13537d(kkwVar);
                kkq kkqVar = new kkq(kgiVar, (kmg) kgiVar.f35900b.mo16811e(((kfn) ljiVar.f38389g).f35837a), kkwVar, kkwVar.f36416a.mo14508c() - 2, z);
                mxiVarM17132D = mxiVarM17132D;
                mxiVarM17132D.mo17072d(kkqVar);
                mxiVarM17132D2 = mxiVar2;
                mxiVarM17132D2.mo17072d(kkqVar);
                Object obj3 = ljiVar.f38385c;
                String str = kkqVar.f36445f.f36540a;
                int iMo14191a = kkqVar.mo14191a();
                kbc kbcVar2 = kkqVar.f36399b;
                ((lpe) obj3).m15817p(str, "buffered", iMo14191a, kbcVar2.f35517a, kbcVar2.f35518b, kkqVar.f36401d);
                it = nbaVar;
                mxiVarM17132D3 = mxiVar;
            } else {
                mxi mxiVar3 = mxiVarM17132D3;
                kkr kkrVar = new kkr(kgiVar, (kmg) kgiVar.f35900b.mo16811e(((kfn) ljiVar.f38389g).f35837a), kgiVar.f35902d, kgiVar.f35903e, zContains);
                mxiVarM17132D.mo17072d(kkrVar);
                mxiVar3.mo17072d(kkrVar);
                Object obj4 = ljiVar.f38385c;
                String str2 = kkrVar.f36445f.f36540a;
                int i2 = kgiVar.f35903e;
                kbc kbcVar3 = kgiVar.f35902d;
                ((lpe) obj4).m15817p(str2, "external", i2, kbcVar3.f35517a, kbcVar3.f35518b, 0);
                mxiVarM17132D3 = mxiVar3;
                it = it;
            }
        }
        mxi mxiVar4 = mxiVarM17132D3;
        mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
        if (mxkVarMo17127f.isEmpty()) {
            ljiVar.f38388f.mo13942d("No streams available, camera configuration will fail!");
        }
        kkz kkzVar = new kkz(mxkVarMo17127f, mxiVarM17132D2.mo17127f(), mxiVar4.mo17127f());
        ljiVar.f38390h.mo13962f();
        return kkzVar;
    }
}
