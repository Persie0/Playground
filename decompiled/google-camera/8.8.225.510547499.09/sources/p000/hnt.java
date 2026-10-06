package p000;

import android.os.PowerManager;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnt implements PowerManager.OnThermalStatusChangedListener, hnw, fbp, fat, fas, faq, far {

    /* JADX INFO: renamed from: c */
    private static final nbh f28528c = nbh.m17259h("com/google/android/apps/camera/temperature/SelfUpdatingTemperatureBroadcaster");

    /* JADX INFO: renamed from: d */
    private final fcp f28530d;

    /* JADX INFO: renamed from: e */
    private final hns f28531e;

    /* JADX INFO: renamed from: f */
    private boolean f28532f;

    /* JADX INFO: renamed from: a */
    public final List f28529a = new ArrayList();

    /* JADX INFO: renamed from: g */
    private hnv f28533g = hnv.UNKNOWN;

    /* JADX INFO: renamed from: h */
    private hnv f28534h = hnv.UNKNOWN;

    public hnt(fcp fcpVar, hns hnsVar, fao faoVar, jvd jvdVar, dhv dhvVar) {
        this.f28530d = fcpVar;
        this.f28531e = hnsVar;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6179g();
        synchronized (this) {
            if (!this.f28532f) {
                hnsVar.m10517b(this);
                this.f28532f = true;
            }
        }
        fdh.m8264d(jvdVar, faoVar, this);
    }

    @Override // p000.fas
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8085a() {
        if (this.f28532f) {
            ((nbe) ((nbe) f28528c.m17252c()).mo17276G((char) 3764)).mo17290o(CswIK.ISijEQ);
        } else {
            this.f28531e.m10517b(this);
        }
        this.f28532f = true;
    }

    @Override // p000.faq
    /* JADX INFO: renamed from: b */
    public final void mo5928b() {
        this.f28534h = (hnv) f28546b.get(Integer.valueOf(this.f28531e.m10516a()));
    }

    @Override // p000.far
    /* JADX INFO: renamed from: c */
    public final void mo5929c() {
        hnv hnvVar = (hnv) f28546b.get(Integer.valueOf(this.f28531e.m10516a()));
        hnv hnvVar2 = this.f28534h;
        if (hnvVar == null || hnvVar2 == null) {
            ((nbe) ((nbe) f28528c.m17252c()).mo17276G((char) 3762)).mo17290o("Skip logging due to unknown thermal status");
            return;
        }
        fcp fcpVar = this.f28530d;
        nxl nxlVarM18137O = nlz.f43710e.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nlz nlzVar = (nlz) nxqVar;
        nlzVar.f43715d = 2;
        nlzVar.f43712a |= 16;
        int i = hnvVar2.f28545j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nlz nlzVar2 = (nlz) nxqVar2;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nlzVar2.f43714c = i2;
        nlzVar2.f43712a |= 8;
        int i3 = hnvVar.f28545j;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlz nlzVar3 = (nlz) nxlVarM18137O.f44974b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        nlzVar3.f43713b = i4;
        nlzVar3.f43712a |= 4;
        fcpVar.mo8128C((nlz) nxlVarM18137O.mo18103l());
    }

    @Override // p000.fat
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8086d() {
        if (this.f28532f) {
            hns hnsVar = this.f28531e;
            hnsVar.f28527e.execute(new hea(hnsVar, this, 18));
        } else {
            ((nbe) ((nbe) f28528c.m17252c()).mo17276G((char) 3766)).mo17290o("Was not registered as ThermalStatusListener on AppStop");
        }
        this.f28532f = false;
    }

    @Override // p000.hnw
    /* JADX INFO: renamed from: e */
    public final synchronized hnv mo10518e() {
        return this.f28533g;
    }

    @Override // p000.hnw
    /* JADX INFO: renamed from: f */
    public final kba mo10519f(hnu hnuVar) {
        hnv hnvVar;
        synchronized (this) {
            this.f28529a.add(hnuVar);
            hnvVar = this.f28533g;
        }
        if (hnvVar != hnv.UNKNOWN) {
            hnuVar.mo5538by(hnvVar);
        }
        return new gto(this, hnuVar, 13);
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i) {
        mws mwsVarM17095j;
        hnv hnvVar;
        Map map = f28546b;
        Integer numValueOf = Integer.valueOf(i);
        map.get(numValueOf);
        hnv hnvVar2 = (hnv) f28546b.get(numValueOf);
        if (hnvVar2 == null) {
            ((nbe) ((nbe) f28528c.m17252c()).mo17276G(3770)).mo17291p("Ignoring call to onThermalStatusChanged with unknown status value: %d", i);
            return;
        }
        synchronized (this) {
            if (hnvVar2 != this.f28533g) {
                nxl nxlVarM18137O = nlz.f43710e.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nlz nlzVar = (nlz) nxqVar;
                nlzVar.f43715d = 1;
                nlzVar.f43712a |= 16;
                int i2 = this.f28533g.f28545j;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                nlz nlzVar2 = (nlz) nxqVar2;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                nlzVar2.f43714c = i3;
                nlzVar2.f43712a |= 8;
                int i4 = hnvVar2.f28545j;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nlz nlzVar3 = (nlz) nxlVarM18137O.f44974b;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                nlzVar3.f43713b = i5;
                nlzVar3.f43712a |= 4;
                this.f28533g = hnvVar2;
                this.f28530d.mo8128C((nlz) nxlVarM18137O.mo18103l());
                synchronized (this) {
                    mwsVarM17095j = mws.m17095j(this.f28529a);
                    hnvVar = this.f28533g;
                }
                int size = mwsVarM17095j.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((hnu) mwsVarM17095j.get(i6)).mo5538by(hnvVar);
                }
            }
        }
    }
}
