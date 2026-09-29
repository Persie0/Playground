package cc;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.e5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1808e5 {

    /* JADX INFO: renamed from: a */
    public final Context f9773a;

    /* JADX INFO: renamed from: b */
    public final String f9774b;

    /* JADX INFO: renamed from: c */
    public final String f9775c;

    /* JADX INFO: renamed from: d */
    public final String f9776d;

    /* JADX INFO: renamed from: e */
    public final Boolean f9777e;

    /* JADX INFO: renamed from: f */
    public final long f9778f;

    /* JADX INFO: renamed from: g */
    public final zzcl f9779g;

    /* JADX INFO: renamed from: h */
    public final boolean f9780h;

    /* JADX INFO: renamed from: i */
    public final Long f9781i;

    /* JADX INFO: renamed from: j */
    public final String f9782j;

    public C1808e5(Context context, zzcl zzclVar, Long l10) {
        this.f9780h = true;
        C6272i.m12915i(context);
        Context applicationContext = context.getApplicationContext();
        C6272i.m12915i(applicationContext);
        this.f9773a = applicationContext;
        this.f9781i = l10;
        if (zzclVar != null) {
            this.f9779g = zzclVar;
            this.f9774b = zzclVar.f14534f;
            this.f9775c = zzclVar.f14533e;
            this.f9776d = zzclVar.f14532d;
            this.f9780h = zzclVar.f14531c;
            this.f9778f = zzclVar.f14530b;
            this.f9782j = zzclVar.f14536h;
            Bundle bundle = zzclVar.f14535g;
            if (bundle != null) {
                this.f9777e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
