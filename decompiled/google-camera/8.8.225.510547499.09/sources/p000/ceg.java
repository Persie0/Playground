package p000;

import android.content.ContentUris;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.Surface;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ceg implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5438a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5439b;

    public /* synthetic */ ceg(cea ceaVar, int i) {
        this.f5439b = i;
        this.f5438a = ceaVar;
    }

    public /* synthetic */ ceg(ceh cehVar, int i) {
        this.f5439b = i;
        this.f5438a = cehVar;
    }

    public /* synthetic */ ceg(cjr cjrVar, int i) {
        this.f5439b = i;
        this.f5438a = cjrVar;
    }

    public /* synthetic */ ceg(cnh cnhVar, int i) {
        this.f5439b = i;
        this.f5438a = cnhVar;
    }

    public /* synthetic */ ceg(coe coeVar, int i) {
        this.f5439b = i;
        this.f5438a = coeVar;
    }

    public /* synthetic */ ceg(cpd cpdVar, int i) {
        this.f5439b = i;
        this.f5438a = cpdVar;
    }

    public /* synthetic */ ceg(cpw cpwVar, int i) {
        this.f5439b = i;
        this.f5438a = cpwVar;
    }

    public /* synthetic */ ceg(cra craVar, int i) {
        this.f5439b = i;
        this.f5438a = craVar;
    }

    public /* synthetic */ ceg(csm csmVar, int i) {
        this.f5439b = i;
        this.f5438a = csmVar;
    }

    public /* synthetic */ ceg(dbr dbrVar, int i) {
        this.f5439b = i;
        this.f5438a = dbrVar;
    }

    public /* synthetic */ ceg(dhv dhvVar, int i) {
        this.f5439b = i;
        this.f5438a = dhvVar;
    }

    public /* synthetic */ ceg(eja ejaVar, int i) {
        this.f5439b = i;
        this.f5438a = ejaVar;
    }

    public /* synthetic */ ceg(fxt fxtVar, int i) {
        this.f5439b = i;
        this.f5438a = fxtVar;
    }

    public /* synthetic */ ceg(gfc gfcVar, int i) {
        this.f5439b = i;
        this.f5438a = gfcVar;
    }

    public /* synthetic */ ceg(had hadVar, int i) {
        this.f5439b = i;
        this.f5438a = hadVar;
    }

    public /* synthetic */ ceg(List list, int i) {
        this.f5439b = i;
        this.f5438a = list;
    }

    public /* synthetic */ ceg(kfk kfkVar, int i) {
        this.f5439b = i;
        this.f5438a = kfkVar;
    }

    public /* synthetic */ ceg(msa msaVar, int i, byte[] bArr) {
        this.f5439b = i;
        this.f5438a = msaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v94, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, oju] */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f5439b) {
            case 0:
                Boolean bool = (Boolean) obj;
                ((ceh) this.f5438a).f5440a.m10438i(hkp.PERMISSIONS_STARTUP_TASK_END, CameraActivityTiming.f6962b);
                return bool;
            case 1:
                dnl dnlVar = (dnl) obj;
                cea ceaVar = (cea) this.f5438a;
                ceaVar.f5405d.execute(new bey(ceaVar, dnlVar, 18));
                CameraActivityTiming cameraActivityTiming = ceaVar.f5403b;
                cameraActivityTiming.m10438i(hkp.WAIT_FOR_CAMERA_DEVICES_TASK_END, CameraActivityTiming.f6962b);
                cameraActivityTiming.f6969i.mo13952a();
                cameraActivityTiming.f6969i = kcc.f35555b;
                return Boolean.valueOf(dnlVar.f12100a);
            case 2:
                ((nbe) ((nbe) cjr.f5937a.m17252c()).mo17276G(203)).mo17293r(hsSUWRJfoeC.iEqQv, ((cjr) this.f5438a).f5938b);
                return mqu.f41450a;
            case 3:
                Object obj2 = this.f5438a;
                Map map = (Map) obj;
                Iterator it = map.values().iterator();
                int iIntValue = 0;
                while (it.hasNext()) {
                    iIntValue += ((Integer) it.next()).intValue();
                }
                Integer num = (Integer) map.get(0);
                long jRound = -1;
                if (num != null && iIntValue != 0) {
                    double dIntValue = num.intValue();
                    Double.isNaN(dIntValue);
                    double d = iIntValue;
                    Double.isNaN(d);
                    jRound = Math.round((dIntValue * 100.0d) / d);
                }
                ((had) obj2).mo10043j("pref_camera_beholder_example_percent_key", jRound);
                return true;
            case 4:
                Object obj3 = this.f5438a;
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                cnh cnhVar = (cnh) obj3;
                cnhVar.f6340c.set((cnw) ((mrn) mkv.m16515W(list)).f41479a);
                cnhVar.f6341d.addAndGet(list.size());
                synchronized (cnhVar.f6339b) {
                    ((cnh) obj3).f6339b.addAll(list);
                    break;
                }
                return null;
            case 5:
                djm djmVar = (djm) obj;
                nba it2 = ((coe) this.f5438a).f6428b.f6375g.iterator();
                while (it2.hasNext()) {
                    ((SQLiteDatabase) djmVar.f11789c).delete((String) it2.next(), null, new String[0]);
                }
                return null;
            case 6:
                ?? r0 = this.f5438a;
                Map map2 = (Map) obj;
                mxi mxiVarM17132D = mxk.m17132D();
                for (String str : r0) {
                    if (map2.containsKey(str)) {
                        mxiVarM17132D.mo17072d((cow) map2.get(str));
                    } else {
                        gyo gyoVarM5217a = cow.m5217a();
                        gyoVarM5217a.m9997h(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(str)));
                        gyoVarM5217a.m9995f(true);
                        gyoVarM5217a.m9996g(str);
                        mxiVarM17132D.mo17072d(gyoVarM5217a.m9994e());
                    }
                }
                return mxiVarM17132D.mo17127f();
            case 7:
                Object obj4 = this.f5438a;
                cuu cuuVar = (cuu) obj;
                cuuVar.getClass();
                ((cpd) obj4).f8533k.m5657d(cum.CAPTURE_SESSION).m13537d(cuuVar);
                mrm mrmVarMo13744c = cuuVar.f9689a.mo13744c();
                lku.m15614I(mrmVarMo13744c.mo16813g(), "Recording surface not present.");
                return (Surface) mrmVarMo13744c.mo16809c();
            case 8:
                return this.f5438a;
            case 9:
                Object obj5 = this.f5438a;
                hsg hsgVar = (hsg) obj;
                PointF pointFM5387h = cra.m5387h(hsgVar);
                return !hsgVar.m10694c() ? pointFM5387h : ((cra) obj5).f9081p.m19204h(pointFM5387h);
            case 10:
                return Boolean.valueOf(((String) obj).equals(((csm) this.f5438a).f9305c));
            case 11:
                return Boolean.valueOf(((Enum) this.f5438a).equals((gfc) obj));
            case 12:
                dbr dbrVar = (dbr) this.f5438a;
                fvu fvuVarM5902k = dbrVar.m5902k((kmq) obj);
                if (fvuVarM5902k == null) {
                    return null;
                }
                return new dci(fvuVarM5902k, dbrVar.f10421d.mo6184l(dib.f11315bV), dbrVar.f10422e);
            case 13:
                return Boolean.valueOf(Boolean.valueOf(((msa) this.f5438a).f41501a).booleanValue() && Boolean.valueOf(((Integer) obj).equals(Integer.valueOf(jbx.m12873r(2)))).booleanValue());
            case 14:
                return this.f5438a;
            case 15:
                return Boolean.valueOf(this.f5438a.contains((String) obj));
            case 16:
                Object obj6 = this.f5438a;
                Bitmap bitmap = (Bitmap) obj;
                eja ejaVar = (eja) obj6;
                ejaVar.f14256j.mo13961e("record#stopCapture");
                ejaVar.f14248b.m7418g(ejaVar.f14232I.m7357a());
                ejaVar.f14256j.mo13962f();
                if (bitmap == null) {
                    synchronized (ejaVar.f14258l) {
                        ((eja) obj6).f14258l.remove(((eja) obj6).f14232I.m7357a());
                        break;
                    }
                    return null;
                }
                synchronized (ejaVar.f14258l) {
                    ((eja) obj6).f14258l.add(((eja) obj6).f14232I.m7357a());
                    break;
                }
                ejaVar.f14229F = SystemClock.uptimeMillis();
                hee heeVar = ejaVar.f14236M;
                eij eijVar = ejaVar.f14232I;
                boolean zM7376k = ejaVar.f14252f.m7376k();
                Object obj7 = heeVar.f27439c.get();
                gxa gxaVar = (gxa) heeVar.f27443g.get();
                gxaVar.getClass();
                jfs jfsVar = (jfs) heeVar.f27440d.get();
                jfsVar.getClass();
                kbz kbzVar = (kbz) heeVar.f27442f.get();
                kbzVar.getClass();
                fca fcaVar = (fca) heeVar.f27444h.get();
                fcaVar.getClass();
                jww jwwVar = (jww) heeVar.f27437a.get();
                jwwVar.getClass();
                dhv dhvVar = (dhv) heeVar.f27438b.get();
                dhvVar.getClass();
                kqj kqjVar = (kqj) heeVar.f27441e.get();
                kqjVar.getClass();
                eijVar.getClass();
                eit eitVar = new eit((jfs) obj7, gxaVar, jfsVar, kbzVar, fcaVar, jwwVar, dhvVar, kqjVar, eijVar, bitmap, zM7376k, null, null, null, null, null);
                eitVar.mo7365c(new eiz(ejaVar, eitVar, fdh.m8267g(ejaVar.f14231H)));
                ejaVar.f14249c.mo9647b(eitVar);
                return null;
            case 17:
                return Boolean.valueOf(((Enum) this.f5438a).equals((gfc) obj));
            case 18:
                return this.f5438a.mo14132s((kgg) obj);
            case 19:
                return this.f5438a.mo14131r((kho) obj, 6);
            default:
                ?? r1 = this.f5438a;
                dhx dhxVar = dik.f11603a;
                r1.mo6179g();
                return gzq.LASAGNA_TR_MEDIUM;
        }
    }
}
