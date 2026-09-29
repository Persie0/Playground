package p479xa;

import android.media.MediaFormat;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10129a {
    @Pure
    /* JADX INFO: renamed from: a */
    public static void m18989a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Pure
    /* JADX INFO: renamed from: b */
    public static void m18990b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m18991c(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m18992d(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: e */
    public static void m18993e(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: f */
    public static void m18994f(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m18995g(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m18996h(String str) {
        byte b10;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList<C10147p.a> arrayList = C10147p.f51398a;
        switch (str.hashCode()) {
            case -1007807498:
                b10 = !str2.equals("audio/x-flac") ? (byte) -1 : (byte) 0;
                break;
            case -586683234:
                b10 = !str2.equals("audio/x-wav") ? (byte) -1 : (byte) 1;
                break;
            case 187090231:
                b10 = !str2.equals("audio/mp3") ? (byte) -1 : (byte) 2;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                str2 = "audio/flac";
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m18997i(Map map) {
        List list = (List) map.get("Content-Type");
        return m18996h((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    /* JADX INFO: renamed from: j */
    public static int m18998j(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                return 2;
            }
            if (lastPathSegment.endsWith(".amr")) {
                return 3;
            }
            if (lastPathSegment.endsWith(".flac")) {
                return 4;
            }
            if (lastPathSegment.endsWith(".flv")) {
                return 5;
            }
            if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                return 15;
            }
            if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                return 6;
            }
            if (lastPathSegment.endsWith(".mp3")) {
                return 7;
            }
            if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                return 8;
            }
            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg")) {
                    return 10;
                }
                if (lastPathSegment.endsWith(".m2p")) {
                    return 10;
                }
                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                    if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        return 12;
                    }
                    if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                        if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                            return lastPathSegment.endsWith(".avi") ? 16 : -1;
                        }
                        return 14;
                    }
                    return 13;
                }
                return 11;
            }
            return 9;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18999k(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m19000l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m19001m(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m19002n(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(C0166e.m761g("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
