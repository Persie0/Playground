package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class de6 {

    /* JADX INFO: renamed from: b */
    public static final gf0 f35501b = new gf0(2, false);

    /* JADX INFO: renamed from: c */
    public static final gf0 f35502c = new gf0(4, false);

    /* JADX INFO: renamed from: d */
    public static final ff0 f35503d = new ff0(4, true);

    /* JADX INFO: renamed from: e */
    public static final ff0 f35504e = new ff0(5, true);

    /* JADX INFO: renamed from: f */
    public static final gf0 f35505f = new gf0(3, false);

    /* JADX INFO: renamed from: g */
    public static final ff0 f35506g = new ff0(6, true);

    /* JADX INFO: renamed from: h */
    public static final ff0 f35507h = new ff0(7, true);

    /* JADX INFO: renamed from: i */
    public static final gf0 f35508i = new gf0(1, false);

    /* JADX INFO: renamed from: j */
    public static final ff0 f35509j = new ff0(2, true);

    /* JADX INFO: renamed from: k */
    public static final ff0 f35510k = new ff0(3, true);

    /* JADX INFO: renamed from: l */
    public static final gf0 f35511l = new gf0(0, false);

    /* JADX INFO: renamed from: m */
    public static final ff0 f35512m = new ff0(0, true);

    /* JADX INFO: renamed from: n */
    public static final ff0 f35513n = new ff0(1, true);

    /* JADX INFO: renamed from: o */
    public static final gf0 f35514o = new gf0(5, true);

    /* JADX INFO: renamed from: p */
    public static final ff0 f35515p = new ff0(8, true);

    /* JADX INFO: renamed from: q */
    public static final ff0 f35516q = new ff0(9, true);

    /* JADX INFO: renamed from: a */
    public final boolean f35517a;

    public de6(boolean z) {
        this.f35517a = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo301a(String str, Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract String mo302b();

    /* JADX INFO: renamed from: c */
    public Object mo10313c(Object obj, String str) {
        return mo303d(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo303d(String str);

    /* JADX INFO: renamed from: e */
    public abstract void mo304e(Bundle bundle, String str, Object obj);

    /* JADX INFO: renamed from: f */
    public String mo10314f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return mo302b();
    }
}
