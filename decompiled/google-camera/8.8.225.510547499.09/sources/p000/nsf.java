package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsf {

    /* JADX INFO: renamed from: a */
    public static final nsf f44381a;

    /* JADX INFO: renamed from: b */
    public static final nsf f44382b;

    /* JADX INFO: renamed from: c */
    public static final nsf f44383c;

    /* JADX INFO: renamed from: d */
    public static final nsf f44384d;

    /* JADX INFO: renamed from: f */
    private static int f44385f;

    /* JADX INFO: renamed from: e */
    public final int f44386e;

    /* JADX INFO: renamed from: g */
    private final String f44387g;

    static {
        new nsf();
        f44381a = new nsf("kHdrPlusOn");
        new nsf("kHdrPlusEnhanced");
        f44382b = new nsf("kPortrait");
        f44383c = new nsf("kNightSight");
        new nsf("kThirdParty");
        f44384d = new nsf(HRLmc.UBDYaIzsX);
        f44385f = 0;
    }

    private nsf() {
        this.f44387g = "kInvalid";
        this.f44386e = 0;
        f44385f = 1;
    }

    private nsf(String str) {
        this.f44387g = str;
        int i = f44385f;
        f44385f = i + 1;
        this.f44386e = i;
    }

    public final String toString() {
        return this.f44387g;
    }
}
