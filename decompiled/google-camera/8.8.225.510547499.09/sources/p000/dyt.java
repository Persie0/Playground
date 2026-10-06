package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyt {

    /* JADX INFO: renamed from: a */
    public final int f12930a;

    /* JADX INFO: renamed from: b */
    public final mws f12931b;

    /* JADX INFO: renamed from: c */
    public final float f12932c;

    public dyt() {
    }

    public dyt(int i, mws mwsVar, float f) {
        this.f12930a = i;
        this.f12931b = mwsVar;
        this.f12932c = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyt) {
            dyt dytVar = (dyt) obj;
            if (this.f12930a == dytVar.f12930a && mkv.m16505M(this.f12931b, dytVar.f12931b) && Float.floatToIntBits(this.f12932c) == Float.floatToIntBits(dytVar.f12932c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12930a ^ 1000003) * 1000003) ^ this.f12931b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f12932c);
    }

    public final String toString() {
        return "FaceTrueTone{id=" + this.f12930a + ", toneProbabilities=" + String.valueOf(this.f12931b) + NptsKnlVczSZ.bCkjOMtBvc + this.f12932c + "}";
    }
}
