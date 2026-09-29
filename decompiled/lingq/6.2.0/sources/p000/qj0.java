package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.lingq.feature.review.data.ReviewActivityResult;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj0 {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m19995a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    /* JADX INFO: renamed from: b */
    public static Object m19996b(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m19997c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* JADX INFO: renamed from: d */
    public static Serializable m19998d(Bundle bundle) {
        return bundle.getSerializable("result", ReviewActivityResult.class);
    }
}
