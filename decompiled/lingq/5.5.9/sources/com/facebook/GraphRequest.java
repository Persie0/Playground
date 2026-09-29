package com.facebook;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import dm.C5207g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.text.C7076b;
import mo.C7653a;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0009a;
import p067d8.C5056a0;
import p067d8.C5078r;
import p067d8.C5083w;
import p067d8.C5086z;
import p213k4.RunnableC6590j;
import p291o7.AsyncTaskC8008r;
import p291o7.C7995e;
import p291o7.C8004n;
import p291o7.C8005o;
import p291o7.C8007q;
import p291o7.C8009s;
import p291o7.C8010t;
import p291o7.C8013w;
import p291o7.C8014x;
import p291o7.InterfaceC8015y;

/* JADX INFO: loaded from: classes.dex */
public final class GraphRequest {

    /* JADX INFO: renamed from: j */
    public static final String f11448j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f11449k;

    /* JADX INFO: renamed from: l */
    public static volatile String f11450l;

    /* JADX INFO: renamed from: a */
    public final AccessToken f11451a;

    /* JADX INFO: renamed from: b */
    public final String f11452b;

    /* JADX INFO: renamed from: c */
    public JSONObject f11453c;

    /* JADX INFO: renamed from: d */
    public Bundle f11454d;

    /* JADX INFO: renamed from: e */
    public Object f11455e;

    /* JADX INFO: renamed from: f */
    public final String f11456f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2278b f11457g;

    /* JADX INFO: renamed from: h */
    public HttpMethod f11458h;

    /* JADX INFO: renamed from: i */
    public boolean f11459i;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C2276a();

        /* JADX INFO: renamed from: a */
        public final String f11460a;

        /* JADX INFO: renamed from: b */
        public final RESOURCE f11461b;

        /* JADX INFO: renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C2276a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            @Override // android.os.Parcelable.Creator
            public final ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "source");
                return new ParcelableResourceWithMimeType<>(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ParcelableResourceWithMimeType<?>[] newArray(int i10) {
                return new ParcelableResourceWithMimeType[i10];
            }
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.f11460a = parcel.readString();
            this.f11461b = (RESOURCE) parcel.readParcelable(C8004n.m15871a().getClassLoader());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ParcelableResourceWithMimeType(Parcelable parcelable) {
            this.f11460a = "image/png";
            this.f11461b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeString(this.f11460a);
            parcel.writeParcelable(this.f11461b, i10);
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$a */
    public static final class C2277a {

        /* JADX INFO: renamed from: a */
        public final GraphRequest f11462a;

        /* JADX INFO: renamed from: b */
        public final Object f11463b;

