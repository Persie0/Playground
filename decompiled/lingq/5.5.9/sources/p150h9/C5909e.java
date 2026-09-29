package p150h9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;
import p482xd.InterfaceC10177i;
import ua.AbstractC9510s;

/* JADX INFO: renamed from: h9.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5909e implements InterfaceC10177i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35281b;

    public /* synthetic */ C5909e(int i10, Object obj) {
        this.f35280a = i10;
        this.f35281b = obj;
    }

    @Override // p482xd.InterfaceC10177i
    public final Object get() {
        int i10 = this.f35280a;
        Object obj = this.f35281b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return (AbstractC9510s) obj;
            default:
                return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
    }
}
