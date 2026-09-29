package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import cc.C1843i4;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2640e1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14162e = null;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14163f = null;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f14164g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f14165h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2870v1 f14166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2640e1(C2870v1 c2870v1, Context context, Bundle bundle) {
        super(c2870v1, true);
        this.f14166i = c2870v1;
        this.f14164g = context;
        this.f14165h = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() {
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean z11;
        try {
            C2870v1 c2870v1 = this.f14166i;
            String str4 = this.f14162e;
            String str5 = this.f14163f;
            c2870v1.getClass();
            if (str5 == null || str4 == null) {
                z10 = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C2870v1.class.getClassLoader());
                    z11 = true;
                } catch (ClassNotFoundException unused) {
                    z11 = false;
                }
                if (z11) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            InterfaceC2804q0 interfaceC2804q0AsInterface = null;
            if (z10) {
                str3 = this.f14163f;
                str2 = this.f14162e;
                str = this.f14166i.f14466a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C6272i.m12915i(this.f14164g);
            C2870v1 c2870v2 = this.f14166i;
            Context context = this.f14164g;
            c2870v2.getClass();
            try {
                interfaceC2804q0AsInterface = AbstractBinderC2791p0.asInterface(DynamiteModule.m7625c(context, DynamiteModule.f14024b, ModuleDescriptor.MODULE_ID).m7631b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e10) {
                c2870v2.m8299a(e10, true, false);
            }
            c2870v2.f14473h = interfaceC2804q0AsInterface;
            if (this.f14166i.f14473h == null) {
                Log.w(this.f14166i.f14466a, "Failed to connect to measurement client.");
                return;
            }
            int iM7624a = DynamiteModule.m7624a(this.f14164g, ModuleDescriptor.MODULE_ID);
            int iM7626d = DynamiteModule.m7626d(this.f14164g, ModuleDescriptor.MODULE_ID, false);
            zzcl zzclVar = new zzcl(76003L, Math.max(iM7624a, iM7626d), iM7626d < iM7624a, str, str2, str3, this.f14165h, C1843i4.m5627a(this.f14164g));
            InterfaceC2804q0 interfaceC2804q0 = this.f14166i.f14473h;
            C6272i.m12915i(interfaceC2804q0);
            interfaceC2804q0.initialize(new BinderC8215b(this.f14164g), zzclVar, this.f14383a);
        } catch (Exception e11) {
            this.f14166i.m8299a(e11, true, false);
        }
    }
}
