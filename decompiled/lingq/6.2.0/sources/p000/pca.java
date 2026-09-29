package p000;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.C1100p;
import com.google.common.collect.ImmutableSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class pca implements cn9 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f55952b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f55953c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d */
    public static final Pattern f55954d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f55955e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f */
    public static final Pattern f55956f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f55957g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h */
    public static final Pattern f55958h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i */
    public static final on8 f55959i = new on8(1, 30.0f, 1);

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f55960a;

    public pca() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f55960a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            ij6.m13958p("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static rca m19063a(rca rcaVar) {
        return rcaVar == null ? new rca() : rcaVar;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19064b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: c */
    public static int m19065c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f55958h.matcher(attributeValue);
        if (!matcher.matches()) {
            ss5.m21707d0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            bna.m3961m(i, i2, "Invalid cell resolution %s %s", z);
            return i2;
        } catch (NumberFormatException unused) {
            ss5.m21707d0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19066d(String str, rca rcaVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = uma.f64080a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f55954d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(wq1.m24123s(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            ss5.m21707d0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(wq1.m24118n("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                rcaVar.f59084j = 3;
                break;
            case "em":
                rcaVar.f59084j = 2;
                break;
            case "px":
                rcaVar.f59084j = 1;
                break;
            default:
                throw new SubtitleDecoderException(wq1.m24118n("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        rcaVar.f59085k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: e */
    public static on8 m19067e(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = uma.f64080a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            bna.m3967p("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        on8 on8Var = f55959i;
        int i2 = on8Var.f54622b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = on8Var.f54623c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new on8(i2, i * f, i3);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: f */
    public static void m19068f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, p000.qg3 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pca.m19068f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, qg3, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    /* JADX INFO: renamed from: g */
    public static oca m19069g(XmlPullParser xmlPullParser, oca ocaVar, HashMap map, on8 on8Var) throws SubtitleDecoderException {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        rca rcaVarM19070h = m19070h(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jM19071j = -9223372036854775807L;
        long jM19071j2 = -9223372036854775807L;
        long jM19071j3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jM19071j3 = m19071j(attributeValue, on8Var);
                    break;
                case "end":
                    jM19071j2 = m19071j(attributeValue, on8Var);
                    break;
                case "begin":
                    jM19071j = m19071j(attributeValue, on8Var);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = uma.f64080a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ocaVar != null) {
            long j2 = ocaVar.f54182d;
            if (j2 != -9223372036854775807L) {
                if (jM19071j != -9223372036854775807L) {
                    jM19071j += j2;
                }
                if (jM19071j2 != -9223372036854775807L) {
                    jM19071j2 += j2;
                }
            }
        }
        if (jM19071j2 != -9223372036854775807L) {
            j = jM19071j2;
        } else {
            if (jM19071j3 != -9223372036854775807L) {
                jM19071j2 = jM19071j + jM19071j3;
            } else if (ocaVar != null) {
                long j3 = ocaVar.f54183e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jM19071j2;
        }
        return new oca(xmlPullParser.getName(), null, jM19071j, j, rcaVarM19070h, strArr, str, strSubstring, ocaVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0213  */
    /* JADX WARN: Code duplicated, block: B:147:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:161:0x0263  */
    /* JADX WARN: Code duplicated, block: B:163:0x0270  */
    /* JADX WARN: Code duplicated, block: B:164:0x0275  */
    /* JADX WARN: Code duplicated, block: B:167:0x0281  */
    /* JADX WARN: Code duplicated, block: B:170:0x0287  */
    /* JADX WARN: Code duplicated, block: B:173:0x0291  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:191:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX INFO: renamed from: h */
    public static rca m19070h(XmlPullParser xmlPullParser, rca rcaVar) {
        byte b;
        int i;
        c09 c09VarM20265e;
        c09 c09VarM20265e2;
        c09 c09VarM20265e3;
        C1100p c1100p;
        Object next;
        String str;
        int iHashCode;
        C1100p c1100p2;
        Object next2;
        String str2;
        int iHashCode2;
        int i2;
        bu9 bu9Var;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        rca rcaVarM19063a = rcaVar;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = 13;
                    break;
                case "rubyPosition":
                    b = 14;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    rcaVarM19063a.f59083i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    rcaVarM19063a.f59095u = attributeValue;
                    break;
                case 2:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    rcaVarM19063a.f59075a = attributeValue;
                    break;
                case 3:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    String strM21625f0 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f0.getClass();
                    switch (strM21625f0) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    rcaVarM19063a.f59089o = alignment;
                    break;
                case 4:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    rcaVarM19063a.f59094t = attributeValue;
                    break;
                case 5:
                    String strM21625f1 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f1.getClass();
                    switch (strM21625f1) {
                        case "nounderline":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59081g = 0;
                            break;
                        case "underline":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59081g = 1;
                            break;
                        case "nolinethrough":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59080f = 0;
                            break;
                        case "linethrough":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59080f = 1;
                            break;
                    }
                    break;
                case 6:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    rcaVarM19063a.f59082h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        rcaVarM19063a.f59086l = attributeValue;
                    }
                    break;
                case 8:
                    String strM21625f2 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f2.getClass();
                    switch (strM21625f2) {
                        case "baseContainer":
                        case "base":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59087m = 2;
                            break;
                        case "container":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59087m = 1;
                            break;
                        case "delimiter":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59087m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            rcaVarM19063a = m19063a(rcaVarM19063a);
                            rcaVarM19063a.f59087m = 3;
                            break;
                    }
                    break;
                case 9:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    try {
                        rcaVarM19063a.f59076b = la1.m16038a(attributeValue, false);
                        rcaVarM19063a.f59077c = true;
                    } catch (IllegalArgumentException unused) {
                        hn1.m13365o("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    rca rcaVarM19063a2 = m19063a(rcaVarM19063a);
                    Matcher matcher = f55955e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            ss5.m21709e0("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        hn1.m13365o("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    rcaVarM19063a2.f59093s = fMin;
                    rcaVarM19063a = rcaVarM19063a2;
                    break;
                case 11:
                    String strM21625f3 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f3.getClass();
                    if (strM21625f3.equals("all")) {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        rcaVarM19063a.f59091q = 1;
                    } else if (strM21625f3.equals("none")) {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        rcaVarM19063a.f59091q = 0;
                    }
                    break;
                case 12:
                    try {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        m19066d(attributeValue, rcaVarM19063a);
                    } catch (SubtitleDecoderException unused2) {
                        hn1.m13365o("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    Pattern pattern = bu9.f9027d;
                    if (attributeValue == null) {
                        bu9Var = null;
                    } else {
                        String strM21625f4 = AbstractC3584sr.m21625f0(attributeValue.trim());
                        if (strM21625f4.isEmpty()) {
                            bu9Var = null;
                        } else {
                            ImmutableSet immutableSetM6309o = ImmutableSet.m6309o(TextUtils.split(strM21625f4, bu9.f9027d));
                            C1100p c1100p3 = new C1100p(r2d.m20265e(bu9.f9031h, immutableSetM6309o));
                            String str4 = (String) (c1100p3.hasNext() ? c1100p3.next() : "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i = -2;
                                }
                                c09VarM20265e = r2d.m20265e(bu9.f9028e, immutableSetM6309o);
                                if (c09VarM20265e.isEmpty()) {
                                    c09VarM20265e2 = r2d.m20265e(bu9.f9030g, immutableSetM6309o);
                                    c09VarM20265e3 = r2d.m20265e(bu9.f9029f, immutableSetM6309o);
                                    if (c09VarM20265e2.isEmpty() || !c09VarM20265e3.isEmpty()) {
                                        c1100p = new C1100p(c09VarM20265e2);
                                        if (c1100p.hasNext()) {
                                            next = c1100p.next();
                                        } else {
                                            next = "filled";
                                        }
                                        str = (String) next;
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i4 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            c1100p2 = new C1100p(c09VarM20265e3);
                                            if (c1100p2.hasNext()) {
                                                next2 = c1100p2.next();
                                            } else {
                                                next2 = "circle";
                                            }
                                            str2 = (String) next2;
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i2 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i2 = 3;
                                                }
                                                bu9Var = new bu9(i2, i4, i);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i2 = 1;
                                            bu9Var = new bu9(i2, i4, i);
                                        } else {
                                            str.equals("filled");
                                        }
                                        c1100p2 = new C1100p(c09VarM20265e3);
                                        if (c1100p2.hasNext()) {
                                            next2 = c1100p2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bu9Var = new bu9(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bu9Var = new bu9(i2, i4, i);
                                    } else {
                                        bu9Var = new bu9(-1, 0, i);
                                    }
                                } else {
                                    str3 = (String) new C1100p(c09VarM20265e).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i5 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        bu9Var = new bu9(i5, 0, i);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    bu9Var = new bu9(i5, 0, i);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i = 1;
                            c09VarM20265e = r2d.m20265e(bu9.f9028e, immutableSetM6309o);
                            if (c09VarM20265e.isEmpty()) {
                                str3 = (String) new C1100p(c09VarM20265e).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    bu9Var = new bu9(i5, 0, i);
                                } else {
                                    str3.equals("auto");
                                }
                                bu9Var = new bu9(i5, 0, i);
                            } else {
                                c09VarM20265e2 = r2d.m20265e(bu9.f9030g, immutableSetM6309o);
                                c09VarM20265e3 = r2d.m20265e(bu9.f9029f, immutableSetM6309o);
                                if (c09VarM20265e2.isEmpty()) {
                                    c1100p = new C1100p(c09VarM20265e2);
                                    if (c1100p.hasNext()) {
                                        next = c1100p.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        c1100p2 = new C1100p(c09VarM20265e3);
                                        if (c1100p2.hasNext()) {
                                            next2 = c1100p2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bu9Var = new bu9(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bu9Var = new bu9(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    c1100p2 = new C1100p(c09VarM20265e3);
                                    if (c1100p2.hasNext()) {
                                        next2 = c1100p2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        bu9Var = new bu9(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    bu9Var = new bu9(i2, i4, i);
                                } else {
                                    c1100p = new C1100p(c09VarM20265e2);
                                    if (c1100p.hasNext()) {
                                        next = c1100p.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        c1100p2 = new C1100p(c09VarM20265e3);
                                        if (c1100p2.hasNext()) {
                                            next2 = c1100p2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bu9Var = new bu9(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bu9Var = new bu9(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    c1100p2 = new C1100p(c09VarM20265e3);
                                    if (c1100p2.hasNext()) {
                                        next2 = c1100p2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        bu9Var = new bu9(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    bu9Var = new bu9(i2, i4, i);
                                }
                            }
                        }
                    }
                    rcaVarM19063a.f59092r = bu9Var;
                    break;
                case 14:
                    String strM21625f5 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f5.getClass();
                    if (strM21625f5.equals("before")) {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        rcaVarM19063a.f59088n = 1;
                    } else if (strM21625f5.equals("after")) {
                        rcaVarM19063a = m19063a(rcaVarM19063a);
                        rcaVarM19063a.f59088n = 2;
                    }
                    break;
                case 15:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    try {
                        rcaVarM19063a.f59078d = la1.m16038a(attributeValue, false);
                        rcaVarM19063a.f59079e = true;
                    } catch (IllegalArgumentException unused3) {
                        hn1.m13365o("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    rcaVarM19063a = m19063a(rcaVarM19063a);
                    String strM21625f6 = AbstractC3584sr.m21625f0(attributeValue);
                    strM21625f6.getClass();
                    switch (strM21625f6) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    rcaVarM19063a.f59090p = alignment;
                    break;
            }
        }
        return rcaVarM19063a;
    }

    /* JADX INFO: renamed from: j */
    public static long m19071j(String str, on8 on8Var) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = f55952b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d3 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d5 = d4 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / on8Var.f54621a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) on8Var.f54622b)) / ((double) on8Var.f54621a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f55953c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(AbstractC3393o1.m17734i("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d8 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d = on8Var.f54621a;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = on8Var.f54623c;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            default:
                return (long) (d8 * 1000000.0d);
        }
        d8 *= d2;
        return (long) (d8 * 1000000.0d);
    }

    /* JADX INFO: renamed from: k */
    public static qg3 m19072k(XmlPullParser xmlPullParser) {
        String strM10288b = dcd.m10288b(xmlPullParser, "extent");
        if (strM10288b == null) {
            return null;
        }
        Matcher matcher = f55957g.matcher(strM10288b);
        if (!matcher.matches()) {
            ss5.m21707d0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM10288b));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new qg3(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            ss5.m21707d0("TtmlParser", "Ignoring malformed tts extent: ".concat(strM10288b));
            return null;
        }
    }

    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public final void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        wm9 wm9VarMo4903i = mo4903i(bArr, i, i2);
        int i3 = 0;
        while (true) {
            ca1 ca1Var = (ca1) wm9VarMo4903i;
            if (i3 >= ca1Var.mo4454l()) {
                return;
            }
            long jMo4447c = ca1Var.mo4447c(i3);
            List listMo4453i = ca1Var.mo4453i(jMo4447c);
            if (!((ArrayList) listMo4453i).isEmpty()) {
                if (i3 == ca1Var.mo4454l() - 1) {
                    uk9.m22770c();
                    return;
                } else {
                    long jMo4447c2 = ca1Var.mo4447c(i3 + 1) - ca1Var.mo4447c(i3);
                    if (jMo4447c2 > 0) {
                        kk1Var.accept(new gs1(jMo4447c, jMo4447c2, listMo4453i));
                    }
                }
            }
            i3++;
        }
    }

    @Override // p000.cn9
    /* JADX INFO: renamed from: i */
    public final wm9 mo4903i(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f55960a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new qca("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            qg3 qg3VarM19072k = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            on8 on8VarM19067e = f55959i;
            int i3 = 0;
            int iM19065c = 15;
            ca1 ca1Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                oca ocaVar = (oca) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            on8VarM19067e = m19067e(xmlPullParserNewPullParser);
                            iM19065c = m19065c(xmlPullParserNewPullParser);
                            qg3VarM19072k = m19072k(xmlPullParserNewPullParser);
                        }
                        on8 on8Var = on8VarM19067e;
                        qg3 qg3Var = qg3VarM19072k;
                        int i4 = iM19065c;
                        if (m19064b(name)) {
                            if ("head".equals(name)) {
                                m19068f(xmlPullParserNewPullParser, map, i4, qg3Var, map2, map3);
                            } else {
                                try {
                                    oca ocaVarM19069g = m19069g(xmlPullParserNewPullParser, ocaVar, map2, on8Var);
                                    arrayDeque.push(ocaVarM19069g);
                                    if (ocaVar != null) {
                                        if (ocaVar.f54191m == null) {
                                            ocaVar.f54191m = new ArrayList();
                                        }
                                        ocaVar.f54191m.add(ocaVarM19069g);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    ss5.m21709e0("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            iM19065c = i4;
                            qg3VarM19072k = qg3Var;
                            on8VarM19067e = on8Var;
                        } else {
                            ss5.m21686M("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i3++;
                        iM19065c = i4;
                        qg3VarM19072k = qg3Var;
                        on8VarM19067e = on8Var;
                    } else if (eventType == 4) {
                        ocaVar.getClass();
                        oca ocaVarM17913a = oca.m17913a(xmlPullParserNewPullParser.getText());
                        if (ocaVar.f54191m == null) {
                            ocaVar.f54191m = new ArrayList();
                        }
                        ocaVar.f54191m.add(ocaVarM17913a);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            oca ocaVar2 = (oca) arrayDeque.peek();
                            ocaVar2.getClass();
                            ca1Var = new ca1(ocaVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            ca1Var.getClass();
            return ca1Var;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }
}
