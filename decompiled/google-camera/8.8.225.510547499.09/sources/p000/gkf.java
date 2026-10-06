package p000;

import android.util.Pair;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p021j$.util.Collection$EL;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkf {

    /* JADX INFO: renamed from: a */
    public static final nbh f25251a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckShastaZslController");

    /* JADX INFO: renamed from: b */
    public final kfk f25252b;

    /* JADX INFO: renamed from: c */
    public final gmo f25253c;

    /* JADX INFO: renamed from: d */
    public final gof f25254d;

    /* JADX INFO: renamed from: e */
    public final gks f25255e;

    /* JADX INFO: renamed from: f */
    public final ebz f25256f;

    /* JADX INFO: renamed from: g */
    public final kbz f25257g;

    /* JADX INFO: renamed from: h */
    public final gir f25258h;

    /* JADX INFO: renamed from: i */
    public final goo f25259i;

    /* JADX INFO: renamed from: j */
    public final goj f25260j;

    /* JADX INFO: renamed from: k */
    public final nta f25261k;

    /* JADX INFO: renamed from: l */
    public final Executor f25262l;

    /* JADX INFO: renamed from: m */
    public final Executor f25263m;

    /* JADX INFO: renamed from: n */
    public final gva f25264n;

    /* JADX INFO: renamed from: o */
    private final ecq f25265o;

    /* JADX INFO: renamed from: p */
    private final gjt f25266p;

    public gkf(ecq ecqVar, kfk kfkVar, gmo gmoVar, gjt gjtVar, gva gvaVar, gof gofVar, gks gksVar, ebz ebzVar, kbz kbzVar, gir girVar, goo gooVar, goj gojVar, nta ntaVar, Executor executor, Executor executor2, byte[] bArr) {
        this.f25265o = ecqVar;
        this.f25252b = kfkVar;
        this.f25266p = gjtVar;
        this.f25253c = gmoVar;
        this.f25254d = gofVar;
        this.f25264n = gvaVar;
        this.f25255e = gksVar;
        this.f25256f = ebzVar;
        this.f25257g = kbzVar;
        this.f25258h = girVar;
        this.f25259i = gooVar;
        this.f25260j = gojVar;
        this.f25261k = ntaVar;
        this.f25262l = executor;
        this.f25263m = executor2;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m9360a(eem eemVar, kpp kppVar, kho khoVar, kfo kfoVar, BurstSpec burstSpec) {
        int i;
        Pair pairCreate;
        kbz kbzVar;
        kbz kbzVar2;
        try {
            this.f25257g.mo13961e("ShastaZslController#getPslFrames");
            if (((Integer) khoVar.m14271a().mo3831be()).intValue() == 0) {
                ((nbe) ((nbe) f25251a.m17252c()).mo17276G(2804)).mo17290o("No available capacity for PSL request.");
                pairCreate = Pair.create(new ArrayList(), new ArrayList());
                kbzVar = this.f25257g;
            } else if (((Integer) khoVar.m14271a().mo3831be()).intValue() <= 0) {
                ((nbe) ((nbe) f25251a.m17252c()).mo17276G(2803)).mo17292q("Not enough available capacity for PSL request (%s required, none available). Skipping request.", burstSpec.m4911b().m4967a());
                pairCreate = Pair.create(new ArrayList(), new ArrayList());
                kbzVar = this.f25257g;
            } else {
                this.f25257g.mo13961e("buildRequest");
                kfj kfjVarMo14154c = kfoVar.mo14154c();
                kfjVarMo14154c.mo14111c();
                FrameRequestVector frameRequestVectorM4911b = burstSpec.m4911b();
                int iM4967a = (int) frameRequestVectorM4911b.m4967a();
                int iIntValue = ((Integer) khoVar.m14271a().mo3831be()).intValue();
                if (iM4967a > iIntValue) {
                    ((nbe) ((nbe) f25251a.m17252c()).mo17276G(2802)).mo17294s("Not enough available capacity for PSL request (%s required, %s available).  Truncating request.", iM4967a, iIntValue);
                    i = iIntValue;
                } else {
                    i = iM4967a;
                }
                this.f25257g.mo13963g(hiCTUJiAxf.lLrAOdPsvKHXf);
                gjt gjtVar = this.f25266p;
                long jM7218a = eemVar.m7218a();
                gas gasVar = new gas();
                kgw kgwVarM14226g = kgw.m14226g((kgw) kfjVarMo14154c);
                gjtVar.m9347c(kgwVarM14226g, gasVar, khoVar, i, 0);
                List listM9346b = gjtVar.m9346b(jM7218a, kgwVarM14226g, frameRequestVectorM4911b, kppVar, i);
                List list = (List) Collection$EL.stream(listM9346b).map(egh.f13949o).collect(muc.f41626a);
                this.f25257g.mo13963g("submitRequests");
                list.size();
                khoVar.m14271a().mo3831be();
                ((khm) kfoVar).f36061b.mo13961e("FrameServerSession#trySubmit(burst");
                ArrayList arrayList = new ArrayList();
                List listM14269l = khm.m14269l(list);
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                try {
                    ((khm) kfoVar).f36061b.mo13961e("allocate_and_build_results");
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            Set set = (Set) listM14269l.get(i3);
                            Set setM6247v = ((khm) kfoVar).f36062c.m6247v(set);
                            if (setM6247v.size() != set.size()) {
                                int size = arrayList.size();
                                while (i2 < size) {
                                    ((khl) arrayList.get(i2)).close();
                                    i2++;
                                }
                                khm.m14268k(arrayList2);
                                ((khm) kfoVar).f36061b.mo13962f();
                                kbzVar2 = ((khm) kfoVar).f36061b;
                            } else {
                                mwt mwtVarM17116j = mwx.m17116j(setM6247v.size());
                                Iterator it = setM6247v.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        khq khqVar = (khq) it.next();
                                        key keyVarM14356l = kim.m14356l(khqVar);
                                        if (keyVarM14356l == null) {
                                            int size2 = arrayList.size();
                                            while (i2 < size2) {
                                                ((khl) arrayList.get(i2)).close();
                                                i2++;
                                            }
                                            khm.m14268k(arrayList2);
                                            ((khm) kfoVar).f36061b.mo13962f();
                                            kbzVar2 = ((khm) kfoVar).f36061b;
                                        } else {
                                            mwtVarM17116j.mo17110e(khqVar.f36079c, keyVarM14356l);
                                        }
                                    } else {
                                        arrayList.add(new khl(mwtVarM17116j.mo17059b()));
                                        arrayList2.add(setM6247v);
                                        i3++;
                                    }
                                }
                            }
                            kbzVar2.mo13962f();
                            arrayList = null;
                        } else {
                            lku.m15613H(arrayList2.size() == list.size());
                            ((khm) kfoVar).f36061b.mo13963g("submit");
                            ((khm) kfoVar).f36060a.m14314h(list, arrayList2);
                            ((khm) kfoVar).f36061b.mo13962f();
                            ((khm) kfoVar).f36061b.mo13962f();
                        }
                        if (arrayList != null) {
                            arrayList.size();
                        } else {
                            arrayList = new ArrayList();
                            ((nbe) ((nbe) f25251a.m17252c()).mo17276G(2799)).mo17290o("No PSL frame result received.");
                        }
                        this.f25257g.mo13962f();
                        pairCreate = Pair.create(listM9346b, arrayList);
                        kbzVar = this.f25257g;
                    }
                } catch (Throwable th) {
                    int size3 = arrayList.size();
                    while (i2 < size3) {
                        ((khl) arrayList.get(i2)).close();
                        i2++;
                    }
                    khm.m14268k(arrayList2);
                    ((khm) kfoVar).f36061b.mo13962f();
                    ((khm) kfoVar).f36061b.mo13962f();
                    throw th;
                }
            }
            kbzVar.mo13962f();
            return pairCreate;
        } catch (kec e) {
            this.f25257g.mo13962f();
            return Pair.create(new ArrayList(), new ArrayList());
        } catch (Throwable th2) {
            this.f25257g.mo13962f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final BurstSpec m9361b(eem eemVar, kpp kppVar, gmc gmcVar, ebn ebnVar) {
        kpw kpwVarM9496e = gmcVar.m9496e();
        if (kpwVarM9496e == null) {
            return null;
        }
        try {
            this.f25257g.mo13961e("PckShastaZslController#buildBurstSpec");
            return this.f25265o.mo7127B(eemVar, kpwVarM9496e, kppVar, true, null, ebnVar, Optional.empty());
        } catch (kec e) {
            ((nbe) ((nbe) f25251a.m17251b()).mo17276G(2811)).mo17293r("Unable to build payloadBurstSpec %s", e);
            return null;
        } finally {
            kpwVarM9496e.close();
            this.f25257g.mo13962f();
        }
    }
}
