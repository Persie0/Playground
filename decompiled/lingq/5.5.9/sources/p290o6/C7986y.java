package p290o6;

import android.app.Activity;
import android.support.v4.media.AbstractC0140a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: o6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7986y extends AbstractC0140a {

    /* JADX INFO: renamed from: Q */
    public static boolean f43446Q;

    /* JADX INFO: renamed from: R */
    public static WeakReference<Activity> f43447R;

    /* JADX INFO: renamed from: S */
    public static int f43448S;

    /* JADX INFO: renamed from: T */
    public static int f43449T;

    /* JADX INFO: renamed from: I */
    public String f43451I;

    /* JADX INFO: renamed from: l */
    public boolean f43470l;

    /* JADX INFO: renamed from: a */
    public long f43459a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f43460b = false;

    /* JADX INFO: renamed from: c */
    public final Object f43461c = new Object();

    /* JADX INFO: renamed from: d */
    public int f43462d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f43463e = false;

    /* JADX INFO: renamed from: f */
    public boolean f43464f = false;

    /* JADX INFO: renamed from: g */
    public boolean f43465g = false;

    /* JADX INFO: renamed from: h */
    public int f43466h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f43467i = false;

    /* JADX INFO: renamed from: j */
    public boolean f43468j = false;

    /* JADX INFO: renamed from: k */
    public boolean f43469k = false;

    /* JADX INFO: renamed from: H */
    public int f43450H = 0;

    /* JADX INFO: renamed from: J */
    public final Object f43452J = new Object();

    /* JADX INFO: renamed from: K */
    public final HashMap<String, Integer> f43453K = new HashMap<>();

    /* JADX INFO: renamed from: L */
    public long f43454L = 0;

    /* JADX INFO: renamed from: M */
    public String f43455M = null;

    /* JADX INFO: renamed from: N */
    public String f43456N = null;

    /* JADX INFO: renamed from: O */
    public String f43457O = null;

    /* JADX INFO: renamed from: P */
    public JSONObject f43458P = null;

    /* JADX INFO: renamed from: k0 */
    public static Activity m15846k0() {
        WeakReference<Activity> weakReference = f43447R;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
