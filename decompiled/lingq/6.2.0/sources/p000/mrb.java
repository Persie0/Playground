package p000;

import android.net.NetworkRequest;
import android.util.Log;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mrb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51781a = new C0282a(1309886199, false, new qd1(14));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51782b = new C0282a(698358254, false, new qd1(15));

    /* JADX INFO: renamed from: c */
    public static final C0282a f51783c = new C0282a(387145632, false, new qd1(16));

    /* JADX INFO: renamed from: d */
    public static final C0282a f51784d = new C0282a(-1556547099, false, new rd1(12));

    /* JADX INFO: renamed from: a */
    public static gk6 m17028a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                oj5 oj5VarM18040f = oj5.m18040f();
                String str = gk6.f40911b;
                String str2 = gk6.f40911b;
                String strM24114j = wq1.m24114j("Ignoring adding capability '", i, '\'');
                if (oj5VarM18040f.f54464a <= 5) {
                    Log.w(str2, strM24114j, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = evc.f37960a[i2];
            if (!AbstractC3550rv.m20822P(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    oj5 oj5VarM18040f2 = oj5.m18040f();
                    String str3 = gk6.f40911b;
                    String str4 = gk6.f40911b;
                    String strM24114j2 = wq1.m24114j("Ignoring removing default capability '", i3, '\'');
                    if (oj5VarM18040f2.f54464a <= 5) {
                        Log.w(str4, strM24114j2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new gk6(networkRequestBuild);
    }
}
