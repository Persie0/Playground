package p000;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum jcg {
    ZWIEBACK(2),
    ANDROID_ID(4),
    f33718c(8),
    ACCOUNT_NAME(16);


    /* JADX INFO: renamed from: e */
    public static final EnumSet f33720e;

    /* JADX INFO: renamed from: f */
    public static final EnumSet f33721f;

    /* JADX INFO: renamed from: g */
    public static final EnumSet f33722g;

    /* JADX INFO: renamed from: h */
    public final int f33724h;

    static {
        jcg jcgVar = ZWIEBACK;
        f33720e = EnumSet.allOf(jcg.class);
        f33721f = EnumSet.noneOf(jcg.class);
        f33722g = EnumSet.of(jcgVar);
    }

    jcg(int i) {
        this.f33724h = i;
    }
}
