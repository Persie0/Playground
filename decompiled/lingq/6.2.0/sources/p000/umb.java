package p000;

import androidx.compose.runtime.internal.C0282a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class umb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f64089a = new C0282a(-1454383158, false, new z70(7));

    /* JADX INFO: renamed from: b */
    public static final C0282a f64090b = new C0282a(2028681715, false, new z70(8));

    /* JADX INFO: renamed from: a */
    public static zzsb m22832a(int i) {
        switch (i) {
            case 1:
                return zzsb.LATIN;
            case 2:
                return zzsb.LATIN_AND_CHINESE;
            case 3:
                return zzsb.LATIN_AND_DEVANAGARI;
            case 4:
                return zzsb.LATIN_AND_JAPANESE;
            case 5:
                return zzsb.LATIN_AND_KOREAN;
            case 6:
                return zzsb.CREDIT_CARD;
            case 7:
                return zzsb.DOCUMENT;
            case 8:
                return zzsb.PIXEL_AI;
            default:
                return zzsb.TYPE_UNKNOWN;
        }
    }
}
