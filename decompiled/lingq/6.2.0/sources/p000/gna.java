package p000;

import android.content.Intent;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.facebook.login.C0936j;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public class gna implements fm1, coa, bm1, InterfaceC2950e3, xr2, sic, o9a {

    /* JADX INFO: renamed from: a */
    public static final gna f41053a = new gna();

    /* JADX INFO: renamed from: b */
    public static final gna f41054b = new gna();

    /* JADX INFO: renamed from: c */
    public static final gna f41055c = new gna();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ gna f41056d = new gna();

    /* JADX INFO: renamed from: a */
    public static final Bundle m12764a(String str) {
        ScheduledExecutorService scheduledExecutorService = C0936j.f11511d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* JADX INFO: renamed from: j */
    public static final File m12765j() {
        if (lp1.f49971a.contains(gna.class)) {
            return null;
        }
        try {
            File file = new File(sy2.m21766a().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            lp1.m16420a(gna.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m12766o(as2 as2Var, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        as2Var.f7419c.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    /* JADX INFO: renamed from: b */
    public int mo10678b(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo10678b((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    @Override // p000.sic
    /* JADX INFO: renamed from: c */
    public byte[] mo83c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        ((m88) obj).close();
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public void mo10679d(as2 as2Var) {
        StringBuilder sb = new StringBuilder();
        while (as2Var.m3017b()) {
            char cM3016a = as2Var.m3016a();
            as2Var.f7420d++;
            int iMo10678b = mo10678b(cM3016a, sb);
            int length = as2Var.f7419c.length() + ((sb.length() / 3) << 1);
            as2Var.m3018c(length);
            int i = as2Var.f7422f.f34352b - length;
            if (!as2Var.m3017b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iMo10678b, length2);
                    as2Var.f7420d--;
                    iMo10678b = mo10678b(as2Var.m3016a(), sb2);
                    as2Var.f7422f = null;
                }
                while (sb.length() % 3 == 1 && ((iMo10678b <= 3 && i != 1) || iMo10678b > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - iMo10678b, length3);
                    as2Var.f7420d--;
                    iMo10678b = mo10678b(as2Var.m3016a(), sb2);
                    as2Var.f7422f = null;
                }
                break;
            }
            if (sb.length() % 3 == 0 && zed.m25587f(as2Var.f7417a, as2Var.f7420d, mo10680h()) != mo10680h()) {
                as2Var.f7421e = 0;
                break;
            }
        }
        mo10681l(as2Var, sb);
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        Intent intent = (Intent) ((Bundle) task.mo5967i()).getParcelable("notification_data");
        if (intent != null) {
            return new CloudMessage(intent);
        }
        return null;
    }

    @Override // p000.InterfaceC2950e3
    /* JADX INFO: renamed from: f */
    public String mo4202f() {
        return "ig_refresh_token";
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        JsonReader$Token jsonReader$TokenMo5047z = abstractC0875a.mo5047z();
        if (jsonReader$TokenMo5047z != JsonReader$Token.BEGIN_ARRAY && jsonReader$TokenMo5047z != JsonReader$Token.BEGIN_OBJECT) {
            if (jsonReader$TokenMo5047z != JsonReader$Token.NUMBER) {
                v63.m23142t(jsonReader$TokenMo5047z, "Cannot convert json to point. Next token is ");
                return null;
            }
            PointF pointF = new PointF(((float) abstractC0875a.mo5044r()) * f, ((float) abstractC0875a.mo5044r()) * f);
            while (abstractC0875a.mo5042p()) {
                abstractC0875a.mo5035R();
            }
            return pointF;
        }
        return og4.m17978b(abstractC0875a, f);
    }

    /* JADX INFO: renamed from: h */
    public int mo10680h() {
        return 1;
    }

    @Override // p000.InterfaceC2950e3
    /* JADX INFO: renamed from: i */
    public String mo4204i() {
        return "refresh_access_token";
    }

    /* JADX INFO: renamed from: k */
    public void mo12767k(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: l */
    public void mo10681l(as2 as2Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = as2Var.f7419c.length() + length;
        as2Var.m3018c(length3);
        int i = as2Var.f7422f.f34352b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m12766o(as2Var, sb);
            }
            if (as2Var.m3017b()) {
                as2Var.m3019d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m12766o(as2Var, sb);
            }
            if (as2Var.m3017b()) {
                as2Var.m3019d((char) 254);
            }
            as2Var.f7420d--;
        } else {
            if (length2 != 0) {
                C3386nv.m17633t("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                m12766o(as2Var, sb);
            }
            if (i > 0 || as2Var.m3017b()) {
                as2Var.m3019d((char) 254);
            }
        }
        as2Var.f7421e = 0;
    }

    /* JADX INFO: renamed from: m */
    public String m12768m(String str) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = fa4.m11651m(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new Regex("\\s+").m15429h(str.subSequence(i, length + 1).toString()).toArray(new String[0]));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int[] m12769n(String str) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String strM12768m = m12768m(str);
            Charset charsetForName = Charset.forName("UTF-8");
            charsetForName.getClass();
            byte[] bytes = strM12768m.getBytes(charsetForName);
            bytes.getClass();
            for (int i = 0; i < 128; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
