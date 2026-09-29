package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.Lifecycle$State;
import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.google.android.gms.internal.play_billing.C1015z;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s46 implements jn1, m98, yc9, dj9, ns2, pr1, dqb, o9a, zn2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60298a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ s46 f60287b = new s46(1);

    /* JADX INFO: renamed from: c */
    public static final s46 f60288c = new s46(2);

    /* JADX INFO: renamed from: d */
    public static final s46 f60289d = new s46(3);

    /* JADX INFO: renamed from: e */
    public static final s46 f60290e = new s46(4);

    /* JADX INFO: renamed from: f */
    public static final fg2 f60291f = new fg2(17);

    /* JADX INFO: renamed from: g */
    public static final fg2 f60292g = new fg2(18);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ s46 f60293h = new s46(19);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ s46 f60294i = new s46(20);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ s46 f60295j = new s46(21);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ s46 f60296k = new s46(22);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ s46 f60297l = new s46(24);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ s46 f60284H = new s46(25);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ s46 f60285I = new s46(26);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ s46 f60286J = new s46(28);

    public s46(Set set) {
        this.f60298a = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            g9a.m12435l(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21057a(C3774xw c3774xw) {
        C3126ix c3126ix = C3774xw.f68871h;
        if (C3774xw.f68872i == null) {
            C3774xw.f68872i = new C3774xw();
            C3737ww c3737ww = new C3737ww("Okio Watchdog");
            c3737ww.setDaemon(true);
            c3737ww.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c3774xw.f9317c;
        boolean z = c3774xw.f9315a;
        if (j != 0 && z) {
            c3774xw.f68879g = Math.min(j, c3774xw.mo4283c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c3774xw.f68879g = jNanoTime + j;
        } else {
            if (!z) {
                uk9.m22780o();
                return;
            }
            c3774xw.f68879g = c3774xw.mo4283c();
        }
        C3126ix c3126ix2 = C3774xw.f68871h;
        int i = c3126ix2.f44720b + 1;
        c3126ix2.f44720b = i;
        C3774xw[] c3774xwArr = (C3774xw[]) c3126ix2.f44721c;
        if (i == c3774xwArr.length) {
            C3774xw[] c3774xwArr2 = new C3774xw[i * 2];
            AbstractC3550rv.m20830X(0, 0, 14, c3774xwArr, c3774xwArr2);
            c3126ix2.f44721c = c3774xwArr2;
        }
        c3126ix2.m14172h(i, c3774xw);
        if (c3774xw.f68878f == 1) {
            C3774xw.f68874k.signal();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m21058b(Object obj) {
        String str = mp3.f51688j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            C3386nv.m17626m("Unsupported parameter type.");
            return null;
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        str2.getClass();
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static C3774xw m21059c() throws InterruptedException {
        C3126ix c3126ix = C3774xw.f68871h;
        C3774xw c3774xw = ((C3774xw[]) c3126ix.f44721c)[1];
        if (c3774xw == null) {
            long jNanoTime = System.nanoTime();
            C3774xw.f68874k.await(C3774xw.f68875l, TimeUnit.MILLISECONDS);
            if (((C3774xw[]) c3126ix.f44721c)[1] != null || System.nanoTime() - jNanoTime < C3774xw.f68876m) {
                return null;
            }
            return C3774xw.f68872i;
        }
        long jNanoTime2 = c3774xw.f68879g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C3774xw.f68874k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c3126ix.m14176l(c3774xw);
        c3774xw.f68877e = 2;
        return c3774xw;
    }

    /* JADX INFO: renamed from: g */
    public static y76 m21060g(C3002fi c3002fi, r86 r86Var, Bundle bundle, Lifecycle$State lifecycle$State, i86 i86Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        r86Var.getClass();
        lifecycle$State.getClass();
        return new y76(c3002fi, r86Var, bundle, lifecycle$State, i86Var, string, null);
    }

    /* JADX INFO: renamed from: i */
    public static m58 m21061i(dua duaVar, zta ztaVar, int i) {
        if ((i & 2) != 0) {
            ztaVar = duaVar instanceof gr3 ? ((gr3) duaVar).mo2102d() : u92.f63609a;
        }
        qr1 qr1VarMo2103e = duaVar instanceof gr3 ? ((gr3) duaVar).mo2103e() : or1.f54780b;
        ztaVar.getClass();
        qr1VarMo2103e.getClass();
        return new m58(duaVar.mo2116r(), ztaVar, qr1VarMo2103e);
    }

    /* JADX INFO: renamed from: j */
    public static Typeface m21062j(String str, bc3 bc3Var, int i) {
        if (i == 0 && fa4.m11650l(bc3Var, bc3.f8321g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), bc3Var.f8327a, i == 1);
    }

    /* JADX INFO: renamed from: k */
    public static HttpURLConnection m21063k(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        uRLConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        if (mp3.f51690l == null) {
            mp3.f51690l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.2.3"}, 2));
        }
        httpURLConnection.setRequestProperty("User-Agent", mp3.f51690l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m21064l(op3 op3Var) {
        Exception exc;
        HttpURLConnection httpURLConnectionM21076x;
        ArrayList arrayListM21065m;
        op3Var.getClass();
        eda.m11072e(op3Var);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionM21076x = m21076x(op3Var);
            exc = null;
        } catch (Exception e) {
            exc = e;
            httpURLConnectionM21076x = null;
        } catch (Throwable th) {
            th = th;
            bna.m3921J(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionM21076x != null) {
                arrayListM21065m = m21065m(op3Var, httpURLConnectionM21076x);
            } else {
                ArrayList arrayListM19368e = pk9.m19368e(op3Var.f54678c, null, new FacebookException(exc));
                m21073u(op3Var, arrayListM19368e);
                arrayListM21065m = arrayListM19368e;
            }
            bna.m3921J(httpURLConnectionM21076x);
            return arrayListM21065m;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = httpURLConnectionM21076x;
            bna.m3921J(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x002c A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x002c: PHI (r0v4 java.util.ArrayList) = (r0v2 java.util.ArrayList), (r0v3 java.util.ArrayList), (r0v10 java.util.ArrayList) binds: [B:23:0x0053, B:25:0x0063, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r2v1 java.io.InputStream) = (r2v0 java.io.InputStream), (r2v0 java.io.InputStream), (r2v4 java.io.InputStream) binds: [B:23:0x0053, B:25:0x0063, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static ArrayList m21065m(op3 op3Var, HttpURLConnection httpURLConnection) {
        ArrayList arrayListM19368e;
        op3Var.getClass();
        InputStream errorStream = null;
        try {
            try {
                if (!sy2.m21772g()) {
                    Log.e("pp3", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                arrayListM19368e = pk9.m19370h(errorStream, httpURLConnection, op3Var);
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
                int size = op3Var.f54678c.size();
                if (size != arrayListM19368e.size()) {
                    throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListM19368e.size()), Integer.valueOf(size)}, 2)));
                }
                m21073u(op3Var, arrayListM19368e);
                w41 w41VarM22270m = w41.f66361h.m22270m();
                AccessToken accessToken = (AccessToken) w41VarM22270m.f66367c;
                if (accessToken != null) {
                    long time = new Date().getTime();
                    if (accessToken.f11312f.canExtendToken() && time - ((Date) w41VarM22270m.f66369e).getTime() > 3600000 && time - accessToken.f11313g.getTime() > 86400000) {
                        if (fa4.m11650l(Looper.getMainLooper(), Looper.myLooper())) {
                            w41VarM22270m.m23708B();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new RunnableC3781y2(w41VarM22270m, 0));
                        }
                    }
                }
                return arrayListM19368e;
            } catch (FacebookException e) {
                iy5 iy5Var = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
                arrayListM19368e = pk9.m19368e(op3Var, httpURLConnection, e);
                if (0 != 0) {
                    errorStream.close();
                }
            } catch (Exception e2) {
                iy5 iy5Var2 = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
                arrayListM19368e = pk9.m19368e(op3Var, httpURLConnection, new FacebookException(e2));
                if (0 != 0) {
                    errorStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21066n(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest$ParcelableResourceWithMimeType);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m21067o(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* JADX INFO: renamed from: p */
    public static mp3 m21068p(AccessToken accessToken, String str, kp3 kp3Var) {
        return new mp3(accessToken, str, null, null, kp3Var);
    }

    /* JADX INFO: renamed from: q */
    public static mp3 m21069q(AccessToken accessToken, String str, JSONObject jSONObject, kp3 kp3Var) {
        mp3 mp3Var = new mp3(accessToken, str, null, HttpMethod.POST, kp3Var);
        mp3Var.f51693c = jSONObject;
        return mp3Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX INFO: renamed from: r */
    public static void m21070r(JSONObject jSONObject, String str, lp3 lp3Var) {
        String strGroup;
        boolean z;
        Matcher matcher = mp3.f51689k.matcher(str);
        if (matcher.matches()) {
            strGroup = matcher.group(1);
            strGroup.getClass();
        } else {
            strGroup = str;
        }
        if (cl9.m4842Y(strGroup, "me/", false) || cl9.m4842Y(strGroup, "/me/", false)) {
            int iM23389l0 = vk9.m23389l0(str, ":", 0, false, 6);
            int iM23389l1 = vk9.m23389l0(str, "?", 0, false, 6);
            if (iM23389l0 <= 3 || (iM23389l1 != -1 && iM23389l0 >= iM23389l1)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            boolean z2 = z && cl9.m4834Q(next, "image", true);
            next.getClass();
            objOpt.getClass();
            m21071s(next, objOpt, lp3Var, z2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m21071s(String str, Object obj, lp3 lp3Var, boolean z) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Object objOpt = jSONArray.opt(i);
                    objOpt.getClass();
                    m21071s(str2, objOpt, lp3Var, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                lp3Var.mo12678b(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str3 = mp3.f51688j;
                sy2 sy2Var = sy2.f61585a;
                return;
            } else {
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                str4.getClass();
                lp3Var.mo12678b(str, str4);
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String str5 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object objOpt2 = jSONObject.opt(next);
                objOpt2.getClass();
                m21071s(str5, objOpt2, lp3Var, z);
            }
            return;
        }
        if (jSONObject.has("id")) {
            String strOptString = jSONObject.optString("id");
            strOptString.getClass();
            m21071s(str, strOptString, lp3Var, z);
        } else if (jSONObject.has("url")) {
            String strOptString2 = jSONObject.optString("url");
            strOptString2.getClass();
            m21071s(str, strOptString2, lp3Var, z);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String string = jSONObject.toString();
            string.getClass();
            m21071s(str, string, lp3Var, z);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m21072t(op3 op3Var, qj5 qj5Var, int i, URL url, FilterOutputStream filterOutputStream, boolean z) throws JSONException {
        String strM21767b;
        C3040gj c3040gj = new C3040gj();
        c3040gj.f40867c = filterOutputStream;
        c3040gj.f40868d = qj5Var;
        c3040gj.f40865a = true;
        c3040gj.f40866b = z;
        if (i == 1) {
            mp3 mp3Var = (mp3) op3Var.f54678c.get(0);
            HashMap map = new HashMap();
            for (String str : mp3Var.f51694d.keySet()) {
                Object obj = mp3Var.f51694d.get(str);
                if (m21066n(obj)) {
                    str.getClass();
                    map.put(str, new jp3(mp3Var, obj));
                }
            }
            qj5Var.m20002a();
            Bundle bundle = mp3Var.f51694d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (m21067o(obj2)) {
                    str2.getClass();
                    c3040gj.m12687l(str2, obj2, mp3Var);
                }
            }
            qj5Var.m20002a();
            m21074v(map, c3040gj);
            JSONObject jSONObject = mp3Var.f51693c;
            if (jSONObject != null) {
                String path = url.getPath();
                path.getClass();
                m21070r(jSONObject, path, c3040gj);
                return;
            }
            return;
        }
        op3Var.getClass();
        Iterator<E> it = op3Var.iterator();
        while (true) {
            if (it.hasNext()) {
                AccessToken accessToken = ((mp3) it.next()).f51691a;
                if (accessToken != null) {
                    strM21767b = accessToken.f11314h;
                    break;
                }
            } else {
                String str3 = mp3.f51688j;
                strM21767b = sy2.m21767b();
                break;
            }
        }
        if (strM21767b.length() == 0) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        c3040gj.mo12678b("batch_app_id", strM21767b);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = op3Var.iterator();
        while (it2.hasNext()) {
            mp3 mp3Var2 = (mp3) it2.next();
            mp3Var2.getClass();
            String str4 = mp3.f51688j;
            JSONObject jSONObject2 = new JSONObject();
            String strM16986h = mp3Var2.m16986h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{sy2.m21770e()}, 1)));
            mp3Var2.m16980a();
            Uri uri = Uri.parse(mp3Var2.m16981b(strM16986h, true));
            String str5 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", mp3Var2.f51698h);
            AccessToken accessToken2 = mp3Var2.f51691a;
            if (accessToken2 != null) {
                qj5.f57852d.m14206q(accessToken2.f11311e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = mp3Var2.f51694d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = mp3Var2.f51694d.get(it3.next());
                if (m21066n(obj3)) {
                    String str6 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str6);
                    map2.put(str6, new jp3(mp3Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = mp3Var2.f51693c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                m21070r(jSONObject3, str5, new C3800yl(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
        }
        String string = jSONArray.toString();
        string.getClass();
        c3040gj.mo12678b("batch", string);
        qj5Var.m20002a();
        m21074v(map2, c3040gj);
    }

    /* JADX INFO: renamed from: u */
    public static void m21073u(op3 op3Var, ArrayList arrayList) {
        op3Var.getClass();
        ArrayList arrayList2 = op3Var.f54678c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            mp3 mp3Var = (mp3) arrayList2.get(i);
            if (mp3Var.f51697g != null) {
                arrayList3.add(new Pair(mp3Var.f51697g, arrayList.get(i)));
            }
        }
        if (arrayList3.size() > 0) {
            RunnableC3470pr runnableC3470pr = new RunnableC3470pr(17, arrayList3, op3Var);
            Handler handler = op3Var.f54676a;
            if (handler != null) {
                handler.post(runnableC3470pr);
            } else {
                runnableC3470pr.run();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m21074v(HashMap map, C3040gj c3040gj) {
        for (Map.Entry entry : map.entrySet()) {
            String str = mp3.f51688j;
            if (m21066n(((jp3) entry.getValue()).m14580b())) {
                c3040gj.m12687l((String) entry.getKey(), ((jp3) entry.getValue()).m14580b(), ((jp3) entry.getValue()).m14579a());
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m21075w(op3 op3Var, HttpURLConnection httpURLConnection) throws Throwable {
        boolean z;
        Throwable th;
        op3Var.getClass();
        qj5 qj5Var = new qj5(LoggingBehavior.REQUESTS);
        ArrayList arrayList = op3Var.f54678c;
        int size = arrayList.size();
        Iterator<E> it = op3Var.iterator();
        loop0: while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            mp3 mp3Var = (mp3) it.next();
            Iterator<String> it2 = mp3Var.f51694d.keySet().iterator();
            while (it2.hasNext()) {
                if (m21066n(mp3Var.f51694d.get(it2.next()))) {
                    z = false;
                    break loop0;
                }
            }
        }
        FilterOutputStream gZIPOutputStream = null;
        HttpMethod httpMethod = size == z ? ((mp3) arrayList.get(0)).f51698h : null;
        if (httpMethod == null) {
            httpMethod = HttpMethod.POST;
        }
        httpURLConnection.setRequestMethod(httpMethod.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{mp3.f51688j}, (int) z)));
        }
        URL url = httpURLConnection.getURL();
        qj5Var.m20002a();
        op3Var.f54677b.getClass();
        qj5Var.m20002a();
        url.getClass();
        qj5Var.m20002a();
        httpURLConnection.getRequestMethod().getClass();
        qj5Var.m20002a();
        httpURLConnection.getRequestProperty("User-Agent").getClass();
        qj5Var.m20002a();
        httpURLConnection.getRequestProperty("Content-Type").getClass();
        qj5Var.m20002a();
        httpURLConnection.setConnectTimeout(0);
        httpURLConnection.setReadTimeout(0);
        HttpMethod httpMethod2 = HttpMethod.POST;
        String str = qj5Var.f57855b;
        LoggingBehavior loggingBehavior = qj5Var.f57854a;
        if (httpMethod != httpMethod2) {
            iy5.m14199o(loggingBehavior, str, qj5Var.f57856c.toString());
            qj5Var.f57856c = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = bufferedOutputStream;
                    if (gZIPOutputStream == null) {
                        throw th;
                    }
                    gZIPOutputStream.close();
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            for (C0833c3 c0833c3 : op3Var.f54679d) {
            }
            Iterator<E> it3 = op3Var.iterator();
            while (it3.hasNext()) {
                kp3 kp3Var = ((mp3) it3.next()).f51697g;
            }
            m21072t(op3Var, qj5Var, size, url, gZIPOutputStream, z);
            gZIPOutputStream.close();
            iy5.m14199o(loggingBehavior, str, qj5Var.f57856c.toString());
            qj5Var.f57856c = new StringBuilder();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static HttpURLConnection m21076x(op3 op3Var) throws Throwable {
        op3Var.getClass();
        ArrayList arrayList = op3Var.f54678c;
        Iterator<E> it = op3Var.iterator();
        while (it.hasNext()) {
            mp3 mp3Var = (mp3) it.next();
            if (HttpMethod.GET == mp3Var.f51698h && bna.m3945d0(mp3Var.f51694d.getString("fields"))) {
                iy5 iy5Var = qj5.f57852d;
                LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                StringBuilder sb = new StringBuilder("GET requests for /");
                String str = mp3Var.f51692b;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(" should contain an explicit \"fields\" parameter.");
                iy5.m14199o(loggingBehavior, "Request", sb.toString());
            }
        }
        try {
            URL url = arrayList.size() == 1 ? new URL(((mp3) arrayList.get(0)).m16985g()) : new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{sy2.m21770e()}, 1)));
            HttpURLConnection httpURLConnectionM21063k = null;
            try {
                httpURLConnectionM21063k = m21063k(url);
                m21075w(op3Var, httpURLConnectionM21063k);
                return httpURLConnectionM21063k;
            } catch (IOException e) {
                bna.m3921J(httpURLConnectionM21063k);
                throw new FacebookException("could not construct request body", e);
            } catch (JSONException e2) {
                bna.m3921J(httpURLConnectionM21063k);
                throw new FacebookException("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", e3);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m21077y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        return ((C1015z) obj).m5530b();
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // p000.dj9
    /* JADX INFO: renamed from: e */
    public C0898b mo10416e(AbstractC0903a abstractC0903a) {
        C0880b c0880b = abstractC0903a.f11016a;
        SharedPreferences sharedPreferences = c0880b.f10789b.getSharedPreferences("amplitude-events-" + c0880b.f10792e, 0);
        String str = c0880b.f10792e;
        pj5 pj5VarM5104a = c0880b.f10794g.m5104a(abstractC0903a);
        sharedPreferences.getClass();
        return new C0898b(str, pj5VarM5104a, sharedPreferences, new File(c0880b.m5061a(), "events"), abstractC0903a.f11028m, new C0020ai(abstractC0903a, 0));
    }

    @Override // p000.yc9
    /* JADX INFO: renamed from: f */
    public boolean mo21078f(Object obj, Object obj2) {
        switch (this.f60298a) {
            case 3:
                return false;
            default:
                return obj == obj2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p000.zn2
    /* JADX INFO: renamed from: h */
    public yn2 mo12443h(Context context, String str, xn2 xn2Var) {
        yn2 yn2Var = new yn2();
        yn2Var.f70101a = xn2Var.mo9834e(context, str);
        int i = 1;
        int iMo9833c = xn2Var.mo9833c(context, str, true);
        yn2Var.f70102b = iMo9833c;
        int i2 = yn2Var.f70101a;
        if (i2 == 0) {
            i2 = 0;
            if (iMo9833c == 0) {
                i = 0;
            } else if (iMo9833c < i2) {
                i = -1;
            }
        } else if (iMo9833c < i2) {
            i = -1;
        }
        yn2Var.f70103c = i;
        return yn2Var;
    }

    public String toString() {
        switch (this.f60298a) {
            case 3:
                return "NeverEqualPolicy";
            case 4:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f60298a) {
            case 19:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.app_uninstalled_additional_ad_id_cache_time", 1, 3600000L).get();
            case 20:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
            case 21:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.upload.min_delay_after_background", 48, 600000L).get();
            case 22:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.initial_upload_delay_time", 64, 15000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            default:
                ((mlb) llb.f49805b.f49806a.get()).getClass();
                return new Boolean(((Boolean) mlb.f51501a.get()).booleanValue());
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.dma_consent.max_daily_dcu_realtime_events", 18, 1L).get()).longValue());
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.rb.attribution.client.min_time_after_boot_seconds", 55, 90L).get()).longValue());
            case 26:
                List list7 = z8c.f71153a;
                ((ulb) tlb.f62487b.f62488a.get()).getClass();
                return (Boolean) ulb.f64052a.get();
        }
    }

    public /* synthetic */ s46(int i) {
        this.f60298a = i;
    }
}
