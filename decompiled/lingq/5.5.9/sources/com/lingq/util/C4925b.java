package com.lingq.util;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7793a;
import p249lo.C7423p;
import p249lo.InterfaceC7415h;

/* JADX INFO: renamed from: com.lingq.util.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4925b {

    /* JADX INFO: renamed from: a */
    public final Locale f32103a;

    /* JADX INFO: renamed from: b */
    public String f32104b;

    /* JADX INFO: renamed from: c */
    public final HashSet<Integer> f32105c;

    /* JADX INFO: renamed from: d */
    public final HashSet<Integer> f32106d;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C4925b(Locale locale, String str, String str2) {
        int i10;
        C5207g.m11111f(str, "originalText");
        C5207g.m11111f(str2, "matchingText");
        this.f32103a = locale;
        this.f32104b = str;
        this.f32105c = new HashSet<>();
        this.f32106d = new HashSet<>();
        this.f32104b = C7793a.m15502f(this.f32104b, locale);
        String strM15502f = C7793a.m15502f(str2, locale);
        int length = this.f32104b.length();
        int length2 = strM15502f.length();
        char[] charArray = this.f32104b.toCharArray();
        C5207g.m11110e(charArray, "this as java.lang.String).toCharArray()");
        char[] charArray2 = strM15502f.toCharArray();
        C5207g.m11110e(charArray2, "this as java.lang.String).toCharArray()");
        int i11 = length + 1;
        int[][] iArr = new int[i11][];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            iArr[i13] = new int[length2 + 1];
        }
        for (int i14 = length - 1; -1 < i14; i14--) {
            for (int i15 = length2 - 1; -1 < i15; i15--) {
                if (C7661i.m15249O2(String.valueOf(charArray[i14]), String.valueOf(charArray2[i15]))) {
                    iArr[i14][i15] = iArr[i14 + 1][i15 + 1] + 1;
                } else {
                    int[] iArr2 = iArr[i14];
                    int i16 = iArr[i14 + 1][i15];
                    int i17 = iArr2[i15 + 1];
                    iArr2[i15] = i16 < i17 ? i17 : i16;
                }
            }
        }
        char[] cArr = new char[iArr[0][0]];
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i18 < length && i19 < length2) {
            char c10 = charArray[i18];
            if (c10 == charArray2[i19]) {
                i18++;
                cArr[i20] = c10;
                i19++;
                i20++;
            } else {
                int i21 = i18 + 1;
                int i22 = i19 + 1;
                if (iArr[i21][i19] > iArr[i18][i22]) {
                    i18 = i21;
                } else {
                    i19 = i22;
                }
            }
        }
        String str3 = new String(cArr);
        HashSet<Integer> hashSet = this.f32105c;
        hashSet.clear();
        HashSet<Integer> hashSet2 = this.f32106d;
        hashSet2.clear();
        Locale locale2 = this.f32103a;
        String string = C7076b.m14277B3(C7793a.m15502f(str3, locale2)).toString();
        if (C5207g.m11106a(string, this.f32104b)) {
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            InterfaceC7415h interfaceC7415hM14251L2 = SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.util.StringDiff$getIndexes$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Integer mo807E() {
                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                    int i23 = ref$IntRef2.f38125a;
                    ref$IntRef2.f38125a = i23 + 1;
                    Integer numValueOf = Integer.valueOf(i23);
                    if (numValueOf.intValue() <= C7076b.m14281a3(this.f32104b)) {
                        return numValueOf;
                    }
                    return null;
                }
            });
            HashSet hashSet3 = new HashSet();
            C7073a.m14265Z2(interfaceC7415hM14251L2, hashSet3);
            hashSet.addAll(hashSet3);
            return;
        }
        List listM14299s3 = C7076b.m14299s3(string, new String[]{" "}, 0, 6);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listM14299s3) {
            if (!C7661i.m15250P2((String) obj)) {
                arrayList.add(obj);
            }
        }
        String string2 = string;
        for (String str4 : arrayList) {
            try {
                C7423p c7423pM10468k = C4924a.m10468k(this.f32104b, str4);
                if (c7423pM10468k.f41267a.iterator().hasNext() && ((Number) C7073a.m14258S2(c7423pM10468k)).intValue() >= 0) {
                    int iIntValue = ((Number) C7073a.m14258S2(c7423pM10468k)).intValue();
                    int iIntValue2 = ((Number) C7073a.m14258S2(c7423pM10468k)).intValue() + str4.length();
                    while (iIntValue < iIntValue2) {
                        hashSet.add(Integer.valueOf(iIntValue));
                        String str5 = this.f32104b;
                        C5207g.m11111f(str5, "<this>");
                        int i23 = iIntValue + 1;
                        this.f32104b = C7076b.m14295o3(str5, iIntValue, i23, " ").toString();
                        iIntValue = i23;
                    }
                    C7423p c7423pM10468k2 = C4924a.m10468k(string2, str4);
                    if (c7423pM10468k2.f41267a.iterator().hasNext() && ((Number) C7073a.m14258S2(c7423pM10468k2)).intValue() >= 0) {
                        int iIntValue3 = ((Number) C7073a.m14258S2(c7423pM10468k2)).intValue();
                        int iIntValue4 = ((Number) C7073a.m14258S2(c7423pM10468k2)).intValue() + str4.length();
                        while (iIntValue3 < iIntValue4) {
                            C5207g.m11111f(string2, "<this>");
                            int i24 = iIntValue3 + 1;
                            string2 = C7076b.m14295o3(string2, iIntValue3, i24, " ").toString();
                            iIntValue3 = i24;
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String str6 = this.f32104b;
        int i25 = 0;
        int i26 = 0;
        while (i25 < str6.length()) {
            char cCharAt = str6.charAt(i25);
            int i27 = i26 + 1;
            if (hashSet.contains(Integer.valueOf(i26))) {
                i10 = i12;
            } else {
                int length3 = string2.length();
                int i28 = i12;
                while (true) {
                    if (i28 >= length3) {
                        i28 = -1;
                        break;
                    }
                    char cCharAt2 = string2.charAt(i28);
                    if (cCharAt2 != ' ' && C5207g.m11106a(C7793a.m15502f(String.valueOf(cCharAt2), locale2), C7793a.m15502f(String.valueOf(cCharAt), locale2))) {
                        break;
                    } else {
                        i28++;
                    }
                }
                if (i28 == -1 && (!C7661i.m15250P2(String.valueOf(cCharAt)))) {
                    hashSet2.add(Integer.valueOf(i26));
                } else if (i28 > -1) {
                    i10 = 0;
                    int iM14284d3 = C7076b.m14284d3(string2, cCharAt, 0, false, 2);
                    string2 = iM14284d3 >= 0 ? C7076b.m14295o3(string2, iM14284d3, iM14284d3 + 1, String.valueOf(' ')).toString() : string2;
                    hashSet.add(Integer.valueOf(i26));
                }
                i10 = 0;
            }
            i25++;
            i26 = i27;
            i12 = i10;
        }
    }
}
