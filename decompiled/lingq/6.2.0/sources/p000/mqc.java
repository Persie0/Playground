package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.network.api.result.worldcup.ResultCupClaim;
import com.lingq.core.network.api.result.worldcup.ResultCupPrize;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51752a = new C0282a(-2123461167, false, new ee1(18));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51753b = new C0282a(-1232304632, false, new ee1(19));

    /* JADX INFO: renamed from: c */
    public static final C0282a f51754c = new C0282a(1347064073, false, new ee1(20));

    /* JADX INFO: renamed from: d */
    public static final C0282a f51755d = new C0282a(-368534518, false, new ee1(21));

    /* JADX INFO: renamed from: e */
    public static final C0282a f51756e = new C0282a(-2084133109, false, new ee1(22));

    /* JADX INFO: renamed from: f */
    public static final C0282a f51757f = new C0282a(495235596, false, new ee1(23));

    /* JADX INFO: renamed from: g */
    public static final C0282a f51758g = new C0282a(1359005710, false, new ee1(24));

    /* JADX INFO: renamed from: h */
    public static final C0282a f51759h = new C0282a(-2072191472, false, new ee1(25));

    /* JADX INFO: renamed from: i */
    public static final C0282a f51760i = new C0282a(-1529679964, false, new ee1(26));

    /* JADX INFO: renamed from: a */
    public static final CupPrize m17008a(ResultCupClaim resultCupClaim) {
        resultCupClaim.getClass();
        ResultCupPrize resultCupPrize = resultCupClaim.f21755a;
        if (resultCupPrize != null) {
            return vqc.m23482a(resultCupPrize);
        }
        return null;
    }
}
