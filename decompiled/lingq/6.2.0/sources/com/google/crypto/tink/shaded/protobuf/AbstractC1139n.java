package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.f94;
import p000.fk5;
import p000.ij6;
import p000.iw4;
import p000.o94;
import p000.t74;
import p000.wm8;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1139n {

    /* JADX INFO: renamed from: a */
    public static final Class f13616a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1140o f13617b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1140o f13618c;

    /* JADX INFO: renamed from: d */
    public static final C1142q f13619d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f13616a = cls;
        f13617b = m6647w(false);
        f13618c = m6647w(true);
        f13619d = new C1142q();
    }

    /* JADX INFO: renamed from: A */
    public static void m6607A(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c1131f.m6517r(i, 0);
                c1131f.m6510k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3++;
        }
        c1131f.m6518s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c1131f.m6510k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m6608B(int i, List list, C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1132g.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1131f c1131f = c1132g.f13592a;
            ByteString byteString = (ByteString) list.get(i2);
            c1131f.m6517r(i, 2);
            c1131f.m6518s(byteString.size());
            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
            c1131f.m6511l(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size());
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m6609C(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c1131f.getClass();
                c1131f.m6514o(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 8;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6515p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m6610D(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1131f.m6517r(i, 0);
                c1131f.m6516q(iIntValue);
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6505f = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6505f += C1131f.m6505f(((Integer) list.get(i3)).intValue());
        }
        c1131f.m6518s(iM6505f);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1131f.m6516q(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m6611E(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6512m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 4;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6513n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m6612F(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6514o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 8;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6515p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m6613G(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c1131f.getClass();
                c1131f.m6512m(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 4;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6513n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m6614H(int i, List list, C1132g c1132g, wm8 wm8Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1132g.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1132g.m6528h(i, list.get(i2), wm8Var);
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m6615I(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1131f.m6517r(i, 0);
                c1131f.m6516q(iIntValue);
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6505f = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6505f += C1131f.m6505f(((Integer) list.get(i3)).intValue());
        }
        c1131f.m6518s(iM6505f);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1131f.m6516q(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m6616J(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6519t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6509j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6509j += C1131f.m6509j(((Long) list.get(i3)).longValue());
        }
        c1131f.m6518s(iM6509j);
        while (i2 < list.size()) {
            c1131f.m6520u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m6617K(int i, List list, C1132g c1132g, wm8 wm8Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1132g.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1132g.m6531k(i, list.get(i2), wm8Var);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m6618L(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6512m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 4;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6513n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m6619M(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6514o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1131f.f13586e;
            i3 += 8;
        }
        c1131f.m6518s(i3);
        while (i2 < list.size()) {
            c1131f.m6515p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m6620N(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1131f.m6517r(i, 0);
                c1131f.m6518s((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6508i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM6508i += C1131f.m6508i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1131f.m6518s(iM6508i);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c1131f.m6518s((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m6621O(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1131f.m6519t(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6509j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM6509j += C1131f.m6509j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1131f.m6518s(iM6509j);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c1131f.m6520u((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m6622P(int i, List list, C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!(list instanceof iw4)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c1131f.m6517r(i, 2);
                int i3 = c1131f.f13590c;
                byte[] bArr = c1131f.f13589b;
                int i4 = c1131f.f13591d;
                try {
                    int iM6508i = C1131f.m6508i(str.length() * 3);
                    int iM6508i2 = C1131f.m6508i(str.length());
                    if (iM6508i2 == iM6508i) {
                        int i5 = i4 + iM6508i2;
                        c1131f.f13591d = i5;
                        int iM6661b = AbstractC1144s.f13628a.m6661b(str, bArr, i5, i3 - i5);
                        c1131f.f13591d = i4;
                        c1131f.m6518s((iM6661b - i4) - iM6508i2);
                        c1131f.f13591d = iM6661b;
                    } else {
                        c1131f.m6518s(AbstractC1144s.m6664b(str));
                        int i6 = c1131f.f13591d;
                        c1131f.f13591d = AbstractC1144s.f13628a.m6661b(str, bArr, i6, i3 - i6);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    c1131f.f13591d = i4;
                    C1131f.f13586e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(o94.f54077a);
                    try {
                        c1131f.m6518s(bytes.length);
                        c1131f.m6511l(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(e3);
                }
            }
            return;
        }
        iw4 iw4Var = (iw4) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object raw = iw4Var.getRaw(i7);
            if (raw instanceof String) {
                String str2 = (String) raw;
                c1131f.m6517r(i, 2);
                int i8 = c1131f.f13590c;
                byte[] bArr2 = c1131f.f13589b;
                int i9 = c1131f.f13591d;
                try {
                    int iM6508i3 = C1131f.m6508i(str2.length() * 3);
                    int iM6508i4 = C1131f.m6508i(str2.length());
                    if (iM6508i4 == iM6508i3) {
                        int i10 = i9 + iM6508i4;
                        c1131f.f13591d = i10;
                        int iM6661b2 = AbstractC1144s.f13628a.m6661b(str2, bArr2, i10, i8 - i10);
                        c1131f.f13591d = i9;
                        c1131f.m6518s((iM6661b2 - i9) - iM6508i4);
                        c1131f.f13591d = iM6661b2;
                    } else {
                        c1131f.m6518s(AbstractC1144s.m6664b(str2));
                        int i11 = c1131f.f13591d;
                        c1131f.f13591d = AbstractC1144s.f13628a.m6661b(str2, bArr2, i11, i8 - i11);
                    }
                } catch (Utf8$UnpairedSurrogateException e4) {
                    c1131f.f13591d = i9;
                    C1131f.f13586e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(o94.f54077a);
                    try {
                        c1131f.m6518s(bytes2.length);
                        c1131f.m6511l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new CodedOutputStream$OutOfSpaceException(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new CodedOutputStream$OutOfSpaceException(e6);
                }
            } else {
                ByteString byteString = (ByteString) raw;
                c1131f.m6517r(i, 2);
                c1131f.m6518s(byteString.size());
                ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
                c1131f.m6511l(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size());
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m6623Q(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1131f.m6517r(i, 0);
                c1131f.m6518s(iIntValue);
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6508i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6508i += C1131f.m6508i(((Integer) list.get(i3)).intValue());
        }
        c1131f.m6518s(iM6508i);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1131f.m6518s(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m6624R(int i, List list, C1132g c1132g, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1131f c1131f = c1132g.f13592a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1131f.m6519t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1131f.m6517r(i, 2);
        int iM6509j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6509j += C1131f.m6509j(((Long) list.get(i3)).longValue());
        }
        c1131f.m6518s(iM6509j);
        while (i2 < list.size()) {
            c1131f.m6520u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m6625a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM6507h = C1131f.m6507h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM6507h += C1131f.m6501b((ByteString) list.get(i2));
        }
        return iM6507h;
    }

    /* JADX INFO: renamed from: b */
    public static int m6626b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6627c(list);
    }

    /* JADX INFO: renamed from: c */
    public static int m6627c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t74)) {
            int iM6505f = 0;
            while (i < size) {
                iM6505f += C1131f.m6505f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6505f;
        }
        t74 t74Var = (t74) list;
        int iM6505f2 = 0;
        while (i < size) {
            iM6505f2 += C1131f.m6505f(t74Var.getInt(i));
            i++;
        }
        return iM6505f2;
    }

    /* JADX INFO: renamed from: d */
    public static int m6628d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1131f.m6502c(i) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m6629e(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m6630f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1131f.m6503d(i) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m6631g(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m6632h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6633i(list);
    }

    /* JADX INFO: renamed from: i */
    public static int m6633i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t74)) {
            int iM6505f = 0;
            while (i < size) {
                iM6505f += C1131f.m6505f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6505f;
        }
        t74 t74Var = (t74) list;
        int iM6505f2 = 0;
        while (i < size) {
            iM6505f2 += C1131f.m6505f(t74Var.getInt(i));
            i++;
        }
        return iM6505f2;
    }

    /* JADX INFO: renamed from: j */
    public static int m6634j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * list.size()) + m6635k(list);
    }

    /* JADX INFO: renamed from: k */
    public static int m6635k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fk5)) {
            int iM6509j = 0;
            while (i < size) {
                iM6509j += C1131f.m6509j(((Long) list.get(i)).longValue());
                i++;
            }
            return iM6509j;
        }
        fk5 fk5Var = (fk5) list;
        int iM6509j2 = 0;
        while (i < size) {
            iM6509j2 += C1131f.m6509j(fk5Var.getLong(i));
            i++;
        }
        return iM6509j2;
    }

    /* JADX INFO: renamed from: l */
    public static int m6636l(int i, List list, wm8 wm8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM6507h = C1131f.m6507h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo6429a = ((AbstractC1126a) list.get(i2)).mo6429a(wm8Var);
            iM6507h += C1131f.m6508i(iMo6429a) + iMo6429a;
        }
        return iM6507h;
    }

    /* JADX INFO: renamed from: m */
    public static int m6637m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6638n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m6638n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t74)) {
            int iM6508i = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM6508i += C1131f.m6508i((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM6508i;
        }
        t74 t74Var = (t74) list;
        int iM6508i2 = 0;
        while (i < size) {
            int i2 = t74Var.getInt(i);
            iM6508i2 += C1131f.m6508i((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM6508i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m6639o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6640p(list);
    }

    /* JADX INFO: renamed from: p */
    public static int m6640p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fk5)) {
            int iM6509j = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM6509j += C1131f.m6509j((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM6509j;
        }
        fk5 fk5Var = (fk5) list;
        int iM6509j2 = 0;
        while (i < size) {
            long j = fk5Var.getLong(i);
            iM6509j2 += C1131f.m6509j((j >> 63) ^ (j << 1));
            i++;
        }
        return iM6509j2;
    }

    /* JADX INFO: renamed from: q */
    public static int m6641q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM6507h = C1131f.m6507h(i) * size;
        if (!(list instanceof iw4)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ByteString) {
                    int size2 = ((ByteString) obj).size();
                    iM6507h = C1131f.m6508i(size2) + size2 + iM6507h;
                } else {
                    iM6507h = C1131f.m6506g((String) obj) + iM6507h;
                }
                i2++;
            }
            return iM6507h;
        }
        iw4 iw4Var = (iw4) list;
        while (i2 < size) {
            Object raw = iw4Var.getRaw(i2);
            if (raw instanceof ByteString) {
                int size3 = ((ByteString) raw).size();
                iM6507h = C1131f.m6508i(size3) + size3 + iM6507h;
            } else {
                iM6507h = C1131f.m6506g((String) raw) + iM6507h;
            }
            i2++;
        }
        return iM6507h;
    }

    /* JADX INFO: renamed from: r */
    public static int m6642r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6643s(list);
    }

    /* JADX INFO: renamed from: s */
    public static int m6643s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t74)) {
            int iM6508i = 0;
            while (i < size) {
                iM6508i += C1131f.m6508i(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6508i;
        }
        t74 t74Var = (t74) list;
        int iM6508i2 = 0;
        while (i < size) {
            iM6508i2 += C1131f.m6508i(t74Var.getInt(i));
            i++;
        }
        return iM6508i2;
    }

    /* JADX INFO: renamed from: t */
    public static int m6644t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1131f.m6507h(i) * size) + m6645u(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m6645u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fk5)) {
            int iM6509j = 0;
            while (i < size) {
                iM6509j += C1131f.m6509j(((Long) list.get(i)).longValue());
                i++;
            }
            return iM6509j;
        }
        fk5 fk5Var = (fk5) list;
        int iM6509j2 = 0;
        while (i < size) {
            iM6509j2 += C1131f.m6509j(fk5Var.getLong(i));
            i++;
        }
        return iM6509j2;
    }

    /* JADX INFO: renamed from: v */
    public static Object m6646v(Object obj, int i, List list, f94 f94Var, Object obj2, AbstractC1140o abstractC1140o) {
        if (f94Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!f94Var.isInRange(iIntValue)) {
                    obj2 = m6650z(obj, i, iIntValue, obj2, abstractC1140o);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (f94Var.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m6650z(obj, i, iIntValue2, obj2, abstractC1140o);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC1140o m6647w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AbstractC1140o) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x */
    public static void m6648x(AbstractC1140o abstractC1140o, Object obj, Object obj2) {
        ((C1142q) abstractC1140o).getClass();
        AbstractC1134i abstractC1134i = (AbstractC1134i) obj;
        C1141p c1141p = abstractC1134i.unknownFields;
        C1141p c1141p2 = ((AbstractC1134i) obj2).unknownFields;
        C1141p c1141p3 = C1141p.f13620f;
        if (!c1141p3.equals(c1141p2)) {
            if (c1141p3.equals(c1141p)) {
                int i = c1141p.f13621a + c1141p2.f13621a;
                int[] iArrCopyOf = Arrays.copyOf(c1141p.f13622b, i);
                System.arraycopy(c1141p2.f13622b, 0, iArrCopyOf, c1141p.f13621a, c1141p2.f13621a);
                Object[] objArrCopyOf = Arrays.copyOf(c1141p.f13623c, i);
                System.arraycopy(c1141p2.f13623c, 0, objArrCopyOf, c1141p.f13621a, c1141p2.f13621a);
                c1141p = new C1141p(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1141p.getClass();
                if (!c1141p2.equals(c1141p3)) {
                    if (!c1141p.f13625e) {
                        ij6.m13946b();
                        return;
                    }
                    int i2 = c1141p.f13621a + c1141p2.f13621a;
                    c1141p.m6654a(i2);
                    System.arraycopy(c1141p2.f13622b, 0, c1141p.f13622b, c1141p.f13621a, c1141p2.f13621a);
                    System.arraycopy(c1141p2.f13623c, 0, c1141p.f13623c, c1141p.f13621a, c1141p2.f13621a);
                    c1141p.f13621a = i2;
                }
            }
        }
        abstractC1134i.unknownFields = c1141p;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m6649y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static Object m6650z(Object obj, int i, int i2, Object obj2, AbstractC1140o abstractC1140o) {
        if (obj2 == null) {
            obj2 = abstractC1140o.mo6651a(obj);
        }
        ((C1142q) abstractC1140o).getClass();
        ((C1141p) obj2).m6656d(i << 3, Long.valueOf(i2));
        return obj2;
    }
}
