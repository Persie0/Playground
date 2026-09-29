package p338qd;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3110a;
import com.google.android.play.core.assetpacks.C3112c;
import sd.C8990a;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8569q implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45943a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f45944b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9271s f45945c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9271s f45946d;

    public /* synthetic */ C8569q(InterfaceC9271s interfaceC9271s, InterfaceC9271s interfaceC9271s2, InterfaceC9271s interfaceC9271s3, int i10) {
        this.f45943a = i10;
        this.f45944b = interfaceC9271s;
        this.f45945c = interfaceC9271s2;
        this.f45946d = interfaceC9271s3;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10 = this.f45943a;
        InterfaceC9271s interfaceC9271s = this.f45946d;
        InterfaceC9271s interfaceC9271s2 = this.f45945c;
        InterfaceC9271s interfaceC9271s3 = this.f45944b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C3110a(((C8586v1) interfaceC9271s3).m16807a(), (C8561n0) interfaceC9271s2.zza(), (C8544h1) interfaceC9271s.zza());
            default:
                Object objZza = interfaceC9271s3.zza();
                return new C8544h1((C3112c) objZza, (C8547i1) interfaceC9271s2.zza(), (C8990a) interfaceC9271s.zza());
        }
    }
}
