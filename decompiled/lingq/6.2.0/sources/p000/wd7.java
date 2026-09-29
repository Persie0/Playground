package p000;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.feature.widget.layout.network.PlaylistLessonImageWorker;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class wd7 {
    /* JADX INFO: renamed from: a */
    public static void m23853a(int i, Context context, String str) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        networkType2.getClass();
        ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
        tx6 tx6Var = new tx6(PlaylistLessonImageWorker.class);
        Pair[] pairArr = {new Pair("lesson_id", Integer.valueOf(i)), new Pair("url", str)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        tx6 tx6Var2 = (tx6) tx6Var.m15008g(hi8Var.m13282k());
        tx6Var2.f46873c.f55781j = ak1Var;
        ux6 ux6Var = (ux6) ((tx6) tx6Var2.m15005d(BackoffPolicy.EXPONENTIAL, 30L, TimeUnit.SECONDS)).m15004a();
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        c0773bM2910c.m2913b("lesson_uri_" + i, ExistingWorkPolicy.KEEP, ux6Var);
    }
}
