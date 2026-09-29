package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.protobuf.C1191l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class dad extends h8d {

    /* JADX INFO: renamed from: d */
    public long f35343d;

    /* JADX INFO: renamed from: e */
    public long f35344e;

    /* JADX INFO: renamed from: H */
    public static zzbh m10220H(ofb ofbVar) {
        Object obj;
        Bundle bundleM10221I = m10221I(ofbVar.m17969c(), true);
        String string = (!bundleM10221I.containsKey("_o") || (obj = bundleM10221I.get("_o")) == null) ? "app" : obj.toString();
        String strM6880e = C1191l.m6880e(ofbVar.m17968b(), AbstractC3184kh.f47271m, AbstractC3184kh.f47276r);
        if (strM6880e == null) {
            strM6880e = ofbVar.m17968b();
        }
        return new zzbh(strM6880e, new zzbf(bundleM10221I), string, ofbVar.m17967a(), 0L);
    }

    /* JADX INFO: renamed from: I */
    public static Bundle m10221I(Map map, boolean z) {
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
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m10221I((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: L */
    public static final void m10222L(khc khcVar, String str, Long l) {
        List listM15244g = khcVar.m15244g();
        int i = 0;
        while (true) {
            if (i >= listM15244g.size()) {
                i = -1;
                break;
            } else if (str.equals(((fic) listM15244g.get(i)).m11877t())) {
                break;
            } else {
                i++;
            }
        }
        aic aicVarM11861E = fic.m11861E();
        aicVarM11861E.m448g(str);
        aicVarM11861E.m450i(l.longValue());
        if (i < 0) {
            khcVar.m15248k(aicVarM11861E);
        } else {
            khcVar.m22739b();
            ((ohc) khcVar.f63950b).m18011J(i, (fic) aicVarM11861E.m22741d());
        }
    }

    /* JADX INFO: renamed from: M */
    public static final Bundle m10223M(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fic ficVar = (fic) it.next();
            String strM11877t = ficVar.m11877t();
            if (ficVar.m11862A()) {
                bundle.putDouble(strM11877t, ficVar.m11863B());
            } else if (ficVar.m11882y()) {
                bundle.putFloat(strM11877t, ficVar.m11883z());
            } else if (ficVar.m11878u()) {
                bundle.putString(strM11877t, ficVar.m11879v());
            } else if (ficVar.m11880w()) {
                bundle.putLong(strM11877t, ficVar.m11881x());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: N */
    public static final fic m10224N(String str, ohc ohcVar) {
        for (fic ficVar : ohcVar.m18023u()) {
            if (ficVar.m11877t().equals(str)) {
                return ficVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public static final String m10225O(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static final Serializable m10226P(String str, ohc ohcVar) {
        fic ficVarM10224N = m10224N(str, ohcVar);
        if (ficVarM10224N == null) {
            return null;
        }
        return m10230V(ficVarM10224N);
    }

    /* JADX INFO: renamed from: S */
    public static final void m10227S(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: T */
    public static final void m10228T(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: U */
    public static final String m10229U(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: V */
    public static final Serializable m10230V(fic ficVar) {
        if (ficVar.m11878u()) {
            return ficVar.m11879v();
        }
        if (ficVar.m11880w()) {
            return Long.valueOf(ficVar.m11881x());
        }
        if (ficVar.m11862A()) {
            return Double.valueOf(ficVar.m11863B());
        }
        if (ficVar.m11865D() > 0) {
            return m10240q0(ficVar.m11864C());
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public static final void m10231W(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m10228T(builder, str3, string, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public static final void m10232X(StringBuilder sb, String str, mkc mkcVar) {
        if (mkcVar == null) {
            return;
        }
        m10227S(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (mkcVar.m16898v() != 0) {
            m10227S(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : mkcVar.m16897u()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (mkcVar.m16896t() != 0) {
            m10227S(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : mkcVar.m16895s()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (mkcVar.m16900x() != 0) {
            m10227S(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (fhc fhcVar : mkcVar.m16899w()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(fhcVar.m11832s() ? Integer.valueOf(fhcVar.m11833t()) : null);
                sb.append(":");
                sb.append(fhcVar.m11834u() ? Long.valueOf(fhcVar.m11835v()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (mkcVar.m16902z() != 0) {
            m10227S(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (wkc wkcVar : mkcVar.m16901y()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(wkcVar.m24032s() ? Integer.valueOf(wkcVar.m24033t()) : null);
                sb.append(": [");
                Iterator it = wkcVar.m24034u().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m10227S(3, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: Y */
    public static final void m10233Y(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m10227S(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: Z */
    public static final void m10234Z(StringBuilder sb, int i, String str, w6c w6cVar) {
        String str2;
        if (w6cVar == null) {
            return;
        }
        m10227S(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (w6cVar.m23784s()) {
            int iM23783C = w6cVar.m23783C();
            if (iM23783C == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM23783C == 2) {
                str2 = "LESS_THAN";
            } else if (iM23783C != 3) {
                str2 = iM23783C != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m10233Y(sb, i, "comparison_type", str2);
        }
        if (w6cVar.m23785t()) {
            m10233Y(sb, i, "match_as_float", Boolean.valueOf(w6cVar.m23786u()));
        }
        if (w6cVar.m23787v()) {
            m10233Y(sb, i, "comparison_value", w6cVar.m23788w());
        }
        if (w6cVar.m23789x()) {
            m10233Y(sb, i, "min_comparison_value", w6cVar.m23790y());
        }
        if (w6cVar.m23791z()) {
            m10233Y(sb, i, "max_comparison_value", w6cVar.m23782A());
        }
        m10227S(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m10235h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m10236i0(lib libVar, int i) {
        if (i < libVar.size() * 64) {
            return ((1 << (i % 64)) & ((Long) libVar.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static ArrayList m10237j0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public static uhb m10238o0(uhb uhbVar, byte[] bArr) throws zzaeh {
        phb phbVarM19145a = phb.m19145a();
        if (phbVarM19145a != null) {
            uhbVar.getClass();
            uhbVar.m22743f(bArr, bArr.length, phbVarM19145a);
            return uhbVar;
        }
        uhbVar.getClass();
        int length = bArr.length;
        int i = dhb.f35664a;
        uhbVar.m22743f(bArr, length, phb.f56225b);
        return uhbVar;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m10239p0(String str, ljc ljcVar) {
        for (int i = 0; i < ((pjc) ljcVar.f63950b).m19279Z1(); i++) {
            if (str.equals(((pjc) ljcVar.f63950b).m19282a2(i).m14550u())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: q0 */
    public static Bundle[] m10240q0(mib mibVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = mibVar.iterator();
        while (it.hasNext()) {
            fic ficVar = (fic) it.next();
            if (ficVar != null) {
                Bundle bundle = new Bundle();
                for (fic ficVar2 : ficVar.m11864C()) {
                    if (ficVar2.m11878u()) {
                        bundle.putString(ficVar2.m11877t(), ficVar2.m11879v());
                    } else if (ficVar2.m11880w()) {
                        bundle.putLong(ficVar2.m11877t(), ficVar2.m11881x());
                    } else if (ficVar2.m11862A()) {
                        bundle.putDouble(ficVar2.m11877t(), ficVar2.m11863B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: r0 */
    public static HashMap m10241r0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m10241r0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m10241r0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m10241r0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
    }

    /* JADX INFO: renamed from: J */
    public final void m10242J(Map map) {
        long epochMilli;
        kjc kjcVar = (kjc) this.f60774a;
        String strM10225O = m10225O("Date", map);
        if (TextUtils.isEmpty(strM10225O)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strM10225O, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(strM10225O, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            kjcVar.f47443k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            mo12359D();
            if (this.f35344e == 0) {
                this.f35343d = jElapsedRealtime;
                this.f35344e = epochMilli;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final long m10243K(long j) {
        mo12359D();
        long j2 = this.f35344e;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.f35343d) + j;
    }

    /* JADX INFO: renamed from: Q */
    public final void m10244Q(StringBuilder sb, int i, mib mibVar) {
        if (mibVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = mibVar.iterator();
        while (it.hasNext()) {
            fic ficVar = (fic) it.next();
            if (ficVar != null) {
                m10227S(i2, sb);
                sb.append("param {\n");
                m10233Y(sb, i2, "name", ficVar.m11876s() ? ((kjc) this.f60774a).f47442j.m20573b(ficVar.m11877t()) : null);
                m10233Y(sb, i2, "string_value", ficVar.m11878u() ? ficVar.m11879v() : null);
                m10233Y(sb, i2, "int_value", ficVar.m11880w() ? Long.valueOf(ficVar.m11881x()) : null);
                m10233Y(sb, i2, "double_value", ficVar.m11862A() ? Double.valueOf(ficVar.m11863B()) : null);
                if (ficVar.m11865D() > 0) {
                    m10244Q(sb, i2, ficVar.m11864C());
                }
                m10227S(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m10245R(StringBuilder sb, int i, u5c u5cVar) {
        String str;
        if (u5cVar == null) {
            return;
        }
        m10227S(i, sb);
        sb.append("filter {\n");
        if (u5cVar.m22499w()) {
            m10233Y(sb, i, "complement", Boolean.valueOf(u5cVar.m22500x()));
        }
        if (u5cVar.m22501y()) {
            m10233Y(sb, i, "param_name", ((kjc) this.f60774a).f47442j.m20573b(u5cVar.m22502z()));
        }
        if (u5cVar.m22495s()) {
            int i2 = i + 1;
            u7c u7cVarM22496t = u5cVar.m22496t();
            if (u7cVarM22496t != null) {
                m10227S(i2, sb);
                sb.append("string_filter {\n");
                if (u7cVarM22496t.m22524s()) {
                    switch (u7cVarM22496t.m22523A()) {
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
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m10233Y(sb, i2, "match_type", str);
                }
                if (u7cVarM22496t.m22525t()) {
                    m10233Y(sb, i2, "expression", u7cVarM22496t.m22526u());
                }
                if (u7cVarM22496t.m22527v()) {
                    m10233Y(sb, i2, "case_sensitive", Boolean.valueOf(u7cVarM22496t.m22528w()));
                }
                if (u7cVarM22496t.m22530y() > 0) {
                    m10227S(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : u7cVarM22496t.m22529x()) {
                        m10227S(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m10227S(i2, sb);
                sb.append("}\n");
            }
        }
        if (u5cVar.m22497u()) {
            m10234Z(sb, i + 1, "number_filter", u5cVar.m22498v());
        }
        m10227S(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10246a0(emc emcVar, Object obj) {
        lda.m16130p(obj);
        emcVar.m22739b();
        ((jmc) emcVar.f63950b).m14543H();
        emcVar.m22739b();
        ((jmc) emcVar.f63950b).m14545J();
        emcVar.m22739b();
        ((jmc) emcVar.f63950b).m14547L();
        if (obj instanceof String) {
            emcVar.m22739b();
            ((jmc) emcVar.f63950b).m14542G((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            emcVar.m22739b();
            ((jmc) emcVar.f63950b).m14544I(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            emcVar.m22739b();
            ((jmc) emcVar.f63950b).m14546K(dDoubleValue);
        } else {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m10247b0(aic aicVar, Object obj) {
        aicVar.m22739b();
        ((fic) aicVar.f63950b).m11868H();
        aicVar.m22739b();
        ((fic) aicVar.f63950b).m11870J();
        aicVar.m22739b();
        ((fic) aicVar.f63950b).m11872L();
        aicVar.m22739b();
        ((fic) aicVar.f63950b).m11875O();
        if (obj instanceof String) {
            aicVar.m449h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aicVar.m450i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            aicVar.m22739b();
            ((fic) aicVar.f63950b).m11871K(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                aic aicVarM11861E = fic.m11861E();
                for (String str : bundle.keySet()) {
                    aic aicVarM11861E2 = fic.m11861E();
                    aicVarM11861E2.m448g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aicVarM11861E2.m450i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aicVarM11861E2.m449h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        aicVarM11861E2.m22739b();
                        ((fic) aicVarM11861E2.f63950b).m11871K(dDoubleValue2);
                    }
                    aicVarM11861E.m22739b();
                    ((fic) aicVarM11861E.f63950b).m11873M((fic) aicVarM11861E2.m22741d());
                }
                if (((fic) aicVarM11861E.f63950b).m11865D() > 0) {
                    arrayList.add((fic) aicVarM11861E.m22741d());
                }
            }
        }
        aicVar.m22739b();
        ((fic) aicVar.f63950b).m11874N(arrayList);
    }

    /* JADX INFO: renamed from: c0 */
    public final zzoh m10248c0(String str, ljc ljcVar, khc khcVar, String str2) {
        int iIndexOf;
        blb.m3870a();
        kjc kjcVar = (kjc) this.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        if (!cmbVar.m4869O(str, z8c.f71130O0)) {
            return null;
        }
        kjcVar.f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(cmbVar.m4865K(str, z8c.f71202t0).split(",")));
        C1045d c1045d = this.f55716b;
        m8d m8dVar = c1045d.f12370j;
        shc shcVar = c1045d.f12356a;
        shc shcVar2 = m8dVar.f55716b.f12356a;
        C1045d.m5885T(shcVar2);
        String strM21381Q = shcVar2.m21381Q(str);
        Uri.Builder builder = new Uri.Builder();
        cmb cmbVar2 = ((kjc) m8dVar.f60774a).f47436d;
        builder.scheme(cmbVar2.m4865K(str, z8c.f71188m0));
        if (TextUtils.isEmpty(strM21381Q)) {
            builder.authority(cmbVar2.m4865K(str, z8c.f71190n0));
        } else {
            String strM4865K = cmbVar2.m4865K(str, z8c.f71190n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strM21381Q).length() + 1 + String.valueOf(strM4865K).length());
            sb.append(strM21381Q);
            sb.append(".");
            sb.append(strM4865K);
            builder.authority(sb.toString());
        }
        builder.path(cmbVar2.m4865K(str, z8c.f71192o0));
        m10228T(builder, "gmp_app_id", ((pjc) ljcVar.f63950b).m19225H(), hashSet);
        cmbVar.m4864J();
        m10228T(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strM19207B = ((pjc) ljcVar.f63950b).m19207B();
        t8c t8cVar = z8c.f71136R0;
        if (cmbVar.m4869O(str, t8cVar)) {
            C1045d.m5885T(shcVar);
            if (shcVar.m21388X(str)) {
                strM19207B = "";
            }
        }
        m10228T(builder, "app_instance_id", strM19207B, hashSet);
        m10228T(builder, "rdid", ((pjc) ljcVar.f63950b).m19352y(), hashSet);
        m10228T(builder, "bundle_id", ljcVar.m16297o(), hashSet);
        String strM15250m = khcVar.m15250m();
        String strM6880e = C1191l.m6880e(strM15250m, AbstractC3184kh.f47276r, AbstractC3184kh.f47271m);
        if (true != TextUtils.isEmpty(strM6880e)) {
            strM15250m = strM6880e;
        }
        m10228T(builder, "app_event_name", strM15250m, hashSet);
        m10228T(builder, "app_version", String.valueOf(((pjc) ljcVar.f63950b).m19243N()), hashSet);
        String strM19318m2 = ((pjc) ljcVar.f63950b).m19318m2();
        if (cmbVar.m4869O(str, t8cVar)) {
            C1045d.m5885T(shcVar);
            if (shcVar.m21387W(str) && !TextUtils.isEmpty(strM19318m2) && (iIndexOf = strM19318m2.indexOf(".")) != -1) {
                strM19318m2 = strM19318m2.substring(0, iIndexOf);
            }
        }
        m10228T(builder, "os_version", strM19318m2, hashSet);
        m10228T(builder, "timestamp", String.valueOf(khcVar.m15252p()), hashSet);
        if (((pjc) ljcVar.f63950b).m19204A()) {
            m10228T(builder, "lat", "1", hashSet);
        }
        m10228T(builder, "privacy_sandbox_version", String.valueOf(((pjc) ljcVar.f63950b).m19232J0()), hashSet);
        m10228T(builder, "trigger_uri_source", "1", hashSet);
        m10228T(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        m10228T(builder, "request_uuid", str2, hashSet);
        List<fic> listM15244g = khcVar.m15244g();
        Bundle bundle = new Bundle();
        for (fic ficVar : listM15244g) {
            String strM11877t = ficVar.m11877t();
            if (ficVar.m11862A()) {
                bundle.putString(strM11877t, String.valueOf(ficVar.m11863B()));
            } else if (ficVar.m11882y()) {
                bundle.putString(strM11877t, String.valueOf(ficVar.m11883z()));
            } else if (ficVar.m11878u()) {
                bundle.putString(strM11877t, ficVar.m11879v());
            } else if (ficVar.m11880w()) {
                bundle.putString(strM11877t, String.valueOf(ficVar.m11881x()));
            }
        }
        m10231W(builder, cmbVar.m4865K(str, z8c.f71200s0).split("\\|"), bundle, hashSet);
        List<jmc> listUnmodifiableList = Collections.unmodifiableList(((pjc) ljcVar.f63950b).m19276Y1());
        Bundle bundle2 = new Bundle();
        for (jmc jmcVar : listUnmodifiableList) {
            String strM14550u = jmcVar.m14550u();
            if (jmcVar.m14538B()) {
                bundle2.putString(strM14550u, String.valueOf(jmcVar.m14539C()));
            } else if (jmcVar.m14555z()) {
                bundle2.putString(strM14550u, String.valueOf(jmcVar.m14537A()));
            } else if (jmcVar.m14551v()) {
                bundle2.putString(strM14550u, jmcVar.m14552w());
            } else if (jmcVar.m14553x()) {
                bundle2.putString(strM14550u, String.valueOf(jmcVar.m14554y()));
            }
        }
        m10231W(builder, cmbVar.m4865K(str, z8c.f71198r0).split("\\|"), bundle2, hashSet);
        m10228T(builder, "dma", true != ((pjc) ljcVar.f63950b).m19223G0() ? "0" : "1", hashSet);
        if (!((pjc) ljcVar.f63950b).m19229I0().isEmpty()) {
            m10228T(builder, "dma_cps", ((pjc) ljcVar.f63950b).m19229I0(), hashSet);
        }
        if (((pjc) ljcVar.f63950b).m19247O0()) {
            iec iecVarM19250P0 = ((pjc) ljcVar.f63950b).m19250P0();
            if (!iecVarM19250P0.m13824G().isEmpty()) {
                m10228T(builder, "dl_gclid", iecVarM19250P0.m13824G(), hashSet);
            }
            if (!iecVarM19250P0.m13826I().isEmpty()) {
                m10228T(builder, "dl_gbraid", iecVarM19250P0.m13826I(), hashSet);
            }
            if (!iecVarM19250P0.m13828K().isEmpty()) {
                m10228T(builder, "dl_gs", iecVarM19250P0.m13828K(), hashSet);
            }
            if (iecVarM19250P0.m13830M() > 0) {
                m10228T(builder, "dl_ss_ts", String.valueOf(iecVarM19250P0.m13830M()), hashSet);
            }
            if (!iecVarM19250P0.m13832O().isEmpty()) {
                m10228T(builder, "mr_gclid", iecVarM19250P0.m13832O(), hashSet);
            }
            if (!iecVarM19250P0.m13834Q().isEmpty()) {
                m10228T(builder, "mr_gbraid", iecVarM19250P0.m13834Q(), hashSet);
            }
            if (!iecVarM19250P0.m13836S().isEmpty()) {
                m10228T(builder, "mr_gs", iecVarM19250P0.m13836S(), hashSet);
            }
            if (iecVarM19250P0.m13838U() > 0) {
                m10228T(builder, "mr_click_ts", String.valueOf(iecVarM19250P0.m13838U()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), 1, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: d0 */
    public final ohc m10249d0(vob vobVar) {
        khc khcVarM18002I = ohc.m18002I();
        long j = vobVar.f65733f;
        khcVarM18002I.m22739b();
        ((ohc) khcVarM18002I.f63950b).m18018Q(j);
        long j2 = vobVar.f65732e;
        khcVarM18002I.m22739b();
        ((ohc) khcVarM18002I.f63950b).m18021s(j2);
        zzbf zzbfVar = vobVar.f65734g;
        Objects.requireNonNull(zzbfVar);
        Bundle bundle = zzbfVar.f12388a;
        for (String str : bundle.keySet()) {
            aic aicVarM11861E = fic.m11861E();
            aicVarM11861E.m448g(str);
            Object obj = bundle.get(str);
            lda.m16130p(obj);
            m10247b0(aicVarM11861E, obj);
            khcVarM18002I.m15248k(aicVarM11861E);
        }
        String str2 = vobVar.f65730c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            aic aicVarM11861E2 = fic.m11861E();
            aicVarM11861E2.m448g("_o");
            aicVarM11861E2.m449h(str2);
            khcVarM18002I.m15247j((fic) aicVarM11861E2.m22741d());
        }
        return (ohc) khcVarM18002I.m22741d();
    }

    /* JADX INFO: renamed from: e0 */
    public final String m10250e0(fjc fjcVar) {
        String str;
        String str2;
        String str3;
        cfc cfcVarM19238L0;
        StringBuilder sbM22997t = ux5.m22997t("\nbatch {\n");
        if (fjcVar.m11915x()) {
            m10233Y(sbM22997t, 0, "upload_subdomain", fjcVar.m11916y());
        }
        if (fjcVar.m11913v()) {
            m10233Y(sbM22997t, 0, "sgtm_join_id", fjcVar.m11914w());
        }
        for (pjc pjcVar : fjcVar.m11910s()) {
            if (pjcVar != null) {
                m10227S(1, sbM22997t);
                sbM22997t.append("bundle {\n");
                if (pjcVar.m19258S()) {
                    m10233Y(sbM22997t, 1, "protocol_version", Integer.valueOf(pjcVar.m19259S0()));
                }
                ((klb) jlb.f45681b.f45682a.get()).getClass();
                kjc kjcVar = (kjc) this.f60774a;
                cmb cmbVar = kjcVar.f47436d;
                rbc rbcVar = kjcVar.f47442j;
                if (cmbVar.m4869O(pjcVar.m19334s(), z8c.f71126M0) && pjcVar.m19353y0()) {
                    m10233Y(sbM22997t, 1, "session_stitching_token", pjcVar.m19356z0());
                }
                m10233Y(sbM22997t, 1, "platform", pjcVar.m19315l2());
                if (pjcVar.m19340u()) {
                    m10233Y(sbM22997t, 1, "gmp_version", Long.valueOf(pjcVar.m19343v()));
                }
                if (pjcVar.m19346w()) {
                    m10233Y(sbM22997t, 1, "uploading_gmp_version", Long.valueOf(pjcVar.m19349x()));
                }
                if (pjcVar.m19341u0()) {
                    m10233Y(sbM22997t, 1, "dynamite_version", Long.valueOf(pjcVar.m19344v0()));
                }
                if (pjcVar.m19246O()) {
                    m10233Y(sbM22997t, 1, "config_version", Long.valueOf(pjcVar.m19249P()));
                }
                m10233Y(sbM22997t, 1, "gmp_app_id", pjcVar.m19225H());
                m10233Y(sbM22997t, 1, "app_id", pjcVar.m19334s());
                m10233Y(sbM22997t, 1, "app_version", pjcVar.m19337t());
                if (pjcVar.m19240M()) {
                    m10233Y(sbM22997t, 1, "app_version_major", Integer.valueOf(pjcVar.m19243N()));
                }
                m10233Y(sbM22997t, 1, "firebase_instance_id", pjcVar.m19237L());
                if (pjcVar.m19210C()) {
                    m10233Y(sbM22997t, 1, "dev_cert_hash", Long.valueOf(pjcVar.m19213D()));
                }
                m10233Y(sbM22997t, 1, "app_store", pjcVar.m19333r2());
                if (pjcVar.m19285b2()) {
                    m10233Y(sbM22997t, 1, "upload_timestamp_millis", Long.valueOf(pjcVar.m19288c2()));
                }
                if (pjcVar.m19291d2()) {
                    m10233Y(sbM22997t, 1, "start_timestamp_millis", Long.valueOf(pjcVar.m19294e2()));
                }
                if (pjcVar.m19297f2()) {
                    m10233Y(sbM22997t, 1, "end_timestamp_millis", Long.valueOf(pjcVar.m19300g2()));
                }
                if (pjcVar.m19303h2()) {
                    m10233Y(sbM22997t, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(pjcVar.m19306i2()));
                }
                if (pjcVar.m19309j2()) {
                    m10233Y(sbM22997t, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(pjcVar.m19312k2()));
                }
                m10233Y(sbM22997t, 1, "app_instance_id", pjcVar.m19207B());
                m10233Y(sbM22997t, 1, "resettable_device_id", pjcVar.m19352y());
                m10233Y(sbM22997t, 1, "ds_id", pjcVar.m19255R());
                if (pjcVar.m19355z()) {
                    m10233Y(sbM22997t, 1, "limited_ad_tracking", Boolean.valueOf(pjcVar.m19204A()));
                }
                m10233Y(sbM22997t, 1, "os_version", pjcVar.m19318m2());
                m10233Y(sbM22997t, 1, "device_model", pjcVar.m19321n2());
                m10233Y(sbM22997t, 1, "user_default_language", pjcVar.m19324o2());
                if (pjcVar.m19327p2()) {
                    m10233Y(sbM22997t, 1, "time_zone_offset_minutes", Integer.valueOf(pjcVar.m19330q2()));
                }
                if (pjcVar.m19216E()) {
                    m10233Y(sbM22997t, 1, "bundle_sequential_index", Integer.valueOf(pjcVar.m19219F()));
                }
                if (pjcVar.m19241M0()) {
                    m10233Y(sbM22997t, 1, "delivery_index", Integer.valueOf(pjcVar.m19244N0()));
                }
                if (pjcVar.m19228I()) {
                    m10233Y(sbM22997t, 1, "service_upload", Boolean.valueOf(pjcVar.m19231J()));
                }
                m10233Y(sbM22997t, 1, "health_monitor", pjcVar.m19222G());
                if (pjcVar.m19335s0()) {
                    m10233Y(sbM22997t, 1, "retry_counter", Integer.valueOf(pjcVar.m19338t0()));
                }
                if (pjcVar.m19347w0()) {
                    m10233Y(sbM22997t, 1, "consent_signals", pjcVar.m19350x0());
                }
                if (pjcVar.m19220F0()) {
                    m10233Y(sbM22997t, 1, "is_dma_region", Boolean.valueOf(pjcVar.m19223G0()));
                }
                if (pjcVar.m19226H0()) {
                    m10233Y(sbM22997t, 1, "core_platform_services", pjcVar.m19229I0());
                }
                if (pjcVar.m19214D0()) {
                    m10233Y(sbM22997t, 1, "consent_diagnostics", pjcVar.m19217E0());
                }
                if (pjcVar.m19205A0()) {
                    m10233Y(sbM22997t, 1, "target_os_version", Long.valueOf(pjcVar.m19208B0()));
                }
                blb.m3870a();
                if (cmbVar.m4869O(pjcVar.m19334s(), z8c.f71130O0)) {
                    m10233Y(sbM22997t, 1, "ad_services_version", Integer.valueOf(pjcVar.m19232J0()));
                    if (pjcVar.m19235K0() && (cfcVarM19238L0 = pjcVar.m19238L0()) != null) {
                        m10227S(2, sbM22997t);
                        sbM22997t.append("attribution_eligibility_status {\n");
                        m10233Y(sbM22997t, 2, "eligible", Boolean.valueOf(cfcVarM19238L0.m4619s()));
                        m10233Y(sbM22997t, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(cfcVarM19238L0.m4620t()));
                        m10233Y(sbM22997t, 2, "pre_r", Boolean.valueOf(cfcVarM19238L0.m4621u()));
                        m10233Y(sbM22997t, 2, "r_extensions_too_old", Boolean.valueOf(cfcVarM19238L0.m4622v()));
                        m10233Y(sbM22997t, 2, "adservices_extension_too_old", Boolean.valueOf(cfcVarM19238L0.m4623w()));
                        m10233Y(sbM22997t, 2, "ad_storage_not_allowed", Boolean.valueOf(cfcVarM19238L0.m4624x()));
                        m10233Y(sbM22997t, 2, "measurement_manager_disabled", Boolean.valueOf(cfcVarM19238L0.m4625y()));
                        m10227S(2, sbM22997t);
                        sbM22997t.append("}\n");
                    }
                }
                if (pjcVar.m19247O0()) {
                    iec iecVarM19250P0 = pjcVar.m19250P0();
                    m10227S(2, sbM22997t);
                    sbM22997t.append("ad_campaign_info {\n");
                    if (iecVarM19250P0.m13823F()) {
                        m10233Y(sbM22997t, 2, "deep_link_gclid", iecVarM19250P0.m13824G());
                    }
                    if (iecVarM19250P0.m13825H()) {
                        m10233Y(sbM22997t, 2, "deep_link_gbraid", iecVarM19250P0.m13826I());
                    }
                    if (iecVarM19250P0.m13827J()) {
                        m10233Y(sbM22997t, 2, "deep_link_gad_source", iecVarM19250P0.m13828K());
                    }
                    if (iecVarM19250P0.m13839V()) {
                        m10233Y(sbM22997t, 2, "deep_link_url", iecVarM19250P0.m13840W());
                    }
                    if (iecVarM19250P0.m13829L()) {
                        m10233Y(sbM22997t, 2, "deep_link_session_millis", Long.valueOf(iecVarM19250P0.m13830M()));
                    }
                    if (iecVarM19250P0.m13831N()) {
                        m10233Y(sbM22997t, 2, "market_referrer_gclid", iecVarM19250P0.m13832O());
                    }
                    if (iecVarM19250P0.m13833P()) {
                        m10233Y(sbM22997t, 2, "market_referrer_gbraid", iecVarM19250P0.m13834Q());
                    }
                    if (iecVarM19250P0.m13835R()) {
                        m10233Y(sbM22997t, 2, "market_referrer_gad_source", iecVarM19250P0.m13836S());
                    }
                    if (iecVarM19250P0.m13837T()) {
                        m10233Y(sbM22997t, 2, "market_referrer_click_millis", Long.valueOf(iecVarM19250P0.m13838U()));
                    }
                    m10227S(2, sbM22997t);
                    sbM22997t.append("}\n");
                }
                if (pjcVar.m19261T()) {
                    m10233Y(sbM22997t, 1, "batching_timestamp_millis", Long.valueOf(pjcVar.m19264U()));
                }
                if (pjcVar.m19253Q0()) {
                    amc amcVarM19256R0 = pjcVar.m19256R0();
                    m10227S(2, sbM22997t);
                    sbM22997t.append("sgtm_diagnostics {\n");
                    int iM586x = amcVarM19256R0.m586x();
                    if (iM586x == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM586x == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM586x != 3) {
                        str2 = iM586x != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m10233Y(sbM22997t, 2, "upload_type", str2);
                    m10233Y(sbM22997t, 2, "client_upload_eligibility", amcVarM19256R0.m584s().name());
                    int iM587y = amcVarM19256R0.m587y();
                    if (iM587y == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM587y == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM587y == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM587y != 4) {
                        str3 = iM587y != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m10233Y(sbM22997t, 2, "service_upload_eligibility", str3);
                    m10227S(2, sbM22997t);
                    sbM22997t.append("}\n");
                }
                if (pjcVar.m19267V()) {
                    wgc wgcVarM19270W = pjcVar.m19270W();
                    m10227S(2, sbM22997t);
                    sbM22997t.append("consent_info_extra {\n");
                    for (mgc mgcVar : wgcVarM19270W.m23946s()) {
                        m10227S(3, sbM22997t);
                        sbM22997t.append("limited_data_modes {\n");
                        int iM16832t = mgcVar.m16832t();
                        if (iM16832t == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM16832t == 2) {
                            str = "AD_STORAGE";
                        } else if (iM16832t != 3) {
                            str = iM16832t != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m10233Y(sbM22997t, 3, "type", str);
                        int iM16833u = mgcVar.m16833u();
                        m10233Y(sbM22997t, 3, "mode", iM16833u != 1 ? iM16833u != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m10227S(3, sbM22997t);
                        sbM22997t.append("}\n");
                    }
                    m10227S(2, sbM22997t);
                    sbM22997t.append("}\n");
                }
                mib<jmc> mibVarM19276Y1 = pjcVar.m19276Y1();
                if (mibVarM19276Y1 != null) {
                    for (jmc jmcVar : mibVarM19276Y1) {
                        if (jmcVar != null) {
                            m10227S(2, sbM22997t);
                            sbM22997t.append("user_property {\n");
                            m10233Y(sbM22997t, 2, "set_timestamp_millis", jmcVar.m14548s() ? Long.valueOf(jmcVar.m14549t()) : null);
                            m10233Y(sbM22997t, 2, "name", rbcVar.m20574c(jmcVar.m14550u()));
                            m10233Y(sbM22997t, 2, "string_value", jmcVar.m14552w());
                            m10233Y(sbM22997t, 2, "int_value", jmcVar.m14553x() ? Long.valueOf(jmcVar.m14554y()) : null);
                            m10233Y(sbM22997t, 2, "double_value", jmcVar.m14538B() ? Double.valueOf(jmcVar.m14539C()) : null);
                            m10227S(2, sbM22997t);
                            sbM22997t.append("}\n");
                        }
                    }
                }
                mib<lfc> mibVarM19234K = pjcVar.m19234K();
                if (mibVarM19234K != null) {
                    for (lfc lfcVar : mibVarM19234K) {
                        if (lfcVar != null) {
                            m10227S(2, sbM22997t);
                            sbM22997t.append("audience_membership {\n");
                            if (lfcVar.m16170s()) {
                                m10233Y(sbM22997t, 2, "audience_id", Integer.valueOf(lfcVar.m16171t()));
                            }
                            if (lfcVar.m16175x()) {
                                m10233Y(sbM22997t, 2, "new_audience", Boolean.valueOf(lfcVar.m16176y()));
                            }
                            m10232X(sbM22997t, "current_data", lfcVar.m16172u());
                            if (lfcVar.m16173v()) {
                                m10232X(sbM22997t, "previous_data", lfcVar.m16174w());
                            }
                            m10227S(2, sbM22997t);
                            sbM22997t.append("}\n");
                        }
                    }
                }
                List<ohc> listM19260S1 = pjcVar.m19260S1();
                if (listM19260S1 != null) {
                    for (ohc ohcVar : listM19260S1) {
                        if (ohcVar != null) {
                            m10227S(2, sbM22997t);
                            sbM22997t.append("event {\n");
                            m10233Y(sbM22997t, 2, "name", rbcVar.m20572a(ohcVar.m18026x()));
                            if (ohcVar.m18027y()) {
                                m10233Y(sbM22997t, 2, "timestamp_millis", Long.valueOf(ohcVar.m18028z()));
                            }
                            if (cmbVar.m4869O(null, z8c.f71167e1) && ohcVar.m18007E()) {
                                m10233Y(sbM22997t, 2, "corrected_timestamp_millis", Long.valueOf(ohcVar.m18008F()));
                            }
                            if (ohcVar.m18003A()) {
                                m10233Y(sbM22997t, 2, "previous_timestamp_millis", Long.valueOf(ohcVar.m18004B()));
                            }
                            if (ohcVar.m18005C()) {
                                m10233Y(sbM22997t, 2, "count", Integer.valueOf(ohcVar.m18006D()));
                            }
                            if (ohcVar.m18024v() != 0) {
                                m10244Q(sbM22997t, 2, (mib) ohcVar.m18023u());
                            }
                            m10227S(2, sbM22997t);
                            sbM22997t.append("}\n");
                        }
                    }
                }
                m10227S(1, sbM22997t);
                sbM22997t.append("}\n");
            }
        }
        sbM22997t.append("} // End-of-batch\n");
        return sbM22997t.toString();
    }

    /* JADX INFO: renamed from: f0 */
    public final String m10251f0(f7c f7cVar) {
        StringBuilder sbM22997t = ux5.m22997t("\nproperty_filter {\n");
        if (f7cVar.m11582s()) {
            m10233Y(sbM22997t, 0, "filter_id", Integer.valueOf(f7cVar.m11583t()));
        }
        m10233Y(sbM22997t, 0, "property_name", ((kjc) this.f60774a).f47442j.m20574c(f7cVar.m11584u()));
        String strM10229U = m10229U(f7cVar.m11586w(), f7cVar.m11587x(), f7cVar.m11589z());
        if (!strM10229U.isEmpty()) {
            m10233Y(sbM22997t, 0, "filter_type", strM10229U);
        }
        m10245R(sbM22997t, 1, f7cVar.m11585v());
        sbM22997t.append("}\n");
        return sbM22997t.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public final Parcelable m10252g0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader$ParseException unused) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: k0 */
    public final List m10253k0(lib libVar, List list) {
        int i;
        kjc kjcVar = (kjc) this.f60774a;
        ArrayList arrayList = new ArrayList(libVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68083i.m17925c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m10254l0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((kjc) this.f60774a).f47443k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: renamed from: m0 */
    public final long m10255m0(byte[] bArr) {
        lda.m16130p(bArr);
        kjc kjcVar = (kjc) this.f60774a;
        rad radVar = kjcVar.f47441i;
        kjc.m15278j(radVar);
        radVar.mo12359D();
        MessageDigest messageDigestM20504W = rad.m20504W();
        if (messageDigestM20504W != null) {
            return rad.m20505X(messageDigestM20504W.digest(bArr));
        }
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68080f.m17923a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: n0 */
    public final byte[] m10256n0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(e, "Failed to gzip content");
            throw e;
        }
    }
}
