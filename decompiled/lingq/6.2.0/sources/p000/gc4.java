package p000;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class gc4 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f40528a;

    /* JADX INFO: renamed from: b */
    public final Object f40529b;

    /* JADX INFO: renamed from: c */
    public final Serializable f40530c;

    /* JADX INFO: renamed from: d */
    public final Object f40531d;

    public gc4(int i) {
        switch (i) {
            case 1:
                this.f40529b = new tr3(16);
                this.f40530c = new LinkedHashMap();
                this.f40531d = new LinkedHashSet();
                break;
            default:
                this.f40529b = new CopyOnWriteArraySet();
                this.f40530c = new ConcurrentLinkedQueue();
                this.f40528a = false;
                this.f40531d = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12476a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g9a.m12434k(autoCloseable);
            } catch (Exception e) {
                v63.m23141s(e);
            }
        }
    }
}
