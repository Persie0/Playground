package p000;

import android.os.LocaleList;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0158ej {
    /* JADX INFO: renamed from: a */
    public static LocaleList m7377a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m7378e(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7379f(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7380g(int i) {
        if (i == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo2040b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo2041c() {
    }

    /* JADX INFO: renamed from: d */
    public void mo2042d(int i, Object obj) {
        mo2041c();
    }
}
