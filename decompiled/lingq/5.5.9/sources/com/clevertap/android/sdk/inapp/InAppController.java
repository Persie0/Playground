package com.clevertap.android.sdk.inapp;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.AbstractC0140a;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.kochava.core.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1735a;
import p043c7.HandlerC1740f;
import p066d7.C5051c;
import p066d7.C5052d;
import p290o6.C7951d0;
import p290o6.C7957g0;
import p290o6.C7967l0;
import p290o6.C7972o;
import p290o6.C7977q0;
import p290o6.C7979r0;
import p290o6.C7985x;
import p290o6.C7986y;
import p290o6.InterfaceC7973o0;

/* JADX INFO: loaded from: classes.dex */
public final class InAppController implements CTInAppNotification.InterfaceC2196c, InterfaceC2222h0, InAppNotificationActivity.InterfaceC2180e {

    /* JADX INFO: renamed from: k */
    public static CTInAppNotification f11138k;

    /* JADX INFO: renamed from: l */
    public static final List<CTInAppNotification> f11139l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public final AnalyticsManager f11140a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f11141b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f11142c;

    /* JADX INFO: renamed from: d */
    public final Context f11143d;

    /* JADX INFO: renamed from: e */
    public final C7985x f11144e;

    /* JADX INFO: renamed from: f */
    public final C7951d0 f11145f;

    /* JADX INFO: renamed from: i */
    public final C2181a f11148i;

    /* JADX INFO: renamed from: j */
    public final HandlerC1740f f11149j;

    /* JADX INFO: renamed from: h */
    public HashSet<String> f11147h = null;

    /* JADX INFO: renamed from: g */
    public InAppState f11146g = InAppState.RESUMED;

    public enum InAppState {
        DISCARDED(-1),
        SUSPENDED(0),
        RESUMED(1);

        final int state;

        InAppState(int i10) {
            this.state = i10;
        }

