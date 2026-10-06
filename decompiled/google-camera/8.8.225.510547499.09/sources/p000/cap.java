package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cap implements bqn {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4921b = 0;

    /* JADX INFO: renamed from: c */
    private final int f4922c;

    /* JADX INFO: renamed from: d */
    private final bqn f4923d;

    public cap(int i, bqn bqnVar) {
        this.f4922c = i;
        this.f4923d = bqnVar;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        this.f4923d.mo2922a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4922c).array());
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof cap) {
            cap capVar = (cap) obj;
            if (this.f4922c == capVar.f4922c && this.f4923d.equals(capVar.f4923d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return cbi.m3383d(this.f4923d, this.f4922c);
    }
}
