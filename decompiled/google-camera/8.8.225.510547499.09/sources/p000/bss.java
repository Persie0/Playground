package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bss implements bqn {

    /* JADX INFO: renamed from: b */
    private final Object f4368b;

    /* JADX INFO: renamed from: c */
    private final int f4369c;

    /* JADX INFO: renamed from: d */
    private final int f4370d;

    /* JADX INFO: renamed from: e */
    private final Class f4371e;

    /* JADX INFO: renamed from: f */
    private final Class f4372f;

    /* JADX INFO: renamed from: g */
    private final bqn f4373g;

    /* JADX INFO: renamed from: h */
    private final Map f4374h;

    /* JADX INFO: renamed from: i */
    private final bqr f4375i;

    /* JADX INFO: renamed from: j */
    private int f4376j;

    public bss(Object obj, bqn bqnVar, int i, int i2, Map map, Class cls, Class cls2, bqr bqrVar) {
        bzq.m3278r(obj);
        this.f4368b = obj;
        bzq.m3277q(bqnVar, "Signature must not be null");
        this.f4373g = bqnVar;
        this.f4369c = i;
        this.f4370d = i2;
        bzq.m3278r(map);
        this.f4374h = map;
        bzq.m3277q(cls, "Resource class must not be null");
        this.f4371e = cls;
        this.f4372f = cls2;
        bzq.m3278r(bqrVar);
        this.f4375i = bqrVar;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof bss) {
            bss bssVar = (bss) obj;
            if (this.f4368b.equals(bssVar.f4368b) && this.f4373g.equals(bssVar.f4373g) && this.f4370d == bssVar.f4370d && this.f4369c == bssVar.f4369c && this.f4374h.equals(bssVar.f4374h) && this.f4371e.equals(bssVar.f4371e) && this.f4372f.equals(bssVar.f4372f) && this.f4375i.equals(bssVar.f4375i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        int i = this.f4376j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f4368b.hashCode();
        this.f4376j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.f4373g.hashCode()) * 31) + this.f4369c) * 31) + this.f4370d;
        this.f4376j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.f4374h.hashCode();
        this.f4376j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.f4371e.hashCode();
        this.f4376j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f4372f.hashCode();
        this.f4376j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.f4375i.hashCode();
        this.f4376j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4368b.toString() + ", width=" + this.f4369c + ", height=" + this.f4370d + ", resourceClass=" + this.f4371e.toString() + ", transcodeClass=" + this.f4372f.toString() + ", signature=" + this.f4373g.toString() + ", hashCode=" + this.f4376j + ", transformations=" + this.f4374h.toString() + ", options=" + this.f4375i.toString() + "}";
    }
}
