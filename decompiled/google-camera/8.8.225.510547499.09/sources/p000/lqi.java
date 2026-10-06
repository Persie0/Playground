package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.common.p019io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqi {

    /* JADX INFO: renamed from: a */
    public static volatile lqi f38964a;

    public lqi() {
    }

    public lqi(oju ojuVar) {
        ojuVar.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static boolean m15853A(String str) {
        return str.startsWith("video/");
    }

    /* JADX INFO: renamed from: B */
    public static final void m15854B(AmbientMode.AmbientController ambientController, bfd bfdVar, bfd bfdVar2, kxp kxpVar, OutputStream outputStream) throws IOException {
        ksh.m14807m((byte[]) ambientController.f1697a, outputStream, bfdVar, bfdVar2);
        try {
            long jCopy = ByteStreams.copy(kxpVar.f37668b, outputStream);
            if (jCopy != kxpVar.f37667a) {
                throw new IllegalStateException(String.format(Locale.US, "Bundled input stream claimed length of %d but had %d", Integer.valueOf(kxpVar.f37667a), Long.valueOf(jCopy)));
            }
            kxpVar.f37668b.close();
            outputStream.flush();
        } catch (Throwable th) {
            kxpVar.f37668b.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    private static Object m15855C(kxs... kxsVarArr) {
        for (kxs kxsVar : kxsVarArr) {
            Object objMo15036a = kxsVar.mo15036a();
            if (objMo15036a != null) {
                return objMo15036a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m15856a(nps npsVar) {
        npsVar.mo2282d(new lmg(npsVar, 8), not.INSTANCE);
    }

    /* JADX INFO: renamed from: b */
    public static String m15857b(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString(HEePJw.fRfqGH);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m15858c(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return m15857b(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(C0100R.id.dummy_placeholder))), j, i);
    }

    /* JADX INFO: renamed from: d */
    public static Object m15859d(Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final okb m15860e(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(omn.m18678R(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((lzc) it.next()).f39614a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            omn.m18677Q(arrayList2, ((lzc) it2.next()).f39615b);
        }
        return lkm.m15590q(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m15861f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: g */
    public static kzx m15862g(nps npsVar) {
        return new kzw(npsVar, 1);
    }

    /* JADX INFO: renamed from: h */
    public static kzx m15863h(Executor executor, Callable callable) {
        lav lavVarM15121j = lav.m15121j();
        try {
            executor.execute(new lae(lavVarM15121j, callable, 0));
        } catch (Exception e) {
            lavVarM15121j.m15131m(kzy.m15111a(e));
        }
        return lavVarM15121j;
    }

    /* JADX INFO: renamed from: i */
    public static kzx m15864i(Object obj) {
        return new kzw(obj, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static kzx m15865j(Iterable iterable) {
        return iterable.isEmpty() ? m15864i(Collections.emptyList()) : new laj(iterable).f37815a;
    }

    /* JADX INFO: renamed from: k */
    public static Object m15866k(kzx kzxVar) {
        Object objM15867l = m15867l(kzxVar);
        if (objM15867l != null) {
            return objM15867l;
        }
        throw new IllegalStateException("Attempting to get value of " + kzxVar.toString() + " which is not yet available!");
    }

    /* JADX INFO: renamed from: l */
    public static Object m15867l(kzx kzxVar) {
        if (kzxVar.mo15108g()) {
            return m15868m(kzxVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static Object m15868m(kzx kzxVar) {
        try {
            return m15869n(kzxVar);
        } catch (kzy e) {
            throw new nqn(e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Object m15869n(kzx kzxVar) {
        Object objMo15107f;
        boolean z = false;
        while (true) {
            try {
                objMo15107f = kzxVar.mo15107f();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objMo15107f;
    }

    /* JADX INFO: renamed from: o */
    public static kzr m15870o() {
        lku.m15670x(true, "maxPendingEventCount must be > 0");
        return new kzr();
    }

    /* JADX INFO: renamed from: p */
    public static kzg m15871p(int i) {
        return new kzg(new ArrayList(i));
    }

    /* JADX INFO: renamed from: q */
    public static kyz m15872q(Throwable th) {
        return new lac(th, 1);
    }

    /* JADX INFO: renamed from: r */
    public static kyz m15873r(Object obj) {
        return new kzc(obj, 1);
    }

    /* JADX INFO: renamed from: s */
    public static kyz m15874s(Throwable th) {
        return new kzc(th, 0);
    }

    /* JADX INFO: renamed from: t */
    public static kzk m15875t() {
        return new kzb();
    }

    /* JADX INFO: renamed from: u */
    public static int m15876u(bfd bfdVar) {
        return ((Integer) m15855C(new kxq(bfdVar, 2), new kxq(bfdVar, 1), kxr.f37672b)).intValue();
    }

    /* JADX INFO: renamed from: v */
    public static int m15877v(bfd bfdVar) throws bfc {
        int iM2334a;
        boolean z = true;
        if (m15876u(bfdVar) == 1) {
            return ((Integer) m15855C(new kxq(bfdVar, 0), kxr.f37671a)).intValue();
        }
        if (m15876u(bfdVar) == 1) {
            throw new bfc("V1 format does not have a container", 5);
        }
        C0168et.m7842k("http://ns.google.com/photos/1.0/container/");
        C0168et.m7839h("Directory");
        bfu bfuVarM6485A = C0137dp.m6485A(((bfr) bfdVar).f3126a, C0137dp.m6526w("http://ns.google.com/photos/1.0/container/", "Directory"), false, null);
        if (bfuVarM6485A == null) {
            iM2334a = 0;
        } else {
            if (!bfuVarM6485A.m2340g().m2389d()) {
                throw new bfc("The named property is not an array", 102);
            }
            iM2334a = bfuVarM6485A.m2334a();
        }
        lhz lhzVar = new lhz((char[]) null);
        for (int i = 1; i <= iM2334a; i++) {
            String strM2259b = bdy.m2259b("Directory", i);
            String strM15076d = kyv.m15076d(bfdVar, strM2259b, "Mime");
            kyv.m15077e(strM15076d, "Mime");
            String strM15076d2 = kyv.m15076d(bfdVar, strM2259b, "Semantic");
            kyv.m15077e(strM15076d2, "Semantic");
            Object objM15075c = kyv.m15075c(kyv.m15076d(bfdVar, strM2259b, "Length"));
            Object objM15075c2 = kyv.m15075c(kyv.m15076d(bfdVar, strM2259b, "Padding"));
            kyu kyuVarM15073a = kyv.m15073a();
            kyuVarM15073a.f37742a = strM15076d;
            kyuVarM15073a.f37743b = strM15076d2;
            kyuVarM15073a.m15066b(Integer.parseInt((String) objM15075c));
            kyuVarM15073a.m15067c(Integer.parseInt((String) objM15075c2));
            lhzVar.m15367h(kyuVarM15073a.m15065a());
        }
        int i2 = 0;
        for (kyv kyvVar : lhzVar.m15366g()) {
            if (z) {
                m15879x(kyvVar);
                i2 += kyvVar.f37750d;
                z = false;
            } else {
                m15880y(kyvVar);
                i2 += kyvVar.f37749c + kyvVar.f37750d;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: w */
    public static Object m15878w(String str) throws bfc {
        throw new bfc("Property value missing for ".concat(str), 5);
    }

    /* JADX INFO: renamed from: x */
    public static String m15879x(kyv kyvVar) {
        String str;
        if (kyvVar.f37748b.contentEquals("Primary")) {
            str = "";
        } else {
            Log.w("MVXmpMetadata", "Badly formatted file. First container item is not primary");
            str = "First container item must be primary.\n";
        }
        int i = kyvVar.f37749c;
        if (i <= 0) {
            return str;
        }
        String strConcat = str.concat("First container item must have length of 0.\n");
        Log.w("MVXmpMetadata", "First container length expected to be 0. Found: " + i);
        return strConcat;
    }

    /* JADX INFO: renamed from: y */
    public static String m15880y(kyv kyvVar) {
        String str;
        if (kyvVar.f37748b.contentEquals("Primary")) {
            Log.w("MVXmpMetadata", "Badly formatted file. Only first container item should be primary");
            str = "Secondary container items must not be primary.\n";
        } else {
            str = "";
        }
        if (kyvVar.f37750d <= 0) {
            return str;
        }
        String strConcat = str.concat("Secondary container items must have 0 padding.\n");
        Log.w("MVXmpMetadata", "Badly formatted file. Only primary container items may have padding.");
        return strConcat;
    }
}
