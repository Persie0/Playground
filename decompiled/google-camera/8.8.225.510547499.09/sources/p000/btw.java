package p000;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btw implements btr {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f4457a;

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config[] f4458b;

    /* JADX INFO: renamed from: c */
    public static final Bitmap.Config[] f4459c;

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f4460d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f4461e;

    /* JADX INFO: renamed from: f */
    public final btv f4462f = new btv();

    /* JADX INFO: renamed from: g */
    public final btl f4463g = new btl();

    /* JADX INFO: renamed from: h */
    private final Map f4464h = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f4457a = configArr;
        f4458b = configArr;
        f4459c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4460d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4461e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: a */
    static String m3065a(int i, Bitmap.Config config) {
        return "[" + i + "](" + String.valueOf(config) + ")";
    }

    /* JADX INFO: renamed from: b */
    public final NavigableMap m3066b(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f4464h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4464h.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: c */
    public final void m3067c(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM3066b = m3066b(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM3066b.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM3066b.remove(num);
                return;
            } else {
                navigableMapM3066b.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m3065a(cbi.m3380a(bitmap), bitmap.getConfig()) + ", this: " + toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f4463g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f4464h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f4464h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
