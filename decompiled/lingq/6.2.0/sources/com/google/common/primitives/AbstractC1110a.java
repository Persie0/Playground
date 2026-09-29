package com.google.common.primitives;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.bna;
import p000.uk5;

/* JADX INFO: renamed from: com.google.common.primitives.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1110a {
    /* JADX INFO: renamed from: a */
    public static List m6361a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new Ints$IntArrayAsList(0, iArr.length, iArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m6362b(long j) {
        int i = (int) j;
        bna.m3963n(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m6363c(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m6364d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m6365e(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof Ints$IntArrayAsList) {
            Ints$IntArrayAsList ints$IntArrayAsList = (Ints$IntArrayAsList) abstractCollection;
            return Arrays.copyOfRange(ints$IntArrayAsList.f13497a, ints$IntArrayAsList.f13498b, ints$IntArrayAsList.f13499c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m6366f(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX INFO: renamed from: g */
    public static Integer m6367g(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = uk5.f64022a[cCharAt];
                } else {
                    byte[] bArr = uk5.f64022a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = uk5.f64022a[cCharAt2];
                        } else {
                            byte[] bArr2 = uk5.f64022a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
