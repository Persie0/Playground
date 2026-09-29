package p000;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class la1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f49355a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f49356b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f49357c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d */
    public static final HashMap f49358d;

    static {
        HashMap map = new HashMap();
        f49358d = map;
        AbstractC3393o1.m17750y(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        AbstractC3393o1.m17750y(-983041, map, "azure", -657956, "beige");
        AbstractC3393o1.m17750y(-6972, map, "bisque", -16777216, "black");
        AbstractC3393o1.m17750y(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC3393o1.m17750y(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC3393o1.m17750y(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC3393o1.m17750y(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC3393o1.m17750y(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC3393o1.m17750y(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        AbstractC3393o1.m17750y(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        AbstractC3393o1.m17750y(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC3393o1.m17750y(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC3393o1.m17750y(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC3393o1.m17750y(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        AbstractC3393o1.m17750y(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        AbstractC3393o1.m17750y(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        AbstractC3393o1.m17750y(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC3393o1.m17750y(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        AbstractC3393o1.m17750y(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC3393o1.m17750y(-11861886, map, "indigo", -16, "ivory");
        AbstractC3393o1.m17750y(-989556, map, "khaki", -1644806, "lavender");
        AbstractC3393o1.m17750y(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC3393o1.m17750y(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC3393o1.m17750y(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC3393o1.m17750y(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC3393o1.m17750y(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        AbstractC3393o1.m17750y(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC3393o1.m17750y(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC3393o1.m17750y(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC3393o1.m17750y(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC3393o1.m17750y(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC3393o1.m17750y(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC3393o1.m17750y(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC3393o1.m17750y(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC3393o1.m17750y(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC3393o1.m17750y(-133658, map, "oldlace", -8355840, "olive");
        AbstractC3393o1.m17750y(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC3393o1.m17750y(-47872, map, "orangered", -2461482, "orchid");
        AbstractC3393o1.m17750y(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC3393o1.m17750y(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC3393o1.m17750y(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC3393o1.m17750y(-3308225, map, "peru", -16181, "pink");
        AbstractC3393o1.m17750y(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC3393o1.m17750y(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC3393o1.m17750y(-65536, map, "red", -4419697, "rosybrown");
        AbstractC3393o1.m17750y(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC3393o1.m17750y(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC3393o1.m17750y(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC3393o1.m17750y(-6270419, map, "sienna", -4144960, "silver");
        AbstractC3393o1.m17750y(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        AbstractC3393o1.m17750y(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC3393o1.m17750y(-16744320, map, "teal", -2572328, "thistle");
        AbstractC3393o1.m17750y(-40121, map, "tomato", 0, "transparent");
        AbstractC3393o1.m17750y(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC3393o1.m17750y(-663885, map, "wheat", -1, "white");
        AbstractC3393o1.m17750y(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* JADX INFO: renamed from: a */
    public static int m16038a(String str, boolean z) {
        int i;
        bna.m3969q(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            ij6.m13959q();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f49357c : f49356b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f49355a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f49358d.get(AbstractC3584sr.m21625f0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        ij6.m13959q();
        return 0;
    }
}
