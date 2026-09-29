package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7741a0 extends AbstractC7747d0.c {

    /* JADX INFO: renamed from: a */
    public final String f42501a;

    /* JADX INFO: renamed from: b */
    public final String f42502b;

    /* JADX INFO: renamed from: c */
    public final boolean f42503c;

    public C7741a0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f42501a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f42502b = str2;
        this.f42503c = z10;
    }

    @Override // ne.AbstractC7747d0.c
    /* JADX INFO: renamed from: a */
    public final boolean mo15336a() {
        return this.f42503c;
    }

    @Override // ne.AbstractC7747d0.c
    /* JADX INFO: renamed from: b */
    public final String mo15337b() {
        return this.f42502b;
    }

    @Override // ne.AbstractC7747d0.c
    /* JADX INFO: renamed from: c */
    public final String mo15338c() {
        return this.f42501a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7747d0.c)) {
            return false;
        }
        AbstractC7747d0.c cVar = (AbstractC7747d0.c) obj;
        return this.f42501a.equals(cVar.mo15338c()) && this.f42502b.equals(cVar.mo15337b()) && this.f42503c == cVar.mo15336a();
    }

    public final int hashCode() {
        return ((((this.f42501a.hashCode() ^ 1000003) * 1000003) ^ this.f42502b.hashCode()) * 1000003) ^ (this.f42503c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f42501a);
        sb2.append(", osCodeName=");
        sb2.append(this.f42502b);
        sb2.append(", isRooted=");
        return C0166e.m769p(sb2, this.f42503c, "}");
    }
}
