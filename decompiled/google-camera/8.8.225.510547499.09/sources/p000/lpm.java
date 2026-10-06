package p000;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lpm implements msi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f38904a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f38905b;

    public /* synthetic */ lpm(Context context, int i) {
        this.f38905b = i;
        this.f38904a = context;
    }

    public /* synthetic */ lpm(lql lqlVar, int i) {
        this.f38905b = i;
        this.f38904a = lqlVar;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        lre lreVar;
        switch (this.f38905b) {
            case 0:
                Object obj = this.f38904a;
                int i = lpv.f38914c;
                return lpf.m15820a((Context) obj);
            case 1:
                return new C1058va(Collections.singletonList(lsc.m15930g((Context) this.f38904a).m15363d()), (byte[]) null);
            case 2:
                Object obj2 = this.f38904a;
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                lql lqlVar = (lql) obj2;
                lrd lrdVar = lqlVar.f38976g;
                int i2 = 7;
                try {
                    lreVar = (lre) ((lpj) lrdVar.f39057b).m15829f().m19466E((Uri) lrdVar.f39058c, new lss((nzd) lre.f39061h.m18143ad(7)));
                    break;
                } catch (IOException | RuntimeException e) {
                    lreVar = lre.f39061h;
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                if (lreVar.f39064b.isEmpty()) {
                    lqlVar.f38970a.m15826b().execute(new lmg(lqlVar, 5));
                    return mzw.f41870a;
                }
                lqlVar.f38975f = lreVar.f39064b;
                lqlVar.f38970a.m15826b().execute(new lmg(lqlVar, 6));
                if (lqi.f38964a == null) {
                    synchronized (lqi.class) {
                        if (lqi.f38964a == null) {
                            lqi.f38964a = new lqi();
                        }
                        lqi lqiVar = lqi.f38964a;
                        break;
                    }
                }
                nwr nwrVar = lreVar.f39065c;
                lqlVar.f38970a.m15826b().execute(new lmg(lqlVar, i2));
                return lrd.m15907a(lreVar);
            default:
                return ((lql) this.f38904a).m15882a();
        }
    }
}
