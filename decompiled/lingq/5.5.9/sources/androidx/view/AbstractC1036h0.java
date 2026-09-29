package androidx.view;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1036h0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f6655a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f6656b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public volatile boolean f6657c = false;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i2 */
    public static void m3940i2(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    public void mo3725j2() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k2 */
    public final Object m3941k2(Object obj, String str) {
        Object obj2;
        synchronized (this.f6655a) {
            try {
                obj2 = this.f6655a.get(str);
                if (obj2 == null) {
                    this.f6655a.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f6657c) {
            m3940i2(obj);
        }
        return obj;
    }
}
