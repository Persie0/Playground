package p000;

import android.util.Pair;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cek {

    /* JADX INFO: renamed from: a */
    public static final nbh f5448a = nbh.m17259h("com/google/android/apps/camera/activity/util/CaptureDataSerializer");

    /* JADX INFO: renamed from: a */
    public static String m3558a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (obj.getClass().isArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                sb.append(m3558a(Array.get(obj, i)));
                if (i != length - 1) {
                    sb.append(HEePJw.wQWfWn);
                }
            }
            sb.append(']');
            return sb.toString();
        }
        if (!(obj instanceof Pair)) {
            return obj.toString();
        }
        Pair pair = (Pair) obj;
        return "Pair: " + m3558a(pair.first) + " / " + m3558a(pair.second);
    }
}
