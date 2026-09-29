package p410u8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.media.session.C0166e;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.activity.result.C0204c;
import com.google.android.datatransport.cct.internal.C2339a;
import com.google.android.datatransport.cct.internal.C2340b;
import com.google.android.datatransport.cct.internal.C2341c;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C2342a;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p010a9.C0051a;
import p113f9.InterfaceC5478a;
import p118fe.C5509a;
import p395t8.C9220b;
import p432v8.AbstractC9674g;
import p432v8.AbstractC9677j;
import p432v8.C9669b;
import p432v8.C9670c;
import p432v8.C9671d;
import p432v8.C9672e;
import p452w8.AbstractC9833n;
import p452w8.C9827h;
import p452w8.C9832m;
import p477x8.C10114a;
import p477x8.InterfaceC10124k;
import p483xe.C10181d;
import p483xe.C10182e;

/* JADX INFO: renamed from: u8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9477b implements InterfaceC10124k {

    /* JADX INFO: renamed from: a */
    public final C10181d f48590a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f48591b;

    /* JADX INFO: renamed from: c */
    public final Context f48592c;

    /* JADX INFO: renamed from: d */
    public final URL f48593d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5478a f48594e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5478a f48595f;

    /* JADX INFO: renamed from: g */
    public final int f48596g;

    /* JADX INFO: renamed from: u8.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final URL f48597a;

        /* JADX INFO: renamed from: b */
        public final AbstractC9674g f48598b;

        /* JADX INFO: renamed from: c */
        public final String f48599c;

        public a(URL url, AbstractC9674g abstractC9674g, String str) {
            this.f48597a = url;
            this.f48598b = abstractC9674g;
            this.f48599c = str;
        }
    }

    /* JADX INFO: renamed from: u8.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f48600a;

        /* JADX INFO: renamed from: b */
        public final URL f48601b;

        /* JADX INFO: renamed from: c */
        public final long f48602c;

        public b(int i10, URL url, long j10) {
            this.f48600a = i10;
            this.f48601b = url;
            this.f48602c = j10;
        }
    }

    public C9477b(Context context, InterfaceC5478a interfaceC5478a, InterfaceC5478a interfaceC5478a2) {
        C10182e c10182e = new C10182e();
        C2339a.f11733a.m6756a(c10182e);
        c10182e.f51506d = true;
        this.f48590a = new C10181d(c10182e);
        this.f48592c = context;
        this.f48591b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = C9476a.f48585c;
        try {
            this.f48593d = new URL(str);
            this.f48594e = interfaceC5478a2;
            this.f48595f = interfaceC5478a;
            this.f48596g = 130000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(C0204c.m852k("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p477x8.InterfaceC10124k
    /* JADX INFO: renamed from: a */
    public final C9827h mo17899a(AbstractC9833n abstractC9833n) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f48591b.getActiveNetworkInfo();
        C9827h.a aVarM18327i = abstractC9833n.m18327i();
        int i10 = Build.VERSION.SDK_INT;
        Map<String, String> map = aVarM18327i.f50019f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i10));
        aVarM18327i.m18328a("model", Build.MODEL);
        aVarM18327i.m18328a("hardware", Build.HARDWARE);
        aVarM18327i.m18328a("device", Build.DEVICE);
        aVarM18327i.m18328a("product", Build.PRODUCT);
        aVarM18327i.m18328a("os-uild", Build.ID);
        aVarM18327i.m18328a("manufacturer", Build.MANUFACTURER);
        aVarM18327i.m18328a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        Map<String, String> map2 = aVarM18327i.f50019f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : activeNetworkInfo.getType();
        Map<String, String> map3 = aVarM18327i.f50019f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(value));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        Map<String, String> map4 = aVarM18327i.f50019f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        aVarM18327i.m18328a("country", Locale.getDefault().getCountry());
        aVarM18327i.m18328a("locale", Locale.getDefault().getLanguage());
        Context context = this.f48592c;
        aVarM18327i.m18328a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C0051a.m209b("CctTransportBackend", "Unable to find version code for package", e10);
        }
        aVarM18327i.m18328a("application_build", Integer.toString(i11));
        return aVarM18327i.m18311b();
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0447 A[Catch: IOException -> 0x049a, TryCatch #2 {IOException -> 0x049a, blocks: (B:78:0x02a1, B:81:0x02b1, B:85:0x02c7, B:86:0x02d5, B:88:0x031b, B:95:0x0340, B:97:0x0352, B:98:0x0362, B:107:0x0389, B:168:0x0443, B:170:0x0447, B:173:0x0456, B:175:0x045b, B:177:0x0463, B:186:0x047c, B:188:0x0486, B:190:0x0490, B:108:0x0394, B:118:0x03c7, B:137:0x03e8, B:136:0x03e5, B:138:0x03e9, B:165:0x041f, B:167:0x0433, B:132:0x03df, B:109:0x0398, B:111:0x03a2, B:116:0x03c2, B:128:0x03da, B:127:0x03d7), top: B:197:0x02a1, inners: #5, #14 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0456 A[Catch: IOException -> 0x049a, TryCatch #2 {IOException -> 0x049a, blocks: (B:78:0x02a1, B:81:0x02b1, B:85:0x02c7, B:86:0x02d5, B:88:0x031b, B:95:0x0340, B:97:0x0352, B:98:0x0362, B:107:0x0389, B:168:0x0443, B:170:0x0447, B:173:0x0456, B:175:0x045b, B:177:0x0463, B:186:0x047c, B:188:0x0486, B:190:0x0490, B:108:0x0394, B:118:0x03c7, B:137:0x03e8, B:136:0x03e5, B:138:0x03e9, B:165:0x041f, B:167:0x0433, B:132:0x03df, B:109:0x0398, B:111:0x03a2, B:116:0x03c2, B:128:0x03da, B:127:0x03d7), top: B:197:0x02a1, inners: #5, #14 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0463 A[Catch: IOException -> 0x049a, TryCatch #2 {IOException -> 0x049a, blocks: (B:78:0x02a1, B:81:0x02b1, B:85:0x02c7, B:86:0x02d5, B:88:0x031b, B:95:0x0340, B:97:0x0352, B:98:0x0362, B:107:0x0389, B:168:0x0443, B:170:0x0447, B:173:0x0456, B:175:0x045b, B:177:0x0463, B:186:0x047c, B:188:0x0486, B:190:0x0490, B:108:0x0394, B:118:0x03c7, B:137:0x03e8, B:136:0x03e5, B:138:0x03e9, B:165:0x041f, B:167:0x0433, B:132:0x03df, B:109:0x0398, B:111:0x03a2, B:116:0x03c2, B:128:0x03da, B:127:0x03d7), top: B:197:0x02a1, inners: #5, #14 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x046d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0473  */
    /* JADX WARN: Code duplicated, block: B:186:0x047c A[Catch: IOException -> 0x049a, TryCatch #2 {IOException -> 0x049a, blocks: (B:78:0x02a1, B:81:0x02b1, B:85:0x02c7, B:86:0x02d5, B:88:0x031b, B:95:0x0340, B:97:0x0352, B:98:0x0362, B:107:0x0389, B:168:0x0443, B:170:0x0447, B:173:0x0456, B:175:0x045b, B:177:0x0463, B:186:0x047c, B:188:0x0486, B:190:0x0490, B:108:0x0394, B:118:0x03c7, B:137:0x03e8, B:136:0x03e5, B:138:0x03e9, B:165:0x041f, B:167:0x0433, B:132:0x03df, B:109:0x0398, B:111:0x03a2, B:116:0x03c2, B:128:0x03da, B:127:0x03d7), top: B:197:0x02a1, inners: #5, #14 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0486 A[Catch: IOException -> 0x049a, TryCatch #2 {IOException -> 0x049a, blocks: (B:78:0x02a1, B:81:0x02b1, B:85:0x02c7, B:86:0x02d5, B:88:0x031b, B:95:0x0340, B:97:0x0352, B:98:0x0362, B:107:0x0389, B:168:0x0443, B:170:0x0447, B:173:0x0456, B:175:0x045b, B:177:0x0463, B:186:0x047c, B:188:0x0486, B:190:0x0490, B:108:0x0394, B:118:0x03c7, B:137:0x03e8, B:136:0x03e5, B:138:0x03e9, B:165:0x041f, B:167:0x0433, B:132:0x03df, B:109:0x0398, B:111:0x03a2, B:116:0x03c2, B:128:0x03da, B:127:0x03d7), top: B:197:0x02a1, inners: #5, #14 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x045b A[EDGE_INSN: B:235:0x045b->B:175:0x045b BREAK  A[LOOP:3: B:80:0x02af->B:237:?], SYNTHETIC] */
    @Override // p477x8.InterfaceC10124k
    /* JADX INFO: renamed from: b */
    public final C2342a mo17900b(C10114a c10114a) {
        String str;
        b bVar;
        a aVar;
        URL url;
        int i10;
        String str2;
        Integer numValueOf;
        C9671d.a aVar2;
        HashMap map = new HashMap();
        for (AbstractC9833n abstractC9833n : c10114a.f51289a) {
            String strMo18309g = abstractC9833n.mo18309g();
            if (map.containsKey(strMo18309g)) {
                ((List) map.get(strMo18309g)).add(abstractC9833n);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC9833n);
                map.put(strMo18309g, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC9833n abstractC9833n2 = (AbstractC9833n) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            Long lValueOf = Long.valueOf(this.f48595f.mo11713a());
            Long lValueOf2 = Long.valueOf(this.f48594e.mo11713a());
            C2340b c2340b = new C2340b(ClientInfo.ClientType.ANDROID_FIREBASE, new C9669b(Integer.valueOf(abstractC9833n2.m18326f("sdk-version")), abstractC9833n2.m18325a("model"), abstractC9833n2.m18325a("hardware"), abstractC9833n2.m18325a("device"), abstractC9833n2.m18325a("product"), abstractC9833n2.m18325a("os-uild"), abstractC9833n2.m18325a("manufacturer"), abstractC9833n2.m18325a("fingerprint"), abstractC9833n2.m18325a("locale"), abstractC9833n2.m18325a("country"), abstractC9833n2.m18325a("mcc_mnc"), abstractC9833n2.m18325a("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                AbstractC9833n abstractC9833n3 = (AbstractC9833n) it2.next();
                C9832m c9832mMo18307d = abstractC9833n3.mo18307d();
                Iterator it3 = it;
                C9220b c9220b = c9832mMo18307d.f50038a;
                Iterator it4 = it2;
                boolean zEquals = c9220b.equals(new C9220b("proto"));
                byte[] bArr = c9832mMo18307d.f50039b;
                if (zEquals) {
                    aVar2 = new C9671d.a();
                    aVar2.f49530d = bArr;
                } else {
                    if (c9220b.equals(new C9220b("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        C9671d.a aVar3 = new C9671d.a();
                        aVar3.f49531e = str3;
                        aVar2 = aVar3;
                    } else {
                        String strM210c = C0051a.m210c("CctTransportBackend");
                        if (Log.isLoggable(strM210c, 5)) {
                            Log.w(strM210c, String.format("Received event of unsupported encoding %s. Skipping...", c9220b));
                        }
                    }
                    it = it3;
                    it2 = it4;
                }
                aVar2.f49527a = Long.valueOf(abstractC9833n3.mo18308e());
                aVar2.f49529c = Long.valueOf(abstractC9833n3.mo18310h());
                String str4 = abstractC9833n3.mo18305b().get("tz-offset");
                aVar2.f49532f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar2.f49533g = new C2341c(NetworkConnectionInfo.NetworkType.forNumber(abstractC9833n3.m18326f("net-type")), NetworkConnectionInfo.MobileSubtype.forNumber(abstractC9833n3.m18326f("mobile-subtype")));
                if (abstractC9833n3.mo18306c() != null) {
                    aVar2.f49528b = abstractC9833n3.mo18306c();
                }
                String strM765k = aVar2.f49527a == null ? " eventTimeMs" : "";
                if (aVar2.f49529c == null) {
                    strM765k = strM765k.concat(" eventUptimeMs");
                }
                if (aVar2.f49532f == null) {
                    strM765k = C0166e.m765k(strM765k, " timezoneOffsetSeconds");
                }
                if (!strM765k.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strM765k));
                }
                arrayList3.add(new C9671d(aVar2.f49527a.longValue(), aVar2.f49528b, aVar2.f49529c.longValue(), aVar2.f49530d, aVar2.f49531e, aVar2.f49532f.longValue(), aVar2.f49533g));
                it = it3;
                it2 = it4;
            }
            Iterator it5 = it;
            String strConcat = lValueOf == null ? " requestTimeMs" : "";
            if (lValueOf2 == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
            arrayList2.add(new C9672e(lValueOf.longValue(), lValueOf2.longValue(), c2340b, numValueOf, str2, arrayList3, qosTier));
            it = it5;
        }
        C9670c c9670c = new C9670c(arrayList2);
        byte[] bArr2 = c10114a.f51290b;
        URL url2 = this.f48593d;
        if (bArr2 != null) {
            try {
                C9476a c9476aM17897a = C9476a.m17897a(bArr2);
                str = c9476aM17897a.f48589b;
                if (str == null) {
                    str = null;
                }
                String str5 = c9476aM17897a.f48588a;
                if (str5 != null) {
                    try {
                        url2 = new URL(str5);
                    } catch (MalformedURLException e10) {
                        throw new IllegalArgumentException("Invalid url: " + str5, e10);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                return new C2342a(BackendResponse.Status.FATAL_ERROR, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar4 = new a(url2, c9670c, str);
            C5509a c5509a = new C5509a(2, this);
            int i11 = 5;
            a aVar5 = aVar4;
            do {
                AbstractC9674g abstractC9674g = aVar5.f48598b;
                C9477b c9477b = (C9477b) c5509a.f34148b;
                c9477b.getClass();
                String strM210c2 = C0051a.m210c("CctTransportBackend");
                boolean zIsLoggable = Log.isLoggable(strM210c2, 4);
                URL url3 = aVar5.f48597a;
                if (zIsLoggable) {
                    Log.i(strM210c2, String.format("Making request to: %s", url3));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url3.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(c9477b.f48596g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str6 = aVar5.f48599c;
                if (str6 != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str6);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            c9477b.f48590a.m19192a(abstractC9674g, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf2 = Integer.valueOf(responseCode);
                            String strM210c3 = C0051a.m210c("CctTransportBackend");
                            if (Log.isLoggable(strM210c3, 4)) {
                                Log.i(strM210c3, String.format("Status Code: %d", numValueOf2));
                            }
                            C0051a.m208a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                            C0051a.m208a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                bVar = new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            } else if (responseCode != 200) {
                                bVar = new b(responseCode, null, 0L);
                            } else {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        b bVar2 = new b(responseCode, null, AbstractC9677j.m18184a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f49541a);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        bVar = bVar2;
                                    } catch (Throwable th2) {
                                        if (gZIPInputStream == null) {
                                            throw th2;
                                        }
                                        try {
                                            gZIPInputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                        C0051a.m209b("CctTransportBackend", "Could not make request to the backend", e);
                                        return new C2342a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                                    }
                                } catch (Throwable th4) {
                                    if (inputStream == null) {
                                        throw th4;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th9) {
                                th8.addSuppressed(th9);
                            }
                        }
                        throw th8;
                    }
                } catch (EncodingException e11) {
                    e = e11;
                    C0051a.m209b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    bVar = new b(400, null, 0L);
                } catch (ConnectException e12) {
                    e = e12;
                    C0051a.m209b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    bVar = new b(500, null, 0L);
                    aVar = null;
                    url = bVar.f48601b;
                    if (url != null) {
                        C0051a.m208a(url, "CctTransportBackend", "Following redirect to: %s");
                        aVar = new a(url, abstractC9674g, aVar5.f48599c);
                    }
                    aVar5 = aVar;
                    if (aVar5 == null) {
                        break;
                    }
                    i11--;
                    i10 = bVar.f48600a;
                    if (i10 == 200) {
                        return new C2342a(BackendResponse.Status.OK, bVar.f48602c);
                    }
                    if (i10 < 500) {
                        return i10 == 400 ? new C2342a(BackendResponse.Status.INVALID_PAYLOAD, -1L) : new C2342a(BackendResponse.Status.FATAL_ERROR, -1L);
                    }
                    return new C2342a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (UnknownHostException e13) {
                    e = e13;
                    C0051a.m209b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    bVar = new b(500, null, 0L);
                    aVar = null;
                    url = bVar.f48601b;
                    if (url != null) {
                        C0051a.m208a(url, "CctTransportBackend", "Following redirect to: %s");
                        aVar = new a(url, abstractC9674g, aVar5.f48599c);
                    }
                    aVar5 = aVar;
                    if (aVar5 == null) {
                        break;
                        break;
                    }
                    i11--;
                    i10 = bVar.f48600a;
                    if (i10 == 200) {
                        return new C2342a(BackendResponse.Status.OK, bVar.f48602c);
                    }
                    if (i10 < 500) {
                        if (i10 == 400) {
                        }
                    }
                    return new C2342a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (IOException e14) {
                    e = e14;
                    C0051a.m209b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    bVar = new b(400, null, 0L);
                }
                aVar = null;
                url = bVar.f48601b;
                if (url != null) {
                    C0051a.m208a(url, "CctTransportBackend", "Following redirect to: %s");
                    aVar = new a(url, abstractC9674g, aVar5.f48599c);
                }
                aVar5 = aVar;
                if (aVar5 == null) {
                    break;
                    break;
                }
                i11--;
            } while (i11 >= 1);
            i10 = bVar.f48600a;
            if (i10 == 200) {
                return new C2342a(BackendResponse.Status.OK, bVar.f48602c);
            }
            if (i10 < 500 && i10 != 404) {
                if (i10 == 400) {
                }
            }
            return new C2342a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        } catch (IOException e15) {
            C0051a.m209b("CctTransportBackend", "Could not make request to the backend", e15);
            return new C2342a(BackendResponse.Status.TRANSIENT_ERROR, -1L);
        }
    }
}
