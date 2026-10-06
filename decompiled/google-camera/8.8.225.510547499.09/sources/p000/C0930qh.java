package p000;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: renamed from: qh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0930qh {
    /* JADX INFO: renamed from: a */
    static Context m19341a(C0931qi c0931qi, Configuration configuration) {
        return c0931qi.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: b */
    public static nps m19342b(InterfaceC1134xw interfaceC1134xw) {
        C1132xu c1132xu = new C1132xu();
        C1136xy c1136xy = new C1136xy(c1132xu);
        c1132xu.f48035b = c1136xy;
        c1132xu.f48034a = interfaceC1134xw.getClass();
        try {
            c1132xu.f48034a = interfaceC1134xw.mo10974a(c1132xu);
        } catch (Exception e) {
            c1136xy.m19592a(e);
        }
        return c1136xy;
    }
}
