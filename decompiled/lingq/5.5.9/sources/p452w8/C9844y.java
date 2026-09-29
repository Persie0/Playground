package p452w8;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import p030b9.C1344c;
import p030b9.InterfaceC1345d;
import p045c9.C1753g;
import p045c9.C1755i;
import p045c9.InterfaceC1757k;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p477x8.InterfaceC10117d;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: w8.y */
/* JADX INFO: loaded from: classes.dex */
public final class C9844y implements InterfaceC10306b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50057a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a f50058b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a f50059c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8825a f50060d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8825a f50061e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8825a f50062f;

    public /* synthetic */ C9844y(InterfaceC8825a interfaceC8825a, InterfaceC8825a interfaceC8825a2, InterfaceC10306b interfaceC10306b, InterfaceC8825a interfaceC8825a3, InterfaceC8825a interfaceC8825a4, int i10) {
        this.f50057a = i10;
        this.f50058b = interfaceC8825a;
        this.f50059c = interfaceC8825a2;
        this.f50060d = interfaceC10306b;
        this.f50061e = interfaceC8825a3;
        this.f50062f = interfaceC8825a4;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        int i10 = this.f50057a;
        InterfaceC8825a interfaceC8825a = this.f50062f;
        InterfaceC8825a interfaceC8825a2 = this.f50061e;
        InterfaceC8825a interfaceC8825a3 = this.f50060d;
        InterfaceC8825a interfaceC8825a4 = this.f50059c;
        InterfaceC8825a interfaceC8825a5 = this.f50058b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C9842w((InterfaceC5478a) interfaceC8825a5.get(), (InterfaceC5478a) interfaceC8825a4.get(), (InterfaceC1345d) interfaceC8825a3.get(), (C1753g) interfaceC8825a2.get(), (C1755i) interfaceC8825a.get());
            default:
                return new C1344c((Executor) interfaceC8825a5.get(), (InterfaceC10117d) interfaceC8825a4.get(), (InterfaceC1757k) interfaceC8825a3.get(), (InterfaceC5090d) interfaceC8825a2.get(), (InterfaceC5385a) interfaceC8825a.get());
        }
    }
}
