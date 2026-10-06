package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgp {

    /* JADX INFO: renamed from: a */
    public static final Map f3193a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static final pax f3194b;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{80, 75, 3, 4}, 4);
        bArrCopyOf.getClass();
        f3194b = new pax(bArrCopyOf);
    }

    /* JADX INFO: renamed from: a */
    public static bhb m2420a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m2421b(context.getAssets().open(str), str2);
            }
            return m2424e(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new bhb((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static bhb m2421b(InputStream inputStream, String str) {
        try {
            return m2429j(blt.m2649d(lku.m15628X(paz.m19285a(inputStream))), str, true);
        } finally {
            bme.m2705e(inputStream);
        }
    }

    /* JADX INFO: renamed from: c */
    public static bhb m2422c(Context context, int i) {
        return m2423d(context, i, m2428i(context, i));
    }

    /* JADX INFO: renamed from: d */
    public static bhb m2423d(Context context, int i, String str) {
        Boolean boolValueOf;
        try {
            paw pawVarM15628X = lku.m15628X(paz.m19285a(context.getResources().openRawResource(i)));
            try {
                boolValueOf = Boolean.valueOf(pawVarM15628X.mo19261d(f3194b) == 0);
            } catch (Exception e) {
                int i2 = blx.f3726a;
                boolValueOf = false;
            }
            return boolValueOf.booleanValue() ? m2424e(new ZipInputStream(pawVarM15628X.mo19263f()), str) : m2421b(pawVarM15628X.mo19263f(), str);
        } catch (Resources.NotFoundException e2) {
            return new bhb((Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static bhb m2424e(ZipInputStream zipInputStream, String str) {
        bhb bhbVar;
        bgw bgwVar;
        try {
            HashMap map = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        obj = m2429j(blt.m2649d(lku.m15628X(paz.m19285a(zipInputStream))), null, false).f3263a;
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    } else {
                        zipInputStream.closeEntry();
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    bhbVar = new bhb((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((bgm) obj).f3173b.values().iterator();
                        do {
                            if (!it.hasNext()) {
                                bgwVar = null;
                                break;
                            }
                            bgwVar = (bgw) it.next();
                        } while (!bgwVar.f3224d.equals(str2));
                        if (bgwVar != null) {
                            bgwVar.f3225e = bme.m2703c((Bitmap) entry.getValue(), bgwVar.f3221a, bgwVar.f3222b);
                        }
                    }
                    for (Map.Entry entry2 : ((bgm) obj).f3173b.entrySet()) {
                        if (((bgw) entry2.getValue()).f3225e == null) {
                            bhbVar = new bhb((Throwable) new IllegalStateException("There is no image for ".concat(((bgw) entry2.getValue()).f3224d)));
                        }
                    }
                    if (str != null) {
                        biy.f3467a.m2522a(str, (bgm) obj);
                    }
                    bhbVar = new bhb(obj);
                }
            } catch (IOException e) {
                bhbVar = new bhb((Throwable) e);
            }
            bme.m2705e(zipInputStream);
            return bhbVar;
        } catch (Throwable th) {
            bme.m2705e(zipInputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static bhd m2425f(Context context, String str, String str2) {
        return m2430k(str2, new lxe(context.getApplicationContext(), str, str2, 1));
    }

    /* JADX INFO: renamed from: g */
    public static bhd m2426g(Context context, int i, String str) {
        return m2430k(str, new bgo(new WeakReference(context), context.getApplicationContext(), i, str, 0));
    }

    /* JADX INFO: renamed from: h */
    public static bhd m2427h(Context context, String str, String str2) {
        return m2430k(str2, new bgn(context, str, str2));
    }

    /* JADX INFO: renamed from: i */
    public static String m2428i(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    private static bhb m2429j(blt bltVar, String str, boolean z) {
        float f;
        HashMap map;
        ArrayList arrayList;
        C1118xg c1118xg;
        float f2;
        float f3;
        float f4;
        C1114xc c1114xc;
        try {
            dsx dsxVar = blf.f3690a;
            float fM2701a = bme.m2701a();
            C1114xc c1114xc2 = new C1114xc();
            ArrayList arrayList2 = new ArrayList();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            C1118xg c1118xg2 = new C1118xg();
            bgm bgmVar = new bgm();
            bltVar.mo2657i();
            float fMo2650a = 0.0f;
            float fMo2650a2 = 0.0f;
            float fMo2650a3 = 0.0f;
            int iMo2651b = 0;
            int iMo2651b2 = 0;
            while (bltVar.mo2663o()) {
                String str2 = null;
                switch (bltVar.mo2666r(blf.f3690a)) {
                    case 0:
                        iMo2651b = bltVar.mo2651b();
                        c1118xg2 = c1118xg2;
                        map4 = map4;
                        fMo2650a3 = fMo2650a3;
                        fMo2650a2 = fMo2650a2;
                        fM2701a = fM2701a;
                        arrayList3 = arrayList3;
                        continue;
                    case 1:
                        iMo2651b2 = bltVar.mo2651b();
                        c1118xg2 = c1118xg2;
                        map4 = map4;
                        fMo2650a3 = fMo2650a3;
                        fMo2650a2 = fMo2650a2;
                        fM2701a = fM2701a;
                        arrayList3 = arrayList3;
                        continue;
                    case 2:
                        fMo2650a = (float) bltVar.mo2650a();
                        c1118xg2 = c1118xg2;
                        map4 = map4;
                        fMo2650a3 = fMo2650a3;
                        fMo2650a2 = fMo2650a2;
                        fM2701a = fM2701a;
                        arrayList3 = arrayList3;
                        continue;
                    case 3:
                        fMo2650a2 = ((float) bltVar.mo2650a()) - 0.01f;
                        c1118xg2 = c1118xg2;
                        map4 = map4;
                        fMo2650a3 = fMo2650a3;
                        fM2701a = fM2701a;
                        arrayList3 = arrayList3;
                        continue;
                    case 4:
                        fMo2650a3 = (float) bltVar.mo2650a();
                        c1118xg2 = c1118xg2;
                        map4 = map4;
                        fMo2650a2 = fMo2650a2;
                        fM2701a = fM2701a;
                        arrayList3 = arrayList3;
                        continue;
                    case 5:
                        f = fM2701a;
                        map = map4;
                        arrayList = arrayList3;
                        c1118xg = c1118xg2;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        String[] strArrSplit = bltVar.mo2655g().split("\\.");
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        int i3 = Integer.parseInt(strArrSplit[2]);
                        if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                            bgmVar.m2418d("Lottie only supports bodymovin >= 4.4.0");
                        }
                        break;
                    case 6:
                        f = fM2701a;
                        C1114xc c1114xc3 = c1114xc2;
                        map = map4;
                        arrayList = arrayList3;
                        c1118xg = c1118xg2;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        bltVar.mo2656h();
                        int i4 = 0;
                        while (bltVar.mo2663o()) {
                            bkf bkfVarM2648a = ble.m2648a(bltVar, bgmVar);
                            if (bkfVarM2648a.f3616t == 3) {
                                i4++;
                            }
                            arrayList2.add(bkfVarM2648a);
                            C1114xc c1114xc4 = c1114xc3;
                            c1114xc4.m19549g(bkfVarM2648a.f3600d, bkfVarM2648a);
                            if (i4 > 4) {
                                blx.m2680a("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            }
                            c1114xc3 = c1114xc4;
                        }
                        c1114xc2 = c1114xc3;
                        bltVar.mo2658j();
                        break;
                    case 7:
                        arrayList = arrayList3;
                        c1118xg = c1118xg2;
                        bltVar.mo2656h();
                        while (bltVar.mo2663o()) {
                            ArrayList arrayList4 = new ArrayList();
                            C1114xc c1114xc5 = new C1114xc();
                            bltVar.mo2657i();
                            map4 = map4;
                            fMo2650a3 = fMo2650a3;
                            String strMo2655g = null;
                            int iMo2651b3 = 0;
                            int iMo2651b4 = 0;
                            String strMo2655g2 = null;
                            while (bltVar.mo2663o()) {
                                fMo2650a2 = fMo2650a2;
                                switch (bltVar.mo2666r(blf.f3691b)) {
                                    case 0:
                                        strMo2655g2 = bltVar.mo2655g();
                                        fM2701a = fM2701a;
                                        c1114xc2 = c1114xc2;
                                        break;
                                    case 1:
                                        bltVar.mo2656h();
                                        while (bltVar.mo2663o()) {
                                            bkf bkfVarM2648a2 = ble.m2648a(bltVar, bgmVar);
                                            c1114xc5.m19549g(bkfVarM2648a2.f3600d, bkfVarM2648a2);
                                            arrayList4.add(bkfVarM2648a2);
                                            fM2701a = fM2701a;
                                            c1114xc2 = c1114xc2;
                                        }
                                        f4 = fM2701a;
                                        c1114xc = c1114xc2;
                                        bltVar.mo2658j();
                                        fM2701a = f4;
                                        c1114xc2 = c1114xc;
                                        break;
                                    case 2:
                                        iMo2651b3 = bltVar.mo2651b();
                                        break;
                                    case 3:
                                        iMo2651b4 = bltVar.mo2651b();
                                        break;
                                    case 4:
                                        strMo2655g = bltVar.mo2655g();
                                        break;
                                    case 5:
                                        bltVar.mo2655g();
                                        f4 = fM2701a;
                                        c1114xc = c1114xc2;
                                        fM2701a = f4;
                                        c1114xc2 = c1114xc;
                                        break;
                                    default:
                                        f4 = fM2701a;
                                        c1114xc = c1114xc2;
                                        bltVar.mo2661m();
                                        bltVar.mo2662n();
                                        fM2701a = f4;
                                        c1114xc2 = c1114xc;
                                        break;
                                }
                            }
                            fM2701a = fM2701a;
                            c1114xc2 = c1114xc2;
                            fMo2650a2 = fMo2650a2;
                            bltVar.mo2659k();
                            if (strMo2655g != null) {
                                bgw bgwVar = new bgw(iMo2651b3, iMo2651b4, strMo2655g2, strMo2655g);
                                map3.put(bgwVar.f3223c, bgwVar);
                            } else {
                                map2.put(strMo2655g2, arrayList4);
                            }
                        }
                        f = fM2701a;
                        map = map4;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        bltVar.mo2658j();
                        c1114xc2 = c1114xc2;
                        break;
                    case 8:
                        arrayList = arrayList3;
                        bltVar.mo2657i();
                        while (bltVar.mo2663o()) {
                            switch (bltVar.mo2666r(blf.f3692c)) {
                                case 0:
                                    bltVar.mo2656h();
                                    while (bltVar.mo2663o()) {
                                        dsx dsxVar2 = bkx.f3671a;
                                        bltVar.mo2657i();
                                        String strMo2655g3 = null;
                                        String strMo2655g4 = null;
                                        String strMo2655g5 = null;
                                        while (bltVar.mo2663o()) {
                                            c1118xg2 = c1118xg2;
                                            switch (bltVar.mo2666r(bkx.f3671a)) {
                                                case 0:
                                                    strMo2655g3 = bltVar.mo2655g();
                                                    break;
                                                case 1:
                                                    strMo2655g4 = bltVar.mo2655g();
                                                    break;
                                                case 2:
                                                    strMo2655g5 = bltVar.mo2655g();
                                                    break;
                                                case 3:
                                                    bltVar.mo2650a();
                                                    break;
                                                default:
                                                    bltVar.mo2661m();
                                                    bltVar.mo2662n();
                                                    break;
                                            }
                                        }
                                        C1118xg c1118xg3 = c1118xg2;
                                        bltVar.mo2659k();
                                        C1058va c1058va = new C1058va(strMo2655g3, strMo2655g4, strMo2655g5);
                                        map4.put(c1058va.f47803b, c1058va);
                                        c1118xg2 = c1118xg3;
                                    }
                                    bltVar.mo2658j();
                                    c1118xg2 = c1118xg2;
                                    break;
                                default:
                                    C1118xg c1118xg4 = c1118xg2;
                                    bltVar.mo2661m();
                                    bltVar.mo2662n();
                                    c1118xg2 = c1118xg4;
                                    break;
                            }
                        }
                        c1118xg = c1118xg2;
                        bltVar.mo2659k();
                        f = fM2701a;
                        map = map4;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        break;
                    case 9:
                        bltVar.mo2656h();
                        while (bltVar.mo2663o()) {
                            ArrayList arrayList5 = new ArrayList();
                            bltVar.mo2657i();
                            String strMo2655g6 = str2;
                            String strMo2655g7 = strMo2655g6;
                            double dMo2650a = 0.0d;
                            char cCharAt = 0;
                            while (bltVar.mo2663o()) {
                                switch (bltVar.mo2666r(bkw.f3669a)) {
                                    case 0:
                                        cCharAt = bltVar.mo2655g().charAt(0);
                                        arrayList3 = arrayList3;
                                        break;
                                    case 1:
                                        bltVar.mo2650a();
                                        arrayList3 = arrayList3;
                                        break;
                                    case 2:
                                        dMo2650a = bltVar.mo2650a();
                                        break;
                                    case 3:
                                        strMo2655g6 = bltVar.mo2655g();
                                        break;
                                    case 4:
                                        strMo2655g7 = bltVar.mo2655g();
                                        break;
                                    case 5:
                                        bltVar.mo2657i();
                                        while (bltVar.mo2663o()) {
                                            switch (bltVar.mo2666r(bkw.f3670b)) {
                                                case 0:
                                                    bltVar.mo2656h();
                                                    while (bltVar.mo2663o()) {
                                                        arrayList5.add((bjx) bkt.m2636a(bltVar, bgmVar));
                                                    }
                                                    bltVar.mo2658j();
                                                    break;
                                                default:
                                                    bltVar.mo2661m();
                                                    bltVar.mo2662n();
                                                    break;
                                            }
                                        }
                                        bltVar.mo2659k();
                                        arrayList3 = arrayList3;
                                        break;
                                    default:
                                        bltVar.mo2661m();
                                        bltVar.mo2662n();
                                        arrayList3 = arrayList3;
                                        break;
                                }
                            }
                            bltVar.mo2659k();
                            biv bivVar = new biv(arrayList5, cCharAt, dMo2650a, strMo2655g6, strMo2655g7);
                            c1118xg2.m19565d(bivVar.hashCode(), bivVar);
                            arrayList3 = arrayList3;
                            str2 = null;
                        }
                        arrayList = arrayList3;
                        bltVar.mo2658j();
                        f = fM2701a;
                        map = map4;
                        c1118xg = c1118xg2;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        break;
                    case 10:
                        bltVar.mo2656h();
                        while (bltVar.mo2663o()) {
                            bltVar.mo2657i();
                            while (bltVar.mo2663o()) {
                                switch (bltVar.mo2666r(blf.f3693d)) {
                                    case 0:
                                        bltVar.mo2655g();
                                        break;
                                    case 1:
                                        bltVar.mo2650a();
                                        break;
                                    case 2:
                                        bltVar.mo2650a();
                                        break;
                                    default:
                                        bltVar.mo2661m();
                                        bltVar.mo2662n();
                                        break;
                                }
                            }
                            bltVar.mo2659k();
                            arrayList3.add(new bzq((boolean[]) null));
                        }
                        bltVar.mo2658j();
                        f = fM2701a;
                        map = map4;
                        arrayList = arrayList3;
                        c1118xg = c1118xg2;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        break;
                    default:
                        f = fM2701a;
                        map = map4;
                        arrayList = arrayList3;
                        c1118xg = c1118xg2;
                        f2 = fMo2650a2;
                        f3 = fMo2650a3;
                        bltVar.mo2661m();
                        bltVar.mo2662n();
                        break;
                }
                c1118xg2 = c1118xg;
                map4 = map;
                fMo2650a3 = f3;
                fMo2650a2 = f2;
                fM2701a = f;
                arrayList3 = arrayList;
            }
            float f5 = fM2701a;
            bgmVar.f3178g = new Rect(0, 0, (int) (iMo2651b * f5), (int) (iMo2651b2 * f5));
            bgmVar.f3179h = fMo2650a;
            bgmVar.f3180i = fMo2650a2;
            bgmVar.f3181j = fMo2650a3;
            bgmVar.f3177f = arrayList2;
            bgmVar.f3176e = c1114xc2;
            bgmVar.f3172a = map2;
            bgmVar.f3173b = map3;
            bgmVar.f3175d = c1118xg2;
            bgmVar.f3174c = map4;
            if (str != null) {
                biy.f3467a.m2522a(str, bgmVar);
            }
            bhb bhbVar = new bhb(bgmVar);
            if (z) {
            }
            return bhbVar;
        } catch (Exception e) {
            bhb bhbVar2 = new bhb((Throwable) e);
            if (z) {
            }
            return bhbVar2;
        } finally {
            if (z) {
                bme.m2705e(bltVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private static bhd m2430k(String str, Callable callable) {
        bgm bgmVar = str == null ? null : (bgm) biy.f3467a.f3468b.m19553a(str);
        if (bgmVar != null) {
            return new bhd(new bpr(bgmVar, 1));
        }
        if (str != null) {
            Map map = f3193a;
            if (map.containsKey(str)) {
                return (bhd) map.get(str);
            }
        }
        bhd bhdVar = new bhd(callable);
        if (str != null) {
            bhdVar.m2460e(new bgj(str, 2));
            bhdVar.m2459d(new bgj(str, 3));
            f3193a.put(str, bhdVar);
        }
        return bhdVar;
    }
}
