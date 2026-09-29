package p118fe;

import af.C0072e;
import android.content.Context;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: fe.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5516h implements InterfaceC2005b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34167c;

    public /* synthetic */ C5516h(Object obj, int i10, Object obj2) {
        this.f34165a = i10;
        this.f34166b = obj;
        this.f34167c = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cf.InterfaceC2005b
    public final Object get() {
        int i10 = this.f34165a;
        Object obj = this.f34167c;
        Object obj2 = this.f34166b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5519k c5519k = (C5519k) obj2;
                C5511c c5511c = (C5511c) obj;
                c5519k.getClass();
                return c5511c.f34155f.mo35k(new C5528t(c5511c, c5519k));
            default:
                return new C0072e((Context) obj2, (String) obj);
        }
    }
}
