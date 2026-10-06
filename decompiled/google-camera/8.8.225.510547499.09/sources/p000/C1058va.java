package p000;

import android.content.Context;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1058va {

    /* JADX INFO: renamed from: d */
    public static C1058va f47801d;

    /* JADX INFO: renamed from: a */
    public final Object f47802a;

    /* JADX INFO: renamed from: b */
    public final Object f47803b;

    /* JADX INFO: renamed from: c */
    public final Object f47804c;

    public C1058va() {
        this.f47804c = new Object();
        this.f47803b = new LinkedHashMap();
        this.f47802a = new LinkedHashSet();
    }

    public C1058va(Context context, LocationManager locationManager) {
        this.f47802a = new C0188fm();
        this.f47804c = context;
        this.f47803b = locationManager;
    }

    public C1058va(Context context, jvd jvdVar, cej cejVar) {
        this.f47803b = context;
        this.f47804c = jvdVar;
        this.f47802a = cejVar;
    }

    public C1058va(Context context, jww jwwVar, fcp fcpVar, dhv dhvVar) {
        this.f47803b = context;
        this.f47802a = jwwVar;
        this.f47804c = fcpVar;
        if (((Boolean) jwwVar.mo3831be()).booleanValue()) {
            return;
        }
        dhx dhxVar = dhs.f11163a;
        dhvVar.mo6177e();
        m19461B(context);
    }

    public C1058va(Context context, ksi ksiVar, oju ojuVar) {
        this.f47802a = context;
        this.f47803b = ksiVar;
        this.f47804c = ojuVar;
    }

    public C1058va(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f47802a = pointF;
        this.f47803b = pointF2;
        this.f47804c = pointF3;
    }

    public C1058va(bkn bknVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f47802a = bknVar;
        this.f47803b = new Object();
        this.f47804c = new HashMap();
    }

    public C1058va(bqf bqfVar, Object obj, bqr bqrVar) {
        this.f47802a = bqfVar;
        this.f47804c = obj;
        this.f47803b = bqrVar;
    }

    public C1058va(bqn bqnVar, bra braVar) {
        List listEmptyList = Collections.emptyList();
        bzq.m3278r(bqnVar);
        this.f47803b = bqnVar;
        bzq.m3278r(listEmptyList);
        this.f47804c = listEmptyList;
        bzq.m3278r(braVar);
        this.f47802a = braVar;
    }

    public C1058va(DLEngineApi dLEngineApi, Context context, String str) {
        this.f47803b = dLEngineApi;
        this.f47802a = context;
        this.f47804c = str;
    }

    public C1058va(dbr dbrVar, jvd jvdVar, jwn jwnVar) {
        this.f47802a = dbrVar;
        this.f47804c = jvdVar;
        this.f47803b = jwnVar;
    }

    public C1058va(eat eatVar, kbc kbcVar) {
        this.f47804c = new AtomicInteger(0);
        this.f47802a = eatVar;
        this.f47803b = kbcVar;
    }

    public C1058va(ero eroVar, fan fanVar, exg exgVar, cdu cduVar, byte[] bArr) {
        fanVar.getClass();
        exgVar.getClass();
        cduVar.getClass();
        this.f47803b = eroVar;
        this.f47804c = fanVar;
        this.f47802a = cduVar;
    }

    public C1058va(esz eszVar, esr esrVar, esw eswVar) {
        this.f47802a = eszVar;
        this.f47803b = esrVar;
        this.f47804c = eswVar;
    }

    public C1058va(esz eszVar, esr esrVar, esw eswVar, byte[] bArr) {
        this.f47804c = eszVar;
        this.f47802a = esrVar;
        this.f47803b = eswVar;
    }

    public C1058va(fcy fcyVar, Long l, Integer num) {
        this.f47803b = fcyVar;
        this.f47802a = l;
        this.f47804c = num;
    }

    public C1058va(fvu fvuVar, bkn bknVar, fzd fzdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f47802a = fvuVar;
        this.f47804c = bknVar;
        this.f47803b = fzdVar;
    }

    public C1058va(Class cls, Class cls2, bvm bvmVar) {
        this.f47804c = cls;
        this.f47802a = cls2;
        this.f47803b = bvmVar;
    }

    public C1058va(Class cls, Class cls2, bys bysVar) {
        this.f47802a = cls;
        this.f47804c = cls2;
        this.f47803b = bysVar;
    }

    public C1058va(Object obj, Object obj2, Object obj3) {
        this.f47802a = obj;
        this.f47803b = obj2;
        this.f47804c = obj3;
    }

    public C1058va(String str, String str2, String str3) {
        this.f47802a = str;
        this.f47803b = str2;
        this.f47804c = str3;
    }

    public C1058va(Method method, Method method2, Method method3) {
        this.f47803b = method;
        this.f47802a = method2;
        this.f47804c = method3;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    public C1058va(List list, byte[] bArr) {
        List<ltc> listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        this.f47803b = new HashMap();
        this.f47804c = new HashMap();
        this.f47802a = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lsx lsxVar = (lsx) it.next();
            if (TextUtils.isEmpty(lsxVar.mo15937e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                lsx lsxVar2 = (lsx) this.f47803b.put(lsxVar.mo15937e(), lsxVar);
                if (lsxVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + lsxVar2.getClass().getCanonicalName() + " with " + lsxVar.getClass().getCanonicalName());
                }
            }
        }
        for (ltc ltcVar : listEmptyList) {
            if (TextUtils.isEmpty(ltcVar.m15958a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                ltc ltcVar2 = (ltc) this.f47804c.put(ltcVar.m15958a(), ltcVar);
                if (ltcVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + ltcVar2.getClass().getCanonicalName() + " with " + ltcVar.getClass().getCanonicalName());
                }
            }
        }
        this.f47802a.addAll(listEmptyList2);
    }

    public C1058va(kqj kqjVar, dhv dhvVar, dzr dzrVar, byte[] bArr, byte[] bArr2) {
        this.f47803b = kqjVar;
        this.f47802a = dhvVar;
        this.f47804c = dzrVar;
    }

    public C1058va(kyt kytVar, kyt kytVar2, kyt kytVar3) {
        this.f47804c = kytVar;
        this.f47802a = kytVar2;
        this.f47803b = kytVar3;
    }

    public C1058va(lex lexVar, lew lewVar, fhv fhvVar) {
        this.f47804c = lexVar;
        this.f47803b = lewVar;
        this.f47802a = fhvVar;
    }

    public C1058va(nsz nszVar, cem cemVar, kbz kbzVar) {
        this.f47802a = nszVar;
        this.f47803b = cemVar;
        this.f47804c = kbzVar;
    }

    public C1058va(oju ojuVar, oju ojuVar2, mrm mrmVar) {
        this.f47803b = ojuVar;
        this.f47804c = ojuVar2;
        this.f47802a = mrmVar;
    }

    public C1058va(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        ojuVar.getClass();
        this.f47803b = ojuVar;
        ojuVar2.getClass();
        this.f47804c = ojuVar2;
        ojuVar3.getClass();
        this.f47802a = ojuVar3;
    }

    public C1058va(C0948qz c0948qz, InterfaceC1082vy interfaceC1082vy, InterfaceC0978sb interfaceC0978sb) {
        this.f47802a = c0948qz;
        this.f47803b = interfaceC1082vy;
        this.f47804c = interfaceC0978sb;
    }

    public C1058va(C1153yo c1153yo) {
        this.f47802a = new ArrayList();
        this.f47804c = new C1160yv();
        this.f47803b = c1153yo;
    }

    /* JADX INFO: renamed from: B */
    public static void m19461B(Context context) {
        new File(String.valueOf(String.valueOf(context.getNoBackupFilesDir())).concat("/ff.pb")).delete();
        File file = new File(String.valueOf(String.valueOf(context.getNoBackupFilesDir())).concat("/ff.pb_tmp"));
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: L */
    private final fzr m19462L(long j) {
        synchronized (this.f47803b) {
            ?? r1 = this.f47804c;
            Long lValueOf = Long.valueOf(j);
            if (!r1.containsKey(lValueOf)) {
                return new fzr();
            }
            fzr fzrVar = (fzr) this.f47804c.get(lValueOf);
            fzrVar.getClass();
            return fzrVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: A */
    public final void m19463A(Runnable runnable, jvb jvbVar) {
        jvbVar.m13537d(this.f47803b.mo3830a(new enr(this, runnable, null, null, null, null), this.f47804c));
    }

    /* JADX INFO: renamed from: C */
    public final synchronized AmbientModeSupport.AmbientController m19464C() {
        byte[] bArr;
        if (((AtomicInteger) this.f47804c).getAndIncrement() == 0) {
            Object obj = this.f47803b;
            ((eat) this.f47802a).m7021f(new kbc(((kbc) obj).f35517a, ((kbc) obj).f35518b), "mv-gyro-session");
        }
        bArr = null;
        return new AmbientModeSupport.AmbientController(this, bArr, bArr, bArr);
    }

    /* JADX INFO: renamed from: D */
    public final IllegalArgumentException m19465D() {
        StringBuilder sb = new StringBuilder();
        sb.append("Multiple entries with same key: ");
        sb.append(this.f47802a);
        String str = HRLmc.OWPeZVVdrin;
        sb.append(str);
        sb.append(this.f47803b);
        sb.append(" and ");
        sb.append(this.f47802a);
        sb.append(str);
        sb.append(this.f47804c);
        return new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: E */
    public final Object m19466E(Uri uri, lsa lsaVar) {
        return lsaVar.mo15928a(m19471J(uri));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lsx] */
    /* JADX INFO: renamed from: F */
    public final void m19467F(Uri uri, Uri uri2) throws lsl {
        lie lieVarM19471J = m19471J(uri);
        lie lieVarM19471J2 = m19471J(uri2);
        ?? r0 = lieVarM19471J.f38295b;
        if (r0 != lieVarM19471J2.f38295b) {
            throw new lsl("Cannot rename file across backends");
        }
        r0.mo15945l((Uri) lieVarM19471J.f38294a, (Uri) lieVarM19471J2.f38294a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lsx] */
    /* JADX INFO: renamed from: G */
    public final boolean m19468G(Uri uri) throws lsl {
        lie lieVarM19471J = m19471J(uri);
        return lieVarM19471J.f38295b.mo15938f((Uri) lieVarM19471J.f38294a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX INFO: renamed from: H */
    public final long m19469H() {
        try {
            return this.f47803b.getHostApiVersion();
        } catch (Throwable th) {
            return ApiVersion.ORIGINAL.getVersionCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: I */
    public final void m19470I(XmlSerializer xmlSerializer, lpe lpeVar) throws IOException {
        xmlSerializer.startTag("", "node");
        ((lul) this.f47802a).m16011e(xmlSerializer, lpeVar);
        Iterator it = this.f47804c.iterator();
        while (it.hasNext()) {
            ((C1058va) it.next()).m19470I(xmlSerializer, lpeVar);
        }
        Iterator it2 = this.f47803b.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        xmlSerializer.endTag("", "node");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: J */
    public final lie m19471J(Uri uri) throws lsl {
        mwn mwnVarM17090e = mws.m17090e();
        Pattern pattern = lsq.f39139a;
        mwn mwnVarM17090e2 = mws.m17090e();
        String encodedFragment = uri.getEncodedFragment();
        mws mwsVarM17094i = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? mzr.f41857a : mws.m17094i(msa.m16847c("+").m16848a().m16849d(encodedFragment.substring(10)));
        int size = mwsVarM17094i.size();
        for (int i = 0; i < size; i++) {
            String str = (String) mwsVarM17094i.get(i);
            Matcher matcher = lsq.f39139a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            mwnVarM17090e2.m17082g(matcher.group(1));
        }
        mws mwsVarM17081f = mwnVarM17090e2.m17081f();
        int i2 = ((mzr) mwsVarM17081f).f41859c;
        for (int i3 = 0; i3 < i2; i3++) {
            String str2 = (String) mwsVarM17081f.get(i3);
            ltc ltcVar = (ltc) this.f47804c.get(str2);
            if (ltcVar == null) {
                throw new lsl("No such transform: " + str2 + ": " + String.valueOf(uri));
            }
            mwnVarM17090e.m17082g(ltcVar);
        }
        mws mwsVarMo17088a = mwnVarM17090e.m17081f().mo17088a();
        lrz lrzVar = new lrz();
        String scheme = uri.getScheme();
        lsx lsxVar = (lsx) this.f47803b.get(scheme);
        if (lsxVar == null) {
            throw new lsl(String.format("Cannot open, unregistered backend: %s", scheme));
        }
        lrzVar.f39110a = lsxVar;
        lrzVar.f39112c = this.f47802a;
        lrzVar.f39111b = mwsVarMo17088a;
        if (!mwsVarMo17088a.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strM15959b = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = mwsVarMo17088a.listIterator(mwsVarMo17088a.size());
                while (listIterator.hasPrevious()) {
                    strM15959b = ((ltc) listIterator.previous()).m15959b();
                }
                arrayList.set(arrayList.size() - 1, strM15959b);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        lrzVar.f39113d = uri;
        return new lie(lrzVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: K */
    public final C1058va m19472K() {
        C1058va c1058va = new C1058va((short[]) null);
        this.f47804c.add(c1058va);
        return c1058va;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0953rd m19473a(String str) {
        return ((C1011th) this.f47804c).m19447a(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final AutoCloseable m19474b(Surface surface) {
        List listM18673M;
        C0961rl c0961rl;
        surface.getClass();
        if (!surface.isValid()) {
            throw new IllegalStateException("Surface " + surface + " isn't valid!");
        }
        synchronized (this.f47804c) {
            Integer num = (Integer) this.f47803b.get(surface);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.f47803b.put(surface, Integer.valueOf(iIntValue));
            if (iIntValue == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Surface ");
                sb.append(surface);
                sb.append(WIxTIdUIdfb.PTljiSBJX);
                listM18673M = omn.m18673M(this.f47802a);
            } else {
                listM18673M = null;
            }
            c0961rl = new C0961rl(this, surface, null);
        }
        if (listM18673M != null) {
            Iterator it = listM18673M.iterator();
            while (it.hasNext()) {
                ((InterfaceC0960rk) it.next()).m19378a();
            }
        }
        return c0961rl;
    }

    /* JADX INFO: renamed from: c */
    public final Location m19475c(String str) {
        try {
            if (((LocationManager) this.f47803b).isProviderEnabled(str)) {
                return ((LocationManager) this.f47803b).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m19476d() {
        String string = ((UUID) this.f47803b).toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: e */
    public final void m19477e(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.f47802a).iterator();
        while (it.hasNext()) {
            ((C0111cq) ((AmbientMode.AmbientController) it.next()).f1697a).m5308P(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19478f(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f47802a).iterator();
        while (it.hasNext()) {
            ((C0111cq) ((AmbientMode.AmbientController) it.next()).f1697a).m5310R(menu);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19479g(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.f47802a).iterator();
        while (it.hasNext()) {
            if (((C0111cq) ((AmbientMode.AmbientController) it.next()).f1697a).m5309Q(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m19480h(C1153yo c1153yo) {
        ((ArrayList) this.f47802a).clear();
        int size = c1153yo.f48284aK.size();
        for (int i = 0; i < size; i++) {
            C1152yn c1152yn = (C1152yn) c1153yo.f48284aK.get(i);
            if (c1152yn.m19680O() == 3 || c1152yn.m19681P() == 3) {
                ((ArrayList) this.f47802a).add(c1152yn);
            }
        }
        c1153yo.m19710U();
    }

    /* JADX INFO: renamed from: i */
    public final void m19481i(C1153yo c1153yo, int i, int i2, int i3) {
        long jNanoTime = c1153yo.f48274d != null ? System.nanoTime() : 0L;
        int i4 = c1153yo.f48215ad;
        int i5 = c1153yo.f48216ae;
        c1153yo.m19670E(0);
        c1153yo.m19669D(0);
        c1153yo.m19671F(i2);
        c1153yo.m19666A(i3);
        c1153yo.m19670E(i4);
        c1153yo.m19669D(i5);
        Object obj = this.f47803b;
        ((C1153yo) obj).f48272b = i;
        ((C1159yu) obj).mo19711V();
        if (c1153yo.f48274d != null) {
            long jNanoTime2 = System.nanoTime();
            C1142yd c1142yd = c1153yo.f48274d;
            c1142yd.f48089I++;
            c1142yd.f48092b += jNanoTime2 - jNanoTime;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19482j(C1179zn c1179zn, C1152yn c1152yn, int i) {
        ((C1160yv) this.f47804c).f48293i = c1152yn.m19680O();
        ((C1160yv) this.f47804c).f48294j = c1152yn.m19681P();
        ((C1160yv) this.f47804c).f48285a = c1152yn.m19689j();
        ((C1160yv) this.f47804c).f48286b = c1152yn.m19687h();
        C1160yv c1160yv = (C1160yv) this.f47804c;
        c1160yv.f48291g = false;
        c1160yv.f48292h = i;
        int i2 = c1160yv.f48293i;
        int i3 = c1160yv.f48294j;
        boolean z = i2 == 3 && c1152yn.f48209Y > 0.0f;
        boolean z2 = i3 == 3 && c1152yn.f48209Y > 0.0f;
        if (z && c1152yn.f48248v[0] == 4) {
            c1160yv.f48293i = 1;
        }
        if (z2 && c1152yn.f48248v[1] == 4) {
            c1160yv.f48294j = 1;
        }
        c1179zn.m19799a(c1152yn, c1160yv);
        c1152yn.m19671F(((C1160yv) this.f47804c).f48287c);
        c1152yn.m19666A(((C1160yv) this.f47804c).f48288d);
        C1160yv c1160yv2 = (C1160yv) this.f47804c;
        c1152yn.f48191G = c1160yv2.f48290f;
        c1152yn.m19703x(c1160yv2.f48289e);
        C1160yv c1160yv3 = (C1160yv) this.f47804c;
        c1160yv3.f48292h = 0;
        return c1160yv3.f48291g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m19483k(Class cls, Class cls2) {
        return ((Class) this.f47802a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.f47804c);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m19484l(Class cls) {
        return ((Class) this.f47804c).isAssignableFrom(cls);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: m */
    public final gbi m19485m(Set set, gbi gbiVar) {
        if (!((mrm) this.f47802a).mo16813g()) {
            drj drjVarM9372b = ((gkq) this.f47803b).get();
            gof gofVar = (gof) drjVarM9372b.f12399e.get();
            gofVar.getClass();
            gks gksVarM9386a = ((gkt) drjVarM9372b.f12395a).get();
            kbz kbzVar = (kbz) drjVarM9372b.f12396b.get();
            kbzVar.getClass();
            gir girVar = (gir) drjVarM9372b.f12398d.get();
            girVar.getClass();
            mrm mrmVar = (mrm) drjVarM9372b.f12397c.get();
            mrmVar.getClass();
            set.getClass();
            gbiVar.getClass();
            return new gkp(gofVar, gksVarM9386a, kbzVar, girVar, mrmVar, set, gbiVar);
        }
        ljf ljfVarM9391b = ((gkw) this.f47804c).get();
        set.getClass();
        gbiVar.getClass();
        mrm mrmVar2 = (mrm) ljfVarM9391b.f38371c.get();
        mrmVar2.getClass();
        ecq ecqVar = (ecq) ljfVarM9391b.f38374f.get();
        ecqVar.getClass();
        eci eciVar = (eci) ljfVarM9391b.f38370b.get();
        eciVar.getClass();
        gks gksVarM9386a2 = ((gkt) ljfVarM9391b.f38373e).get();
        gkz gkzVarM7067b = ((ebo) ljfVarM9391b.f38375g).get();
        gva gvaVar = (gva) ljfVarM9391b.f38372d.get();
        gvaVar.getClass();
        kbz kbzVar2 = (kbz) ljfVarM9391b.f38369a.get();
        kbzVar2.getClass();
        return new gkv(set, gbiVar, mrmVar2, ecqVar, eciVar, gksVarM9386a2, gkzVarM7067b, gvaVar, kbzVar2, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: n */
    public final gja m19486n(long j, int i, msi msiVar) {
        kqj kqjVarM9320b = ((gjc) this.f47803b).get();
        hee heeVarM9323b = ((gjg) this.f47804c).get();
        jvb jvbVar = (jvb) this.f47802a.get();
        jvbVar.getClass();
        msiVar.getClass();
        return new gja(kqjVarM9320b, heeVarM9323b, jvbVar, j, i, msiVar, null, null, null, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m19487o(kpw kpwVar) {
        synchronized (this.f47803b) {
            long jMo7248d = kpwVar.mo7248d();
            fzr fzrVarM19462L = m19462L(jMo7248d);
            Map map = fzrVarM19462L.f23990b;
            Long lValueOf = Long.valueOf(jMo7248d);
            lku.m15614I(!map.containsKey(lValueOf), "Image already added");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gaa.m8990b(kpwVar);
                fzrVarM19462L.f23990b.put(lValueOf, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m19488p(long j) {
        synchronized (this.f47803b) {
            fzr fzrVarM19462L = m19462L(j);
            lku.m15614I(!fzrVarM19462L.f23994f.mo16813g(), "Base frame already selected!");
            fzrVarM19462L.f23994f = mrm.m16829i(Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19489q(long j, nps npsVar) {
        synchronized (this.f47803b) {
            m19462L(j).f23991c.put(Long.valueOf(j), npsVar);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m19490r(kpw kpwVar) {
        synchronized (this.f47803b) {
            long jMo7248d = kpwVar.mo7248d();
            fzr fzrVarM19462L = m19462L(jMo7248d);
            Map map = fzrVarM19462L.f23989a;
            Long lValueOf = Long.valueOf(jMo7248d);
            lku.m15614I(!map.containsKey(lValueOf), "Image already added");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gaa.m8990b(kpwVar);
                fzrVarM19462L.f23989a.put(lValueOf, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final eip m19491s(String str) {
        lku.m15669w(!str.isEmpty());
        return new eip(this, new fzr(), 16, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m19492t() {
        return m19496x(Integer.class, CaptureResult.EDGE_MODE, 0, mxk.m17138J(1, 2, 3), mxk.m17136H(2));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m19493u() {
        return !((bkn) this.f47804c).m2579ab().m2563M(CaptureResult.FLASH_STATE, 3, 4);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m19494v() {
        return ((fzd) this.f47803b).f23960b.size() == 1;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m19495w() {
        return m19496x(Integer.class, CaptureResult.NOISE_REDUCTION_MODE, 0, mxk.m17138J(2, 1, 4), mxk.m17136H(2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: x */
    public final boolean m19496x(Class cls, CaptureResult.Key key, Object obj, Set set, Set set2) {
        bkn bknVar = (bkn) this.f47804c;
        boolean z = !(bknVar.m2580ac().f3651a.size() == 0);
        return (!z && bknVar.m2579ab().m2563M(key, mkv.m16520ab(set, cls))) || (z && bknVar.m2579ab().m2562L(key, obj) && bknVar.m2580ac().m2563M(key, mkv.m16520ab(set2, cls))) || (z && bknVar.m2579ab().m2563M(key, mkv.m16520ab(set, cls)) && bknVar.m2580ac().m2562L(key, obj));
    }

    /* JADX INFO: renamed from: y */
    public final boolean m19497y(fzf... fzfVarArr) {
        return Arrays.asList(fzfVarArr).contains(((fzd) this.f47803b).f23959a);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m19498z(Integer... numArr) {
        return Arrays.asList(numArr).contains(((kmr) this.f47802a).mo14559l(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }

    public C1058va(Runnable runnable) {
        this.f47802a = new CopyOnWriteArrayList();
        this.f47804c = new HashMap();
        this.f47803b = runnable;
    }

    public C1058va(oju ojuVar, oju ojuVar2, oju ojuVar3, byte[] bArr) {
        ojuVar.getClass();
        this.f47803b = ojuVar;
        ojuVar2.getClass();
        this.f47804c = ojuVar2;
        ojuVar3.getClass();
        this.f47802a = ojuVar3;
    }

    public C1058va(drj drjVar, C1009tf c1009tf, C1011th c1011th, drj drjVar2, C1071vn c1071vn, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        drjVar.getClass();
        c1009tf.getClass();
        c1011th.getClass();
        drjVar2.getClass();
        this.f47802a = c1009tf;
        this.f47804c = c1011th;
        this.f47803b = c1071vn;
    }

    public C1058va(ayj ayjVar) {
        this(ayjVar.f2721a, ayjVar.f2722b, ayjVar.f2723c);
    }

    public C1058va(UUID uuid, bcv bcvVar, Set set) {
        uuid.getClass();
        bcvVar.getClass();
        this.f47803b = uuid;
        this.f47804c = bcvVar;
        this.f47802a = set;
    }

    public C1058va(Executor executor) {
        this.f47804c = new Handler(Looper.getMainLooper());
        this.f47803b = new bex(this, null);
        this.f47802a = new beb(executor, 0);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public C1058va(List list) {
        this.f47803b = list;
        this.f47802a = new ArrayList(list.size());
        this.f47804c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f47802a.add(((bjh) ((jho) list.get(i)).f34087c).mo2524a());
            this.f47804c.add(((bjd) ((jho) list.get(i)).f34088d).mo2524a());
        }
    }

    public C1058va(byte[] bArr) {
        this.f47802a = new PointF();
        this.f47803b = new PointF();
        this.f47804c = new PointF();
    }

    public C1058va(short[] sArr) {
        this.f47802a = new lul();
        this.f47804c = new ArrayList();
        this.f47803b = new ArrayList();
    }

    public C1058va(mav mavVar, mrm mrmVar) {
        mavVar.getClass();
        this.f47802a = mavVar;
        this.f47803b = mrmVar;
        this.f47804c = ncg.m17328i();
    }
}
