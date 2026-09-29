package p000;

import com.google.android.gms.internal.vision.zzjk;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.token.TokenReadings;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class med {
    /* JADX INFO: renamed from: a */
    public static final String m16800a(String str, LessonTransliteration lessonTransliteration, TokenTransliteration tokenTransliteration, TokenReadings tokenReadings) {
        String str2;
        List list;
        str.getClass();
        if (lessonTransliteration == null || (str2 = lessonTransliteration.f19299a) == null) {
            str2 = tokenTransliteration != null ? tokenTransliteration.f19619a : null;
            if (str2 == null) {
                str2 = (tokenReadings == null || (list = tokenReadings.f19606b) == null) ? null : (String) u91.m22591I0(list);
            }
        }
        if (str2 != null) {
            String strM4839V = cl9.m4839V(str2, " ", "");
            String str3 = vk9.m23391n0(strM4839V) ? null : strM4839V;
            if (str3 != null) {
                return str3;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static void m16801b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzjk {
        if (!m16804e(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m16804e(b3) && !m16804e(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzjk.m5837c();
    }

    /* JADX INFO: renamed from: c */
    public static void m16802c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzjk {
        if (m16804e(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m16804e(b3)))) {
            throw zzjk.m5837c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: d */
    public static void m16803d(byte b, byte b2, char[] cArr, int i) throws zzjk {
        if (b < -62 || m16804e(b2)) {
            throw zzjk.m5837c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16804e(byte b) {
        return b > -65;
    }
}
