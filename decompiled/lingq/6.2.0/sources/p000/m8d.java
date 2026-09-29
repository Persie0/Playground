package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzls;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m8d extends p7d {
    /* JADX INFO: renamed from: G */
    public static final boolean m16684G(String str) {
        String str2 = (String) z8c.f71201t.m21901a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r8.m15068H().m4566s()) goto L24;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k8d m16685E(String str) {
        kjc kjcVar = (kjc) this.f60774a;
        C1045d c1045d = this.f55716b;
        nnb nnbVar = c1045d.f12360c;
        shc shcVar = c1045d.f12356a;
        C1045d.m5885T(nnbVar);
        gec gecVarM17517H0 = nnbVar.m17517H0(str);
        k8d k8dVar = null;
        if (gecVarM17517H0 == null || !gecVarM17517H0.m12563z()) {
            return new k8d(m16686F(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, null);
        }
        alc alcVarM580t = amc.m580t();
        alcVarM580t.m548h(2);
        zzin zzinVarZzb = zzin.zzb(gecVarM17517H0.m12557t());
        lda.m16130p(zzinVarZzb);
        alcVarM580t.m547g(zzinVarZzb);
        String strM12523F = gecVarM17517H0.m12523F();
        C1045d.m5885T(shcVar);
        kbc kbcVarM21380P = shcVar.m21380P(str);
        if (kbcVarM21380P != null) {
            nnb nnbVar2 = c1045d.f12360c;
            C1045d.m5885T(nnbVar2);
            gec gecVarM17517H1 = nnbVar2.m17517H0(str);
            if (gecVarM17517H1 != null) {
                if (!kbcVarM21380P.m15067G() || kbcVarM21380P.m15068H().m4566s() != 100) {
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    if (!radVar.m20544h0(str, gecVarM17517H1.m12521D())) {
                        if (!TextUtils.isEmpty(strM12523F)) {
                        }
                    }
                }
                String strM12522E = gecVarM17517H0.m12522E();
                alcVarM580t.m548h(2);
                C1045d.m5885T(shcVar);
                kbc kbcVarM21380P2 = shcVar.m21380P(gecVarM17517H0.m12522E());
                if (kbcVarM21380P2 == null || !kbcVarM21380P2.m15067G()) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17924b(strM12522E, "[sgtm] Missing sgtm_setting in remote config. appId");
                    alcVarM580t.m549i(4);
                } else {
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(gecVarM17517H0.m12521D())) {
                        map.put("x-gtm-server-preview", gecVarM17517H0.m12521D());
                    }
                    String strM4567t = kbcVarM21380P2.m15068H().m4567t();
                    zzin zzinVarZzb2 = zzin.zzb(gecVarM17517H0.m12557t());
                    if (zzinVarZzb2 != null && zzinVarZzb2 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
                        alcVarM580t.m547g(zzinVarZzb2);
                    } else if (m16684G(gecVarM17517H0.m12522E())) {
                        alcVarM580t.m547g(zzin.PINNED_TO_SERVICE_UPLOAD);
                    } else if (TextUtils.isEmpty(strM4567t)) {
                        alcVarM580t.m547g(zzin.MISSING_SGTM_SERVER_URL);
                    } else {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68076I.m17924b(strM12522E, "[sgtm] Eligible for client side upload. appId");
                        alcVarM580t.m548h(3);
                        alcVarM580t.m547g(zzin.CLIENT_UPLOAD_ELIGIBLE);
                        k8dVar = new k8d(strM4567t, map, zzls.SGTM_CLIENT, (amc) alcVarM580t.m22741d());
                    }
                    kbcVarM21380P2.m15068H().getClass();
                    kbcVarM21380P2.m15068H().getClass();
                    kjcVar.getClass();
                    xcc xccVar3 = kjcVar.f47438f;
                    if (TextUtils.isEmpty(strM4567t)) {
                        alcVarM580t.m549i(6);
                        kjc.m15280l(xccVar3);
                        xccVar3.f68076I.m17924b(gecVarM17517H0.m12522E(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        kjc.m15280l(xccVar3);
                        xccVar3.f68076I.m17924b(strM12522E, "[sgtm] Eligible for local service direct upload. appId");
                        alcVarM580t.m548h(5);
                        alcVarM580t.m549i(2);
                        k8dVar = new k8d(strM4567t, map, zzls.SGTM, (amc) alcVarM580t.m22741d());
                    }
                }
                return k8dVar != null ? k8dVar : new k8d(m16686F(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (amc) alcVarM580t.m22741d());
            }
        }
        alcVarM580t.m549i(3);
        return new k8d(m16686F(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (amc) alcVarM580t.m22741d());
    }

    /* JADX INFO: renamed from: F */
    public final String m16686F(String str) {
        shc shcVar = this.f55716b.f12356a;
        C1045d.m5885T(shcVar);
        String strM21381Q = shcVar.m21381Q(str);
        if (TextUtils.isEmpty(strM21381Q)) {
            return (String) z8c.f71197r.m21901a(null);
        }
        Uri uri = Uri.parse((String) z8c.f71197r.m21901a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM21381Q).length() + 1 + String.valueOf(authority).length());
        sb.append(strM21381Q);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
