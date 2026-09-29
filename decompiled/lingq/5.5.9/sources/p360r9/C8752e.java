package p360r9;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p479xa.C10129a;

/* JADX INFO: renamed from: r9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8752e {

    /* JADX INFO: renamed from: a */
    public static final String[] f46403a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f46404b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f46405c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static C8749b m16988a(String str) throws XmlPullParserException, IOException {
        boolean z10;
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C10129a.m19000l(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m6770a("Couldn't find xmp metadata", null);
        }
        ImmutableList<C8749b.a> immutableListM9062Y = ImmutableList.m9062Y();
        long j11 = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (C10129a.m19000l(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f46403a;
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        String strM18995g = C10129a.m18995g(xmlPullParserNewPullParser, strArr[i10]);
                        if (strM18995g == null) {
                            i10++;
                        } else if (Integer.parseInt(strM18995g) == 1) {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = false;
                    break;
                }
                if (!z10) {
                    return null;
                }
                String[] strArr2 = f46404b;
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        String strM18995g2 = C10129a.m18995g(xmlPullParserNewPullParser, strArr2[i11]);
                        if (strM18995g2 != null) {
                            j10 = Long.parseLong(strM18995g2);
                            if (j10 != -1) {
                                break;
                            }
                            break;
                        }
                        i11++;
                    }
                    j10 = -9223372036854775807L;
                    break;
                }
                String[] strArr3 = f46405c;
                int i12 = 0;
                while (true) {
                    if (i12 >= 2) {
                        immutableListM9062Y = ImmutableList.m9062Y();
                        break;
                    }
                    String strM18995g3 = C10129a.m18995g(xmlPullParserNewPullParser, strArr3[i12]);
                    if (strM18995g3 != null) {
                        immutableListM9062Y = ImmutableList.m9059G(new C8749b.a(0L, 0L, "image/jpeg"), new C8749b.a(Long.parseLong(strM18995g3), 0L, "video/mp4"));
                        break;
                    }
                    i12++;
                }
                j11 = j10;
            } else if (C10129a.m19000l(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListM9062Y = m16989b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C10129a.m19000l(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListM9062Y = m16989b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C10129a.m18999k(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListM9062Y.isEmpty()) {
            return null;
        }
        return new C8749b(immutableListM9062Y, j11);
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList<C8749b.a> m16989b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C10129a.m19000l(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM18995g = C10129a.m18995g(xmlPullParser, strConcat3);
                String strM18995g2 = C10129a.m18995g(xmlPullParser, strConcat4);
                String strM18995g3 = C10129a.m18995g(xmlPullParser, strConcat5);
                String strM18995g4 = C10129a.m18995g(xmlPullParser, strConcat6);
                if (strM18995g == null || strM18995g2 == null) {
                    return ImmutableList.m9062Y();
                }
                c3146a.m9055b(new C8749b.a(strM18995g3 != null ? Long.parseLong(strM18995g3) : 0L, strM18995g4 != null ? Long.parseLong(strM18995g4) : 0L, strM18995g));
            }
        } while (!C10129a.m18999k(xmlPullParser, strConcat2));
        return c3146a.m9068e();
    }
}
