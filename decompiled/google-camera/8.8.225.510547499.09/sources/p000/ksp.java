package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksp {

    /* JADX INFO: renamed from: a */
    public final int f37119a;

    /* JADX INFO: renamed from: b */
    public final int f37120b;

    public ksp(int i, int i2) {
        this.f37119a = i;
        this.f37120b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ksp)) {
            return false;
        }
        ksp kspVar = (ksp) obj;
        return this.f37119a == kspVar.f37119a && this.f37120b == kspVar.f37120b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f37119a, -2032180703, this.f37120b});
    }

    public final String toString() {
        return "java_hash=" + this.f37119a + ",feature_hash=-2032180703,res=" + this.f37120b;
    }
}
