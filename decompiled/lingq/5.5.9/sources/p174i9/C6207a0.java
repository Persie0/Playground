package p174i9;

import android.util.Base64;
import p482xd.InterfaceC10177i;

/* JADX INFO: renamed from: i9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6207a0 implements InterfaceC10177i {
    @Override // p482xd.InterfaceC10177i
    public final Object get() {
        byte[] bArr = new byte[12];
        C6209b0.f36111h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
