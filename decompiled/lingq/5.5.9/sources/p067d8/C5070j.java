package p067d8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import dm.C5207g;
import java.util.HashSet;
import kotlin.collections.C6752c;
import mo.C7661i;
import p260m8.C7499b;

/* JADX INFO: renamed from: d8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5070j {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f32956a = C7499b.m14921S("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /* JADX INFO: renamed from: a */
    public static final boolean m10766a(Context context, String str) {
        C5207g.m11111f(context, "context");
        String str2 = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        C5207g.m11110e(str2, "brand");
        boolean z10 = false;
        if (C7661i.m15256V2(str2, "generic", false) && (i10 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null) {
                if (!(signatureArr.length == 0)) {
                    C5207g.m11110e(signatureArr, "packageInfo.signatures");
                    for (Signature signature : signatureArr) {
                        HashSet<String> hashSet = f32956a;
                        C5086z c5086z = C5086z.f33015a;
                        byte[] byteArray = signature.toByteArray();
                        C5207g.m11110e(byteArray, "it.toByteArray()");
                        C5086z.f33015a.getClass();
                        if (C6752c.m13415I(hashSet, C5086z.m10836u("SHA-1", byteArray))) {
                        }
                    }
                    z10 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z10;
    }
}
