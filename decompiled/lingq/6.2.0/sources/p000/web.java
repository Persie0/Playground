package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.C0035b;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.repository.C1291g;
import com.lingq.core.data.repository.C1297m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public final class web implements dx5, am0, yk1, wb7, fs1, yr6, fw5, js6 {

    /* JADX INFO: renamed from: b */
    public static web f66739b;

    /* JADX INFO: renamed from: c */
    public static final az6 f66740c = new az6(1);

    /* JADX INFO: renamed from: d */
    public static final az6 f66741d = new az6(0);

    /* JADX INFO: renamed from: a */
    public Object f66742a;

    public web(int i) {
        switch (i) {
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                this.f66742a = new ArrayList();
                break;
            default:
                this.f66742a = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m23860H(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX INFO: renamed from: M */
    public static void m23861M(web webVar, web webVar2) {
    }

    /* JADX INFO: renamed from: O */
    public static String m23862O(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: P */
    public static synchronized web m23863P(Context context) {
        web webVar;
        String strM25674e;
        Context applicationContext = context.getApplicationContext();
        synchronized (web.class) {
            webVar = f66739b;
            if (webVar == null) {
                webVar = new web();
                zi9 zi9VarM25669a = zi9.m25669a(applicationContext);
                webVar.f66742a = zi9VarM25669a;
                zi9VarM25669a.m25671b();
                String strM25674e2 = zi9VarM25669a.m25674e("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strM25674e2) && (strM25674e = zi9VarM25669a.m25674e(zi9.m25670f("googleSignInOptions", strM25674e2))) != null) {
                    try {
                        GoogleSignInOptions.m5272r(strM25674e);
                    } catch (JSONException unused) {
                    }
                }
                f66739b = webVar;
            }
        }
        return webVar;
        return webVar;
    }

    /* JADX INFO: renamed from: A */
    public Long m23864A() {
        String strM23868E = m23868E("gcm.n.event_time");
        if (TextUtils.isEmpty(strM23868E)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM23868E));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m23862O("gcm.n.event_time") + "(" + strM23868E + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public String m23865B(Resources resources, String str, String str2) {
        String strM23868E = m23868E(str2);
        if (!TextUtils.isEmpty(strM23868E)) {
            return strM23868E;
        }
        String strM23889z = m23889z(str2);
        if (TextUtils.isEmpty(strM23889z)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM23889z, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m23862O(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM23888y = m23888y(str2);
        if (objArrM23888y == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM23888y);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m23862O(str2) + ": " + Arrays.toString(objArrM23888y) + " Default value will be used.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public UUID m23866C() {
        return zk0.f71668a;
    }

    /* JADX INFO: renamed from: D */
    public int m23867D() {
        return 1;
    }

    /* JADX INFO: renamed from: E */
    public String m23868E(String str) {
        Bundle bundle = (Bundle) this.f66742a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: F */
    public long[] m23869F() {
        JSONArray jSONArrayM23886w = m23886w("gcm.n.vibrate_timings");
        if (jSONArrayM23886w == null) {
            return null;
        }
        try {
            if (jSONArrayM23886w.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM23886w.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayM23886w.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM23886w + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public bx0 m23870G() {
        return new bx0(AbstractC3584sr.m21590A(((C1291g) ((mu1) this.f66742a)).f16481b.f17014a, false, new String[]{"CupTeamEntity"}, new ae1(14)), 3);
    }

    /* JADX INFO: renamed from: I */
    public int m23871I(int i) {
        WorkDatabase workDatabase = (WorkDatabase) this.f66742a;
        cz3 cz3Var = new cz3(this, i, 0);
        workDatabase.getClass();
        Object objM2845r = workDatabase.m2845r(new hz4(cz3Var, 28));
        objM2845r.getClass();
        return ((Number) objM2845r).intValue();
    }

    /* JADX INFO: renamed from: J */
    public void m23872J() {
        ((scb) this.f66742a).f60700r.f61092H.post(new RunnableC3468pp(this, 20));
    }

    /* JADX INFO: renamed from: K */
    public Bundle m23873K() {
        Bundle bundle = (Bundle) this.f66742a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: L */
    public void m23874L(fm2 fm2Var) {
    }

    /* JADX INFO: renamed from: N */
    public boolean m23875N(String str) {
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m23876Q() {
        zi9 zi9Var = (zi9) this.f66742a;
        ReentrantLock reentrantLock = zi9Var.f71623a;
        reentrantLock.lock();
        try {
            zi9Var.f71624b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: a */
    public long mo12042a(long j) {
        ArrayList arrayList = (ArrayList) this.f66742a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((gs1) arrayList.get(0)).f41258b) {
            return ((gs1) arrayList.get(0)).f41258b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            gs1 gs1Var = (gs1) arrayList.get(i);
            long j2 = gs1Var.f41258b;
            long j3 = gs1Var.f41258b;
            if (j < j2) {
                long j4 = ((gs1) arrayList.get(i - 1)).f41260d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((gs1) sgd.m21369a(arrayList)).f41260d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: b */
    public void mo10740b(hw5 hw5Var, boolean z) {
        C3767xp c3767xp;
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) this.f66742a;
        hw5 hw5VarMo13528k = hw5Var.mo13528k();
        int i = 0;
        boolean z2 = hw5VarMo13528k != hw5Var;
        if (z2) {
            hw5Var = hw5VarMo13528k;
        }
        C3767xp[] c3767xpArr = layoutInflaterFactory2C3804yp.f70209f0;
        int length = c3767xpArr != null ? c3767xpArr.length : 0;
        while (true) {
            if (i < length) {
                c3767xp = c3767xpArr[i];
                if (c3767xp != null && c3767xp.f68471h == hw5Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                c3767xp = null;
                break;
            }
        }
        if (c3767xp != null) {
            if (!z2) {
                layoutInflaterFactory2C3804yp.m25233q(c3767xp, z);
            } else {
                layoutInflaterFactory2C3804yp.m25231o(c3767xp.f68464a, c3767xp, hw5VarMo13528k);
                layoutInflaterFactory2C3804yp.m25233q(c3767xp, true);
            }
        }
    }

    @Override // p000.yk1
    public bl1 build() {
        return new bl1(new vqb(((ContentInfo.Builder) this.f66742a).build()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // p000.fs1
    /* JADX INFO: renamed from: c */
    public boolean mo12043c(gs1 gs1Var, long j) {
        boolean z;
        ArrayList arrayList = (ArrayList) this.f66742a;
        long j2 = gs1Var.f41258b;
        bna.m3969q(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = gs1Var.f41260d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((gs1) arrayList.get(size)).f41258b) {
                arrayList.add(size + 1, gs1Var);
                return z;
            }
            if (((gs1) arrayList.get(size)).f41258b <= j) {
                z = false;
            }
        }
        arrayList.add(0, gs1Var);
        return z;
    }

    @Override // p000.fs1
    public void clear() {
        ((ArrayList) this.f66742a).clear();
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: d */
    public ImmutableList mo12044d(long j) {
        int iM23884u = m23884u(j);
        if (iM23884u == 0) {
            return ImmutableList.m6289v();
        }
        gs1 gs1Var = (gs1) ((ArrayList) this.f66742a).get(iM23884u - 1);
        long j2 = gs1Var.f41260d;
        return (j2 == -9223372036854775807L || j < j2) ? gs1Var.f41257a : ImmutableList.m6289v();
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        return false;
    }

    @Override // p000.yk1
    /* JADX INFO: renamed from: f */
    public void mo23877f(Uri uri) {
        ((ContentInfo.Builder) this.f66742a).setLinkUri(uri);
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void mo320g(Object obj) {
        int iMo6777a;
        GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = (GmsDocumentScanningDelegateActivity) this.f66742a;
        GmsDocumentScanningResult gmsDocumentScanningResult = (GmsDocumentScanningResult) obj;
        if (gmsDocumentScanningResult == null) {
            gmsDocumentScanningDelegateActivity.m6779k();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_scanning_result", gmsDocumentScanningResult);
        gmsDocumentScanningDelegateActivity.setResult(-1, intent);
        List listMo6774a = gmsDocumentScanningResult.mo6774a();
        GmsDocumentScanningResult.Pdf pdfMo6775b = gmsDocumentScanningResult.mo6775b();
        if (listMo6774a != null) {
            iMo6777a = listMo6774a.size();
        } else {
            iMo6777a = pdfMo6775b != null ? pdfMo6775b.mo6777a() : 0;
        }
        gmsDocumentScanningDelegateActivity.m6780l(zznt.NO_ERROR, iMo6777a);
        gmsDocumentScanningDelegateActivity.finish();
    }

    @Override // p000.yk1
    /* JADX INFO: renamed from: h */
    public void mo23878h(int i) {
        ((ContentInfo.Builder) this.f66742a).setFlags(i);
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: i */
    public long mo12045i(long j) {
        ArrayList arrayList = (ArrayList) this.f66742a;
        if (arrayList.isEmpty() || j < ((gs1) arrayList.get(0)).f41258b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((gs1) arrayList.get(i)).f41258b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                gs1 gs1Var = (gs1) arrayList.get(i - 1);
                long j3 = gs1Var.f41260d;
                return (j3 == -9223372036854775807L || j3 > j) ? gs1Var.f41258b : j3;
            }
        }
        gs1 gs1Var2 = (gs1) sgd.m21369a(arrayList);
        long j4 = gs1Var2.f41260d;
        return (j4 == -9223372036854775807L || j < j4) ? gs1Var2.f41258b : j4;
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: j */
    public boolean mo10741j(hw5 hw5Var) {
        Window.Callback callback;
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) this.f66742a;
        if (hw5Var != hw5Var.mo13528k() || !layoutInflaterFactory2C3804yp.f70203Z || (callback = layoutInflaterFactory2C3804yp.f70217l.getCallback()) == null || layoutInflaterFactory2C3804yp.f70216k0) {
            return true;
        }
        callback.onMenuOpened(108, hw5Var);
        return true;
    }

    @Override // p000.fs1
    /* JADX INFO: renamed from: k */
    public void mo12046k(long j) {
        ArrayList arrayList = (ArrayList) this.f66742a;
        int iM23884u = m23884u(j);
        if (iM23884u == 0) {
            return;
        }
        long j2 = ((gs1) arrayList.get(iM23884u - 1)).f41260d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM23884u--;
        }
        arrayList.subList(0, iM23884u).clear();
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public void mo553l(ul0 ul0Var, i88 i88Var) {
        boolean z = i88Var.f43689a.f45200L;
        yb1 yb1Var = (yb1) this.f66742a;
        if (z) {
            yb1Var.complete(i88Var.f43690b);
        } else {
            yb1Var.completeExceptionally(new HttpException(i88Var));
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        ((jk8) this.f66742a).resumeWith(new Result.Failure(exc));
    }

    /* JADX INFO: renamed from: n */
    public void m23879n(fm2 fm2Var) {
    }

    /* JADX INFO: renamed from: o */
    public boolean m23880o(String str) {
        String strM23868E = m23868E(str);
        return "1".equals(strM23868E) || Boolean.parseBoolean(strM23868E);
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public void mo554p(ul0 ul0Var, Throwable th) {
        ((yb1) this.f66742a).completeExceptionally(th);
    }

    /* JADX INFO: renamed from: q */
    public vg3 m23881q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public DrmSession$DrmSessionException m23882r() {
        return (DrmSession$DrmSessionException) this.f66742a;
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    public void mo12238s(hw5 hw5Var) {
        Toolbar toolbar = (Toolbar) this.f66742a;
        C0035b c0035b = toolbar.f1168a.f1112O;
        if (c0035b == null || !c0035b.m711k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1177e0.f61249c).iterator();
            while (it.hasNext()) {
                ((ce3) it.next()).f9965a.m2185t();
            }
        }
    }

    @Override // p000.yk1
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f66742a).setExtras(bundle);
    }

    /* JADX INFO: renamed from: t */
    public float m23883t(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f66742a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: u */
    public int m23884u(long j) {
        ArrayList arrayList = (ArrayList) this.f66742a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((gs1) arrayList.get(i)).f41258b) {
                return i;
            }
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: v */
    public Integer m23885v(String str) {
        String strM23868E = m23868E(str);
        if (TextUtils.isEmpty(strM23868E)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM23868E));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m23862O(str) + "(" + strM23868E + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public JSONArray m23886w(String str) {
        String strM23868E = m23868E(str);
        if (TextUtils.isEmpty(strM23868E)) {
            return null;
        }
        try {
            return new JSONArray(strM23868E);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m23862O(str) + ": " + strM23868E + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public int[] m23887x() {
        JSONArray jSONArrayM23886w = m23886w("gcm.n.light_settings");
        if (jSONArrayM23886w == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM23886w.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM23886w.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM23886w.optInt(1);
            iArr[2] = jSONArrayM23886w.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM23886w + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM23886w + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public Object[] m23888y(String str) {
        JSONArray jSONArrayM23886w = m23886w(str.concat("_loc_args"));
        if (jSONArrayM23886w == null) {
            return null;
        }
        int length = jSONArrayM23886w.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayM23886w.optString(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: z */
    public String m23889z(String str) {
        return m23868E(str.concat("_loc_key"));
    }

    public web(km7 km7Var) {
        km7Var.getClass();
        this.f66742a = km7Var;
    }

    public web(C1286b c1286b) {
        c1286b.getClass();
        this.f66742a = c1286b;
    }

    public web(mu1 mu1Var) {
        mu1Var.getClass();
        this.f66742a = mu1Var;
    }

    public web(cr8 cr8Var) {
        cr8Var.getClass();
        this.f66742a = cr8Var;
    }

    public web(u0b u0bVar) {
        u0bVar.getClass();
        this.f66742a = u0bVar;
    }

    public web(C1297m c1297m) {
        c1297m.getClass();
        this.f66742a = c1297m;
    }

    public web(xd7 xd7Var) {
        xd7Var.getClass();
        this.f66742a = xd7Var;
    }

    public web(hm5 hm5Var) {
        hm5Var.getClass();
        this.f66742a = hm5Var;
    }

    public web(lx4 lx4Var) {
        lx4Var.getClass();
        this.f66742a = lx4Var;
    }

    public /* synthetic */ web(Object obj) {
        this.f66742a = obj;
    }

    public web(WorkDatabase workDatabase) {
        workDatabase.getClass();
        this.f66742a = workDatabase;
    }

    public web(Bundle bundle) {
        if (bundle != null) {
            this.f66742a = new Bundle(bundle);
        } else {
            C3386nv.m17635v("data");
            throw null;
        }
    }

    public web(ClipData clipData, int i) {
        this.f66742a = xk1.m24584h(clipData, i);
    }
}
