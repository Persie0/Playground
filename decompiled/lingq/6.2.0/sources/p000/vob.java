package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vob {

    /* JADX INFO: renamed from: a */
    public final String f65728a;

    /* JADX INFO: renamed from: b */
    public final String f65729b;

    /* JADX INFO: renamed from: c */
    public final String f65730c;

    /* JADX INFO: renamed from: d */
    public final long f65731d;

    /* JADX INFO: renamed from: e */
    public final long f65732e;

    /* JADX INFO: renamed from: f */
    public final long f65733f;

    /* JADX INFO: renamed from: g */
    public final zzbf f65734g;

    public vob(kjc kjcVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        lda.m16127m(str2);
        lda.m16127m(str3);
        this.f65728a = str2;
        this.f65729b = str3;
        this.f65730c = true == TextUtils.isEmpty(str) ? null : str;
        this.f65731d = j;
        this.f65732e = j2;
        this.f65733f = j3;
        if (j3 != 0 && j3 > j) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(xcc.m24449L(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17923a("Param name can't be null");
                    it.remove();
                } else {
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    Object objM20529M = radVar.m20529M(bundle2.get(next), next);
                    if (objM20529M == null) {
                        xcc xccVar3 = kjcVar.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68083i.m17924b(kjcVar.f47442j.m20573b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        rad radVar2 = kjcVar.f47441i;
                        kjc.m15278j(radVar2);
                        radVar2.m20539U(bundle2, next, objM20529M);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.f65734g = zzbfVar;
    }

    /* JADX INFO: renamed from: a */
    public final vob m23461a(kjc kjcVar, long j) {
        return new vob(kjcVar, this.f65730c, this.f65728a, this.f65729b, this.f65731d, this.f65732e, j, this.f65734g);
    }

    public final String toString() {
        String string = this.f65734g.toString();
        String str = this.f65728a;
        int length = String.valueOf(str).length();
        String str2 = this.f65729b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        AbstractC3393o1.m17725C(sb, "Event{appId='", str, "', name='", str2);
        return AbstractC3393o1.m17739n(sb, "', params=", string, "}");
    }

    public vob(kjc kjcVar, String str, String str2, String str3, long j, long j2, long j3, zzbf zzbfVar) {
        lda.m16127m(str2);
        lda.m16127m(str3);
        lda.m16130p(zzbfVar);
        this.f65728a = str2;
        this.f65729b = str3;
        this.f65730c = true == TextUtils.isEmpty(str) ? null : str;
        this.f65731d = j;
        this.f65732e = j2;
        this.f65733f = j3;
        if (j3 != 0 && j3 > j) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17925c("Event created with reverse previous/current timestamps. appId, name", xcc.m24449L(str2), xcc.m24449L(str3));
        }
        this.f65734g = zzbfVar;
    }
}
