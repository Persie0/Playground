package p536zh;

import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import com.lingq.shared.network.workers.ProfileUpdateWorker;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import p026b5.C1309b;
import p026b5.C1315h;

/* JADX INFO: renamed from: zh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10490a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final C1315h m19478a(String str, int i10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(ProfileUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("pk", Integer.valueOf(i10));
        Pair[] pairArr = {pair, new Pair("user", str)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 2; i11++) {
            Pair pair2 = pairArr[i11];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        return aVar.m4879a();
    }
}
