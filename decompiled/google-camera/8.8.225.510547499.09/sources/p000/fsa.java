package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsa implements fti {

    /* JADX INFO: renamed from: a */
    private final gti f23425a;

    /* JADX INFO: renamed from: b */
    private final kbo f23426b;

    /* JADX INFO: renamed from: c */
    private final int f23427c;

    /* JADX INFO: renamed from: d */
    private final dhv f23428d;

    /* JADX INFO: renamed from: e */
    private final Map f23429e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final dsx f23430f;

    /* JADX WARN: Type inference failed for: r1v3, types: [dhv, java.lang.Object] */
    public fsa(gti gtiVar, dsx dsxVar, kbo kboVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f23425a = gtiVar;
        this.f23430f = dsxVar;
        this.f23426b = kboVar.mo6314a("MomentsMetadata");
        this.f23428d = dhvVar;
        this.f23427c = true != dsxVar.f12521a.mo6184l(dij.f11574X) ? 2 : 3;
    }

    /* JADX INFO: renamed from: g */
    private final synchronized frz m8753g(gyu gyuVar) {
        frz frzVar;
        if (!this.f23429e.containsKey(gyuVar)) {
            this.f23429e.put(gyuVar, new frz());
        }
        frzVar = (frz) this.f23429e.get(gyuVar);
        frzVar.getClass();
        return frzVar;
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m8754h() {
        float f;
        Object objM16829i;
        float f2;
        boolean z;
        float f3;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23429e.entrySet().iterator();
        while (true) {
            char c = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            frz frzVar = (frz) entry.getValue();
            if (frzVar.f23421c) {
                List list = frzVar.f23424f;
                if (list != null && list.isEmpty() && !frzVar.f23419a.isDone()) {
                    frzVar.f23419a.mo14894e(mqu.f41450a);
                } else if (frzVar.f23424f != null && (frzVar.f23423e != -1 || frzVar.f23422d)) {
                    if (!frzVar.f23419a.isDone()) {
                        nqf nqfVar = frzVar.f23419a;
                        gyu gyuVar = (gyu) entry.getKey();
                        List<kau> list2 = frzVar.f23424f;
                        list2.getClass();
                        if (list2.isEmpty()) {
                            this.f23426b.mo13940b("for " + String.valueOf(gyuVar) + HEePJw.TzMnANSWjXdsZ);
                            objM16829i = mqu.f41450a;
                        } else {
                            this.f23426b.mo13940b("for " + String.valueOf(gyuVar) + yTyWiTtGtnBhy.VcgeEqQWr + list2.size() + " incoming timestamps");
                            nxl nxlVarM18137O = obm.f45321f.m18137O();
                            int i = this.f23427c;
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            obm obmVar = (obm) nxlVarM18137O.f44974b;
                            obmVar.f45323a |= 2;
                            obmVar.f45326d = i;
                            if (frzVar.f23422d) {
                                f = 0.0f;
                            } else {
                                lku.m15613H(frzVar.f23423e >= 0);
                                long j = frzVar.f23423e;
                                gth gthVarMo9759d = this.f23425a.mo9759d(j);
                                if (gthVarMo9759d == null) {
                                    this.f23426b.mo13947i("Score not found for frame " + j + " ... is the ringbuffer too small or we didn't even compute it?");
                                    f = -1.0f;
                                } else {
                                    f = gthVarMo9759d.f26340b;
                                }
                            }
                            for (kau kauVar : list2) {
                                long j2 = kauVar.f35493a;
                                float f4 = kauVar.f35494b;
                                if (frzVar.f23422d) {
                                    if (this.f23427c != 3) {
                                        this.f23426b.mo13940b("   for Long Shot frame " + j2 + " the score " + f4 + " is scaled by 1.118259");
                                        f3 = f4 * 1.118259f;
                                    } else {
                                        if (this.f23428d.mo6184l(dij.f11586j)) {
                                            this.f23428d.mo6177e();
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        float fM9746k = z2 ? fkn.f22393b.m9746k(f4) : fkn.f22392a.m9746k(f4);
                                        kbo kboVar = this.f23426b;
                                        Locale locale = Locale.US;
                                        Object[] objArr = new Object[3];
                                        objArr[c] = Long.valueOf(j2);
                                        objArr[1] = Float.valueOf(f4);
                                        objArr[2] = Float.valueOf(fM9746k);
                                        kboVar.mo13940b(String.format(locale, "   Long Shot frame %d score is %f. Converted to confidence %f", objArr));
                                        f3 = fM9746k;
                                    }
                                } else if (this.f23427c == 2) {
                                    if (f4 < 0.2f) {
                                        this.f23426b.mo13940b("   for frame " + j2 + " set the score to 0 because the score " + f4 + " is below the absolute threshold 0.2");
                                        f4 = 0.0f;
                                    }
                                    kbo kboVar2 = this.f23426b;
                                    Locale locale2 = Locale.US;
                                    Object[] objArr2 = new Object[3];
                                    objArr2[c] = Long.valueOf(j2);
                                    objArr2[1] = Float.valueOf(f4);
                                    objArr2[2] = Float.valueOf(0.7891367f);
                                    kboVar2.mo13940b(String.format(locale2, "   for Top Shot frame %d, the score %f is scaled by %f", objArr2));
                                    f3 = f4 * 0.7891367f;
                                } else {
                                    if (f4 < 0.2f) {
                                        this.f23426b.mo13940b("   for frame " + j2 + " set the score to 0 because the score " + f4 + " is below the absolute threshold 0.2");
                                        f4 = 0.0f;
                                    }
                                    if (this.f23428d.mo6184l(dij.f11586j)) {
                                        this.f23428d.mo6177e();
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    float f5 = f4 - f;
                                    float fM8524a = fko.m8524a(f5, z);
                                    this.f23426b.mo13940b(String.format(Locale.US, "   Top Shot frame %d score is %f. Shutter frame score is %f. The diff %f is converted to confidence %f", Long.valueOf(j2), Float.valueOf(f4), Float.valueOf(f), Float.valueOf(f5), Float.valueOf(fM8524a)));
                                    f3 = fM8524a;
                                }
                                m8755i(f3);
                                nxl nxlVarM18137O2 = obl.f45316d.m18137O();
                                long jConvert = TimeUnit.MICROSECONDS.convert(j2, TimeUnit.NANOSECONDS);
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nxq nxqVar = nxlVarM18137O2.f44974b;
                                obl oblVar = (obl) nxqVar;
                                oblVar.f45318a |= 1;
                                oblVar.f45319b = jConvert;
                                if (!nxqVar.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                obl oblVar2 = (obl) nxlVarM18137O2.f44974b;
                                oblVar2.f45318a |= 2;
                                oblVar2.f45320c = f3;
                                obl oblVar3 = (obl) nxlVarM18137O2.mo18103l();
                                this.f23426b.mo13940b("   for frame " + oblVar3.f45319b + " adding score " + oblVar3.f45320c);
                                nxlVarM18137O.m18056S(oblVar3);
                                c = 0;
                            }
                            if (!frzVar.f23422d) {
                                if (this.f23427c == 2) {
                                    this.f23426b.mo13940b(String.format(Locale.US, "   for Top Shot base frame %d, the score %f is scaled by %f", Long.valueOf(frzVar.f23423e), Float.valueOf(f), Float.valueOf(0.7891367f)));
                                    f2 = f * 0.7891367f;
                                } else {
                                    f2 = 0.0f;
                                }
                                m8755i(f2);
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                obm obmVar2 = (obm) nxlVarM18137O.f44974b;
                                obmVar2.f45323a |= 1;
                                obmVar2.f45325c = f2;
                                this.f23426b.mo13940b("   for the base frame at " + frzVar.f23423e + " : fetched score " + f2);
                            }
                            this.f23430f.m6696k();
                            objM16829i = mrm.m16829i((obm) nxlVarM18137O.mo18103l());
                        }
                        nqfVar.mo14894e(objM16829i);
                    }
                }
            }
        }
        for (Map.Entry entry2 : this.f23429e.entrySet()) {
            if (((frz) entry2.getValue()).f23420b < SystemClock.elapsedRealtimeNanos() - 600000000000L) {
                this.f23426b.mo13940b("cleaning up entry for ".concat(String.valueOf(String.valueOf(entry2.getKey()))));
                arrayList.add((gyu) entry2.getKey());
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23429e.remove((gyu) arrayList.get(i2));
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m8755i(float f) {
        Math.min(Math.max(f, 0.0f), 1.0f);
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: a */
    public final synchronized nps mo8756a(gyu gyuVar) {
        frz frzVarM8753g;
        frzVarM8753g = m8753g(gyuVar);
        this.f23426b.mo13940b(rgoX.UFl + String.valueOf(gyuVar) + " is collecting Moments metadata");
        return frzVarM8753g.f23419a;
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8757b(gyu gyuVar, long j) {
        this.f23426b.mo13940b("uri " + String.valueOf(gyuVar) + " : main session has base frame " + j);
        if (this.f23429e.containsKey(gyuVar)) {
            ((frz) this.f23429e.get(gyuVar)).f23423e = j;
        }
        m8754h();
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8758c(gyu gyuVar) {
        frz frzVarM8753g = m8753g(gyuVar);
        if (!frzVarM8753g.f23421c) {
            frzVarM8753g.f23419a.mo14894e(mqu.f41450a);
        }
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8759d(gyu gyuVar, List list) {
        frz frzVarM8753g = m8753g(gyuVar);
        this.f23426b.mo13940b("uri " + String.valueOf(gyuVar) + " : Moments has " + list.size() + " frames");
        frzVarM8753g.f23424f = list;
        m8754h();
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: e */
    public final synchronized void mo8760e(gyu gyuVar) {
        this.f23426b.mo13940b("uri " + String.valueOf(gyuVar) + TVkaNXnfP.BqlQ);
        frz frzVarM8753g = m8753g(gyuVar);
        frzVarM8753g.f23421c = true;
        frzVarM8753g.f23422d = true;
    }

    @Override // p000.fti
    /* JADX INFO: renamed from: f */
    public final synchronized void mo8761f(gyu gyuVar) {
        this.f23426b.mo13940b(HEePJw.PUddUodmDvjlGg + String.valueOf(gyuVar) + " has Moments active");
        frz frzVarM8753g = m8753g(gyuVar);
        frzVarM8753g.f23421c = true;
        frzVarM8753g.f23422d = false;
    }
}
