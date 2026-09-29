package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import com.lingq.core.data.workers.ProfileUpdateWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lhc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f49677a = new C0282a(1837494478, false, new yd1(17));

    /* JADX INFO: renamed from: b */
    public static final C0282a f49678b = new C0282a(1118835856, false, new yd1(18));

    /* JADX INFO: renamed from: a */
    public static final ux6 m16221a() {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        networkType2.getClass();
        ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
        tx6 tx6Var = (tx6) new tx6(ProfileUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
        tx6Var.f46873c.f55781j = ak1Var;
        sz1 sz1Var = new sz1(new LinkedHashMap());
        jad.m14369d(sz1Var);
        return (ux6) ((tx6) tx6Var.m15008g(sz1Var)).m15004a();
    }
}
