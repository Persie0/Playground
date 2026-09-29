package cc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.AbstractC2687h6;
import com.google.android.gms.internal.measurement.C2586a3;
import com.google.android.gms.internal.measurement.C2589a6;
import com.google.android.gms.internal.measurement.C2590a7;
import com.google.android.gms.internal.measurement.C2596b;
import com.google.android.gms.internal.measurement.C2599b2;
import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2641e2;
import com.google.android.gms.internal.measurement.C2642e3;
import com.google.android.gms.internal.measurement.C2656f3;
import com.google.android.gms.internal.measurement.C2669g2;
import com.google.android.gms.internal.measurement.C2711j2;
import com.google.android.gms.internal.measurement.C2712j3;
import com.google.android.gms.internal.measurement.C2715j6;
import com.google.android.gms.internal.measurement.C2726k3;
import com.google.android.gms.internal.measurement.C2734kb;
import com.google.android.gms.internal.measurement.C2740l3;
import com.google.android.gms.internal.measurement.C2788oa;
import com.google.android.gms.internal.measurement.C2807q3;
import com.google.android.gms.internal.measurement.C2833s3;
import com.google.android.gms.internal.measurement.C2859u3;
import com.google.android.gms.internal.measurement.C2897x2;
import com.google.android.gms.internal.measurement.C2923z2;
import com.google.android.gms.internal.measurement.InterfaceC2823r6;
import com.google.android.gms.internal.measurement.InterfaceC2836s6;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import dm.C5212l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.k7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1864k7 extends AbstractC1774a7 {
    public C1864k7(C1846i7 c1846i7) {
        super(c1846i7);
    }

    /* JADX INFO: renamed from: D */
    public static ArrayList m5711D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static HashMap m5712E(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m5712E((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m5712E((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m5712E((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m5713G(int i10, InterfaceC2823r6 interfaceC2823r6) {
        if (i10 < ((C2590a7) interfaceC2823r6).f14053c * 64) {
            if (((1 << (i10 % 64)) & ((Long) ((C2590a7) interfaceC2823r6).get(i10 / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m5714I(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: K */
    public static final void m5715K(C2586a3 c2586a3, String str, Long l10) {
        List listM7641r = c2586a3.m7641r();
        int i10 = 0;
        while (true) {
            if (i10 >= listM7641r.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((C2656f3) listM7641r.get(i10)).m7824z())) {
                break;
            } else {
                i10++;
            }
        }
        C2642e3 c2642e3M7811x = C2656f3.m7811x();
        c2642e3M7811x.m7766m(str);
        if (l10 instanceof Long) {
            c2642e3M7811x.m7765k(l10.longValue());
        }
        if (i10 < 0) {
            c2586a3.m7638n(c2642e3M7811x);
        } else {
            c2586a3.m7899j();
            C2600b3.m7664C((C2600b3) c2586a3.f14271b, i10, (C2656f3) c2642e3M7811x.m7897h());
        }
    }

    /* JADX INFO: renamed from: l */
    public static final C2656f3 m5716l(C2600b3 c2600b3, String str) {
        for (C2656f3 c2656f3 : c2600b3.m7675B()) {
            if (c2656f3.m7824z().equals(str)) {
                return c2656f3;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: m */
    public static final Serializable m5717m(C2600b3 c2600b3, String str) {
        C2656f3 c2656f3M5716l = m5716l(c2600b3, str);
        if (c2656f3M5716l != null) {
            if (c2656f3M5716l.m7819Q()) {
                return c2656f3M5716l.m7813A();
            }
            if (c2656f3M5716l.m7817O()) {
                return Long.valueOf(c2656f3M5716l.m7823w());
            }
            if (c2656f3M5716l.m7815M()) {
                return Double.valueOf(c2656f3M5716l.m7820t());
            }
            if (c2656f3M5716l.m7822v() > 0) {
                List<C2656f3> listM7814B = c2656f3M5716l.m7814B();
                ArrayList arrayList = new ArrayList();
                for (C2656f3 c2656f3 : listM7814B) {
                    if (c2656f3 != null) {
                        Bundle bundle = new Bundle();
                        for (C2656f3 c2656f4 : c2656f3.m7814B()) {
                            if (c2656f4.m7819Q()) {
                                bundle.putString(c2656f4.m7824z(), c2656f4.m7813A());
                            } else if (c2656f4.m7817O()) {
                                bundle.putLong(c2656f4.m7824z(), c2656f4.m7823w());
                            } else if (c2656f4.m7815M()) {
                                bundle.putDouble(c2656f4.m7824z(), c2656f4.m7820t());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final void m5718p(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* JADX INFO: renamed from: q */
    public static final String m5719q(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static final void m5720r(StringBuilder sb2, String str, C2807q3 c2807q3) {
        if (c2807q3 == null) {
            return;
        }
        m5718p(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2807q3.m8195u() != 0) {
            m5718p(4, sb2);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l10 : c2807q3.m8191B()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (c2807q3.m8197w() != 0) {
            m5718p(4, sb2);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l11 : c2807q3.m8193D()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (c2807q3.m8194t() != 0) {
            m5718p(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (C2923z2 c2923z2 : c2807q3.m8190A()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2923z2.m8460A() ? Integer.valueOf(c2923z2.m8461t()) : null);
                sb2.append(":");
                sb2.append(c2923z2.m8463z() ? Long.valueOf(c2923z2.m8462u()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (c2807q3.m8196v() != 0) {
            m5718p(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (C2833s3 c2833s3 : c2807q3.m8192C()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2833s3.m8248B() ? Integer.valueOf(c2833s3.m8250u()) : null);
                sb2.append(": [");
                Iterator it = c2833s3.m8252y().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        m5718p(3, sb2);
        sb2.append("}\n");
    }

    /* JADX INFO: renamed from: s */
    public static final void m5721s(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m5718p(i10 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* JADX INFO: renamed from: t */
    public static final void m5722t(StringBuilder sb2, int i10, String str, C2641e2 c2641e2) {
        String str2;
        if (c2641e2 == null) {
            return;
        }
        m5718p(i10, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2641e2.m7764z()) {
            int iM7759E = c2641e2.m7759E();
            if (iM7759E == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM7759E == 2) {
                str2 = "LESS_THAN";
            } else if (iM7759E != 3) {
                str2 = iM7759E != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m5721s(sb2, i10, "comparison_type", str2);
        }
        if (c2641e2.m7756B()) {
            m5721s(sb2, i10, "match_as_float", Boolean.valueOf(c2641e2.m7763y()));
        }
        if (c2641e2.m7755A()) {
            m5721s(sb2, i10, "comparison_value", c2641e2.m7760v());
        }
        if (c2641e2.m7758D()) {
            m5721s(sb2, i10, "min_comparison_value", c2641e2.m7762x());
        }
        if (c2641e2.m7757C()) {
            m5721s(sb2, i10, "max_comparison_value", c2641e2.m7761w());
        }
        m5718p(i10, sb2);
        sb2.append("}\n");
    }

    /* JADX INFO: renamed from: u */
    public static int m5723u(C2726k3 c2726k3, String str) {
        for (int i10 = 0; i10 < ((C2740l3) c2726k3.f14271b).m8035t1(); i10++) {
            if (str.equals(((C2740l3) c2726k3.f14271b).m8000I1(i10).m8287y())) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public static Bundle m5724w(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(m5724w((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    public static zzaw m5725y(C2596b c2596b) {
        Object obj;
        Bundle bundleM5724w = m5724w(c2596b.f14061c, true);
        String string = (!bundleM5724w.containsKey("_o") || (obj = bundleM5724w.get("_o")) == null) ? "app" : obj.toString();
        String strM16751q1 = C8573r0.m16751q1(c2596b.f14059a, C5212l.f33283b, C5212l.f33285d);
        if (strM16751q1 == null) {
            strM16751q1 = c2596b.f14059a;
        }
        return new zzaw(strM16751q1, new zzau(bundleM5724w), string, c2596b.f14060b);
    }

    /* JADX INFO: renamed from: z */
    public static C2715j6 m5726z(C2715j6 c2715j6, byte[] bArr) throws zzll {
        C2589a6 c2589a6M7869b;
        C2589a6 c2589a6 = C2589a6.f14048b;
        if (c2589a6 == null) {
            synchronized (C2589a6.class) {
                try {
                    c2589a6M7869b = C2589a6.f14048b;
                    if (c2589a6M7869b == null) {
                        c2589a6M7869b = AbstractC2687h6.m7869b();
                        C2589a6.f14048b = c2589a6M7869b;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c2589a6 = c2589a6M7869b;
        }
        if (c2589a6 != null) {
            c2715j6.getClass();
            c2715j6.m7896g(bArr, bArr.length, c2589a6);
            return c2715j6;
        }
        c2715j6.getClass();
        c2715j6.m7896g(bArr, bArr.length, C2589a6.f14049c);
        return c2715j6;
    }

    /* JADX INFO: renamed from: A */
    public final String m5727A(C2712j3 c2712j3) {
        StringBuilder sbM771r = C0166e.m771r("\nbatch {\n");
        Iterator it = c2712j3.m7894w().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    sbM771r.append("}\n");
                    return sbM771r.toString();
                }
                C2740l3 c2740l3 = (C2740l3) it.next();
                if (c2740l3 != null) {
                    m5718p(1, sbM771r);
                    sbM771r.append("bundle {\n");
                    if (c2740l3.m8019g1()) {
                        m5721s(sbM771r, 1, "protocol_version", Integer.valueOf(c2740l3.m8029q1()));
                    }
                    C2734kb.m7924a();
                    C1897o4 c1897o4 = (C1897o4) this.f10430a;
                    if (c1897o4.f10084g.m5582q(c2740l3.m8002K1(), C1985y2.f10362l0) && c2740l3.m8022j1()) {
                        m5721s(sbM771r, 1, "session_stitching_token", c2740l3.m7993E());
                    }
                    m5721s(sbM771r, 1, "platform", c2740l3.m7989C());
                    if (c2740l3.m8015c1()) {
                        m5721s(sbM771r, 1, "gmp_version", Long.valueOf(c2740l3.m8045y1()));
                    }
                    if (c2740l3.m8027o1()) {
                        m5721s(sbM771r, 1, "uploading_gmp_version", Long.valueOf(c2740l3.m7994E1()));
                    }
                    if (c2740l3.m8013a1()) {
                        m5721s(sbM771r, 1, "dynamite_version", Long.valueOf(c2740l3.m8041w1()));
                    }
                    if (c2740l3.m8010X0()) {
                        m5721s(sbM771r, 1, "config_version", Long.valueOf(c2740l3.m8037u1()));
                    }
                    m5721s(sbM771r, 1, "gmp_app_id", c2740l3.m8046z());
                    m5721s(sbM771r, 1, "admob_app_id", c2740l3.m8001J1());
                    m5721s(sbM771r, 1, "app_id", c2740l3.m8002K1());
                    m5721s(sbM771r, 1, "app_version", c2740l3.m8036u());
                    if (c2740l3.m8008V0()) {
                        m5721s(sbM771r, 1, "app_version_major", Integer.valueOf(c2740l3.m8004S()));
                    }
                    m5721s(sbM771r, 1, "firebase_instance_id", c2740l3.m8044y());
                    if (c2740l3.m8012Z0()) {
                        m5721s(sbM771r, 1, "dev_cert_hash", Long.valueOf(c2740l3.m8039v1()));
                    }
                    m5721s(sbM771r, 1, "app_store", c2740l3.m8034t());
                    if (c2740l3.m8026n1()) {
                        m5721s(sbM771r, 1, "upload_timestamp_millis", Long.valueOf(c2740l3.m7992D1()));
                    }
                    if (c2740l3.m8023k1()) {
                        m5721s(sbM771r, 1, "start_timestamp_millis", Long.valueOf(c2740l3.m7988B1()));
                    }
                    if (c2740l3.m8014b1()) {
                        m5721s(sbM771r, 1, "end_timestamp_millis", Long.valueOf(c2740l3.m8043x1()));
                    }
                    if (c2740l3.m8018f1()) {
                        m5721s(sbM771r, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2740l3.m7986A1()));
                    }
                    if (c2740l3.m8017e1()) {
                        m5721s(sbM771r, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2740l3.m8047z1()));
                    }
                    m5721s(sbM771r, 1, "app_instance_id", c2740l3.m8003L1());
                    m5721s(sbM771r, 1, "resettable_device_id", c2740l3.m7991D());
                    m5721s(sbM771r, 1, "ds_id", c2740l3.m8042x());
                    if (c2740l3.m8016d1()) {
                        m5721s(sbM771r, 1, "limited_ad_tracking", Boolean.valueOf(c2740l3.m8030r0()));
                    }
                    m5721s(sbM771r, 1, "os_version", c2740l3.m7987B());
                    m5721s(sbM771r, 1, "device_model", c2740l3.m8040w());
                    m5721s(sbM771r, 1, "user_default_language", c2740l3.m7995F());
                    if (c2740l3.m8025m1()) {
                        m5721s(sbM771r, 1, "time_zone_offset_minutes", Integer.valueOf(c2740l3.m8033s1()));
                    }
                    if (c2740l3.m8009W0()) {
                        m5721s(sbM771r, 1, "bundle_sequential_index", Integer.valueOf(c2740l3.m8005S0()));
                    }
                    if (c2740l3.m8021i1()) {
                        m5721s(sbM771r, 1, "service_upload", Boolean.valueOf(c2740l3.m8032s0()));
                    }
                    m5721s(sbM771r, 1, "health_monitor", c2740l3.m7985A());
                    if (c2740l3.m8020h1()) {
                        m5721s(sbM771r, 1, "retry_counter", Integer.valueOf(c2740l3.m8031r1()));
                    }
                    if (c2740l3.m8011Y0()) {
                        m5721s(sbM771r, 1, "consent_signals", c2740l3.m8038v());
                    }
                    C2788oa.m8149a();
                    if (c1897o4.f10084g.m5582q(null, C1985y2.f10384w0) && c2740l3.m8024l1()) {
                        m5721s(sbM771r, 1, "target_os_version", Long.valueOf(c2740l3.m7990C1()));
                    }
                    InterfaceC2836s6 interfaceC2836s6M7999I = c2740l3.m7999I();
                    if (interfaceC2836s6M7999I != null) {
                        Iterator it2 = interfaceC2836s6M7999I.iterator();
                        while (true) {
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C2859u3 c2859u3 = (C2859u3) it2.next();
                                if (c2859u3 != null) {
                                    m5718p(2, sbM771r);
                                    sbM771r.append("user_property {\n");
                                    m5721s(sbM771r, 2, "set_timestamp_millis", c2859u3.m8282K() ? Long.valueOf(c2859u3.m8286v()) : null);
                                    m5721s(sbM771r, 2, "name", c1897o4.f10057H.m5605f(c2859u3.m8287y()));
                                    m5721s(sbM771r, 2, "string_value", c2859u3.m8288z());
                                    m5721s(sbM771r, 2, "int_value", c2859u3.m8281J() ? Long.valueOf(c2859u3.m8285u()) : null);
                                    m5721s(sbM771r, 2, "double_value", c2859u3.m8280I() ? Double.valueOf(c2859u3.m8284t()) : null);
                                    m5718p(2, sbM771r);
                                    sbM771r.append("}\n");
                                }
                            }
                        }
                    }
                    InterfaceC2836s6 interfaceC2836s6M7997G = c2740l3.m7997G();
                    if (interfaceC2836s6M7997G != null) {
                        Iterator it3 = interfaceC2836s6M7997G.iterator();
                        while (true) {
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                C2897x2 c2897x2 = (C2897x2) it3.next();
                                if (c2897x2 != null) {
                                    m5718p(2, sbM771r);
                                    sbM771r.append("audience_membership {\n");
                                    if (c2897x2.m8402D()) {
                                        m5721s(sbM771r, 2, "audience_id", Integer.valueOf(c2897x2.m8405t()));
                                    }
                                    if (c2897x2.m8403E()) {
                                        m5721s(sbM771r, 2, "new_audience", Boolean.valueOf(c2897x2.m8401C()));
                                    }
                                    m5720r(sbM771r, "current_data", c2897x2.m8406w());
                                    if (c2897x2.m8404F()) {
                                        m5720r(sbM771r, "previous_data", c2897x2.m8407x());
                                    }
                                    m5718p(2, sbM771r);
                                    sbM771r.append("}\n");
                                }
                            }
                        }
                    }
                    InterfaceC2836s6 interfaceC2836s6M7998H = c2740l3.m7998H();
                    if (interfaceC2836s6M7998H != null) {
                        Iterator it4 = interfaceC2836s6M7998H.iterator();
                        while (true) {
                            while (true) {
                                if (it4.hasNext()) {
                                    C2600b3 c2600b3 = (C2600b3) it4.next();
                                    if (c2600b3 != null) {
                                        m5718p(2, sbM771r);
                                        sbM771r.append("event {\n");
                                        m5721s(sbM771r, 2, "name", c1897o4.f10057H.m5603d(c2600b3.m7674A()));
                                        if (c2600b3.m7678M()) {
                                            m5721s(sbM771r, 2, "timestamp_millis", Long.valueOf(c2600b3.m7683w()));
                                        }
                                        if (c2600b3.m7677L()) {
                                            m5721s(sbM771r, 2, "previous_timestamp_millis", Long.valueOf(c2600b3.m7682v()));
                                        }
                                        if (c2600b3.m7676K()) {
                                            m5721s(sbM771r, 2, "count", Integer.valueOf(c2600b3.m7680t()));
                                        }
                                        if (c2600b3.m7681u() != 0) {
                                            m5733n(sbM771r, 2, (InterfaceC2836s6) c2600b3.m7675B());
                                        }
                                        m5718p(2, sbM771r);
                                        sbM771r.append("}\n");
                                    }
                                }
                            }
                        }
                    }
                    m5718p(1, sbM771r);
                    sbM771r.append("}\n");
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m5728B(C2669g2 c2669g2) {
        StringBuilder sbM771r = C0166e.m771r("\nproperty_filter {\n");
        if (c2669g2.m7836C()) {
            m5721s(sbM771r, 0, "filter_id", Integer.valueOf(c2669g2.m7838t()));
        }
        m5721s(sbM771r, 0, "property_name", ((C1897o4) this.f10430a).f10057H.m5605f(c2669g2.m7840x()));
        String strM5719q = m5719q(c2669g2.m7841z(), c2669g2.m7834A(), c2669g2.m7835B());
        if (!strM5719q.isEmpty()) {
            m5721s(sbM771r, 0, "filter_type", strM5719q);
        }
        m5734o(sbM771r, 1, c2669g2.m7839u());
        sbM771r.append("}\n");
        return sbM771r.toString();
    }

    /* JADX INFO: renamed from: C */
    public final List m5729C(InterfaceC2823r6 interfaceC2823r6, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(interfaceC2823r6);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
            if (iIntValue < 0) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5624b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9945i.m5625c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: renamed from: F */
    public final void m5730F(C2642e3 c2642e3, Object obj) {
        c2642e3.m7899j();
        C2656f3.m7803E((C2656f3) c2642e3.f14271b);
        c2642e3.m7899j();
        C2656f3.m7805G((C2656f3) c2642e3.f14271b);
        c2642e3.m7899j();
        C2656f3.m7807I((C2656f3) c2642e3.f14271b);
        c2642e3.m7899j();
        C2656f3.m7810L((C2656f3) c2642e3.f14271b);
        if (obj instanceof String) {
            c2642e3.m7899j();
            C2656f3.m7802D((C2656f3) c2642e3.f14271b, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2642e3.m7765k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c2642e3.m7899j();
            C2656f3.m7806H((C2656f3) c2642e3.f14271b, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2642e3 c2642e3M7811x = C2656f3.m7811x();
                for (String str : bundle.keySet()) {
                    C2642e3 c2642e3M7811x2 = C2656f3.m7811x();
                    c2642e3M7811x2.m7766m(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c2642e3M7811x2.m7765k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c2642e3M7811x2.m7899j();
                        C2656f3.m7802D((C2656f3) c2642e3M7811x2.f14271b, (String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c2642e3M7811x2.m7899j();
                        C2656f3.m7806H((C2656f3) c2642e3M7811x2.f14271b, dDoubleValue2);
                    }
                    c2642e3M7811x.m7899j();
                    C2656f3.m7808J((C2656f3) c2642e3M7811x.f14271b, (C2656f3) c2642e3M7811x2.m7897h());
                }
                if (((C2656f3) c2642e3M7811x.f14271b).m7822v() > 0) {
                    arrayList.add((C2656f3) c2642e3M7811x.m7897h());
                }
            }
        }
        c2642e3.m7899j();
        C2656f3.m7809K((C2656f3) c2642e3.f14271b, arrayList);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m5731H(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            ((C1897o4) this.f10430a).f10058I.getClass();
            if (Math.abs(System.currentTimeMillis() - j10) <= j11) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final byte[] m5732J(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    /* JADX INFO: renamed from: n */
    public final void m5733n(StringBuilder sb2, int i10, InterfaceC2836s6 interfaceC2836s6) {
        if (interfaceC2836s6 == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = interfaceC2836s6.iterator();
        while (it.hasNext()) {
            C2656f3 c2656f3 = (C2656f3) it.next();
            if (c2656f3 != null) {
                m5718p(i11, sb2);
                sb2.append("param {\n");
                m5721s(sb2, i11, "name", c2656f3.m7818P() ? ((C1897o4) this.f10430a).f10057H.m5604e(c2656f3.m7824z()) : null);
                m5721s(sb2, i11, "string_value", c2656f3.m7819Q() ? c2656f3.m7813A() : null);
                m5721s(sb2, i11, "int_value", c2656f3.m7817O() ? Long.valueOf(c2656f3.m7823w()) : null);
                m5721s(sb2, i11, "double_value", c2656f3.m7815M() ? Double.valueOf(c2656f3.m7820t()) : null);
                if (c2656f3.m7822v() > 0) {
                    m5733n(sb2, i11, (InterfaceC2836s6) c2656f3.m7814B());
                }
                m5718p(i11, sb2);
                sb2.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5734o(StringBuilder sb2, int i10, C2599b2 c2599b2) {
        String str;
        if (c2599b2 == null) {
            return;
        }
        m5718p(i10, sb2);
        sb2.append("filter {\n");
        if (c2599b2.m7655A()) {
            m5721s(sb2, i10, "complement", Boolean.valueOf(c2599b2.m7663z()));
        }
        if (c2599b2.m7657C()) {
            m5721s(sb2, i10, "param_name", ((C1897o4) this.f10430a).f10057H.m5604e(c2599b2.m7662x()));
        }
        if (c2599b2.m7658D()) {
            int i11 = i10 + 1;
            C2711j2 c2711j2M7661w = c2599b2.m7661w();
            if (c2711j2M7661w != null) {
                m5718p(i11, sb2);
                sb2.append("string_filter {\n");
                if (c2711j2M7661w.m7883B()) {
                    switch (c2711j2M7661w.m7884C()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m5721s(sb2, i11, "match_type", str);
                }
                if (c2711j2M7661w.m7882A()) {
                    m5721s(sb2, i11, "expression", c2711j2M7661w.m7886w());
                }
                if (c2711j2M7661w.m7889z()) {
                    m5721s(sb2, i11, "case_sensitive", Boolean.valueOf(c2711j2M7661w.m7888y()));
                }
                if (c2711j2M7661w.m7885t() > 0) {
                    m5718p(i11 + 1, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : c2711j2M7661w.m7887x()) {
                        m5718p(i11 + 2, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m5718p(i11, sb2);
                sb2.append("}\n");
            }
        }
        if (c2599b2.m7656B()) {
            m5722t(sb2, i10 + 1, "number_filter", c2599b2.m7660v());
        }
        m5718p(i10, sb2);
        sb2.append("}\n");
    }

    /* JADX INFO: renamed from: v */
    public final long m5735v(byte[] bArr) {
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1900o7 c1900o7 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o7);
        c1900o7.mo5748g();
        MessageDigest messageDigestM5801p = C1900o7.m5801p();
        if (messageDigestM5801p != null) {
            return C1900o7.m5799k0(messageDigestM5801p.digest(bArr));
        }
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9942f.m5623a("Failed to get MD5");
        return 0L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x */
    public final Parcelable m5736x(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return parcelable;
            } catch (SafeParcelReader.ParseException unused) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5623a("Failed to load parcelable from buffer");
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
