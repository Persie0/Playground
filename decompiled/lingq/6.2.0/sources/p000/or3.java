package p000;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Magnifier;
import android.widget.Toast;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.navigation.p005ui.R$anim;
import androidx.navigation.p005ui.R$animator;
import coil.C0855a;
import coil.decode.DataSource;
import coil.disk.C0860a;
import coil.intercept.C0863b;
import coil.memory.MemoryCache$Key;
import coil.size.Scale;
import com.android.installreferrer.api.C0918b;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C1127b;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.lingq.feature.library.R$id;
import com.lingq.feature.onboarding.auth.login.C2177b;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import com.lingq.p020ui.HomeFragment;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class or3 implements InstallReferrerStateListener, ub4, fw5, my2, psa, ma1, su2, h73, ym9, ao9 {

    /* JADX INFO: renamed from: a */
    public Object f54782a;

    public or3(int i) {
        switch (i) {
            case 16:
                this.f54782a = new tk5((Object) null);
                break;
            case 21:
                this.f54782a = new LinkedHashSet();
                break;
            case 28:
                this.f54782a = new a3d();
                break;
            default:
                this.f54782a = new ArrayList(20);
                break;
        }
    }

    /* JADX INFO: renamed from: J */
    public static hn9 m18288J(C0863b c0863b, e04 e04Var, MemoryCache$Key memoryCache$Key, bw5 bw5Var) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(e04Var.f36502a.getResources(), bw5Var.f9094a);
        DataSource dataSource = DataSource.MEMORY_CACHE;
        Map map = bw5Var.f9095b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
        if ((c0863b instanceof C0863b) && c0863b.f10563g) {
            z = true;
        }
        return new hn9(bitmapDrawable, e04Var, dataSource, memoryCache$Key, str, zBooleanValue, z);
    }

    /* JADX INFO: renamed from: P */
    public static ku4 m18289P(or3 or3Var, int i) {
        C0127b c0127b = (C0127b) or3Var.f54782a;
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            hv4 hv4Var = (hv4) ((xc9) c0127b.f2441f).getValue();
            return c0127b.f2452q.m16545a(i, hv4Var.f42984j, c0127b.f2439d, new tf4(i, hv4Var));
        } finally {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized wj4 m18290A(ai4 ai4Var, OutputPrefixType outputPrefixType) {
        int iM22236a;
        synchronized (this) {
            iM22236a = tma.m22236a();
            while (m18295G(iM22236a)) {
                iM22236a = tma.m22236a();
            }
        }
        return (wj4) vj4VarM24010E.m22171a();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        vj4 vj4VarM24010E = wj4.m24010E();
        vj4VarM24010E.m22174d();
        wj4.m24011v((wj4) vj4VarM24010E.f62440b, ai4Var);
        vj4VarM24010E.m22174d();
        wj4.m24014y((wj4) vj4VarM24010E.f62440b, iM22236a);
        KeyStatusType keyStatusType = KeyStatusType.ENABLED;
        vj4VarM24010E.m22174d();
        wj4.m24013x((wj4) vj4VarM24010E.f62440b, keyStatusType);
        vj4VarM24010E.m22174d();
        wj4.m24012w((wj4) vj4VarM24010E.f62440b, outputPrefixType);
        return (wj4) vj4VarM24010E.m22171a();
    }

    /* JADX INFO: renamed from: B */
    public String m18291B(String str) {
        str.getClass();
        ArrayList arrayList = (ArrayList) this.f54782a;
        int size = arrayList.size() - 2;
        int iM23507r = AbstractC3695vr.m23507r(size, 0, -2);
        if (iM23507r > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iM23507r) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[PHI: r16 r18
      0x0140: PHI (r16v1 bw5) = (r16v0 bw5), (r16v0 bw5), (r16v2 bw5) binds: [B:89:0x013d, B:84:0x0131, B:77:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r18v2 double) = (r18v1 double), (r18v1 double), (r18v3 double) binds: [B:89:0x013d, B:84:0x0131, B:77:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x014e A[PHI: r16
      0x014e: PHI (r16v3 bw5) = (r16v1 bw5), (r16v1 bw5), (r16v5 bw5) binds: [B:98:0x014c, B:94:0x0145, B:53:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: C */
    public bw5 m18292C(e04 e04Var, MemoryCache$Key memoryCache$Key, w89 w89Var, Scale scale) {
        bw5 bw5VarMo12106i;
        double d;
        bw5 bw5Var;
        boolean zEquals;
        bw5 bw5Var2;
        if (e04Var.f36515n.getReadEnabled()) {
            m18 m18Var = (m18) ((C0855a) this.f54782a).f10406c.getValue();
            if (m18Var == null) {
                bw5VarMo12106i = null;
            } else {
                bw5VarMo12106i = m18Var.f50436a.mo12106i(memoryCache$Key);
                if (bw5VarMo12106i == null) {
                    C3126ix c3126ix = m18Var.f50437b;
                    synchronized (c3126ix) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) c3126ix.f44721c).get(memoryCache$Key);
                            if (arrayList == null) {
                                bw5VarMo12106i = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        bw5Var2 = null;
                                        break;
                                    }
                                    u18 u18Var = (u18) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) u18Var.f63249b.get();
                                    bw5Var2 = bitmap != null ? new bw5(bitmap, u18Var.f63250c) : null;
                                    if (bw5Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                int i2 = c3126ix.f44720b;
                                c3126ix.f44720b = i2 + 1;
                                if (i2 >= 10) {
                                    c3126ix.m14169d();
                                }
                                bw5VarMo12106i = bw5Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (bw5VarMo12106i != null) {
                Bitmap bitmap2 = bw5VarMo12106i.f9094a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (fs6.m12083B(e04Var, config)) {
                    Object obj = bw5VarMo12106i.f9095b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (fa4.m11650l(w89Var, w89.f66530c)) {
                        bw5Var = null;
                        if (zBooleanValue) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        String str = (String) memoryCache$Key.f10565b.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(w89Var.toString());
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            pvc pvcVar = w89Var.f66531a;
                            int i3 = pvcVar instanceof lg2 ? ((lg2) pvcVar).f49621n : Integer.MAX_VALUE;
                            pvc pvcVar2 = w89Var.f66532b;
                            int i4 = pvcVar2 instanceof lg2 ? ((lg2) pvcVar2).f49621n : Integer.MAX_VALUE;
                            double dM14098l = AbstractC3122is.m14098l(width, height, i3, i4, scale);
                            boolean zM11406a = AbstractC2983f.m11406a(e04Var);
                            if (zM11406a) {
                                double d2 = dM14098l > 1.0d ? 1.0d : dM14098l;
                                bw5Var = null;
                                d = 1.0d;
                                if (Math.abs(((double) i3) - (((double) width) * d2)) > 1.0d && Math.abs(((double) i4) - (d2 * ((double) height))) > 1.0d) {
                                    if ((dM14098l == d && !zM11406a) || (dM14098l > d && zBooleanValue)) {
                                        zEquals = false;
                                    }
                                }
                            } else {
                                d = 1.0d;
                                bw5Var = null;
                                if ((i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && Math.abs(i3 - width) > 1) || (i4 != Integer.MIN_VALUE && i4 != Integer.MAX_VALUE && Math.abs(i4 - height) > 1)) {
                                    if (dM14098l == d) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                }
                            }
                            zEquals = true;
                        }
                    }
                    if (zEquals) {
                        return bw5VarMo12106i;
                    }
                    return bw5Var;
                }
                zEquals = false;
                bw5Var = null;
                if (zEquals) {
                    return bw5VarMo12106i;
                }
                return bw5Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public synchronized C3309ls m18293D() {
        return C3309ls.m16481q((xj4) ((uj4) this.f54782a).m22171a());
    }

    /* JADX INFO: renamed from: E */
    public long m18294E() {
        Magnifier magnifier = (Magnifier) this.f54782a;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    public void mo17933F() {
        View view = (View) this.f54782a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public synchronized boolean m18295G(int i) {
        Iterator it = Collections.unmodifiableList(((xj4) ((uj4) this.f54782a).f62440b).m24570z()).iterator();
        while (it.hasNext()) {
            if (((wj4) it.next()).m24015A() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public MemoryCache$Key m18296H(e04 e04Var, Object obj, sz6 sz6Var, wt2 wt2Var) {
        String strMo14496a;
        Map mapM15360M;
        e04Var.getClass();
        List list = e04Var.f36507f;
        List list2 = ((C0855a) this.f54782a).f10410g.f8361c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strMo14496a = null;
                break;
            }
            Pair pair = (Pair) list2.get(i);
            jj4 jj4Var = (jj4) pair.f47623a;
            if (((Class) pair.f47624b).isAssignableFrom(obj.getClass())) {
                jj4Var.getClass();
                strMo14496a = jj4Var.mo14496a(obj, sz6Var);
                if (strMo14496a != null) {
                    break;
                }
            }
            i++;
        }
        if (strMo14496a == null) {
            return null;
        }
        Map map = e04Var.f36525x.f70835a;
        if (map.isEmpty()) {
            mapM15360M = AbstractC3194a.m15360M();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                ho2.m13383c();
                return null;
            }
            mapM15360M = linkedHashMap;
        }
        if (list.isEmpty() && mapM15360M.isEmpty()) {
            return new MemoryCache$Key(strMo14496a, AbstractC3194a.m15360M());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapM15360M);
        List list3 = list;
        if (!list3.isEmpty()) {
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap2.put(ux5.m22988k(i2, "coil#transformation_"), ((l9a) list.get(i2)).mo9996b());
            }
            linkedHashMap2.put("coil#transformation_size", sz6Var.f61662d.toString());
        }
        return new MemoryCache$Key(strMo14496a, linkedHashMap2);
    }

    /* JADX INFO: renamed from: I */
    public ai4 m18297I(ByteString byteString) throws GeneralSecurityException {
        AbstractC3517r abstractC3517r = (AbstractC3517r) this.f54782a;
        try {
            AbstractC3572sf abstractC3572sfMo226j = abstractC3517r.mo226j();
            AbstractC1126a abstractC1126aMo3499u = abstractC3572sfMo226j.mo3499u(byteString);
            abstractC3572sfMo226j.mo3500z(abstractC1126aMo3499u);
            AbstractC1126a abstractC1126aMo3497m = abstractC3572sfMo226j.mo3497m(abstractC1126aMo3499u);
            zh4 zh4VarM434C = ai4.m434C();
            String strMo225i = abstractC3517r.mo225i();
            zh4VarM434C.m22174d();
            ai4.m435v((ai4) zh4VarM434C.f62440b, strMo225i);
            try {
                C1127b c1127b = new C1127b(((AbstractC1134i) abstractC1126aMo3497m).mo6429a(null));
                abstractC1126aMo3497m.mo6433e(c1127b.f13565a);
                ByteString byteStringM6434a = c1127b.m6434a();
                zh4VarM434C.m22174d();
                ai4.m436w((ai4) zh4VarM434C.f62440b, byteStringM6434a);
                KeyData$KeyMaterialType keyData$KeyMaterialTypeMo227o = abstractC3517r.mo227o();
                zh4VarM434C.m22174d();
                ai4.m437x((ai4) zh4VarM434C.f62440b, keyData$KeyMaterialTypeMo227o);
                return (ai4) zh4VarM434C.m22171a();
            } catch (IOException e) {
                throw new RuntimeException(abstractC1126aMo3497m.m6430b("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    /* JADX INFO: renamed from: K */
    public i09 m18298K(JSONObject jSONObject) throws JSONException {
        i29 ho5Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            ho5Var = new nj0(10);
        } else {
            ho5Var = new ho5(16);
        }
        return ho5Var.mo13408k((nj0) this.f54782a, jSONObject);
    }

    /* JADX INFO: renamed from: L */
    public x44 m18299L(fs6 fs6Var, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        long j;
        boolean z;
        long jM1738N;
        tk5 tk5Var = (tk5) this.f54782a;
        List list = (List) fs6Var.f39590b;
        tk5 tk5Var2 = new tk5(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            mg7 mg7Var = (mg7) list.get(i);
            long j2 = mg7Var.f51291a;
            lg7 lg7Var = (lg7) tk5Var.m22176b(j2);
            if (lg7Var == null) {
                j = mg7Var.f51292b;
                jM1738N = mg7Var.f51294d;
                z = false;
            } else {
                long j3 = lg7Var.f49634a;
                j = j3;
                z = lg7Var.f49636c;
                jM1738N = viewTreeObserverOnGlobalLayoutListenerC0391c.m1738N(lg7Var.f49635b);
            }
            long j4 = mg7Var.f51291a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            tk5Var2.m22180f(new kg7(j4, mg7Var.f51292b, mg7Var.f51294d, mg7Var.f51295e, mg7Var.f51296f, j, jM1738N, z, mg7Var.f51297g, mg7Var.f51299i, mg7Var.f51300j, mg7Var.f51301k, mg7Var.f51302l, mg7Var.f51303m), j4);
            boolean z2 = mg7Var.f51295e;
            if (z2) {
                tk5Var.m22180f(new lg7(mg7Var.f51292b, mg7Var.f51293c, z2), j2);
            } else {
                tk5Var.m22181g(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new x44(tk5Var2, fs6Var);
    }

    /* JADX INFO: renamed from: M */
    public void m18300M(String str) {
        str.getClass();
        ArrayList arrayList = (ArrayList) this.f54782a;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public Object m18301N(cu0 cu0Var, ui3 ui3Var) {
        r89 r89Var;
        yv8 yv8Var;
        if (((AbstractC3572sf) this.f54782a) == null) {
            hi7.m13279b("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC3572sf abstractC3572sf = (AbstractC3572sf) this.f54782a;
        if ((abstractC3572sf instanceof r89) && (yv8Var = (r89Var = (r89) abstractC3572sf).f58897f) != null && !yv8Var.equals(cu0Var)) {
            f56 f56Var = new f56();
            yv8 yv8Var2 = r89Var.f58897f;
            if (yv8Var2 == null) {
                hi7.m13279b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            o66 o66Var = r89Var.f58895d;
            ArrayList arrayList = f56Var.f38436c;
            if (o66Var != null) {
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new c56(objArr[(i << 3) + i4], yv8Var2));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = r89Var.f58893b;
                obj.getClass();
                arrayList.add(new c56(obj, yv8Var2));
            }
            f56Var.mo11542k();
            r89Var.mo11543n();
            this.f54782a = f56Var;
        }
        AbstractC3572sf abstractC3572sf2 = (AbstractC3572sf) this.f54782a;
        abstractC3572sf2.getClass();
        jc9 jc9VarMo3170u = nc9.m17358j().mo3170u(abstractC3572sf2.mo11544w(cu0Var));
        abstractC3572sf2.mo11541j(cu0Var);
        try {
            jc9 jc9VarM14393j = jc9VarMo3170u.m14393j();
            try {
                Object objMo0a = ui3Var.mo0a();
                jc9.m14390q(jc9VarM14393j);
                jc9VarMo3170u.mo3162c();
                abstractC3572sf2.mo11542k();
                return objMo0a;
            } catch (Throwable th) {
                jc9.m14390q(jc9VarM14393j);
                throw th;
            }
        } catch (Throwable th2) {
            jc9VarMo3170u.mo3162c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: O */
    public ArrayList m18302O(int i) {
        ArrayList arrayList = new ArrayList();
        C0129b c0129b = (C0129b) this.f54782a;
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            ss4 ss4Var = c0129b.f2469b ? c0129b.f2470c : (ss4) ((xc9) c0129b.f2472e).getValue();
            if (ss4Var != null) {
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f47716a = 1;
                List list = (List) ss4Var.f61344k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) list.get(i2);
                    lu4 lu4Var = c0129b.f2482o;
                    int iIntValue = ((Number) pair.f47623a).intValue();
                    long j = ((bk1) pair.f47624b).f8631a;
                    fs6 fs6Var = C0129b.f2467w;
                    ref$IntRef = ref$IntRef;
                    arrayList.add(lu4Var.m16545a(iIntValue, j, false, new C3615tl((ArrayList) null, ref$IntRef, list, i, ss4Var)));
                }
            }
            return arrayList;
        } finally {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo17934Q() {
        View viewFindViewById;
        View view = (View) this.f54782a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new md9(viewFindViewById, 0));
    }

    @Override // p000.ub4
    /* JADX INFO: renamed from: a */
    public void mo4506a(String str) {
        if (str == null) {
            eh0.m11135p("IterableApi", "Remote configuration returned null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("offlineMode");
            fb4.f38769t.f38780k.m3837R(z);
            SharedPreferences.Editor editorEdit = fb4.f38769t.f38770a.getSharedPreferences("itbl_saved_configuration", 0).edit();
            editorEdit.putBoolean("itbl_offline_mode", z);
            if (jSONObject.has("autoRetry")) {
                boolean z2 = jSONObject.getBoolean("autoRetry");
                editorEdit.putBoolean("itbl_auto_retry", z2);
                ((fb4) this.f54782a).f38779j = z2;
            }
            editorEdit.apply();
        } catch (JSONException unused) {
            eh0.m11135p("IterableApi", "Failed to read remote configuration");
        }
    }

    @Override // p000.su2
    /* JADX INFO: renamed from: b */
    public j18 mo18303b() throws Throwable {
        IOException iOException = null;
        while (!((p18) this.f54782a).f55448k.f43339K) {
            try {
                lj8 lj8VarM18854b = ((p18) this.f54782a).m18854b();
                if (!lj8VarM18854b.mo11843a()) {
                    kj8 kj8VarMo11846d = lj8VarM18854b.mo11846d();
                    if (kj8VarMo11846d.f47399b == null && kj8VarMo11846d.f47400c == null) {
                        kj8VarMo11846d = lj8VarM18854b.mo11849g();
                    }
                    lj8 lj8Var = kj8VarMo11846d.f47399b;
                    Throwable th = kj8VarMo11846d.f47400c;
                    if (th != null) {
                        throw th;
                    }
                    if (lj8Var != null) {
                        ((p18) this.f54782a).f55453p.addFirst(lj8Var);
                    }
                }
                return lj8VarM18854b.mo11845c();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    lda.m16117c(iOException, e);
                }
                if (!((p18) this.f54782a).m18853a(null)) {
                    throw iOException;
                }
            }
        }
        v63.m23133k("Canceled");
        return null;
    }

    @Override // p000.ma1
    /* JADX INFO: renamed from: c */
    public long mo16640c() {
        return ((rh8) this.f54782a).f59316c;
    }

    @Override // p000.su2
    /* JADX INFO: renamed from: d */
    public p18 mo18304d() {
        return (p18) this.f54782a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String strValueOf;
        r86 r86Var;
        Integer numValueOf;
        r86 r86Var2;
        u86 u86Var;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f54782a;
        if (bottomNavigationView.f13063f == null || menuItem.getItemId() != bottomNavigationView.getSelectedItemId()) {
            sg6 sg6Var = bottomNavigationView.f13062e;
            if (sg6Var == null) {
                return false;
            }
            ud6 ud6Var = (ud6) ((C3487q7) sg6Var).f57333b;
            menuItem.getClass();
            ud6Var.getClass();
            h86 h86Var = ud6Var.f63760b;
            r86 r86VarM13127f = h86Var.m13127f();
            r86VarM13127f.getClass();
            u86 u86Var2 = r86VarM13127f.f58882c;
            u86Var2.getClass();
            if (u86Var2.m22538m(menuItem.getItemId()) instanceof C2917d7) {
                i = R$anim.nav_default_enter_anim;
                i2 = R$anim.nav_default_exit_anim;
                i3 = R$anim.nav_default_pop_enter_anim;
                i4 = R$anim.nav_default_pop_exit_anim;
            } else {
                i = R$animator.nav_default_enter_anim;
                i2 = R$animator.nav_default_exit_anim;
                i3 = R$animator.nav_default_pop_enter_anim;
                i4 = R$animator.nav_default_pop_exit_anim;
            }
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            if ((menuItem.getOrder() & 196608) == 0) {
                int i10 = u86.f63588h;
                i5 = wfb.m23917l(h86Var.m13128g()).f58881b.f57368b;
                z = true;
            } else {
                i5 = -1;
                z = false;
            }
            try {
                ud6Var.m22687d(menuItem.getItemId(), null, new wd6(true, true, i5, false, z, i6, i7, i8, i9));
                r86 r86VarM13127f2 = h86Var.m13127f();
                if (r86VarM13127f2 != null && AbstractC3184kh.m15197D(menuItem.getItemId(), r86VarM13127f2)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                int i11 = r86.f58879f;
                Context context = ud6Var.f63759a;
                int itemId = menuItem.getItemId();
                if (itemId <= 16777215) {
                    strValueOf = String.valueOf(itemId);
                } else {
                    try {
                        strValueOf = context.getResources().getResourceName(itemId);
                        strValueOf.getClass();
                    } catch (Resources.NotFoundException unused) {
                        strValueOf = String.valueOf(itemId);
                    }
                }
                StringBuilder sbM17742q = AbstractC3393o1.m17742q("Ignoring onNavDestinationSelected for MenuItem ", strValueOf, " as it cannot be found from the current destination ");
                sbM17742q.append(h86Var.m13127f());
                Log.i("NavigationUI", sbM17742q.toString(), e);
                return true;
            }
        } else {
            HomeFragment homeFragment = ((ru3) bottomNavigationView.f13063f).f59825a;
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            Set setM20855w0 = AbstractC3550rv.m20855w0(new Integer[]{Integer.valueOf(R$id.fragment_library), Integer.valueOf(com.lingq.feature.vocabulary.R$id.fragment_vocabulary), Integer.valueOf(com.lingq.feature.chat.R$id.fragment_chat), Integer.valueOf(com.lingq.feature.playlist.R$id.fragment_playlist), Integer.valueOf(com.lingq.feature.more.R$id.fragment_more)});
            ud6 ud6Var2 = homeFragment.f33890F0;
            if (ud6Var2 == null) {
                fa4.m11636J("navController");
                throw null;
            }
            r86 r86VarM13127f3 = ud6Var2.f63760b.m13127f();
            boolean zM22633z0 = u91.m22633z0(setM20855w0, r86VarM13127f3 != null ? Integer.valueOf(r86VarM13127f3.f58881b.f57368b) : null);
            ud6 ud6Var3 = homeFragment.f33890F0;
            if (zM22633z0) {
                if (ud6Var3 == null) {
                    fa4.m11636J("navController");
                    throw null;
                }
                y76 y76Var = (y76) ud6Var3.f63760b.f41951f.m4188k();
                if (y76Var == null || (r86Var2 = y76Var.f69409b) == null || (u86Var = r86Var2.f58882c) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(u86Var.f58881b.f57368b);
                }
            } else {
                if (ud6Var3 == null) {
                    fa4.m11636J("navController");
                    throw null;
                }
                y76 y76Var2 = (y76) ud6Var3.f63760b.f41951f.m4188k();
                if (y76Var2 == null || (r86Var = y76Var2.f69409b) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(r86Var.f58881b.f57368b);
                }
            }
            if (numValueOf != null && menuItem.getItemId() != numValueOf.intValue()) {
                wd6 wd6Var = new wd6(false, false, menuItem.getItemId(), true, false, -1, -1, -1, -1);
                try {
                    ud6 ud6Var4 = homeFragment.f33890F0;
                    if (ud6Var4 != null) {
                        ud6Var4.m22687d(menuItem.getItemId(), null, wd6Var);
                        return true;
                    }
                    fa4.m11636J("navController");
                    throw null;
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        return true;
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: f */
    public int mo4510f(View view) {
        return y28.m24877E(view) - ((ViewGroup.MarginLayoutParams) ((z28) view.getLayoutParams())).topMargin;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: g */
    public float mo13109g() {
        return 0.0f;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: h */
    public float mo13110h(float f, long j) {
        long j2 = j / 1000000;
        y63 y63VarM21747a = ((C3588sv) this.f54782a).m21747a(f);
        long j3 = y63VarM21747a.f69364c;
        return (((Math.signum(y63VarM21747a.f69362a) * AbstractC2965ei.m11158a(j3 > 0 ? j2 / j3 : 1.0f).f35667b) * y63VarM21747a.f69363b) / j3) * 1000.0f;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: i */
    public float mo13111i(float f, float f2, long j) {
        long j2 = j / 1000000;
        y63 y63VarM21747a = ((C3588sv) this.f54782a).m21747a(f2);
        long j3 = y63VarM21747a.f69364c;
        return (Math.signum(y63VarM21747a.f69362a) * y63VarM21747a.f69363b * AbstractC2965ei.m11158a(j3 > 0 ? j2 / j3 : 1.0f).f35666a) + f;
    }

    /* JADX INFO: renamed from: j */
    public void m18305j(String str, String str2) {
        str.getClass();
        str2.getClass();
        oha.m17997c(str);
        oha.m17998d(str2, str);
        oha.m17995a(this, str, str2);
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: k */
    public int mo4511k() {
        return ((y28) this.f54782a).m24894J();
    }

    /* JADX INFO: renamed from: l */
    public void m18306l(String str) {
        int iM23388k0 = vk9.m23388k0(str, ':', 1, 4);
        if (iM23388k0 != -1) {
            oha.m17995a(this, str.substring(0, iM23388k0), str.substring(iM23388k0 + 1));
        } else if (str.charAt(0) == ':') {
            oha.m17995a(this, "", str.substring(1));
        } else {
            oha.m17995a(this, "", str);
        }
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: m */
    public long mo13112m(float f) {
        return ((long) (Math.exp(((C3588sv) this.f54782a).m21748b(f) / (((double) z63.f70984a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: n */
    public void mo9121n(zj5 zj5Var) {
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        String str = accessTokenM24363t != null ? accessTokenM24363t.f11311e : null;
        if (str != null) {
            C2177b.m9112V2((C2177b) ((OnboardingLoginFragment) this.f54782a).f27023C0.getValue(), null, null, str, LoginAuthType.FACEBOOK, 3);
        }
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: o */
    public int mo4514o() {
        y28 y28Var = (y28) this.f54782a;
        return y28Var.f69185o - y28Var.m24890G();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        C0918b c0918b = (C0918b) this.f54782a;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    String installReferrer = c0918b.getInstallReferrer().getInstallReferrer();
                    if (installReferrer != null && (vk9.m23380c0(installReferrer, "fb", false) || vk9.m23380c0(installReferrer, "facebook", false))) {
                        if (!set.contains(C3012fs.class)) {
                            try {
                                sy2.m21766a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer).apply();
                            } catch (Throwable th) {
                                lp1.m16420a(C3012fs.class, th);
                            }
                        }
                    }
                    sy2.m21766a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                sy2.m21766a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            c0918b.endConnection();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lp1.m16420a(this, th3);
            }
        }
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: p */
    public float mo13113p(float f, float f2) {
        C3588sv c3588sv = (C3588sv) this.f54782a;
        double dM21748b = c3588sv.m21748b(f2);
        double d = z63.f70984a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM21748b) * ((double) (c3588sv.f61450a * c3588sv.f61451b))))) + f;
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: q */
    public View mo4515q(int i) {
        return ((y28) this.f54782a).m24904u(i);
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: r */
    public void mo9122r(FacebookException facebookException) {
        Toast.makeText(((OnboardingLoginFragment) this.f54782a).m2090R(), facebookException.getMessage(), 0).show();
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    public void mo12238s(hw5 hw5Var) {
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: t */
    public int mo4518t(View view) {
        return y28.m24884y(view) + ((ViewGroup.MarginLayoutParams) ((z28) view.getLayoutParams())).bottomMargin;
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m18307u(wi4 wi4Var) {
        wj4 wj4VarM18290A;
        synchronized (this) {
            wj4VarM18290A = m18290A(l48.m15793e(wi4Var), wi4Var.m23985z());
        }
        uj4 uj4Var = (uj4) this.f54782a;
        uj4Var.m22174d();
        xj4.m24566w((xj4) uj4Var.f62440b, wj4VarM18290A);
    }

    /* JADX INFO: renamed from: v */
    public void m18308v(String str, String str2) {
        str.getClass();
        str2.getClass();
        oha.m17997c(str);
        oha.m17995a(this, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public qr3 m18309w() {
        return new qr3((String[]) ((ArrayList) this.f54782a).toArray(new String[0]));
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: x */
    public String mo2959x() {
        return ((co9) this.f54782a).f35968b;
    }

    /* JADX INFO: renamed from: y */
    public k18 m18310y() {
        ch2 ch2VarM4960c;
        C3552rx c3552rx = (C3552rx) this.f54782a;
        C0860a c0860a = (C0860a) c3552rx.f59989d;
        synchronized (c0860a) {
            c3552rx.m20969d(true);
            ch2VarM4960c = c0860a.m4960c(((ah2) c3552rx.f59987b).f637a);
        }
        if (ch2VarM4960c != null) {
            return new k18(ch2VarM4960c);
        }
        return null;
    }

    @Override // p000.ao9
    /* JADX INFO: renamed from: z */
    public void mo2960z(zn9 zn9Var) {
        co9 co9Var = (co9) this.f54782a;
        int length = co9Var.f10367d.length;
        for (int i = 1; i < length; i++) {
            int i2 = co9Var.f10367d[i];
            if (i2 == 1) {
                zn9Var.mo3712j(i, co9Var.f10368e[i]);
            } else if (i2 == 2) {
                zn9Var.mo3711g(i, co9Var.f10369f[i]);
            } else if (i2 == 3) {
                String str = co9Var.f10370g[i];
                str.getClass();
                zn9Var.mo3716t(i, str);
            } else if (i2 == 4) {
                byte[] bArr = co9Var.f10371h[i];
                bArr.getClass();
                zn9Var.mo3713k(i, bArr);
            } else if (i2 == 5) {
                zn9Var.mo3714m(i);
            }
        }
    }

    public /* synthetic */ or3(Object obj, Object obj2) {
        this.f54782a = obj;
    }

    public or3(fb2 fb2Var) {
        float f = sf9.f60797a;
        C3588sv c3588sv = new C3588sv();
        c3588sv.f61450a = f;
        float fMo594a = fb2Var.mo594a();
        float f2 = z63.f70984a;
        c3588sv.f61451b = fMo594a * 386.0878f * 160.0f * 0.84f;
        this.f54782a = c3588sv;
    }

    public or3(AbstractC3517r abstractC3517r, Class cls) {
        if (!((Map) abstractC3517r.f58433b).keySet().contains(cls) && !Void.class.equals(cls)) {
            C3386nv.m17626m(wq1.m24119o("Given internalKeyMananger ", abstractC3517r.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.f54782a = abstractC3517r;
    }

    public /* synthetic */ or3(Object obj) {
        this.f54782a = obj;
    }
}