        public C2277a(GraphRequest graphRequest, Object obj) {
            this.f11462a = graphRequest;
            this.f11463b = obj;
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$b */
    public interface InterfaceC2278b {
        /* JADX INFO: renamed from: a */
        void mo6614a(C8010t c8010t);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$c */
    public static final class C2279c {
        /* JADX INFO: renamed from: a */
        public static final String m6615a(Object obj) {
            String str = GraphRequest.f11448j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            C5207g.m11110e(str2, "iso8601DateFormat.format(value)");
            return str2;
        }

        /* JADX INFO: renamed from: b */
        public static HttpURLConnection m6616b(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            if (GraphRequest.f11450l == null) {
                GraphRequest.f11450l = C0166e.m770q(new Object[]{"FBAndroidSDK", "16.0.1"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                if (!C5086z.m10802A(null)) {
                    GraphRequest.f11450l = C0141b.m613i(new Object[]{GraphRequest.f11450l, null}, 2, Locale.ROOT, "%s/%s", "java.lang.String.format(locale, format, *args)");
                }
            }
            httpURLConnection.setRequestProperty("User-Agent", GraphRequest.f11450l);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* JADX INFO: renamed from: c */
        public static ArrayList m6617c(C8009s c8009s) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionM6630p;
            ArrayList arrayListM6618d;
            C5056a0.m10745c(c8009s);
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionM6630p = m6630p(c8009s);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionM6630p = null;
            } catch (Throwable th2) {
                th = th2;
                C5086z.m10826k(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionM6630p != null) {
                    arrayListM6618d = m6618d(c8009s, httpURLConnectionM6630p);
                } else {
                    int i10 = C8010t.f43585e;
                    ArrayList arrayListM15884a = C8010t.a.m15884a(c8009s.f43583c, null, new FacebookException(exc));
                    m6627m(c8009s, arrayListM15884a);
                    arrayListM6618d = arrayListM15884a;
                }
                C5086z.m10826k(httpURLConnectionM6630p);
                return arrayListM6618d;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionM6630p;
                C5086z.m10826k(httpURLConnection);
                throw th;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public static ArrayList m6618d(C8009s c8009s, HttpURLConnection httpURLConnection) throws Throwable {
            Exception e10;
            InputStream errorStream;
            FacebookException e11;
            ArrayList arrayListM15884a;
            boolean z10;
            C5207g.m11111f(httpURLConnection, "connection");
            C5207g.m11111f(c8009s, "requests");
            int i10 = C8010t.f43585e;
            InputStream inputStream = null;
            try {
                try {
                    if (!C8004n.m15877g()) {
                        Log.e("o7.t", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    try {
                        arrayListM15884a = C8010t.a.m15886c(errorStream, httpURLConnection, c8009s);
                    } catch (FacebookException e12) {
                        e11 = e12;
                        C5078r.f32986e.m10781c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e11);
                        arrayListM15884a = C8010t.a.m15884a(c8009s, httpURLConnection, e11);
                    } catch (Exception e13) {
                        e10 = e13;
                        C5078r.f32986e.m10781c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e10);
                        arrayListM15884a = C8010t.a.m15884a(c8009s, httpURLConnection, new FacebookException(e10));
                    }
                    C5086z.m10820e(errorStream);
                    C5086z.m10826k(httpURLConnection);
                    int size = c8009s.size();
                    if (size != arrayListM15884a.size()) {
                        throw new FacebookException(C0141b.m613i(new Object[]{Integer.valueOf(arrayListM15884a.size()), Integer.valueOf(size)}, 2, Locale.US, "Received %d responses while expecting %d", "java.lang.String.format(locale, format, *args)"));
                    }
                    m6627m(c8009s, arrayListM15884a);
                    C7995e c7995eM15863a = C7995e.f43517f.m15863a();
                    AccessToken accessToken = c7995eM15863a.f43521c;
                    if (accessToken != null) {
                        long time = new Date().getTime();
                        z10 = accessToken.f11376f.getCanExtendToken() && time - c7995eM15863a.f43523e.getTime() > 3600000 && time - accessToken.f11377g.getTime() > 86400000;
                    }
                    if (z10) {
                        if (C5207g.m11106a(Looper.getMainLooper(), Looper.myLooper())) {
                            c7995eM15863a.m15860a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new RunnableC6590j(c7995eM15863a, 3, inputStream));
                        }
                    }
                    return arrayListM15884a;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = errorStream;
                    C5086z.m10820e(inputStream);
                    throw th;
                }
            } catch (FacebookException e14) {
                e11 = e14;
                errorStream = null;
            } catch (Exception e15) {
                e10 = e15;
                errorStream = null;
            } catch (Throwable th3) {
                th = th3;
                C5086z.m10820e(inputStream);
                throw th;
            }
        }

        /* JADX INFO: renamed from: e */
        public static boolean m6619e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m6620f(Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public static GraphRequest m6621g(AccessToken accessToken, String str, InterfaceC2278b interfaceC2278b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC2278b, 32);
        }

        /* JADX INFO: renamed from: h */
        public static GraphRequest m6622h(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC2278b interfaceC2278b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, interfaceC2278b, 32);
            graphRequest.f11453c = jSONObject;
            return graphRequest;
        }

        /* JADX INFO: renamed from: i */
        public static GraphRequest m6623i(String str, Bundle bundle, InterfaceC2278b interfaceC2278b) {
            return new GraphRequest(null, str, bundle, HttpMethod.POST, interfaceC2278b, 32);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX INFO: renamed from: j */
        public static void m6624j(JSONObject jSONObject, String str, InterfaceC2280d interfaceC2280d) {
            String strGroup;
            boolean z10;
            Matcher matcher = GraphRequest.f11449k.matcher(str);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                C5207g.m11110e(strGroup, "matcher.group(1)");
            } else {
                strGroup = str;
            }
            if (C7661i.m15256V2(strGroup, "me/", false) || C7661i.m15256V2(strGroup, "/me/", false)) {
                int iM14285e3 = C7076b.m14285e3(str, ":", 0, false, 6);
                int iM14285e4 = C7076b.m14285e3(str, "?", 0, false, 6);
                if (iM14285e3 <= 3 || (iM14285e4 != -1 && iM14285e3 >= iM14285e4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                boolean z11 = z10 && C7661i.m15249O2(next, "image");
                C5207g.m11110e(next, "key");
                C5207g.m11110e(objOpt, "value");
                m6625k(next, objOpt, interfaceC2280d, z11);
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m6625k(String str, Object obj, InterfaceC2280d interfaceC2280d, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strM770q = C0166e.m770q(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        C5207g.m11110e(objOpt, "jsonObject.opt(propertyName)");
                        m6625k(strM770q, objOpt, interfaceC2280d, z10);
                    }
                } else if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    C5207g.m11110e(strOptString, "jsonObject.optString(\"id\")");
                    m6625k(str, strOptString, interfaceC2280d, z10);
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    C5207g.m11110e(strOptString2, "jsonObject.optString(\"url\")");
                    m6625k(str, strOptString2, interfaceC2280d, z10);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String string = jSONObject.toString();
                    C5207g.m11110e(string, "jsonObject.toString()");
                    m6625k(str, string, interfaceC2280d, z10);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String strM613i = C0141b.m613i(new Object[]{str, Integer.valueOf(i10)}, 2, Locale.ROOT, "%s[%d]", "java.lang.String.format(locale, format, *args)");
                        Object objOpt2 = jSONArray.opt(i10);
                        C5207g.m11110e(objOpt2, "jsonArray.opt(i)");
                        m6625k(strM613i, objOpt2, interfaceC2280d, z10);
                        if (i11 >= length) {
                            return;
                        } else {
                            i10 = i11;
                        }
                    }
                }
            } else {
                if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                    if (Date.class.isAssignableFrom(cls)) {
                        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                        C5207g.m11110e(str2, "iso8601DateFormat.format(date)");
                        interfaceC2280d.mo6631a(str, str2);
                        return;
                    } else {
                        C5086z c5086z = C5086z.f33015a;
                        String str3 = GraphRequest.f11448j;
                        C5086z.m10807F("GraphRequest", "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                        return;
                    }
                }
                interfaceC2280d.mo6631a(str, obj.toString());
            }
        }

        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX INFO: renamed from: l */
        public static void m6626l(C8009s c8009s, C5078r c5078r, int i10, URL url, OutputStream outputStream, boolean z10) throws JSONException, IOException {
            String strM15872b;
            C2282f c2282f = new C2282f(outputStream, c5078r, z10);
            int i11 = 1;
            if (i10 == 1) {
                GraphRequest graphRequest = (GraphRequest) c8009s.f43583c.get(0);
                HashMap map = new HashMap();
                for (String str : graphRequest.f11454d.keySet()) {
                    Object obj = graphRequest.f11454d.get(str);
                    if (m6619e(obj)) {
                        C5207g.m11110e(str, "key");
                        map.put(str, new C2277a(graphRequest, obj));
                    }
                }
                if (c5078r != null) {
                    c5078r.m10776a("  Parameters:\n");
                }
                Bundle bundle = graphRequest.f11454d;
                for (String str2 : bundle.keySet()) {
                    Object obj2 = bundle.get(str2);
                    if (m6620f(obj2)) {
                        C5207g.m11110e(str2, "key");
                        c2282f.m6638g(str2, obj2, graphRequest);
                    }
                }
                if (c5078r != null) {
                    c5078r.m10776a("  Attachments:\n");
                }
                m6628n(map, c2282f);
                JSONObject jSONObject = graphRequest.f11453c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    C5207g.m11110e(path, "url.path");
                    m6624j(jSONObject, path, c2282f);
                    return;
                }
                return;
            }
            Iterator<GraphRequest> it = c8009s.iterator();
            while (true) {
                if (it.hasNext()) {
                    AccessToken accessToken = it.next().f11451a;
                    if (accessToken != null) {
                        strM15872b = accessToken.f11378h;
                        break;
                    }
                } else {
                    String str3 = GraphRequest.f11448j;
                    strM15872b = C8004n.m15872b();
                    break;
                }
            }
            if (strM15872b.length() == 0) {
                throw new FacebookException("App ID was not specified at the request or Settings.");
            }
            c2282f.mo6631a("batch_app_id", strM15872b);
            HashMap map2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest graphRequest2 : c8009s) {
                graphRequest2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                int i12 = C5083w.f33011a;
                Object[] objArr = new Object[i11];
                objArr[0] = C8004n.m15875e();
                String str4 = String.format("https://graph.%s", Arrays.copyOf(objArr, i11));
                C5207g.m11110e(str4, "java.lang.String.format(format, *args)");
                String strM6610h = graphRequest2.m6610h(str4);
                graphRequest2.m6604a();
                Uri uri = Uri.parse(graphRequest2.m6605b(strM6610h, i11));
                int i13 = 2;
                Object[] objArr2 = new Object[2];
                objArr2[0] = uri.getPath();
                objArr2[i11] = uri.getQuery();
                String str5 = String.format("%s?%s", Arrays.copyOf(objArr2, 2));
                C5207g.m11110e(str5, "java.lang.String.format(format, *args)");
                jSONObject2.put("relative_url", str5);
                jSONObject2.put("method", graphRequest2.f11458h);
                AccessToken accessToken2 = graphRequest2.f11451a;
                if (accessToken2 != null) {
                    C5078r.f32986e.m10782d(accessToken2.f11375e);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = graphRequest2.f11454d.keySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String str6 = GraphRequest.f11448j;
                    if (!zHasNext) {
                        break;
                    }
                    Object obj3 = graphRequest2.f11454d.get(it2.next());
                    if (m6619e(obj3)) {
                        Locale locale = Locale.ROOT;
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = "file";
                        objArr3[1] = Integer.valueOf(map2.size());
                        String str7 = String.format(locale, "%s%d", Arrays.copyOf(objArr3, i13));
                        C5207g.m11110e(str7, "java.lang.String.format(locale, format, *args)");
                        arrayList.add(str7);
                        map2.put(str7, new C2277a(graphRequest2, obj3));
                    }
                    i13 = 2;
                }
                if (!arrayList.isEmpty()) {
                    jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                }
                JSONObject jSONObject3 = graphRequest2.f11453c;
                if (jSONObject3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    m6624j(jSONObject3, str5, new C8007q(arrayList2));
                    jSONObject2.put("body", TextUtils.join("&", arrayList2));
                }
                jSONArray.put(jSONObject2);
                i11 = 1;
            }
            Closeable closeable = c2282f.f11464a;
            if (closeable instanceof InterfaceC8015y) {
                InterfaceC8015y interfaceC8015y = (InterfaceC8015y) closeable;
                c2282f.m6634c("batch", null, null);
                c2282f.m6633b("[", new Object[0]);
                int i14 = 0;
                for (GraphRequest graphRequest3 : c8009s) {
                    int i15 = i14 + 1;
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i14);
                    interfaceC8015y.mo15889a(graphRequest3);
                    if (i14 > 0) {
                        c2282f.m6633b(",%s", jSONObject4.toString());
                    } else {
                        c2282f.m6633b("%s", jSONObject4.toString());
                    }
                    i14 = i15;
                }
                c2282f.m6633b("]", new Object[0]);
                C5078r c5078r2 = c2282f.f11465b;
                if (c5078r2 != null) {
                    String strM11116k = C5207g.m11116k("batch", "    ");
                    String string = jSONArray.toString();
                    C5207g.m11110e(string, "requestJsonArray.toString()");
                    c5078r2.m10777b(string, strM11116k);
                }
            } else {
                String string2 = jSONArray.toString();
                C5207g.m11110e(string2, "requestJsonArray.toString()");
                c2282f.mo6631a("batch", string2);
            }
            if (c5078r != null) {
                c5078r.m10776a("  Attachments:\n");
            }
            m6628n(map2, c2282f);
        }

        /* JADX INFO: renamed from: m */
        public static void m6627m(C8009s c8009s, ArrayList arrayList) {
            C5207g.m11111f(c8009s, "requests");
            int size = c8009s.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    GraphRequest graphRequest = (GraphRequest) c8009s.f43583c.get(i10);
                    if (graphRequest.f11457g != null) {
                        arrayList2.add(new Pair(graphRequest.f11457g, arrayList.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList2.size() > 0) {
                RunnableC6590j runnableC6590j = new RunnableC6590j(arrayList2, 4, c8009s);
                Handler handler = c8009s.f43581a;
                if ((handler == null ? null : Boolean.valueOf(handler.post(runnableC6590j))) == null) {
                    runnableC6590j.run();
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public static void m6628n(HashMap map, C2282f c2282f) throws IOException {
            for (Map.Entry entry : map.entrySet()) {
                String str = GraphRequest.f11448j;
                if (m6619e(((C2277a) entry.getValue()).f11463b)) {
                    c2282f.m6638g((String) entry.getKey(), ((C2277a) entry.getValue()).f11463b, ((C2277a) entry.getValue()).f11462a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:64:0x015a  */
        /* JADX INFO: renamed from: o */
        public static void m6629o(C8009s c8009s, HttpURLConnection httpURLConnection) throws Throwable {
            boolean z10;
            boolean z11;
            FilterOutputStream bufferedOutputStream;
            FilterOutputStream c8014x;
            C5078r c5078r = new C5078r(LoggingBehavior.REQUESTS);
            int size = c8009s.size();
            Iterator<GraphRequest> it = c8009s.iterator();
            loop0: while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                GraphRequest next = it.next();
                Iterator<String> it2 = next.f11454d.keySet().iterator();
                while (it2.hasNext()) {
                    if (m6619e(next.f11454d.get(it2.next()))) {
                        z11 = false;
                        break loop0;
                    }
                }
            }
            FilterOutputStream gZIPOutputStream = null;
            HttpMethod httpMethod = size == 1 ? ((GraphRequest) c8009s.f43583c.get(0)).f11458h : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            httpURLConnection.setRequestMethod(httpMethod.name());
            if (z11) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            } else {
                String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f11448j}, 1));
                C5207g.m11110e(str, "java.lang.String.format(format, *args)");
                httpURLConnection.setRequestProperty("Content-Type", str);
            }
            URL url = httpURLConnection.getURL();
            c5078r.m10776a("Request:\n");
            c5078r.m10777b(c8009s.f43582b, "Id");
            C5207g.m11110e(url, "url");
            c5078r.m10777b(url, "URL");
            String requestMethod = httpURLConnection.getRequestMethod();
            C5207g.m11110e(requestMethod, "connection.requestMethod");
            c5078r.m10777b(requestMethod, "Method");
            String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            C5207g.m11110e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            c5078r.m10777b(requestProperty, "User-Agent");
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            C5207g.m11110e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            c5078r.m10777b(requestProperty2, "Content-Type");
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
            if (!(httpMethod == HttpMethod.POST)) {
                c5078r.m10778c();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z11) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                Iterator it3 = c8009s.f43584d.iterator();
                do {
                    if (!it3.hasNext()) {
                        Iterator<GraphRequest> it4 = c8009s.iterator();
                        do {
                            if (!it4.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!(it4.next().f11457g instanceof InterfaceC2281e));
                    }
                } while (!(((C8009s.a) it3.next()) instanceof C8009s.b));
                if (z10) {
                    C8013w c8013w = new C8013w(c8009s.f43581a);
                    m6626l(c8009s, null, size, url, c8013w, z11);
                    c8014x = new C8014x(gZIPOutputStream, c8009s, c8013w.f43597b, c8013w.f43600e);
                } else {
                    c8014x = gZIPOutputStream;
                }
                try {
                    m6626l(c8009s, c5078r, size, url, c8014x, z11);
                    c8014x.close();
                    c5078r.m10778c();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = c8014x;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = gZIPOutputStream;
            }
        }

        /* JADX INFO: renamed from: p */
        public static HttpURLConnection m6630p(C8009s c8009s) throws Throwable {
            URL url;
            Iterator<GraphRequest> it = c8009s.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            break loop0;
                        } catch (MalformedURLException e10) {
                            throw new FacebookException("could not construct URL for request", e10);
                        }
                    }
                    GraphRequest next = it.next();
                    if (HttpMethod.GET != next.f11458h) {
                        break;
                    }
                    C5086z c5086z = C5086z.f33015a;
                    if (!C5086z.m10802A(next.f11454d.getString("fields"))) {
                        break;
                    }
                    C5078r.a aVar = C5078r.f32986e;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder("GET requests for /");
                    String str = next.f11452b;
                    if (str == null) {
                        str = "";
                    }
                    aVar.m10779a(loggingBehavior, 5, "Request", C0009a.m23l(sb2, str, " should contain an explicit \"fields\" parameter."));
                }
            }
            if (c8009s.size() == 1) {
                url = new URL(((GraphRequest) c8009s.f43583c.get(0)).m6609g());
            } else {
                int i10 = C5083w.f33011a;
                String str2 = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C8004n.m15875e()}, 1));
                C5207g.m11110e(str2, "java.lang.String.format(format, *args)");
                url = new URL(str2);
            }
            HttpURLConnection httpURLConnectionM6616b = null;
            try {
                httpURLConnectionM6616b = m6616b(url);
                m6629o(c8009s, httpURLConnectionM6616b);
                return httpURLConnectionM6616b;
            } catch (IOException e11) {
                C5086z.m10826k(httpURLConnectionM6616b);
                throw new FacebookException("could not construct request body", e11);
            } catch (JSONException e12) {
                C5086z.m10826k(httpURLConnectionM6616b);
                throw new FacebookException("could not construct request body", e12);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$d */
    public interface InterfaceC2280d {
        /* JADX INFO: renamed from: a */
        void mo6631a(String str, String str2);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$e */
    public interface InterfaceC2281e extends InterfaceC2278b {
        /* JADX INFO: renamed from: c */
        void m6632c();
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$f */
    public static final class C2282f implements InterfaceC2280d {

        /* JADX INFO: renamed from: a */
        public final OutputStream f11464a;

        /* JADX INFO: renamed from: b */
        public final C5078r f11465b;

        /* JADX INFO: renamed from: c */
        public boolean f11466c = true;

        /* JADX INFO: renamed from: d */
        public final boolean f11467d;

        public C2282f(OutputStream outputStream, C5078r c5078r, boolean z10) {
            this.f11464a = outputStream;
            this.f11465b = c5078r;
            this.f11467d = z10;
        }

        @Override // com.facebook.GraphRequest.InterfaceC2280d
        /* JADX INFO: renamed from: a */
        public final void mo6631a(String str, String str2) throws IOException {
            C5207g.m11111f(str, "key");
            C5207g.m11111f(str2, "value");
            m6634c(str, null, null);
            m6637f("%s", str2);
            m6639h();
            C5078r c5078r = this.f11465b;
            if (c5078r == null) {
                return;
            }
            c5078r.m10777b(str2, C5207g.m11116k(str, "    "));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final void m6633b(String str, Object... objArr) throws IOException {
            C5207g.m11111f(objArr, "args");
            boolean z10 = this.f11467d;
            OutputStream outputStream = this.f11464a;
            if (z10) {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                C5207g.m11110e(str2, "java.lang.String.format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                C5207g.m11110e(strEncode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(C7653a.f42116b);
                C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f11466c) {
                Charset charset = C7653a.f42116b;
                byte[] bytes2 = "--".getBytes(charset);
                C5207g.m11110e(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes2);
                String str3 = GraphRequest.f11448j;
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str3.getBytes(charset);
                C5207g.m11110e(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes3);
                byte[] bytes4 = "\r\n".getBytes(charset);
                C5207g.m11110e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                this.f11466c = false;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            byte[] bytes5 = C0166e.m770q(objArrCopyOf2, objArrCopyOf2.length, str, "java.lang.String.format(format, *args)").getBytes(C7653a.f42116b);
            C5207g.m11110e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes5);
        }

        /* JADX INFO: renamed from: c */
        public final void m6634c(String str, String str2, String str3) throws IOException {
            if (this.f11467d) {
                byte[] bytes = C0166e.m770q(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(C7653a.f42116b);
                C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
                this.f11464a.write(bytes);
                return;
            }
            m6633b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m6633b("; filename=\"%s\"", str2);
            }
            m6637f("", new Object[0]);
            if (str3 != null) {
                m6637f("%s: %s", "Content-Type", str3);
            }
            m6637f("", new Object[0]);
        }

        /* JADX INFO: renamed from: d */
        public final void m6635d(Uri uri, String str, String str2) throws IOException {
            int iM10825j;
            long j10;
            C5207g.m11111f(str, "key");
            C5207g.m11111f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m6634c(str, str, str2);
            OutputStream outputStream = this.f11464a;
            if (outputStream instanceof C8013w) {
                C5086z c5086z = C5086z.f33015a;
                Cursor cursorQuery = null;
                try {
                    cursorQuery = C8004n.m15871a().getContentResolver().query(uri, null, null, null, null);
                    if (cursorQuery == null) {
                        j10 = 0;
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        cursorQuery.moveToFirst();
                        j10 = cursorQuery.getLong(columnIndex);
                        cursorQuery.close();
                    }
                    ((C8013w) outputStream).m15890b(j10);
                    iM10825j = 0;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } else {
                InputStream inputStreamOpenInputStream = C8004n.m15871a().getContentResolver().openInputStream(uri);
                C5086z c5086z2 = C5086z.f33015a;
                iM10825j = C5086z.m10825j(inputStreamOpenInputStream, outputStream) + 0;
            }
            m6637f("", new Object[0]);
            m6639h();
            C5078r c5078r = this.f11465b;
            if (c5078r == null) {
                return;
            }
            String strM11116k = C5207g.m11116k(str, "    ");
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM10825j)}, 1));
            C5207g.m11110e(str3, "java.lang.String.format(locale, format, *args)");
            c5078r.m10777b(str3, strM11116k);
        }

        /* JADX INFO: renamed from: e */
        public final void m6636e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iM10825j;
            C5207g.m11111f(str, "key");
            C5207g.m11111f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m6634c(str, str, str2);
            OutputStream outputStream = this.f11464a;
            if (outputStream instanceof C8013w) {
                ((C8013w) outputStream).m15890b(parcelFileDescriptor.getStatSize());
                iM10825j = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                C5086z c5086z = C5086z.f33015a;
                iM10825j = C5086z.m10825j(autoCloseInputStream, outputStream) + 0;
            }
            m6637f("", new Object[0]);
            m6639h();
            C5078r c5078r = this.f11465b;
            if (c5078r == null) {
                return;
            }
            String strM11116k = C5207g.m11116k(str, "    ");
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM10825j)}, 1));
            C5207g.m11110e(str3, "java.lang.String.format(locale, format, *args)");
            c5078r.m10777b(str3, strM11116k);
        }

        /* JADX INFO: renamed from: f */
        public final void m6637f(String str, Object... objArr) throws IOException {
            m6633b(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f11467d) {
                return;
            }
            m6633b("\r\n", new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public final void m6638g(String str, Object obj, GraphRequest graphRequest) throws IOException {
            C5207g.m11111f(str, "key");
            OutputStream outputStream = this.f11464a;
            if (outputStream instanceof InterfaceC8015y) {
                ((InterfaceC8015y) outputStream).mo15889a(graphRequest);
            }
            String str2 = GraphRequest.f11448j;
            if (C2279c.m6620f(obj)) {
                mo6631a(str, C2279c.m6615a(obj));
                return;
            }
            boolean z10 = obj instanceof Bitmap;
            C5078r c5078r = this.f11465b;
            if (z10) {
                Bitmap bitmap = (Bitmap) obj;
                C5207g.m11111f(bitmap, "bitmap");
                m6634c(str, str, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                m6637f("", new Object[0]);
                m6639h();
                if (c5078r == null) {
                    return;
                }
                c5078r.m10777b("<Image>", C5207g.m11116k(str, "    "));
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                C5207g.m11111f(bArr, "bytes");
                m6634c(str, str, "content/unknown");
                outputStream.write(bArr);
                m6637f("", new Object[0]);
                m6639h();
                if (c5078r == null) {
                    return;
                }
                String strM11116k = C5207g.m11116k(str, "    ");
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                C5207g.m11110e(str3, "java.lang.String.format(locale, format, *args)");
                c5078r.m10777b(str3, strM11116k);
                return;
            }
            if (obj instanceof Uri) {
                m6635d((Uri) obj, str, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m6636e(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            RESOURCE resource = parcelableResourceWithMimeType.f11461b;
            boolean z11 = resource instanceof ParcelFileDescriptor;
            String str4 = parcelableResourceWithMimeType.f11460a;
            if (z11) {
                m6636e(str, (ParcelFileDescriptor) resource, str4);
            } else {
                if (!(resource instanceof Uri)) {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
                m6635d((Uri) resource, str, str4);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m6639h() throws IOException {
            if (!this.f11467d) {
                m6637f("--%s", GraphRequest.f11448j);
                return;
            }
            byte[] bytes = "&".getBytes(C7653a.f42116b);
            C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f11464a.write(bytes);
        }
    }

    static {
        new C2279c();
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C5207g.m11110e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < iNextInt);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "buffer.toString()");
        f11448j = string;
        f11449k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, 63);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, InterfaceC2278b interfaceC2278b, int i10) {
        accessToken = (i10 & 1) != 0 ? null : accessToken;
        str = (i10 & 2) != 0 ? null : str;
        bundle = (i10 & 4) != 0 ? null : bundle;
        httpMethod = (i10 & 8) != 0 ? null : httpMethod;
        interfaceC2278b = (i10 & 16) != 0 ? null : interfaceC2278b;
        this.f11451a = accessToken;
        this.f11452b = str;
        this.f11456f = null;
        m6612j(interfaceC2278b);
        m6613k(httpMethod);
        if (bundle != null) {
            this.f11454d = new Bundle(bundle);
        } else {
            this.f11454d = new Bundle();
        }
        this.f11456f = C8004n.m15874d();
    }

    /* JADX INFO: renamed from: f */
    public static String m6603f() {
        String strM15872b = C8004n.m15872b();
        C5056a0.m10747e();
        String str = C8004n.f43556g;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        boolean z10 = true;
        if (strM15872b.length() > 0) {
            if (str.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                return strM15872b + '|' + str;
            }
        }
        C5086z.m10807F("GraphRequest", "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m6604a() {
        String strM6608e;
        String str;
        Bundle bundle = this.f11454d;
        String strM6608e2 = m6608e();
        boolean z10 = false;
        boolean zM14278X2 = strM6608e2 == null ? false : C7076b.m14278X2(strM6608e2, "|", false);
        if (!((strM6608e2 == null || !C7661i.m15256V2(strM6608e2, "IG", false) || zM14278X2) ? false : true) || !m6611i()) {
            if (!(!C5207g.m11106a(C8004n.m15875e(), "instagram.com") ? true : !m6611i()) && !zM14278X2) {
            }
            if (z10) {
                bundle.putString("access_token", m6603f());
            } else {
                strM6608e = m6608e();
                if (strM6608e != null) {
                    bundle.putString("access_token", strM6608e);
                }
            }
            if (!bundle.containsKey("access_token")) {
                C5086z c5086z = C5086z.f33015a;
                C8004n c8004n = C8004n.f43550a;
                C5056a0.m10747e();
                str = C8004n.f43556g;
                if (str != null) {
                    throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                }
                if (C5086z.m10802A(str)) {
                    Log.w("GraphRequest", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
                }
            }
            bundle.putString("sdk", "android");
            bundle.putString("format", "json");
            C8004n c8004n2 = C8004n.f43550a;
            if (C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
                bundle.putString("debug", "info");
            } else if (C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
                bundle.putString("debug", "warning");
            }
        }
        z10 = true;
        if (z10) {
            bundle.putString("access_token", m6603f());
        } else {
            strM6608e = m6608e();
            if (strM6608e != null) {
                bundle.putString("access_token", strM6608e);
            }
        }
        if (!bundle.containsKey("access_token")) {
            C5086z c5086z2 = C5086z.f33015a;
            C8004n c8004n3 = C8004n.f43550a;
            C5056a0.m10747e();
            str = C8004n.f43556g;
            if (str != null) {
                throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
            if (C5086z.m10802A(str)) {
                Log.w("GraphRequest", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        C8004n c8004n4 = C8004n.f43550a;
        if (C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final String m6605b(String str, boolean z10) {
        if (!z10 && this.f11458h == HttpMethod.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f11454d.keySet()) {
            Object obj = this.f11454d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (C2279c.m6620f(obj)) {
                builderBuildUpon.appendQueryParameter(str2, C2279c.m6615a(obj).toString());
            } else if (this.f11458h != HttpMethod.GET) {
                throw new IllegalArgumentException(C0141b.m613i(new Object[]{obj.getClass().getSimpleName()}, 1, Locale.US, "Unsupported parameter type for GET request: %s", "java.lang.String.format(locale, format, *args)"));
            }
        }
        String string = builderBuildUpon.toString();
        C5207g.m11110e(string, "uriBuilder.toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C8010t m6606c() throws Throwable {
        List listM13391w0 = C6744b.m13391w0(new GraphRequest[]{this});
        C5207g.m11111f(listM13391w0, "requests");
        ArrayList arrayListM6617c = C2279c.m6617c(new C8009s(listM13391w0));
        if (arrayListM6617c.size() == 1) {
            return (C8010t) arrayListM6617c.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* JADX INFO: renamed from: d */
    public final AsyncTaskC8008r m6607d() {
        List listM13391w0 = C6744b.m13391w0(new GraphRequest[]{this});
        C5207g.m11111f(listM13391w0, "requests");
        C8009s c8009s = new C8009s(listM13391w0);
        C5056a0.m10745c(c8009s);
        AsyncTaskC8008r asyncTaskC8008r = new AsyncTaskC8008r(c8009s);
        asyncTaskC8008r.executeOnExecutor(C8004n.m15873c(), new Void[0]);
        return asyncTaskC8008r;
    }

    /* JADX INFO: renamed from: e */
    public final String m6608e() {
        AccessToken accessToken = this.f11451a;
        if (accessToken != null) {
            if (!this.f11454d.containsKey("access_token")) {
                C5078r.a aVar = C5078r.f32986e;
                String str = accessToken.f11375e;
                aVar.m10782d(str);
                return str;
            }
        } else if (!this.f11454d.containsKey("access_token")) {
            return m6603f();
        }
        return this.f11454d.getString("access_token");
    }

    /* JADX INFO: renamed from: g */
    public final String m6609g() {
        String strM770q;
        String str;
        if (this.f11458h == HttpMethod.POST && (str = this.f11452b) != null && C7661i.m15248N2(str, "/videos")) {
            int i10 = C5083w.f33011a;
            strM770q = C0166e.m770q(new Object[]{C8004n.m15875e()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            int i11 = C5083w.f33011a;
            String strM15875e = C8004n.m15875e();
            C5207g.m11111f(strM15875e, "subdomain");
            strM770q = C0166e.m770q(new Object[]{strM15875e}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String strM6610h = m6610h(strM770q);
        m6604a();
        return m6605b(strM6610h, false);
    }

    /* JADX INFO: renamed from: h */
    public final String m6610h(String str) {
        if (!(!C5207g.m11106a(C8004n.m15875e(), "instagram.com") ? true : !m6611i())) {
            int i10 = C5083w.f33011a;
            str = C0166e.m770q(new Object[]{C8004n.f43569t}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Pattern pattern = f11449k;
        String strM770q = this.f11452b;
        if (!pattern.matcher(strM770q).matches()) {
            strM770q = C0166e.m770q(new Object[]{this.f11456f, strM770q}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = strM770q;
        return C0166e.m770q(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6611i() {
        String str = this.f11452b;
        if (str == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("^/?");
        sb2.append(C8004n.m15872b());
        sb2.append("/?.*");
        return this.f11459i || Pattern.matches(sb2.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    /* JADX INFO: renamed from: j */
    public final void m6612j(InterfaceC2278b interfaceC2278b) {
        C8004n c8004n = C8004n.f43550a;
        if (!C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !C8004n.m15879i(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f11457g = interfaceC2278b;
            return;
        }
        this.f11457g = new C8005o(0, interfaceC2278b);
    }

    /* JADX INFO: renamed from: k */
    public final void m6613k(HttpMethod httpMethod) {
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.f11458h = httpMethod;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f11451a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f11452b);
        sb2.append(", graphObject: ");
        sb2.append(this.f11453c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f11458h);
        sb2.append(", parameters: ");
        sb2.append(this.f11454d);
        sb2.append("}");
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }
}
