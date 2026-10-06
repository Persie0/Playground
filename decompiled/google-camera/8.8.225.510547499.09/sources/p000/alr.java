package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class alr {

    /* JADX INFO: renamed from: h */
    public final Map f661h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Set f662i = new LinkedHashSet();

    /* JADX INFO: renamed from: j */
    public volatile boolean f663j = false;

    /* JADX INFO: renamed from: g */
    public static void m922g(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo923d() {
    }
}
