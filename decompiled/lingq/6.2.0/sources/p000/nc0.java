package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_text_common.AbstractC0981l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.mlkit.common.MlKitException;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nc0 implements jy2, xzc {

    /* JADX INFO: renamed from: f */
    public static nc0 f52582f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52583a;

    /* JADX INFO: renamed from: b */
    public boolean f52584b;

    /* JADX INFO: renamed from: c */
    public Object f52585c;

    /* JADX INFO: renamed from: d */
    public Object f52586d;

    /* JADX INFO: renamed from: e */
    public Object f52587e;

    public nc0(Context context, Runnable runnable, Boolean bool) {
        this.f52583a = 3;
        AudioManager audioManagerM17083B = context == null ? null : AbstractC3352my.m17083B(context);
        if (audioManagerM17083B == null || (bool != null && bool.booleanValue())) {
            this.f52585c = null;
            this.f52584b = false;
            this.f52586d = null;
            this.f52587e = null;
            return;
        }
        Spatializer spatializer = audioManagerM17083B.getSpatializer();
        this.f52585c = spatializer;
        this.f52584b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f52586d = handler;
        re9 re9Var = new re9(runnable);
        this.f52587e = re9Var;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC3777xz(handler), re9Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m17325b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    /* JADX INFO: renamed from: l */
    public static nc0 m17326l(Context context) {
        if (f52582f == null) {
            boolean zHasCapability = false;
            nc0 nc0Var = new nc0(2, zHasCapability);
            nc0Var.f52587e = new ArrayList();
            nc0Var.f52586d = new HashSet();
            if (context != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                nc0Var.f52585c = connectivityManager;
                try {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        zHasCapability = connectivityManager.getNetworkCapabilities(activeNetwork).hasCapability(12);
                    }
                    nc0Var.f52584b = zHasCapability;
                    eh0.m11120Q("NetworkConnectivityManager", "Internet active : " + nc0Var.f52584b);
                } catch (Exception unused) {
                    eh0.m11135p("NetworkConnectivityManager", "Error in detecting network availability");
                }
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                ConnectivityManager connectivityManager2 = (ConnectivityManager) nc0Var.f52585c;
                if (connectivityManager2 != null) {
                    try {
                        connectivityManager2.registerNetworkCallback(networkRequestBuild, new j44(nc0Var));
                    } catch (SecurityException e) {
                        eh0.m11135p("NetworkConnectivityManager", e.getLocalizedMessage());
                    }
                }
            }
            f52582f = nc0Var;
        }
        return f52582f;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x029c  */
    @Override // p000.xzc
    /* JADX INFO: renamed from: a */
    public js9 mo9915a(z54 z54Var) throws MlKitException {
        Bitmap bitmapCreateBitmap;
        String str;
        if (((eec) this.f52587e) == null) {
            zzb();
        }
        int i = 14;
        if (((eec) this.f52587e) == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i2 = z54Var.f70941d;
        int i3 = 0;
        if (i2 == -1) {
            bitmapCreateBitmap = z54Var.f70938a;
        } else {
            if (i2 != -1) {
                if (i2 == 17) {
                    lda.m16130p(null);
                    throw null;
                }
                if (i2 == 35) {
                    lda.m16130p(null);
                    throw null;
                }
                if (i2 != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                lda.m16130p(null);
                throw null;
            }
            Bitmap bitmap = z54Var.f70938a;
            lda.m16130p(bitmap);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, z54Var.f70939b, z54Var.f70940c);
        }
        lp6 lp6Var = new lp6(bitmapCreateBitmap);
        zzd zzdVar = new zzd(z54Var.f70939b, z54Var.f70940c, 0, 0, 0L);
        try {
            eec eecVar = (eec) this.f52587e;
            lda.m16130p(eecVar);
            Parcel parcelM16773J = eecVar.m16773J();
            int i4 = qrb.f58116a;
            parcelM16773J.writeStrongBinder(lp6Var);
            int i5 = 1;
            parcelM16773J.writeInt(1);
            zzdVar.writeToParcel(parcelM16773J, 0);
            Parcel parcelM16775L = eecVar.m16775L(parcelM16773J, 1);
            zzl[] zzlVarArr = (zzl[]) parcelM16775L.createTypedArray(zzl.CREATOR);
            parcelM16775L.recycle();
            SparseArray sparseArray = new SparseArray();
            for (zzl zzlVar : zzlVarArr) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.f12128j);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzlVar.f12128j, sparseArray2);
                }
                sparseArray2.append(zzlVar.f12129k, zzlVar);
            }
            int i6 = 4;
            Object[] objArrCopyOf = new Object[4];
            int i7 = 0;
            int i8 = 0;
            while (i7 < sparseArray.size()) {
                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i7);
                Object[] objArrCopyOf2 = new Object[i6];
                int i9 = i3;
                int i10 = i9;
                while (i9 < sparseArray3.size()) {
                    zzl zzlVar2 = (zzl) sparseArray3.valueAt(i9);
                    zzlVar2.getClass();
                    int i11 = i10 + 1;
                    int length = objArrCopyOf2.length;
                    if (length < i11) {
                        int i12 = length + (length >> 1) + i5;
                        if (i12 < i11) {
                            int iHighestOneBit = Integer.highestOneBit(i10);
                            i12 = iHighestOneBit + iHighestOneBit;
                        }
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i12 < 0 ? Integer.MAX_VALUE : i12);
                    }
                    objArrCopyOf2[i10] = zzlVar2;
                    i9++;
                    i10 = i11;
                }
                zzbk zzbkVarM5497j = zzbk.m5497j(objArrCopyOf2, i10);
                AbstractList abstractListM5477a = AbstractC0981l.m5477a(zzbkVarM5497j, new n58(i));
                zzf zzfVar = ((zzl) zzbkVarM5497j.get(i3)).f12120b;
                mpb mpbVarListIterator = zzbkVarM5497j.listIterator(i3);
                int iMax = Integer.MIN_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                while (mpbVarListIterator.hasNext()) {
                    int i13 = i5;
                    zzf zzfVar2 = ((zzl) mpbVarListIterator.next()).f12120b;
                    int i14 = i3;
                    int i15 = zzfVar.f12114a;
                    float f = zzfVar.f12118e;
                    int i16 = -zzfVar.f12115b;
                    double d = f;
                    double dSin = Math.sin(Math.toRadians(d));
                    double dCos = Math.cos(Math.toRadians(d));
                    SparseArray sparseArray4 = sparseArray;
                    Point[] pointArr = new Point[4];
                    int i17 = zzfVar2.f12114a;
                    int i18 = zzfVar2.f12117d;
                    int i19 = zzfVar2.f12116c;
                    Point point = new Point(i17, zzfVar2.f12115b);
                    pointArr[i14] = point;
                    point.offset(-i15, i16);
                    Point point2 = pointArr[i14];
                    int i20 = point2.x;
                    double d2 = ((double) i20) * dCos;
                    double d3 = point2.y;
                    double d4 = d3 * dSin;
                    double d5 = ((double) (-i20)) * dSin;
                    double d6 = d3 * dCos;
                    int i21 = (int) (d2 + d4);
                    point2.x = i21;
                    int i22 = (int) (d5 + d6);
                    point2.y = i22;
                    int i23 = i21 + i19;
                    pointArr[i13] = new Point(i23, i22);
                    int i24 = i22 + i18;
                    pointArr[2] = new Point(i23, i24);
                    pointArr[3] = new Point(i21, i24);
                    for (int i25 = i14; i25 < 4; i25++) {
                        Point point3 = pointArr[i25];
                        iMin = Math.min(iMin, point3.x);
                        iMax = Math.max(iMax, point3.x);
                        iMin2 = Math.min(iMin2, point3.y);
                        iMax2 = Math.max(iMax2, point3.y);
                    }
                    i5 = i13;
                    i3 = i14;
                    sparseArray = sparseArray4;
                }
                SparseArray sparseArray5 = sparseArray;
                int i26 = i5;
                int i27 = i3;
                int i28 = zzfVar.f12114a;
                float f2 = zzfVar.f12118e;
                int i29 = zzfVar.f12115b;
                int i30 = i7;
                double d7 = f2;
                double dSin2 = Math.sin(Math.toRadians(d7));
                double dCos2 = Math.cos(Math.toRadians(d7));
                Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
                int i31 = i27;
                while (i31 < 4) {
                    Point point4 = pointArr2[i31];
                    double d8 = point4.x;
                    double d9 = d8 * dCos2;
                    double d10 = dCos2;
                    double d11 = point4.y;
                    point4.x = (int) (d9 - (d11 * dSin2));
                    point4.y = (int) ((d8 * dSin2) + (d11 * d10));
                    point4.offset(i28, i29);
                    i31++;
                    dCos2 = d10;
                }
                List listAsList = Arrays.asList(pointArr2);
                String strM25108b = yed.m25108b(AbstractC0981l.m5477a(abstractListM5477a, new to2()));
                Rect rectM14397b = jcd.m14397b(listAsList);
                HashMap map = new HashMap();
                Iterator it = abstractListM5477a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((gs9) it.next()).f48951b;
                    map.put(str2, Integer.valueOf((map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : i27) + 1));
                }
                Set setEntrySet = map.entrySet();
                if (setEntrySet.isEmpty()) {
                    str = "und";
                } else {
                    str = (String) ((Map.Entry) Collections.max(setEntrySet, tyc.f63105a)).getKey();
                    if (cfd.m4634i(str)) {
                        str = "und";
                    }
                }
                is9 is9Var = new is9(strM25108b, rectM14397b, listAsList, str);
                int i32 = i8 + 1;
                int length2 = objArrCopyOf.length;
                if (length2 < i32) {
                    int i33 = length2 + (length2 >> 1) + 1;
                    if (i33 < i32) {
                        int iHighestOneBit2 = Integer.highestOneBit(i8);
                        i33 = iHighestOneBit2 + iHighestOneBit2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i33 < 0 ? Integer.MAX_VALUE : i33);
                }
                objArrCopyOf[i8] = is9Var;
                i7 = i30 + 1;
                i6 = 4;
                i = 14;
                i5 = i26;
                i8 = i32;
                i3 = i27;
                sparseArray = sparseArray5;
            }
            zzbk zzbkVarM5497j2 = zzbk.m5497j(objArrCopyOf, i8);
            return new js9(yed.m25108b(AbstractC0981l.m5477a(zzbkVarM5497j2, new x24())), zzbkVarM5497j2);
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run legacy text recognizer.", e);
        }
    }

    @Override // p000.xzc
    /* JADX INFO: renamed from: c */
    public void mo9916c() {
        switch (this.f52583a) {
            case 5:
                synchronized (this.f52585c) {
                    try {
                        if (((ArrayDeque) this.f52586d).isEmpty()) {
                            this.f52584b = false;
                            return;
                        }
                        fld fldVar = (fld) ((ArrayDeque) this.f52586d).remove();
                        m17337r(fldVar.f39272b, fldVar.f39271a);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                eec eecVar = (eec) this.f52587e;
                if (eecVar != null) {
                    try {
                        eecVar.m16776M(eecVar.m16773J(), 2);
                        break;
                    } catch (RemoteException e) {
                        Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
                    }
                    this.f52587e = null;
                    return;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public qg5 m17327d() {
        return (qg5) ((wo3) this.f52585c).f67120b;
    }

    /* JADX INFO: renamed from: e */
    public Feature[] m17328e() {
        return (Feature[]) this.f52586d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m17329f() {
        Spatializer spatializer = (Spatializer) this.f52585c;
        return spatializer != null && spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: g */
    public boolean m17330g() {
        Spatializer spatializer = (Spatializer) this.f52585c;
        return spatializer != null && spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: h */
    public boolean m17331h() {
        return this.f52584b;
    }

    /* JADX INFO: renamed from: i */
    public void m17332i(co3 co3Var, wr9 wr9Var) {
        ((b48) this.f52587e).f7929a.accept(co3Var, wr9Var);
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: j */
    public void mo2551j() {
        SparseArray sparseArray = (SparseArray) this.f52587e;
        ((jy2) this.f52585c).mo2551j();
        if (this.f52584b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((dn9) sparseArray.valueAt(i)).f35910i = true;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m17333k() {
        re9 re9Var;
        Handler handler = (Handler) this.f52586d;
        Spatializer spatializer = (Spatializer) this.f52585c;
        if (spatializer == null || (re9Var = (re9) this.f52587e) == null || handler == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(re9Var);
        handler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: m */
    public void m17334m(Runnable runnable, Executor executor) {
        synchronized (this.f52585c) {
            try {
                if (this.f52584b) {
                    ((ArrayDeque) this.f52586d).add(new fld(runnable, executor));
                } else {
                    this.f52584b = true;
                    m17337r(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: n */
    public n8a mo2555n(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.f52587e;
        jy2 jy2Var = (jy2) this.f52585c;
        if (i2 != 3 && i2 != 5) {
            this.f52584b = true;
        }
        if (i2 != 3) {
            return jy2Var.mo2555n(i, i2);
        }
        dn9 dn9Var = (dn9) sparseArray.get(i);
        if (dn9Var != null) {
            return dn9Var;
        }
        dn9 dn9Var2 = new dn9(jy2Var.mo2555n(i, i2), (bn9) this.f52586d);
        sparseArray.put(i, dn9Var2);
        return dn9Var2;
    }

    /* JADX INFO: renamed from: o */
    public int m17335o() {
        ((gp0) this.f52585c).getClass();
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public qc0 m17336p() {
        nl7 nl7Var;
        if (((zzbw) this.f52586d).isEmpty()) {
            return wwb.f67444i;
        }
        lc0 lc0Var = (lc0) ((zzbw) this.f52586d).get(0);
        for (int i = 1; i < ((zzbw) this.f52586d).size(); i++) {
            lc0 lc0Var2 = (lc0) ((zzbw) this.f52586d).get(i);
            if (!lc0Var2.f49421a.f57907d.equals(lc0Var.f49421a.f57907d) && !lc0Var2.f49421a.f57907d.equals("play_pass_subs")) {
                return wwb.m24184a(5, "All products should have same ProductType.");
            }
        }
        ql7 ql7Var = lc0Var.f49421a;
        String strOptString = ql7Var.f57905b.optString("packageName");
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        zzbw zzbwVar = (zzbw) this.f52586d;
        int size = zzbwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            lc0 lc0Var3 = (lc0) zzbwVar.get(i2);
            lc0Var3.getClass();
            ql7 ql7Var2 = lc0Var3.f49421a;
            ArrayList arrayList = ql7Var2.f57911h;
            String str = ql7Var2.f57906c;
            if (arrayList != null && lc0Var3.f49422b == null) {
                return wwb.m24184a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str);
            }
            if (map.containsKey(str)) {
                return wwb.m24184a(5, "ProductId can not be duplicated. Invalid product id: " + str + ".");
            }
            map.put(str, lc0Var3);
            if (!ql7Var.f57907d.equals("play_pass_subs") && !ql7Var2.f57907d.equals("play_pass_subs") && !strOptString.equals(ql7Var2.f57905b.optString("packageName"))) {
                return wwb.m24184a(5, "All products must have the same package name.");
            }
        }
        for (String str2 : hashSet) {
            if (map.containsKey(str2)) {
                ((lc0) map.get(str2)).getClass();
                return wwb.m24184a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str2 + ".");
            }
        }
        ArrayList arrayList2 = ql7Var.f57912i;
        String str3 = lc0Var.f49422b;
        if (str3 != null && arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    nl7Var = null;
                    break;
                }
                nl7Var = (nl7) it.next();
            } while (!str3.equals(nl7Var.f52919a));
            if (nl7Var != null && nl7Var.f52922d != null) {
                return wwb.m24184a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return wwb.f67444i;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: q */
    public void mo2558q(st8 st8Var) {
        ((jy2) this.f52585c).mo2558q(st8Var);
    }

    /* JADX INFO: renamed from: r */
    public void m17337r(Runnable runnable, Executor executor) {
        try {
            executor.execute(new gvb(29, this, runnable));
        } catch (RejectedExecutionException unused) {
            mo9916c();
        }
    }

    /* JADX INFO: renamed from: s */
    public String m17338s() {
        return ((gp0) this.f52585c).f41124b;
    }

    /* JADX INFO: renamed from: t */
    public String m17339t() {
        ((gp0) this.f52585c).getClass();
        return null;
    }

    /* JADX INFO: renamed from: u */
    public ArrayList m17340u() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) this.f52587e);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public zzbw m17341v() {
        return (zzbw) this.f52586d;
    }

    /* JADX INFO: renamed from: w */
    public boolean m17342w() {
        ((gp0) this.f52585c).getClass();
        if (this.f52584b) {
            return true;
        }
        zzbw zzbwVar = (zzbw) this.f52586d;
        if (zzbwVar != null) {
            int size = zzbwVar.size();
            for (int i = 0; i < size; i++) {
                ((lc0) zzbwVar.get(i)).getClass();
            }
        }
        return false;
    }

    @Override // p000.xzc
    public void zzb() throws MlKitException {
        vrc wicVar;
        Context context = (Context) this.f52585c;
        if (((eec) this.f52587e) != null) {
            return;
        }
        try {
            IBinder iBinderM2955b = ao2.m2949c(context, ao2.f7272b, "com.google.android.gms.vision.dynamite").m2955b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
            int i = inc.f44334g;
            if (iBinderM2955b == null) {
                wicVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderM2955b.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                wicVar = iInterfaceQueryLocalInterface instanceof vrc ? (vrc) iInterfaceQueryLocalInterface : new wic(iBinderM2955b, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", 2);
            }
            eec eecVarM23993Q = ((wic) wicVar).m23993Q(new lp6(context), (zzp) this.f52586d);
            this.f52587e = eecVarM23993Q;
            if (eecVarM23993Q != null || this.f52584b) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            pz6.m19577a(context);
            this.f52584b = true;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy text recognizer.", e);
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e2);
        }
    }

    public nc0(b48 b48Var, wo3 wo3Var, Feature[] featureArr, boolean z) {
        this.f52583a = 6;
        this.f52587e = b48Var;
        this.f52585c = wo3Var;
        this.f52586d = featureArr;
        this.f52584b = z;
    }

    public nc0(Context context) {
        this.f52583a = 7;
        this.f52586d = new zzp(null);
        this.f52585c = context;
    }

    public nc0(int i) {
        this.f52583a = i;
        switch (i) {
            case 5:
                this.f52585c = new Object();
                this.f52586d = new ArrayDeque();
                this.f52587e = new AtomicReference();
                break;
            default:
                this.f52585c = new float[16];
                this.f52586d = new float[16];
                this.f52587e = new gh1(3);
                break;
        }
    }

    public nc0(jy2 jy2Var, bn9 bn9Var) {
        this.f52583a = 4;
        this.f52585c = jy2Var;
        this.f52586d = bn9Var;
        this.f52587e = new SparseArray();
    }

    public /* synthetic */ nc0(int i, boolean z) {
        this.f52583a = i;
    }
}
