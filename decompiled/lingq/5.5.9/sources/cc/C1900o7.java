package cc;

import ae.C0062b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.C2550e;
import com.google.android.gms.internal.measurement.C2663fa;
import com.google.android.gms.internal.measurement.InterfaceC2677ga;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import dm.C5212l;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p176ib.C6272i;
import p295ob.C8032b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900o7 extends AbstractC1772a5 {

    /* JADX INFO: renamed from: g */
    public static final String[] f10099g = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: h */
    public static final String[] f10100h = {"_err"};

    /* JADX INFO: renamed from: c */
    public SecureRandom f10101c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f10102d;

    /* JADX INFO: renamed from: e */
    public int f10103e;

    /* JADX INFO: renamed from: f */
    public Integer f10104f;

    public C1900o7(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10104f = null;
        this.f10102d = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m5791S(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m5792V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: W */
    public static boolean m5793W(String str) {
        C6272i.m12912f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m5794X(Context context) {
        C6272i.m12915i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m5795Y(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C6272i.m12915i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        if (!TextUtils.isEmpty(str3) && str3.equals(str4)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public static byte[] m5796Z(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final boolean m5797a0(int i10, Bundle bundle) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m5798d0(String str, String[] strArr) {
        C6272i.m12915i(strArr);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || (str != null && str.equals(obj))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public static long m5799k0(byte[] bArr) {
        C6272i.m12915i(bArr);
        int length = bArr.length;
        int i10 = 0;
        if (!(length > 0)) {
            throw new IllegalStateException();
        }
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* JADX INFO: renamed from: o */
    public static String m5800o(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static MessageDigest m5801p() {
        for (int i10 = 0; i10 < 2; i10++) {
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

    /* JADX INFO: renamed from: r */
    public static ArrayList m5802r(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.f14601a);
            bundle.putString("origin", zzacVar.f14602b);
            bundle.putLong("creation_timestamp", zzacVar.f14604d);
            bundle.putString("name", zzacVar.f14603c.f14618b);
            Object objM8536q = zzacVar.f14603c.m8536q();
            C6272i.m12915i(objM8536q);
            C0062b.m275H2(bundle, objM8536q);
            bundle.putBoolean("active", zzacVar.f14605e);
            String str = zzacVar.f14606f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f14607g;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f14613a);
                zzau zzauVar = zzawVar.f14614b;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.m8535q());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f14608h);
            zzaw zzawVar2 = zzacVar.f14609i;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f14613a);
                zzau zzauVar2 = zzawVar2.f14614b;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.m8535q());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.f14603c.f14619c);
            bundle.putLong("time_to_live", zzacVar.f14610j);
            zzaw zzawVar3 = zzacVar.f14611k;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f14613a);
                zzau zzauVar3 = zzawVar3.f14614b;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.m8535q());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static void m5803u(C1988y5 c1988y5, Bundle bundle, boolean z10) {
        if (bundle != null && c1988y5 != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            }
            String str = c1988y5.f10414a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = c1988y5.f10415b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", c1988y5.f10416c);
            return;
        }
        if (bundle != null && c1988y5 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5804y(InterfaceC1891n7 interfaceC1891n7, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m5797a0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC1891n7.mo5572a(str, bundle);
    }

    /* JADX INFO: renamed from: A */
    public final void m5805A(InterfaceC2843t0 interfaceC2843t0, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5806B(InterfaceC2843t0 interfaceC2843t0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m5807C(InterfaceC2843t0 interfaceC2843t0, Bundle bundle) {
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m5808D(InterfaceC2843t0 interfaceC2843t0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m5809E(InterfaceC2843t0 interfaceC2843t0, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning int value to wrapper");
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m5810F(InterfaceC2843t0 interfaceC2843t0, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5811G(String str, InterfaceC2843t0 interfaceC2843t0) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX INFO: renamed from: H */
    public final void m5812H(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i10;
        int iM5830h0;
        int iM5815K;
        String str3;
        if (bundle == null) {
            return;
        }
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1802e c1802e = c1897o4.f10084g;
        ((InterfaceC2677ga) C2663fa.f14198b.f14199a.zza()).zza();
        String str4 = null;
        if (((C1897o4) c1802e.f10430a).f10084g.m5582q(null, C1985y2.f10378t0)) {
            C1900o7 c1900o7 = ((C1897o4) c1802e.f10430a).f10089l;
            C1897o4.m5774i(c1900o7);
            if (c1900o7.m5824U(231100000)) {
                i10 = 35;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iM5830h0 = !z10 ? m5830h0(str5) : 0;
                if (iM5830h0 == 0) {
                    iM5830h0 = m5829g0(str5);
                }
            } else {
                iM5830h0 = 0;
            }
            if (iM5830h0 != 0) {
                m5843t(bundle, iM5830h0, str5, iM5830h0 == 3 ? str5 : str4);
                bundle.remove(str5);
                str3 = str4;
                i10 = i10;
            } else {
                if (m5791S(bundle.get(str5))) {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9947k.m5626d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str5);
                    iM5815K = 22;
                } else {
                    iM5815K = m5815K(str, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iM5815K != 0 && !"_ev".equals(str5)) {
                    m5843t(bundle, iM5815K, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (m5793W(str5) && !m5798d0(str5, C0062b.f158e)) {
                    int i12 = i11 + 1;
                    if (m5824U(231100000)) {
                        if (i12 > i10) {
                            ((InterfaceC2677ga) C2663fa.f14198b.f14199a.zza()).zza();
                            str3 = null;
                            if (c1897o4.f10084g.m5582q(null, C1985y2.f10378t0)) {
                                C1860k3 c1860k4 = c1897o4.f10086i;
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9944h.m5625c(c1897o4.f10057H.m5603d(str), c1897o4.f10057H.m5601b(bundle), "Item can't contain more than " + i10 + " item-scoped custom params");
                                m5797a0(28, bundle);
                                bundle.remove(str5);
                            } else {
                                C1860k3 c1860k5 = c1897o4.f10086i;
                                C1897o4.m5776k(c1860k5);
                                c1860k5.f9944h.m5625c(c1897o4.f10057H.m5603d(str), c1897o4.f10057H.m5601b(bundle), "Item cannot contain custom parameters");
                                m5797a0(23, bundle);
                                bundle.remove(str5);
                            }
                        }
                        i11 = i12;
                    } else {
                        C1860k3 c1860k6 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k6);
                        c1860k6.f9944h.m5625c(c1897o4.f10057H.m5603d(str), c1897o4.f10057H.m5601b(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        m5797a0(23, bundle);
                        bundle.remove(str5);
                    }
                    str3 = null;
                    i11 = i12;
                }
                str3 = null;
            }
            i10 = i10;
            str4 = str3;
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5813I(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (!zIsEmpty) {
            C6272i.m12915i(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
                if (TextUtils.isEmpty(c1897o4.f10078b)) {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9944h.m5624b(C1860k3.m5700q(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
                if (TextUtils.isEmpty(c1897o5.f10078b)) {
                    C1860k3 c1860k4 = c1897o5.f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9944h.m5623a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            C6272i.m12915i(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9944h.m5624b(C1860k3.m5700q(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m5814J(String str, int i10, String str2) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str2 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9944h.m5624b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k4);
        c1860k4.f9944h.m5626d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX INFO: renamed from: K */
    public final int m5815K(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int i11;
        int size;
        mo5748g();
        boolean zM5791S = m5791S(obj);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (!zM5791S) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!m5798d0(str2, C0062b.f157d)) {
                return 20;
            }
            C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
            C1881m6 c1881m6M5788t = c1897o4.m5788t();
            c1881m6M5788t.mo5748g();
            c1881m6M5788t.m5851h();
            if (c1881m6M5788t.m5762p()) {
                C1900o7 c1900o7 = ((C1897o4) c1881m6M5788t.f10430a).f10089l;
                C1897o4.m5774i(c1900o7);
                if (c1900o7.m5832j0() < 200900) {
                    return 25;
                }
            }
            c1897o4.getClass();
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                C1860k3 c1860k3 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9947k.m5626d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                c1897o4.getClass();
                if (z12) {
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
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if (m5792V(str) || m5792V(str2)) {
            ((C1897o4) interfaceC1781b5).getClass();
            i11 = 256;
        } else {
            ((C1897o4) interfaceC1781b5).getClass();
            i11 = 100;
        }
        if (m5818N(i11, obj, "param", str2)) {
            return i10;
        }
        if (z11) {
            if (obj instanceof Bundle) {
                m5812H(str, str2, (Bundle) obj, list, z10);
            } else if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        m5812H(str, str2, (Bundle) parcelable, list, z10);
                    } else {
                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9947k.m5625c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                    }
                }
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Object obj2 = arrayList2.get(i12);
                    if (obj2 instanceof Bundle) {
                        m5812H(str, str2, (Bundle) obj2, list, z10);
                    } else {
                        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9947k.m5625c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                    }
                }
            }
            return i10;
        }
        return 4;
    }

    /* JADX INFO: renamed from: L */
    public final void m5816L() {
        mo5748g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5623a("Utils falling back to Random for random id");
            }
        }
        this.f10102d.set(jNextLong);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m5817M(String str, String[] strArr, String[] strArr2, String str2) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str2 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9944h.m5624b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f10099g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9944h.m5625c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m5798d0(str2, strArr) || (strArr2 != null && m5798d0(str2, strArr2))) {
            return true;
        }
        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k5);
        c1860k5.f9944h.m5625c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m5818N(int i10, Object obj, String str, String str2) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean)) {
            if (!(obj instanceof Double)) {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    return false;
                }
                String string = obj.toString();
                if (string.codePointCount(0, string.length()) > i10) {
                    C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9947k.m5626d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m5819O(String str, String str2) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str2 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9944h.m5624b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9944h.m5624b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9944h.m5625c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k6);
                c1860k6.f9944h.m5625c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5820P(String str, String str2) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str2 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9944h.m5624b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9944h.m5624b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9944h.m5625c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k6);
                c1860k6.f9944h.m5625c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5821Q(String str) {
        mo5748g();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        if (C8032b.m15902a(c1897o4.f10076a).f43660a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5624b(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m5822R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        String strM5574h = c1897o4.f10084g.m5574h("debug.firebase.analytics.app");
        c1897o4.getClass();
        return strM5574h.equals(str);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m5823T(Context context, String str) {
        Signature[] signatureArr;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM15900b = C8032b.m15902a(context).m15900b(str, 64);
            if (packageInfoM15900b != null && (signatureArr = packageInfoM15900b.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(e10, "Package name not found");
        } catch (CertificateException e11) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5624b(e11, "Error obtaining certificate");
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m5824U(int i10) {
        boolean z10;
        Boolean bool = ((C1897o4) this.f10430a).m5788t().f10008e;
        if (m5832j0() < i10 / 1000) {
            z10 = false;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return false;
                }
                z10 = true;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m5825b0(String str) {
        boolean zEquals = "_ldl".equals(str);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (zEquals) {
            ((C1897o4) interfaceC1781b5).getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            ((C1897o4) interfaceC1781b5).getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            ((C1897o4) interfaceC1781b5).getClass();
            return 100;
        }
        ((C1897o4) interfaceC1781b5).getClass();
        return 36;
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m5826c0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
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
                return m5800o(obj.toString(), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle bundleM5838n0 = m5838n0((Bundle) parcelable);
                    if (!bundleM5838n0.isEmpty()) {
                        arrayList.add(bundleM5838n0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return obj;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m5827e0(Object obj, String str) {
        return "_ldl".equals(str) ? m5818N(m5825b0(str), obj, "user property referrer", str) : m5818N(m5825b0(str), obj, "user property", str) ? 0 : 7;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m5828f0(String str) {
        if (!m5819O("event", str)) {
            return 2;
        }
        if (!m5817M("event", C5212l.f33283b, C5212l.f33284c, str)) {
            return 13;
        }
        ((C1897o4) this.f10430a).getClass();
        return !m5814J("event", 40, str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final int m5829g0(String str) {
        if (!m5819O("event param", str)) {
            return 3;
        }
        if (!m5817M("event param", null, null, str)) {
            return 14;
        }
        ((C1897o4) this.f10430a).getClass();
        return !m5814J("event param", 40, str) ? 3 : 0;
    }

    @Override // cc.AbstractC1772a5
    /* JADX INFO: renamed from: h */
    public final boolean mo5491h() {
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final int m5830h0(String str) {
        if (!m5820P("event param", str)) {
            return 3;
        }
        if (!m5817M("event param", null, null, str)) {
            return 14;
        }
        ((C1897o4) this.f10430a).getClass();
        return !m5814J("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m5831i0(String str) {
        if (!m5819O("user property", str)) {
            return 6;
        }
        if (!m5817M("user property", C8573r0.f45967d, null, str)) {
            return 15;
        }
        ((C1897o4) this.f10430a).getClass();
        return !m5814J("user property", 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* JADX INFO: renamed from: j0 */
    public final int m5832j0() {
        if (this.f10104f == null) {
            C2549d c2549d = C2549d.f13922b;
            Context context = ((C1897o4) this.f10430a).f10076a;
            c2549d.getClass();
            this.f10104f = Integer.valueOf(C2550e.getApkVersion(context) / 1000);
        }
        return this.f10104f.intValue();
    }

    /* JADX INFO: renamed from: l */
    public final Object m5833l(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int i10 = 256;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (zEquals) {
            ((C1897o4) interfaceC1781b5).getClass();
            return m5826c0(256, obj, true, true);
        }
        if (m5792V(str)) {
            ((C1897o4) interfaceC1781b5).getClass();
        } else {
            ((C1897o4) interfaceC1781b5).getClass();
            i10 = 100;
        }
        return m5826c0(i10, obj, false, true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public final long m5834l0() {
        long andIncrement;
        long j10;
        if (this.f10102d.get() != 0) {
            synchronized (this.f10102d) {
                this.f10102d.compareAndSet(-1L, 1L);
                andIncrement = this.f10102d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f10102d) {
            long jNanoTime = System.nanoTime();
            ((C1897o4) this.f10430a).f10058I.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f10103e + 1;
            this.f10103e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    /* JADX INFO: renamed from: m */
    public final Object m5835m(Object obj, String str) {
        return "_ldl".equals(str) ? m5826c0(m5825b0(str), obj, true, false) : m5826c0(m5825b0(str), obj, false, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final Bundle m5836m0(boolean z10, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("utm_id");
                queryParameter6 = uri.getQueryParameter("dclid");
                queryParameter7 = uri.getQueryParameter("srsltid");
                queryParameter8 = z10 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z10 || TextUtils.isEmpty(queryParameter8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter9 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("term", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("content", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("aclid", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("cp1", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("anid", queryParameter13);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("campaign_id", queryParameter5);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("dclid", queryParameter6);
            }
            String queryParameter14 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("source_platform", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("creative_format", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("marketing_tactic", queryParameter16);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("srsltid", queryParameter7);
            }
            if (z10 && !TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("sfmc_id", queryParameter8);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m5837n() {
        byte[] bArr = new byte[16];
        m5841q().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: n0 */
    public final Bundle m5838n0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM5833l = m5833l(bundle.get(str), str);
                if (objM5833l == null) {
                    InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9947k.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5604e(str), "Param value can't be null");
                } else {
                    m5847z(bundle2, str, objM5833l);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: o0 */
    public final Bundle m5839o0(String str, Bundle bundle, List list, boolean z10) {
        int iM5830h0;
        boolean zM5798d0 = m5798d0(str, C5212l.f33286e);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1900o7 c1900o7 = ((C1897o4) c1897o4.f10084g.f10430a).f10089l;
        C1897o4.m5774i(c1900o7);
        int i10 = c1900o7.m5824U(201500000) ? 100 : 25;
        int i11 = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iM5830h0 = !z10 ? m5830h0(str2) : 0;
                if (iM5830h0 == 0) {
                    iM5830h0 = m5829g0(str2);
                }
            } else {
                iM5830h0 = 0;
            }
            if (iM5830h0 != 0) {
                m5843t(bundle2, iM5830h0, str2, iM5830h0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM5815K = m5815K(str, str2, bundle.get(str2), bundle2, list, z10, zM5798d0);
                if (iM5815K == 17) {
                    m5843t(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM5815K != 0 && !"_ev".equals(str2)) {
                    m5843t(bundle2, iM5815K, iM5815K == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m5793W(str2)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        String strM762h = C0166e.m762h("Event can't contain more than ", i10, " params");
                        C1860k3 c1860k3 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9944h.m5625c(c1897o4.f10057H.m5603d(str), c1897o4.f10057H.m5601b(bundle), strM762h);
                        m5797a0(5, bundle2);
                        bundle2.remove(str2);
                    }
                    i11 = i12;
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p0 */
    public final zzaw m5840p0(String str, Bundle bundle, String str2, long j10, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m5828f0(str) != 0) {
            C1897o4 c1897o4 = (C1897o4) this.f10430a;
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(c1897o4.f10057H.m5605f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM5839o0 = m5839o0(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleM5839o0 = m5838n0(bundleM5839o0);
        }
        C6272i.m12915i(bundleM5839o0);
        return new zzaw(str, new zzau(bundleM5839o0), str2, j10);
    }

    @EnsuresNonNull({"this.secureRandom"})
    /* JADX INFO: renamed from: q */
    public final SecureRandom m5841q() {
        mo5748g();
        if (this.f10101c == null) {
            this.f10101c = new SecureRandom();
        }
        return this.f10101c;
    }

    /* JADX INFO: renamed from: s */
    public final void m5842s(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: renamed from: t */
    public final void m5843t(Bundle bundle, int i10, String str, Object obj) {
        if (m5797a0(i10, bundle)) {
            ((C1897o4) this.f10430a).getClass();
            bundle.putString("_ev", m5800o(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5844v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        while (true) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    C1900o7 c1900o7 = ((C1897o4) this.f10430a).f10089l;
                    C1897o4.m5774i(c1900o7);
                    c1900o7.m5847z(bundle, str, bundle2.get(str));
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5845w(Parcelable[] parcelableArr, int i10, boolean z10) {
        C6272i.m12915i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m5793W(str) && !m5798d0(str, C0062b.f158e) && (i11 = i11 + 1) > i10) {
                    InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
                    if (z10) {
                        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
                        C1860k3 c1860k3 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9944h.m5625c(c1897o4.f10057H.m5604e(str), c1897o4.f10057H.m5601b(bundle), "Param can't contain more than " + i10 + " item-scoped custom parameters");
                        m5797a0(28, bundle);
                    } else {
                        C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
                        C1860k3 c1860k4 = c1897o5.f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9944h.m5625c(c1897o5.f10057H.m5604e(str), c1897o5.f10057H.m5601b(bundle), "Param cannot contain item-scoped custom parameters");
                        m5797a0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5846x(C1869l3 c1869l3, int i10) {
        Bundle bundle = c1869l3.f9974d;
        int i11 = 0;
        while (true) {
            for (String str : new TreeSet(bundle.keySet())) {
                if (m5793W(str) && (i11 = i11 + 1) > i10) {
                    String strM762h = C0166e.m762h("Event can't contain more than ", i10, " params");
                    C1897o4 c1897o4 = (C1897o4) this.f10430a;
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9944h.m5625c(c1897o4.f10057H.m5603d(c1869l3.f9971a), c1897o4.f10057H.m5601b(bundle), strM762h);
                    m5797a0(5, bundle);
                    bundle.remove(str);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5847z(Bundle bundle, String str, Object obj) {
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
            InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9947k.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5604e(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }
}
