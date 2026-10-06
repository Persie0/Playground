package p021j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0426h extends AbstractC0419a implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C0426h f32915a = new C0426h();

    private C0426h() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12267a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
