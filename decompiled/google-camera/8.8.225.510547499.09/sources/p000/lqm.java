package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqm {

    /* JADX INFO: renamed from: f */
    private static final Object f38978f = new Object();

    /* JADX INFO: renamed from: g */
    private static volatile Map f38979g = null;

    /* JADX INFO: renamed from: a */
    public final String f38980a;

    /* JADX INFO: renamed from: b */
    public final boolean f38981b;

    /* JADX INFO: renamed from: c */
    public final boolean f38982c;

    /* JADX INFO: renamed from: d */
    public final boolean f38983d;

    /* JADX INFO: renamed from: e */
    public final int f38984e;

    public lqm(Context context, lqn lqnVar) {
        this.f38980a = lqnVar.f38988b ? lph.m15822b(context, lqnVar.f38987a) : lqnVar.f38987a;
        int iM17726l = ntw.m17726l(lqnVar.f38989c);
        this.f38984e = iM17726l == 0 ? 1 : iM17726l;
        this.f38981b = lqnVar.f38992f;
        this.f38982c = lqnVar.f38990d;
        this.f38983d = lqnVar.f38991e;
    }

    /* JADX INFO: renamed from: a */
    public static Map m15885a(Context context) throws nyb {
        Map map = f38979g;
        if (map == null) {
            synchronized (f38978f) {
                map = f38979g;
                if (map == null) {
                    mwt mwtVarM17115i = mwx.m17115i();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open("phenotype/" + str);
                                    try {
                                        nxf nxfVarM18011a = nxf.m18011a();
                                        lqn lqnVar = lqn.f38985g;
                                        nww nwwVarM17876I = nww.m17876I(inputStreamOpen);
                                        nxq nxqVarM18138P = lqnVar.m18138P();
                                        try {
                                            try {
                                                nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                                                nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17876I), nxfVarM18011a);
                                                nzmVarM18260b.mo18250f(nxqVarM18138P);
                                                nxq.m18132ae(nxqVarM18138P);
                                                lqm lqmVar = new lqm(context, (lqn) nxqVarM18138P);
                                                mwtVarM17115i.mo17110e(lqmVar.f38980a, lqmVar);
                                                if (inputStreamOpen != null) {
                                                    inputStreamOpen.close();
                                                }
                                            } catch (nzx e) {
                                                throw e.m18328a();
                                            } catch (RuntimeException e2) {
                                                if (e2.getCause() instanceof nyb) {
                                                    throw ((nyb) e2.getCause());
                                                }
                                                throw e2;
                                            }
                                        } catch (nyb e3) {
                                            if (e3.f44994a) {
                                                throw new nyb(e3);
                                            }
                                            throw e3;
                                        } catch (IOException e4) {
                                            if (e4.getCause() instanceof nyb) {
                                                throw ((nyb) e4.getCause());
                                            }
                                            throw new nyb(e4);
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                } catch (Exception e5) {
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (nyb e6) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata for " + str, e6);
                                }
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e7);
                    }
                    mwx mwxVarMo17059b = mwtVarM17115i.mo17059b();
                    f38979g = mwxVarMo17059b;
                    map = mwxVarMo17059b;
                }
            }
        }
        return map;
    }
}
