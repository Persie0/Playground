package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class gaa {

    /* JADX INFO: renamed from: a */
    public final az2 f40475a;

    /* JADX INFO: renamed from: b */
    public final ca9 f40476b;

    /* JADX INFO: renamed from: c */
    public final vt0 f40477c;

    /* JADX INFO: renamed from: d */
    public final jm8 f40478d;

    /* JADX INFO: renamed from: e */
    public final boolean f40479e;

    /* JADX INFO: renamed from: f */
    public final Map f40480f;

    public /* synthetic */ gaa(az2 az2Var, ca9 ca9Var, vt0 vt0Var, jm8 jm8Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : az2Var, (i & 2) != 0 ? null : ca9Var, (i & 4) != 0 ? null : vt0Var, (i & 8) != 0 ? null : jm8Var, (i & 32) == 0, (i & 64) != 0 ? AbstractC3194a.m15360M() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaa)) {
            return false;
        }
        gaa gaaVar = (gaa) obj;
        return fa4.m11650l(this.f40475a, gaaVar.f40475a) && fa4.m11650l(this.f40476b, gaaVar.f40476b) && fa4.m11650l(this.f40477c, gaaVar.f40477c) && fa4.m11650l(this.f40478d, gaaVar.f40478d) && this.f40479e == gaaVar.f40479e && fa4.m11650l(this.f40480f, gaaVar.f40480f);
    }

    public final int hashCode() {
        az2 az2Var = this.f40475a;
        int iHashCode = (az2Var == null ? 0 : az2Var.hashCode()) * 31;
        ca9 ca9Var = this.f40476b;
        int iHashCode2 = (iHashCode + (ca9Var == null ? 0 : ca9Var.hashCode())) * 31;
        vt0 vt0Var = this.f40477c;
        int iHashCode3 = (iHashCode2 + (vt0Var == null ? 0 : vt0Var.hashCode())) * 31;
        jm8 jm8Var = this.f40478d;
        return this.f40480f.hashCode() + g9a.m12428e((iHashCode3 + (jm8Var != null ? jm8Var.hashCode() : 0)) * 961, 31, this.f40479e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f40475a + ", slide=" + this.f40476b + ", changeSize=" + this.f40477c + ", scale=" + this.f40478d + ", veil=null, hold=" + this.f40479e + ", effectsMap=" + this.f40480f + ')';
    }

    public gaa(az2 az2Var, ca9 ca9Var, vt0 vt0Var, jm8 jm8Var, boolean z, Map map) {
        this.f40475a = az2Var;
        this.f40476b = ca9Var;
        this.f40477c = vt0Var;
        this.f40478d = jm8Var;
        this.f40479e = z;
        this.f40480f = map;
    }
}
