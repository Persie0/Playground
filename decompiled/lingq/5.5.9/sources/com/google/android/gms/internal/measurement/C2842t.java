package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2842t implements Iterable, InterfaceC2790p {

    /* JADX INFO: renamed from: a */
    public final String f14432a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2842t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f14432a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return new C2842t(this.f14432a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        String str = this.f14432a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2842t) {
            return this.f14432a.equals(((C2842t) obj).f14432a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return this.f14432a;
    }

    public final int hashCode() {
        return this.f14432a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.valueOf(!this.f14432a.isEmpty());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2829s(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return new C2816r(this);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:103:0x018b  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:111:0x0200  */
    /* JADX WARN: Code duplicated, block: B:112:0x021a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:116:0x023d  */
    /* JADX WARN: Code duplicated, block: B:118:0x026e  */
    /* JADX WARN: Code duplicated, block: B:120:0x027d  */
    /* JADX WARN: Code duplicated, block: B:121:0x028f  */
    /* JADX WARN: Code duplicated, block: B:123:0x029c  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:137:0x0304  */
    /* JADX WARN: Code duplicated, block: B:141:0x030b  */
    /* JADX WARN: Code duplicated, block: B:143:0x030f A[LOOP:0: B:142:0x030d->B:143:0x030f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0323  */
    /* JADX WARN: Code duplicated, block: B:147:0x0331  */
    /* JADX WARN: Code duplicated, block: B:148:0x0346  */
    /* JADX WARN: Code duplicated, block: B:151:0x0352  */
    /* JADX WARN: Code duplicated, block: B:152:0x035d  */
    /* JADX WARN: Code duplicated, block: B:155:0x036d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0380  */
    /* JADX WARN: Code duplicated, block: B:159:0x038f  */
    /* JADX WARN: Code duplicated, block: B:160:0x039a  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0402  */
    /* JADX WARN: Code duplicated, block: B:171:0x0413  */
    /* JADX WARN: Code duplicated, block: B:173:0x042a  */
    /* JADX WARN: Code duplicated, block: B:176:0x043c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0440  */
    /* JADX WARN: Code duplicated, block: B:180:0x0485  */
    /* JADX WARN: Code duplicated, block: B:182:0x0494  */
    /* JADX WARN: Code duplicated, block: B:183:0x0497  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:187:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:191:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:194:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:195:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:198:0x0517  */
    /* JADX WARN: Code duplicated, block: B:199:0x051a  */
    /* JADX WARN: Code duplicated, block: B:201:0x052f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0540  */
    /* JADX WARN: Code duplicated, block: B:208:0x0559  */
    /* JADX WARN: Code duplicated, block: B:210:0x0582  */
    /* JADX WARN: Code duplicated, block: B:213:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:221:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:223:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:226:0x05dc A[LOOP:1: B:224:0x05d6->B:226:0x05dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:232:0x060c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0625  */
    /* JADX WARN: Code duplicated, block: B:244:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0162  */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    /* JADX WARN: Code duplicated, block: B:97:0x0172  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174 A[PHI: r6 r7
      0x0174: PHI (r6v50 java.lang.String) = (r6v4 java.lang.String), (r6v51 java.lang.String) binds: [B:96:0x0170, B:94:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r7v30 java.lang.String) = (r7v1 java.lang.String), (r7v31 java.lang.String) binds: [B:96:0x0170, B:94:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:201:0x052f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        byte b10;
        String strMo7784f;
        String str6;
        int iM7685a;
        InterfaceC2790p c2842t;
        StringBuilder sb2;
        int i10;
        InterfaceC2790p interfaceC2790pM7863b;
        boolean zEquals;
        InterfaceC2790p c2842t2;
        double dDoubleValue;
        int i11;
        double dDoubleValue2;
        double dM7685a;
        String strMo7784f2;
        Matcher matcher;
        InterfaceC2790p interfaceC2790pMo7646b;
        String str7;
        int iIndexOf;
        Matcher matcher2;
        double dDoubleValue3;
        double dM7685a2;
        double dMin;
        double length;
        double dM7685a3;
        double dMin2;
        ArrayList arrayList2;
        String strMo7784f3;
        long jM7688d;
        String[] strArrSplit;
        int length2;
        boolean z10;
        int i12;
        int i13;
        boolean zIsEmpty;
        C2684h3 c2684h4;
        int iM7685a2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r6;
                    if (str.equals(str5)) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    if (str.equals("toString")) {
                        b10 = 14;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b10 = 12;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        b10 = 0;
                        str5 = r6;
                    }
                    str5 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b10 = 1;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b10 = 13;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b10 = 7;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b10 = 11;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b10 = 4;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b10 = 15;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b10 = 16;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b10 = 5;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b10 = 8;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 9;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b10 = 10;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b10 = 6;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b10 = 3;
                        str4 = "charAt";
                        str5 = r6;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                    break;
            }
            strMo7784f = "undefined";
            str6 = this.f14432a;
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C2601b4.m7694j(1, str4, arrayList);
                    if (arrayList.isEmpty()) {
                        iM7685a = 0;
                    } else {
                        iM7685a = (int) C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                    }
                    if (iM7685a >= 0 || iM7685a >= str6.length()) {
                        return InterfaceC2790p.f14382y;
                    }
                    c2842t = new C2842t(String.valueOf(str6.charAt(iM7685a)));
                    return c2842t;
                case 1:
                    if (!arrayList.isEmpty()) {
                        sb2 = new StringBuilder(str6);
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            sb2.append(c2684h3.m7863b((InterfaceC2790p) arrayList.get(i10)).mo7784f());
                        }
                        c2842t = new C2842t(sb2.toString());
                        return c2842t;
                    }
                    return this;
                case 2:
                    C2601b4.m7692h(1, str5, arrayList);
                    interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                    zEquals = "length".equals(interfaceC2790pM7863b.mo7784f());
                    c2842t2 = InterfaceC2790p.f14380w;
                    if (!zEquals) {
                        dDoubleValue = interfaceC2790pM7863b.mo7783e().doubleValue();
                        if (dDoubleValue == Math.floor(dDoubleValue) || (i11 = (int) dDoubleValue) < 0 || i11 >= str6.length()) {
                            return InterfaceC2790p.f14381x;
                        }
                    }
                    return c2842t2;
                case 3:
                    C2601b4.m7694j(2, "indexOf", arrayList);
                    c2842t = new C2694i(Double.valueOf(str6.indexOf(arrayList.size() > 0 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f() : "undefined", (int) C2601b4.m7685a(arrayList.size() >= 2 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue() : 0.0d))));
                    return c2842t;
                case 4:
                    C2601b4.m7694j(2, "lastIndexOf", arrayList);
                    String strMo7784f4 = arrayList.size() > 0 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f() : "undefined";
                    if (arrayList.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dM7685a = Double.POSITIVE_INFINITY;
                    } else {
                        dM7685a = C2601b4.m7685a(dDoubleValue2);
                    }
                    c2842t = new C2694i(Double.valueOf(str6.lastIndexOf(strMo7784f4, (int) dM7685a)));
                    return c2842t;
                case 5:
                    C2601b4.m7694j(1, "match", arrayList);
                    if (arrayList.size() <= 0) {
                        strMo7784f2 = "";
                    } else {
                        strMo7784f2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                    }
                    matcher = Pattern.compile(strMo7784f2).matcher(str6);
                    if (matcher.find()) {
                        return InterfaceC2790p.f14376s;
                    }
                    c2842t = new C2652f(Arrays.asList(new C2842t(matcher.group())));
                    return c2842t;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    C2601b4.m7694j(2, "replace", arrayList);
                    interfaceC2790pMo7646b = InterfaceC2790p.f14375r;
                    if (!arrayList.isEmpty()) {
                        strMo7784f = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                        if (arrayList.size() > 1) {
                            interfaceC2790pMo7646b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                        }
                    }
                    str7 = strMo7784f;
                    iIndexOf = str6.indexOf(str7);
                    if (iIndexOf >= 0) {
                        if (interfaceC2790pMo7646b instanceof AbstractC2708j) {
                            interfaceC2790pMo7646b = ((AbstractC2708j) interfaceC2790pMo7646b).mo7646b(c2684h3, Arrays.asList(new C2842t(str7), new C2694i(Double.valueOf(iIndexOf)), this));
                        }
                        c2842t = new C2842t(C0009a.m21i(str6.substring(0, iIndexOf), interfaceC2790pMo7646b.mo7784f(), str6.substring(str7.length() + iIndexOf)));
                        return c2842t;
                    }
                    return this;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    C2601b4.m7694j(1, "search", arrayList);
                    matcher2 = Pattern.compile(arrayList.isEmpty() ? "undefined" : c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f()).matcher(str6);
                    if (matcher2.find()) {
                        return new C2694i(Double.valueOf(-1.0d));
                    }
                    c2842t = new C2694i(Double.valueOf(matcher2.start()));
                    return c2842t;
                case 8:
                    C2601b4.m7694j(2, "slice", arrayList);
                    if (arrayList.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue();
                    }
                    dM7685a2 = C2601b4.m7685a(dDoubleValue3);
                    if (dM7685a2 < 0.0d) {
                        dMin = Math.max(((double) str6.length()) + dM7685a2, 0.0d);
                    } else {
                        dMin = Math.min(dM7685a2, str6.length());
                    }
                    if (arrayList.size() > 1) {
                        length = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue();
                    } else {
                        length = str6.length();
                    }
                    dM7685a3 = C2601b4.m7685a(length);
                    if (dM7685a3 < 0.0d) {
                        dMin2 = Math.max(((double) str6.length()) + dM7685a3, 0.0d);
                    } else {
                        dMin2 = Math.min(dM7685a3, str6.length());
                    }
                    int i14 = (int) dMin;
                    c2842t = new C2842t(str6.substring(i14, Math.max(0, ((int) dMin2) - i14) + i14));
                    return c2842t;
                case 9:
                    C2601b4.m7694j(2, "split", arrayList);
                    if (str6.length() == 0) {
                        return new C2652f(Arrays.asList(this));
                    }
                    arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        strMo7784f3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                        if (arrayList.size() > 1) {
                            jM7688d = C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                        } else {
                            jM7688d = 2147483647L;
                        }
                        if (jM7688d == 0) {
                            return new C2652f();
                        }
                        strArrSplit = str6.split(Pattern.quote(strMo7784f3), ((int) jM7688d) + 1);
                        length2 = strArrSplit.length;
                        if (strMo7784f3.isEmpty() || length2 <= 0) {
                            z10 = false;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i12 = length2 - 1;
                            if (!strArrSplit[i12].isEmpty()) {
                            }
                            i13 = zIsEmpty;
                            z10 = zIsEmpty;
                            if (length2 > jM7688d) {
                                i12--;
                            }
                            while (i13 < i12) {
                                arrayList2.add(new C2842t(strArrSplit[i13]));
                                i13++;
                            }
                        }
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        if (length2 > jM7688d) {
                            i12--;
                        }
                        while (i13 < i12) {
                            arrayList2.add(new C2842t(strArrSplit[i13]));
                            i13++;
                        }
                    }
                    return new C2652f(arrayList2);
                case 10:
                    C2601b4.m7694j(2, "substring", arrayList);
                    if (arrayList.isEmpty()) {
                        c2684h4 = c2684h3;
                        iM7685a2 = 0;
                    } else {
                        c2684h4 = c2684h3;
                        iM7685a2 = (int) C2601b4.m7685a(c2684h4.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                    }
                    if (arrayList.size() > 1) {
                        length3 = (int) C2601b4.m7685a(c2684h4.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                    } else {
                        length3 = str6.length();
                    }
                    int iMin = Math.min(Math.max(iM7685a2, 0), str6.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str6.length());
                    c2842t2 = new C2842t(str6.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return c2842t2;
                case 11:
                    C2601b4.m7692h(0, str2, arrayList);
                    return new C2842t(str6.toUpperCase());
                case 12:
                    C2601b4.m7692h(0, "toLocaleLowerCase", arrayList);
                    return new C2842t(str6.toLowerCase());
                case 13:
                    C2601b4.m7692h(0, "toLowerCase", arrayList);
                    return new C2842t(str6.toLowerCase(Locale.ENGLISH));
                case 14:
                    C2601b4.m7692h(0, "toString", arrayList);
                    return this;
                case 15:
                    C2601b4.m7692h(0, "toUpperCase", arrayList);
                    return new C2842t(str6.toUpperCase(Locale.ENGLISH));
                case 16:
                    C2601b4.m7692h(0, "toUpperCase", arrayList);
                    return new C2842t(str6.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r6;
                if (str.equals(str5)) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    b10 = 14;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = 12;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    b10 = 0;
                    str5 = r6;
                }
                str5 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b10 = 1;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 13;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b10 = 7;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = 11;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = 15;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b10 = 16;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 6;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 3;
                    str4 = "charAt";
                    str5 = r6;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                b10 = -1;
                break;
        }
        strMo7784f = "undefined";
        str6 = this.f14432a;
        switch (b10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2601b4.m7694j(1, str4, arrayList);
                if (arrayList.isEmpty()) {
                    iM7685a = (int) C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                } else {
                    iM7685a = 0;
                }
                if (iM7685a >= 0) {
                    break;
                }
                return InterfaceC2790p.f14382y;
            case 1:
                if (!arrayList.isEmpty()) {
                    sb2 = new StringBuilder(str6);
                    while (i10 < arrayList.size()) {
                        sb2.append(c2684h3.m7863b((InterfaceC2790p) arrayList.get(i10)).mo7784f());
                    }
                    c2842t = new C2842t(sb2.toString());
                    return c2842t;
                }
                return this;
            case 2:
                C2601b4.m7692h(1, str5, arrayList);
                interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                zEquals = "length".equals(interfaceC2790pM7863b.mo7784f());
                c2842t2 = InterfaceC2790p.f14380w;
                if (!zEquals) {
                    dDoubleValue = interfaceC2790pM7863b.mo7783e().doubleValue();
                    if (dDoubleValue == Math.floor(dDoubleValue)) {
                        break;
                    }
                    return InterfaceC2790p.f14381x;
                }
                return c2842t2;
            case 3:
                C2601b4.m7694j(2, "indexOf", arrayList);
                c2842t = new C2694i(Double.valueOf(str6.indexOf(arrayList.size() > 0 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f() : "undefined", (int) C2601b4.m7685a(arrayList.size() >= 2 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue() : 0.0d))));
                return c2842t;
            case 4:
                C2601b4.m7694j(2, "lastIndexOf", arrayList);
                String strMo7784f5 = arrayList.size() > 0 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f() : "undefined";
                if (arrayList.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dM7685a = Double.POSITIVE_INFINITY;
                } else {
                    dM7685a = C2601b4.m7685a(dDoubleValue2);
                }
                c2842t = new C2694i(Double.valueOf(str6.lastIndexOf(strMo7784f5, (int) dM7685a)));
                return c2842t;
            case 5:
                C2601b4.m7694j(1, "match", arrayList);
                if (arrayList.size() <= 0) {
                    strMo7784f2 = "";
                } else {
                    strMo7784f2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                }
                matcher = Pattern.compile(strMo7784f2).matcher(str6);
                if (matcher.find()) {
                    return InterfaceC2790p.f14376s;
                }
                c2842t = new C2652f(Arrays.asList(new C2842t(matcher.group())));
                return c2842t;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C2601b4.m7694j(2, "replace", arrayList);
                interfaceC2790pMo7646b = InterfaceC2790p.f14375r;
                if (!arrayList.isEmpty()) {
                    strMo7784f = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                    if (arrayList.size() > 1) {
                        interfaceC2790pMo7646b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                    }
                }
                str7 = strMo7784f;
                iIndexOf = str6.indexOf(str7);
                if (iIndexOf >= 0) {
                    if (interfaceC2790pMo7646b instanceof AbstractC2708j) {
                        interfaceC2790pMo7646b = ((AbstractC2708j) interfaceC2790pMo7646b).mo7646b(c2684h3, Arrays.asList(new C2842t(str7), new C2694i(Double.valueOf(iIndexOf)), this));
                    }
                    c2842t = new C2842t(C0009a.m21i(str6.substring(0, iIndexOf), interfaceC2790pMo7646b.mo7784f(), str6.substring(str7.length() + iIndexOf)));
                    return c2842t;
                }
                return this;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C2601b4.m7694j(1, "search", arrayList);
                matcher2 = Pattern.compile(arrayList.isEmpty() ? "undefined" : c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f()).matcher(str6);
                if (matcher2.find()) {
                    return new C2694i(Double.valueOf(-1.0d));
                }
                c2842t = new C2694i(Double.valueOf(matcher2.start()));
                return c2842t;
            case 8:
                C2601b4.m7694j(2, "slice", arrayList);
                if (arrayList.isEmpty()) {
                    dDoubleValue3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dM7685a2 = C2601b4.m7685a(dDoubleValue3);
                if (dM7685a2 < 0.0d) {
                    dMin = Math.max(((double) str6.length()) + dM7685a2, 0.0d);
                } else {
                    dMin = Math.min(dM7685a2, str6.length());
                }
                if (arrayList.size() > 1) {
                    length = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue();
                } else {
                    length = str6.length();
                }
                dM7685a3 = C2601b4.m7685a(length);
                if (dM7685a3 < 0.0d) {
                    dMin2 = Math.max(((double) str6.length()) + dM7685a3, 0.0d);
                } else {
                    dMin2 = Math.min(dM7685a3, str6.length());
                }
                int i15 = (int) dMin;
                c2842t = new C2842t(str6.substring(i15, Math.max(0, ((int) dMin2) - i15) + i15));
                return c2842t;
            case 9:
                C2601b4.m7694j(2, "split", arrayList);
                if (str6.length() == 0) {
                    return new C2652f(Arrays.asList(this));
                }
                arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    strMo7784f3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
                    if (arrayList.size() > 1) {
                        jM7688d = C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                    } else {
                        jM7688d = 2147483647L;
                    }
                    if (jM7688d == 0) {
                        return new C2652f();
                    }
                    strArrSplit = str6.split(Pattern.quote(strMo7784f3), ((int) jM7688d) + 1);
                    length2 = strArrSplit.length;
                    if (strMo7784f3.isEmpty()) {
                        z10 = false;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                    } else {
                        z10 = false;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                    }
                    i13 = zIsEmpty;
                    z10 = zIsEmpty;
                    if (length2 > jM7688d) {
                        i12--;
                    }
                    while (i13 < i12) {
                        arrayList2.add(new C2842t(strArrSplit[i13]));
                        i13++;
                    }
                }
                return new C2652f(arrayList2);
            case 10:
                C2601b4.m7694j(2, "substring", arrayList);
                if (arrayList.isEmpty()) {
                    c2684h4 = c2684h3;
                    iM7685a2 = (int) C2601b4.m7685a(c2684h4.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                } else {
                    c2684h4 = c2684h3;
                    iM7685a2 = 0;
                }
                if (arrayList.size() > 1) {
                    length3 = (int) C2601b4.m7685a(c2684h4.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                } else {
                    length3 = str6.length();
                }
                int iMin3 = Math.min(Math.max(iM7685a2, 0), str6.length());
                int iMin4 = Math.min(Math.max(length3, 0), str6.length());
                c2842t2 = new C2842t(str6.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                return c2842t2;
            case 11:
                C2601b4.m7692h(0, str2, arrayList);
                return new C2842t(str6.toUpperCase());
            case 12:
                C2601b4.m7692h(0, "toLocaleLowerCase", arrayList);
                return new C2842t(str6.toLowerCase());
            case 13:
                C2601b4.m7692h(0, "toLowerCase", arrayList);
                return new C2842t(str6.toLowerCase(Locale.ENGLISH));
            case 14:
                C2601b4.m7692h(0, "toString", arrayList);
                return this;
            case 15:
                C2601b4.m7692h(0, "toUpperCase", arrayList);
                return new C2842t(str6.toUpperCase(Locale.ENGLISH));
            case 16:
                C2601b4.m7692h(0, "toUpperCase", arrayList);
                return new C2842t(str6.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("\""), this.f14432a, "\"");
    }
}
