package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dcd {
    /* JADX INFO: renamed from: a */
    public static final void m10287a(EmbeddedMessage embeddedMessage, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1462887294);
        int i2 = (tj3Var.m22124i(embeddedMessage) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            r46.m20382g(c99.m4429v(c99.m4412e(e16Var, 1.0f)), null, null, null, null, null, ci8.m4703P(-495457576, new op2(embeddedMessage, vi3Var, i3), tj3Var), tj3Var, 1572864, 62);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pp2(embeddedMessage, vi3Var, e16Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10288b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10289c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10290d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
