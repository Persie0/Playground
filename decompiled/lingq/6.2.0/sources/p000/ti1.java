package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class ti1 implements z92 {
    @Override // p000.z92
    /* JADX INFO: renamed from: a */
    public final boolean mo10374a(SSLSocket sSLSocket) {
        return vi1.f65411b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: i */
    public final jd9 mo10375i(SSLSocket sSLSocket) {
        return new vi1();
    }
}