        public int intValue() {
            return this.state;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$a */
    public class CallableC2200a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CTInAppNotification f11151b;

        public CallableC2200a(Context context, CTInAppNotification cTInAppNotification) {
            this.f11150a = context;
            this.f11151b = cTInAppNotification;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            InAppController inAppController = InAppController.this;
            CleverTapInstanceConfig cleverTapInstanceConfig = inAppController.f11142c;
            C2181a.m6456i(cleverTapInstanceConfig.f10995a, "Running inAppDidDismiss");
            CTInAppNotification cTInAppNotification = InAppController.f11138k;
            Context context = this.f11150a;
            if (cTInAppNotification != null && cTInAppNotification.f11109g.equals(this.f11151b.f11109g)) {
                InAppController.f11138k = null;
                InAppController.m6503g(context, cleverTapInstanceConfig, inAppController);
            }
            InAppController.m6502e(inAppController, context);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$b */
    public class RunnableC2201b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CTInAppNotification f11153a;

        public RunnableC2201b(CTInAppNotification cTInAppNotification) {
            this.f11153a = cTInAppNotification;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InAppController.this.mo6493a(this.f11153a);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$c */
    public class RunnableC2202c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CTInAppNotification f11155a;

        public RunnableC2202c(CTInAppNotification cTInAppNotification) {
            this.f11155a = cTInAppNotification;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InAppController.this.m6506h(this.f11155a);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$d */
    public class CallableC2203d implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f11157a;

        public CallableC2203d(JSONObject jSONObject) {
            this.f11157a = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            InAppController inAppController = InAppController.this;
            inAppController.new RunnableC2206g(inAppController, this.f11157a).run();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$e */
    public class RunnableC2204e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CTInAppNotification f11160b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CleverTapInstanceConfig f11161c;

        public RunnableC2204e(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CTInAppNotification cTInAppNotification, InAppController inAppController) {
            this.f11159a = context;
            this.f11160b = cTInAppNotification;
            this.f11161c = cleverTapInstanceConfig;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InAppController.m6504l(this.f11159a, this.f11161c, this.f11160b);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$f */
    public static /* synthetic */ class C2205f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11162a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            f11162a = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeAlert.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeFooterHTML.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeHeaderHTML.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeFooter.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11162a[CTInAppType.CTInAppTypeHeader.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$g */
    public final class RunnableC2206g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<InAppController> f11163a;

        /* JADX INFO: renamed from: b */
        public final JSONObject f11164b;

        /* JADX INFO: renamed from: c */
        public final boolean f11165c = C7979r0.f43406a;

        public RunnableC2206g(InAppController inAppController, JSONObject jSONObject) {
            this.f11163a = new WeakReference<>(inAppController);
            this.f11164b = jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:158:0x0309 A[Catch: all -> 0x0336, TRY_ENTER, TryCatch #15 {, blocks: (B:143:0x02c3, B:144:0x02cb, B:150:0x02da, B:151:0x02f8, B:158:0x0309, B:159:0x0318, B:161:0x031a, B:162:0x032e, B:166:0x0332, B:169:0x0335, B:152:0x02f9, B:156:0x0306, B:155:0x02ff, B:145:0x02cc, B:149:0x02d9, B:148:0x02d2), top: B:212:0x02c3, inners: #9, #13 }] */
        /* JADX WARN: Code duplicated, block: B:161:0x031a A[Catch: all -> 0x0336, TryCatch #15 {, blocks: (B:143:0x02c3, B:144:0x02cb, B:150:0x02da, B:151:0x02f8, B:158:0x0309, B:159:0x0318, B:161:0x031a, B:162:0x032e, B:166:0x0332, B:169:0x0335, B:152:0x02f9, B:156:0x0306, B:155:0x02ff, B:145:0x02cc, B:149:0x02d9, B:148:0x02d2), top: B:212:0x02c3, inners: #9, #13 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x01da A[Catch: all -> 0x0207, TRY_ENTER, TryCatch #7 {, blocks: (B:71:0x0197, B:72:0x019c, B:78:0x01ab, B:79:0x01c9, B:86:0x01da, B:87:0x01e9, B:89:0x01eb, B:90:0x01ff, B:94:0x0203, B:97:0x0206, B:80:0x01ca, B:84:0x01d7, B:83:0x01d0, B:73:0x019d, B:77:0x01aa, B:76:0x01a3), top: B:202:0x0197, inners: #1, #4 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x01eb A[Catch: all -> 0x0207, TryCatch #7 {, blocks: (B:71:0x0197, B:72:0x019c, B:78:0x01ab, B:79:0x01c9, B:86:0x01da, B:87:0x01e9, B:89:0x01eb, B:90:0x01ff, B:94:0x0203, B:97:0x0206, B:80:0x01ca, B:84:0x01d7, B:83:0x01d0, B:73:0x019d, B:77:0x01aa, B:76:0x01a3), top: B:202:0x0197, inners: #1, #4 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:158:0x0309, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:161:0x031a, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:86:0x01da, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:89:0x01eb, please report this as an issue */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            HttpsURLConnection httpsURLConnection;
            byte[] byteArray;
            int length;
            int size;
            int size2;
            int byteCount;
            int size3;
            int size4;
            CTInAppNotification cTInAppNotification = new CTInAppNotification();
            JSONObject jSONObject = this.f11164b;
            cTInAppNotification.f11108f0 = this.f11165c;
            cTInAppNotification.f11088R = jSONObject;
            HttpsURLConnection httpsURLConnection2 = null;
            try {
                String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                cTInAppNotification.f11106e0 = string;
                if (string == null || string.equals("custom-html")) {
                    cTInAppNotification.m6492h(jSONObject);
                } else {
                    cTInAppNotification.m6490a(jSONObject);
                }
            } catch (JSONException e10) {
                cTInAppNotification.f11117k = "Invalid JSON : " + e10.getLocalizedMessage();
            }
            if (cTInAppNotification.f11117k != null) {
                InAppController inAppController = InAppController.this;
                C2181a c2181a = inAppController.f11148i;
                String str = inAppController.f11142c.f10995a;
                String str2 = "Unable to parse inapp notification " + cTInAppNotification.f11117k;
                c2181a.getClass();
                C2181a.m6452d(str, str2);
                return;
            }
            cTInAppNotification.f11097a = this.f11163a.get();
            for (CTInAppNotificationMedia cTInAppNotificationMedia : cTInAppNotification.f11091U) {
                boolean z10 = false;
                if (cTInAppNotificationMedia.m6499c()) {
                    int i10 = CTInAppNotification.C2197d.f11120a;
                    synchronized (CTInAppNotification.C2197d.class) {
                        if (CTInAppNotification.C2197d.f11122c == null) {
                            StringBuilder sb2 = new StringBuilder("CTInAppNotification.GifCache: init with max device memory: ");
                            sb2.append(CTInAppNotification.C2197d.f11120a);
                            sb2.append("KB and allocated cache size: ");
                            int i11 = CTInAppNotification.C2197d.f11121b;
                            sb2.append(i11);
                            sb2.append("KB");
                            C2181a.m6455h(sb2.toString());
                            try {
                                CTInAppNotification.C2197d.f11122c = new C2212c0(i11);
                            } catch (Throwable th2) {
                                C2181a.m6457j("CTInAppNotification.GifCache: unable to initialize cache: ", th2.getCause());
                            }
                        }
                    }
                    if (CTInAppNotification.C2197d.m6495b(cTInAppNotificationMedia.f11135b) != null) {
                        cTInAppNotification.f11097a.mo6493a(cTInAppNotification);
                        return;
                    }
                    if (cTInAppNotificationMedia.f11137d != null) {
                        C2181a.m6455h("CTInAppNotification: downloading GIF :" + cTInAppNotificationMedia.f11137d);
                        String str3 = cTInAppNotificationMedia.f11137d;
                        boolean z11 = C7979r0.f43406a;
                        String strReplace = str3.replace("///", "/").replace("//", "/").replace("http:/", "http://").replace("https:/", "https://");
                        try {
                            httpsURLConnection = (HttpsURLConnection) new URL(strReplace).openConnection();
                            try {
                                try {
                                    InputStream inputStream = httpsURLConnection.getInputStream();
                                    byte[] bArr = new byte[8192];
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        int i12 = inputStream.read(bArr);
                                        if (i12 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr, 0, i12);
                                        }
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    try {
                                        httpsURLConnection.disconnect();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        C2181a.m6457j("Couldn't close connection!", th);
                                    }
                                } catch (IOException unused) {
                                    C2181a.m6455h("Error processing image bytes from url: " + strReplace);
                                    if (httpsURLConnection != null) {
                                        try {
                                            httpsURLConnection.disconnect();
                                        } catch (Throwable th4) {
                                            th = th4;
                                            byteArray = null;
                                            C2181a.m6457j("Couldn't close connection!", th);
                                        }
                                    }
                                    byteArray = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                httpsURLConnection2 = httpsURLConnection;
                                if (httpsURLConnection2 != null) {
                                    try {
                                        httpsURLConnection2.disconnect();
                                    } catch (Throwable th6) {
                                        C2181a.m6457j("Couldn't close connection!", th6);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            httpsURLConnection = null;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        if (byteArray != null) {
                            C2181a.m6455h("GIF Downloaded from url: " + cTInAppNotificationMedia.f11137d);
                            String str4 = cTInAppNotificationMedia.f11135b;
                            if (CTInAppNotification.C2197d.f11122c != null) {
                                if (CTInAppNotification.C2197d.m6495b(str4) == null) {
                                    synchronized (CTInAppNotification.C2197d.class) {
                                        length = byteArray.length / 1024;
                                        synchronized (CTInAppNotification.C2197d.class) {
                                            C2212c0 c2212c0 = CTInAppNotification.C2197d.f11122c;
                                            size = c2212c0 == null ? 0 : CTInAppNotification.C2197d.f11121b - c2212c0.size();
                                        }
                                        if (length > size2) {
                                            C2181a.m6455h("CTInAppNotification.GifCache: insufficient memory to add gif: " + str4);
                                        } else {
                                            CTInAppNotification.C2197d.f11122c.put(str4, byteArray);
                                            C2181a.m6455h("CTInAppNotification.GifCache: added gif for key: " + str4);
                                            z10 = true;
                                        }
                                    }
                                    C2181a.m6455h("CTInAppNotification.GifCache: gif size: " + length + "KB. Available mem: " + size + "KB.");
                                    synchronized (CTInAppNotification.C2197d.class) {
                                        C2212c0 c2212c1 = CTInAppNotification.C2197d.f11122c;
                                        size2 = c2212c1 == null ? 0 : CTInAppNotification.C2197d.f11121b - c2212c1.size();
                                        if (length > size2) {
                                            C2181a.m6455h("CTInAppNotification.GifCache: insufficient memory to add gif: " + str4);
                                        } else {
                                            CTInAppNotification.C2197d.f11122c.put(str4, byteArray);
                                            C2181a.m6455h("CTInAppNotification.GifCache: added gif for key: " + str4);
                                            z10 = true;
                                        }
                                    }
                                } else {
                                    z10 = true;
                                }
                            }
                            if (!z10) {
                                cTInAppNotification.f11117k = "Error processing GIF";
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else if (cTInAppNotificationMedia.m6500d()) {
                    int i13 = C5052d.f32898a;
                    synchronized (C5052d.class) {
                        if (C5052d.f32900c == null) {
                            StringBuilder sb3 = new StringBuilder("CleverTap.ImageCache: init with max device memory: ");
                            sb3.append(C5052d.f32898a);
                            sb3.append("KB and allocated cache size: ");
                            int i14 = C5052d.f32899b;
                            sb3.append(i14);
                            sb3.append("KB");
                            C2181a.m6455h(sb3.toString());
                            try {
                                C5052d.f32900c = new C5051c(i14);
                            } catch (Throwable th8) {
                                C2181a.m6457j("CleverTap.ImageCache: unable to initialize cache: ", th8.getCause());
                            }
                        }
                    }
                    if (CTInAppNotification.m6488c(cTInAppNotificationMedia) != null) {
                        cTInAppNotification.f11097a.mo6493a(cTInAppNotification);
                        return;
                    }
                    if (cTInAppNotificationMedia.f11137d != null) {
                        C2181a.m6455h("CTInAppNotification: downloading Image :" + cTInAppNotificationMedia.f11137d);
                        Bitmap bitmapM15839f = C7979r0.m15839f(cTInAppNotificationMedia.f11137d);
                        if (bitmapM15839f != null) {
                            C2181a.m6455h("Image Downloaded from url: " + cTInAppNotificationMedia.f11137d);
                            String str5 = cTInAppNotificationMedia.f11135b;
                            C5051c c5051c = C5052d.f32900c;
                            if (c5051c != null) {
                                if ((str5 != null ? c5051c.get(str5) : null) == null) {
                                    synchronized (C5052d.class) {
                                        byteCount = bitmapM15839f.getByteCount() / 1024;
                                        synchronized (C5052d.class) {
                                            C5051c c5051c2 = C5052d.f32900c;
                                            size3 = c5051c2 == null ? 0 : C5052d.f32899b - c5051c2.size();
                                        }
                                        if (byteCount > size4) {
                                            C2181a.m6455h("CleverTap.ImageCache: insufficient memory to add image: " + str5);
                                        } else {
                                            C5052d.f32900c.put(str5, bitmapM15839f);
                                            C2181a.m6455h("CleverTap.ImageCache: added image for key: " + str5);
                                            z10 = true;
                                        }
                                    }
                                    C2181a.m6455h("CleverTap.ImageCache: image size: " + byteCount + "KB. Available mem: " + size3 + "KB.");
                                    synchronized (C5052d.class) {
                                        C5051c c5051c3 = C5052d.f32900c;
                                        size4 = c5051c3 == null ? 0 : C5052d.f32899b - c5051c3.size();
                                        if (byteCount > size4) {
                                            C2181a.m6455h("CleverTap.ImageCache: insufficient memory to add image: " + str5);
                                        } else {
                                            C5052d.f32900c.put(str5, bitmapM15839f);
                                            C2181a.m6455h("CleverTap.ImageCache: added image for key: " + str5);
                                            z10 = true;
                                        }
                                    }
                                } else {
                                    z10 = true;
                                }
                            }
                            if (!z10) {
                                cTInAppNotification.f11117k = "Error processing image";
                            }
                        } else {
                            C2181a.m6449a("Image Bitmap is null");
                            cTInAppNotification.f11117k = "Error processing image as bitmap was NULL";
                        }
                    } else {
                        continue;
                    }
                } else if (cTInAppNotificationMedia.m6501e() || cTInAppNotificationMedia.m6498b()) {
                    if (!cTInAppNotification.f11108f0) {
                        cTInAppNotification.f11117k = "InApp Video/Audio is not supported";
                    }
                }
            }
            cTInAppNotification.f11097a.mo6493a(cTInAppNotification);
        }
    }

    public InAppController(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, HandlerC1740f handlerC1740f, C7985x c7985x, C7972o c7972o, AnalyticsManager analyticsManager, C7986y c7986y, C7951d0 c7951d0) {
        this.f11143d = context;
        this.f11142c = cleverTapInstanceConfig;
        this.f11148i = cleverTapInstanceConfig.m6433b();
        this.f11149j = handlerC1740f;
        this.f11144e = c7985x;
        this.f11141b = c7972o;
        this.f11140a = analyticsManager;
        this.f11145f = c7951d0;
    }

    /* JADX INFO: renamed from: e */
    public static void m6502e(InAppController inAppController, Context context) {
        C2181a c2181a = inAppController.f11148i;
        CleverTapInstanceConfig cleverTapInstanceConfig = inAppController.f11142c;
        SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, null);
        try {
            if (!inAppController.m6505f()) {
                C2181a.m6455h("Not showing notification on blacklisted activity");
                return;
            }
            if (inAppController.f11146g == InAppState.SUSPENDED) {
                String str = cleverTapInstanceConfig.f10995a;
                c2181a.getClass();
                C2181a.m6452d(str, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            m6503g(context, cleverTapInstanceConfig, inAppController);
            JSONArray jSONArray = new JSONArray(C7977q0.m15829g(context, cleverTapInstanceConfig, "inApp", BuildConfig.SDK_PERMISSIONS));
            if (jSONArray.length() < 1) {
                return;
            }
            if (inAppController.f11146g != InAppState.DISCARDED) {
                inAppController.m6508j(jSONArray.getJSONObject(0));
            } else {
                String str2 = cleverTapInstanceConfig.f10995a;
                c2181a.getClass();
                C2181a.m6452d(str2, "InApp Notifications are set to be discarded, dropping the InApp Notification");
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    jSONArray2.put(jSONArray.get(i10));
                }
            }
            C7977q0.m15830h(sharedPreferencesM15827e.edit().putString(C7977q0.m15833k(cleverTapInstanceConfig, "inApp"), jSONArray2.toString()));
        } catch (Throwable th2) {
            String str3 = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6461n(str3, "InApp: Couldn't parse JSON array string from prefs", th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6503g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InAppController inAppController) {
        C2181a.m6456i(cleverTapInstanceConfig.f10995a, "checking Pending Notifications");
        List<CTInAppNotification> list = f11139l;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            CTInAppNotification cTInAppNotification = list.get(0);
            list.remove(0);
            new HandlerC1740f().post(new RunnableC2204e(context, cleverTapInstanceConfig, cTInAppNotification, inAppController));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static void m6504l(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CTInAppNotification cTInAppNotification) {
        C2181a.m6456i(cleverTapInstanceConfig.f10995a, "Attempting to show next In-App");
        boolean z10 = C7986y.f43446Q;
        List<CTInAppNotification> list = f11139l;
        String str = cleverTapInstanceConfig.f10995a;
        if (!z10) {
            list.add(cTInAppNotification);
            C2181a.m6456i(str, "Not in foreground, queueing this In App");
            return;
        }
        if (f11138k != null) {
            list.add(cTInAppNotification);
            C2181a.m6456i(str, "In App already displaying, queueing this In App");
            return;
        }
        if (System.currentTimeMillis() / 1000 > cTInAppNotification.f11096Z) {
            C2181a.m6449a("InApp has elapsed its time to live, not showing the InApp");
            return;
        }
        f11138k = cTInAppNotification;
        CTInAppType cTInAppType = cTInAppNotification.f11083M;
        Fragment c2228n = null;
        switch (C2205f.f11162a[cTInAppType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                Intent intent = new Intent(context, (Class<?>) InAppNotificationActivity.class);
                intent.putExtra("inApp", cTInAppNotification);
                Bundle bundle = new Bundle();
                bundle.putParcelable("config", cleverTapInstanceConfig);
                intent.putExtra("configBundle", bundle);
                try {
                    Activity activityM15846k0 = C7986y.m15846k0();
                    if (activityM15846k0 == null) {
                        throw new IllegalStateException("Current activity reference not found");
                    }
                    C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                    String str2 = "calling InAppActivity for notification: " + cTInAppNotification.f11088R;
                    c2181aM6433b.getClass();
                    C2181a.m6460m(str, str2);
                    activityM15846k0.startActivity(intent);
                    C2181a.m6449a("Displaying In-App: " + cTInAppNotification.f11088R);
                } catch (Throwable th2) {
                    C2181a.m6457j("Please verify the integration of your app. It is not setup to support in-app notifications yet.", th2);
                }
                break;
            case 11:
                c2228n = new C2228n();
                break;
            case 12:
                c2228n = new C2230p();
                break;
            case 13:
                c2228n = new C2234t();
                break;
            case 14:
                c2228n = new C2237w();
                break;
            default:
                C2181a.m6450b(str, "Unknown InApp Type found: " + cTInAppType);
                f11138k = null;
                return;
        }
        if (c2228n != null) {
            C2181a.m6449a("Displaying In-App: " + cTInAppNotification.f11088R);
            try {
                C0949e0 c0949e0M3805K = ((ActivityC0979t) C7986y.m15846k0()).m3805K();
                c0949e0M3805K.getClass();
                C0940a c0940a = new C0940a(c0949e0M3805K);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("inApp", cTInAppNotification);
                bundle2.putParcelable("config", cleverTapInstanceConfig);
                c2228n.m3583e0(bundle2);
                c0940a.f6345b = R.animator.fade_in;
                c0940a.f6346c = R.animator.fade_out;
                c0940a.f6347d = 0;
                c0940a.f6348e = 0;
                c0940a.mo3695f(R.id.content, c2228n, cTInAppNotification.f11106e0, 1);
                C2181a.m6456i(str, "calling InAppFragment " + cTInAppNotification.f11109g);
                c0940a.m3697i();
            } catch (ClassCastException e10) {
                C2181a.m6456i(str, "Fragment not able to render, please ensure your Activity is an instance of AppCompatActivity" + e10.getMessage());
            } catch (Throwable th3) {
                if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
                    Log.v("CleverTap:" + str, "Fragment not able to render", th3);
                }
            }
        }
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: D */
    public final void mo6436D(CTInAppNotification cTInAppNotification, Bundle bundle, HashMap<String, String> map) {
        this.f11140a.m6413v0(true, cTInAppNotification, bundle);
        if (map != null && !map.isEmpty()) {
            this.f11141b.mo569F();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.CTInAppNotification.InterfaceC2196c
    /* JADX INFO: renamed from: a */
    public final void mo6493a(CTInAppNotification cTInAppNotification) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f11149j.post(new RunnableC2201b(cTInAppNotification));
            return;
        }
        String str = cTInAppNotification.f11117k;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11142c;
        C2181a c2181a = this.f11148i;
        if (str != null) {
            String str2 = cleverTapInstanceConfig.f10995a;
            String str3 = "Unable to process inapp notification " + cTInAppNotification.f11117k;
            c2181a.getClass();
            C2181a.m6452d(str2, str3);
            return;
        }
        String str4 = cleverTapInstanceConfig.f10995a;
        String str5 = "Notification ready: " + cTInAppNotification.f11088R;
        c2181a.getClass();
        C2181a.m6452d(str4, str5);
        m6506h(cTInAppNotification);
    }

    @Override // com.clevertap.android.sdk.InAppNotificationActivity.InterfaceC2180e
    /* JADX INFO: renamed from: b */
    public final void mo6447b() {
        m6507i(false);
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: c */
    public final void mo6445c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : cTInAppNotification.f11091U) {
            if (cTInAppNotificationMedia.f11137d != null && cTInAppNotificationMedia.f11135b != null) {
                if (cTInAppNotificationMedia.f11136c.equals("image/gif")) {
                    String str = cTInAppNotificationMedia.f11135b;
                    int i10 = CTInAppNotification.C2197d.f11120a;
                    synchronized (CTInAppNotification.C2197d.class) {
                        try {
                            C2212c0 c2212c0 = CTInAppNotification.C2197d.f11122c;
                            if (c2212c0 != null) {
                                c2212c0.remove(str);
                                C2181a.m6455h("CTInAppNotification.GifCache: removed gif for key: " + str);
                                CTInAppNotification.C2197d.m6494a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C2181a.m6455h("Deleted GIF - " + cTInAppNotificationMedia.f11135b);
                } else {
                    String str2 = cTInAppNotificationMedia.f11135b;
                    int i11 = C5052d.f32898a;
                    synchronized (C5052d.class) {
                        try {
                            C5051c c5051c = C5052d.f32900c;
                            if (c5051c != null) {
                                c5051c.remove(str2);
                                C2181a.m6455h("CleverTap.ImageCache: removed image for key: " + str2);
                                C5052d.m10730a();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    C2181a.m6455h("Deleted image - " + cTInAppNotificationMedia.f11135b);
                }
            }
        }
        C7957g0 c7957g0 = this.f11144e.f43432a;
        if (c7957g0 != null) {
            String str3 = cTInAppNotification.f11082L;
            if (str3 != null) {
                c7957g0.f43329e.add(str3.toString());
            }
            C2181a c2181a = this.f11148i;
            String str4 = this.f11142c.f10995a;
            String str5 = "InApp Dismissed: " + cTInAppNotification.f11109g;
            c2181a.getClass();
            C2181a.m6460m(str4, str5);
        } else {
            C2181a c2181a2 = this.f11148i;
            String str6 = this.f11142c.f10995a;
            String str7 = "Not calling InApp Dismissed: " + cTInAppNotification.f11109g + " because InAppFCManager is null";
            c2181a2.getClass();
            C2181a.m6460m(str6, str7);
        }
        try {
            this.f11141b.mo570H();
        } catch (Throwable th4) {
            C2181a c2181a3 = this.f11148i;
            String str8 = this.f11142c.f10995a;
            c2181a3.getClass();
            C2181a.m6461n(str8, "Failed to call the in-app notification listener", th4);
        }
        C1735a.m5472a(this.f11142c).m5475c("TAG_FEATURE_IN_APPS").m6585b("InappController#inAppNotificationDidDismiss", new CallableC2200a(context, cTInAppNotification));
    }

    @Override // com.clevertap.android.sdk.InAppNotificationActivity.InterfaceC2180e
    /* JADX INFO: renamed from: d */
    public final void mo6448d() {
        m6507i(true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6505f() {
        if (this.f11147h == null) {
            this.f11147h = new HashSet<>();
            try {
                C7967l0.m15806h(this.f11143d).getClass();
                String str = C7967l0.f43378i;
                if (str != null) {
                    for (String str2 : str.split(",")) {
                        this.f11147h.add(str2.trim());
                    }
                }
            } catch (Throwable unused) {
            }
            String str3 = this.f11142c.f10995a;
            String str4 = "In-app notifications will not be shown on " + Arrays.toString(this.f11147h.toArray());
            this.f11148i.getClass();
            C2181a.m6452d(str3, str4);
        }
        for (String str5 : this.f11147h) {
            Activity activityM15846k0 = C7986y.m15846k0();
            String localClassName = activityM15846k0 != null ? activityM15846k0.getLocalClassName() : null;
            if (localClassName != null && localClassName.contains(str5)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:11:0x002f, B:14:0x0038, B:17:0x0040, B:40:0x008f, B:53:0x00b2, B:56:0x00bb, B:43:0x0098, B:46:0x009f, B:20:0x0048, B:34:0x0074), top: B:98:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:43:0x0098 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:11:0x002f, B:14:0x0038, B:17:0x0040, B:40:0x008f, B:53:0x00b2, B:56:0x00bb, B:43:0x0098, B:46:0x009f, B:20:0x0048, B:34:0x0074), top: B:98:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:11:0x002f, B:14:0x0038, B:17:0x0040, B:40:0x008f, B:53:0x00b2, B:56:0x00bb, B:43:0x0098, B:46:0x009f, B:20:0x0048, B:34:0x0074), top: B:98:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #3 {all -> 0x00ed, blocks: (B:60:0x00da, B:63:0x00e0), top: B:102:0x00da }] */
    /* JADX INFO: renamed from: h */
    public final void m6506h(CTInAppNotification cTInAppNotification) {
        boolean z10;
        String strM15771c;
        boolean z11;
        String strM15771c2;
        boolean z12;
        int i10;
        boolean z13;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f11149j.post(new RunnableC2202c(cTInAppNotification));
            return;
        }
        C7985x c7985x = this.f11144e;
        C7957g0 c7957g0 = c7985x.f43432a;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11142c;
        C2181a c2181a = this.f11148i;
        if (c7957g0 == null) {
            String str = cleverTapInstanceConfig.f10995a;
            String str2 = "getCoreState().getInAppFCManager() is NULL, not showing " + cTInAppNotification.f11109g;
            c2181a.getClass();
            C2181a.m6460m(str, str2);
            return;
        }
        if (cTInAppNotification == null) {
            z13 = false;
        } else {
            try {
                if (C7957g0.m15771c(cTInAppNotification) != null && !cTInAppNotification.f11118l) {
                    String strM15771c3 = C7957g0.m15771c(cTInAppNotification);
                    if (strM15771c3 != null) {
                        if (!c7957g0.f43329e.contains(strM15771c3)) {
                            try {
                                int i11 = cTInAppNotification.f11090T;
                                if (i11 < 0) {
                                    i11 = 1000;
                                }
                                Integer num = c7957g0.f43330f.get(strM15771c3);
                                if (num == null || num.intValue() < i11) {
                                    if (c7957g0.f43331g >= c7957g0.m15775d(C7957g0.m15772e("imc", c7957g0.f43328d), 1)) {
                                    }
                                    if (!z10) {
                                        strM15771c = C7957g0.m15771c(cTInAppNotification);
                                        if (strM15771c == null && cTInAppNotification.f11104d0 != -1) {
                                            try {
                                                if (c7957g0.m15774b(strM15771c)[1] >= cTInAppNotification.f11104d0) {
                                                    z11 = true;
                                                }
                                            } catch (Exception unused) {
                                            }
                                            if (!z11) {
                                                strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                                                if (strM15771c2 != null) {
                                                    if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                                        try {
                                                            i10 = cTInAppNotification.f11102c0;
                                                            if (i10 == -1 && c7957g0.m15774b(strM15771c2)[0] >= i10) {
                                                            }
                                                        } catch (Throwable unused2) {
                                                        }
                                                    }
                                                    z12 = true;
                                                    if (!z12) {
                                                    }
                                                }
                                                z12 = false;
                                                if (!z12) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                            strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                                            if (strM15771c2 != null) {
                                                if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                                    i10 = cTInAppNotification.f11102c0;
                                                    if (i10 == -1) {
                                                    }
                                                }
                                                z12 = true;
                                                if (!z12) {
                                                }
                                            }
                                            z12 = false;
                                            if (!z12) {
                                            }
                                        }
                                    }
                                    z13 = false;
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            strM15771c = C7957g0.m15771c(cTInAppNotification);
                            if (strM15771c == null) {
                                if (c7957g0.m15774b(strM15771c)[1] >= cTInAppNotification.f11104d0) {
                                    z11 = true;
                                }
                                if (!z11) {
                                    strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                                    if (strM15771c2 != null) {
                                        if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                            i10 = cTInAppNotification.f11102c0;
                                            if (i10 == -1) {
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                        }
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                                strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                                if (strM15771c2 != null) {
                                    if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                        i10 = cTInAppNotification.f11102c0;
                                        if (i10 == -1) {
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            }
                        }
                        z13 = false;
                    }
                    z10 = false;
                    if (!z10) {
                        strM15771c = C7957g0.m15771c(cTInAppNotification);
                        if (strM15771c == null) {
                            if (c7957g0.m15774b(strM15771c)[1] >= cTInAppNotification.f11104d0) {
                                z11 = true;
                            }
                            if (!z11) {
                                strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                                if (strM15771c2 != null) {
                                    if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                        i10 = cTInAppNotification.f11102c0;
                                        if (i10 == -1) {
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                            strM15771c2 = C7957g0.m15771c(cTInAppNotification);
                            if (strM15771c2 != null) {
                                if (c7957g0.m15775d(C7957g0.m15772e("istc_inapp", c7957g0.f43328d), 0) < c7957g0.m15775d(C7957g0.m15772e("istmcd_inapp", c7957g0.f43328d), 1)) {
                                    i10 = cTInAppNotification.f11102c0;
                                    if (i10 == -1) {
                                    }
                                }
                                z12 = true;
                                if (!z12) {
                                }
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        }
                    }
                    z13 = false;
                }
                z13 = true;
            } catch (Throwable unused4) {
            }
        }
        if (!z13) {
            String str3 = cleverTapInstanceConfig.f10995a;
            String str4 = "InApp has been rejected by FC, not showing " + cTInAppNotification.f11109g;
            c2181a.getClass();
            C2181a.m6460m(str3, str4);
            if (!cleverTapInstanceConfig.f10999e) {
                C1735a.m5472a(cleverTapInstanceConfig).m5475c("TAG_FEATURE_IN_APPS").m6585b("InAppController#showInAppNotificationIfAny", new CallableC2218f0(this));
            }
            return;
        }
        C7957g0 c7957g1 = c7985x.f43432a;
        c7957g1.getClass();
        String strM15771c4 = C7957g0.m15771c(cTInAppNotification);
        Context context = this.f11143d;
        if (strM15771c4 != null) {
            c7957g1.f43331g++;
            HashMap<String, Integer> map = c7957g1.f43330f;
            Integer num2 = map.get(strM15771c4);
            if (num2 == null) {
                num2 = 1;
            }
            map.put(strM15771c4, Integer.valueOf(num2.intValue() + 1));
            int[] iArrM15774b = c7957g1.m15774b(strM15771c4);
            iArrM15774b[0] = iArrM15774b[0] + 1;
            iArrM15774b[1] = iArrM15774b[1] + 1;
            SharedPreferences.Editor editorEdit = C7977q0.m15827e(c7957g1.f43327c, C7957g0.m15772e("counts_per_inapp", c7957g1.f43328d)).edit();
            editorEdit.putString(strM15771c4, iArrM15774b[0] + "," + iArrM15774b[1]);
            C7977q0.m15830h(editorEdit);
            C7977q0.m15831i(context, c7957g1.m15775d(C7957g0.m15772e("istc_inapp", c7957g1.f43328d), 0) + 1, c7957g1.m15780j(C7957g0.m15772e("istc_inapp", c7957g1.f43328d)));
        }
        this.f11141b.mo570H();
        m6504l(context, cleverTapInstanceConfig, cTInAppNotification);
        if (cTInAppNotification.f11114i0) {
            this.f11145f.m15764h().f43318q++;
            C1735a.m5472a(cleverTapInstanceConfig).m5473a().m6585b("InAppController#incrementLocalInAppCountInPersistentStore", new CallableC2220g0(this, context));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6507i(boolean z10) {
        for (InterfaceC7973o0 interfaceC7973o0 : this.f11141b.mo577O()) {
            if (interfaceC7973o0 != null) {
                interfaceC7973o0.m15820a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6508j(JSONObject jSONObject) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11142c;
        String str = cleverTapInstanceConfig.f10995a;
        String str2 = "Preparing In-App for display: " + jSONObject.toString();
        this.f11148i.getClass();
        C2181a.m6452d(str, str2);
        C1735a.m5472a(cleverTapInstanceConfig).m5475c("TAG_FEATURE_IN_APPS").m6585b("InappController#prepareNotificationForDisplay", new CallableC2203d(jSONObject));
    }

    /* JADX INFO: renamed from: k */
    public final void m6509k() {
        this.f11146g = InAppState.RESUMED;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f11142c;
        String str = cleverTapInstanceConfig.f10995a;
        this.f11148i.getClass();
        C2181a.m6460m(str, "InAppState is RESUMED");
        C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Resuming InApps by calling showInAppNotificationIfAny()");
        if (!cleverTapInstanceConfig.f10999e) {
            C1735a.m5472a(cleverTapInstanceConfig).m5475c("TAG_FEATURE_IN_APPS").m6585b("InAppController#showInAppNotificationIfAny", new CallableC2218f0(this));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6510m(JSONObject jSONObject) {
        if (jSONObject.optBoolean("isHardPermissionRequest", false)) {
            Activity activityM15846k0 = C7986y.m15846k0();
            Objects.requireNonNull(activityM15846k0);
            boolean zOptBoolean = jSONObject.optBoolean("fallbackToNotificationSettings", false);
            if (!activityM15846k0.getClass().equals(InAppNotificationActivity.class)) {
                Intent intent = new Intent(activityM15846k0, (Class<?>) InAppNotificationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("config", this.f11142c);
                intent.putExtra("configBundle", bundle);
                intent.putExtra("inApp", f11138k);
                intent.putExtra("displayHardPermissionDialog", true);
                intent.putExtra("shouldShowFallbackSettings", zOptBoolean);
                activityM15846k0.startActivity(intent);
            }
        } else {
            m6508j(jSONObject);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6511n() {
        this.f11146g = InAppState.SUSPENDED;
        String str = this.f11142c.f10995a;
        this.f11148i.getClass();
        C2181a.m6460m(str, "InAppState is SUSPENDED");
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: y */
    public final void mo6446y(CTInAppNotification cTInAppNotification) {
        this.f11140a.m6413v0(false, cTInAppNotification, null);
        try {
            this.f11141b.mo570H();
        } catch (Throwable th2) {
            String str = this.f11142c.f10995a;
            if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
                Log.v("CleverTap:" + str, "Failed to call the in-app notification listener", th2);
            }
        }
    }
}
