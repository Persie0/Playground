package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class efb {

    /* JADX INFO: renamed from: a */
    public static final HashMap f37198a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f37199b;

    static {
        HashMap map = new HashMap();
        f37198a = map;
        HashMap map2 = new HashMap();
        f37199b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
