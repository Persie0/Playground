package p392t5;

import ae.C0062b;
import java.security.MessageDigest;
import java.util.Map;
import p258m6.C7482b;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8738h;

/* JADX INFO: renamed from: t5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9202h implements InterfaceC8732b {

    /* JADX INFO: renamed from: b */
    public final Object f47751b;

    /* JADX INFO: renamed from: c */
    public final int f47752c;

    /* JADX INFO: renamed from: d */
    public final int f47753d;

    /* JADX INFO: renamed from: e */
    public final Class<?> f47754e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f47755f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8732b f47756g;

    /* JADX INFO: renamed from: h */
    public final Map<Class<?>, InterfaceC8738h<?>> f47757h;

    /* JADX INFO: renamed from: i */
    public final C8735e f47758i;

    /* JADX INFO: renamed from: j */
    public int f47759j;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C9202h(Object obj, InterfaceC8732b interfaceC8732b, int i10, int i11, C7482b c7482b, Class cls, Class cls2, C8735e c8735e) {
        C0062b.m345f0(obj);
        this.f47751b = obj;
        if (interfaceC8732b == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f47756g = interfaceC8732b;
        this.f47752c = i10;
        this.f47753d = i11;
        C0062b.m345f0(c7482b);
        this.f47757h = c7482b;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f47754e = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f47755f = cls2;
        C0062b.m345f0(c8735e);
        this.f47758i = c8735e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p356r5.InterfaceC8732b
    /* JADX INFO: renamed from: b */
    public final void mo162b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p356r5.InterfaceC8732b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C9202h)) {
            return false;
        }
        C9202h c9202h = (C9202h) obj;
        return this.f47751b.equals(c9202h.f47751b) && this.f47756g.equals(c9202h.f47756g) && this.f47753d == c9202h.f47753d && this.f47752c == c9202h.f47752c && this.f47757h.equals(c9202h.f47757h) && this.f47754e.equals(c9202h.f47754e) && this.f47755f.equals(c9202h.f47755f) && this.f47758i.equals(c9202h.f47758i);
    }

    @Override // p356r5.InterfaceC8732b
    public final int hashCode() {
        if (this.f47759j == 0) {
            int iHashCode = this.f47751b.hashCode();
            this.f47759j = iHashCode;
            int iHashCode2 = ((((this.f47756g.hashCode() + (iHashCode * 31)) * 31) + this.f47752c) * 31) + this.f47753d;
            this.f47759j = iHashCode2;
            int iHashCode3 = this.f47757h.hashCode() + (iHashCode2 * 31);
            this.f47759j = iHashCode3;
            int iHashCode4 = this.f47754e.hashCode() + (iHashCode3 * 31);
            this.f47759j = iHashCode4;
            int iHashCode5 = this.f47755f.hashCode() + (iHashCode4 * 31);
            this.f47759j = iHashCode5;
            this.f47759j = this.f47758i.hashCode() + (iHashCode5 * 31);
        }
        return this.f47759j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f47751b + ", width=" + this.f47752c + ", height=" + this.f47753d + ", resourceClass=" + this.f47754e + ", transcodeClass=" + this.f47755f + ", signature=" + this.f47756g + ", hashCode=" + this.f47759j + ", transformations=" + this.f47757h + ", options=" + this.f47758i + '}';
    }
}
