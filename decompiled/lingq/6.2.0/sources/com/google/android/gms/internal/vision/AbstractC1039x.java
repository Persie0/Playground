package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.dnb;
import p000.doc;
import p000.g9a;
import p000.gfc;
import p000.iwc;
import p000.izc;
import p000.krc;
import p000.noc;
import p000.ozc;
import p000.yqc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1039x {

    /* JADX INFO: renamed from: a */
    public static final Class f12262a;

    /* JADX INFO: renamed from: b */
    public static final izc f12263b;

    /* JADX INFO: renamed from: c */
    public static final izc f12264c;

    /* JADX INFO: renamed from: d */
    public static final izc f12265d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f12262a = cls;
        f12263b = m5798d(false);
        f12264c = m5798d(true);
        f12265d = new izc();
    }

    /* JADX INFO: renamed from: A */
    public static int m5785A(List list) {
        return list.size() << 2;
    }

    /* JADX INFO: renamed from: B */
    public static void m5786B(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 0);
                c1031p.m5729b(iIntValue);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5721p = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM5721p += C1031p.m5721p(((Integer) list.get(i3)).intValue());
        }
        c1031p.m5733g(iM5721p);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1031p.m5729b(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: C */
    public static int m5787C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1031p.m5723r(i) * size;
    }

    /* JADX INFO: renamed from: D */
    public static int m5788D(List list) {
        return list.size() << 3;
    }

    /* JADX INFO: renamed from: E */
    public static void m5789E(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 0);
                c1031p.m5733g(iIntValue);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5725t = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM5725t += C1031p.m5725t(((Integer) list.get(i3)).intValue());
        }
        c1031p.m5733g(iM5725t);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1031p.m5733g(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m5790F(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 0);
                c1031p.m5733g((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5725t = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM5725t += C1031p.m5725t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1031p.m5733g(iM5725t);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c1031p.m5733g((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m5791G(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 5);
                c1031p.m5736l(iIntValue);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 4;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5736l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m5792H(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 5);
                c1031p.m5736l(iIntValue);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 4;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5736l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m5793I(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1031p.m5730c(i, 0);
                c1031p.m5729b(iIntValue);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5721p = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM5721p += C1031p.m5721p(((Integer) list.get(i3)).intValue());
        }
        c1031p.m5733g(iM5721p);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1031p.m5729b(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m5794J(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c1031p.m5730c(i, 0);
                c1031p.m5728a(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3++;
        }
        c1031p.m5733g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c1031p.m5728a(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m5795a(int i, Object obj, iwc iwcVar) {
        gfc gfcVar = (gfc) obj;
        int iM5725t = C1031p.m5725t(i << 3);
        int iMo5745c = gfcVar.mo5745c();
        if (iMo5745c == -1) {
            iMo5745c = iwcVar.mo5763e(gfcVar);
            gfcVar.mo5744b(iMo5745c);
        }
        return dnb.m10500a(iMo5745c, iMo5745c, iM5725t);
    }

    /* JADX INFO: renamed from: b */
    public static int m5796b(int i, List list, iwc iwcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM5718m = C1031p.m5718m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            gfc gfcVar = (gfc) list.get(i2);
            int iMo5745c = gfcVar.mo5745c();
            if (iMo5745c == -1) {
                iMo5745c = iwcVar.mo5763e(gfcVar);
                gfcVar.mo5744b(iMo5745c);
            }
            iM5718m = dnb.m10500a(iMo5745c, iMo5745c, iM5718m);
        }
        return iM5718m;
    }

    /* JADX INFO: renamed from: c */
    public static int m5797c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof krc) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM5720o = 0;
        for (int i = 0; i < size; i++) {
            iM5720o += C1031p.m5720o(((Long) list.get(i)).longValue());
        }
        return iM5720o;
    }

    /* JADX INFO: renamed from: d */
    public static izc m5798d(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (izc) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m5799e(int i, List list, C1032q c1032q) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!(list instanceof yqc)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c1031p.m5730c(i, 2);
                byte[] bArr = c1031p.f12237b;
                int i3 = c1031p.f12239d;
                try {
                    int iM5725t = C1031p.m5725t(str.length() * 3);
                    int iM5725t2 = C1031p.m5725t(str.length());
                    if (iM5725t2 == iM5725t) {
                        int i4 = i3 + iM5725t2;
                        c1031p.f12239d = i4;
                        int iM5827e = AbstractC1040y.f12266a.m5827e(str, bArr, i4, c1031p.m5732e());
                        c1031p.f12239d = i3;
                        c1031p.m5733g((iM5827e - i3) - iM5725t2);
                        c1031p.f12239d = iM5827e;
                    } else {
                        c1031p.m5733g(AbstractC1040y.m5821a(str));
                        c1031p.f12239d = AbstractC1040y.f12266a.m5827e(str, bArr, c1031p.f12239d, c1031p.m5732e());
                    }
                } catch (zzmg e) {
                    c1031p.f12239d = i3;
                    C1031p.f12234e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(noc.f53082a);
                    try {
                        c1031p.m5733g(bytes.length);
                        c1031p.m5735k(bytes, 0, bytes.length);
                    } catch (zzii$zzb e2) {
                        throw e2;
                    } catch (IndexOutOfBoundsException e3) {
                        throw new zzii$zzb(e3);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzii$zzb(e4);
                }
            }
            return;
        }
        yqc yqcVar = (yqc) list;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object objMo5751z = yqcVar.mo5751z(i5);
            if (objMo5751z instanceof String) {
                String str2 = (String) objMo5751z;
                c1031p.m5730c(i, 2);
                byte[] bArr2 = c1031p.f12237b;
                int i6 = c1031p.f12239d;
                try {
                    int iM5725t3 = C1031p.m5725t(str2.length() * 3);
                    int iM5725t4 = C1031p.m5725t(str2.length());
                    if (iM5725t4 == iM5725t3) {
                        int i7 = i6 + iM5725t4;
                        c1031p.f12239d = i7;
                        int iM5827e2 = AbstractC1040y.f12266a.m5827e(str2, bArr2, i7, c1031p.m5732e());
                        c1031p.f12239d = i6;
                        c1031p.m5733g((iM5827e2 - i6) - iM5725t4);
                        c1031p.f12239d = iM5827e2;
                    } else {
                        c1031p.m5733g(AbstractC1040y.m5821a(str2));
                        c1031p.f12239d = AbstractC1040y.f12266a.m5827e(str2, bArr2, c1031p.f12239d, c1031p.m5732e());
                    }
                } catch (zzmg e5) {
                    c1031p.f12239d = i6;
                    C1031p.f12234e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(noc.f53082a);
                    try {
                        c1031p.m5733g(bytes2.length);
                        c1031p.m5735k(bytes2, 0, bytes2.length);
                    } catch (zzii$zzb e6) {
                        throw e6;
                    } catch (IndexOutOfBoundsException e7) {
                        throw new zzii$zzb(e7);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzii$zzb(e8);
                }
            } else {
                zzht zzhtVar = (zzht) objMo5751z;
                c1031p.m5730c(i, 2);
                c1031p.m5733g(zzhtVar.mo5832f());
                zzid zzidVar = (zzid) zzhtVar;
                c1031p.m5735k(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5800f(int i, List list, C1032q c1032q, iwc iwcVar) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1032q.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1032q.m5738b(i, list.get(i2), iwcVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5801g(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c1031p.getClass();
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dDoubleValue);
                c1031p.m5730c(i, 1);
                c1031p.m5734j(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 8;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5734j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5802h(izc izcVar, Object obj, Object obj2) {
        izcVar.getClass();
        AbstractC1034s abstractC1034s = (AbstractC1034s) obj;
        ozc ozcVar = abstractC1034s.zzb;
        ozc ozcVar2 = ((AbstractC1034s) obj2).zzb;
        if (!ozcVar2.equals(ozc.f55341f)) {
            int i = ozcVar.f55342a + ozcVar2.f55342a;
            int[] iArrCopyOf = Arrays.copyOf(ozcVar.f55343b, i);
            System.arraycopy(ozcVar2.f55343b, 0, iArrCopyOf, ozcVar.f55342a, ozcVar2.f55342a);
            Object[] objArrCopyOf = Arrays.copyOf(ozcVar.f55344c, i);
            System.arraycopy(ozcVar2.f55344c, 0, objArrCopyOf, ozcVar.f55342a, ozcVar2.f55342a);
            ozcVar = new ozc(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC1034s.zzb = ozcVar;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5803i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static int m5804j(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM5718m = C1031p.m5718m(i) * size;
        if (!(list instanceof yqc)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzht) {
                    int iMo5832f = ((zzht) obj).mo5832f();
                    iM5718m = dnb.m10500a(iMo5832f, iMo5832f, iM5718m);
                } else {
                    iM5718m = C1031p.m5715f((String) obj) + iM5718m;
                }
                i2++;
            }
            return iM5718m;
        }
        yqc yqcVar = (yqc) list;
        while (i2 < size) {
            Object objMo5751z = yqcVar.mo5751z(i2);
            if (objMo5751z instanceof zzht) {
                int iMo5832f2 = ((zzht) objMo5751z).mo5832f();
                iM5718m = dnb.m10500a(iMo5832f2, iMo5832f2, iM5718m);
            } else {
                iM5718m = C1031p.m5715f((String) objMo5751z) + iM5718m;
            }
            i2++;
        }
        return iM5718m;
    }

    /* JADX INFO: renamed from: k */
    public static int m5805k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof krc) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM5720o = 0;
        for (int i = 0; i < size; i++) {
            iM5720o += C1031p.m5720o(((Long) list.get(i)).longValue());
        }
        return iM5720o;
    }

    /* JADX INFO: renamed from: l */
    public static void m5806l(int i, List list, C1032q c1032q) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1032q.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1031p c1031p = c1032q.f12240a;
            zzht zzhtVar = (zzht) list.get(i2);
            c1031p.m5730c(i, 2);
            c1031p.m5733g(zzhtVar.mo5832f());
            zzid zzidVar = (zzid) zzhtVar;
            c1031p.m5735k(zzidVar.f12298d, zzidVar.mo5834j(), zzidVar.mo5832f());
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m5807m(int i, List list, C1032q c1032q, iwc iwcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1032q.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1032q.m5739c(i, list.get(i2), iwcVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5808n(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c1031p.getClass();
                int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
                c1031p.m5730c(i, 5);
                c1031p.m5736l(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 4;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5736l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m5809o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM5718m = C1031p.m5718m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iMo5832f = ((zzht) list.get(i2)).mo5832f();
            iM5718m = dnb.m10500a(iMo5832f, iMo5832f, iM5718m);
        }
        return iM5718m;
    }

    /* JADX INFO: renamed from: p */
    public static int m5810p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof krc)) {
                int iM5720o = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iM5720o += C1031p.m5720o((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iM5720o;
            }
            g9a.m12435l(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static void m5811q(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1031p.m5730c(i, 0);
                c1031p.m5731d(jLongValue);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5720o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM5720o += C1031p.m5720o(((Long) list.get(i3)).longValue());
        }
        c1031p.m5733g(iM5720o);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1031p.m5731d(((Long) list.get(i4)).longValue());
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m5812r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof doc)) {
            int iM5721p = 0;
            while (i < size) {
                iM5721p += C1031p.m5721p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM5721p;
        }
        doc docVar = (doc) list;
        int iM5721p2 = 0;
        while (i < size) {
            docVar.m10563g(i);
            iM5721p2 += C1031p.m5721p(docVar.f35979b[i]);
            i++;
        }
        return iM5721p2;
    }

    /* JADX INFO: renamed from: s */
    public static void m5813s(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1031p.m5730c(i, 0);
                c1031p.m5731d(jLongValue);
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5720o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM5720o += C1031p.m5720o(((Long) list.get(i3)).longValue());
        }
        c1031p.m5733g(iM5720o);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1031p.m5731d(((Long) list.get(i4)).longValue());
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m5814t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof doc)) {
            int iM5721p = 0;
            while (i < size) {
                iM5721p += C1031p.m5721p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM5721p;
        }
        doc docVar = (doc) list;
        int iM5721p2 = 0;
        while (i < size) {
            docVar.m10563g(i);
            iM5721p2 += C1031p.m5721p(docVar.f35979b[i]);
            i++;
        }
        return iM5721p2;
    }

    /* JADX INFO: renamed from: u */
    public static void m5815u(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1031p.m5730c(i, 0);
                c1031p.m5731d((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int iM5720o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM5720o += C1031p.m5720o((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1031p.m5733g(iM5720o);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c1031p.m5731d((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: v */
    public static int m5816v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof doc)) {
            int iM5725t = 0;
            while (i < size) {
                iM5725t += C1031p.m5725t(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM5725t;
        }
        doc docVar = (doc) list;
        int iM5725t2 = 0;
        while (i < size) {
            docVar.m10563g(i);
            iM5725t2 += C1031p.m5725t(docVar.f35979b[i]);
            i++;
        }
        return iM5725t2;
    }

    /* JADX INFO: renamed from: w */
    public static void m5817w(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1031p.m5730c(i, 1);
                c1031p.m5734j(jLongValue);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 8;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5734j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m5818x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof doc)) {
            int iM5725t = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM5725t += C1031p.m5725t((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM5725t;
        }
        doc docVar = (doc) list;
        int iM5725t2 = 0;
        while (i < size) {
            docVar.m10563g(i);
            int i2 = docVar.f35979b[i];
            iM5725t2 += C1031p.m5725t((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM5725t2;
    }

    /* JADX INFO: renamed from: y */
    public static void m5819y(int i, List list, C1032q c1032q, boolean z) throws zzii$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1031p c1031p = c1032q.f12240a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1031p.m5730c(i, 1);
                c1031p.m5734j(jLongValue);
                i2++;
            }
            return;
        }
        c1031p.m5730c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1031p.f12234e;
            i3 += 8;
        }
        c1031p.m5733g(i3);
        while (i2 < list.size()) {
            c1031p.m5734j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m5820z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1031p.m5727v(i) * size;
    }
}
