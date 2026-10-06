package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bve {

    /* JADX INFO: renamed from: a */
    public static final Map f4527a;

    /* JADX INFO: renamed from: b */
    private static final String f4528b;

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (cCharAt > 31) {
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        f4528b = property;
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new bvf(property)));
        }
        f4527a = Collections.unmodifiableMap(map);
    }
}
