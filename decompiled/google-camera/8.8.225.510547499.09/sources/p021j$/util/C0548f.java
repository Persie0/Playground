package p021j$.util;

/* JADX INFO: renamed from: j$.util.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0548f extends RuntimeException {
    public C0548f(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m12577a(Object obj, String str) {
        throw new C0548f("Unsupported " + str + " :" + obj);
    }
}
