package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7759p extends AbstractC7743b0.e.d.a.b.AbstractC10658b {

    /* JADX INFO: renamed from: a */
    public final String f42631a;

    /* JADX INFO: renamed from: b */
    public final String f42632b;

    /* JADX INFO: renamed from: c */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a> f42633c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7743b0.e.d.a.b.AbstractC10658b f42634d;

    /* JADX INFO: renamed from: e */
    public final int f42635e;

    public C7759p() {
        throw null;
    }

    public C7759p(String str, String str2, C7745c0 c7745c0, AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b, int i10) {
        this.f42631a = str;
        this.f42632b = str2;
        this.f42633c = c7745c0;
        this.f42634d = abstractC10658b;
        this.f42635e = i10;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10658b
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.e.d.a.b.AbstractC10658b mo15417a() {
        return this.f42634d;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10658b
    /* JADX INFO: renamed from: b */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a> mo15418b() {
        return this.f42633c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10658b
    /* JADX INFO: renamed from: c */
    public final int mo15419c() {
        return this.f42635e;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10658b
    /* JADX INFO: renamed from: d */
    public final String mo15420d() {
        return this.f42632b;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10658b
    /* JADX INFO: renamed from: e */
    public final String mo15421e() {
        return this.f42631a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    public final boolean equals(Object obj) {
        AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b.AbstractC10658b)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b2 = (AbstractC7743b0.e.d.a.b.AbstractC10658b) obj;
        if (this.f42631a.equals(abstractC10658b2.mo15421e())) {
            String str = this.f42632b;
            if (str == null) {
                if (abstractC10658b2.mo15420d() == null) {
                    if (this.f42633c.equals(abstractC10658b2.mo15418b())) {
                        abstractC10658b = this.f42634d;
                        if (abstractC10658b == null) {
                            if (abstractC10658b2.mo15417a() == null) {
                                if (this.f42635e == abstractC10658b2.mo15419c()) {
                                    return true;
                                }
                            }
                        } else if (abstractC10658b.equals(abstractC10658b2.mo15417a())) {
                            if (this.f42635e == abstractC10658b2.mo15419c()) {
                                return true;
                            }
                        }
                    }
                }
            } else if (str.equals(abstractC10658b2.mo15420d())) {
                if (this.f42633c.equals(abstractC10658b2.mo15418b())) {
                    abstractC10658b = this.f42634d;
                    if (abstractC10658b == null) {
                        if (abstractC10658b2.mo15417a() == null) {
                            if (this.f42635e == abstractC10658b2.mo15419c()) {
                                return true;
                            }
                        }
                    } else if (abstractC10658b.equals(abstractC10658b2.mo15417a())) {
                        if (this.f42635e == abstractC10658b2.mo15419c()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f42631a.hashCode() ^ 1000003) * 1000003;
        int iHashCode2 = 0;
        String str = this.f42632b;
        int iHashCode3 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f42633c.hashCode()) * 1000003;
        AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b = this.f42634d;
        if (abstractC10658b != null) {
            iHashCode2 = abstractC10658b.hashCode();
        }
        return ((iHashCode3 ^ iHashCode2) * 1000003) ^ this.f42635e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f42631a);
        sb2.append(", reason=");
        sb2.append(this.f42632b);
        sb2.append(", frames=");
        sb2.append(this.f42633c);
        sb2.append(", causedBy=");
        sb2.append(this.f42634d);
        sb2.append(", overflowCount=");
        return C0166e.m768o(sb2, this.f42635e, "}");
    }
}
