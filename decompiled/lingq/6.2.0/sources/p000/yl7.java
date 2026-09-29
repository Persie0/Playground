package p000;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yl7 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f70032a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final JSONObject m25186a(String str) {
        str.getClass();
        return (JSONObject) f70032a.get(str);
    }
}
