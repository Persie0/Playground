package p452w8;

import p395t8.AbstractC9221c;
import p395t8.C9220b;
import p395t8.InterfaceC9222d;

/* JADX INFO: renamed from: w8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9828i extends AbstractC9837r {

    /* JADX INFO: renamed from: a */
    public final AbstractC9838s f50020a;

    /* JADX INFO: renamed from: b */
    public final String f50021b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9221c<?> f50022c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9222d<?, byte[]> f50023d;

    /* JADX INFO: renamed from: e */
    public final C9220b f50024e;

    public C9828i(AbstractC9838s abstractC9838s, String str, AbstractC9221c abstractC9221c, InterfaceC9222d interfaceC9222d, C9220b c9220b) {
        this.f50020a = abstractC9838s;
        this.f50021b = str;
        this.f50022c = abstractC9221c;
        this.f50023d = interfaceC9222d;
        this.f50024e = c9220b;
    }

    @Override // p452w8.AbstractC9837r
    /* JADX INFO: renamed from: a */
    public final C9220b mo18314a() {
        return this.f50024e;
    }

    @Override // p452w8.AbstractC9837r
    /* JADX INFO: renamed from: b */
    public final AbstractC9221c<?> mo18315b() {
        return this.f50022c;
    }

    @Override // p452w8.AbstractC9837r
    /* JADX INFO: renamed from: c */
    public final InterfaceC9222d<?, byte[]> mo18316c() {
        return this.f50023d;
    }

    @Override // p452w8.AbstractC9837r
    /* JADX INFO: renamed from: d */
    public final AbstractC9838s mo18317d() {
        return this.f50020a;
    }

    @Override // p452w8.AbstractC9837r
    /* JADX INFO: renamed from: e */
    public final String mo18318e() {
        return this.f50021b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9837r)) {
            return false;
        }
        AbstractC9837r abstractC9837r = (AbstractC9837r) obj;
        return this.f50020a.equals(abstractC9837r.mo18317d()) && this.f50021b.equals(abstractC9837r.mo18318e()) && this.f50022c.equals(abstractC9837r.mo18315b()) && this.f50023d.equals(abstractC9837r.mo18316c()) && this.f50024e.equals(abstractC9837r.mo18314a());
    }

    public final int hashCode() {
        return ((((((((this.f50020a.hashCode() ^ 1000003) * 1000003) ^ this.f50021b.hashCode()) * 1000003) ^ this.f50022c.hashCode()) * 1000003) ^ this.f50023d.hashCode()) * 1000003) ^ this.f50024e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f50020a + ", transportName=" + this.f50021b + ", event=" + this.f50022c + ", transformer=" + this.f50023d + ", encoding=" + this.f50024e + "}";
    }
}
