package p338qd;

import ae.C0062b;
import android.content.ComponentName;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3122m;
import td.C9263k;
import td.C9270r;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8587w implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46033a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f46034b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9271s f46035c;

    public /* synthetic */ C8587w(InterfaceC9271s interfaceC9271s, InterfaceC9271s interfaceC9271s2, int i10) {
        this.f46033a = i10;
        this.f46034b = interfaceC9271s;
        this.f46035c = interfaceC9271s2;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10 = this.f46033a;
        InterfaceC9271s interfaceC9271s = this.f46035c;
        InterfaceC9271s interfaceC9271s2 = this.f46034b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C3112c(((C8586v1) interfaceC9271s2).m16807a(), (C8547i1) interfaceC9271s.zza());
            case 1:
                return new C3122m((C3112c) interfaceC9271s2.zza(), C9270r.m17630a(interfaceC9271s));
            default:
                Object objZza = interfaceC9271s2.zza();
                Context contextM16807a = ((C8586v1) interfaceC9271s).m16807a();
                C8571q1 c8571q1 = (C8571q1) objZza;
                C9263k.m17623a(contextM16807a.getPackageManager(), new ComponentName(contextM16807a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
                C9263k.m17623a(contextM16807a.getPackageManager(), new ComponentName(contextM16807a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
                C0062b.m271G2(c8571q1);
                return c8571q1;
        }
    }
}
