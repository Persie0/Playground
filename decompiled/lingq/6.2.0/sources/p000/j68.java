package p000;

import androidx.compose.animation.core.RepeatMode;

/* JADX INFO: loaded from: classes.dex */
public final class j68 implements l43 {

    /* JADX INFO: renamed from: a */
    public final fda f45121a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f45122b;

    /* JADX INFO: renamed from: c */
    public final long f45123c;

    public j68(fda fdaVar, RepeatMode repeatMode, long j) {
        this.f45121a = fdaVar;
        this.f45122b = repeatMode;
        this.f45123c = j;
    }

    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final voa mo589a(jda jdaVar) {
        return new cpa(this.f45121a.mo589a(jdaVar), this.f45122b, this.f45123c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j68) {
            j68 j68Var = (j68) obj;
            if (j68Var.f45121a.equals(this.f45121a) && j68Var.f45122b == this.f45122b && j68Var.f45123c == this.f45123c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45123c) + ((this.f45122b.hashCode() + ((this.f45121a.hashCode() + 93) * 31)) * 31);
    }
}
