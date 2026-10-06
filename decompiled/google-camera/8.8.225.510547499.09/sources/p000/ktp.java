package p000;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktp {

    /* JADX INFO: renamed from: c */
    private static final String[] f37180c = {"COLLECTION_BASIS_VERIFIER"};

    /* JADX INFO: renamed from: a */
    public static boolean f37178a = false;

    /* JADX INFO: renamed from: b */
    public static final Object f37179b = new Object();

    /* JADX INFO: renamed from: a */
    public static void m14841a(ksr ksrVar, nax naxVar) {
        final jon jonVarM13408a = jok.m13408a(ksrVar.f37126a);
        String strValueOf = String.valueOf(ksrVar.f37126a.getPackageName());
        final int iM17235f = naxVar.m17235f(ksrVar.f37126a);
        final String[] strArr = f37180c;
        jgg jggVarM13132a = jgh.m13132a();
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        jggVarM13132a.f33956a = new jgc() { // from class: jol
            @Override // p000.jgc
            /* JADX INFO: renamed from: a */
            public final void mo13128a(Object obj, Object obj2) {
                String str = strConcat;
                int i = iM17235f;
                String[] strArr2 = strArr;
                joo jooVar = new joo((khb) obj2, 0, null, null);
                jop jopVar = (jop) ((joq) obj).m13169u();
                Parcel parcelM3398a = jopVar.m3398a();
                cbs.m3405d(parcelM3398a, jooVar);
                parcelM3398a.writeString(str);
                parcelM3398a.writeInt(i);
                parcelM3398a.writeStringArray(strArr2);
                parcelM3398a.writeByteArray(null);
                jopVar.m3400z(1, parcelM3398a);
            }
        };
        jpp jppVarM12960e = jonVarM13408a.m12960e(jggVarM13132a.m13130a());
        final Executor executorM15696p = lle.m15696p(ksrVar);
        try {
            jppVarM12960e.mo13458k(executorM15696p, new jpl() { // from class: kto
                @Override // p000.jpl
                /* JADX INFO: renamed from: d */
                public final void mo4011d(Object obj) {
                    jpp jppVarM13565m;
                    jon jonVar = jonVarM13408a;
                    String str = strConcat;
                    Executor executor = executorM15696p;
                    boolean z = ktp.f37178a;
                    if (jcz.f33770d.m12902f(jonVar.f33820c, 12451000) == 0) {
                        jgg jggVarM13132a2 = jgh.m13132a();
                        jggVarM13132a2.f33956a = new jom(str, 2);
                        jppVarM13565m = jonVar.m12960e(jggVarM13132a2.m13130a());
                    } else {
                        jppVarM13565m = jvh.m13565m(new jdv(new Status(16)));
                    }
                    jppVarM13565m.mo13457j(executor, new iml(str, 3));
                }
            });
            jppVarM12960e.mo13457j(executorM15696p, new iml(strConcat, 4));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
