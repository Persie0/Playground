package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfs {

    /* JADX INFO: renamed from: a */
    private static final Object f3127a = new Object();

    /* JADX INFO: renamed from: b */
    private static final DocumentBuilderFactory f3128b;

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setIgnoringComments(true);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
        }
        f3128b = documentBuilderFactoryNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x03e5  */
    /* JADX INFO: renamed from: a */
    public static bfd m2325a(Object obj) {
        Document documentM2326b;
        String str;
        bfu bfuVarM2338e;
        bfu bfuVarM6529z;
        C0168et.m7840i(obj);
        bgd bgdVar = new bgd();
        if (obj instanceof InputStream) {
            InputStream inputStream = (InputStream) obj;
            if (bgdVar.m2385b() || bgdVar.m2386c()) {
                try {
                    documentM2326b = m2327c(new bfh(inputStream), bgdVar);
                } catch (IOException e) {
                    throw new bfc("Error reading the XML-file", 204, e);
                }
            } else {
                documentM2326b = m2326b(new InputSource(inputStream));
            }
        } else if (obj instanceof byte[]) {
            documentM2326b = m2327c(new bfh((byte[]) obj), bgdVar);
        } else {
            String str2 = (String) obj;
            try {
                documentM2326b = m2326b(new InputSource(new StringReader(str2)));
            } catch (bfc e2) {
                if (e2.f3082a != 201 || !bgdVar.m2386c()) {
                    throw e2;
                }
                documentM2326b = m2326b(new InputSource(new bfj(new StringReader(str2))));
            }
        }
        Object[] objArrM2328d = m2328d(documentM2326b, bgdVar.m2384h(1), new Object[3]);
        if (objArrM2328d == null || objArrM2328d[1] != f3127a) {
            return new bfr();
        }
        Node node = (Node) objArrM2328d[0];
        bfr bfrVar = new bfr();
        if (!node.hasAttributes()) {
            throw new bfc("Invalid attributes of rdf:RDF element", 202);
        }
        bfu bfuVar = bfrVar.f3126a;
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (!C0137dp.m6493I(nodeItem)) {
                C0137dp.m6492H(bfrVar, bfuVar, nodeItem, true);
            }
        }
        if (bgdVar.m2384h(32)) {
            return bfrVar;
        }
        Map map = bfv.f3140a;
        bfu bfuVar2 = bfrVar.f3126a;
        C0137dp.m6486B(bfuVar2, "http://purl.org/dc/elements/1.1/", true);
        Iterator itM2341h = bfrVar.f3126a.m2341h();
        while (true) {
            str = null;
            if (!itM2341h.hasNext()) {
                break;
            }
            bfu bfuVar3 = (bfu) itM2341h.next();
            if ("http://purl.org/dc/elements/1.1/".equals(bfuVar3.f3130a)) {
                for (int i2 = 1; i2 <= bfuVar3.m2334a(); i2++) {
                    bfu bfuVarM2338e2 = bfuVar3.m2338e(i2);
                    bge bgeVar = (bge) bfv.f3140a.get(bfuVarM2338e2.f3130a);
                    if (bgeVar != null) {
                        if ((bfuVarM2338e2.m2340g().f3154a & 768) == 0) {
                            bfu bfuVar4 = new bfu(bfuVarM2338e2.f3130a, bgeVar);
                            bfuVarM2338e2.f3130a = "[]";
                            bfuVar4.m2344k(bfuVarM2338e2);
                            bfuVar4.f3132c = bfuVar3;
                            bfuVar3.m2343j().set(i2 - 1, bfuVar4);
                            if (bgeVar.m2390i() && !bfuVarM2338e2.m2340g().m2388c()) {
                                bfuVarM2338e2.m2346m(new bfu("xml:lang", "x-default", null));
                            }
                        } else {
                            bfuVarM2338e2.m2340g().m2382f(7680, false);
                            bfuVarM2338e2.m2340g().m2387b(bgeVar);
                            if (bgeVar.m2390i()) {
                                bfv.m2355b(bfuVarM2338e2);
                            }
                        }
                    }
                }
            } else if ("http://ns.adobe.com/exif/1.0/".equals(bfuVar3.f3130a)) {
                bfu bfuVarM6529z2 = C0137dp.m6529z(bfuVar3, "exif:GPSTimeStamp", false);
                if (bfuVarM6529z2 != null) {
                    try {
                        bfl bflVarM7755f = C0167es.m7755f(bfuVarM6529z2.f3131b);
                        if (bflVarM7755f.f3098a == 0 && bflVarM7755f.f3099b == 0 && bflVarM7755f.f3100c == 0) {
                            bfu bfuVarM6529z3 = C0137dp.m6529z(bfuVar3, TVkaNXnfP.tcYjTVDuipiUlR, false);
                            if (bfuVarM6529z3 == null) {
                                bfuVarM6529z3 = C0137dp.m6529z(bfuVar3, "exif:DateTimeDigitized", false);
                            }
                            bfl bflVarM7755f2 = C0167es.m7755f(bfuVarM6529z3.f3131b);
                            Calendar calendarM2315a = bflVarM7755f.m2315a();
                            calendarM2315a.set(1, bflVarM7755f2.f3098a);
                            try {
                                calendarM2315a.set(2, bflVarM7755f2.f3099b);
                                calendarM2315a.set(5, bflVarM7755f2.f3100c);
                                bfuVarM6529z2.f3131b = C0167es.m7754e(new bfl(calendarM2315a));
                            } catch (bfc e3) {
                            }
                        }
                    } catch (bfc e4) {
                    }
                }
                bfu bfuVarM6529z4 = C0137dp.m6529z(bfuVar3, "exif:UserComment", false);
                if (bfuVarM6529z4 != null) {
                    bfv.m2355b(bfuVarM6529z4);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(bfuVar3.f3130a)) {
                bfu bfuVarM6529z5 = C0137dp.m6529z(bfuVar3, "xmpDM:copyright", false);
                if (bfuVarM6529z5 != null) {
                    try {
                        bfu bfuVarM6486B = C0137dp.m6486B(bfrVar.f3126a, "http://purl.org/dc/elements/1.1/", true);
                        String str3 = bfuVarM6529z5.f3131b;
                        bfu bfuVarM6529z6 = C0137dp.m6529z(bfuVarM6486B, "dc:rights", false);
                        if (bfuVarM6529z6 == null || !bfuVarM6529z6.m2352s()) {
                            bfrVar.mo2298i("\n\n" + str3);
                        } else {
                            int iM6528y = C0137dp.m6528y(bfuVarM6529z6, "x-default");
                            if (iM6528y < 0) {
                                bfrVar.mo2298i(bfuVarM6529z6.m2338e(1).f3131b);
                                iM6528y = C0137dp.m6528y(bfuVarM6529z6, "x-default");
                            }
                            bfu bfuVarM2338e3 = bfuVarM6529z6.m2338e(iM6528y);
                            String str4 = bfuVarM2338e3.f3131b;
                            int iIndexOf = str4.indexOf("\n\n");
                            if (iIndexOf >= 0) {
                                int i3 = iIndexOf + 2;
                                if (!str4.substring(i3).equals(str3)) {
                                    bfuVarM2338e3.f3131b = str4.substring(0, i3) + str3;
                                }
                            } else if (!str3.equals(str4)) {
                                bfuVarM2338e3.f3131b = str4 + "\n\n" + str3;
                            }
                        }
                        bfuVarM6529z5.f3132c.m2348o(bfuVarM6529z5);
                    } catch (bfc e5) {
                    }
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(bfuVar3.f3130a) && (bfuVarM6529z = C0137dp.m6529z(bfuVar3, "xmpRights:UsageTerms", false)) != null) {
                bfv.m2355b(bfuVarM6529z);
            }
        }
        if (bfuVar2.f3136g) {
            bfuVar2.f3136g = false;
            boolean zM2384h = bgdVar.m2384h(4);
            for (bfu bfuVar5 : Collections.unmodifiableList(new ArrayList(bfuVar2.m2343j()))) {
                if (bfuVar5.f3136g) {
                    Iterator itM2341h2 = bfuVar5.m2341h();
                    while (itM2341h2.hasNext()) {
                        bfu bfuVar6 = (bfu) itM2341h2.next();
                        if (bfuVar6.f3137h) {
                            bfuVar6.f3137h = false;
                            bfw bfwVarM5630g = bff.f3083a.m5630g(bfuVar6.f3130a);
                            if (bfwVarM5630g != null) {
                                bfu bfuVarM6487C = C0137dp.m6487C(bfuVar2, bfwVarM5630g.f3141a, str, true);
                                bfuVarM6487C.f3135f = false;
                                bfu bfuVarM6529z7 = C0137dp.m6529z(bfuVarM6487C, bfwVarM5630g.f3142b.concat(bfwVarM5630g.f3143c), false);
                                if (bfuVarM6529z7 == null) {
                                    bga bgaVar = bfwVarM5630g.f3144d;
                                    if (bgaVar.m2378d()) {
                                        bfuVar6.f3130a = bfwVarM5630g.f3142b.concat(bfwVarM5630g.f3143c);
                                        bfuVarM6487C.m2344k(bfuVar6);
                                        itM2341h2.remove();
                                        str = null;
                                    } else {
                                        bfu bfuVar7 = new bfu(bfwVarM5630g.f3142b.concat(bfwVarM5630g.f3143c), bgaVar.m2376b());
                                        bfuVarM6487C.m2344k(bfuVar7);
                                        bfv.m2356c(itM2341h2, bfuVar6, bfuVar7);
                                        str = null;
                                    }
                                } else {
                                    bga bgaVar2 = bfwVarM5630g.f3144d;
                                    if (bgaVar2.m2378d()) {
                                        if (zM2384h) {
                                            bfv.m2354a(bfuVar6, bfuVarM6529z7, true);
                                        }
                                        itM2341h2.remove();
                                        str = null;
                                    } else {
                                        if (bgaVar2.m2377c()) {
                                            int iM6528y2 = C0137dp.m6528y(bfuVarM6529z7, "x-default");
                                            bfuVarM2338e = iM6528y2 != -1 ? bfuVarM6529z7.m2338e(iM6528y2) : null;
                                        } else {
                                            bfuVarM2338e = bfuVarM6529z7.m2352s() ? bfuVarM6529z7.m2338e(1) : null;
                                        }
                                        if (bfuVarM2338e == null) {
                                            bfv.m2356c(itM2341h2, bfuVar6, bfuVarM6529z7);
                                            str = null;
                                        } else {
                                            if (zM2384h) {
                                                bfv.m2354a(bfuVar6, bfuVarM2338e, true);
                                            }
                                            itM2341h2.remove();
                                            str = null;
                                        }
                                    }
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                    }
                    bfuVar5.f3136g = false;
                    str = null;
                } else {
                    str = null;
                }
            }
        }
        String str5 = bfuVar2.f3130a;
        if (str5 != null && str5.length() >= 36) {
            String lowerCase = str5.toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            int i4 = bfk.f3095a;
            if (lowerCase != null) {
                int i5 = 0;
                boolean z = true;
                int i6 = 0;
                while (i5 < lowerCase.length()) {
                    if (lowerCase.charAt(i5) == '-') {
                        i6++;
                        if (z) {
                            if (i5 != 8 && i5 != 13 && i5 != 18) {
                                if (i5 == 23) {
                                    i5 = 23;
                                } else {
                                    z = false;
                                }
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    i5++;
                }
                if (z && i6 == 4 && i5 == 36) {
                    bfu bfuVarM6485A = C0137dp.m6485A(bfuVar2, C0137dp.m6526w("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                    if (bfuVarM6485A == null) {
                        throw new bfc("Failure creating xmpMM:InstanceID", 9);
                    }
                    bfuVarM6485A.f3134e = null;
                    bfuVarM6485A.f3131b = "uuid:".concat(lowerCase);
                    bfuVarM6485A.m2349p();
                    bge bgeVarM2340g = bfuVarM6485A.m2340g();
                    bgeVarM2340g.m2403v(false);
                    bgeVarM2340g.m2402u(false);
                    bgeVarM2340g.m2404w(false);
                    bfuVarM6485A.f3133d = null;
                    bfuVar2.f3130a = null;
                }
            }
        }
        Iterator itM2341h3 = bfuVar2.m2341h();
        while (itM2341h3.hasNext()) {
            if (!((bfu) itM2341h3.next()).m2352s()) {
                itM2341h3.remove();
            }
        }
        return bfrVar;
    }

    /* JADX INFO: renamed from: b */
    private static Document m2326b(InputSource inputSource) throws bfc {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = f3128b.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder.parse(inputSource);
        } catch (IOException e) {
            throw new bfc("Error reading the XML-file", 204, e);
        } catch (ParserConfigurationException e2) {
            throw new bfc("XML Parser not correctly configured", 0, e2);
        } catch (SAXException e3) {
            throw new bfc("XML parsing failure", 201, e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private static Document m2327c(bfh bfhVar, bgd bgdVar) throws bfc {
        try {
            return m2326b(new InputSource(bfhVar.m2304a()));
        } catch (bfc e) {
            int i = e.f3082a;
            if (i != 201 && i != 204) {
                throw e;
            }
            if (bgdVar.m2385b() && "UTF-8".equals(bfhVar.m2305b())) {
                byte[] bArr = new byte[8];
                bfh bfhVar2 = new bfh((bfhVar.f3088b * 4) / 3);
                int i2 = 0;
                char c = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = bfhVar.f3088b;
                    if (i2 >= i5) {
                        if (c == 11) {
                            for (int i6 = 0; i6 < i4; i6++) {
                                bfhVar2.m2306c(C0168et.m7843l(bArr[i6]));
                            }
                        }
                        bfhVar = bfhVar2;
                    } else {
                        if (i2 >= i5) {
                            throw new IndexOutOfBoundsException(hIAHJKEnGsNbz.bOQwF);
                        }
                        int i7 = bfhVar.f3087a[i2] & 255;
                        switch (c) {
                            case 11:
                                if (i3 <= 0 || (i7 & 192) != 128) {
                                    bfhVar2.m2306c(C0168et.m7843l(bArr[0]));
                                    i2 -= i4;
                                    c = 0;
                                    i4 = 0;
                                } else {
                                    int i8 = i4 + 1;
                                    bArr[i4] = (byte) i7;
                                    i3--;
                                    if (i3 == 0) {
                                        bfhVar2.m2308e(bArr, i8);
                                        c = 0;
                                        i4 = 0;
                                    } else {
                                        i4 = i8;
                                    }
                                }
                                break;
                            default:
                                if (i7 < 127) {
                                    bfhVar2.m2307d(bfhVar2.f3088b + 1);
                                    byte[] bArr2 = bfhVar2.f3087a;
                                    int i9 = bfhVar2.f3088b;
                                    bfhVar2.f3088b = i9 + 1;
                                    bArr2[i9] = (byte) i7;
                                } else if (i7 >= 192) {
                                    i3 = -1;
                                    for (int i10 = i7; i3 < 8 && (i10 & 128) == 128; i10 += i10) {
                                        i3++;
                                    }
                                    bArr[i4] = (byte) i7;
                                    i4++;
                                    c = 11;
                                } else {
                                    bfhVar2.m2306c(C0168et.m7843l((byte) i7));
                                }
                                break;
                        }
                        i2++;
                    }
                }
            }
            if (!bgdVar.m2386c()) {
                return m2326b(new InputSource(bfhVar.m2304a()));
            }
            try {
                return m2326b(new InputSource(new bfj(new InputStreamReader(bfhVar.m2304a(), bfhVar.m2305b()))));
            } catch (UnsupportedEncodingException e2) {
                throw new bfc("Unsupported Encoding", 9, e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX INFO: renamed from: d */
    private static Object[] m2328d(Node node, boolean z, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 7) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) nodeItem;
                if (processingInstruction.getTarget() == "xpacket") {
                    objArr[2] = processingInstruction.getData();
                } else if (nodeItem.getNodeType() != 3 && nodeItem.getNodeType() != 7) {
                    String namespaceURI = nodeItem.getNamespaceURI();
                    String localName = nodeItem.getLocalName();
                    if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                        return m2328d(nodeItem, false, objArr);
                    }
                    if (!z && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        objArr[0] = nodeItem;
                        objArr[1] = f3127a;
                        return objArr;
                    }
                    Object[] objArrM2328d = m2328d(nodeItem, z, objArr);
                    if (objArrM2328d != null) {
                        return objArrM2328d;
                    }
                }
            } else if (nodeItem.getNodeType() != 3) {
                continue;
            }
        }
        return null;
    }
}
