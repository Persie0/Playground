package p000;

import java.util.GregorianCalendar;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfr implements bfd {

    /* JADX INFO: renamed from: a */
    public final bfu f3126a;

    public bfr() {
        this.f3126a = new bfu(null, null, null);
    }

    public bfr(bfu bfuVar) {
        this.f3126a = bfuVar;
    }

    /* JADX INFO: renamed from: m */
    static final void m2322m(bfu bfuVar, Object obj, bge bgeVar) throws bfc {
        String string;
        int length;
        bfuVar.m2340g().m2387b(bgeVar);
        if (bfuVar.m2340g().m2393l()) {
            if (obj != null && obj.toString().length() > 0) {
                throw new bfc("Composite nodes can't have values", 102);
            }
            bfuVar.m2349p();
            return;
        }
        String string2 = null;
        if (obj == null) {
            string = null;
        } else if (obj instanceof Boolean) {
            string = true != ((Boolean) obj).booleanValue() ? "False" : "True";
        } else if (obj instanceof Integer) {
            string = String.valueOf(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            string = String.valueOf(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            string = String.valueOf(((Double) obj).doubleValue());
        } else if (obj instanceof bfl) {
            string = C0167es.m7754e((bfl) obj);
        } else if (obj instanceof GregorianCalendar) {
            string = C0167es.m7754e(new bfl((GregorianCalendar) obj));
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length2 = bArr.length;
            byte[] bArr2 = bfg.f3085a;
            byte[] bArr3 = new byte[((length2 + 2) / 3) * 4];
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i + 3;
                length = bArr.length;
                if (i3 > length) {
                    break;
                }
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                int i8 = i2 + 1;
                byte[] bArr4 = bfg.f3085a;
                bArr3[i2] = bArr4[i7 >> 18];
                int i9 = i8 + 1;
                bArr3[i8] = bArr4[(i7 >> 12) & 63];
                int i10 = i9 + 1;
                bArr3[i9] = bArr4[(i7 & 4032) >> 6];
                i2 = i10 + 1;
                bArr3[i10] = bArr4[i7 & 63];
                i = i6;
            }
            int i11 = length - i;
            if (i11 == 2) {
                int i12 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                int i13 = i2 + 1;
                byte[] bArr5 = bfg.f3085a;
                bArr3[i2] = bArr5[i12 >> 18];
                int i14 = i13 + 1;
                bArr3[i13] = bArr5[(i12 >> 12) & 63];
                bArr3[i14] = bArr5[(i12 & 4032) >> 6];
                bArr3[i14 + 1] = 61;
            } else if (i11 == 1) {
                int i15 = (bArr[i] & 255) << 16;
                int i16 = i2 + 1;
                byte[] bArr6 = bfg.f3085a;
                bArr3[i2] = bArr6[i15 >> 18];
                int i17 = i16 + 1;
                bArr3[i16] = bArr6[(i15 >> 12) & 63];
                bArr3[i17] = 61;
                bArr3[i17 + 1] = 61;
            }
            string = new String(bArr3);
        } else {
            string = obj.toString();
        }
        if (string != null) {
            StringBuffer stringBuffer = new StringBuffer(string);
            for (int i18 = 0; i18 < stringBuffer.length(); i18++) {
                if (bfk.m2310b(stringBuffer.charAt(i18))) {
                    stringBuffer.setCharAt(i18, ' ');
                }
            }
            string2 = stringBuffer.toString();
        }
        if (bfuVar.m2340g().m2394m() && "xml:lang".equals(bfuVar.f3130a)) {
            bfuVar.f3131b = bfk.m2309a(string2);
        } else {
            bfuVar.f3131b = string2;
        }
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: a */
    public final bgg mo2290a(String str, String str2) throws bfc {
        C0168et.m7842k(str);
        C0168et.m7841j(str2);
        bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, C0137dp.m6526w(str, str2), false, null);
        if (bfuVarM6485A != null) {
            return new bfq(m2323n(0, bfuVarM6485A));
        }
        return null;
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: b */
    public final Integer mo2291b(String str, String str2) {
        return (Integer) m2324l(str, str2, 2);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: c */
    public final void mo2292c(String str, String str2, Object obj) throws bfc {
        mo2293d(str, str2, obj, null);
    }

    public final Object clone() {
        return new bfr((bfu) this.f3126a.clone());
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: d */
    public final void mo2293d(String str, String str2, Object obj, bge bgeVar) throws bfc {
        C0168et.m7842k(str);
        C0168et.m7841j(str2);
        bge bgeVarM6488D = C0137dp.m6488D(bgeVar, obj);
        bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, C0137dp.m6526w(str, str2), true, bgeVarM6488D);
        if (bfuVarM6485A == null) {
            throw new bfc("Specified property does not exist", 102);
        }
        m2322m(bfuVarM6485A, obj, bgeVarM6488D);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: e */
    public final boolean mo2294e(String str, String str2) {
        try {
            C0168et.m7842k(str);
            C0168et.m7841j(str2);
            return C0137dp.m6485A(this.f3126a, C0137dp.m6526w(str, str2), false, null) != null;
        } catch (bfc e) {
            return false;
        }
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: f */
    public final bfp mo2295f() {
        return new bfp(this);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: g */
    public final void mo2296g(String str, bge bgeVar, String str2, bge bgeVar2) throws bfc {
        C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
        C0168et.m7839h(str);
        if ((bgeVar.f3154a & (-7681)) != 0) {
            throw new bfc("Only array form flags allowed for arrayOptions", 103);
        }
        bge bgeVarM6488D = C0137dp.m6488D(bgeVar, null);
        bfy bfyVarM6526w = C0137dp.m6526w("http://ns.google.com/photos/1.0/camera/", str);
        bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, bfyVarM6526w, false, null);
        if (bfuVarM6485A != null) {
            if (!bfuVarM6485A.m2340g().m2389d()) {
                throw new bfc("The named property is not an array", 102);
            }
        } else {
            if (!bgeVarM6488D.m2389d()) {
                throw new bfc("Explicit arrayOptions required to create new array", 103);
            }
            bfuVarM6485A = C0137dp.m6485A(this.f3126a, bfyVarM6526w, true, bgeVarM6488D);
            if (bfuVarM6485A == null) {
                throw new bfc("Failure creating array node", 102);
            }
        }
        bfu bfuVar = new bfu("[]", null);
        bge bgeVarM6488D2 = C0137dp.m6488D(bgeVar2, str2);
        int iM2334a = bfuVarM6485A.m2334a() + 1;
        if (iM2334a <= 0) {
            throw new bfc("Array index out of bounds", 104);
        }
        bfuVarM6485A.m2345l(iM2334a, bfuVar);
        m2322m(bfuVar, str2, bgeVarM6488D2);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: h */
    public final void mo2297h() {
        try {
            C0168et.m7842k("http://ns.adobe.com/xmp/note/");
            C0168et.m7841j("HasExtendedXMP");
            bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, C0137dp.m6526w("http://ns.adobe.com/xmp/note/", "HasExtendedXMP"), false, null);
            if (bfuVarM6485A != null) {
                C0137dp.m6490F(bfuVarM6485A);
            }
        } catch (bfc e) {
        }
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: i */
    public final void mo2298i(String str) throws bfc {
        bfu bfuVar;
        boolean z;
        Object[] objArr;
        C0168et.m7842k("http://purl.org/dc/elements/1.1/");
        C0168et.m7839h("rights");
        String strM2309a = bfk.m2309a("");
        String strM2309a2 = bfk.m2309a("x-default");
        bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, C0137dp.m6526w("http://purl.org/dc/elements/1.1/", "rights"), true, new bge(7680));
        if (bfuVarM6485A == null) {
            throw new bfc("Failed to find or create array node", 102);
        }
        if (!bfuVarM6485A.m2340g().m2390i()) {
            if (bfuVarM6485A.m2352s() || !bfuVarM6485A.m2340g().m2391j()) {
                throw new bfc("Specified property is no alt-text array", 102);
            }
            bfuVarM6485A.m2340g().m2399r();
        }
        Iterator itM2341h = bfuVarM6485A.m2341h();
        while (true) {
            if (!itM2341h.hasNext()) {
                bfuVar = null;
                z = false;
                break;
            }
            bfuVar = (bfu) itM2341h.next();
            if (!bfuVar.m2353t() || !"xml:lang".equals(bfuVar.m2339f(1).f3130a)) {
                throw new bfc("Language qualifier must be first", 102);
            }
            if ("x-default".equals(bfuVar.m2339f(1).f3131b)) {
                z = true;
                break;
            }
        }
        if (bfuVar != null && bfuVarM6485A.m2334a() > 1) {
            bfuVarM6485A.m2348o(bfuVar);
            bfuVarM6485A.m2345l(1, bfuVar);
        }
        if (!bfuVarM6485A.m2340g().m2390i()) {
            throw new bfc("Localized text array is not alt-text", 102);
        }
        if (bfuVarM6485A.m2352s()) {
            Iterator itM2341h2 = bfuVarM6485A.m2341h();
            bfu bfuVar2 = null;
            bfu bfuVar3 = null;
            int i = 0;
            while (true) {
                if (!itM2341h2.hasNext()) {
                    if (i != 1) {
                        if (i <= 1) {
                            if (bfuVar3 != null) {
                                objArr = new Object[]{new Integer(4), bfuVar3};
                                break;
                            } else {
                                objArr = new Object[]{new Integer(5), bfuVarM6485A.m2338e(1)};
                                break;
                            }
                        }
                        objArr = new Object[]{new Integer(3), bfuVar2};
                        break;
                    }
                    objArr = new Object[]{new Integer(2), bfuVar2};
                    break;
                }
                bfu bfuVar4 = (bfu) itM2341h2.next();
                if (bfuVar4.m2340g().m2393l()) {
                    throw new bfc("Alt-text array item is not simple", 102);
                }
                if (!bfuVar4.m2353t() || !"xml:lang".equals(bfuVar4.m2339f(1).f3130a)) {
                    throw new bfc("Alt-text array item has no language qualifier", 102);
                }
                String str2 = bfuVar4.m2339f(1).f3131b;
                if (strM2309a2.equals(str2)) {
                    objArr = new Object[]{new Integer(1), bfuVar4};
                    break;
                } else if (strM2309a != null && str2.startsWith(strM2309a)) {
                    if (bfuVar2 == null) {
                        bfuVar2 = bfuVar4;
                    }
                    i++;
                } else if ("x-default".equals(str2)) {
                    bfuVar3 = bfuVar4;
                }
            }
        } else {
            objArr = new Object[]{new Integer(0), null};
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        bfu bfuVar5 = (bfu) objArr[1];
        boolean zEquals = "x-default".equals(strM2309a2);
        switch (iIntValue) {
            case 0:
                C0137dp.m6489E(bfuVarM6485A, "x-default", str);
                if (zEquals) {
                    return;
                }
                C0137dp.m6489E(bfuVarM6485A, strM2309a2, str);
                return;
            case 1:
                if (!zEquals) {
                    if (z && bfuVar != bfuVar5 && bfuVar != null && bfuVar.f3131b.equals(bfuVar5.f3131b)) {
                        bfuVar.f3131b = str;
                    }
                    bfuVar5.f3131b = str;
                } else {
                    Iterator itM2341h3 = bfuVarM6485A.m2341h();
                    while (itM2341h3.hasNext()) {
                        bfu bfuVar6 = (bfu) itM2341h3.next();
                        if (bfuVar6 != bfuVar) {
                            if (bfuVar6.f3131b.equals(bfuVar != null ? bfuVar.f3131b : null)) {
                                bfuVar6.f3131b = str;
                            }
                        }
                    }
                    if (bfuVar != null) {
                        bfuVar.f3131b = str;
                    }
                }
                break;
            case 2:
                if (z && bfuVar != bfuVar5 && bfuVar != null && bfuVar.f3131b.equals(bfuVar5.f3131b)) {
                    bfuVar.f3131b = str;
                }
                bfuVar5.f3131b = str;
                break;
            case 3:
                C0137dp.m6489E(bfuVarM6485A, strM2309a2, str);
                if (zEquals) {
                    return;
                }
                break;
            case 4:
                if (bfuVar != null && bfuVarM6485A.m2334a() == 1) {
                    bfuVar.f3131b = str;
                }
                C0137dp.m6489E(bfuVarM6485A, strM2309a2, str);
                break;
            case 5:
                C0137dp.m6489E(bfuVarM6485A, strM2309a2, str);
                if (zEquals) {
                    return;
                }
                break;
            default:
                throw new bfc("Unexpected result from ChooseLocalizedText", 9);
        }
        if (z || bfuVarM6485A.m2334a() != 1) {
            return;
        }
        C0137dp.m6489E(bfuVarM6485A, "x-default", str);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: j */
    public final void mo2299j(String str, boolean z) throws bfc {
        mo2293d("http://ns.google.com/photos/1.0/panorama/", str, true != z ? "False" : "True", null);
    }

    @Override // p000.bfd
    /* JADX INFO: renamed from: k */
    public final void mo2300k(String str, int i) throws bfc {
        mo2293d("http://ns.google.com/photos/1.0/panorama/", str, new Integer(i), null);
    }

    /* JADX INFO: renamed from: l */
    public final Object m2324l(String str, String str2, int i) throws bfc {
        C0168et.m7842k(str);
        C0168et.m7841j(str2);
        bfu bfuVarM6485A = C0137dp.m6485A(this.f3126a, C0137dp.m6526w(str, str2), false, null);
        if (bfuVarM6485A == null) {
            return null;
        }
        if (i == 0 || !bfuVarM6485A.m2340g().m2393l()) {
            return m2323n(i, bfuVarM6485A);
        }
        throw new bfc("Property must be simple when a value type is requested", 102);
    }

    /* JADX INFO: renamed from: n */
    private static final Object m2323n(int i, bfu bfuVar) throws bfc {
        String str = bfuVar.f3131b;
        switch (i) {
            case 1:
                if (str == null || str.length() == 0) {
                    throw new bfc("Empty convert-string", 5);
                }
                String lowerCase = str.toLowerCase();
                boolean z = false;
                try {
                    if (Integer.parseInt(lowerCase) != 0) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                    if ("true".equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase)) {
                        z = true;
                    }
                }
                return new Boolean(z);
            case 2:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Integer(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
                        }
                    } catch (NumberFormatException e2) {
                        throw new bfc("Invalid integer string", 5);
                    }
                }
                throw new bfc("Empty convert-string", 5);
            case 3:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Long(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
                        }
                    } catch (NumberFormatException e3) {
                        throw new bfc("Invalid long string", 5);
                    }
                }
                throw new bfc("Empty convert-string", 5);
            case 4:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Double(Double.parseDouble(str));
                        }
                    } catch (NumberFormatException e4) {
                        throw new bfc("Invalid double string", 5);
                    }
                }
                throw new bfc("Empty convert-string", 5);
            case 5:
                return C0167es.m7755f(str);
            case 6:
                return C0167es.m7755f(str).m2315a();
            default:
                return (str != null || bfuVar.m2340g().m2393l()) ? str : "";
        }
    }
}
