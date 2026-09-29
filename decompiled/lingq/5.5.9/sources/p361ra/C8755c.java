package p361ra;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.Layout;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.C3179b0;
import com.google.common.collect.C3181c0;
import com.google.common.collect.C3183d0;
import com.google.common.collect.ImmutableSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p219ka.AbstractC6645f;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10135d;
import p479xa.C10145n;

/* JADX INFO: renamed from: ra.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8755c extends AbstractC6645f {

    /* JADX INFO: renamed from: n */
    public static final Pattern f46414n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o */
    public static final Pattern f46415o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p */
    public static final Pattern f46416p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f46417q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r */
    public static final Pattern f46418r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s */
    public static final Pattern f46419s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t */
    public static final Pattern f46420t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u */
    public static final b f46421u = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: v */
    public static final a f46422v = new a(15);

    /* JADX INFO: renamed from: m */
    public final XmlPullParserFactory f46423m;

    /* JADX INFO: renamed from: ra.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f46424a;

        public a(int i10) {
            this.f46424a = i10;
        }
    }

    /* JADX INFO: renamed from: ra.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final float f46425a;

        /* JADX INFO: renamed from: b */
        public final int f46426b;

        /* JADX INFO: renamed from: c */
        public final int f46427c;

        public b(float f3, int i10, int i11) {
            this.f46425a = f3;
            this.f46426b = i10;
            this.f46427c = i11;
        }
    }

    /* JADX INFO: renamed from: ra.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f46428a;

        /* JADX INFO: renamed from: b */
        public final int f46429b;

        public c(int i10, int i11) {
            this.f46428a = i10;
            this.f46429b = i11;
        }
    }

    public C8755c() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f46423m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C8758f m16990h(C8758f c8758f) {
        return c8758f == null ? new C8758f() : c8758f;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16991i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: j */
    public static Layout.Alignment m16992j(String str) {
        String strM383p2 = C0062b.m383p2(str);
        strM383p2.getClass();
        switch (strM383p2) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static a m16993k(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f46420t.matcher(attributeValue);
        if (!matcher.matches()) {
            C10145n.m19099g("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new a(i11);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            C10145n.m19099g("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static void m16994l(String str, C8758f c8758f) throws SubtitleDecoderException {
        Matcher matcher;
        int i10 = C10134c0.f51354a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f46416p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(C0166e.m768o(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            C10145n.m19099g("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(C0141b.m611g("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                c8758f.f46462j = 3;
                break;
            case "em":
                c8758f.f46462j = 2;
                break;
            case "px":
                c8758f.f46462j = 1;
                break;
            default:
                throw new SubtitleDecoderException(C0141b.m611g("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c8758f.f46463k = Float.parseFloat(strGroup2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public static b m16995m(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f3;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = C10134c0.f51354a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f3 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f3 = 1.0f;
        }
        b bVar = f46421u;
        int i12 = bVar.f46426b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new b(i10 * f3, i12, attributeValue4 != null ? Integer.parseInt(attributeValue4) : bVar.f46427c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX INFO: renamed from: n */
    public static void m16996n(XmlPullParser xmlPullParser, HashMap map, a aVar, c cVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM18995g;
        C8757e c8757e;
        float f3;
        float f10;
        String strM18995g2;
        Matcher matcher;
        Matcher matcher2;
        float f11;
        float f12;
        String strM18995g3;
        int i10;
        float f13;
        String strM18995g4;
        int i11;
        String strM383p2;
        String strM383p3;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (C10129a.m19000l(xmlPullParser, "style")) {
                String strM18995g5 = C10129a.m18995g(xmlPullParser, "style");
                C8758f c8758fM16998p = m16998p(xmlPullParser, new C8758f());
                if (strM18995g5 != null) {
                    String strTrim = strM18995g5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i12 = C10134c0.f51354a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        c8758fM16998p.m17010a((C8758f) map.get(str));
                    }
                }
                String str2 = c8758fM16998p.f46464l;
                if (str2 != null) {
                    map.put(str2, c8758fM16998p);
                }
            } else if (C10129a.m19000l(xmlPullParser, "region")) {
                String strM18995g6 = C10129a.m18995g(xmlPullParser, "id");
                if (strM18995g6 != null) {
                    String strM18995g7 = C10129a.m18995g(xmlPullParser, "origin");
                    if (strM18995g7 != null) {
                        Pattern pattern = f46418r;
                        Matcher matcher3 = pattern.matcher(strM18995g7);
                        Pattern pattern2 = f46419s;
                        Matcher matcher4 = pattern2.matcher(strM18995g7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                f3 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f10 = Float.parseFloat(strGroup2) / 100.0f;
                                strM18995g2 = C10129a.m18995g(xmlPullParser, "extent");
                                if (strM18995g2 != null) {
                                    matcher = pattern.matcher(strM18995g2);
                                    matcher2 = pattern2.matcher(strM18995g2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            f11 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f12 = Float.parseFloat(strGroup4) / 100.0f;
                                        } catch (NumberFormatException unused) {
                                            C10145n.m19099g("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM18995g7));
                                            c8757e = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        C10145n.m19099g("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strM18995g7));
                                    } else if (cVar == null) {
                                        C10145n.m19099g("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM18995g7));
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i13 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i14 = Integer.parseInt(strGroup6);
                                            f11 = i13 / cVar.f46428a;
                                            f12 = i14 / cVar.f46429b;
                                        } catch (NumberFormatException unused2) {
                                            C10145n.m19099g("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strM18995g7));
                                            c8757e = null;
                                        }
                                    }
                                    strM18995g3 = C10129a.m18995g(xmlPullParser, "displayAlign");
                                    if (strM18995g3 != null) {
                                        strM383p3 = C0062b.m383p2(strM18995g3);
                                        strM383p3.getClass();
                                        if (!strM383p3.equals("center")) {
                                            f13 = (f12 / 2.0f) + f10;
                                            i10 = 1;
                                        } else if (strM383p3.equals("after")) {
                                            f13 = f10 + f12;
                                            i10 = 2;
                                        } else {
                                            i10 = 0;
                                            f13 = f10;
                                        }
                                    } else {
                                        i10 = 0;
                                        f13 = f10;
                                    }
                                    float f14 = 1.0f / aVar.f46424a;
                                    strM18995g4 = C10129a.m18995g(xmlPullParser, "writingMode");
                                    if (strM18995g4 != null) {
                                        strM383p2 = C0062b.m383p2(strM18995g4);
                                        strM383p2.getClass();
                                        switch (strM383p2) {
                                            case "tb":
                                            case "tblr":
                                                i11 = 2;
                                                break;
                                            case "tbrl":
                                                i11 = 1;
                                                break;
                                            default:
                                                i11 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i11 = Integer.MIN_VALUE;
                                    }
                                    c8757e = new C8757e(strM18995g6, f3, f13, 0, i10, f11, f12, 1, f14, i11);
                                } else {
                                    C10145n.m19099g("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                C10145n.m19099g("TtmlDecoder", "Ignoring region with malformed origin: ".concat(strM18995g7));
                            }
                        } else if (!matcher4.matches()) {
                            C10145n.m19099g("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(strM18995g7));
                        } else if (cVar == null) {
                            C10145n.m19099g("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM18995g7));
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i15 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i16 = Integer.parseInt(strGroup8);
                                float f15 = i15 / cVar.f46428a;
                                float f16 = i16 / cVar.f46429b;
                                f3 = f15;
                                f10 = f16;
                                strM18995g2 = C10129a.m18995g(xmlPullParser, "extent");
                                if (strM18995g2 != null) {
                                    matcher = pattern.matcher(strM18995g2);
                                    matcher2 = pattern2.matcher(strM18995g2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        f11 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f12 = Float.parseFloat(strGroup10) / 100.0f;
                                    } else if (matcher2.matches()) {
                                        C10145n.m19099g("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strM18995g7));
                                    } else if (cVar == null) {
                                        C10145n.m19099g("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strM18995g7));
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i17 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i18 = Integer.parseInt(strGroup12);
                                        f11 = i17 / cVar.f46428a;
                                        f12 = i18 / cVar.f46429b;
                                    }
                                    strM18995g3 = C10129a.m18995g(xmlPullParser, "displayAlign");
                                    if (strM18995g3 != null) {
                                        strM383p3 = C0062b.m383p2(strM18995g3);
                                        strM383p3.getClass();
                                        if (!strM383p3.equals("center")) {
                                            f13 = (f12 / 2.0f) + f10;
                                            i10 = 1;
                                        } else if (strM383p3.equals("after")) {
                                            i10 = 0;
                                            f13 = f10;
                                        } else {
                                            f13 = f10 + f12;
                                            i10 = 2;
                                        }
                                    } else {
                                        i10 = 0;
                                        f13 = f10;
                                    }
                                    float f17 = 1.0f / aVar.f46424a;
                                    strM18995g4 = C10129a.m18995g(xmlPullParser, "writingMode");
                                    if (strM18995g4 != null) {
                                        strM383p2 = C0062b.m383p2(strM18995g4);
                                        strM383p2.getClass();
                                        switch (strM383p2) {
                                            case 3694:
                                                if (!strM383p2.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (!strM383p2.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (!strM383p2.equals("tbrl")) {
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        /*  JADX ERROR: Method code generation error
                                            java.lang.NullPointerException: Switch insn not found in header
                                            	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 630
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: p361ra.C8755c.m16996n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, ra.c$a, ra.c$c, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
                                    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
                                    /* JADX INFO: renamed from: o */
                                    public static C8756d m16997o(XmlPullParser xmlPullParser, C8756d c8756d, HashMap map, b bVar) throws SubtitleDecoderException {
                                        long j10;
                                        long j11;
                                        byte b10;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C8758f c8758fM16998p = m16998p(xmlPullParser, null);
                                        String[] strArr = null;
                                        String strSubstring = null;
                                        String str = "";
                                        long jM16999q = -9223372036854775807L;
                                        long jM16999q2 = -9223372036854775807L;
                                        long jM16999q3 = -9223372036854775807L;
                                        for (int i10 = 0; i10 < attributeCount; i10++) {
                                            String attributeName = xmlPullParser.getAttributeName(i10);
                                            String attributeValue = xmlPullParser.getAttributeValue(i10);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    b10 = 0;
                                                    break;
                                                case "dur":
                                                    b10 = 1;
                                                    break;
                                                case "end":
                                                    b10 = 2;
                                                    break;
                                                case "begin":
                                                    b10 = 3;
                                                    break;
                                                case "style":
                                                    b10 = 4;
                                                    break;
                                                case "backgroundImage":
                                                    b10 = 5;
                                                    break;
                                                default:
                                                    b10 = -1;
                                                    break;
                                            }
                                            if (b10 != 0) {
                                                if (b10 == 1) {
                                                    jM16999q3 = m16999q(attributeValue, bVar);
                                                } else if (b10 == 2) {
                                                    jM16999q2 = m16999q(attributeValue, bVar);
                                                } else if (b10 == 3) {
                                                    jM16999q = m16999q(attributeValue, bVar);
                                                } else if (b10 == 4) {
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i11 = C10134c0.f51354a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                    }
                                                } else if (b10 == 5 && attributeValue.startsWith("#")) {
                                                    strSubstring = attributeValue.substring(1);
                                                }
                                            } else if (map.containsKey(attributeValue)) {
                                                str = attributeValue;
                                            }
                                        }
                                        if (c8756d != null) {
                                            long j12 = c8756d.f46433d;
                                            j10 = -9223372036854775807L;
                                            if (j12 != -9223372036854775807L) {
                                                if (jM16999q != -9223372036854775807L) {
                                                    jM16999q += j12;
                                                }
                                                if (jM16999q2 != -9223372036854775807L) {
                                                    jM16999q2 += j12;
                                                }
                                            }
                                        } else {
                                            j10 = -9223372036854775807L;
                                        }
                                        if (jM16999q2 != j10) {
                                            j11 = jM16999q2;
                                        } else if (jM16999q3 != j10) {
                                            j11 = jM16999q + jM16999q3;
                                        } else if (c8756d != null) {
                                            long j13 = c8756d.f46434e;
                                            if (j13 != j10) {
                                                j11 = j13;
                                            } else {
                                                j11 = jM16999q2;
                                            }
                                        } else {
                                            j11 = jM16999q2;
                                        }
                                        return new C8756d(xmlPullParser.getName(), null, jM16999q, j11, c8758fM16998p, strArr, str, strSubstring, c8756d);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
                                    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
                                    /* JADX WARN: Code duplicated, block: B:153:0x024f  */
                                    /* JADX WARN: Code duplicated, block: B:88:0x0157  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX INFO: renamed from: p */
                                    public static C8758f m16998p(XmlPullParser xmlPullParser, C8758f c8758f) {
                                        float fMin;
                                        C8754b c8754b;
                                        byte b10;
                                        Object[] objArr;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        for (int i10 = 0; i10 < attributeCount; i10++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i10);
                                            String attributeName = xmlPullParser.getAttributeName(i10);
                                            attributeName.getClass();
                                            int i11 = 3;
                                            int i12 = -1;
                                            byte b11 = 1;
                                            switch (attributeName) {
                                                case "fontStyle":
                                                    c8758f = m16990h(c8758f);
                                                    c8758f.f46461i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "fontFamily":
                                                    c8758f = m16990h(c8758f);
                                                    c8758f.f46453a = attributeValue;
                                                    break;
                                                case "textAlign":
                                                    c8758f = m16990h(c8758f);
                                                    c8758f.f46467o = m16992j(attributeValue);
                                                    break;
                                                case "textDecoration":
                                                    String strM383p2 = C0062b.m383p2(attributeValue);
                                                    strM383p2.getClass();
                                                    strM383p2.hashCode();
                                                    switch (strM383p2) {
                                                        case "nounderline":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46459g = 0;
                                                            break;
                                                        case "underline":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46459g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46458f = 0;
                                                            break;
                                                        case "linethrough":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46458f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case "fontWeight":
                                                    c8758f = m16990h(c8758f);
                                                    c8758f.f46460h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case "id":
                                                    if (!"style".equals(xmlPullParser.getName())) {
                                                        break;
                                                    } else {
                                                        c8758f = m16990h(c8758f);
                                                        c8758f.f46464l = attributeValue;
                                                        break;
                                                    }
                                                    break;
                                                case "ruby":
                                                    String strM383p3 = C0062b.m383p2(attributeValue);
                                                    strM383p3.getClass();
                                                    strM383p3.hashCode();
                                                    switch (strM383p3) {
                                                        case "baseContainer":
                                                        case "base":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46465m = 2;
                                                            break;
                                                        case "container":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46465m = 1;
                                                            break;
                                                        case "delimiter":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46465m = 4;
                                                            break;
                                                        case "textContainer":
                                                        case "text":
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46465m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case "color":
                                                    c8758f = m16990h(c8758f);
                                                    try {
                                                        c8758f.f46454b = C10135d.m19061a(attributeValue, false);
                                                        c8758f.f46455c = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused) {
                                                        C0141b.m622r("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "shear":
                                                    c8758f = m16990h(c8758f);
                                                    Matcher matcher = f46417q.matcher(attributeValue);
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                            break;
                                                        } catch (NumberFormatException e10) {
                                                            C10145n.m19100h("TtmlDecoder", "Failed to parse shear: " + attributeValue, e10);
                                                            fMin = Float.MAX_VALUE;
                                                        }
                                                        c8758f.f46471s = fMin;
                                                        break;
                                                    } else {
                                                        C0141b.m622r("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                    }
                                                    fMin = Float.MAX_VALUE;
                                                    c8758f.f46471s = fMin;
                                                    break;
                                                case "textCombine":
                                                    String strM383p4 = C0062b.m383p2(attributeValue);
                                                    strM383p4.getClass();
                                                    if (!strM383p4.equals("all")) {
                                                        if (strM383p4.equals("none")) {
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46469q = 0;
                                                        }
                                                        break;
                                                    } else {
                                                        c8758f = m16990h(c8758f);
                                                        c8758f.f46469q = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "fontSize":
                                                    try {
                                                        c8758f = m16990h(c8758f);
                                                        m16994l(attributeValue, c8758f);
                                                        break;
                                                    } catch (SubtitleDecoderException unused2) {
                                                        C0141b.m622r("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "textEmphasis":
                                                    c8758f = m16990h(c8758f);
                                                    Pattern pattern = C8754b.f46406d;
                                                    if (attributeValue == null) {
                                                        c8754b = null;
                                                    } else {
                                                        String strM383p5 = C0062b.m383p2(attributeValue.trim());
                                                        if (strM383p5.isEmpty()) {
                                                            c8754b = null;
                                                        } else {
                                                            ImmutableSet immutableSetM9080U = ImmutableSet.m9080U(TextUtils.split(strM383p5, C8754b.f46406d));
                                                            C3179b0 c3179b0 = new C3179b0(C3183d0.m9128d(C8754b.f46410h, immutableSetM9080U));
                                                            String str = (String) (c3179b0.hasNext() ? c3179b0.next() : "outside");
                                                            int iHashCode = str.hashCode();
                                                            if (iHashCode != -1392885889) {
                                                                if (iHashCode != -1106037339) {
                                                                    if (iHashCode == 92734940 && str.equals("after")) {
                                                                        b10 = 0;
                                                                    } else {
                                                                        b10 = -1;
                                                                    }
                                                                } else if (str.equals("outside")) {
                                                                    b10 = 1;
                                                                } else {
                                                                    b10 = -1;
                                                                }
                                                            } else if (str.equals("before")) {
                                                                b10 = 2;
                                                            } else {
                                                                b10 = -1;
                                                            }
                                                            int i13 = b10 != 0 ? b10 != 1 ? 1 : -2 : 2;
                                                            C3181c0 c3181c0M9128d = C3183d0.m9128d(C8754b.f46407e, immutableSetM9080U);
                                                            if (c3181c0M9128d.isEmpty()) {
                                                                C3181c0 c3181c0M9128d2 = C3183d0.m9128d(C8754b.f46409g, immutableSetM9080U);
                                                                C3181c0 c3181c0M9128d3 = C3183d0.m9128d(C8754b.f46408f, immutableSetM9080U);
                                                                if (c3181c0M9128d2.isEmpty() && c3181c0M9128d3.isEmpty()) {
                                                                    c8754b = new C8754b(-1, 0, i13);
                                                                } else {
                                                                    C3179b0 c3179b1 = new C3179b0(c3181c0M9128d2);
                                                                    String str2 = (String) (c3179b1.hasNext() ? c3179b1.next() : "filled");
                                                                    int iHashCode2 = str2.hashCode();
                                                                    if (iHashCode2 != -1274499742) {
                                                                        if (iHashCode2 == 3417674 && str2.equals("open")) {
                                                                            objArr = 0;
                                                                        } else {
                                                                            objArr = -1;
                                                                        }
                                                                    } else if (str2.equals("filled")) {
                                                                        objArr = 1;
                                                                    } else {
                                                                        objArr = -1;
                                                                    }
                                                                    int i14 = objArr != 0 ? 1 : 2;
                                                                    C3179b0 c3179b2 = new C3179b0(c3181c0M9128d3);
                                                                    String str3 = (String) (c3179b2.hasNext() ? c3179b2.next() : "circle");
                                                                    int iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != -1360216880) {
                                                                        if (iHashCode3 != -905816648) {
                                                                            if (iHashCode3 == 99657 && str3.equals("dot")) {
                                                                                i12 = 0;
                                                                            }
                                                                        } else if (str3.equals("sesame")) {
                                                                            i12 = 1;
                                                                        }
                                                                    } else if (str3.equals("circle")) {
                                                                        i12 = 2;
                                                                    }
                                                                    if (i12 == 0) {
                                                                        i11 = 2;
                                                                    } else if (i12 != 1) {
                                                                        i11 = 1;
                                                                    }
                                                                    c8754b = new C8754b(i11, i14, i13);
                                                                }
                                                            } else {
                                                                String str4 = (String) new C3179b0(c3181c0M9128d).next();
                                                                int iHashCode4 = str4.hashCode();
                                                                if (iHashCode4 != 3005871) {
                                                                    if (iHashCode4 == 3387192 && str4.equals("none")) {
                                                                        b11 = 0;
                                                                    } else {
                                                                        b11 = -1;
                                                                    }
                                                                } else if (!str4.equals("auto")) {
                                                                    b11 = -1;
                                                                }
                                                                c8754b = new C8754b(b11 == 0 ? 0 : -1, 0, i13);
                                                            }
                                                        }
                                                    }
                                                    c8758f.f46470r = c8754b;
                                                    break;
                                                case "rubyPosition":
                                                    String strM383p6 = C0062b.m383p2(attributeValue);
                                                    strM383p6.getClass();
                                                    if (!strM383p6.equals("before")) {
                                                        if (strM383p6.equals("after")) {
                                                            c8758f = m16990h(c8758f);
                                                            c8758f.f46466n = 2;
                                                        }
                                                        break;
                                                    } else {
                                                        c8758f = m16990h(c8758f);
                                                        c8758f.f46466n = 1;
                                                        break;
                                                    }
                                                    break;
                                                case "backgroundColor":
                                                    c8758f = m16990h(c8758f);
                                                    try {
                                                        c8758f.f46456d = C10135d.m19061a(attributeValue, false);
                                                        c8758f.f46457e = true;
                                                        break;
                                                    } catch (IllegalArgumentException unused3) {
                                                        C0141b.m622r("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                        break;
                                                    }
                                                    break;
                                                case "multiRowAlign":
                                                    c8758f = m16990h(c8758f);
                                                    c8758f.f46468p = m16992j(attributeValue);
                                                    break;
                                            }
                                        }
                                        return c8758f;
                                    }

                                    /* JADX INFO: renamed from: q */
                                    public static long m16999q(String str, b bVar) throws SubtitleDecoderException {
                                        double d10;
                                        double d11;
                                        Matcher matcher = f46414n.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d12 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d14 = d13 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / bVar.f46425a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) bVar.f46426b)) / ((double) bVar.f46425a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = f46415o.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new SubtitleDecoderException(C0204c.m852k("Malformed time expression: ", str));
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d17 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        strGroup8.hashCode();
                                        switch (strGroup8) {
                                            case "f":
                                                d10 = bVar.f46425a;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            case "h":
                                                d11 = 3600.0d;
                                                break;
                                            case "m":
                                                d11 = 60.0d;
                                                break;
                                            case "t":
                                                d10 = bVar.f46427c;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            case "ms":
                                                d10 = 1000.0d;
                                                d17 /= d10;
                                                return (long) (d17 * 1000000.0d);
                                            default:
                                                return (long) (d17 * 1000000.0d);
                                        }
                                        d17 *= d11;
                                        return (long) (d17 * 1000000.0d);
                                    }

                                    /* JADX INFO: renamed from: r */
                                    public static c m17000r(XmlPullParser xmlPullParser) {
                                        String strM18995g = C10129a.m18995g(xmlPullParser, "extent");
                                        if (strM18995g == null) {
                                            return null;
                                        }
                                        Matcher matcher = f46419s.matcher(strM18995g);
                                        if (!matcher.matches()) {
                                            C10145n.m19099g("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strM18995g));
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i10 = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new c(i10, Integer.parseInt(strGroup2));
                                        } catch (NumberFormatException unused) {
                                            C10145n.m19099g("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strM18995g));
                                            return null;
                                        }
                                    }

                                    @Override // p219ka.AbstractC6645f
                                    /* JADX INFO: renamed from: g */
                                    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
                                        a aVar;
                                        b bVar;
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.f46423m.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new C8757e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            c cVarM17000r = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            b bVarM16995m = f46421u;
                                            a aVar2 = f46422v;
                                            int i11 = 0;
                                            C8759g c8759g = null;
                                            a aVarM16993k = aVar2;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                C8756d c8756d = (C8756d) arrayDeque.peek();
                                                if (i11 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if ("tt".equals(name)) {
                                                            bVarM16995m = m16995m(xmlPullParserNewPullParser);
                                                            aVarM16993k = m16993k(xmlPullParserNewPullParser, aVar2);
                                                            cVarM17000r = m17000r(xmlPullParserNewPullParser);
                                                        }
                                                        a aVar3 = aVarM16993k;
                                                        c cVar = cVarM17000r;
                                                        b bVar2 = bVarM16995m;
                                                        if (!m16991i(name)) {
                                                            C10145n.m19098f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                            i11++;
                                                            aVar = aVar3;
                                                            bVar = bVar2;
                                                        } else if ("head".equals(name)) {
                                                            aVar = aVar3;
                                                            bVar = bVar2;
                                                            m16996n(xmlPullParserNewPullParser, map, aVar3, cVar, map2, map3);
                                                        } else {
                                                            aVar = aVar3;
                                                            bVar = bVar2;
                                                            try {
                                                                C8756d c8756dM16997o = m16997o(xmlPullParserNewPullParser, c8756d, map2, bVar);
                                                                arrayDeque.push(c8756dM16997o);
                                                                if (c8756d != null) {
                                                                    if (c8756d.f46442m == null) {
                                                                        c8756d.f46442m = new ArrayList();
                                                                    }
                                                                    c8756d.f46442m.add(c8756dM16997o);
                                                                }
                                                            } catch (SubtitleDecoderException e10) {
                                                                C10145n.m19100h("TtmlDecoder", "Suppressing parser error", e10);
                                                                i11++;
                                                            }
                                                        }
                                                        aVarM16993k = aVar;
                                                        bVarM16995m = bVar;
                                                        cVarM17000r = cVar;
                                                    } else if (eventType == 4) {
                                                        c8756d.getClass();
                                                        C8756d c8756dM17001a = C8756d.m17001a(xmlPullParserNewPullParser.getText());
                                                        if (c8756d.f46442m == null) {
                                                            c8756d.f46442m = new ArrayList();
                                                        }
                                                        c8756d.f46442m.add(c8756dM17001a);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                            C8756d c8756d2 = (C8756d) arrayDeque.peek();
                                                            c8756d2.getClass();
                                                            c8759g = new C8759g(c8756d2, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i11++;
                                                } else if (eventType == 3) {
                                                    i11--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (c8759g != null) {
                                                return c8759g;
                                            }
                                            throw new SubtitleDecoderException("No TTML subtitles found");
                                        } catch (IOException e11) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e11);
                                        } catch (XmlPullParserException e12) {
                                            throw new SubtitleDecoderException("Unable to decode source", e12);
                                        }
                                    }
                                }
