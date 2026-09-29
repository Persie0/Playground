package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zab;

/* JADX INFO: loaded from: classes2.dex */
public final class xdb extends no3 {

    /* JADX INFO: renamed from: l */
    public static final b64 f68108l = new b64("ClientNotification.API", new ncb(3), new p84(7));

    /* JADX INFO: renamed from: m */
    public static final b64 f68109m = new b64("ModuleInstall.API", new ncb(2), new p84(7));

    /* JADX INFO: renamed from: n */
    public static final b64 f68110n = new b64("MlKitDocScanUI.API", new ncb(8), new p84(7));

    /* JADX INFO: renamed from: o */
    public static int f68111o = 1;

    public xdb(Context context) {
        super(context, f68108l, InterfaceC3691vn.f65627m, mo3.f51630c);
    }

    /* JADX INFO: renamed from: d */
    public void m24466d(zab zabVar) {
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43483d = new Feature[]{omd.f54600e};
        i44VarM13651b.f43480a = false;
        i44VarM13651b.f43482c = new vf9(zabVar);
        m17569c(2, i44VarM13651b.m13652a());
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m24467e() {
        int i;
        try {
            i = f68111o;
            if (i == 1) {
                Context context = this.f53045a;
                oo3 oo3Var = oo3.f54649e;
                int iM19432c = oo3Var.m19432c(context, 12451000);
                if (iM19432c == 0) {
                    i = 4;
                    f68111o = 4;
                } else if (oo3Var.m19431b(iM19432c, context, null) != null || ao2.m2948a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f68111o = 2;
                } else {
                    i = 3;
                    f68111o = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
