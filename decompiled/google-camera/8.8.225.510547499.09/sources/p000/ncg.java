package p000;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ncg extends nce {
    public ncg(ncn ncnVar) {
        super(ncnVar);
    }

    /* JADX INFO: renamed from: h */
    public static ncg m17327h(String str) {
        return new ncg(ndk.m17362d(str));
    }

    /* JADX INFO: renamed from: i */
    public static ncg m17328i() {
        return new ncg(ndk.m17362d(ndk.m17364g().mo17359b(ncg.class)));
    }

    @Override // p000.nbc
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ncc mo17250a(Level level) {
        boolean zM17254f = m17254f(level);
        ndk.m17368n(m17253d(), level, zM17254f);
        return !zM17254f ? f41985b : new ncf(this, level);
    }
}
