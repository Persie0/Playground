package p000;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.appevents.FlushReason;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kochava.core.BuildConfig;
import com.kochava.core.json.internal.JsonType;
import com.kochava.tracker.payload.internal.PayloadType;
import com.lingq.R$id;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.core.settings.ViewKeys;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.serialization.KSerializer;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class w41 implements h37, cs4 {

    /* JADX INFO: renamed from: g */
    public static w41 f66360g;

    /* JADX INFO: renamed from: i */
    public static w41 f66362i;

    /* JADX INFO: renamed from: k */
    public static w41 f66364k;

    /* JADX INFO: renamed from: a */
    public Object f66365a;

    /* JADX INFO: renamed from: b */
    public Object f66366b;

    /* JADX INFO: renamed from: c */
    public Object f66367c;

    /* JADX INFO: renamed from: d */
    public Object f66368d;

    /* JADX INFO: renamed from: e */
    public Object f66369e;

    /* JADX INFO: renamed from: f */
    public static final gr7 f66359f = new gr7(8);

    /* JADX INFO: renamed from: h */
    public static final tr3 f66361h = new tr3(6);

    /* JADX INFO: renamed from: j */
    public static final Object f66363j = new Object();

    public w41(C3419on c3419on, vx9 vx9Var, List list, fb2 fb2Var, wa3 wa3Var) {
        int i;
        C3419on c3419on2 = c3419on;
        vx9 vx9Var2 = vx9Var;
        this.f66365a = c3419on2;
        this.f66366b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i2 = 0;
        this.f66367c = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: x46

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ w41 f67758b;

            {
                this.f67758b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                w41 w41Var = this.f67758b;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) w41Var.f66369e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo13025b = ((g37) obj2).f40120a.mo13025b();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fMo13025b2 = ((g37) obj3).f40120a.mo13025b();
                                    if (Float.compare(fMo13025b, fMo13025b2) < 0) {
                                        obj2 = obj3;
                                        fMo13025b = fMo13025b2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        g37 g37Var = (g37) obj;
                        return Float.valueOf(g37Var != null ? g37Var.f40120a.mo13025b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) w41Var.f66369e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13432c = ((g37) obj4).f40120a.f56292i.m13432c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fM13432c2 = ((g37) obj5).f40120a.f56292i.m13432c();
                                    if (Float.compare(fM13432c, fM13432c2) < 0) {
                                        obj4 = obj5;
                                        fM13432c = fM13432c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        g37 g37Var2 = (g37) obj;
                        return Float.valueOf(g37Var2 != null ? g37Var2.f40120a.f56292i.m13432c() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.f66368d = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: x46

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ w41 f67758b;

            {
                this.f67758b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                w41 w41Var = this.f67758b;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) w41Var.f66369e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo13025b = ((g37) obj2).f40120a.mo13025b();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fMo13025b2 = ((g37) obj3).f40120a.mo13025b();
                                    if (Float.compare(fMo13025b, fMo13025b2) < 0) {
                                        obj2 = obj3;
                                        fMo13025b = fMo13025b2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        g37 g37Var = (g37) obj;
                        return Float.valueOf(g37Var != null ? g37Var.f40120a.mo13025b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) w41Var.f66369e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13432c = ((g37) obj4).f40120a.f56292i.m13432c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fM13432c2 = ((g37) obj5).f40120a.f56292i.m13432c();
                                    if (Float.compare(fM13432c, fM13432c2) < 0) {
                                        obj4 = obj5;
                                        fM13432c = fM13432c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        g37 g37Var2 = (g37) obj;
                        return Float.valueOf(g37Var2 != null ? g37Var2.f40120a.f56292i.m13432c() : 0.0f);
                }
            }
        });
        j37 j37Var = vx9Var2.f66066b;
        C3419on c3419on3 = AbstractC3466pn.f56487a;
        ArrayList arrayList = c3419on2.f54606d;
        String str = c3419on2.f54604b;
        EmptyList emptyList = EmptyList.f47638a;
        List listM22614f1 = arrayList != null ? u91.m22614f1(arrayList, new es6(2)) : emptyList;
        ArrayList arrayList2 = new ArrayList();
        C0825bv c0825bv = new C0825bv();
        int size = listM22614f1.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            C3378nn c3378nn = (C3378nn) listM22614f1.get(i4);
            C3378nn c3378nnM17501a = C3378nn.m17501a(c3378nn, j37Var.m14282a((j37) c3378nn.f52979a), i2, 14);
            Object obj = c3378nnM17501a.f52979a;
            int i6 = c3378nnM17501a.f52981c;
            int i7 = c3378nnM17501a.f52980b;
            while (i5 < i7 && !c0825bv.isEmpty()) {
                C3378nn c3378nn2 = (C3378nn) c0825bv.last();
                listM22614f1 = listM22614f1;
                int i8 = c3378nn2.f52981c;
                emptyList = emptyList;
                Object obj2 = c3378nn2.f52979a;
                if (i7 < i8) {
                    arrayList2.add(new C3378nn(obj2, i5, i7));
                    i5 = i7;
                } else {
                    int i9 = size;
                    arrayList2.add(new C3378nn(obj2, i5, i8));
                    i5 = c3378nn2.f52981c;
                    while (!c0825bv.isEmpty() && i5 == ((C3378nn) c0825bv.last()).f52981c) {
                        c0825bv.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listM22614f1;
            EmptyList emptyList2 = emptyList;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new C3378nn(j37Var, i5, i7));
                i5 = i7;
            }
            C3378nn c3378nn3 = (C3378nn) c0825bv.m4188k();
            if (c3378nn3 != null) {
                int i11 = c3378nn3.f52981c;
                Object obj3 = c3378nn3.f52979a;
                int i12 = c3378nn3.f52980b;
                if (i12 == i7 && i11 == i6) {
                    c0825bv.removeLast();
                    c0825bv.addLast(new C3378nn(((j37) obj3).m14282a((j37) obj), i7, i6));
                } else if (i12 == i11) {
                    arrayList2.add(new C3378nn(obj3, i12, i11));
                    c0825bv.removeLast();
                    c0825bv.addLast(new C3378nn(obj, i7, i6));
                } else {
                    if (i11 < i6) {
                        ij6.m13959q();
                        throw null;
                    }
                    c0825bv.addLast(new C3378nn(((j37) obj3).m14282a((j37) obj), i7, i6));
                }
            } else {
                c0825bv.addLast(new C3378nn(obj, i7, i6));
            }
            i4++;
            listM22614f1 = list2;
            emptyList = emptyList2;
            size = i10;
            i2 = 0;
        }
        EmptyList emptyList3 = emptyList;
        while (i5 <= str.length() && !c0825bv.isEmpty()) {
            C3378nn c3378nn4 = (C3378nn) c0825bv.last();
            Object obj4 = c3378nn4.f52979a;
            int i13 = c3378nn4.f52981c;
            arrayList2.add(new C3378nn(obj4, i5, i13));
            while (!c0825bv.isEmpty() && i13 == ((C3378nn) c0825bv.last()).f52981c) {
                c0825bv.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new C3378nn(j37Var, i5, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C3378nn(j37Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            C3378nn c3378nn5 = (C3378nn) arrayList2.get(i14);
            int i15 = c3378nn5.f52980b;
            int i16 = c3378nn5.f52981c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listM19403a = AbstractC3466pn.m19403a(c3419on2, i15, i16, new C2951e4(6));
            C3419on c3419on4 = new C3419on(strSubstring, listM19403a == null ? emptyList3 : listM19403a);
            j37 j37Var2 = (j37) c3378nn5.f52979a;
            if (j37Var2.f45013b == 0) {
                j37Var2 = new j37(j37Var2.f45012a, j37Var.f45013b, j37Var2.f45014c, j37Var2.f45015d, j37Var2.f45016e, j37Var2.f45017f, j37Var2.f45018g, j37Var2.f45019h, j37Var2.f45020i);
            }
            vx9 vx9Var3 = new vx9(vx9Var2.f66065a, j37Var.m14282a(j37Var2));
            List list3 = c3419on4.f54603a;
            List list4 = list3 == null ? emptyList3 : list3;
            List list5 = (List) this.f66366b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                C3378nn c3378nn6 = (C3378nn) list5.get(i17);
                int i18 = c3378nn6.f52980b;
                j37 j37Var3 = j37Var;
                int i19 = c3378nn6.f52981c;
                if (AbstractC3466pn.m19404b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        j54.m14288a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C3378nn(c3378nn6.f52979a, i18 - i15, i19 - i15));
                }
                i17++;
                list5 = list5;
                j37Var = j37Var3;
            }
            arrayList3.add(new g37(new C3462pj(strSubstring, vx9Var3, list4, arrayList4, wa3Var, fb2Var), i15, i16));
            i14++;
            c3419on2 = c3419on;
            vx9Var2 = vx9Var;
            str = str;
        }
        this.f66369e = arrayList3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001d */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rf4 m23703d(InputStream inputStream) {
        ef4 ef4Var;
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, b34.m3245k());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                throw new IOException("Failed to read string from input stream");
            }
            try {
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
        String string = sb.toString();
        Object obj = rf4.f59201b;
        dg4 dg4VarM10329d = dg4.m10329d(string, false);
        if (dg4VarM10329d != null) {
            return new rf4(dg4VarM10329d);
        }
        try {
            ef4Var = new ef4(new JSONArray(string));
        } catch (Exception unused4) {
            ef4Var = null;
        }
        return ef4Var != null ? new rf4(ef4Var) : new rf4(string);
    }

    /* JADX INFO: renamed from: f */
    public static HttpURLConnection m23704f(dg4 dg4Var, Uri uri, HashMap map, int i) throws ProtocolException {
        String property;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setConnectTimeout(BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS);
        httpURLConnection.setReadTimeout(BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(i >= 0);
        if (i >= 0) {
            httpURLConnection.setFixedLengthStreamingMode(i);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestMethod("POST");
            dg4Var.m10331B("method", "POST");
        } else {
            httpURLConnection.setRequestMethod("GET");
            dg4Var.m10331B("method", "GET");
        }
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4Var.m10356z("request_headers", dg4VarM10328c);
        if ((map == null || !map.containsKey("User-Agent")) && (property = System.getProperty("http.agent")) != null) {
            httpURLConnection.setRequestProperty("User-Agent", property);
            dg4VarM10328c.m10331B("User-Agent", property);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                dg4VarM10328c.m10331B((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: m */
    public static w41 m23705m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        w41 w41Var = new w41();
        w41Var.f66368d = new ArrayDeque();
        w41Var.f66365a = sharedPreferences;
        w41Var.f66366b = "topic_operation_queue";
        w41Var.f66367c = ",";
        w41Var.f66369e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) w41Var.f66368d)) {
            try {
                ((ArrayDeque) w41Var.f66368d).clear();
                String string = ((SharedPreferences) w41Var.f66365a).getString((String) w41Var.f66366b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) w41Var.f66367c)) {
                    String[] strArrSplit = string.split((String) w41Var.f66367c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) w41Var.f66368d).add(str);
                        }
                    }
                    return w41Var;
                }
                return w41Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static w41 m23706r(Context context) {
        w41 w41Var;
        synchronized (f66363j) {
            try {
                if (f66364k == null) {
                    f66364k = new w41(context.getApplicationContext());
                }
                w41Var = f66364k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w41Var;
    }

    /* JADX INFO: renamed from: A */
    public void m23707A(EmbeddedMessage embeddedMessage) {
        Object value;
        embeddedMessage.getClass();
        C3244l c3244l = (C3244l) this.f66369e;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, u91.m22602T0((List) value, embeddedMessage)));
        hm5 hm5Var = (hm5) this.f66365a;
        String strM7040a = embeddedMessage.m7035b().m7040a();
        ((C1240a) hm5Var).getClass();
        strM7040a.getClass();
        bl2 bl2Var = fb4.f38769t.m11694e().f57541e;
        bl2Var.getClass();
        kp2 kp2Var = (kp2) ((LinkedHashMap) bl2Var.f8655a).get(strM7040a);
        if (kp2Var == null) {
            eh0.m11135p("EmbeddedSessionManager", "onMessageImpressionEnded: impressionData not found");
        } else if (kp2Var.m15638e() == null) {
            eh0.m11135p("EmbeddedSessionManager", "onMessageImpressionEnded: impressionStarted is null");
        } else {
            bl2.m3817S(kp2Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m23708B() {
        AccessToken accessToken = (AccessToken) this.f66367c;
        if (accessToken == null) {
            return;
        }
        String str = accessToken.f11317k;
        final int i = 0;
        final int i2 = 1;
        if (((AtomicBoolean) this.f66368d).compareAndSet(false, true)) {
            this.f66369e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C2913d3 c2913d3 = new C2913d3();
            final C3818z2 c3818z2 = new C3818z2(atomicBoolean, hashSet, hashSet2, hashSet3);
            final C3280l c3280l = new C3280l(c2913d3, i2);
            final RunnableC0005a3 runnableC0005a3 = new RunnableC0005a3(c2913d3, accessToken, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Bundle bundleM12429f = g9a.m12429f("fields", "permission,status");
            String str2 = mp3.f51688j;
            mp3 mp3VarM21068p = s46.m21068p(accessToken, "me/permissions", c3818z2);
            mp3VarM21068p.f51694d = bundleM12429f;
            HttpMethod httpMethod = HttpMethod.GET;
            mp3VarM21068p.m16989k(httpMethod);
            InterfaceC2950e3 gnaVar = (str == null ? "facebook" : str).equals("instagram") ? new gna() : new bw8();
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", gnaVar.mo4202f());
            bundle.putString("client_id", accessToken.f11314h);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            mp3 mp3VarM21068p2 = s46.m21068p(accessToken, gnaVar.mo4204i(), c3280l);
            mp3VarM21068p2.f51694d = bundle;
            mp3VarM21068p2.m16989k(httpMethod);
            if (fa4.m11650l(str, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                kp3 kp3Var = new kp3() { // from class: b3
                    @Override // p000.kp3
                    /* JADX INFO: renamed from: a */
                    public final void mo3204a(pp3 pp3Var) {
                        int i3 = i;
                        RunnableC0005a3 runnableC0005a4 = runnableC0005a3;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        kp3 kp3Var2 = c3818z2;
                        switch (i3) {
                            case 0:
                                ((C3818z2) kp3Var2).mo3204a(pp3Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    runnableC0005a4.run();
                                }
                                break;
                            default:
                                ((C3280l) kp3Var2).mo3204a(pp3Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    runnableC0005a4.run();
                                }
                                break;
                        }
                    }
                };
                kp3 kp3Var2 = new kp3() { // from class: b3
                    @Override // p000.kp3
                    /* JADX INFO: renamed from: a */
                    public final void mo3204a(pp3 pp3Var) {
                        int i3 = i2;
                        RunnableC0005a3 runnableC0005a4 = runnableC0005a3;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        kp3 kp3Var3 = c3280l;
                        switch (i3) {
                            case 0:
                                ((C3818z2) kp3Var3).mo3204a(pp3Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    runnableC0005a4.run();
                                }
                                break;
                            default:
                                ((C3280l) kp3Var3).mo3204a(pp3Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    runnableC0005a4.run();
                                }
                                break;
                        }
                    }
                };
                mp3VarM21068p.m16988j(kp3Var);
                mp3VarM21068p2.m16988j(kp3Var2);
                mp3VarM21068p.m16983d();
                mp3VarM21068p2.m16983d();
                return;
            }
            op3 op3Var = new op3(mp3VarM21068p, mp3VarM21068p2);
            C0833c3 c0833c3 = new C0833c3(runnableC0005a3);
            ArrayList arrayList = op3Var.f54679d;
            if (!arrayList.contains(c0833c3)) {
                arrayList.add(c0833c3);
            }
            eda.m11072e(op3Var);
            new np3(op3Var).executeOnExecutor(sy2.m21768c(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m23709C(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (((HashMap) this.f66369e)) {
            try {
                rh5 rh5Var = new rh5(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) ((HashMap) this.f66369e).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) this.f66369e).put(broadcastReceiver, arrayList);
                }
                arrayList.add(rh5Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) this.f66366b).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) this.f66366b).put(action, arrayList2);
                    }
                    arrayList2.add(rh5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m23710D(Activity activity) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            ((Set) this.f66366b).remove(activity);
            ((LinkedHashSet) this.f66367c).clear();
            HashMap map = (HashMap) this.f66369e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = ((HashSet) this.f66368d).clone();
            objClone.getClass();
            map.put(numValueOf, (HashSet) objClone);
            ((HashSet) this.f66368d).clear();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m23711E(Intent intent) {
        int i;
        String str;
        synchronized (((HashMap) this.f66369e)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.f66365a).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.f66366b).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        rh5 rh5Var = (rh5) arrayList.get(i2);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + rh5Var.f59307a);
                        }
                        if (rh5Var.f59309c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                            i = i2;
                        } else {
                            i = i2;
                            int iMatch = rh5Var.f59307a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(rh5Var);
                                rh5Var.f59309c = true;
                            } else {
                                arrayList = arrayList;
                                if (z) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i2 = i + 1;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((rh5) arrayList2.get(i3)).f59309c = false;
                        }
                        ((ArrayList) this.f66367c).add(new p33(8, intent, arrayList2));
                        if (!((xb4) this.f66368d).hasMessages(1)) {
                            ((xb4) this.f66368d).sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m23712F(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(sy2.m21766a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        ((w41) this.f66365a).m23711E(intent);
    }

    /* JADX INFO: renamed from: G */
    public void m23713G(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.f66365a).put(str, obj);
        u66 u66Var = (u66) ((LinkedHashMap) this.f66367c).get(str);
        if (u66Var != null) {
            ((C3244l) u66Var).m15571i(obj);
        }
        u66 u66Var2 = (u66) ((LinkedHashMap) this.f66368d).get(str);
        if (u66Var2 != null) {
            ((C3244l) u66Var2).m15571i(obj);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m23714H(AccessToken accessToken, boolean z) {
        boolean zEquals;
        AccessToken accessToken2 = (AccessToken) this.f66367c;
        String str = accessToken2 != null ? accessToken2.f11315i : null;
        String str2 = accessToken != null ? accessToken.f11315i : null;
        if (str != null && !str.equals(str2)) {
            AbstractC3546rr.m20755d(FlushReason.EAGER_FLUSHING_EVENT);
        }
        this.f66367c = accessToken;
        ((AtomicBoolean) this.f66368d).set(false);
        this.f66369e = new Date(0L);
        if (z) {
            SharedPreferences sharedPreferences = ((C3744x2) this.f66366b).f67655a;
            if (accessToken != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m5178a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                bna.m3911B(sy2.m21766a());
            }
        }
        if (accessToken2 == null) {
            zEquals = accessToken == null;
        } else {
            zEquals = accessToken2.equals(accessToken);
        }
        if (zEquals) {
            return;
        }
        m23712F(accessToken2, accessToken);
        Context contextM21766a = sy2.m21766a();
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        AlarmManager alarmManager = (AlarmManager) contextM21766a.getSystemService("alarm");
        if (x74.m24366w()) {
            if ((accessTokenM24363t != null ? accessTokenM24363t.f11307a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM21766a, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenM24363t.f11307a.getTime(), PendingIntent.getBroadcast(contextM21766a, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m23715I(EmbeddedMessage embeddedMessage) {
        Object value;
        embeddedMessage.getClass();
        C3244l c3244l = (C3244l) this.f66369e;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, u91.m22604V0((List) value, embeddedMessage)));
        hm5 hm5Var = (hm5) this.f66365a;
        String strM7040a = embeddedMessage.m7035b().m7040a();
        long jM7041b = embeddedMessage.m7035b().m7041b();
        ((C1240a) hm5Var).getClass();
        strM7040a.getClass();
        bl2 bl2Var = fb4.f38769t.m11694e().f57541e;
        bl2Var.getClass();
        kp2 kp2Var = (kp2) ((LinkedHashMap) bl2Var.f8655a).get(strM7040a);
        if (kp2Var == null) {
            kp2Var = new kp2(strM7040a, jM7041b);
            ((LinkedHashMap) bl2Var.f8655a).put(strM7040a, kp2Var);
        }
        kp2Var.m15641h(new Date());
    }

    /* JADX INFO: renamed from: J */
    public synchronized nk6 m23716J(int i, l67 l67Var) throws Throwable {
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                dg4 dg4VarM10328c = dg4.m10328c();
                rf4 rf4Var = new rf4("");
                dg4.m10328c();
                try {
                    rf4 rf4Var2 = (rf4) m23733v(dg4VarM10328c).f41432b;
                    dg4VarM10328c.m10352v((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                    return m23719e(i, l67Var, jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, dg4VarM10328c, true, rf4Var2);
                } catch (IOException e) {
                    try {
                        String strM3217L = b34.m3217L(e.getMessage());
                        dg4VarM10328c.m10331B("error", strM3217L != null ? strM3217L : "");
                        String strM3217L2 = b34.m3217L(Log.getStackTraceString(e));
                        dg4VarM10328c.m10331B("stacktrace", strM3217L2 != null ? strM3217L2 : "");
                        nk6 nk6VarM23719e = m23719e(i, l67Var, jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, dg4VarM10328c, false, rf4Var);
                        dg4VarM10328c.m10352v((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                        return nk6VarM23719e;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        dg4VarM10328c.m10352v((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    dg4VarM10328c.m10352v((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m23717K(BroadcastReceiver broadcastReceiver) {
        synchronized (((HashMap) this.f66369e)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) this.f66369e).remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    rh5 rh5Var = (rh5) arrayList.get(size);
                    rh5Var.f59310d = true;
                    for (int i = 0; i < rh5Var.f59307a.countActions(); i++) {
                        String action = rh5Var.f59307a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) this.f66366b).get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                rh5 rh5Var2 = (rh5) arrayList2.get(size2);
                                if (rh5Var2.f59308b == broadcastReceiver) {
                                    rh5Var2.f59310d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                ((HashMap) this.f66366b).remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m23718L(String str) {
        str.getClass();
        if (cl9.m4842Y(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (cl9.m4842Y(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        dx3 dx3Var = new dx3();
        dx3Var.m10737d(null, str);
        this.f66365a = dx3Var.m10734a();
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: a */
    public boolean mo13024a() {
        ArrayList arrayList = (ArrayList) this.f66369e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((g37) arrayList.get(i)).f40120a.mo13024a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: b */
    public float mo13025b() {
        return ((Number) ((cs4) this.f66367c).getValue()).floatValue();
    }

    @Override // p000.h37
    /* JADX INFO: renamed from: c */
    public float mo13026c() {
        return ((Number) ((cs4) this.f66368d).getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX INFO: renamed from: e */
    public nk6 m23719e(int i, l67 l67Var, long j, long j2, dg4 dg4Var, boolean z, rf4 rf4Var) {
        wk6 wk6Var;
        eg4 eg4VarM10342l;
        long j3;
        n67 n67Var = l67Var.f49187a;
        PayloadType payloadType = n67Var.f52405a;
        if (payloadType == PayloadType.Click) {
            if (z) {
                wk6Var = new wk6(0L, true, false);
            } else {
                wk6Var = i < 3 ? new wk6(-1L, false, true) : new wk6(0L, false, false);
            }
        } else if (payloadType == PayloadType.Smartlink) {
            if (z && JsonType.getType(rf4Var.f59203a) == JsonType.JsonObject) {
                wk6Var = new wk6(0L, true, false);
            } else {
                wk6Var = new wk6(0L, false, false);
            }
        } else if (JsonType.getType(rf4Var.f59203a) != JsonType.JsonObject || ((dg4) rf4Var.m20646a()).m10348r() == 0) {
            wk6Var = new wk6(-1L, false, true);
        } else {
            dg4 dg4Var2 = (dg4) rf4Var.m20646a();
            if (!dg4Var2.m10337g("success", Boolean.FALSE).booleanValue()) {
                wk6Var = new wk6(-1L, false, true);
            } else if (n67Var.f52405a != PayloadType.GetAttribution || (eg4VarM10342l = dg4Var2.m10342l("data", false)) == null) {
                wk6Var = new wk6(0L, true, false);
            } else {
                dg4 dg4Var3 = (dg4) eg4VarM10342l;
                if (dg4Var3.m10345o("retry")) {
                    long jM4705R = ci8.m4705R(dg4Var3.m10338h("retry", Double.valueOf(0.0d)).doubleValue());
                    if (jM4705R > 0) {
                        wk6Var = new wk6(Math.max(0L, jM4705R), false, true);
                    } else {
                        wk6Var = new wk6(0L, true, false);
                    }
                } else {
                    wk6Var = new wk6(0L, true, false);
                }
            }
        }
        if (wk6Var.f66972a) {
            return new nk6(true, false, 0L, j, j2, dg4Var, rf4Var);
        }
        long j4 = wk6Var.f66974c;
        boolean z2 = wk6Var.f66973b;
        if (j4 >= 0) {
            rf4 rf4Var2 = new rf4("");
            dg4.m10328c();
            return new nk6(false, z2, j4, j, j2, dg4Var, rf4Var2);
        }
        synchronized (this) {
            long[] jArr = (long[]) this.f66368d;
            if (jArr == null || jArr.length == 0) {
                int iMax = Math.max(1, i);
                if (iMax == 1) {
                    j3 = 7000;
                } else if (iMax != 2) {
                    j3 = iMax != 3 ? 1800000L : 300000L;
                } else {
                    j3 = 30000;
                }
            } else {
                j3 = ((long[]) this.f66368d)[Math.min(jArr.length - 1, Math.max(0, i - 1))];
            }
        }
        long j5 = j3;
        rf4 rf4Var3 = new rf4("");
        dg4.m10328c();
        return new nk6(false, z2, j5, j, j2, dg4Var, rf4Var3);
    }

    /* JADX INFO: renamed from: g */
    public void m23720g(pk0 pk0Var, Class cls) {
        ((ArrayList) this.f66366b).add(new Pair(pk0Var, cls));
    }

    @Override // p000.cs4
    public Object getValue() {
        wta wtaVar = (wta) this.f66369e;
        if (wtaVar != null) {
            return wtaVar;
        }
        cua cuaVar = (cua) ((ui3) this.f66366b).mo0a();
        zta ztaVar = (zta) ((ui3) this.f66367c).mo0a();
        qr1 qr1Var = (qr1) ((ui3) this.f66368d).mo0a();
        cuaVar.getClass();
        ztaVar.getClass();
        qr1Var.getClass();
        ny8 ny8Var = new ny8(cuaVar, ztaVar, qr1Var);
        z21 z21Var = (z21) this.f66365a;
        String strM25413b = z21Var.m25413b();
        if (strM25413b == null) {
            C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        wta wtaVarM17675B = ny8Var.m17675B(z21Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
        this.f66369e = wtaVarM17675B;
        return wtaVarM17675B;
    }

    /* JADX INFO: renamed from: h */
    public void m23721h(z23 z23Var, Class cls) {
        ((ArrayList) this.f66368d).add(new Pair(z23Var, cls));
    }

    /* JADX INFO: renamed from: i */
    public void m23722i(Activity activity) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            ((Set) this.f66366b).add(activity);
            ((HashSet) this.f66368d).clear();
            HashSet hashSet = (HashSet) ((HashMap) this.f66369e).get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f66368d = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    m23735x();
                } else {
                    ((Handler) this.f66365a).post(new RunnableC0002a0(this, 6));
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    @Override // p000.cs4
    public boolean isInitialized() {
        return ((wta) this.f66369e) != null;
    }

    /* JADX INFO: renamed from: j */
    public tm0 m23723j(s60 s60Var, ui3 ui3Var) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f47716a = -1;
        synchronized (this.f66365a) {
            Throwable th = (Throwable) this.f66366b;
            if (th != null) {
                s60Var.mo10451b(th);
                return iy5.f44768d;
            }
            AtomicInt atomicInt = (AtomicInt) this.f66367c;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.f47716a = (i2 >>> 27) & 15;
            ((h66) this.f66368d).m13090g(s60Var);
            if (z && ui3Var != null) {
                try {
                    ui3Var.mo0a();
                } catch (Throwable th2) {
                    synchronized (this.f66365a) {
                        try {
                            if (((Throwable) this.f66366b) == null) {
                                this.f66366b = th2;
                                h66 h66Var = (h66) this.f66368d;
                                Object[] objArr = h66Var.f1293a;
                                int i5 = h66Var.f1294b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((s60) objArr[i6]).mo10451b(th2);
                                }
                                ((h66) this.f66368d).m13093j();
                                AtomicInt atomicInt2 = (AtomicInt) this.f66367c;
                                do {
                                    i3 = atomicInt2.get();
                                } while (!atomicInt2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new fs6(new r60(s60Var, this, ref$IntRef, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX INFO: renamed from: k */
    public Bidi m23724k(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f66365a;
        ArrayList arrayList = (ArrayList) this.f66366b;
        ArrayList arrayList2 = (ArrayList) this.f66367c;
        boolean[] zArr = (boolean[]) this.f66368d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f66369e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m23731t(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f66369e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f66369e = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: l */
    public void m23725l(gl0 gl0Var) {
        gl0Var.getClass();
        String string = gl0Var.toString();
        if (string.length() == 0) {
            ((or3) this.f66367c).m18300M("Cache-Control");
        } else {
            m23732u("Cache-Control", string);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m23726n(vi3 vi3Var) {
        int i;
        synchronized (this.f66365a) {
            try {
                h66 h66Var = (h66) this.f66368d;
                this.f66368d = (h66) this.f66369e;
                this.f66369e = h66Var;
                AtomicInt atomicInt = (AtomicInt) this.f66367c;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = h66Var.f1294b;
                for (int i3 = 0; i3 < i2; i3++) {
                    vi3Var.invoke(h66Var.m717b(i3));
                }
                h66Var.m13093j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public KSerializer m23727o(z21 z21Var, List list) {
        list.getClass();
        zl1 zl1Var = (zl1) ((Map) this.f66365a).get(z21Var);
        KSerializer kSerializerMo24605a = zl1Var != null ? zl1Var.mo24605a(list) : null;
        if (kSerializerMo24605a instanceof KSerializer) {
            return kSerializerMo24605a;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public float m23728p(int i, boolean z) {
        Layout layout = (Layout) this.f66365a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: q */
    public float m23729q(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f66365a;
        if (!z2) {
            return m23728p(i, z);
        }
        int iM22008v = te1.m22008v(layout, i, z2);
        int lineStart = layout.getLineStart(iM22008v);
        int lineEnd = layout.getLineEnd(iM22008v);
        if (i != lineStart && i != lineEnd) {
            return m23728p(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m23728p(i, z);
        }
        int iM23730s = m23730s(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m23731t(iM23730s))) == -1;
        int iM23734w = m23734w(lineEnd, lineStart);
        int iM23731t = m23731t(iM23730s);
        int i4 = lineStart - iM23731t;
        int i5 = iM23734w - iM23731t;
        Bidi bidiM23724k = m23724k(iM23730s);
        Bidi bidiCreateLineBidi = bidiM23724k != null ? bidiM23724k.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM22008v) : layout.getLineRight(iM22008v);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        dq4[] dq4VarArr = new dq4[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            dq4VarArr[i6] = new dq4(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, dq4VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (dq4VarArr[i8].f36021a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == dq4VarArr[i3].f36023c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iM22008v);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(dq4VarArr[i3 - 1].f36021a) : layout.getPrimaryHorizontal(dq4VarArr[i3 + 1].f36021a);
            }
            return layout.getLineRight(iM22008v);
        }
        int iM23734w2 = i > iM23734w ? m23734w(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (dq4VarArr[i9].f36022b == iM23734w2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == dq4VarArr[i2].f36023c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iM22008v);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(dq4VarArr[i2 - 1].f36022b) : layout.getPrimaryHorizontal(dq4VarArr[i2 + 1].f36022b);
        }
        return layout.getLineRight(iM22008v);
    }

    /* JADX INFO: renamed from: s */
    public int m23730s(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f66366b;
        int iM23633h = vz1.m23633h(arrayList, Integer.valueOf(i));
        int i2 = iM23633h < 0 ? -(iM23633h + 1) : iM23633h + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public int m23731t(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f66366b).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: u */
    public void m23732u(String str, String str2) {
        str2.getClass();
        or3 or3Var = (or3) this.f66367c;
        or3Var.getClass();
        oha.m17997c(str);
        oha.m17998d(str2, str);
        or3Var.m18300M(str);
        oha.m17995a(or3Var, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public gw9 m23733v(dg4 dg4Var) throws IOException {
        boolean z;
        HttpURLConnection httpURLConnectionM23704f;
        byte[] bytes;
        Uri uri = (Uri) this.f66366b;
        rf4 rf4Var = (rf4) this.f66367c;
        if (rf4Var != null) {
            dg4Var.m10355y("request", rf4Var);
        }
        dg4Var.m10331B("url", uri.toString());
        Context context = (Context) this.f66365a;
        int i = 0;
        do {
            z = true;
            i++;
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                try {
                    NetworkInfo activeNetworkInfo = x74.m24362s(context).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z = false;
                    }
                } catch (Throwable unused) {
                }
            }
            httpURLConnectionM23704f = null;
            if (!z) {
                if (i > 4) {
                    v63.m23133k("No network access");
                    return null;
                }
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        } while (!z);
        if (rf4Var == null) {
            bytes = null;
        } else {
            try {
                bytes = rf4Var.toString().getBytes(b34.m3245k());
            } catch (Throwable th) {
                try {
                    throw new IOException(th);
                } catch (Throwable th2) {
                    if (httpURLConnectionM23704f != null) {
                        httpURLConnectionM23704f.disconnect();
                    }
                    throw th2;
                }
            }
        }
        httpURLConnectionM23704f = m23704f(dg4Var, uri, (HashMap) this.f66369e, bytes != null ? bytes.length : -1);
        httpURLConnectionM23704f.connect();
        if (bytes != null) {
            OutputStream outputStream = httpURLConnectionM23704f.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            try {
                try {
                    bufferedOutputStream.write(bytes);
                    try {
                        bufferedOutputStream.close();
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                } catch (IOException unused4) {
                    throw new IOException("Failed to write output stream");
                }
            } catch (Throwable th3) {
                try {
                    bufferedOutputStream.close();
                    outputStream.close();
                } catch (IOException unused5) {
                }
                throw th3;
            }
        }
        int responseCode = httpURLConnectionM23704f.getResponseCode();
        dg4Var.m10353w(responseCode, "response_code");
        dg4 dg4VarM10328c = dg4.m10328c();
        for (String str : httpURLConnectionM23704f.getHeaderFields().keySet()) {
            if (str != null) {
                dg4VarM10328c.m10331B(str.toLowerCase(Locale.US), httpURLConnectionM23704f.getHeaderField(str));
            }
        }
        dg4Var.m10356z("response_headers", dg4VarM10328c);
        rf4 rf4VarM23703d = m23703d(httpURLConnectionM23704f.getInputStream());
        dg4Var.m10355y("response", rf4VarM23703d);
        gw9 gw9Var = new gw9(rf4VarM23703d, dg4VarM10328c, Integer.valueOf(responseCode));
        httpURLConnectionM23704f.disconnect();
        return gw9Var;
    }

    /* JADX INFO: renamed from: w */
    public int m23734w(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f66365a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((fa4.m11651m(cCharAt, 8192) < 0 || fa4.m11651m(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: x */
    public void m23735x() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : (Set) this.f66366b) {
                if (activity != null) {
                    ((LinkedHashSet) this.f66367c).add(new v41(AbstractC3695vr.m23508s(activity), (Handler) this.f66365a, (HashSet) this.f66368d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m23736y(String str, z68 z68Var) {
        str.getClass();
        if (str.length() <= 0) {
            C3386nv.m17626m("method.isEmpty() == true");
            return;
        }
        if (z68Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C3386nv.m17624j(wq1.m24118n("method ", str, " must have a request body."));
                return;
            }
        } else if (!l70.m15963z(str)) {
            C3386nv.m17624j(wq1.m24118n("method ", str, " must not have a request body."));
            return;
        }
        this.f66366b = str;
        this.f66368d = z68Var;
    }

    /* JADX INFO: renamed from: z */
    public void m23737z(tqb tqbVar) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        String str;
        ud6 ud6Var = (ud6) this.f66366b;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) this.f66365a;
        if (tqbVar instanceof pa6) {
            ud6 ud6VarM4736u = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c3 != null) {
                vz1.m23641m0(abstractComponentCallbacksC0635c3);
            }
            fs6 fs6Var = (fs6) this.f66369e;
            pa6 pa6Var = (pa6) tqbVar;
            String strM19006a = pa6Var.m19006a();
            strM19006a.getClass();
            LqAnalyticsValues$UpgradePopupSource lqAnalyticsValues$UpgradePopupSource = LqAnalyticsValues$UpgradePopupSource.Registration;
            boolean z = !strM19006a.equals(lqAnalyticsValues$UpgradePopupSource.getValue()) ? false : ((C3509qs) fs6Var.f39591c).f58118b.getBoolean("active_onboarding_trial_promotion", true);
            String strM19007b = (!fa4.m11650l(pa6Var.m19006a(), lqAnalyticsValues$UpgradePopupSource.getValue()) || z) ? pa6Var.m19007b() : "lq-basetrial";
            String strM19006a2 = pa6Var.m19006a();
            String strM19007b2 = pa6Var.m19007b();
            boolean zMo8550F2 = ((pha) this.f66367c).mo8550F2(strM19007b);
            up6 up6Var = ((rn7) ((qn7) this.f66368d).getState().getValue()).f59593c.f61064b;
            dia diaVarM11162a = eia.m11162a(strM19006a2, strM19007b2, up6Var != null ? up6Var.m22854b() : null, zMo8550F2, z);
            rm5 rm5Var = sm5.Companion;
            String strM19006a3 = pa6Var.m19006a();
            String strM10405a = diaVarM11162a.m10405a();
            String str2 = diaVarM11162a.m10406b() ? "FreeTrial" : "Upgrade";
            StringBuilder sbM23000w = ux5.m23000w("[Offers] navigateTo(Upgrade) attemptedAction=", strM19006a3, " offer=", strM10405a, " → ");
            sbM23000w.append(str2);
            String string = sbM23000w.toString();
            rm5Var.getClass();
            h0a.f41641a.mo11430a(string, new Object[0]);
            if (diaVarM11162a.m10406b()) {
                ta6 ta6Var = ua6.Companion;
                String strM19006a4 = pa6Var.m19006a();
                boolean zM19008c = pa6Var.m19008c();
                String strM10405a2 = diaVarM11162a.m10405a();
                str = strM10405a2 != null ? strM10405a2 : "";
                ta6Var.getClass();
                jfa.m14428k(ud6VarM4736u, ta6.m21920a(strM19006a4, str, zM19008c), null);
                return;
            }
            gd6 gd6Var = hd6.Companion;
            String strM19006a5 = pa6Var.m19006a();
            boolean zM19008c2 = pa6Var.m19008c();
            String strM10405a3 = diaVarM11162a.m10405a();
            str = strM10405a3 != null ? strM10405a3 : "";
            gd6Var.getClass();
            jfa.m14428k(ud6VarM4736u, gd6.m12504a(strM19006a5, str, zM19008c2), null);
            return;
        }
        if (tqbVar instanceof p96) {
            ud6 ud6VarM4736u2 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c4 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c4 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c4);
            }
            p96 p96Var = (p96) tqbVar;
            jfa.m14428k(ud6VarM4736u2, z86.m25490a(a96.Companion, p96Var.m18993a(), p96Var.m18994b()), null);
            return;
        }
        if (tqbVar.equals(q96.f57452b)) {
            ud6 ud6VarM4736u3 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c5 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c5 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c5);
            }
            jfa.m14428k(ud6VarM4736u3, c96.m4407a(d96.Companion), null);
            return;
        }
        if (tqbVar instanceof u96) {
            ud6 ud6VarM4736u4 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c6 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c6 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c6);
            }
            m96 m96Var = n96.Companion;
            boolean zM22635a = ((u96) tqbVar).m22635a();
            m96Var.getClass();
            jfa.m14428k(ud6VarM4736u4, m96.m16696a(zM22635a), null);
            return;
        }
        if (tqbVar instanceof o96) {
            ud6 ud6VarM4736u5 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c7 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c7 != null) {
                vz1.m23641m0(abstractComponentCallbacksC0635c7);
            }
            w86 w86Var = x86.Companion;
            o96 o96Var = (o96) tqbVar;
            boolean zM17876c = o96Var.m17876c();
            boolean zM17874a = o96Var.m17874a();
            int iM17875b = o96Var.m17875b();
            w86Var.getClass();
            jfa.m14428k(ud6VarM4736u5, w86.m23813a(iM17875b, zM17876c, zM17874a), null);
            return;
        }
        if (tqbVar instanceof s96) {
            ud6 ud6VarM4736u6 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c8 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c8 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c8);
            }
            f96 f96Var = g96.Companion;
            s96 s96Var = (s96) tqbVar;
            int iM21169a = s96Var.m21169a();
            LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPathM21171c = s96Var.m21171c();
            String strM21172d = s96Var.m21172d();
            String strM21170b = s96Var.m21170b();
            f96Var.getClass();
            jfa.m14428k(ud6VarM4736u6, f96.m11617a(iM21169a, lqAnalyticsValues$LessonPathM21171c, strM21172d, strM21170b), null);
            return;
        }
        if (tqbVar instanceof t96) {
            ud6 ud6VarM4736u7 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c9 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c9 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c9);
            }
            i96 i96Var = j96.Companion;
            t96 t96Var = (t96) tqbVar;
            int iM21904a = t96Var.m21904a();
            String strM21905b = t96Var.m21905b();
            String strM21906c = t96Var.m21906c();
            i96Var.getClass();
            jfa.m14428k(ud6VarM4736u7, i96.m13736a(strM21905b, iM21904a, strM21906c), null);
            return;
        }
        if (tqbVar.equals(v96.f65080b)) {
            ra6.Companion.getClass();
            jfa.m14428k(ud6Var, qa6.m19838a(), null);
            return;
        }
        if (tqbVar instanceof w96) {
            vz1.m23640l0(abstractComponentCallbacksC0635c2);
            nc6.Companion.getClass();
            jfa.m14428k(ud6Var, mc6.m16766a(), null);
            return;
        }
        if (tqbVar instanceof y96) {
            ud6 ud6VarM4736u8 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c10 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c10 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c10);
            }
            jfa.m14428k(ud6VarM4736u8, md6.m16784a(nd6.Companion), null);
            return;
        }
        if (tqbVar instanceof aa6) {
            ud6 ud6VarM4736u9 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c11 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c11 != null) {
                vz1.m23641m0(abstractComponentCallbacksC0635c11);
            }
            bb6 bb6Var = cb6.Companion;
            aa6 aa6Var = (aa6) tqbVar;
            int iM213b = aa6Var.m213b();
            boolean zM212a = aa6Var.m212a();
            boolean zM214c = aa6Var.m214c();
            bb6Var.getClass();
            jfa.m14428k(ud6VarM4736u9, bb6.m3556a(iM213b, zM212a, zM214c), null);
            return;
        }
        if (tqbVar.equals(ba6.f8228b)) {
            eb6.Companion.getClass();
            jfa.m14428k(ud6Var, db6.m10269a(), null);
            return;
        }
        if (tqbVar instanceof ca6) {
            vz1.m23641m0(abstractComponentCallbacksC0635c2);
            gb6 gb6Var = hb6.Companion;
            ca6 ca6Var = (ca6) tqbVar;
            int iM4472b = ca6Var.m4472b();
            int iM4473c = ca6Var.m4473c();
            boolean zM4471a = ca6Var.m4471a();
            gb6Var.getClass();
            jfa.m14428k(ud6Var, gb6.m12465a(iM4472b, iM4473c, zM4471a), null);
            return;
        }
        if (tqbVar instanceof da6) {
            ud6 ud6VarM4736u10 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            jb6 jb6Var = kb6.Companion;
            da6 da6Var = (da6) tqbVar;
            int iM10173a = da6Var.m10173a();
            String strM10174b = da6Var.m10174b();
            String strM10176d = da6Var.m10176d();
            String strM10177e = da6Var.m10177e();
            String strM10175c = da6Var.m10175c();
            LessonInfoSource lessonInfoSourceM10179g = da6Var.m10179g();
            String strM10178f = da6Var.m10178f();
            jb6Var.getClass();
            jfa.m14428k(ud6VarM4736u10, jb6.m14374a(iM10173a, strM10174b, strM10176d, strM10177e, strM10175c, lessonInfoSourceM10179g, strM10178f), null);
            return;
        }
        if (tqbVar instanceof ea6) {
            ud6 ud6VarM4736u11 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c12 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c12 != null) {
                vz1.m23600D(abstractComponentCallbacksC0635c12);
            }
            mb6 mb6Var = nb6.Companion;
            ea6 ea6Var = (ea6) tqbVar;
            int i = ea6Var.f36928d;
            String str3 = ea6Var.f36927c;
            String str4 = ea6Var.f36926b;
            LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ea6Var.f36929e;
            String str5 = ea6Var.f36930f;
            boolean z2 = ea6Var.f36933i;
            boolean z3 = ea6Var.f36934j;
            int i2 = ea6Var.f36935k;
            mb6Var.getClass();
            str5.getClass();
            jfa.m14428k(ud6VarM4736u11, new lb6(str4, str3, str5, i, lqAnalyticsValues$LessonPath, z2, z3, i2), null);
            return;
        }
        if (tqbVar.equals(fa6.f38722b)) {
            ud6 ud6VarM4736u12 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c13 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c13 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c13);
            }
            tc6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u12, sc6.m21221a(), null);
            return;
        }
        if (tqbVar.equals(ia6.f43860b)) {
            ud6 ud6VarM4736u13 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c14 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c14 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c14);
            }
            rc6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u13, qc6.m19859a(), null);
            return;
        }
        if (tqbVar instanceof ja6) {
            ud6 ud6VarM4736u14 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c15 = abstractComponentCallbacksC0635c2.f5677S;
            if (abstractComponentCallbacksC0635c15 != null && (abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635c15.f5677S) != null) {
                abstractComponentCallbacksC0635c15 = abstractComponentCallbacksC0635c;
            }
            if (abstractComponentCallbacksC0635c15 != null) {
                vz1.m23600D(abstractComponentCallbacksC0635c15);
            }
            ja6 ja6Var = (ja6) tqbVar;
            jfa.m14428k(ud6VarM4736u14, ec6.m11027b(fc6.Companion, ja6Var.m14364c(), ja6Var.m14365d(), ja6Var.m14362a(), ja6Var.m14363b()), null);
            return;
        }
        if (tqbVar instanceof ka6) {
            ud6 ud6VarM4736u15 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c16 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c16 != null) {
                vz1.m23600D(abstractComponentCallbacksC0635c16);
            }
            hc6 hc6Var = ic6.Companion;
            ka6 ka6Var = (ka6) tqbVar;
            String strM15032b = ka6Var.m15032b();
            boolean zM15038h = ka6Var.m15038h();
            CardStatus cardStatusM15037g = ka6Var.m15037g();
            int iM15031a = ka6Var.m15031a();
            ReviewType reviewTypeM15035e = ka6Var.m15035e();
            int iM15036f = ka6Var.m15036f();
            String strM15033c = ka6Var.m15033c();
            String strM15034d = ka6Var.m15034d();
            hc6Var.getClass();
            jfa.m14428k(ud6VarM4736u15, hc6.m13194a(iM15031a, reviewTypeM15035e, false, zM15038h, iM15036f, strM15033c, strM15032b, cardStatusM15037g, strM15034d), null);
            return;
        }
        if (tqbVar instanceof la6) {
            ud6 ud6VarM4736u16 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c17 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c17 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c17);
            }
            vc6 vc6Var = wc6.Companion;
            ViewKeys viewKeys = ViewKeys.ActivitiesSettings;
            vc6Var.getClass();
            jfa.m14428k(ud6VarM4736u16, vc6.m23229a(viewKeys), null);
            return;
        }
        if (tqbVar instanceof ma6) {
            vz1.m23640l0(abstractComponentCallbacksC0635c2);
            kc6 kc6Var = lc6.Companion;
            ma6 ma6Var = (ma6) tqbVar;
            LibraryShelfNavArg libraryShelfNavArgM14528a = jkd.m14528a(ma6Var.m16716b());
            LibraryTab libraryTabM16717c = ma6Var.m16717c();
            LibraryTabNavArg libraryTabNavArgM14529b = libraryTabM16717c != null ? jkd.m14529b(libraryTabM16717c) : null;
            String strM16718d = ma6Var.m16718d();
            String strM16715a = ma6Var.m16715a();
            kc6Var.getClass();
            jfa.m14428k(ud6Var, kc6.m15109a(libraryShelfNavArgM14528a, strM16718d, libraryTabNavArgM14529b, strM16715a), null);
            return;
        }
        if (tqbVar instanceof na6) {
            ud6 ud6VarM4736u17 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c18 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c18 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c18);
            }
            pc6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u17, oc6.m17911a(), null);
            return;
        }
        if (tqbVar instanceof oa6) {
            vz1.m23640l0(abstractComponentCallbacksC0635c2);
            yc6.Companion.getClass();
            jfa.m14428k(ud6Var, xc6.m24448a(), null);
            return;
        }
        if (tqbVar.equals(ha6.f42093b)) {
            ud6 ud6VarM4736u18 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c19 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c19 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c19);
            }
            vb6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u18, ub6.m22667a(), null);
            return;
        }
        if (tqbVar instanceof z96) {
            ud6 ud6VarM25513a = ((z96) tqbVar).m25513a();
            za6.Companion.getClass();
            jfa.m14428k(ud6VarM25513a, ya6.m25019a(), null);
            return;
        }
        if (tqbVar.equals(x96.f67977b)) {
            ud6 ud6VarM4736u19 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c20 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c20 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c20);
            }
            wa6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u19, va6.m23213a(), null);
            return;
        }
        if (tqbVar.equals(ga6.f40462b)) {
            ud6 ud6VarM4736u20 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c21 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
            if (abstractComponentCallbacksC0635c21 != null) {
                vz1.m23640l0(abstractComponentCallbacksC0635c21);
            }
            pb6.Companion.getClass();
            jfa.m14428k(ud6VarM4736u20, ob6.m17899a(), null);
            return;
        }
        if (!(tqbVar instanceof r96)) {
            gm5.m12750e();
            return;
        }
        ud6 ud6VarM4736u21 = ci8.m4736u(abstractComponentCallbacksC0635c2.m2089Q(), R$id.nav_host_fragment_top);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c22 = abstractComponentCallbacksC0635c2.m2091S().f5677S;
        if (abstractComponentCallbacksC0635c22 != null) {
            vz1.m23641m0(abstractComponentCallbacksC0635c22);
        }
        rb6 rb6Var = sb6.Companion;
        r96 r96Var = (r96) tqbVar;
        String strM20452b = r96Var.m20452b();
        int iM20451a = r96Var.m20451a();
        rb6Var.getClass();
        strM20452b.getClass();
        jfa.m14428k(ud6VarM4736u21, new qb6(strM20452b, iM20451a), null);
    }

    public w41(Map map) {
        this.f66365a = new LinkedHashMap(map);
        this.f66366b = new LinkedHashMap();
        this.f66367c = new LinkedHashMap();
        this.f66368d = new LinkedHashMap();
        this.f66369e = new mc1(this, 6);
    }

    public w41(Map map, Map map2, Map map3, Map map4, Map map5) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.f66365a = map;
        this.f66366b = map2;
        this.f66367c = map3;
        this.f66368d = map4;
        this.f66369e = map5;
    }

    public w41(z21 z21Var, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3) {
        this.f66365a = z21Var;
        this.f66366b = ui3Var;
        this.f66367c = ui3Var2;
        this.f66368d = ui3Var3;
    }

    public w41(int i) {
        switch (i) {
            case 3:
                this.f66365a = new Object();
                this.f66367c = new AtomicInt(0);
                this.f66368d = new h66();
                this.f66369e = new h66();
                break;
            case 13:
                this.f66369e = tr2.f62750A;
                this.f66366b = "GET";
                this.f66367c = new or3(0);
                break;
            default:
                this.f66365a = new Handler(Looper.getMainLooper());
                Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                setNewSetFromMap.getClass();
                this.f66366b = setNewSetFromMap;
                this.f66367c = new LinkedHashSet();
                this.f66368d = new HashSet();
                this.f66369e = new HashMap();
                break;
        }
    }

    public w41(Context context, Uri uri, rf4 rf4Var) {
        this.f66369e = null;
        this.f66368d = null;
        this.f66365a = context;
        this.f66366b = uri;
        this.f66367c = rf4Var;
    }

    public w41(Context context) {
        this.f66369e = new HashMap();
        this.f66366b = new HashMap();
        this.f66367c = new ArrayList();
        this.f66365a = context;
        this.f66368d = new xb4(this, context.getMainLooper(), 1);
    }
}
