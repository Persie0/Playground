package cc;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: cc.d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1801d7 implements InterfaceC1878m3, InterfaceC1891n7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1846i7 f9762a;

    public /* synthetic */ C1801d7(C1846i7 c1846i7) {
        this.f9762a = c1846i7;
    }

    @Override // cc.InterfaceC1891n7
    /* JADX INFO: renamed from: a */
    public final void mo5572a(String str, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C1846i7 c1846i7 = this.f9762a;
        if (!zIsEmpty) {
            c1846i7.mo5518f().m5753p(new RunnableC1819f7(this, str, bundle));
            return;
        }
        C1897o4 c1897o4 = c1846i7.f9902l;
        if (c1897o4 != null) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b("_err", "AppId not known when logging event");
        }
    }

    @Override // cc.InterfaceC1878m3
    /* JADX INFO: renamed from: b */
    public final void mo5573b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f9762a.m5653l(str, i10, th2, bArr, map);
    }
}
