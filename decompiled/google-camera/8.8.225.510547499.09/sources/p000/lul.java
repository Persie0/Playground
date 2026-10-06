package p000;

import android.util.Log;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lul {

    /* JADX INFO: renamed from: a */
    private static final String f39228a = lul.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static final Set f39229b = Collections.unmodifiableSet(new HashSet(Arrays.asList((byte) 2, (byte) 1, (byte) 3, (byte) 5, (byte) 10)));

    /* JADX INFO: renamed from: c */
    private static final Set f39230c = Collections.unmodifiableSet(new HashSet(Arrays.asList((byte) 6, (byte) 7, (byte) 8, (byte) 4, (byte) 9)));

    /* JADX INFO: renamed from: d */
    private static final Set f39231d = Collections.unmodifiableSet(new HashSet(Arrays.asList(95)));

    /* JADX INFO: renamed from: e */
    private static final Set f39232e = Collections.unmodifiableSet(new HashSet(Arrays.asList(45, 46)));

    /* JADX INFO: renamed from: f */
    private final Map f39233f = new HashMap();

    /* JADX INFO: renamed from: f */
    private static String m16004f(CharSequence charSequence) {
        String string = charSequence.toString();
        StringBuilder sb = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (iCharCount == 0) {
                if (f39231d.contains(Integer.valueOf(iCodePointAt)) || f39229b.contains(Byte.valueOf((byte) Character.getType(iCodePointAt)))) {
                    sb.appendCodePoint(iCodePointAt);
                } else {
                    sb.append('_');
                    if (m16006h(iCodePointAt)) {
                        sb.appendCodePoint(iCodePointAt);
                    }
                }
            } else if (m16006h(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
            } else {
                sb.append('_');
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    private final void m16005g(String str, String str2) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException(qQLA.CzSeQfaD);
        }
        if (!this.f39233f.containsKey(strTrim)) {
            this.f39233f.put(strTrim, str2);
        } else {
            Log.w(f39228a, "Attribute has already been added for node: ".concat(String.valueOf(strTrim)));
        }
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m16006h(int i) {
        return f39232e.contains(Integer.valueOf(i)) || f39229b.contains(Byte.valueOf((byte) Character.getType(i))) || f39230c.contains(Byte.valueOf((byte) Character.getType(i)));
    }

    /* JADX INFO: renamed from: a */
    public final void m16007a(CharSequence charSequence, CharSequence charSequence2) {
        String string;
        String strM16004f = m16004f(charSequence);
        if (charSequence2 != null) {
            String string2 = charSequence2.toString();
            StringBuilder sb = new StringBuilder();
            int iCharCount = 0;
            while (iCharCount < string2.length()) {
                int iCodePointAt = string2.codePointAt(iCharCount);
                if ((iCodePointAt <= 0 || iCodePointAt > 8) && ((iCodePointAt < 11 || iCodePointAt > 12) && ((iCodePointAt < 14 || iCodePointAt > 31) && ((iCodePointAt < 127 || iCodePointAt > 132) && ((iCodePointAt < 134 || iCodePointAt > 159) && ((iCodePointAt < 64976 || iCodePointAt > 64991) && ((iCodePointAt < 131070 || iCodePointAt > 131071) && ((iCodePointAt < 196606 || iCodePointAt > 196607) && ((iCodePointAt < 262142 || iCodePointAt > 262143) && ((iCodePointAt < 327678 || iCodePointAt > 327679) && ((iCodePointAt < 393214 || iCodePointAt > 393215) && ((iCodePointAt < 458750 || iCodePointAt > 458751) && ((iCodePointAt < 524286 || iCodePointAt > 524287) && ((iCodePointAt < 589822 || iCodePointAt > 589823) && ((iCodePointAt < 655358 || iCodePointAt > 655359) && ((iCodePointAt < 720894 || iCodePointAt > 720895) && ((iCodePointAt < 786430 || iCodePointAt > 786431) && ((iCodePointAt < 851966 || iCodePointAt > 851967) && ((iCodePointAt < 917502 || iCodePointAt > 917503) && ((iCodePointAt < 983038 || iCodePointAt > 983039) && ((iCodePointAt < 1048574 || iCodePointAt > 1048575) && (iCodePointAt < 1114110 || iCodePointAt > 1114111)))))))))))))))))))))) {
                    sb.appendCodePoint(iCodePointAt);
                } else {
                    sb.append("-");
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        m16005g(strM16004f, string);
    }

    /* JADX INFO: renamed from: b */
    public final void m16008b(CharSequence charSequence, boolean z) {
        m16005g(m16004f(charSequence), Boolean.toString(z));
    }

    /* JADX INFO: renamed from: c */
    public final void m16009c(CharSequence charSequence, float f) {
        m16005g(m16004f(charSequence), Float.toString(f));
    }

    /* JADX INFO: renamed from: d */
    public final void m16010d(CharSequence charSequence, int i) {
        m16005g(m16004f(charSequence), Integer.toString(i));
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final void m16011e(XmlSerializer xmlSerializer, lpe lpeVar) throws IOException {
        String str;
        for (String str2 : this.f39233f.keySet()) {
            if (lpeVar != null) {
                str = (String) lpeVar.f38883b.get(str2);
                if (str == null) {
                    int size = lpeVar.f38883b.size();
                    String str3 = "";
                    do {
                        str3 = ((char) ((size % 26) + 97)) + str3;
                        size = (size / 26) - 1;
                    } while (size >= 0);
                    lpeVar.f38883b.put(str2, str3);
                    ((ArrayList) lpeVar.f38884c).add(str2);
                    str = str3;
                }
            } else {
                str = str2;
            }
            xmlSerializer.attribute("", str, (String) this.f39233f.get(str2));
        }
    }
}
