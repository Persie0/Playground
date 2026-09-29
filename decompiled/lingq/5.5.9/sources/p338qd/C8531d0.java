package p338qd;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3114e;
import com.google.android.play.core.assetpacks.C3126q;
import td.C9270r;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8531d0 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45819a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f45820b;

    public /* synthetic */ C8531d0(InterfaceC9271s interfaceC9271s, int i10) {
        this.f45819a = i10;
        this.f45820b = interfaceC9271s;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10 = this.f45819a;
        InterfaceC9271s interfaceC9271s = this.f45820b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C3114e(C9270r.m17630a(interfaceC9271s));
            case 1:
                return new C8547i1(((C8586v1) interfaceC9271s).m16807a());
            default:
                return new C3126q((C3112c) interfaceC9271s.zza());
        }
    }
}
