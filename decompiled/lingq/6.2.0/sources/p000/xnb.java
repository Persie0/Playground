package p000;

import androidx.compose.runtime.internal.C0282a;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68407a = new C0282a(1161494595, false, new jd1(9));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68408b = new C0282a(-1044147772, false, new jd1(10));

    /* JADX INFO: renamed from: c */
    public static final C0282a f68409c = new C0282a(-1095000066, false, new jd1(11));

    /* JADX INFO: renamed from: d */
    public static final C0282a f68410d = new C0282a(1599498814, false, new jd1(12));

    /* JADX INFO: renamed from: e */
    public static final C0282a f68411e = new C0282a(667287551, false, new jd1(13));

    /* JADX INFO: renamed from: f */
    public static final C0282a f68412f = new C0282a(-1620082629, false, new jd1(14));

    /* JADX INFO: renamed from: g */
    public static final C0282a f68413g = new C0282a(-1573618625, false, new jd1(15));

    /* JADX INFO: renamed from: a */
    public static boolean m24620a(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m24621b(ImmutableMap immutableMap) {
        int size = immutableMap.size();
        AbstractC3489q9.m19779i(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        Iterator it = immutableMap.entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
