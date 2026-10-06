package p000;

import android.util.Log;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofl {

    /* JADX INFO: renamed from: b */
    public static final List f45861b;

    /* JADX INFO: renamed from: c */
    private static final String f45862c = ofl.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ArrayList f45860a = null;

    static {
        Float fValueOf = Float.valueOf(441.74f);
        Float fValueOf2 = Float.valueOf(0.004f);
        Float fValueOf3 = Float.valueOf(537.57f);
        Float fValueOf4 = Float.valueOf(522.63f);
        Float fValueOf5 = Float.valueOf(0.0038f);
        f45861b = Arrays.asList(new ofk("Micromax", null, "4560MMX", null, 217.0f, 217.0f), new ofk("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f), new ofk("samsung", null, "SM-G920P", null, 575.0f, 575.0f), new ofk("samsung", null, "SM-G930", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G9300", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930A", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930F", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930P", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930R4", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930T", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930V", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-G930W8", null, 581.0f, 580.0f), new ofk("samsung", null, "SM-N915FY", null, 541.0f, 541.0f), new ofk(gBCSQzBeB.jHBbiwfZRCjv, null, "SM-N915A", null, 541.0f, 541.0f), new ofk("samsung", null, aJFPpVSaoDO.qwJdNOGjeIIcIV, null, 541.0f, 541.0f), new ofk("samsung", null, "SM-N915K", null, 541.0f, 541.0f), new ofk("samsung", null, "SM-N915T", null, 541.0f, 541.0f), new ofk("samsung", null, "SM-N915G", null, 541.0f, 541.0f), new ofk(xRFdVyfdeve.bUGp, null, "SM-N915D", null, 541.0f, 541.0f), new ofk("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f), new ofk("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f), new ofk("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f), new ofk("Google", "sailfish", "Pixel", "sailfish", fValueOf, fValueOf, fValueOf2), new ofk("Google", "marlin", "Pixel XL", "marlin", fValueOf3, fValueOf3, fValueOf2), new ofk("Google", "walleye", null, "walleye", fValueOf, fValueOf, fValueOf2), new ofk(HRLmc.hAQHf, "taimen", null, "taimen", null, null, Float.valueOf(0.0046f)), new ofk("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, fValueOf4, fValueOf4, fValueOf5), new ofk("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, fValueOf5), new ofk("LGE", "joan", null, "joan", null, null, fValueOf5), new ofk("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, fValueOf5), new ofk("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }

    private ofl() {
    }

    /* JADX INFO: renamed from: a */
    public static String m18466a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (GeneralSecurityException e) {
            Log.e(f45862c, hIAHJKEnGsNbz.isfJpBbwfpeTDji);
            return str;
        }
    }
}
