package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.InterfaceC2532v;
import p150h9.C5920j0;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6219i implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36176c;

    public /* synthetic */ C6219i(int i10, int i11, Object obj) {
        this.f36174a = i11;
        this.f36175b = obj;
        this.f36176c = i10;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f36174a;
        int i11 = this.f36176c;
        Object obj2 = this.f36175b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).mo12793g((InterfaceC6208b.a) obj2, i11);
                break;
            case 1:
                ((InterfaceC6208b) obj).mo12778M((InterfaceC6208b.a) obj2, i11);
                break;
            default:
                int i12 = C2413j.f12267x0;
                AbstractC2382c0 abstractC2382c0 = ((C5920j0) obj2).f35313a;
                ((InterfaceC2532v.c) obj).mo7494X(i11);
                break;
        }
    }
}
