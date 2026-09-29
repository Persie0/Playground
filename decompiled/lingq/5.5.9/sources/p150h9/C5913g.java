package p150h9;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2415l;
import com.google.android.exoplayer2.source.C2476d;
import p261m9.C7505f;
import p482xd.InterfaceC10177i;

/* JADX INFO: renamed from: h9.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5913g implements InterfaceC10177i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35296b;

    public /* synthetic */ C5913g(int i10, Object obj) {
        this.f35295a = i10;
        this.f35296b = obj;
    }

    @Override // p482xd.InterfaceC10177i
    public final Object get() {
        int i10 = this.f35295a;
        Object obj = this.f35296b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C2476d((Context) obj, new C7505f());
            default:
                return Boolean.valueOf(((C2415l) obj).f12363U);
        }
    }
}
