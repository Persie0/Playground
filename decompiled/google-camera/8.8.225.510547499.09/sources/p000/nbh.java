package p000;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nbh extends nbc {

    /* JADX INFO: renamed from: b */
    public static final nbg f41935b = new nbg();

    public nbh(ncn ncnVar) {
        super(ncnVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static nbh m17259h(String str) {
        nea.m17395i(!str.isEmpty(), "injected class name is empty");
        return new nbh(ndk.m17362d(str.replace('/', '.')));
    }

    @Override // p000.nbc
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final nbe mo17250a(Level level) {
        boolean zM17254f = m17254f(level);
        ndk.m17368n(m17253d(), level, zM17254f);
        return !zM17254f ? f41935b : new nbf(this, level);
    }
}
