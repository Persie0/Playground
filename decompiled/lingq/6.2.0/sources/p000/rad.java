package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class rad extends ooc {

    /* JADX INFO: renamed from: i */
    public static final String[] f59001i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j */
    public static final String[] f59002j = {"_err"};

    /* JADX INFO: renamed from: c */
    public SecureRandom f59003c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f59004d;

    /* JADX INFO: renamed from: e */
    public int f59005e;

    /* JADX INFO: renamed from: f */
    public MeasurementManagerFutures$Api33Ext5JavaImpl f59006f;

    /* JADX INFO: renamed from: g */
    public Boolean f59007g;

    /* JADX INFO: renamed from: h */
    public Integer f59008h;

    public rad(kjc kjcVar) {
        super(kjcVar);
        this.f59008h = null;
        this.f59004d = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m20499C0(String str) {
        lda.m16127m(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m20500E0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K */
    public static String m20501K(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static boolean m20502O0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: V */
    public static void m20503V(oad oadVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m20507a0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        oadVar.mo12444g(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: W */
    public static MessageDigest m20504W() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static long m20505X(byte[] bArr) {
        lda.m16130p(bArr);
        int length = bArr.length;
        int i = 0;
        lda.m16133s(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m20506Y(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final boolean m20507a0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m20508d0(String str, String[] strArr) {
        lda.m16130p(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static final boolean m20509e0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m20510g0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: l0 */
    public static byte[] m20511l0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static ArrayList m20512w0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f12376a);
            bundle.putString("origin", zzahVar.f12377b);
            bundle.putLong("creation_timestamp", zzahVar.f12379d);
            bundle.putString("name", zzahVar.f12378c.f12407b);
            Object objZza = zzahVar.f12378c.zza();
            lda.m16130p(objZza);
            hed.m13214b(bundle, objZza);
            bundle.putBoolean("active", zzahVar.f12380e);
            String str = zzahVar.f12381f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.f12382g;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.f12389a);
                zzbf zzbfVar = zzbhVar.f12390b;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.m5952g0());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.f12383h);
            zzbh zzbhVar2 = zzahVar.f12384i;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.f12389a);
                zzbf zzbfVar2 = zzbhVar2.f12390b;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.m5952g0());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f12378c.f12408c);
            bundle.putLong("time_to_live", zzahVar.f12385j);
            zzbh zzbhVar3 = zzahVar.f12386k;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.f12389a);
                zzbf zzbfVar3 = zzbhVar3.f12390b;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.m5952g0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m20513x0(Context context) {
        ActivityInfo receiverInfo;
        lda.m16130p(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m20514y0(bzc bzcVar, Bundle bundle, boolean z) {
        if (bundle != null && bzcVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = bzcVar.f9208a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = bzcVar.f9209b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", bzcVar.f9210c);
                return;
            }
            z = false;
        }
        if (bundle != null && bzcVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final long m20515A0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f59004d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f59004d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((kjc) this.f60774a).f47443k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f59005e + 1;
            this.f59005e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: B0 */
    public final SecureRandom m20516B0() {
        mo12359D();
        if (this.f59003c == null) {
            this.f59003c = new SecureRandom();
        }
        return this.f59003c;
    }

    /* JADX INFO: renamed from: D0 */
    public final Bundle m20517D0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        kjc kjcVar = (kjc) this.f60774a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (kjcVar.f47436d.m4869O(null, z8c.f71155a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        kjcVar.f47436d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = m20501K(string, iMax - 3, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    @Override // p000.ooc
    /* JADX INFO: renamed from: E */
    public final boolean mo12250E() {
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m20518F0(String str, String str2) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str2 == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68082h.m17924b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68082h.m17924b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68082h.m17925c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                xcc xccVar4 = kjcVar.f47438f;
                kjc.m15280l(xccVar4);
                xccVar4.f68082h.m17925c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m20519G0(String str, String str2) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str2 == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68082h.m17924b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68082h.m17924b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                xcc xccVar3 = kjcVar.f47438f;
                kjc.m15280l(xccVar3);
                xccVar3.f68082h.m17925c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                xcc xccVar4 = kjcVar.f47438f;
                kjc.m15280l(xccVar4);
                xccVar4.f68082h.m17925c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m20520H(int i, Object obj, String str, String str2) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        xcc xccVar = ((kjc) this.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68085k.m17926d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m20521H0(String str, String[] strArr, String[] strArr2, String str2) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str2 == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68082h.m17924b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f59001i[i])) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68082h.m17925c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m20508d0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m20508d0(str2, strArr2)) {
            return true;
        }
        xcc xccVar3 = kjcVar.f47438f;
        kjc.m15280l(xccVar3);
        xccVar3.f68082h.m17925c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final void m20522I(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM20530M0;
        int iM20527L;
        list = list;
        if (bundle == null) {
            return;
        }
        kjc kjcVar = (kjc) this.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        xcc xccVar = kjcVar.f47438f;
        rbc rbcVar = kjcVar.f47442j;
        rad radVar = ((kjc) cmbVar.f60774a).f47441i;
        kjc.m15278j(radVar);
        int i = true != radVar.m20548m0(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM20530M0 = !z ? m20530M0(str3) : 0;
                if (iM20530M0 == 0) {
                    iM20530M0 = m20532N0(str3);
                }
            } else {
                iM20530M0 = 0;
            }
            if (iM20530M0 != 0) {
                m20536R(bundle, iM20530M0, str3, iM20530M0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m20502O0(bundle.get(str3))) {
                    kjc.m15280l(xccVar);
                    xccVar.f68085k.m17926d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM20527L = 22;
                } else {
                    iM20527L = m20527L(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM20527L != 0 && !"_ev".equals(str3)) {
                    m20536R(bundle, iM20527L, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m20499C0(str3) && !m20508d0(str3, syc.f61642d)) {
                    i2++;
                    if (!m20548m0(231100000)) {
                        kjc.m15280l(xccVar);
                        xccVar.f68082h.m17925c("Item array not supported on client's version of Google Play Services (Android Only)", rbcVar.m20572a(str), rbcVar.m20576e(bundle));
                        m20507a0(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            kjc.m15280l(xccVar);
                            occ occVar = xccVar.f68082h;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            occVar.m17925c(sb.toString(), rbcVar.m20572a(str), rbcVar.m20576e(bundle));
                        }
                        m20507a0(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m20523I0(String str, int i, String str2) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str2 == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68082h.m17924b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar2);
        xccVar2.f68082h.m17926d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m20524J(String str) {
        kjc kjcVar = (kjc) this.f60774a;
        if (TextUtils.isEmpty(str)) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68082h.m17923a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        lda.m16130p(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar2);
        xccVar2.f68082h.m17924b(xcc.m24449L(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m20525J0(String str) {
        if (!m20519G0("event", str)) {
            return 2;
        }
        if (m20521H0("event", AbstractC3184kh.f47271m, ((kjc) this.f60774a).f47436d.m4869O(null, z8c.f71170f1) ? AbstractC3184kh.f47273o : AbstractC3184kh.f47272n, str)) {
            return !m20523I0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m20526K0(String str) {
        return ((kjc) this.f60774a).f47436d.m4869O(null, z8c.f71170f1) ? m20508d0(str, AbstractC3184kh.f47275q) : m20508d0(str, AbstractC3184kh.f47274p);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX INFO: renamed from: L */
    public final int m20527L(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        int i2 = 0;
        if (!m20502O0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m20508d0(str2, syc.f61641c)) {
                return 20;
            }
            v4d v4dVarM15287o = kjcVar.m15287o();
            v4dVarM15287o.mo12359D();
            v4dVarM15287o.m13744E();
            if (v4dVarM15287o.m23110K()) {
                rad radVar = ((kjc) v4dVarM15287o.f60774a).f47441i;
                kjc.m15278j(radVar);
                if (radVar.m20549n0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68085k.m17926d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (m20510g0(str) || m20510g0(str2)) {
            kjcVar.f47436d.getClass();
            iMax = Math.max(500, 256);
        } else {
            kjcVar.f47436d.getClass();
        }
        if (!m20520H(iMax, obj, "param", str2)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m20522I(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68085k.m17925c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    m20522I(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        xcc xccVar3 = kjcVar.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68085k.m17925c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    m20522I(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: L0 */
    public final int m20528L0(String str) {
        if (!m20519G0("user property", str)) {
            return 6;
        }
        if (!m20521H0("user property", AbstractC3584sr.f61286m, null, str)) {
            return 15;
        }
        ((kjc) this.f60774a).getClass();
        return !m20523I0("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: M */
    public final Object m20529M(Object obj, String str) {
        kjc kjcVar = (kjc) this.f60774a;
        int iMax = 500;
        if ("_ev".equals(str)) {
            kjcVar.f47436d.getClass();
            return m20541b0(Math.max(500, 256), obj, true, true);
        }
        if (m20510g0(str)) {
            kjcVar.f47436d.getClass();
            iMax = Math.max(500, 256);
        } else {
            kjcVar.f47436d.getClass();
        }
        return m20541b0(iMax, obj, false, true);
    }

    /* JADX INFO: renamed from: M0 */
    public final int m20530M0(String str) {
        if (!m20518F0("event param", str)) {
            return 3;
        }
        if (!m20521H0("event param", null, null, str)) {
            return 14;
        }
        ((kjc) this.f60774a).getClass();
        return !m20523I0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: N */
    public final Bundle m20531N(String str, Bundle bundle, List list, boolean z) {
        int iM20530M0;
        boolean zM20508d0 = m20508d0(str, AbstractC3184kh.f47277s);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        kjc kjcVar = (kjc) this.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        rbc rbcVar = kjcVar.f47442j;
        rad radVar = ((kjc) cmbVar.f60774a).f47441i;
        kjc.m15278j(radVar);
        int i = radVar.m20548m0(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iM20530M0 = !z ? m20530M0(str2) : 0;
                if (iM20530M0 == 0) {
                    iM20530M0 = m20532N0(str2);
                }
            } else {
                iM20530M0 = 0;
            }
            if (iM20530M0 != 0) {
                m20536R(bundle2, iM20530M0, str2, iM20530M0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM20527L = m20527L(str, str2, bundle.get(str2), bundle2, list, z, zM20508d0);
                if (iM20527L == 17) {
                    m20536R(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM20527L != 0 && !"_ev".equals(str2)) {
                    m20536R(bundle2, iM20527L, iM20527L == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m20499C0(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68082h.m17925c(string, rbcVar.m20572a(str), rbcVar.m20576e(bundle));
                        }
                        m20507a0(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m20532N0(String str) {
        if (!m20519G0("event param", str)) {
            return 3;
        }
        if (!m20521H0("event param", null, null, str)) {
            return 14;
        }
        ((kjc) this.f60774a).getClass();
        return !m20523I0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: O */
    public final void m20533O(bdc bdcVar, int i) {
        Bundle bundle = bdcVar.f8406e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m20499C0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    kjc kjcVar = (kjc) this.f60774a;
                    xcc xccVar = kjcVar.f47438f;
                    rbc rbcVar = kjcVar.f47442j;
                    kjc.m15280l(xccVar);
                    xccVar.f68082h.m17925c(string, rbcVar.m20572a(bdcVar.f8402a), rbcVar.m20576e(bundle));
                    m20507a0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m20534P(Parcelable[] parcelableArr, int i) {
        lda.m16130p(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m20499C0(str) && !m20508d0(str, syc.f61642d) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        kjc kjcVar = (kjc) this.f60774a;
                        xcc xccVar = kjcVar.f47438f;
                        rbc rbcVar = kjcVar.f47442j;
                        kjc.m15280l(xccVar);
                        occ occVar = xccVar.f68082h;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        occVar.m17925c(sb.toString(), rbcVar.m20573b(str), rbcVar.m20576e(bundle));
                    }
                    m20507a0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m20535Q(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                rad radVar = ((kjc) this.f60774a).f47441i;
                kjc.m15278j(radVar);
                radVar.m20539U(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m20536R(Bundle bundle, int i, String str, Object obj) {
        if (m20507a0(i, bundle)) {
            ((kjc) this.f60774a).getClass();
            bundle.putString("_ev", m20501K(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m20537S(Object obj, String str) {
        return "_ldl".equals(str) ? m20520H(m20542c0(str), obj, "user property referrer", str) : m20520H(m20542c0(str), obj, "user property", str) ? 0 : 7;
    }

    /* JADX INFO: renamed from: T */
    public final Object m20538T(Object obj, String str) {
        return "_ldl".equals(str) ? m20541b0(m20542c0(str), obj, true, false) : m20541b0(m20542c0(str), obj, false, false);
    }

    /* JADX INFO: renamed from: U */
    public final void m20539U(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            kjc kjcVar = (kjc) this.f60774a;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68085k.m17925c("Not putting event parameter. Invalid value type. name, type", kjcVar.f47442j.m20573b(str), simpleName);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final long m20540Z() {
        long j;
        Object e;
        Integer num;
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        tac tacVarM15289q = kjcVar.m15289q();
        xcc xccVar = kjcVar.f47438f;
        Integer num2 = null;
        if (!m20509e0((String) z8c.f71196q0.m21901a(null), tacVarM15289q.m21928J())) {
            return 0L;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        if (i < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) z8c.f71184k0.m21901a(null)).intValue() ? 16L : 0L;
        }
        if (!m20543f0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f59007g != null) {
                zBooleanValue = this.f59007g.booleanValue();
            } else {
                if (this.f59006f == null) {
                    this.f59006f = wob.m24095a(kjcVar.f47433a);
                }
                MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = this.f59006f;
                if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
                    try {
                        num = (Integer) measurementManagerFutures$Api33Ext5JavaImpl.m2576c().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                num2 = num;
                                kjc.m15280l(xccVar);
                                xccVar.f68083i.m17924b(e, "Measurement manager api exception");
                                this.f59007g = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.f59007g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        e = e3;
                    }
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17924b(num, "Measurement manager api status result");
                    zBooleanValue = this.f59007g.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m20541b0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m20501K(obj.toString(), i, z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM20545i0 = m20545i0((Bundle) parcelable);
                if (!bundleM20545i0.isEmpty()) {
                    arrayList.add(bundleM20545i0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m20542c0(String str) {
        kjc kjcVar = (kjc) this.f60774a;
        if ("_ldl".equals(str)) {
            kjcVar.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            kjcVar.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            kjcVar.getClass();
            return 100;
        }
        kjcVar.getClass();
        return 36;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m20543f0(String str) {
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        if (m9b.m16702a(kjcVar.f47433a).f66813a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68075H.m17924b(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m20544h0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((kjc) this.f60774a).f47436d.m4862H("debug.firebase.analytics.app").equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public final Bundle m20545i0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM20529M = m20529M(bundle.get(str), str);
                if (objM20529M == null) {
                    kjc kjcVar = (kjc) this.f60774a;
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68085k.m17924b(kjcVar.f47442j.m20573b(str), "Param value can't be null");
                } else {
                    m20539U(bundle2, str, objM20529M);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: j0 */
    public final zzbh m20546j0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m20525J0(str) != 0) {
            kjc kjcVar = (kjc) this.f60774a;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(kjcVar.f47442j.m20574c(str), "Invalid conditional property event name");
            ij6.m13959q();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM20531N = m20531N(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM20531N = m20545i0(bundleM20531N);
        }
        lda.m16130p(bundleM20531N);
        return new zzbh(str, new zzbf(bundleM20531N), str2, j, j2);
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m20547k0(Context context, String str) {
        Signature[] signatureArr;
        kjc kjcVar = (kjc) this.f60774a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM23949b = m9b.m16702a(context).m23949b(64, str);
            if (packageInfoM23949b == null || (signatureArr = packageInfoM23949b.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m20548m0(int i) {
        Boolean bool = ((kjc) this.f60774a).m15287o().f64867e;
        if (m20549n0() < i / DescriptorProtos.Edition.EDITION_2023_VALUE) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final int m20549n0() {
        if (this.f59008h == null) {
            kjc kjcVar = (kjc) this.f60774a;
            po3 po3Var = po3.f56584b;
            Context context = kjcVar.f47433a;
            po3Var.getClass();
            this.f59008h = Integer.valueOf(po3.m19430a(context) / DescriptorProtos.Edition.EDITION_2023_VALUE);
        }
        return this.f59008h.intValue();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m20550o0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m20551p0(String str, oub oubVar) {
        try {
            oubVar.mo16549u(g9a.m12429f("r", str));
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning string value to wrapper");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m20552q0(oub oubVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m20553r0(oub oubVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning int value to wrapper");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m20554s0(oub oubVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m20555t0(oub oubVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m20556u0(oub oubVar, Bundle bundle) {
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m20557v0(oub oubVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final String m20558z0() {
        byte[] bArr = new byte[16];
        m20516B0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }
}
