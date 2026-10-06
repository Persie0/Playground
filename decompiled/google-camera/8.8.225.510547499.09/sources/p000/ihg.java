package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ihg implements ihv {

    /* JADX INFO: renamed from: a */
    private static final nbh f30950a = nbh.m17259h("com/google/android/apps/camera/ui/viewfinder/DefaultViewfinderSizeSelector");

    /* JADX INFO: renamed from: b */
    private final kbc f30951b;

    /* JADX INFO: renamed from: c */
    private final dhv f30952c;

    /* JADX INFO: renamed from: d */
    private final String f30953d;

    public ihg(WindowManager windowManager, dhv dhvVar, String str) {
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        this.f30951b = new kbc(point.x, point.y);
        this.f30952c = dhvVar;
        this.f30953d = str;
    }

    /* JADX INFO: renamed from: a */
    final kbc m11323a(List list, double d) {
        list.getClass();
        lku.m15669w(!list.isEmpty());
        kbc kbcVar = this.f30951b;
        int iMin = Math.min(kbcVar.f35517a, kbcVar.f35518b);
        int i = -1;
        int i2 = -1;
        double d2 = Double.MAX_VALUE;
        for (int i3 = 0; i3 < list.size(); i3++) {
            kbc kbcVar2 = (kbc) list.get(i3);
            double d3 = kbcVar2.f35517a;
            double d4 = kbcVar2.f35518b;
            Double.isNaN(d3);
            Double.isNaN(d4);
            if (Math.abs((d3 / d4) - d) <= 0.02d) {
                double dAbs = Math.abs(kbcVar2.f35518b - iMin);
                if (dAbs < d2 || (dAbs == d2 && kbcVar2.f35518b < iMin)) {
                    d2 = dAbs;
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            ((nbe) ((nbe) f30950a.m17252c()).mo17276G((char) 4253)).mo17293r("No preview size match the aspect ratio. available sizes: %s", list);
            double dAbs2 = Double.MAX_VALUE;
            for (int i4 = 0; i4 < list.size(); i4++) {
                kbc kbcVar3 = (kbc) list.get(i4);
                if (Math.abs(kbcVar3.f35518b - iMin) < dAbs2) {
                    dAbs2 = Math.abs(kbcVar3.f35518b - iMin);
                    i = i4;
                }
            }
            i2 = i;
        }
        lku.m15613H(i2 >= 0);
        return (kbc) list.get(i2);
    }

    @Override // p000.ihv
    /* JADX INFO: renamed from: b */
    public kbc mo11324b(List list, kan kanVar, kmq kmqVar, ikw ikwVar, kmg kmgVar) {
        MediaCodecInfo mediaCodecInfo;
        list.getClass();
        lku.m15669w(!list.isEmpty());
        if (ikwVar != ikw.VIDEO && ikwVar != ikw.VIDEO_INTENT) {
            String strMo6182j = kmqVar == kmq.f36557a ? this.f30952c.mo6182j(dib.f11272af) : this.f30952c.mo6182j(dib.f11271ae);
            strMo6182j.getClass();
            list = jib.m13220y(list, strMo6182j);
        }
        String strMo6182j2 = this.f30952c.mo6182j(dib.f11330bk);
        if (kmqVar == kmq.f36557a && strMo6182j2 != null && !strMo6182j2.isEmpty()) {
            kbc kbcVarM13913b = kbd.m13913b(strMo6182j2);
            kbcVarM13913b.getClass();
            if (kanVar.m13883m(kan.m13873j(kbcVarM13913b))) {
                kanVar = kan.f35486a;
            }
        }
        double dM13875a = kanVar.m13875a();
        ArrayList<kbc> arrayList = new ArrayList();
        for (kbc kbcVar : list) {
            double dM13904a = kbcVar.m13904a();
            Double.isNaN(dM13904a);
            if (Math.abs(dM13904a - dM13875a) < 0.025d) {
                arrayList.add(kbcVar);
            }
        }
        double dM13875a2 = kanVar.m13875a();
        boolean zMo6184l = this.f30952c.mo6184l(did.f11414Y);
        int i = 1440;
        int iMax = dM13875a2 <= 1.0d ? 1440 : 1080;
        if (zMo6184l) {
            boolean zMo6184l2 = this.f30952c.mo6184l(did.f11415Z);
            int iIntValue = ((Integer) this.f30952c.mo6173a(did.f11460n).orElse(Integer.valueOf(iMax))).intValue();
            if (!zMo6184l2) {
                i = 0;
            } else if (dM13875a2 > 1.0d) {
                i = 1080;
            }
            iMax = Math.max(iIntValue, i);
        }
        ArrayList<kbc> arrayList2 = new ArrayList();
        for (kbc kbcVar2 : arrayList) {
            if (kbcVar2.f35518b <= iMax) {
                arrayList2.add(kbcVar2);
            }
        }
        String str = this.f30953d;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i2 = 0;
        loop2: while (true) {
            if (i2 >= length) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = codecInfos[i2];
            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                if (str2.equals(str) && mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                    break loop2;
                }
            }
            i2++;
        }
        if (mediaCodecInfo == null) {
            ((nbe) ((nbe) f30950a.m17252c()).mo17276G((char) 4255)).mo17293r("No codec info found for codec '%s'! Will not filter preview sizes!", str);
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
            ArrayList arrayList3 = new ArrayList();
            for (kbc kbcVar3 : arrayList2) {
                if (videoCapabilities.isSizeSupported(kbcVar3.f35517a, kbcVar3.f35518b)) {
                    arrayList3.add(kbcVar3);
                }
            }
            arrayList2 = arrayList3;
        }
        return m11323a(arrayList2, kanVar.m13875a());
    }
}
