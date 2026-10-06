package p000;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mru {

    /* JADX INFO: renamed from: a */
    public static final Random f41485a = new mrs();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f41486b;

    static {
        m16834a();
        new mrt();
        f41486b = new mrr();
    }

    /* JADX INFO: renamed from: a */
    public static SecureRandom m16834a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
