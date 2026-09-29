package p000;

import androidx.compose.animation.core.RepeatMode;

/* JADX INFO: loaded from: classes.dex */
public final class k44 implements InterfaceC0025an {

    /* JADX INFO: renamed from: a */
    public final dn2 f46689a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f46690b;

    /* JADX INFO: renamed from: c */
    public final long f46691c;

    public k44(dn2 dn2Var, RepeatMode repeatMode, long j) {
        this.f46689a = dn2Var;
        this.f46690b = repeatMode;
        this.f46691c = j;
        if (dn2Var instanceof fda) {
            fda fdaVar = (fda) dn2Var;
            if (fdaVar.f38914a != 0 || fdaVar.f38915b != 0) {
                return;
            }
        } else if (dn2Var instanceof ic9) {
            if (((ic9) dn2Var).f43938a != 0) {
                return;
            }
        } else if (!(dn2Var instanceof qj4) || ((qj4) dn2Var).f57851a.f56315a != 0) {
            return;
        }
        C3386nv.m17626m("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final voa mo589a(jda jdaVar) {
        return new zoa(this.f46689a.mo589a(jdaVar), this.f46690b, this.f46691c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k44) {
            k44 k44Var = (k44) obj;
            if (k44Var.f46689a.equals(this.f46689a) && k44Var.f46690b == this.f46690b && k44Var.f46691c == this.f46691c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46691c) + ((this.f46690b.hashCode() + (this.f46689a.hashCode() * 31)) * 31);
    }
}
