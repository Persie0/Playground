package p000;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dyc {

    /* JADX INFO: renamed from: a */
    public static final String[] f36431a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f36432b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f36433c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static rr3 m10753a(String str) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!dcd.m10290d(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m2516a(null, "Couldn't find xmp metadata");
        }
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            i = 1;
            if (dcd.m10290d(xmlPullParserNewPullParser, "rdf:Description")) {
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String strM10288b = dcd.m10288b(xmlPullParserNewPullParser, f36431a[i3]);
                    if (strM10288b != null) {
                        if (Integer.parseInt(strM10288b) != 1) {
                            break loop0;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 < 4) {
                                String strM10288b2 = dcd.m10288b(xmlPullParserNewPullParser, f36432b[i4]);
                                if (strM10288b2 != null) {
                                    j = Long.parseLong(strM10288b2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i4++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i2 >= 2) {
                                immutableListM6289v = ImmutableList.m6289v();
                                break;
                            }
                            String strM10288b3 = dcd.m10288b(xmlPullParserNewPullParser, f36433c[i2]);
                            if (strM10288b3 != null) {
                                immutableListM6289v = ImmutableList.m6280B(new j36(0L, 0L, "image/jpeg"), new j36(Long.parseLong(strM10288b3), 0L, "video/mp4"));
                                break;
                            }
                            i2++;
                        }
                    }
                }
                return null;
            }
            if (dcd.m10290d(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListM6289v = m10754b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (dcd.m10290d(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListM6289v = m10754b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!dcd.m10289c(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListM6289v.isEmpty()) {
            break loop0;
        }
        return new rr3(j, immutableListM6289v, i);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList m10754b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        c14 c14VarM6284m = ImmutableList.m6284m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (dcd.m10290d(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM10288b = dcd.m10288b(xmlPullParser, strConcat3);
                String strM10288b2 = dcd.m10288b(xmlPullParser, strConcat4);
                String strM10288b3 = dcd.m10288b(xmlPullParser, strConcat5);
                String strM10288b4 = dcd.m10288b(xmlPullParser, strConcat6);
                if (strM10288b == null || strM10288b2 == null) {
                    return ImmutableList.m6289v();
                }
                c14VarM6284m.m3157b(new j36(strM10288b3 != null ? Long.parseLong(strM10288b3) : 0L, strM10288b4 != null ? Long.parseLong(strM10288b4) : 0L, strM10288b));
            }
        } while (!dcd.m10289c(xmlPullParser, strConcat2));
        return c14VarM6284m.m4280g();
    }
}
