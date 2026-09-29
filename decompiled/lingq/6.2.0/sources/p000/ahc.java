package p000;

import com.google.android.gms.measurement.internal.C1045d;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahc implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ shc f683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f684c;

    public /* synthetic */ ahc(shc shcVar, String str, int i) {
        this.f682a = i;
        this.f683b = shcVar;
        this.f684c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f682a;
        String str = this.f684c;
        shc shcVar = this.f683b;
        switch (i) {
            case 0:
                return new trc(new ahc(shcVar, str, 1));
            case 1:
                nnb nnbVar = shcVar.f55716b.f12360c;
                C1045d.m5885T(nnbVar);
                gec gecVarM17517H0 = nnbVar.m17517H0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((kjc) shcVar.f60774a).f47436d.m4864J();
                map.put("gmp_version", 161000L);
                if (gecVarM17517H0 != null) {
                    String strM12532O = gecVarM17517H0.m12532O();
                    if (strM12532O != null) {
                        map.put("app_version", strM12532O);
                    }
                    map.put("app_version_int", Long.valueOf(gecVarM17517H0.m12534Q()));
                    map.put("dynamite_version", Long.valueOf(gecVarM17517H0.m12539b()));
                }
                return map;
            default:
                cdb cdbVar = new cdb(12, shcVar, str);
                p3d p3dVar = new p3d("internal.remoteConfig", 0);
                p3dVar.f65550b.put("getValue", new trc(p3dVar, cdbVar));
                return p3dVar;
        }
    }
}
