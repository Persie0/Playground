package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface hnw {

    /* JADX INFO: renamed from: b */
    public static final Map f28546b;

    static {
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(0, hnv.NORMAL);
        mwtVarM17115i.mo17110e(1, hnv.HEAT_LIGHT);
        mwtVarM17115i.mo17110e(2, hnv.HEAT_MODERATE);
        mwtVarM17115i.mo17110e(3, hnv.HEAT_SEVERE);
        mwtVarM17115i.mo17110e(4, hnv.HEAT_CRITICAL);
        mwtVarM17115i.mo17110e(5, hnv.HEAT_EMERGENCY);
        mwtVarM17115i.mo17110e(6, hnv.HEAT_SHUTDOWN);
        f28546b = mwtVarM17115i.mo17059b();
    }

    /* JADX INFO: renamed from: e */
    hnv mo10518e();

    /* JADX INFO: renamed from: f */
    kba mo10519f(hnu hnuVar);
}
