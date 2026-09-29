package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p000.C3326m8;
import p000.C3363n8;
import p000.br3;
import p000.nt5;
import p000.tob;
import p000.ua1;
import p000.vi3;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0722a {
    /* JADX INFO: renamed from: a */
    public static tob m2596a(final Context context) {
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C3363n8 c3363n8 = C3363n8.f52470a;
        sb.append(i >= 33 ? c3363n8.m17277a() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? c3363n8.m17277a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) ua1.m22658g());
            systemService.getClass();
            return new nt5(br3.m4122c(systemService));
        }
        C3326m8 c3326m8 = C3326m8.f50742a;
        Object objInvoke = null;
        if (((i == 31 || i == 32) ? c3326m8.m16671a() : 0) < 9) {
            return null;
        }
        try {
            objInvoke = new vi3() { // from class: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    ((Context) obj).getClass();
                    Context context2 = context;
                    context2.getClass();
                    MeasurementManager measurementManager = MeasurementManager.get(context2);
                    measurementManager.getClass();
                    return new nt5(measurementManager);
                }
            }.invoke(context);
        } catch (NoClassDefFoundError unused) {
            StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
            int i2 = Build.VERSION.SDK_INT;
            sb2.append((i2 == 31 || i2 == 32) ? c3326m8.m16671a() : 0);
            Log.d("MeasurementManager", sb2.toString());
        }
        return (tob) objInvoke;
    }
}
