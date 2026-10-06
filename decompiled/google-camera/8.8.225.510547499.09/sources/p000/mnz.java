package p000;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class mnz implements moq {

    /* JADX INFO: renamed from: a */
    private final moq f41151a;

    /* JADX INFO: renamed from: b */
    private final UUID f41152b;

    /* JADX INFO: renamed from: c */
    private final String f41153c;

    public mnz(String str, UUID uuid) {
        this.f41153c = str;
        this.f41151a = null;
        this.f41152b = uuid;
    }

    public mnz(String str, moq moqVar) {
        this.f41153c = str;
        this.f41151a = moqVar;
        this.f41152b = moqVar.mo16672c();
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: a */
    public final moq mo16670a() {
        return this.f41151a;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: b */
    public final String mo16671b() {
        return this.f41153c;
    }

    @Override // p000.moq
    /* JADX INFO: renamed from: c */
    public final UUID mo16672c() {
        return this.f41152b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, moq] */
    @Override // p000.mor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        moy moyVar = (moy) moz.f41223b.get();
        ?? r1 = moyVar.f41220b;
        r1.getClass();
        lku.m15617L(this == r1, "Tried to end span %s, but that span is not the current span. The current span is %s.", mo16671b(), r1.mo16671b());
        moz.m16725c(moyVar, r1.mo16670a());
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01db  */
    public final String toString() {
        moo mooVar;
        mom momVar;
        WeakHashMap weakHashMap = moz.f41222a;
        int i = 0;
        int length = 0;
        moq moqVarMo16670a = this;
        while (moqVarMo16670a != null) {
            i++;
            length += moqVarMo16670a.mo16671b().length();
            moqVarMo16670a = moqVarMo16670a.mo16670a();
            if (moqVarMo16670a != null) {
                length += 4;
            }
        }
        if (i > 250) {
            String[] strArr = new String[i];
            moq moqVarMo16670a2 = this;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                strArr[i2] = moqVarMo16670a2.mo16671b();
                moqVarMo16670a2 = moqVarMo16670a2.mo16670a();
            }
            mwt mwtVarM17115i = mwx.m17115i();
            naz nazVarListIterator = mxk.m17135G(strArr).listIterator();
            int i3 = 0;
            while (nazVarListIterator.hasNext()) {
                mwtVarM17115i.mo17110e(nazVarListIterator.next(), Integer.valueOf(i3));
                i3++;
            }
            mwx mwxVarMo17059b = mwtVarM17115i.mo17059b();
            mzw mzwVar = (mzw) mwxVarMo17059b;
            int i4 = i >> 2;
            if (mzwVar.f41872c > i4) {
                mooVar = null;
            } else {
                int i5 = i + 1;
                int[] iArr = new int[i5];
                for (int i6 = 0; i6 < i; i6++) {
                    iArr[i6] = ((Integer) mwxVarMo17059b.get(strArr[i6])).intValue();
                }
                iArr[i] = mzwVar.f41872c;
                mop mopVar = new mop(iArr);
                int i7 = 0;
                while (true) {
                    int i8 = -1;
                    if (i7 >= i5) {
                        break;
                    }
                    mopVar.f41212f++;
                    int i9 = mopVar.f41207a[i7];
                    mon monVar = null;
                    while (mopVar.f41212f > 0) {
                        if (mopVar.f41211e == 0) {
                            Map map = mopVar.f41209c.f41203d;
                            Integer numValueOf = Integer.valueOf(i9);
                            if (map.containsKey(numValueOf)) {
                                if (monVar != null) {
                                    monVar.f41202c = mopVar.f41209c;
                                }
                                mopVar.f41210d = i7;
                                mopVar.f41211e++;
                                mopVar.m16713b();
                                break;
                            }
                            mopVar.f41209c.f41203d.put(numValueOf, new mon(i7, 1073741824));
                            if (monVar != null) {
                                monVar.f41202c = mopVar.f41209c;
                            }
                            mopVar.f41212f += i8;
                            mopVar.m16712a();
                            monVar = null;
                        } else {
                            int[] iArr2 = mopVar.f41207a;
                            int i10 = ((mon) mopVar.f41209c.f41203d.get(Integer.valueOf(iArr2[mopVar.f41210d]))).f41200a;
                            int i11 = mopVar.f41211e;
                            if (iArr2[i10 + i11] == i9) {
                                if (monVar != null) {
                                    monVar.f41202c = mopVar.f41209c;
                                }
                                mopVar.f41211e = i11 + 1;
                                mopVar.m16713b();
                                break;
                            }
                            mon monVar2 = (mon) mopVar.f41209c.f41203d.get(Integer.valueOf(mopVar.f41207a[mopVar.f41210d]));
                            int i12 = monVar2.f41200a;
                            mon monVar3 = new mon(i12, mopVar.f41211e + i12 + i8);
                            mopVar.f41209c.f41203d.put(Integer.valueOf(mopVar.f41207a[mopVar.f41210d]), monVar3);
                            monVar3.f41203d.put(Integer.valueOf(mopVar.f41207a[monVar3.f41201b + 1]), monVar2);
                            monVar2.f41200a = monVar3.f41201b + 1;
                            if (monVar != null) {
                                monVar.f41202c = monVar3;
                            }
                            monVar3.f41203d.put(Integer.valueOf(i9), new mon(i7, 1073741824));
                            mopVar.f41212f--;
                            mopVar.m16712a();
                            monVar = monVar3;
                            i8 = -1;
                        }
                    }
                    i7++;
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                mom momVar2 = new mom(mopVar.f41208b, 0, -1, -1);
                arrayDeque.push(momVar2);
                while (!arrayDeque.isEmpty()) {
                    mom momVar3 = (mom) arrayDeque.pop();
                    for (mon monVar4 : ((mon) momVar3.f41199d).f41203d.values()) {
                        if (mopVar.m16714c(momVar3.f41197b, momVar3.f41198c, monVar4.f41200a, monVar4.f41201b)) {
                            momVar = new mom(monVar4, momVar3.f41196a + 1, momVar3.f41197b, momVar3.f41198c);
                        } else {
                            if (monVar4.f41203d.isEmpty()) {
                                int i13 = momVar3.f41197b;
                                int i14 = momVar3.f41198c;
                                int i15 = monVar4.f41200a;
                                if (mopVar.m16714c(i13, i14, i15, (i15 + i14) - i13)) {
                                    momVar = new mom(monVar4, momVar3.f41196a + 1, momVar3.f41197b, momVar3.f41198c);
                                }
                            }
                            momVar = new mom(monVar4, 1, monVar4.f41200a, monVar4.f41201b);
                        }
                        if (momVar2.f41196a < momVar.f41196a) {
                            momVar2 = momVar;
                        }
                        arrayDeque.push(momVar);
                    }
                }
                int iMin = Math.min(mopVar.f41207a.length, momVar2.f41198c + 1);
                mon monVar5 = mopVar.f41208b;
                int i16 = 0;
                loop8: while (true) {
                    int[] iArr3 = mopVar.f41207a;
                    int i17 = momVar2.f41197b;
                    monVar5 = (mon) monVar5.f41203d.get(Integer.valueOf(iArr3[i17 + (i16 % (iMin - i17))]));
                    if (monVar5 == null) {
                        break;
                    }
                    for (int i18 = monVar5.f41200a; i18 < monVar5.f41201b + 1; i18++) {
                        int[] iArr4 = mopVar.f41207a;
                        if (i18 >= iArr4.length) {
                            break;
                        }
                        int i19 = momVar2.f41197b;
                        if (iArr4[i19 + (i16 % (iMin - i19))] != iArr4[i18]) {
                            break loop8;
                        }
                        i16++;
                    }
                }
                int i20 = momVar2.f41197b;
                moo mooVar2 = new moo(i20, iMin, i16 / (iMin - i20));
                mooVar = mooVar2.f41206c * (mooVar2.f41205b - mooVar2.f41204a) < i4 ? null : mooVar2;
            }
            String str = "";
            if (mooVar != null) {
                int i21 = mooVar.f41205b;
                int i22 = mooVar.f41204a;
                int i23 = (i21 - i22) * mooVar.f41206c;
                String strConcat = i22 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i22))).concat(" -> ") : "";
                int i24 = mooVar.f41204a + i23;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, mooVar.f41204a, mooVar.f41205b)), Integer.valueOf(mooVar.f41206c), i24 < i ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i24, i)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        moq moqVarMo16670a3 = this;
        while (moqVarMo16670a3 != null) {
            String strMo16671b = moqVarMo16670a3.mo16671b();
            length -= strMo16671b.length();
            strMo16671b.getChars(0, strMo16671b.length(), cArr, length);
            moqVarMo16670a3 = moqVarMo16670a3.mo16670a();
            if (moqVarMo16670a3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }
}
