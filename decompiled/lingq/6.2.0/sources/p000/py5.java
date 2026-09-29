package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class py5 {

    /* JADX INFO: renamed from: d */
    public static final CopyOnWriteArraySet f56994d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public final String f56995a;

    /* JADX INFO: renamed from: b */
    public final String f56996b;

    /* JADX INFO: renamed from: c */
    public final List f56997c;

    public py5(String str, String str2, List list) {
        this.f56995a = str;
        this.f56996b = str2;
        this.f56997c = list;
    }

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet m19568a() {
        if (lp1.f49971a.contains(py5.class)) {
            return null;
        }
        try {
            return f56994d;
        } catch (Throwable th) {
            lp1.m16420a(py5.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m19569b() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f56997c);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m19570c() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return this.f56995a;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
