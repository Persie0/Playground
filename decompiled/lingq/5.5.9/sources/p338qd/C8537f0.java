package p338qd;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3114e;
import com.google.android.play.core.assetpacks.C3118i;
import com.google.android.play.core.assetpacks.C3119j;
import sd.C8990a;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8537f0 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45837a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f45838b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9271s f45839c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9271s f45840d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9271s f45841e;

    public /* synthetic */ C8537f0(InterfaceC9271s interfaceC9271s, InterfaceC9271s interfaceC9271s2, InterfaceC9271s interfaceC9271s3, InterfaceC9271s interfaceC9271s4, int i10) {
        this.f45837a = i10;
        this.f45838b = interfaceC9271s;
        this.f45839c = interfaceC9271s2;
        this.f45840d = interfaceC9271s3;
        this.f45841e = interfaceC9271s4;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10 = this.f45837a;
        InterfaceC9271s interfaceC9271s = this.f45841e;
        InterfaceC9271s interfaceC9271s2 = this.f45840d;
        InterfaceC9271s interfaceC9271s3 = this.f45839c;
        InterfaceC9271s interfaceC9271s4 = this.f45838b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new BinderC8575s(((C8586v1) interfaceC9271s4).m16807a(), (C3112c) interfaceC9271s3.zza(), (C8571q1) interfaceC9271s2.zza(), (ServiceConnectionC8552k0) interfaceC9271s.zza());
            default:
                Object objZza = interfaceC9271s4.zza();
                Object objZza2 = interfaceC9271s3.zza();
                return new C3119j((C3118i) objZza, (C3112c) objZza2, (C3114e) interfaceC9271s2.zza(), (C8990a) interfaceC9271s.zza());
        }
    }
}
