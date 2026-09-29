package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdb;

/* JADX INFO: loaded from: classes.dex */
public final class d74 {

    /* JADX INFO: renamed from: a */
    public final Context f35077a;

    /* JADX INFO: renamed from: b */
    public final long f35078b;

    /* JADX INFO: renamed from: c */
    public final boolean f35079c;

    /* JADX INFO: renamed from: d */
    public final String f35080d;

    /* JADX INFO: renamed from: e */
    public final Object f35081e;

    /* JADX INFO: renamed from: f */
    public final Object f35082f;

    /* JADX INFO: renamed from: g */
    public final Object f35083g;

    /* JADX INFO: renamed from: h */
    public final Object f35084h;

    public d74(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.f35079c = true;
        lda.m16130p(context);
        Context applicationContext = context.getApplicationContext();
        lda.m16130p(applicationContext);
        this.f35077a = applicationContext;
        this.f35083g = l;
        this.f35084h = l2;
        if (zzdbVar != null) {
            this.f35082f = zzdbVar;
            this.f35079c = zzdbVar.f11876c;
            this.f35078b = zzdbVar.f11875b;
            this.f35080d = zzdbVar.f11878e;
            Bundle bundle = zzdbVar.f11877d;
            if (bundle != null) {
                this.f35081e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    public d74(long j, Context context, String str, String str2, ny8 ny8Var, String str3, boolean z, String str4, k16 k16Var) {
        this.f35078b = j;
        this.f35077a = context;
        this.f35080d = str;
        this.f35081e = str2;
        this.f35084h = ny8Var;
        this.f35082f = str3;
        this.f35079c = z;
        this.f35083g = str4;
    }
}
