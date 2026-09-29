package p150h9;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import p482xd.InterfaceC10177i;
import ua.C9492a;
import ua.C9496e;

/* JADX INFO: renamed from: h9.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5915h implements InterfaceC10177i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35302b;

    public /* synthetic */ C5915h(int i10, Object obj) {
        this.f35301a = i10;
        this.f35302b = obj;
    }

    @Override // p482xd.InterfaceC10177i
    public final Object get() {
        int i10 = this.f35301a;
        Object obj = this.f35302b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C9496e((Context) obj, new C9492a.b());
            default:
                try {
                    return (InterfaceC2492i.a) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
