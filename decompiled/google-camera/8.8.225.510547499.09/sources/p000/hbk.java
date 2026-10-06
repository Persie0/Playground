package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbk {

    /* JADX INFO: renamed from: a */
    private static final nbh f27145a = nbh.m17259h("com/google/android/apps/camera/settings/util/SettingsUtil");

    /* JADX INFO: renamed from: b */
    private static final EnumMap f27146b = new EnumMap(kmq.class);

    /* JADX INFO: renamed from: a */
    public static kbc m10087a(String str, List list, kmq kmqVar) {
        hbj hbjVar;
        if ("1836x3264".equals(str)) {
            return hbi.f27141a;
        }
        ArrayList arrayList = new ArrayList(list);
        EnumMap enumMap = f27146b;
        if (enumMap.get(kmqVar) != null) {
            hbjVar = (hbj) enumMap.get(kmqVar);
        } else {
            hbj hbjVar2 = new hbj();
            Collections.sort(arrayList, new C1143ye(6));
            hbjVar2.f27142a = (kbc) arrayList.remove(0);
            kbc kbcVar = hbjVar2.f27142a;
            float f = kbcVar.f35517a;
            float f2 = kbcVar.f35518b;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kbc kbcVar2 = (kbc) arrayList.get(i);
                if (Math.abs((kbcVar2.f35517a / kbcVar2.f35518b) - (f / f2)) < 0.01d) {
                    arrayList2.add(kbcVar2);
                }
            }
            if (arrayList2.size() >= 2) {
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                ((nbe) ((nbe) f27145a.m17252c()).mo17276G((char) 3417)).mo17290o("Only one supported resolution.");
                kbc kbcVar3 = hbjVar2.f27142a;
                hbjVar2.f27143b = kbcVar3;
                hbjVar2.f27144c = kbcVar3;
            } else if (arrayList.size() == 1) {
                ((nbe) ((nbe) f27145a.m17252c()).mo17276G((char) 3416)).mo17290o("Only two supported resolutions.");
                hbjVar2.f27143b = (kbc) arrayList.get(0);
                hbjVar2.f27144c = (kbc) arrayList.get(0);
            } else if (arrayList.size() == 2) {
                ((nbe) ((nbe) f27145a.m17252c()).mo17276G((char) 3415)).mo17290o("Exactly three supported resolutions.");
                hbjVar2.f27143b = (kbc) arrayList.get(0);
                hbjVar2.f27144c = (kbc) arrayList.get(1);
            } else {
                kbc kbcVar4 = hbjVar2.f27142a;
                float f3 = kbcVar4.f35517a * kbcVar4.f35518b;
                int iM10089c = m10089c(arrayList, (int) (0.5f * f3));
                int iM10089c2 = m10089c(arrayList, (int) (f3 * 0.25f));
                if (((kbc) arrayList.get(iM10089c)).equals(arrayList.get(iM10089c2))) {
                    if (iM10089c2 < arrayList.size() - 1) {
                        iM10089c2++;
                    } else {
                        iM10089c--;
                    }
                }
                hbjVar2.f27143b = (kbc) arrayList.get(iM10089c);
                hbjVar2.f27144c = (kbc) arrayList.get(iM10089c2);
            }
            f27146b.put(kmqVar, hbjVar2);
            hbjVar = hbjVar2;
        }
        hbjVar.getClass();
        if ("large".equals(str)) {
            return hbjVar.f27142a;
        }
        if ("medium".equals(str)) {
            return hbjVar.f27143b;
        }
        if ("small".equals(str)) {
            return hbjVar.f27144c;
        }
        if (str != null && str.split("x").length == 2) {
            kbc kbcVarM13913b = kbd.m13913b(str);
            if (list.contains(kbcVarM13913b)) {
                return kbcVarM13913b;
            }
        }
        return hbjVar.f27142a;
    }

    /* JADX INFO: renamed from: b */
    public static String m10088b(kmq kmqVar) {
        kmq kmqVar2 = kmq.f36557a;
        switch (kmqVar) {
            case f36557a:
                return "pref_camera_picturesize_front_key";
            case BACK:
                return "pref_camera_picturesize_back_key";
            default:
                ((nbe) ((nbe) f27145a.m17252c()).mo17276G((char) 3418)).mo17293r("Unsupported facing value: %s", kmqVar);
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m10089c(List list, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (i2 < list.size()) {
            kbc kbcVar = (kbc) list.get(i2);
            int iAbs = Math.abs((kbcVar.f35517a * kbcVar.f35518b) - i);
            int i5 = iAbs < i4 ? iAbs : i4;
            if (iAbs < i4) {
                i3 = i2;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }
}
