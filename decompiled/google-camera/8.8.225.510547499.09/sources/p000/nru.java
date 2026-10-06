package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nru {

    /* JADX INFO: renamed from: a */
    public static final nru f44291a = new nru();

    /* JADX INFO: renamed from: c */
    private static int f44292c;

    /* JADX INFO: renamed from: b */
    public final int f44293b;

    /* JADX INFO: renamed from: d */
    private final String f44294d;

    static {
        new nru("kSabre");
        new nru(WIxTIdUIdfb.WoxJpTapCHcls);
        new nru("kSpatialRgb");
        new nru("kInvalid");
        f44292c = 0;
    }

    private nru() {
        this.f44294d = "kWienerFilter";
        this.f44293b = 0;
        f44292c = 1;
    }

    private nru(String str) {
        this.f44294d = str;
        int i = f44292c;
        f44292c = i + 1;
        this.f44293b = i;
    }

    public final String toString() {
        return this.f44294d;
    }
}
