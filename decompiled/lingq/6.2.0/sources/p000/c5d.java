package p000;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzr;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c5d extends h8d {

    /* JADX INFO: renamed from: d */
    public final HashMap f9596d;

    /* JADX INFO: renamed from: e */
    public final qg9 f9597e;

    /* JADX INFO: renamed from: f */
    public final qg9 f9598f;

    /* JADX INFO: renamed from: g */
    public final qg9 f9599g;

    /* JADX INFO: renamed from: h */
    public final qg9 f9600h;

    /* JADX INFO: renamed from: i */
    public final qg9 f9601i;

    /* JADX INFO: renamed from: j */
    public final qg9 f9602j;

    public c5d(C1045d c1045d) {
        super(c1045d);
        this.f9596d = new HashMap();
        qfc qfcVar = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar);
        this.f9597e = new qg9(qfcVar, "last_delete_stale", 0L);
        qfc qfcVar2 = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar2);
        this.f9598f = new qg9(qfcVar2, "last_delete_stale_batch", 0L);
        qfc qfcVar3 = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar3);
        this.f9599g = new qg9(qfcVar3, "backoff", 0L);
        qfc qfcVar4 = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar4);
        this.f9600h = new qg9(qfcVar4, "last_upload", 0L);
        qfc qfcVar5 = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar5);
        this.f9601i = new qg9(qfcVar5, "last_upload_attempt", 0L);
        qfc qfcVar6 = ((kjc) this.f60774a).f47437e;
        kjc.m15278j(qfcVar6);
        this.f9602j = new qg9(qfcVar6, "midnight_offset", 0L);
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
    }

    /* JADX INFO: renamed from: H */
    public final Pair m4334H(zzr zzrVar, npc npcVar) {
        String str = zzrVar.f12432a;
        lda.m16127m(str);
        return (npcVar.m17590i(zzjk.AD_STORAGE) && zzrVar.f12414I) ? m4335I(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I */
    public final Pair m4335I(String str) {
        y4d y4dVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        gr7 gr7Var = kjcVar.f47443k;
        cmb cmbVar = kjcVar.f47436d;
        gr7Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f9596d;
        y4d y4dVar2 = (y4d) map.get(str);
        if (y4dVar2 != null && jElapsedRealtime < y4dVar2.f69299c) {
            return new Pair(y4dVar2.f69297a, Boolean.valueOf(y4dVar2.f69298b));
        }
        long jM4866L = cmbVar.m4866L(str, z8c.f71156b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(kjcVar.f47433a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (y4dVar2 != null && jElapsedRealtime < y4dVar2.f69299c + cmbVar.m4866L(str, z8c.f71159c)) {
                    return new Pair(y4dVar2.f69297a, Boolean.valueOf(y4dVar2.f69298b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            y4dVar = id != null ? new y4d(jM4866L, id, advertisingIdInfo.isLimitAdTrackingEnabled()) : new y4d(jM4866L, "", advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(str, y4dVar);
            return new Pair(y4dVar.f69297a, Boolean.valueOf(y4dVar.f69298b));
        } catch (Exception e) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68075H.m17924b(e, "Unable to get advertising id");
            y4dVar = new y4d(jM4866L, "", false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final String m4336J(zzr zzrVar, npc npcVar) {
        String str = zzrVar.f12432a;
        lda.m16127m(str);
        if (!npcVar.m17590i(zzjk.AD_STORAGE) || !zzrVar.f12414I) {
            return "";
        }
        mo12359D();
        String str2 = (String) m4335I(str).first;
        MessageDigest messageDigestM20504W = rad.m20504W();
        if (messageDigestM20504W == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM20504W.digest(str2.getBytes())));
    }
}
