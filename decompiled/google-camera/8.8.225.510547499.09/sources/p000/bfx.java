package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfx {

    /* JADX INFO: renamed from: a */
    static final Set f3145a = new HashSet(Arrays.asList("xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3146b = 0;

    /* JADX INFO: renamed from: a */
    public static final void m2357a(bfu bfuVar, int i, bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i2, int i3) {
        boolean zBooleanValue;
        Iterator itM2341h = bfuVar.m2341h();
        while (itM2341h.hasNext()) {
            bfu bfuVar2 = (bfu) itM2341h.next();
            if (!m2365i(bfuVar2)) {
                String str = bfuVar2.f3130a;
                boolean zBooleanValue2 = true;
                if (true == "[]".equals(str)) {
                    str = "rdf:li";
                }
                String str2 = str;
                m2363g(i, outputStreamWriter, bgfVar);
                outputStreamWriter.write(60);
                outputStreamWriter.write(str2);
                Iterator itM2342i = bfuVar2.m2342i();
                boolean z = false;
                boolean z2 = false;
                boolean zEquals = false;
                while (itM2342i.hasNext()) {
                    bfu bfuVar3 = (bfu) itM2342i.next();
                    if (f3145a.contains(bfuVar3.f3130a)) {
                        zEquals = "rdf:resource".equals(bfuVar3.f3130a);
                        outputStreamWriter.write(32);
                        outputStreamWriter.write(bfuVar3.f3130a);
                        outputStreamWriter.write("=\"");
                        m2367k(bfuVar3.f3131b, true, outputStreamWriter);
                        outputStreamWriter.write(34);
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    outputStreamWriter.write(" rdf:parseType=\"Resource\">");
                    m2364h(outputStreamWriter, bgfVar);
                    int i4 = i + 1;
                    m2358b(bfuVar2, true, i4, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                    Iterator itM2342i2 = bfuVar2.m2342i();
                    while (itM2342i2.hasNext()) {
                        m2358b((bfu) itM2342i2.next(), false, i4, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                    }
                    zBooleanValue = true;
                } else {
                    boolean zM2393l = bfuVar2.m2340g().m2393l();
                    String str3 = qQLA.vfkQnapu;
                    if (!zM2393l) {
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.TRUE;
                        if (bfuVar2.m2340g().m2397p()) {
                            outputStreamWriter.write(" rdf:resource=\"");
                            m2367k(bfuVar2.f3131b, true, outputStreamWriter);
                            outputStreamWriter.write("\"/>");
                            m2364h(outputStreamWriter, bgfVar);
                            bool = Boolean.FALSE;
                        } else {
                            String str4 = bfuVar2.f3131b;
                            if (str4 == null || str4.length() == 0) {
                                outputStreamWriter.write(str3);
                                m2364h(outputStreamWriter, bgfVar);
                                bool = Boolean.FALSE;
                            } else {
                                outputStreamWriter.write(62);
                                m2367k(bfuVar2.f3131b, false, outputStreamWriter);
                                bool2 = Boolean.FALSE;
                            }
                        }
                        zBooleanValue2 = bool.booleanValue();
                        zBooleanValue = ((Boolean) new Object[]{bool, bool2}[1]).booleanValue();
                    } else if (bfuVar2.m2340g().m2389d()) {
                        outputStreamWriter.write(62);
                        m2364h(outputStreamWriter, bgfVar);
                        int i5 = i + 1;
                        m2368l(bfuVar2, true, i5, outputStreamWriter, bgfVar);
                        if (bfuVar2.m2340g().m2390i()) {
                            C0137dp.m6491G(bfuVar2);
                        }
                        m2357a(bfuVar2, i + 2, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                        m2368l(bfuVar2, false, i5, outputStreamWriter, bgfVar);
                        zBooleanValue = true;
                        zBooleanValue2 = true;
                    } else {
                        Iterator itM2341h2 = bfuVar2.m2341h();
                        boolean z3 = false;
                        boolean z4 = false;
                        while (itM2341h2.hasNext()) {
                            boolean zM2365i = m2365i((bfu) itM2341h2.next());
                            z3 |= !zM2365i;
                            z4 |= zM2365i;
                            if (z4 && z3) {
                                break;
                            }
                        }
                        if (zEquals && z3) {
                            throw new bfc("Can't mix rdf:resource qualifier and element fields", 202);
                        }
                        if (!bfuVar2.m2352s()) {
                            outputStreamWriter.write(" rdf:parseType=\"Resource\"/>");
                            m2364h(outputStreamWriter, bgfVar);
                        } else if (!z3) {
                            m2360d(bfuVar2, i + 1, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                            outputStreamWriter.write(str3);
                            m2364h(outputStreamWriter, bgfVar);
                        } else if (z4) {
                            outputStreamWriter.write(62);
                            m2364h(outputStreamWriter, bgfVar);
                            int i6 = i + 1;
                            m2363g(i6, outputStreamWriter, bgfVar);
                            outputStreamWriter.write("<rdf:Description");
                            m2360d(bfuVar2, i + 2, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                            outputStreamWriter.write(">");
                            m2364h(outputStreamWriter, bgfVar);
                            m2357a(bfuVar2, i6, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                            m2363g(i6, outputStreamWriter, bgfVar);
                            outputStreamWriter.write("</rdf:Description>");
                            m2364h(outputStreamWriter, bgfVar);
                            z = true;
                        } else {
                            outputStreamWriter.write(" rdf:parseType=\"Resource\">");
                            m2364h(outputStreamWriter, bgfVar);
                            m2357a(bfuVar2, i + 1, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                            z = true;
                        }
                        zBooleanValue2 = z;
                        zBooleanValue = true;
                    }
                }
                if (zBooleanValue2) {
                    if (zBooleanValue) {
                        m2363g(i, outputStreamWriter, bgfVar);
                    }
                    outputStreamWriter.write("</");
                    outputStreamWriter.write(str2);
                    outputStreamWriter.write(62);
                    m2364h(outputStreamWriter, bgfVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2359c(bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i, int i2) {
        outputStreamWriter.write(34);
        String str = bfrVar.f3126a.f3130a;
        if (str != null) {
            m2367k(str, true, outputStreamWriter);
        }
        outputStreamWriter.write(34);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m2360d(bfu bfuVar, int i, bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i2, int i3) throws IOException {
        Iterator itM2341h = bfuVar.m2341h();
        boolean z = true;
        while (itM2341h.hasNext()) {
            bfu bfuVar2 = (bfu) itM2341h.next();
            if (m2365i(bfuVar2)) {
                m2364h(outputStreamWriter, bgfVar);
                m2363g(i, outputStreamWriter, bgfVar);
                outputStreamWriter.write(bfuVar2.f3130a);
                outputStreamWriter.write("=\"");
                m2367k(bfuVar2.f3131b, true, outputStreamWriter);
                outputStreamWriter.write(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static final void m2361e(bfu bfuVar, Set set, bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i, int i2) {
        if (bfuVar.m2340g().m2395n()) {
            String str = bfuVar.f3131b;
            m2366j(str.substring(0, str.length() - 1), bfuVar.f3130a, set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
        } else if (bfuVar.m2340g().m2396o()) {
            Iterator itM2341h = bfuVar.m2341h();
            while (itM2341h.hasNext()) {
                m2366j(((bfu) itM2341h.next()).f3130a, null, set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
            }
        }
        Iterator itM2341h2 = bfuVar.m2341h();
        while (itM2341h2.hasNext()) {
            m2361e((bfu) itM2341h2.next(), set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
        }
        Iterator itM2342i = bfuVar.m2342i();
        while (itM2342i.hasNext()) {
            bfu bfuVar2 = (bfu) itM2342i.next();
            m2366j(bfuVar2.f3130a, null, set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
            m2361e(bfuVar2, set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m2362f(int i, OutputStreamWriter outputStreamWriter) {
        while (i > 0) {
            outputStreamWriter.write(32);
            i--;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m2363g(int i, OutputStreamWriter outputStreamWriter, bgf bgfVar) {
        while (i > 0) {
            outputStreamWriter.write(bgfVar.f3157d);
            i--;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m2364h(OutputStreamWriter outputStreamWriter, bgf bgfVar) {
        outputStreamWriter.write(bgfVar.f3156c);
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m2365i(bfu bfuVar) {
        if (bfuVar.m2353t() || bfuVar.m2340g().m2397p() || bfuVar.m2340g().m2393l()) {
            return false;
        }
        return !EArqVBjecl.MbsdKpRQ.equals(bfuVar.f3130a);
    }

    /* JADX INFO: renamed from: j */
    private static final void m2366j(String str, String str2, Set set, bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i, int i2) throws IOException {
        String strM5627d;
        String str3;
        if (str2 == null) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                str.substring(iIndexOf + 1);
                str3 = strSubstring;
            } else {
                str3 = "";
            }
            if (str3 == null || str3.length() <= 0) {
                return;
            }
            strM5627d = bff.f3083a.m5627d(str3.concat(":"));
            m2366j(str3, strM5627d, set, bfrVar, bfiVar, outputStreamWriter, bgfVar, i, i2);
        } else {
            strM5627d = str2;
            str3 = str;
        }
        if (set.contains(str3)) {
            return;
        }
        m2364h(outputStreamWriter, bgfVar);
        m2363g(4, outputStreamWriter, bgfVar);
        outputStreamWriter.write("xmlns:");
        outputStreamWriter.write(str3);
        outputStreamWriter.write("=\"");
        outputStreamWriter.write(strM5627d);
        outputStreamWriter.write(34);
        set.add(str3);
    }

    /* JADX INFO: renamed from: k */
    private static final void m2367k(String str, boolean z, OutputStreamWriter outputStreamWriter) {
        int i = bfk.f3095a;
        int i2 = 0;
        while (true) {
            if (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '<' || cCharAt == '>' || cCharAt == '&' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                if (z && cCharAt == '\"') {
                    z = true;
                    break;
                }
                i2++;
            }
            outputStreamWriter.write(str);
        }
        StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\r') {
                switch (cCharAt2) {
                    case '\"':
                        stringBuffer.append(true != z ? "\"" : "&quot;");
                        break;
                    case '&':
                        stringBuffer.append("&amp;");
                        break;
                    case '<':
                        stringBuffer.append("&lt;");
                        break;
                    case '>':
                        stringBuffer.append("&gt;");
                        break;
                    default:
                        stringBuffer.append(cCharAt2);
                        break;
                }
            } else {
                stringBuffer.append("&#x");
                stringBuffer.append(Integer.toHexString(cCharAt2).toUpperCase());
                stringBuffer.append(';');
            }
        }
        str = stringBuffer.toString();
        outputStreamWriter.write(str);
    }

    /* JADX INFO: renamed from: l */
    private static final void m2368l(bfu bfuVar, boolean z, int i, OutputStreamWriter outputStreamWriter, bgf bgfVar) {
        if (z || bfuVar.m2352s()) {
            m2363g(i, outputStreamWriter, bgfVar);
            outputStreamWriter.write(true != z ? "</rdf:" : "<rdf:");
            if (bfuVar.m2340g().m2391j()) {
                outputStreamWriter.write(IuyLAqNmW.CJy);
            } else if (bfuVar.m2340g().m2392k()) {
                outputStreamWriter.write("Seq");
            } else {
                outputStreamWriter.write("Bag");
            }
            if (!z || bfuVar.m2352s()) {
                outputStreamWriter.write(">");
            } else {
                outputStreamWriter.write("/>");
            }
            m2364h(outputStreamWriter, bgfVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2358b(bfu bfuVar, boolean z, int i, bfr bfrVar, bfi bfiVar, OutputStreamWriter outputStreamWriter, bgf bgfVar, int i2, int i3) {
        String str;
        boolean z2;
        String str2 = bfuVar.f3130a;
        if (z) {
            str = "rdf:value";
        } else {
            if ("[]".equals(str2)) {
                str2 = "rdf:li";
            }
            str = str2;
        }
        m2363g(i, outputStreamWriter, bgfVar);
        outputStreamWriter.write(60);
        outputStreamWriter.write(str);
        Iterator itM2342i = bfuVar.m2342i();
        boolean z3 = false;
        boolean z4 = false;
        boolean zEquals = false;
        while (true) {
            z2 = true;
            if (!itM2342i.hasNext()) {
                break;
            }
            bfu bfuVar2 = (bfu) itM2342i.next();
            if (f3145a.contains(bfuVar2.f3130a)) {
                zEquals = "rdf:resource".equals(bfuVar2.f3130a);
                if (!z) {
                    outputStreamWriter.write(32);
                    outputStreamWriter.write(bfuVar2.f3130a);
                    outputStreamWriter.write("=\"");
                    m2367k(bfuVar2.f3131b, true, outputStreamWriter);
                    outputStreamWriter.write(34);
                }
            } else {
                z4 = true;
            }
        }
        if (!z4 || z) {
            if (bfuVar.m2340g().m2393l()) {
                if (bfuVar.m2340g().m2389d()) {
                    outputStreamWriter.write(62);
                    m2364h(outputStreamWriter, bgfVar);
                    int i4 = i + 1;
                    m2368l(bfuVar, true, i4, outputStreamWriter, bgfVar);
                    if (bfuVar.m2340g().m2390i()) {
                        C0137dp.m6491G(bfuVar);
                    }
                    Iterator itM2341h = bfuVar.m2341h();
                    while (itM2341h.hasNext()) {
                        m2358b((bfu) itM2341h.next(), false, i + 2, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                        i4 = i4;
                    }
                    m2368l(bfuVar, false, i4, outputStreamWriter, bgfVar);
                    z3 = true;
                    z2 = true;
                } else if (zEquals) {
                    Iterator itM2341h2 = bfuVar.m2341h();
                    while (itM2341h2.hasNext()) {
                        bfu bfuVar3 = (bfu) itM2341h2.next();
                        if (!m2365i(bfuVar3)) {
                            throw new bfc("Can't mix rdf:resource and complex fields", 202);
                        }
                        m2364h(outputStreamWriter, bgfVar);
                        m2363g(i + 1, outputStreamWriter, bgfVar);
                        outputStreamWriter.write(32);
                        outputStreamWriter.write(bfuVar3.f3130a);
                        outputStreamWriter.write("=\"");
                        m2367k(bfuVar3.f3131b, true, outputStreamWriter);
                        outputStreamWriter.write(34);
                    }
                    outputStreamWriter.write("/>");
                    m2364h(outputStreamWriter, bgfVar);
                    z2 = true;
                } else if (bfuVar.m2352s()) {
                    outputStreamWriter.write(" rdf:parseType=\"Resource\">");
                    m2364h(outputStreamWriter, bgfVar);
                    Iterator itM2341h3 = bfuVar.m2341h();
                    while (itM2341h3.hasNext()) {
                        m2358b((bfu) itM2341h3.next(), false, i + 1, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                    }
                    z3 = true;
                    z2 = true;
                } else {
                    outputStreamWriter.write(" rdf:parseType=\"Resource\"/>");
                    m2364h(outputStreamWriter, bgfVar);
                    z2 = true;
                }
            } else if (bfuVar.m2340g().m2397p()) {
                outputStreamWriter.write(" rdf:resource=\"");
                m2367k(bfuVar.f3131b, true, outputStreamWriter);
                outputStreamWriter.write("\"/>");
                m2364h(outputStreamWriter, bgfVar);
            } else {
                String str3 = bfuVar.f3131b;
                if (str3 == null || "".equals(str3)) {
                    outputStreamWriter.write("/>");
                    m2364h(outputStreamWriter, bgfVar);
                } else {
                    outputStreamWriter.write(62);
                    m2367k(bfuVar.f3131b, false, outputStreamWriter);
                    z3 = true;
                    z2 = false;
                }
            }
        } else {
            if (zEquals) {
                throw new bfc(hsSUWRJfoeC.PuAM, 202);
            }
            outputStreamWriter.write(" rdf:parseType=\"Resource\">");
            m2364h(outputStreamWriter, bgfVar);
            int i5 = i + 1;
            m2358b(bfuVar, true, i5, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
            Iterator itM2342i2 = bfuVar.m2342i();
            while (itM2342i2.hasNext()) {
                bfu bfuVar4 = (bfu) itM2342i2.next();
                if (!f3145a.contains(bfuVar4.f3130a)) {
                    m2358b(bfuVar4, false, i5, bfrVar, bfiVar, outputStreamWriter, bgfVar, i2, i3);
                }
            }
            z3 = true;
        }
        if (z3) {
            if (z2) {
                m2363g(i, outputStreamWriter, bgfVar);
            }
            outputStreamWriter.write("</");
            outputStreamWriter.write(str);
            outputStreamWriter.write(62);
            m2364h(outputStreamWriter, bgfVar);
        }
    }
}
