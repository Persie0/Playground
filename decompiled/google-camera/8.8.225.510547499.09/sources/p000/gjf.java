package p000;

import android.hardware.camera2.CaptureResult;
import com.pairip.VMRunner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjf implements gof {

    /* JADX INFO: renamed from: a */
    public static final nbh f24957a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckFilteredRingBuffer");

    /* JADX INFO: renamed from: b */
    public final mwc f24958b = mwc.m17057v();

    /* JADX INFO: renamed from: c */
    public final kfc f24959c;

    /* JADX INFO: renamed from: d */
    private final msi f24960d;

    /* JADX INFO: renamed from: e */
    private final fwo f24961e;

    /* JADX INFO: renamed from: f */
    private final long f24962f;

    /* JADX INFO: renamed from: g */
    private final goj f24963g;

    /* JADX INFO: renamed from: h */
    private final Set f24964h;

    /* JADX INFO: renamed from: i */
    private final kfk f24965i;

    /* JADX INFO: renamed from: j */
    private final kbz f24966j;

    /* JADX INFO: renamed from: k */
    private final int f24967k;

    /* JADX INFO: renamed from: l */
    private final bko f24968l;

    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, oju] */
    public gjf(jvb jvbVar, fwo fwoVar, nps npsVar, goj gojVar, Set set, bko bkoVar, kfk kfkVar, kbz kbzVar, long j, kfc kfcVar, msi msiVar, int i, byte[] bArr, byte[] bArr2) {
        this.f24961e = fwoVar;
        this.f24960d = msiVar;
        this.f24967k = i;
        this.f24962f = j;
        this.f24959c = kfcVar;
        this.f24963g = gojVar;
        this.f24964h = set;
        this.f24968l = bkoVar;
        this.f24965i = kfkVar;
        this.f24966j = kbzVar;
        for (kgg kggVar : kfcVar.mo9417q().f36067c) {
            this.f24958b.mo16908p(Integer.valueOf(kggVar.mo14191a()), kggVar);
        }
        jvbVar.m13537d(kfcVar);
        jvh.m13562j(npsVar, new gjd(kfcVar, 0), not.INSTANCE);
        if (((mtm) this.f24958b).f41598a.containsKey(37) && gojVar.f25873a.mo6184l(did.f11413X)) {
            djm djmVar = gojVar.f25875c;
            ecq ecqVar = (ecq) djmVar.f11789c.get();
            ecqVar.getClass();
            gva gvaVar = (gva) djmVar.f11787a.get();
            gvaVar.getClass();
            jvx jvxVarM3821b = cje.m3821b();
            Supplier supplier = (Supplier) djmVar.f11788b.get();
            supplier.getClass();
            goh gohVar = new goh(ecqVar, gvaVar, jvxVarM3821b, supplier, kfcVar, null);
            kfcVar.mo9411k(gohVar);
            gojVar.f25874b.m13537d(gohVar);
            mrm.m16829i(gohVar);
        }
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: a */
    public final goe mo9303a() {
        return new goe() { // from class: gje
            @Override // p000.goe
            /* JADX INFO: renamed from: a */
            public final void mo9302a() {
            }
        };
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: b */
    public final key mo9304b(long j) {
        return this.f24959c.mo9404d(new ffa(j, 2));
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: c */
    public final key mo9305c() {
        key keyVarMo9405e;
        switch (this.f24967k - 1) {
            case 1:
                keyVarMo9405e = this.f24959c.mo9405e();
                break;
            default:
                keyVarMo9405e = this.f24959c.mo9408h();
                break;
        }
        if (keyVarMo9405e != null) {
            kfv.m14171t(keyVarMo9405e);
        }
        return keyVarMo9405e;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: d */
    public final key mo9306d() {
        switch (this.f24967k - 1) {
            case 1:
                return this.f24959c.mo9403c();
            default:
                return this.f24959c.mo9407g();
        }
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: e */
    public final key mo9307e() {
        key keyVarMo9408h = this.f24959c.mo9408h();
        if (keyVarMo9408h != null) {
            kfv.m14171t(keyVarMo9408h);
        }
        return keyVarMo9408h;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: f */
    public final kfc mo9308f() {
        return this.f24959c;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: g */
    public final mws mo9309g(List list) {
        mws mwsVarM17081f;
        mws mwsVarM17081f2;
        mws mwsVarM17081f3;
        this.f24966j.mo13961e("zslRingBuffer#filterAndTrim");
        this.f24966j.mo13961e("zslRingBuffer#filterByTimestamp");
        if (list.isEmpty()) {
            int i = mws.f41739d;
            mwsVarM17081f = mzr.f41857a;
        } else {
            mwn mwnVarM17090e = mws.m17090e();
            kfd kfdVarMo7041b = ((key) mkv.m16515W(list)).mo7041b();
            long jMax = (kfdVarMo7041b != null ? Math.max(kfdVarMo7041b.f35811b, this.f24961e.m8903j()) : this.f24961e.m8903j()) - this.f24962f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                key keyVar = (key) it.next();
                kfd kfdVarMo7041b2 = keyVar.mo7041b();
                if (kfdVarMo7041b2 == null || kfdVarMo7041b2.f35811b <= jMax) {
                    keyVar.close();
                } else {
                    mwnVarM17090e.m17082g(keyVar);
                }
            }
            mwsVarM17081f = mwnVarM17090e.m17081f();
        }
        this.f24966j.mo13963g("zslRingBuffer#trimByCapacity");
        if (mwsVarM17081f.isEmpty()) {
            mwsVarM17081f2 = mzr.f41857a;
        } else {
            LinkedList<key> linkedList = new LinkedList(mwsVarM17081f);
            mwn mwnVarM17090e2 = mws.m17090e();
            int iMin = Math.min(((Integer) this.f24960d.mo6051a()).intValue(), ((mzr) mwsVarM17081f).f41859c);
            for (int i2 = 0; i2 < iMin; i2++) {
                key keyVar2 = (key) linkedList.pollLast();
                if (keyVar2 != null) {
                    mwnVarM17090e2.m17082g(keyVar2);
                }
            }
            for (key keyVar3 : linkedList) {
                keyVar3.mo7041b();
                keyVar3.close();
            }
            mwsVarM17081f2 = mwnVarM17090e2.m17081f();
        }
        this.f24966j.mo13962f();
        this.f24966j.mo13963g("zslRingBuffer#filterByMetadata");
        if (mwsVarM17081f2.isEmpty()) {
            mwsVarM17081f3 = mzr.f41857a;
        } else {
            mwn mwnVarM17090e3 = mws.m17090e();
            key keyVar4 = (key) mwsVarM17081f2.get(0);
            this.f24966j.mo13961e("zslRingBuffer#getRecentFocalLength");
            kfv.m14173v(keyVar4);
            kpp kppVarMo7042c = keyVar4.mo7042c();
            float fFloatValue = -1.0f;
            if (kppVarMo7042c != null) {
                Float f = (Float) kppVarMo7042c.mo9517d(CaptureResult.LENS_FOCAL_LENGTH);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    ((nbe) ((nbe) f24957a.m17252c()).mo17276G((char) 2701)).mo17293r("Invalid focal length for frame %s", keyVar4.mo7041b());
                }
            } else {
                ((nbe) ((nbe) f24957a.m17252c()).mo17276G((char) 2700)).mo17293r("No metadata found for frame %s", keyVar4.mo7041b());
            }
            Float fValueOf = Float.valueOf(fFloatValue);
            this.f24966j.mo13963g("zslRingBuffer#buildFilter");
            mxi mxiVar = new mxi();
            mxiVar.m17129h(this.f24964h);
            mxiVar.mo17072d(new gou(CaptureResult.LENS_FOCAL_LENGTH, fValueOf));
            gom gomVar = new gom(mxiVar.mo17127f());
            this.f24966j.mo13963g("findBinningStatus");
            Set setM9579a = this.f24963g.m9579a(mwsVarM17081f2);
            this.f24966j.mo13962f();
            nba it2 = mwsVarM17081f2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                key keyVar5 = (key) it2.next();
                this.f24966j.mo13961e("zslRingBuffer#filter");
                boolean z2 = !setM9579a.contains(keyVar5.mo7041b());
                if (gomVar.mo7269a(keyVar5)) {
                    mwnVarM17090e3.m17082g(keyVar5);
                    if (z2) {
                        bko bkoVar = this.f24968l;
                        kfd kfdVarMo7041b3 = keyVar5.mo7041b();
                        kfdVarMo7041b3.getClass();
                        z |= !bkoVar.m2625s(kfdVarMo7041b3.f35811b);
                    } else {
                        keyVar5.mo7041b().getClass();
                    }
                } else {
                    keyVar5.mo7041b();
                    keyVar5.close();
                }
                this.f24966j.mo13962f();
            }
            mwsVarM17081f3 = mwnVarM17090e3.m17081f();
            if (!z) {
                int i3 = ((mzr) mwsVarM17081f3).f41859c;
                for (int i4 = 0; i4 < i3; i4++) {
                    key keyVar6 = (key) mwsVarM17081f3.get(i4);
                    keyVar6.mo7041b();
                    keyVar6.close();
                }
                mwsVarM17081f3 = mzr.f41857a;
            }
        }
        this.f24966j.mo13962f();
        return mwsVarM17081f3;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: h */
    public final mws mo9310h(List list) {
        this.f24966j.mo13961e("zslRingBuffer#filter");
        mws mwsVarMo9309g = mo9309g(list);
        this.f24966j.mo13963g("zslRingBuffer#awaitComplete");
        int i = ((mzr) mwsVarMo9309g).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            kfv.m14171t((key) mwsVarMo9309g.get(i2));
        }
        this.f24966j.mo13962f();
        return mwsVarMo9309g;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: i */
    public final List mo9311i() {
        return mo9310h(m9321o());
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: j */
    public final List mo9312j() {
        return m9321o();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: k */
    public final List mo9313k() {
        return this.f24959c.mo9409i();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: l */
    public final void mo9314l(String str) {
        this.f24959c.mo9417q().m14271a().mo3831be();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: m */
    public void mo9315m(int i) {
        VMRunner.invoke("ognfT84aOxTItDqK", new Object[]{this, Integer.valueOf(i)});
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: n */
    public final kho mo9316n() {
        return this.f24959c.mo9417q();
    }

    /* JADX INFO: renamed from: o */
    public final List m9321o() {
        switch (this.f24967k - 1) {
            case 1:
                return this.f24959c.mo9409i();
            default:
                return this.f24959c.mo9410j();
        }
    }
}
