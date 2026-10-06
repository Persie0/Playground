package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.graphics.Path;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkn {

    /* JADX INFO: renamed from: a */
    public final Object f3651a;

    public bkn() {
        this.f3651a = new ArrayList();
    }

    public bkn(int i, boolean z) {
        lku.m15669w(i != 1);
        nxl nxlVarM18137O = nhy.f42573Z.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nhy nhyVar = (nhy) nxqVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nhyVar.f42602c = i2;
        nhyVar.f42600a |= 2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nhy nhyVar2 = (nhy) nxlVarM18137O.f44974b;
        nhyVar2.f42600a |= 4;
        nhyVar2.f42603d = z;
        this.f3651a = nxlVarM18137O;
    }

    public bkn(acl aclVar) {
        this.f3651a = aclVar;
    }

    public bkn(DevicePolicyManager devicePolicyManager) {
        this.f3651a = devicePolicyManager;
    }

    public bkn(Context context) {
        this.f3651a = new bua(context);
    }

    public bkn(DisplayMetrics displayMetrics) {
        this.f3651a = displayMetrics;
    }

    public bkn(View view) {
        this.f3651a = new WeakReference(view);
    }

    public bkn(TextView textView) {
        this.f3651a = new ajf(textView);
    }

    public bkn(AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2) {
        this.f3651a = ambientController;
    }

    public bkn(WorkDatabase workDatabase) {
        this.f3651a = workDatabase;
    }

    public bkn(WorkDatabase workDatabase, byte[] bArr) {
        workDatabase.getClass();
        this.f3651a = workDatabase;
    }

    public bkn(aui auiVar) {
        this.f3651a = auiVar;
    }

    public bkn(bbo bboVar, byte[] bArr, byte[] bArr2) {
        bboVar.getClass();
        this.f3651a = bboVar;
    }

    public bkn(bcj bcjVar) {
        this.f3651a = bcjVar;
    }

    public bkn(C0086ce c0086ce) {
        this.f3651a = c0086ce;
    }

    public bkn(dhv dhvVar) {
        this.f3651a = dhvVar;
    }

    public bkn(dsx dsxVar, byte[] bArr, byte[] bArr2) {
        this.f3651a = dsxVar;
    }

    public bkn(fao faoVar) {
        this.f3651a = faoVar;
    }

    public bkn(fmy fmyVar) {
        this.f3651a = fmyVar;
    }

    public bkn(fvu fvuVar) {
        this.f3651a = fvuVar;
    }

    public bkn(fzd fzdVar) {
        this.f3651a = fzdVar;
    }

    public bkn(gdz gdzVar) {
        this.f3651a = gdzVar;
    }

    public bkn(ggs ggsVar) {
        this.f3651a = ggsVar;
    }

    public bkn(grc grcVar) {
        this.f3651a = grcVar;
    }

    public bkn(Iterable iterable, ikw ikwVar) {
        this.f3651a = new EnumMap(ikw.class);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gtd gtdVar = (gtd) it.next();
            if (gtdVar != null) {
                Object obj = ((gtd) gtdVar.f26334a).f26334a;
                lku.m15670x(ikw.UNINITIALIZED != obj, "ModuleManager: The ApplicationMode can not be UNINITIALIZED");
                if (((EnumMap) this.f3651a).get(obj) != null) {
                    throw new IllegalArgumentException("ModuleManager: Mode " + String.valueOf(obj) + " is registered already");
                }
                ((EnumMap) this.f3651a).put((Enum) obj, gtdVar);
            }
        }
        ((gtd) ((EnumMap) this.f3651a).get(ikwVar)).getClass();
    }

    public bkn(Object obj) {
        this.f3651a = obj;
    }

    public bkn(Object obj, byte[] bArr) {
        this.f3651a = obj;
    }

    public bkn(Object obj, char[] cArr) {
        this.f3651a = obj;
    }

    public bkn(Object obj, short[] sArr) {
        this.f3651a = obj;
    }

    public bkn(List list) {
        this.f3651a = list;
    }

    public bkn(List list, byte[] bArr) {
        this.f3651a = list;
    }

    public bkn(Map map) {
        this.f3651a = map;
    }

    public bkn(Set set) {
        this.f3651a = set;
    }

    public bkn(Executor executor) {
        this.f3651a = executor;
    }

    public bkn(jwn jwnVar, ikw ikwVar) {
        kmp kmpVar = (kmp) ((jwp) jwnVar).f34961a;
        mwn mwnVar = new mwn();
        mxk mxkVarM9440b = gls.m9440b(ikwVar);
        if (mxkVarM9440b.isEmpty()) {
            int i = 1;
            if (kmpVar != kmp.FULL && kmpVar != kmp.SIMPLE && kmpVar != kmp.EXTENDED) {
                i = 0;
            }
            mwnVar.m17082g(kgq.m14215e(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        } else {
            mwnVar.m17083h(mxkVarM9440b);
        }
        this.f3651a = mwnVar.m17081f();
    }

    public bkn(kbn kbnVar) {
        this.f3651a = kbnVar.mo6314a("TuningDataLogger");
    }

    public bkn(kol kolVar, byte[] bArr) {
        this.f3651a = kolVar;
    }

    public bkn(mrm mrmVar) {
        this.f3651a = mrmVar;
    }

    public bkn(mrm mrmVar, byte[] bArr) {
        this.f3651a = mrmVar;
    }

    public bkn(nho nhoVar) {
        this.f3651a = nhoVar;
    }

    public bkn(oyo oyoVar, byte[] bArr, byte[] bArr2) {
        this.f3651a = oyoVar;
    }

    public bkn(C0948qz c0948qz) {
        this.f3651a = c0948qz;
    }

    public bkn(C0955rf c0955rf) {
        this.f3651a = c0955rf;
    }

    public bkn(byte[] bArr) {
        this.f3651a = new ArrayDeque();
    }

    public bkn(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3651a = new ArrayList();
    }

    public bkn(byte[] bArr, byte[] bArr2, short[] sArr) {
        this.f3651a = new ArrayList();
    }

    public bkn(byte[] bArr, short[] sArr) {
        TreeMap treeMap = new TreeMap();
        lku.m15669w(treeMap.size() <= 9000);
        this.f3651a = mpw.m16779r(new kaw(treeMap), null);
    }

    public bkn(char[] cArr) {
        this.f3651a = Handler.createAsync(Looper.getMainLooper());
    }

    public bkn(char[] cArr, byte[] bArr) {
        this.f3651a = new LinkedHashMap();
    }

    public bkn(char[] cArr, short[] sArr) {
        this.f3651a = new imw(15);
    }

    public bkn(float[] fArr) {
        this.f3651a = fArr;
    }

    public bkn(int[] iArr, byte[] bArr) {
        this.f3651a = iArr;
    }

    public bkn(File[] fileArr) {
        this.f3651a = fileArr;
    }

    public bkn(ksy[] ksyVarArr, byte[] bArr, byte[] bArr2) {
        this.f3651a = ksyVarArr;
    }

    public bkn(short[] sArr, byte[] bArr) {
        this.f3651a = new jwf(false);
    }

    /* JADX INFO: renamed from: A */
    public static bkn m2549A(int i, int i2, int i3) {
        return new bkn(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3), (char[]) null);
    }

    /* JADX INFO: renamed from: K */
    public static final nps m2550K(Collection collection) {
        return nod.m17553i(kxk.m14961G(collection), new cev(4), not.INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public static String m2551c(String str, bkm bkmVar, boolean z) {
        return "lottie_cache_" + str.replaceAll("\\W+", "") + (z ? ".temp".concat(String.valueOf(bkmVar.f3650c)) : bkmVar.f3650c);
    }

    /* JADX INFO: renamed from: z */
    public static bkn m2552z(int i, int i2, int i3, int i4, boolean z) {
        return new bkn((Object) AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), (byte[]) null);
    }

    /* JADX INFO: renamed from: B */
    public final void m2553B(AmbientMode.AmbientController ambientController) {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            afz.m570a(view.animate(), ambientController != null ? new afx(ambientController, 0, null, null, null, null) : null);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2554C() {
        return ((AtomicInteger) this.f3651a).get() == 3;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2555D() {
        return ((AtomicInteger) this.f3651a).get() == 2;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m2556E() {
        return ((AtomicInteger) this.f3651a).get() == 1;
    }

    /* JADX INFO: renamed from: F */
    public final void m2557F(int... iArr) {
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            int i3 = ((AtomicInteger) this.f3651a).get();
            int i4 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            z |= true ^ (i3 != i4);
        }
        lku.m15614I(z, "Invalid session state: " + ((AtomicInteger) this.f3651a).get());
    }

    /* JADX INFO: renamed from: G */
    public final void m2558G(int i) {
        ((AtomicInteger) this.f3651a).set(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final void m2559H(int i, int i2) {
        if (((AtomicInteger) this.f3651a).getAndSet(i2 - 1) != i - 1) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: I */
    public final float m2560I(kpw kpwVar) {
        mrm mrmVarM7985o = exg.m7985o((mrm) this.f3651a, kpwVar.mo7248d());
        if (!mrmVarM7985o.mo16813g()) {
            return 0.0f;
        }
        fkg fkgVar = (fkg) mrmVarM7985o.mo16809c();
        double dAbs = Math.abs(fkgVar.f22371b);
        double dAbs2 = Math.abs(fkgVar.f22372c);
        if (dAbs > 10.0d || dAbs2 > 10.0d) {
            return -1.0f;
        }
        double dExp = 1.0d / (Math.exp(dAbs2) + 1.0d);
        return (float) ((dExp + dExp) - 1.0d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: J */
    public final gbi m2561J(gbi gbiVar) {
        return new gjy(gbiVar, this.f3651a);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m2562L(CaptureResult.Key key, Object obj) {
        return m2563M(key, obj);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    @SafeVarargs
    /* JADX INFO: renamed from: M */
    public final boolean m2563M(CaptureResult.Key key, Object... objArr) {
        lku.m15669w(objArr.length > 0);
        HashSet hashSet = new HashSet(Arrays.asList(objArr));
        Iterator it = this.f3651a.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(((kpp) it.next()).mo9517d(key))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: N */
    public final synchronized mrm m2564N() {
        return mrm.m16828h((bkn) mkv.m16516X(this.f3651a, null));
    }

    /* JADX INFO: renamed from: O */
    public final void m2565O(nim nimVar) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nimVar.getClass();
        nhyVar.f42595U = nimVar;
        nhyVar.f42601b |= 16777216;
    }

    /* JADX INFO: renamed from: P */
    public final void m2566P(keg kegVar) {
        if (kegVar == null) {
            return;
        }
        Object obj = this.f3651a;
        nxl nxlVarM18137O = nit.f42775p.m18137O();
        String tagStringValue = kegVar.getTagStringValue(ExifInterface.f7898g);
        if (tagStringValue != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar = (nit) nxlVarM18137O.f44974b;
            nitVar.f42777a |= 4;
            nitVar.f42779c = tagStringValue;
        }
        String tagStringValue2 = kegVar.getTagStringValue(ExifInterface.f7899h);
        if (tagStringValue2 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar2 = (nit) nxlVarM18137O.f44974b;
            nitVar2.f42777a |= 4;
            nitVar2.f42779c = tagStringValue2;
        }
        String tagStringValue3 = kegVar.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue3 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar3 = (nit) nxlVarM18137O.f44974b;
            nitVar3.f42777a |= 1;
            nitVar3.f42778b = tagStringValue3;
        }
        kaz kazVarMo4680a = kegVar.mo4680a(ExifInterface.f7792F);
        if (kazVarMo4680a != null) {
            float f = kazVarMo4680a.f35504a;
            float f2 = kazVarMo4680a.f35505b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            float f3 = f / f2;
            nit nitVar4 = (nit) nxlVarM18137O.f44974b;
            nitVar4.f42777a |= 8;
            nitVar4.f42780d = f3;
        }
        Integer numMo4681b = kegVar.mo4681b(ExifInterface.f7796J);
        if (numMo4681b != null) {
            int iIntValue = numMo4681b.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar5 = (nit) nxlVarM18137O.f44974b;
            nitVar5.f42777a |= 16;
            nitVar5.f42781e = iIntValue;
        }
        kaz kazVarMo4680a2 = kegVar.mo4680a(ExifInterface.f7812Z);
        if (kazVarMo4680a2 != null) {
            float f4 = kazVarMo4680a2.f35504a;
            float f5 = kazVarMo4680a2.f35505b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            float f6 = f4 / f5;
            nit nitVar6 = (nit) nxlVarM18137O.f44974b;
            nitVar6.f42777a |= 32;
            nitVar6.f42782f = f6;
        }
        kaz kazVarMo4680a3 = kegVar.mo4680a(ExifInterface.f7804R);
        if (kazVarMo4680a3 != null) {
            float f7 = kazVarMo4680a3.f35504a;
            float f8 = kazVarMo4680a3.f35505b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            float f9 = f7 / f8;
            nit nitVar7 = (nit) nxlVarM18137O.f44974b;
            nitVar7.f42777a |= 64;
            nitVar7.f42783g = f9;
        }
        boolean z = (kegVar.mo4680a(ExifInterface.f7833aT) == null || kegVar.mo4680a(ExifInterface.f7835aV) == null) ? false : true;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nit nitVar8 = (nit) nxlVarM18137O.f44974b;
        nitVar8.f42777a |= 256;
        nitVar8.f42784h = z;
        Integer numMo4681b2 = kegVar.mo4681b(ExifInterface.f7901j);
        if (numMo4681b2 != null) {
            int iIntValue2 = numMo4681b2.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar9 = (nit) nxlVarM18137O.f44974b;
            nitVar9.f42777a |= 512;
            nitVar9.f42785i = iIntValue2;
        }
        Integer numMo4681b3 = kegVar.mo4681b(ExifInterface.f7849aj);
        if (numMo4681b3 != null) {
            int iIntValue3 = numMo4681b3.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar10 = (nit) nxlVarM18137O.f44974b;
            nitVar10.f42777a |= 1024;
            nitVar10.f42786j = iIntValue3;
        }
        Integer numMo4681b4 = kegVar.mo4681b(ExifInterface.f7848ai);
        if (numMo4681b4 != null) {
            int iIntValue4 = numMo4681b4.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar11 = (nit) nxlVarM18137O.f44974b;
            nitVar11.f42777a |= 2048;
            nitVar11.f42787k = iIntValue4;
        }
        Integer numMo4681b5 = kegVar.mo4681b(ExifInterface.f7811Y);
        if (numMo4681b5 != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar12 = (nit) nxlVarM18137O.f44974b;
            nitVar12.f42777a |= 4096;
            nitVar12.f42788l = true;
            int iIntValue5 = numMo4681b5.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar13 = (nit) nxlVarM18137O.f44974b;
            nitVar13.f42777a |= 8192;
            nitVar13.f42789m = iIntValue5;
        } else {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nit nitVar14 = (nit) nxlVarM18137O.f44974b;
            nitVar14.f42777a |= 4096;
            nitVar14.f42788l = false;
        }
        kaz kazVarMo4680a4 = kegVar.mo4680a(ExifInterface.f7806T);
        if (kazVarMo4680a4 != null) {
            float f10 = kazVarMo4680a4.f35504a;
            float f11 = kazVarMo4680a4.f35505b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            float f12 = f10 / f11;
            nit nitVar15 = (nit) nxlVarM18137O.f44974b;
            nitVar15.f42777a |= 16384;
            nitVar15.f42790n = f12;
        }
        kaz kazVarMo4680a5 = kegVar.mo4680a(ExifInterface.f7808V);
        if (kazVarMo4680a5 != null) {
            float f13 = kazVarMo4680a5.f35504a;
            float f14 = kazVarMo4680a5.f35505b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            float f15 = f13 / f14;
            nit nitVar16 = (nit) nxlVarM18137O.f44974b;
            nitVar16.f42777a |= 32768;
            nitVar16.f42791o = f15;
        }
        nit nitVar17 = (nit) nxlVarM18137O.mo18103l();
        nxl nxlVar = (nxl) obj;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nitVar17.getClass();
        nhyVar.f42606g = nitVar17;
        nhyVar.f42600a |= 32;
    }

    /* JADX INFO: renamed from: Q */
    public final void m2567Q(boolean z) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42600a |= 64;
        nhyVar.f42607h = z;
    }

    /* JADX INFO: renamed from: R */
    public final void m2568R(boolean z) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42601b |= 131072;
        nhyVar.f42589O = z;
    }

    /* JADX INFO: renamed from: S */
    public final void m2569S(nkk nkkVar) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42594T = nkkVar;
        nhyVar.f42601b |= 8388608;
    }

    /* JADX INFO: renamed from: T */
    public final void m2570T(float f) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42600a |= 16;
        nhyVar.f42605f = f;
    }

    /* JADX INFO: renamed from: U */
    public final void m2571U(nmi nmiVar) {
        if (nmiVar == null) {
            return;
        }
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42613n = nmiVar;
        nhyVar.f42600a |= 8192;
    }

    /* JADX INFO: renamed from: V */
    public final void m2572V(float f) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42600a |= 8;
        nhyVar.f42604e = f;
    }

    /* JADX INFO: renamed from: W */
    public final void m2573W(int i) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nhyVar.f42625z = i2;
        nhyVar.f42601b |= 2;
    }

    /* JADX INFO: renamed from: X */
    public final void m2574X(int i) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        nhyVar.f42609j = i - 1;
        nhyVar.f42600a |= 256;
    }

    /* JADX INFO: renamed from: Y */
    public final void m2575Y(int i) {
        nxl nxlVar = (nxl) this.f3651a;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhy nhyVar = (nhy) nxlVar.f44974b;
        nhy nhyVar2 = nhy.f42573Z;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nhyVar.f42585K = i2;
        nhyVar.f42601b |= 4096;
    }

    /* JADX INFO: renamed from: Z */
    public final C1058va m2576Z(fzd fzdVar) {
        return new C1058va((fvu) this.f3651a, new bkn(fzdVar), fzdVar, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final File m2577a() {
        File file = new File(((Context) ((AmbientMode.AmbientController) this.f3651a).f1697a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: aa */
    public final gtd m2578aa(ikw ikwVar) {
        gtd gtdVar = (gtd) ((EnumMap) this.f3651a).get(ikwVar);
        gtdVar.getClass();
        return gtdVar;
    }

    /* JADX INFO: renamed from: ab */
    public final bkn m2579ab() {
        return new bkn(((fzd) this.f3651a).f23960b, (byte[]) null);
    }

    /* JADX INFO: renamed from: ac */
    public final bkn m2580ac() {
        return new bkn(((fzd) this.f3651a).f23961c, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ad */
    public final synchronized kba m2581ad(bkn bknVar) {
        this.f3651a.add(bknVar);
        return new eip(this, bknVar, 8, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final File m2582b(String str, InputStream inputStream, bkm bkmVar) throws IOException {
        File file = new File(m2577a(), m2551c(str, bkmVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final void m2583d(bhy bhyVar) {
        this.f3651a.add(bhyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m2584e(Path path) {
        for (int size = this.f3651a.size() - 1; size >= 0; size--) {
            bhy bhyVar = (bhy) this.f3651a.get(size);
            ThreadLocal threadLocal = bme.f3752a;
            if (bhyVar != null && !bhyVar.f3392a) {
                bme.m2704d(path, ((big) bhyVar.f3393b).m2500k() / 100.0f, ((big) bhyVar.f3394c).m2500k() / 100.0f, ((big) bhyVar.f3395d).m2500k() / 360.0f);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final File m2585f() {
        return ((File[]) this.f3651a)[0];
    }

    /* JADX INFO: renamed from: g */
    public final void m2586g(Runnable runnable) {
        ((Handler) this.f3651a).removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: h */
    public final void m2587h(long j, Runnable runnable) {
        ((Handler) this.f3651a).postDelayed(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: i */
    public final void m2588i(aqc... aqcVarArr) {
        aqcVarArr.getClass();
        for (aqc aqcVar : aqcVarArr) {
            int i = aqcVar.f2109a;
            int i2 = aqcVar.f2110b;
            ?? r4 = this.f3651a;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = r4.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                r4.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            Integer numValueOf2 = Integer.valueOf(i2);
            if (treeMap2.containsKey(numValueOf2)) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + aqcVar);
            }
            treeMap2.put(numValueOf2, aqcVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public final alr m2589j(String str) {
        str.getClass();
        return (alr) this.f3651a.get(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: k */
    public final Set m2590k() {
        return new HashSet(this.f3651a.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: l */
    public final void m2591l() {
        for (alr alrVar : this.f3651a.values()) {
            alrVar.f663j = true;
            synchronized (alrVar.f661h) {
                Iterator it = alrVar.f661h.values().iterator();
                while (it.hasNext()) {
                    alr.m922g(it.next());
                }
            }
            synchronized (alrVar.f662i) {
                Iterator it2 = alrVar.f662i.iterator();
                while (it2.hasNext()) {
                    alr.m922g((Closeable) it2.next());
                }
            }
            alrVar.mo923d();
        }
        this.f3651a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: m */
    public final void m2592m() {
        for (int iM18667G = omn.m18667G(this.f3651a); iM18667G >= 0; iM18667G--) {
            ((ahv) ((ArrayList) this.f3651a).get(iM18667G)).m707a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2593n() {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2594o(float f) {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2595p(long j) {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2596q(aga agaVar) {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            if (agaVar != null) {
                view.animate().setListener(new afy(agaVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2597r(float f) {
        View view = (View) ((WeakReference) this.f3651a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Object m2598s(Object obj, Object obj2) {
        return ((LinkedHashMap) this.f3651a).put(obj, obj2);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2599t() {
        return ((LinkedHashMap) this.f3651a).isEmpty();
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC0953rd m2600u(String str) {
        return m2601v().m19473a(str);
    }

    /* JADX INFO: renamed from: v */
    public final C1058va m2601v() {
        try {
            Trace.beginSection("getCameraBackend");
            C1058va c1058vaM2185e = ((bbo) this.f3651a).m2185e();
            if (c1058vaM2185e != null) {
                Trace.endSection();
                return c1058vaM2185e;
            }
            throw new IllegalStateException("Failed to load CameraBackend " + ((Object) "CameraBackendId(value=CXCP-Camera2)"));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final C0111cq m2602w() {
        return ((C0086ce) this.f3651a).f5401e;
    }

    /* JADX INFO: renamed from: x */
    public final void m2603x() {
        ((C0086ce) this.f3651a).f5401e.m5300H();
    }

    /* JADX INFO: renamed from: y */
    public final void m2604y() {
        ((C0086ce) this.f3651a).f5401e.m5317ab(true);
    }

    public bkn(EditText editText) {
        this.f3651a = new bck(editText);
    }

    public bkn(kol kolVar) {
        this.f3651a = kolVar.m14624c("/gca/onecamera/frame_availability", koc.m14617b("framestream_id"));
    }

    public bkn(byte[] bArr, byte[] bArr2) {
        this.f3651a = new LinkedHashMap();
    }

    public bkn(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f3651a = new LinkedHashMap(0, 0.75f, true);
    }

    public bkn(int[] iArr) {
        this.f3651a = new AtomicInteger(0);
    }

    public bkn(ikw ikwVar) {
        if (ivs.f32330j != null) {
            this.f3651a = mws.m17097l(kgq.m14215e(ivs.f32330j, Integer.valueOf(ikwVar == ikw.IMAGE_INTENT ? 0 : 1)));
        } else {
            int i = mws.f41739d;
            this.f3651a = mzr.f41857a;
        }
    }

    public bkn(fvu fvuVar, byte[] bArr) {
        List listMo14566s = fvuVar.mo14566s();
        this.f3651a = listMo14566s;
        lku.m15613H(listMo14566s.contains(new kbc(0, 0)));
    }
}
