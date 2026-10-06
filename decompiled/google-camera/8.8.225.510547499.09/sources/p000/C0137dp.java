package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: dp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0137dp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX INFO: renamed from: A */
    public static bfu m6485A(bfu bfuVar, bfy bfyVar, boolean z, bge bgeVar) {
        bfu bfuVar2;
        int iM2334a;
        if (bfyVar.m2369a() == 0) {
            throw new bfc("Empty XMPPath", 102);
        }
        bfu bfuVarM6486B = m6486B(bfuVar, bfyVar.m2370b(0).f3148a, z);
        bge bgeVar2 = null;
        if (bfuVarM6486B == null) {
            return null;
        }
        if (bfuVarM6486B.f3135f) {
            bfuVarM6486B.f3135f = false;
            bfuVar2 = bfuVarM6486B;
        } else {
            bfuVar2 = null;
        }
        ?? r8 = 1;
        int i = 1;
        while (i < bfyVar.m2369a()) {
            try {
                bfz bfzVarM2370b = bfyVar.m2370b(i);
                int i2 = bfzVarM2370b.f3149b;
                if (i2 == r8) {
                    bfuVarM6486B = m6529z(bfuVarM6486B, bfzVarM2370b.f3148a, z);
                } else if (i2 == 2) {
                    String strSubstring = bfzVarM2370b.f3148a.substring(r8);
                    bfu bfuVarM2337d = bfuVarM6486B.m2337d(strSubstring);
                    if (bfuVarM2337d == null && z) {
                        bfu bfuVar3 = new bfu(strSubstring, bgeVar2);
                        bfuVar3.f3135f = r8;
                        bfuVarM6486B.m2346m(bfuVar3);
                        bfuVarM6486B = bfuVar3;
                    } else {
                        bfuVarM6486B = bfuVarM2337d;
                    }
                } else {
                    if (!bfuVarM6486B.m2340g().m2389d()) {
                        throw new bfc("Indexing applied to non-array", 102);
                    }
                    if (i2 == 3) {
                        String str = bfzVarM2370b.f3148a;
                        try {
                            iM2334a = Integer.parseInt(str.substring(r8, str.length() - 1));
                            if (iM2334a <= 0) {
                                throw new bfc("Array index must be larger than zero", 102);
                            }
                            if (z && iM2334a == bfuVarM6486B.m2334a() + r8) {
                                bfu bfuVar4 = new bfu("[]", bgeVar2);
                                bfuVar4.f3135f = r8;
                                bfuVarM6486B.m2344k(bfuVar4);
                            }
                        } catch (NumberFormatException e) {
                            throw new bfc("Array index not digits.", 102);
                        }
                    } else if (i2 == 4) {
                        iM2334a = bfuVarM6486B.m2334a();
                    } else if (i2 == 6) {
                        String[] strArrM2314f = bfk.m2314f(bfzVarM2370b.f3148a);
                        String str2 = strArrM2314f[0];
                        String str3 = strArrM2314f[r8];
                        int i3 = -1;
                        for (int i4 = 1; i4 <= bfuVarM6486B.m2334a() && i3 < 0; i4++) {
                            bfu bfuVarM2338e = bfuVarM6486B.m2338e(i4);
                            if (!bfuVarM2338e.m2340g().m2396o()) {
                                throw new bfc("Field selector must be used on array of struct", 102);
                            }
                            for (int i5 = 1; i5 <= bfuVarM2338e.m2334a(); i5++) {
                                bfu bfuVarM2338e2 = bfuVarM2338e.m2338e(i5);
                                if (str2.equals(bfuVarM2338e2.f3130a) && str3.equals(bfuVarM2338e2.f3131b)) {
                                    i3 = i4;
                                    break;
                                }
                            }
                        }
                        iM2334a = i3;
                    } else {
                        if (i2 != 5) {
                            throw new bfc("Unknown array indexing step in FollowXPathStep", 9);
                        }
                        String[] strArrM2314f2 = bfk.m2314f(bfzVarM2370b.f3148a);
                        String str4 = strArrM2314f2[0];
                        String str5 = strArrM2314f2[1];
                        int i6 = bfzVarM2370b.f3151d;
                        if (!"xml:lang".equals(str4)) {
                            iM2334a = 1;
                            while (true) {
                                if (iM2334a >= bfuVarM6486B.m2334a()) {
                                    iM2334a = -1;
                                    break;
                                }
                                Iterator itM2342i = bfuVarM6486B.m2338e(iM2334a).m2342i();
                                while (itM2342i.hasNext()) {
                                    bfu bfuVar5 = (bfu) itM2342i.next();
                                    if (str4.equals(bfuVar5.f3130a) && str5.equals(bfuVar5.f3131b)) {
                                        break;
                                    }
                                }
                                iM2334a++;
                            }
                        } else {
                            int iM6528y = m6528y(bfuVarM6486B, bfk.m2309a(str5));
                            if (iM6528y >= 0 || (i6 & 4096) <= 0) {
                                iM2334a = iM6528y;
                            } else {
                                bfu bfuVar6 = new bfu("[]", null);
                                bfuVar6.m2346m(new bfu("xml:lang", "x-default", null));
                                bfuVarM6486B.m2345l(1, bfuVar6);
                                iM2334a = 1;
                            }
                        }
                    }
                    bfuVarM6486B = (iM2334a <= 0 || iM2334a > bfuVarM6486B.m2334a()) ? null : bfuVarM6486B.m2338e(iM2334a);
                }
                if (bfuVarM6486B == null) {
                    if (!z) {
                        return null;
                    }
                    m6490F(bfuVar2);
                    return null;
                }
                bgeVar2 = null;
                if (bfuVarM6486B.f3135f) {
                    bfuVarM6486B.f3135f = false;
                    if (i != 1) {
                        if (i < bfyVar.m2369a() - 1 && bfyVar.m2370b(i).f3149b == 1 && !bfuVarM6486B.m2340g().m2393l()) {
                            bfuVarM6486B.m2340g().m2405x(true);
                        }
                    } else if (!bfyVar.m2370b(1).f3150c || bfyVar.m2370b(1).f3151d == 0) {
                        i = 1;
                        if (i < bfyVar.m2369a() - 1) {
                            bfuVarM6486B.m2340g().m2405x(true);
                        }
                    } else {
                        bfuVarM6486B.m2340g().m2382f(bfyVar.m2370b(1).f3151d, true);
                        i = 1;
                    }
                    if (bfuVar2 == null) {
                        bfuVar2 = bfuVarM6486B;
                    }
                }
                r8 = 1;
                i++;
            } catch (bfc e2) {
                if (bfuVar2 != null) {
                    m6490F(bfuVar2);
                }
                throw e2;
            }
        }
        if (bfuVar2 != null) {
            bfuVarM6486B.m2340g().m2387b(bgeVar);
            bfuVarM6486B.f3134e = bfuVarM6486B.m2340g();
        }
        return bfuVarM6486B;
    }

    /* JADX INFO: renamed from: B */
    public static bfu m6486B(bfu bfuVar, String str, boolean z) {
        return m6487C(bfuVar, str, null, z);
    }

    /* JADX INFO: renamed from: C */
    public static bfu m6487C(bfu bfuVar, String str, String str2, boolean z) throws bfc {
        bfu bfuVarM2336c = bfuVar.m2336c(str);
        if (bfuVarM2336c == null && z) {
            bge bgeVar = new bge();
            bgeVar.m2382f(Integer.MIN_VALUE, true);
            bfuVarM2336c = new bfu(str, bgeVar);
            bfuVarM2336c.f3135f = true;
            String strM5626c = bff.f3083a.m5626c(str);
            if (strM5626c == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new bfc("Unregistered schema namespace URI", 101);
                }
                strM5626c = bff.f3083a.m5628e(str, str2);
            }
            bfuVarM2336c.f3131b = strM5626c;
            bfuVar.m2344k(bfuVarM2336c);
        }
        return bfuVarM2336c;
    }

    /* JADX INFO: renamed from: D */
    public static bge m6488D(bge bgeVar, Object obj) throws bfc {
        if (bgeVar == null) {
            bgeVar = new bge();
        }
        if (bgeVar.m2390i()) {
            bgeVar.m2400s();
        }
        if (bgeVar.m2391j()) {
            bgeVar.m2401t();
        }
        if (bgeVar.m2392k()) {
            bgeVar.m2398q();
        }
        if (bgeVar.m2393l() && obj != null && obj.toString().length() > 0) {
            throw new bfc("Structs and arrays can't have values", 103);
        }
        bgeVar.mo2381e(bgeVar.f3154a);
        return bgeVar;
    }

    /* JADX INFO: renamed from: E */
    public static void m6489E(bfu bfuVar, String str, String str2) throws bfc {
        bfu bfuVar2 = new bfu(CswIK.yOAGy, str2, null);
        bfu bfuVar3 = new bfu("xml:lang", str, null);
        bfuVar2.m2346m(bfuVar3);
        if (HEePJw.jtVECyjnWabuo.equals(bfuVar3.f3131b)) {
            bfuVar.m2345l(1, bfuVar2);
        } else {
            bfuVar.m2344k(bfuVar2);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m6490F(bfu bfuVar) {
        bfu bfuVar2 = bfuVar.f3132c;
        if (bfuVar.m2340g().m2394m()) {
            bfuVar2.m2350q(bfuVar);
        } else {
            bfuVar2.m2348o(bfuVar);
        }
        if (bfuVar2.m2352s() || !bfuVar2.m2340g().m2395n()) {
            return;
        }
        bfuVar2.f3132c.m2348o(bfuVar2);
    }

    /* JADX INFO: renamed from: G */
    public static void m6491G(bfu bfuVar) {
        if (bfuVar.m2340g().m2390i()) {
            for (int i = 2; i <= bfuVar.m2334a(); i++) {
                bfu bfuVarM2338e = bfuVar.m2338e(i);
                if (bfuVarM2338e.m2353t() && "x-default".equals(bfuVarM2338e.m2339f(1).f3131b)) {
                    try {
                        bfuVar.m2343j().remove(i - 1);
                        bfuVar.m2347n();
                        bfuVar.m2345l(1, bfuVarM2338e);
                    } catch (bfc e) {
                    }
                    if (i == 2) {
                        bfuVar.m2338e(2).f3131b = bfuVarM2338e.f3131b;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m6492H(bfr bfrVar, bfu bfuVar, Node node, boolean z) throws bfc {
        int iM6497M = m6497M(node);
        if (iM6497M != 8 && iM6497M != 0) {
            throw new bfc("Node element must be rdf:Description or typed node", 202);
        }
        if (z && iM6497M == 0) {
            throw new bfc("Top level typed node not allowed", 203);
        }
        char c = 0;
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                int iM6497M2 = m6497M(nodeItem);
                switch (iM6497M2) {
                    case 0:
                        m6498N(bfrVar, bfuVar, nodeItem, nodeItem.getNodeValue(), z);
                        break;
                    case 1:
                    case 4:
                    case 5:
                    default:
                        throw new bfc("Invalid nodeElement attribute", 202);
                    case 2:
                    case 3:
                    case 6:
                        if (c > 0) {
                            throw new bfc("Mutally exclusive about, ID, nodeID attributes", 202);
                        }
                        c = 1;
                        if (z && iM6497M2 == 3) {
                            String str = bfuVar.f3130a;
                            if (str != null && str.length() > 0) {
                                if (!str.equals(nodeItem.getNodeValue())) {
                                    throw new bfc("Mismatched top level rdf:about values", 203);
                                }
                            } else {
                                bfuVar.f3130a = nodeItem.getNodeValue();
                            }
                        }
                        break;
                        break;
                }
            }
        }
        m6502R(bfrVar, bfuVar, node, z);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m6493I(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    private static String m6494J(String str, String str2) throws bfc {
        if (str.length() == 0) {
            throw new bfc("Schema namespace URI is required", 101);
        }
        if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new bfc("Top level name must not be a qualifier", 102);
        }
        if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new bfc("Top level name must be simple", 102);
        }
        String strM5626c = bff.f3083a.m5626c(str);
        if (strM5626c == null) {
            throw new bfc(BEeWZPor.tleiVe, 101);
        }
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf < 0) {
            m6496L(str2);
            return strM5626c.concat(String.valueOf(str2));
        }
        m6496L(str2.substring(0, iIndexOf));
        m6496L(str2.substring(iIndexOf));
        String strSubstring = str2.substring(0, iIndexOf + 1);
        String strM5626c2 = bff.f3083a.m5626c(str);
        if (strM5626c2 == null) {
            throw new bfc("Unknown schema namespace prefix", 101);
        }
        if (strSubstring.equals(strM5626c2)) {
            return str2;
        }
        throw new bfc(WIxTIdUIdfb.sUYN, 101);
    }

    /* JADX INFO: renamed from: K */
    private static void m6495K(String str) throws bfc {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            if (bfk.m2313e(strSubstring)) {
                if (bff.f3083a.m5627d(strSubstring) == null) {
                    throw new bfc("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new bfc("Ill-formed qualified name", 102);
    }

    /* JADX INFO: renamed from: L */
    private static void m6496L(String str) throws bfc {
        int i = bfk.f3095a;
        if (str.length() <= 0 || bfk.m2312d(str.charAt(0))) {
            for (int i2 = 1; i2 < str.length(); i2++) {
                if (bfk.m2311c(str.charAt(i2))) {
                }
            }
            return;
        }
        throw new bfc("Bad XML name", 102);
    }

    /* JADX INFO: renamed from: M */
    private static int m6497M(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        String str = gBCSQzBeB.gItxpw;
        if (namespaceURI == null && ((str.equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if (str.equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return HEePJw.FNemJlHKY.equals(localName) ? 12 : 0;
    }

    /* JADX INFO: renamed from: N */
    private static bfu m6498N(bfr bfrVar, bfu bfuVar, Node node, String str, boolean z) throws bfc {
        cvy cvyVar = bff.f3083a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null) {
            throw new bfc("XML namespace required for all elements and attributes", 202);
        }
        if (true == "http://purl.org/dc/1.1/".equals(namespaceURI)) {
            namespaceURI = "http://purl.org/dc/elements/1.1/";
        }
        String strM5626c = cvyVar.m5626c(namespaceURI);
        if (strM5626c == null) {
            strM5626c = cvyVar.m5628e(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
        }
        String strValueOf = String.valueOf(node.getLocalName());
        bge bgeVar = new bge();
        String strConcat = strM5626c.concat(strValueOf);
        boolean z2 = false;
        if (z) {
            bfuVar = m6487C(bfrVar.f3126a, namespaceURI, "_dflt", true);
            bfuVar.f3135f = false;
            if (cvyVar.m5630g(strConcat) != null) {
                bfrVar.f3126a.f3136g = true;
                bfuVar.f3136g = true;
                z2 = true;
            }
        }
        boolean zEquals = "rdf:li".equals(strConcat);
        boolean zEquals2 = "rdf:value".equals(strConcat);
        bfu bfuVar2 = new bfu(strConcat, str, bgeVar);
        bfuVar2.f3137h = z2;
        if (zEquals2) {
            bfuVar.m2345l(1, bfuVar2);
            if (z || !bfuVar.m2340g().m2396o()) {
                throw new bfc("Misplaced rdf:value element", 202);
            }
            bfuVar.f3138i = true;
        } else {
            bfuVar.m2344k(bfuVar2);
        }
        if (zEquals) {
            if (!bfuVar.m2340g().m2389d()) {
                throw new bfc("Misplaced rdf:li element", 202);
            }
            bfuVar2.f3130a = "[]";
        }
        return bfuVar2;
    }

    /* JADX INFO: renamed from: O */
    private static void m6499O(bfu bfuVar) throws bfc {
        bfu bfuVarM2338e = bfuVar.m2338e(1);
        if (bfuVarM2338e.m2340g().m2388c()) {
            if (bfuVar.m2340g().m2388c()) {
                throw new bfc("Redundant xml:lang for rdf:value element", 203);
            }
            bfu bfuVarM2339f = bfuVarM2338e.m2339f(1);
            bfuVarM2338e.m2350q(bfuVarM2339f);
            bfuVar.m2346m(bfuVarM2339f);
        }
        for (int i = 1; i <= bfuVarM2338e.m2335b(); i++) {
            bfuVar.m2346m(bfuVarM2338e.m2339f(i));
        }
        for (int i2 = 2; i2 <= bfuVar.m2334a(); i2++) {
            bfuVar.m2346m(bfuVar.m2338e(i2));
        }
        bfuVar.f3138i = false;
        bfuVar.m2340g().m2405x(false);
        bfuVar.m2340g().m2387b(bfuVarM2338e.m2340g());
        bfuVar.f3131b = bfuVarM2338e.f3131b;
        bfuVar.m2349p();
        Iterator itM2341h = bfuVarM2338e.m2341h();
        while (itM2341h.hasNext()) {
            bfuVar.m2344k((bfu) itM2341h.next());
        }
    }

    /* JADX INFO: renamed from: P */
    private static void m6500P(bfr bfrVar, bfu bfuVar, Node node, boolean z) throws bfc {
        if (node.hasChildNodes()) {
            throw new bfc("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Node node2 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = true;
            if (i >= node.getAttributes().getLength()) {
                String nodeValue = qQLA.LNTSubJyF;
                bfu bfuVarM6498N = m6498N(bfrVar, bfuVar, node, nodeValue, z);
                if (z2 || z3) {
                    if (node2 != null) {
                        nodeValue = node2.getNodeValue();
                    }
                    bfuVarM6498N.f3131b = nodeValue;
                    if (z2) {
                        z6 = false;
                    } else {
                        bfuVarM6498N.m2340g().m2382f(2, true);
                        z6 = false;
                    }
                } else if (z4) {
                    bfuVarM6498N.m2340g().m2405x(true);
                } else {
                    z6 = false;
                }
                for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
                    Node nodeItem = node.getAttributes().item(i2);
                    if (nodeItem != node2 && !"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                        switch (m6497M(nodeItem)) {
                            case 0:
                                if (!z6) {
                                    m6503S(bfuVarM6498N, nodeItem.getNodeName(), nodeItem.getNodeValue());
                                } else if ("xml:lang".equals(nodeItem.getNodeName())) {
                                    m6503S(bfuVarM6498N, "xml:lang", nodeItem.getNodeValue());
                                } else {
                                    m6498N(bfrVar, bfuVarM6498N, nodeItem, nodeItem.getNodeValue(), false);
                                }
                                break;
                            case 1:
                            case 3:
                            case 4:
                            default:
                                throw new bfc("Unrecognized attribute of empty property element", 202);
                            case 2:
                            case 6:
                                break;
                            case 5:
                                m6503S(bfuVarM6498N, "rdf:resource", nodeItem.getNodeValue());
                                break;
                        }
                    }
                }
                return;
            }
            Node nodeItem2 = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem2.getPrefix()) && (nodeItem2.getPrefix() != null || !"xmlns".equals(nodeItem2.getNodeName()))) {
                switch (m6497M(nodeItem2)) {
                    case 0:
                        if ("value".equals(nodeItem2.getLocalName()) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem2.getNamespaceURI())) {
                            if (z3) {
                                throw new bfc("Empty property element can't have both rdf:value and rdf:resource", 203);
                            }
                            node2 = nodeItem2;
                            z2 = true;
                        } else if (!"xml:lang".equals(nodeItem2.getNodeName())) {
                            z4 = true;
                        }
                        break;
                    case 1:
                    case 3:
                    case 4:
                    default:
                        throw new bfc("Unrecognized attribute of empty property element", 202);
                    case 2:
                        break;
                    case 5:
                        if (z5) {
                            throw new bfc("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        if (z2) {
                            throw new bfc("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        node2 = nodeItem2;
                        z2 = false;
                        z3 = true;
                        break;
                        break;
                    case 6:
                        if (z3) {
                            throw new bfc("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        z5 = true;
                        break;
                        break;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: Q */
    private static void m6501Q(bfr bfrVar, bfu bfuVar, Node node, boolean z) throws bfc {
        bfu bfuVarM6498N = m6498N(bfrVar, bfuVar, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String namespaceURI = nodeItem.getNamespaceURI();
                String localName = nodeItem.getLocalName();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    m6503S(bfuVarM6498N, "xml:lang", nodeItem.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!IuyLAqNmW.eHqYIpgzwcOW.equals(localName) && !"datatype".equals(localName))) {
                    throw new bfc("Invalid attribute for literal property element", 202);
                }
            }
        }
        String strConcat = "";
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node nodeItem2 = node.getChildNodes().item(i2);
            if (nodeItem2.getNodeType() != 3) {
                throw new bfc("Invalid child of literal property element", 202);
            }
            strConcat = strConcat.concat(String.valueOf(nodeItem2.getNodeValue()));
        }
        bfuVarM6498N.f3131b = strConcat;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:113:0x0205  */
    /* JADX WARN: Code duplicated, block: B:134:0x026a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0278  */
    /* JADX WARN: Code duplicated, block: B:138:0x027f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0281  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:162:0x0317 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:165:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x034b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0375  */
    /* JADX WARN: Code duplicated, block: B:185:0x037f  */
    /* JADX WARN: Code duplicated, block: B:189:0x038a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[LOOP:8: B:173:0x0345->B:255:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: R */
    private static void m6502R(bfr bfrVar, bfu bfuVar, Node node, boolean z) throws bfc {
        bfu bfuVarM6498N;
        int i;
        int i2;
        boolean z2;
        Node nodeItem;
        boolean zEquals;
        Iterator itM2341h;
        Node nodeItem2;
        for (int i3 = 0; i3 < node.getChildNodes().getLength(); i3++) {
            Node nodeItem3 = node.getChildNodes().item(i3);
            if (!m6493I(nodeItem3)) {
                if (nodeItem3.getNodeType() != 1) {
                    throw new bfc("Expected property element node not found", 202);
                }
                int iM6497M = m6497M(nodeItem3);
                if (iM6497M == 8 || iM6497M >= 10 || (iM6497M > 0 && iM6497M <= 7)) {
                    throw new bfc("Invalid property element name", 202);
                }
                NamedNodeMap attributes = nodeItem3.getAttributes();
                ArrayList arrayList = null;
                for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                    Node nodeItem4 = attributes.item(i4);
                    if ("xmlns".equals(nodeItem4.getPrefix()) || (nodeItem4.getPrefix() == null && "xmlns".equals(nodeItem4.getNodeName()))) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(nodeItem4.getNodeName());
                    }
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        attributes.removeNamedItem((String) arrayList.get(i5));
                    }
                }
                if (attributes.getLength() <= 3) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= attributes.getLength()) {
                            if (!nodeItem3.hasChildNodes()) {
                                m6500P(bfrVar, bfuVar, nodeItem3, z);
                                break;
                            }
                            int i7 = 0;
                            while (true) {
                                if (i7 >= nodeItem3.getChildNodes().getLength()) {
                                    m6501Q(bfrVar, bfuVar, nodeItem3, z);
                                    break;
                                }
                                if (nodeItem3.getChildNodes().item(i7).getNodeType() != 3) {
                                    if (!z) {
                                        bfuVarM6498N = m6498N(bfrVar, bfuVar, nodeItem3, "", z);
                                        for (i = 0; i < nodeItem3.getAttributes().getLength(); i++) {
                                            nodeItem2 = nodeItem3.getAttributes().item(i);
                                            if ("xmlns".equals(nodeItem2.getPrefix())) {
                                            }
                                        }
                                        z2 = false;
                                        for (i2 = 0; i2 < nodeItem3.getChildNodes().getLength(); i2++) {
                                            nodeItem = nodeItem3.getChildNodes().item(i2);
                                            if (m6493I(nodeItem)) {
                                                if (nodeItem.getNodeType() == 1) {
                                                    if (!z2) {
                                                        zEquals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem.getNamespaceURI());
                                                        String localName = nodeItem.getLocalName();
                                                        if (!zEquals) {
                                                            if (!zEquals) {
                                                                if (zEquals) {
                                                                    bfuVarM6498N.m2340g().m2405x(true);
                                                                    if (zEquals) {
                                                                    }
                                                                } else {
                                                                    bfuVarM6498N.m2340g().m2405x(true);
                                                                    if (zEquals) {
                                                                    }
                                                                }
                                                            } else if (zEquals) {
                                                                bfuVarM6498N.m2340g().m2405x(true);
                                                                if (zEquals) {
                                                                }
                                                            } else {
                                                                bfuVarM6498N.m2340g().m2405x(true);
                                                                if (zEquals) {
                                                                }
                                                            }
                                                        } else if (!zEquals) {
                                                            if (zEquals) {
                                                                bfuVarM6498N.m2340g().m2405x(true);
                                                                if (zEquals) {
                                                                }
                                                            } else {
                                                                bfuVarM6498N.m2340g().m2405x(true);
                                                                if (zEquals) {
                                                                }
                                                            }
                                                        } else if (zEquals) {
                                                            bfuVarM6498N.m2340g().m2405x(true);
                                                            if (zEquals) {
                                                            }
                                                        } else {
                                                            bfuVarM6498N.m2340g().m2405x(true);
                                                            if (zEquals) {
                                                            }
                                                        }
                                                        m6492H(bfrVar, bfuVarM6498N, nodeItem, false);
                                                        if (bfuVarM6498N.f3138i) {
                                                            m6499O(bfuVarM6498N);
                                                            z2 = true;
                                                        } else {
                                                            if (bfuVarM6498N.m2340g().m2391j()) {
                                                                itM2341h = bfuVarM6498N.m2341h();
                                                                while (itM2341h.hasNext()) {
                                                                    if (((bfu) itM2341h.next()).m2340g().m2388c()) {
                                                                        bfuVarM6498N.m2340g().m2399r();
                                                                        m6491G(bfuVarM6498N);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z2 = true;
                                                        }
                                                    }
                                                } else if (!z2) {
                                                    throw new bfc("Children of resource property element must be XML elements", 202);
                                                }
                                                throw new bfc("Invalid child of resource property element", 202);
                                            }
                                        }
                                        if (z2) {
                                            throw new bfc("Missing child of resource property element", 202);
                                        }
                                        break;
                                        break;
                                    }
                                    if (qQLA.iAPrRg.equals(nodeItem3.getNodeName())) {
                                        break;
                                    }
                                    bfuVarM6498N = m6498N(bfrVar, bfuVar, nodeItem3, "", z);
                                    while (i < nodeItem3.getAttributes().getLength()) {
                                        nodeItem2 = nodeItem3.getAttributes().item(i);
                                        if ("xmlns".equals(nodeItem2.getPrefix()) && (nodeItem2.getPrefix() != null || !"xmlns".equals(nodeItem2.getNodeName()))) {
                                            String localName2 = nodeItem2.getLocalName();
                                            String namespaceURI = nodeItem2.getNamespaceURI();
                                            if ("xml:lang".equals(nodeItem2.getNodeName())) {
                                                m6503S(bfuVarM6498N, "xml:lang", nodeItem2.getNodeValue());
                                            } else if (!"ID".equals(localName2) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                                throw new bfc(rmwTRjObXLGH.XSqvfTj, 202);
                                            }
                                        }
                                    }
                                    z2 = false;
                                    while (i2 < nodeItem3.getChildNodes().getLength()) {
                                        nodeItem = nodeItem3.getChildNodes().item(i2);
                                        if (m6493I(nodeItem)) {
                                            if (nodeItem.getNodeType() == 1) {
                                                if (!z2) {
                                                    zEquals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem.getNamespaceURI());
                                                    String localName3 = nodeItem.getLocalName();
                                                    if (!zEquals && "Bag".equals(localName3)) {
                                                        bfuVarM6498N.m2340g().m2398q();
                                                    } else if (!zEquals && "Seq".equals(localName3)) {
                                                        bge bgeVarM2340g = bfuVarM6498N.m2340g();
                                                        bgeVarM2340g.m2398q();
                                                        bgeVarM2340g.m2401t();
                                                    } else if (zEquals || !"Alt".equals(localName3)) {
                                                        bfuVarM6498N.m2340g().m2405x(true);
                                                        if (zEquals && !"Description".equals(localName3)) {
                                                            String namespaceURI2 = nodeItem.getNamespaceURI();
                                                            if (namespaceURI2 == null) {
                                                                throw new bfc("All XML elements must be in a namespace", 203);
                                                            }
                                                            m6503S(bfuVarM6498N, "rdf:type", namespaceURI2 + ":" + localName3);
                                                        }
                                                    } else {
                                                        bge bgeVarM2340g2 = bfuVarM6498N.m2340g();
                                                        bgeVarM2340g2.m2398q();
                                                        bgeVarM2340g2.m2401t();
                                                        bgeVarM2340g2.m2400s();
                                                    }
                                                    m6492H(bfrVar, bfuVarM6498N, nodeItem, false);
                                                    if (bfuVarM6498N.f3138i) {
                                                        m6499O(bfuVarM6498N);
                                                        z2 = true;
                                                    } else {
                                                        if (bfuVarM6498N.m2340g().m2391j() && bfuVarM6498N.m2340g().m2391j() && bfuVarM6498N.m2352s()) {
                                                            itM2341h = bfuVarM6498N.m2341h();
                                                            while (itM2341h.hasNext()) {
                                                                if (((bfu) itM2341h.next()).m2340g().m2388c()) {
                                                                    bfuVarM6498N.m2340g().m2399r();
                                                                    m6491G(bfuVarM6498N);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                }
                                            } else if (!z2) {
                                                throw new bfc("Children of resource property element must be XML elements", 202);
                                            }
                                            throw new bfc("Invalid child of resource property element", 202);
                                        }
                                    }
                                    if (z2) {
                                        throw new bfc("Missing child of resource property element", 202);
                                    }
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            Node nodeItem5 = attributes.item(i6);
                            String localName4 = nodeItem5.getLocalName();
                            String namespaceURI3 = nodeItem5.getNamespaceURI();
                            String nodeValue = nodeItem5.getNodeValue();
                            if (!"xml:lang".equals(nodeItem5.getNodeName()) || ("ID".equals(localName4) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3))) {
                                if ("datatype".equals(localName4) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3)) {
                                    m6501Q(bfrVar, bfuVar, nodeItem3, z);
                                    break;
                                }
                                if (!"parseType".equals(localName4) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3)) {
                                    m6500P(bfrVar, bfuVar, nodeItem3, z);
                                    break;
                                }
                                if ("Literal".equals(nodeValue)) {
                                    throw new bfc("ParseTypeLiteral property element not allowed", 203);
                                }
                                if (!xRFdVyfdeve.jtCgMmOeDA.equals(nodeValue)) {
                                    if (!HEePJw.dAHcMClcUKV.equals(nodeValue)) {
                                        throw new bfc("ParseTypeOther property element not allowed", 203);
                                    }
                                    throw new bfc("ParseTypeCollection property element not allowed", 203);
                                }
                                bfu bfuVarM6498N2 = m6498N(bfrVar, bfuVar, nodeItem3, "", z);
                                bfuVarM6498N2.m2340g().m2405x(true);
                                for (int i8 = 0; i8 < nodeItem3.getAttributes().getLength(); i8++) {
                                    Node nodeItem6 = nodeItem3.getAttributes().item(i8);
                                    if (!"xmlns".equals(nodeItem6.getPrefix()) && (nodeItem6.getPrefix() != null || !"xmlns".equals(nodeItem6.getNodeName()))) {
                                        String localName5 = nodeItem6.getLocalName();
                                        String namespaceURI4 = nodeItem6.getNamespaceURI();
                                        if ("xml:lang".equals(nodeItem6.getNodeName())) {
                                            m6503S(bfuVarM6498N2, "xml:lang", nodeItem6.getNodeValue());
                                        } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI4) || (!"ID".equals(localName5) && !"parseType".equals(localName5))) {
                                            throw new bfc("Invalid attribute for ParseTypeResource property element", 202);
                                        }
                                    }
                                }
                                m6502R(bfrVar, bfuVarM6498N2, nodeItem3, false);
                                if (!bfuVarM6498N2.f3138i) {
                                    break;
                                }
                                m6499O(bfuVarM6498N2);
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    m6500P(bfrVar, bfuVar, nodeItem3, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    private static void m6503S(bfu bfuVar, String str, String str2) throws bfc {
        if ("xml:lang".equals(str)) {
            str2 = bfk.m2309a(str2);
        }
        bfuVar.m2346m(new bfu(str, str2, null));
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m6504a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription.Builder m6505b() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static MediaDescription m6506c(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static Uri m6507d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m6508e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m6509f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m6510g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m6511h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* JADX INFO: renamed from: i */
    public static String m6512i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* JADX INFO: renamed from: j */
    public static void m6513j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public static void m6514k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: l */
    public static void m6515l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public static void m6516m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* JADX INFO: renamed from: n */
    public static void m6517n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m6518o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public static void m6519p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public static String m6520q(Context context) {
        String attributeValue = "";
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1) {
                                if (next == 3) {
                                    if (xmlPullParserNewPullParser.getDepth() <= depth) {
                                        break;
                                    }
                                    next = 3;
                                    if (next == 3) {
                                    }
                                } else if (next == 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException e) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException | XmlPullParserException e2) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } catch (IOException e3) {
            }
            if (attributeValue.isEmpty()) {
                context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
            }
            return attributeValue;
        } catch (FileNotFoundException e4) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m6521r(int i) {
        switch (i) {
            case 1:
                return "REMOVED";
            case 2:
                return "VISIBLE";
            case 3:
                return hIAHJKEnGsNbz.QsYIbupYKeNPBGf;
            case 4:
                return "INVISIBLE";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m6522s(int i) {
        switch (i) {
            case 0:
                return 2;
            case 4:
                return 4;
            case 8:
                return 3;
            default:
                throw new IllegalArgumentException("Unknown visibility " + i);
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m6523t(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m6522s(view.getVisibility());
    }

    /* JADX INFO: renamed from: u */
    public static void m6524u(int i, View view) {
        switch (i - 1) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Removing view ");
                        sb.append(view);
                        sb.append(" from container ");
                        sb.append(viewGroup);
                    }
                    viewGroup.removeView(view);
                }
                break;
            case 1:
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: Setting view ");
                    sb2.append(view);
                    sb2.append(" to VISIBLE");
                }
                view.setVisibility(0);
                break;
            case 2:
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: Setting view ");
                    sb3.append(view);
                    sb3.append(" to GONE");
                }
                view.setVisibility(8);
                break;
            default:
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: Setting view ");
                    sb4.append(view);
                    sb4.append(" to INVISIBLE");
                }
                view.setVisibility(4);
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m6525v(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "ADDING";
            case 3:
                return "REMOVING";
            default:
                return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02f0 A[EDGE_INSN: B:108:0x02f0->B:96:0x02f0 BREAK  A[LOOP:3: B:93:0x02e2->B:95:0x02e8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc A[Catch: IOException -> 0x0304, TRY_ENTER, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012b A[Catch: IOException -> 0x0304, LOOP:0: B:49:0x0125->B:51:0x012b, LOOP_END, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: IOException -> 0x0304, LOOP:1: B:53:0x0152->B:55:0x0158, LOOP_END, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0170 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0182 A[Catch: IOException -> 0x0304, LOOP:2: B:58:0x017c->B:60:0x0182, LOOP_END, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a7 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0219 A[Catch: IOException -> 0x0304, LOOP:5: B:69:0x0213->B:71:0x0219, LOOP_END, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0249 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x028a A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0297  */
    /* JADX WARN: Code duplicated, block: B:80:0x029a  */
    /* JADX WARN: Code duplicated, block: B:84:0x02be A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02c7 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02ca A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e1 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02e8 A[Catch: IOException -> 0x0304, LOOP:3: B:93:0x02e2->B:95:0x02e8, LOOP_END, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02f7 A[Catch: IOException -> 0x0304, TryCatch #0 {IOException -> 0x0304, blocks: (B:6:0x0014, B:10:0x003f, B:12:0x0047, B:14:0x0052, B:42:0x00b3, B:44:0x00b9, B:45:0x00c4, B:48:0x00fc, B:49:0x0125, B:51:0x012b, B:52:0x0147, B:53:0x0152, B:55:0x0158, B:57:0x0170, B:58:0x017c, B:60:0x0182, B:61:0x0196, B:75:0x0269, B:77:0x028a, B:81:0x029c, B:82:0x02b1, B:84:0x02be, B:86:0x02c7, B:90:0x02d7, B:92:0x02e1, B:93:0x02e2, B:95:0x02e8, B:96:0x02f0, B:98:0x02fa, B:97:0x02f7, B:87:0x02ca, B:88:0x02d3, B:62:0x01a7, B:63:0x01b4, B:65:0x01c4, B:66:0x01ca, B:68:0x01d0, B:69:0x0213, B:71:0x0219, B:72:0x0232, B:74:0x0249, B:17:0x005b, B:18:0x0062, B:19:0x0063, B:20:0x006a, B:21:0x006b, B:23:0x0071, B:26:0x007e, B:27:0x0085, B:28:0x0086, B:30:0x008c, B:33:0x0093, B:34:0x009a, B:36:0x009d, B:37:0x009f, B:39:0x00a5, B:41:0x00af), top: B:104:0x0014 }] */
    /* JADX INFO: renamed from: x */
    public static void m6527x(bfr bfrVar, OutputStream outputStream, bgf bgfVar) throws bfc {
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        Iterator itM2341h;
        Iterator itM2341h2;
        String strConcat;
        int length;
        int i4;
        int i5;
        int length2;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        HashSet hashSet;
        Iterator itM2341h3;
        String str4;
        Iterator itM2341h4;
        boolean zM2360d;
        Iterator itM2341h5;
        if (bgfVar.m2384h(4096)) {
            bfrVar.f3126a.m2351r();
        }
        int i10 = bfx.f3146b;
        try {
            bfi bfiVar = new bfi(outputStream);
            new OutputStreamWriter(bfiVar, bgfVar.m2406b());
            int i11 = bgfVar.f3155b;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bfiVar, bgfVar.m2406b());
            int i12 = true != (bgfVar.m2407c() | bgfVar.m2408d()) ? 1 : 2;
            if (!bgfVar.m2409i()) {
                if (!bgfVar.m2412l()) {
                    if (!bgfVar.m2411k()) {
                        if (i11 == 0) {
                            i11 = i12 * 2048;
                        }
                        if (bgfVar.m2410j() && !bfrVar.mo2294e("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                            i = i11 + (i12 * 10000);
                        }
                    } else if (bgfVar.m2410j()) {
                        throw new bfc("Inconsistent options for non-packet serialize", 103);
                    }
                    if (!bgfVar.m2411k()) {
                        bfx.m2363g(0, outputStreamWriter, bgfVar);
                        outputStreamWriter.write("<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                        bfx.m2364h(outputStreamWriter, bgfVar);
                    }
                    bfx.m2363g(0, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
                    bff.m2303c();
                    outputStreamWriter.write("Adobe XMP Core 5.1.0-jc003");
                    outputStreamWriter.write("\">");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    bfx.m2363g(1, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    str = "</rdf:Description>";
                    str2 = "<rdf:Description rdf:about=";
                    if (bgfVar.m2384h(64)) {
                        bfx.m2363g(2, outputStreamWriter, bgfVar);
                        outputStreamWriter.write("<rdf:Description rdf:about=");
                        bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                        hashSet = new HashSet();
                        hashSet.add("xml");
                        hashSet.add("rdf");
                        itM2341h3 = bfrVar.f3126a.m2341h();
                        while (itM2341h3.hasNext()) {
                            bfx.m2361e((bfu) itM2341h3.next(), hashSet, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                            hashSet = hashSet;
                            str = str;
                            i = i;
                        }
                        str4 = str;
                        i2 = i;
                        itM2341h4 = bfrVar.f3126a.m2341h();
                        zM2360d = true;
                        while (itM2341h4.hasNext()) {
                            zM2360d &= bfx.m2360d((bfu) itM2341h4.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                        }
                        if (zM2360d) {
                            outputStreamWriter.write("/>");
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            i3 = i12;
                        } else {
                            outputStreamWriter.write(62);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            itM2341h5 = bfrVar.f3126a.m2341h();
                            while (itM2341h5.hasNext()) {
                                bfx.m2357a((bfu) itM2341h5.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                            }
                            bfx.m2363g(2, outputStreamWriter, bgfVar);
                            outputStreamWriter.write(str4);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            i3 = i12;
                        }
                    } else {
                        i2 = i;
                        str3 = "</rdf:Description>";
                        if (bfrVar.f3126a.m2334a() > 0) {
                            itM2341h = bfrVar.f3126a.m2341h();
                            while (itM2341h.hasNext()) {
                                bfu bfuVar = (bfu) itM2341h.next();
                                bfx.m2363g(2, outputStreamWriter, bgfVar);
                                outputStreamWriter.write(str2);
                                String str5 = str2;
                                bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                                HashSet hashSet2 = new HashSet();
                                hashSet2.add("xml");
                                hashSet2.add("rdf");
                                String str6 = str3;
                                bfx.m2361e(bfuVar, hashSet2, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                                outputStreamWriter.write(62);
                                bfx.m2364h(outputStreamWriter, bgfVar);
                                itM2341h2 = bfuVar.m2341h();
                                while (itM2341h2.hasNext()) {
                                    bfx.m2358b((bfu) itM2341h2.next(), false, 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                                    i12 = i12;
                                }
                                bfx.m2363g(2, outputStreamWriter, bgfVar);
                                outputStreamWriter.write(str6);
                                bfx.m2364h(outputStreamWriter, bgfVar);
                                str3 = str6;
                                str2 = str5;
                                i12 = i12;
                            }
                            i3 = i12;
                        } else {
                            i3 = i12;
                            bfx.m2363g(2, outputStreamWriter, bgfVar);
                            outputStreamWriter.write("<rdf:Description rdf:about=");
                            bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i3, i2);
                            outputStreamWriter.write("/>");
                            bfx.m2364h(outputStreamWriter, bgfVar);
                        }
                    }
                    bfx.m2363g(1, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("</rdf:RDF>");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    bfx.m2363g(0, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("</x:xmpmeta>");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    strConcat = "";
                    if (!bgfVar.m2411k()) {
                        String strConcat2 = "".concat("<?xpacket end=\"");
                        if (true != bgfVar.m2412l()) {
                            c = 'w';
                        } else {
                            c = 'r';
                        }
                        strConcat = (strConcat2 + c).concat("\"?>");
                    }
                    outputStreamWriter.flush();
                    length = strConcat.length();
                    if (bgfVar.m2409i()) {
                        i8 = bfiVar.f3090a + (length * i3);
                        i9 = i2;
                        if (i8 > i9) {
                            throw new bfc("Can't fit into specified packet size", 107);
                        }
                        i4 = i9 - i8;
                    } else {
                        i4 = i2;
                    }
                    i5 = i4 / i3;
                    length2 = bgfVar.f3156c.length();
                    if (i5 >= length2) {
                        i6 = i5 - length2;
                        while (true) {
                            i7 = length2 + 100;
                            if (i6 < i7) {
                                break;
                            }
                            bfx.m2362f(100, outputStreamWriter);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            i6 -= i7;
                        }
                        bfx.m2362f(i6, outputStreamWriter);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                    } else {
                        bfx.m2362f(i5, outputStreamWriter);
                    }
                    outputStreamWriter.write(strConcat);
                    outputStreamWriter.flush();
                    bfiVar.close();
                }
                if (bgfVar.m2411k() | bgfVar.m2410j()) {
                    throw new bfc("Inconsistent options for read-only packet", 103);
                }
                i = 0;
                if (!bgfVar.m2411k()) {
                    bfx.m2363g(0, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                }
                bfx.m2363g(0, outputStreamWriter, bgfVar);
                outputStreamWriter.write("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
                bff.m2303c();
                outputStreamWriter.write("Adobe XMP Core 5.1.0-jc003");
                outputStreamWriter.write("\">");
                bfx.m2364h(outputStreamWriter, bgfVar);
                bfx.m2363g(1, outputStreamWriter, bgfVar);
                outputStreamWriter.write("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
                bfx.m2364h(outputStreamWriter, bgfVar);
                str = "</rdf:Description>";
                str2 = "<rdf:Description rdf:about=";
                if (bgfVar.m2384h(64)) {
                    bfx.m2363g(2, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("<rdf:Description rdf:about=");
                    bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                    hashSet = new HashSet();
                    hashSet.add("xml");
                    hashSet.add("rdf");
                    itM2341h3 = bfrVar.f3126a.m2341h();
                    while (itM2341h3.hasNext()) {
                        bfx.m2361e((bfu) itM2341h3.next(), hashSet, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                        hashSet = hashSet;
                        str = str;
                        i = i;
                    }
                    str4 = str;
                    i2 = i;
                    itM2341h4 = bfrVar.f3126a.m2341h();
                    zM2360d = true;
                    while (itM2341h4.hasNext()) {
                        zM2360d &= bfx.m2360d((bfu) itM2341h4.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                    }
                    if (zM2360d) {
                        outputStreamWriter.write(62);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        itM2341h5 = bfrVar.f3126a.m2341h();
                        while (itM2341h5.hasNext()) {
                            bfx.m2357a((bfu) itM2341h5.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                        }
                        bfx.m2363g(2, outputStreamWriter, bgfVar);
                        outputStreamWriter.write(str4);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        i3 = i12;
                    } else {
                        outputStreamWriter.write("/>");
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        i3 = i12;
                    }
                } else {
                    i2 = i;
                    str3 = "</rdf:Description>";
                    if (bfrVar.f3126a.m2334a() > 0) {
                        itM2341h = bfrVar.f3126a.m2341h();
                        while (itM2341h.hasNext()) {
                            bfu bfuVar2 = (bfu) itM2341h.next();
                            bfx.m2363g(2, outputStreamWriter, bgfVar);
                            outputStreamWriter.write(str2);
                            String str7 = str2;
                            bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                            HashSet hashSet3 = new HashSet();
                            hashSet3.add("xml");
                            hashSet3.add("rdf");
                            String str8 = str3;
                            bfx.m2361e(bfuVar2, hashSet3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                            outputStreamWriter.write(62);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            itM2341h2 = bfuVar2.m2341h();
                            while (itM2341h2.hasNext()) {
                                bfx.m2358b((bfu) itM2341h2.next(), false, 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                                i12 = i12;
                            }
                            bfx.m2363g(2, outputStreamWriter, bgfVar);
                            outputStreamWriter.write(str8);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            str3 = str8;
                            str2 = str7;
                            i12 = i12;
                        }
                        i3 = i12;
                    } else {
                        i3 = i12;
                        bfx.m2363g(2, outputStreamWriter, bgfVar);
                        outputStreamWriter.write("<rdf:Description rdf:about=");
                        bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i3, i2);
                        outputStreamWriter.write("/>");
                        bfx.m2364h(outputStreamWriter, bgfVar);
                    }
                }
                bfx.m2363g(1, outputStreamWriter, bgfVar);
                outputStreamWriter.write("</rdf:RDF>");
                bfx.m2364h(outputStreamWriter, bgfVar);
                bfx.m2363g(0, outputStreamWriter, bgfVar);
                outputStreamWriter.write("</x:xmpmeta>");
                bfx.m2364h(outputStreamWriter, bgfVar);
                strConcat = "";
                if (!bgfVar.m2411k()) {
                    String strConcat3 = "".concat("<?xpacket end=\"");
                    if (true != bgfVar.m2412l()) {
                        c = 'w';
                    } else {
                        c = 'r';
                    }
                    strConcat = (strConcat3 + c).concat("\"?>");
                }
                outputStreamWriter.flush();
                length = strConcat.length();
                if (bgfVar.m2409i()) {
                    i8 = bfiVar.f3090a + (length * i3);
                    i9 = i2;
                    if (i8 > i9) {
                        throw new bfc("Can't fit into specified packet size", 107);
                    }
                    i4 = i9 - i8;
                } else {
                    i4 = i2;
                }
                i5 = i4 / i3;
                length2 = bgfVar.f3156c.length();
                if (i5 >= length2) {
                    i6 = i5 - length2;
                    while (true) {
                        i7 = length2 + 100;
                        if (i6 < i7) {
                            break;
                            break;
                        } else {
                            bfx.m2362f(100, outputStreamWriter);
                            bfx.m2364h(outputStreamWriter, bgfVar);
                            i6 -= i7;
                        }
                    }
                    bfx.m2362f(i6, outputStreamWriter);
                    bfx.m2364h(outputStreamWriter, bgfVar);
                } else {
                    bfx.m2362f(i5, outputStreamWriter);
                }
                outputStreamWriter.write(strConcat);
                outputStreamWriter.flush();
                bfiVar.close();
            }
            if (bgfVar.m2411k() || bgfVar.m2410j()) {
                throw new bfc("Inconsistent options for exact size serialize", 103);
            }
            if ((bgfVar.f3155b & (i12 - 1)) != 0) {
                throw new bfc("Exact size must be a multiple of the Unicode element", 103);
            }
            i = i11;
            if (!bgfVar.m2411k()) {
                bfx.m2363g(0, outputStreamWriter, bgfVar);
                outputStreamWriter.write("<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                bfx.m2364h(outputStreamWriter, bgfVar);
            }
            bfx.m2363g(0, outputStreamWriter, bgfVar);
            outputStreamWriter.write("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
            bff.m2303c();
            outputStreamWriter.write("Adobe XMP Core 5.1.0-jc003");
            outputStreamWriter.write("\">");
            bfx.m2364h(outputStreamWriter, bgfVar);
            bfx.m2363g(1, outputStreamWriter, bgfVar);
            outputStreamWriter.write("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
            bfx.m2364h(outputStreamWriter, bgfVar);
            str = "</rdf:Description>";
            str2 = "<rdf:Description rdf:about=";
            if (bgfVar.m2384h(64)) {
                bfx.m2363g(2, outputStreamWriter, bgfVar);
                outputStreamWriter.write("<rdf:Description rdf:about=");
                bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                hashSet = new HashSet();
                hashSet.add("xml");
                hashSet.add("rdf");
                itM2341h3 = bfrVar.f3126a.m2341h();
                while (itM2341h3.hasNext()) {
                    bfx.m2361e((bfu) itM2341h3.next(), hashSet, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i);
                    hashSet = hashSet;
                    str = str;
                    i = i;
                }
                str4 = str;
                i2 = i;
                itM2341h4 = bfrVar.f3126a.m2341h();
                zM2360d = true;
                while (itM2341h4.hasNext()) {
                    zM2360d &= bfx.m2360d((bfu) itM2341h4.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                }
                if (zM2360d) {
                    outputStreamWriter.write(62);
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    itM2341h5 = bfrVar.f3126a.m2341h();
                    while (itM2341h5.hasNext()) {
                        bfx.m2357a((bfu) itM2341h5.next(), 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                    }
                    bfx.m2363g(2, outputStreamWriter, bgfVar);
                    outputStreamWriter.write(str4);
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    i3 = i12;
                } else {
                    outputStreamWriter.write("/>");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                    i3 = i12;
                }
            } else {
                i2 = i;
                str3 = "</rdf:Description>";
                if (bfrVar.f3126a.m2334a() > 0) {
                    itM2341h = bfrVar.f3126a.m2341h();
                    while (itM2341h.hasNext()) {
                        bfu bfuVar3 = (bfu) itM2341h.next();
                        bfx.m2363g(2, outputStreamWriter, bgfVar);
                        outputStreamWriter.write(str2);
                        String str9 = str2;
                        bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                        HashSet hashSet4 = new HashSet();
                        hashSet4.add("xml");
                        hashSet4.add("rdf");
                        String str10 = str3;
                        bfx.m2361e(bfuVar3, hashSet4, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                        outputStreamWriter.write(62);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        itM2341h2 = bfuVar3.m2341h();
                        while (itM2341h2.hasNext()) {
                            bfx.m2358b((bfu) itM2341h2.next(), false, 3, bfrVar, bfiVar, outputStreamWriter, bgfVar, i12, i2);
                            i12 = i12;
                        }
                        bfx.m2363g(2, outputStreamWriter, bgfVar);
                        outputStreamWriter.write(str10);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        str3 = str10;
                        str2 = str9;
                        i12 = i12;
                    }
                    i3 = i12;
                } else {
                    i3 = i12;
                    bfx.m2363g(2, outputStreamWriter, bgfVar);
                    outputStreamWriter.write("<rdf:Description rdf:about=");
                    bfx.m2359c(bfrVar, bfiVar, outputStreamWriter, bgfVar, i3, i2);
                    outputStreamWriter.write("/>");
                    bfx.m2364h(outputStreamWriter, bgfVar);
                }
            }
            bfx.m2363g(1, outputStreamWriter, bgfVar);
            outputStreamWriter.write("</rdf:RDF>");
            bfx.m2364h(outputStreamWriter, bgfVar);
            bfx.m2363g(0, outputStreamWriter, bgfVar);
            outputStreamWriter.write("</x:xmpmeta>");
            bfx.m2364h(outputStreamWriter, bgfVar);
            strConcat = "";
            if (!bgfVar.m2411k()) {
                String strConcat4 = "".concat("<?xpacket end=\"");
                if (true != bgfVar.m2412l()) {
                    c = 'w';
                } else {
                    c = 'r';
                }
                strConcat = (strConcat4 + c).concat("\"?>");
            }
            outputStreamWriter.flush();
            length = strConcat.length();
            if (bgfVar.m2409i()) {
                i8 = bfiVar.f3090a + (length * i3);
                i9 = i2;
                if (i8 > i9) {
                    throw new bfc("Can't fit into specified packet size", 107);
                }
                i4 = i9 - i8;
            } else {
                i4 = i2;
            }
            i5 = i4 / i3;
            length2 = bgfVar.f3156c.length();
            if (i5 >= length2) {
                i6 = i5 - length2;
                while (true) {
                    i7 = length2 + 100;
                    if (i6 < i7) {
                        break;
                        break;
                    } else {
                        bfx.m2362f(100, outputStreamWriter);
                        bfx.m2364h(outputStreamWriter, bgfVar);
                        i6 -= i7;
                    }
                }
                bfx.m2362f(i6, outputStreamWriter);
                bfx.m2364h(outputStreamWriter, bgfVar);
            } else {
                bfx.m2362f(i5, outputStreamWriter);
            }
            outputStreamWriter.write(strConcat);
            outputStreamWriter.flush();
            bfiVar.close();
        } catch (IOException e) {
            throw new bfc("Error writing to the OutputStream", 0);
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m6528y(bfu bfuVar, String str) throws bfc {
        if (!bfuVar.m2340g().m2389d()) {
            throw new bfc("Language item must be used on array", 102);
        }
        for (int i = 1; i <= bfuVar.m2334a(); i++) {
            bfu bfuVarM2338e = bfuVar.m2338e(i);
            if (bfuVarM2338e.m2353t() && "xml:lang".equals(bfuVarM2338e.m2339f(1).f3130a) && str.equals(bfuVarM2338e.m2339f(1).f3131b)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public static bfu m6529z(bfu bfuVar, String str, boolean z) throws bfc {
        if (!bfuVar.m2340g().m2395n() && !bfuVar.m2340g().m2396o()) {
            if (!bfuVar.f3135f) {
                throw new bfc("Named children only allowed for schemas and structs", 102);
            }
            if (bfuVar.m2340g().m2389d()) {
                throw new bfc(JrxsYuVZZqnFC.NPtdWyGJwWJx, 102);
            }
            if (z) {
                bfuVar.m2340g().m2405x(true);
            }
        }
        bfu bfuVarM2336c = bfuVar.m2336c(str);
        if (bfuVarM2336c != null || !z) {
            return bfuVarM2336c;
        }
        bfu bfuVar2 = new bfu(str, new bge());
        bfuVar2.f3135f = true;
        bfuVar.m2344k(bfuVar2);
        return bfuVar2;
    }

    /* JADX INFO: renamed from: w */
    public static bfy m6526w(String str, String str2) throws bfc {
        int i;
        int i2;
        int i3;
        bfz bfzVar;
        int i4;
        if (str == null) {
            throw new bfc("Parameter must not be null", 4);
        }
        bfy bfyVar = new bfy();
        int i5 = 0;
        while (i5 < str2.length() && "/[*".indexOf(str2.charAt(i5)) < 0) {
            i5++;
        }
        if (i5 == 0) {
            throw new bfc("Empty initial XMPPath step", 102);
        }
        String strM6494J = m6494J(str, str2.substring(0, i5));
        bfw bfwVarM5630g = bff.f3083a.m5630g(strM6494J);
        int i6 = 3;
        if (bfwVarM5630g == null) {
            bfyVar.m2371c(new bfz(str, Integer.MIN_VALUE));
            bfyVar.m2371c(new bfz(strM6494J, 1));
            i = 0;
            i2 = 0;
        } else {
            bfyVar.m2371c(new bfz(bfwVarM5630g.f3141a, Integer.MIN_VALUE));
            bfz bfzVar2 = new bfz(m6494J(bfwVarM5630g.f3141a, bfwVarM5630g.f3143c), 1);
            bfzVar2.m2372a();
            bfzVar2.f3151d = bfwVarM5630g.f3144d.f3154a;
            bfyVar.m2371c(bfzVar2);
            bga bgaVar = bfwVarM5630g.f3144d;
            if (bgaVar.m2377c()) {
                bfz bfzVar3 = new bfz("[?xml:lang='x-default']", 5);
                bfzVar3.m2372a();
                bfzVar3.f3151d = bfwVarM5630g.f3144d.f3154a;
                bfyVar.m2371c(bfzVar3);
                i = 0;
                i2 = 0;
            } else if (bgaVar.m2384h(512)) {
                bfz bfzVar4 = new bfz("[1]", 3);
                bfzVar4.m2372a();
                bfzVar4.f3151d = bfwVarM5630g.f3144d.f3154a;
                bfyVar.m2371c(bfzVar4);
                i = 0;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
        }
        while (i5 < str2.length()) {
            if (str2.charAt(i5) == '/' && (i5 = i5 + 1) >= str2.length()) {
                throw new bfc("Empty XMPPath segment", 102);
            }
            if (str2.charAt(i5) == '*' && ((i5 = i5 + 1) >= str2.length() || str2.charAt(i5) != '[')) {
                throw new bfc("Missing '[' after '*'", 102);
            }
            if (str2.charAt(i5) != '[') {
                i = i5;
                while (i < str2.length() && "/[*".indexOf(str2.charAt(i)) < 0) {
                    i++;
                }
                if (i == i5) {
                    throw new bfc("Empty XMPPath segment", 102);
                }
                bfzVar = new bfz(str2.substring(i5, i), 1);
                i4 = i;
            } else {
                int i7 = i5 + 1;
                if (str2.charAt(i7) < '0' || str2.charAt(i7) > '9') {
                    i3 = i7;
                    while (i3 < str2.length() && str2.charAt(i3) != ']' && str2.charAt(i3) != '=') {
                        i3++;
                    }
                    if (i3 >= str2.length()) {
                        throw new bfc("Missing ']' or '=' for array index", 102);
                    }
                    if (str2.charAt(i3) != ']') {
                        int i8 = i3 + 1;
                        char cCharAt = str2.charAt(i8);
                        if (cCharAt != '\'' && cCharAt != '\"') {
                            throw new bfc("Invalid quote in array selector", 102);
                        }
                        int i9 = i8 + 1;
                        while (i9 < str2.length()) {
                            if (str2.charAt(i9) == cCharAt) {
                                int i10 = i9 + 1;
                                if (i10 >= str2.length() || str2.charAt(i10) != cCharAt) {
                                    break;
                                }
                                i9 = i10;
                            }
                            i9++;
                        }
                        if (i9 >= str2.length()) {
                            throw new bfc("No terminating quote for array selector", 102);
                        }
                        bfzVar = new bfz(null, 6);
                        int i11 = i3;
                        i3 = i9 + 1;
                        i = i11;
                    } else {
                        if (!hsSUWRJfoeC.RknLiHyO.equals(str2.substring(i5, i3))) {
                            throw new bfc("Invalid non-numeric array index", 102);
                        }
                        i7 = i2;
                        bfzVar = new bfz(null, 4);
                    }
                } else {
                    while (i7 < str2.length() && str2.charAt(i7) >= '0' && str2.charAt(i7) <= '9') {
                        i7++;
                    }
                    int i12 = i7;
                    i7 = i2;
                    bfzVar = new bfz(null, i6);
                    i3 = i12;
                }
                if (i3 >= str2.length() || str2.charAt(i3) != ']') {
                    throw new bfc("Missing ']' for array index", 102);
                }
                i4 = i3 + 1;
                bfzVar.f3148a = str2.substring(i5, i4);
                i5 = i7;
            }
            int i13 = bfzVar.f3149b;
            if (i13 == 1) {
                if (bfzVar.f3148a.charAt(0) == '@') {
                    bfzVar.f3148a = "?".concat(String.valueOf(bfzVar.f3148a.substring(1)));
                    if (!"?xml:lang".equals(bfzVar.f3148a)) {
                        throw new bfc("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (bfzVar.f3148a.charAt(0) == '?') {
                    bfzVar.f3149b = 2;
                    i5++;
                }
                m6495K(str2.substring(i5, i));
            } else if (i13 == 6) {
                if (bfzVar.f3148a.charAt(1) == '@') {
                    bfzVar.f3148a = "[?".concat(String.valueOf(bfzVar.f3148a.substring(2)));
                    if (!bfzVar.f3148a.startsWith("[?xml:lang=")) {
                        throw new bfc("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (bfzVar.f3148a.charAt(1) == '?') {
                    i5++;
                    bfzVar.f3149b = 5;
                    m6495K(str2.substring(i5, i));
                }
            }
            bfyVar.m2371c(bfzVar);
            i2 = i5;
            i5 = i4;
            i6 = 3;
        }
        return bfyVar;
    }
}
