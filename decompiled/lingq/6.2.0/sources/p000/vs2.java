package p000;

import java.util.LinkedHashMap;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class vs2 {

    /* JADX INFO: renamed from: b */
    public static final vs2 f65843b = new vs2(new gaa((az2) null, (ca9) null, (vt0) null, (jm8) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final gaa f65844a;

    public vs2(gaa gaaVar) {
        this.f65844a = gaaVar;
    }

    /* JADX INFO: renamed from: a */
    public final vs2 m23531a(vs2 vs2Var) {
        gaa gaaVar = vs2Var.f65844a;
        az2 az2Var = gaaVar.f40475a;
        gaa gaaVar2 = this.f65844a;
        if (az2Var == null) {
            az2Var = gaaVar2.f40475a;
        }
        ca9 ca9Var = gaaVar.f40476b;
        if (ca9Var == null) {
            ca9Var = gaaVar2.f40476b;
        }
        vt0 vt0Var = gaaVar.f40477c;
        if (vt0Var == null) {
            vt0Var = gaaVar2.f40477c;
        }
        jm8 jm8Var = gaaVar.f40478d;
        if (jm8Var == null) {
            jm8Var = gaaVar2.f40478d;
        }
        return new vs2(new gaa(az2Var, ca9Var, vt0Var, jm8Var, AbstractC3194a.m15367T(gaaVar2.f40480f, gaaVar.f40480f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vs2) && ((vs2) obj).f65844a.equals(this.f65844a);
    }

    public final int hashCode() {
        return this.f65844a.hashCode();
    }

    public final String toString() {
        if (equals(f65843b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        gaa gaaVar = this.f65844a;
        az2 az2Var = gaaVar.f40475a;
        sb.append(az2Var != null ? az2Var.toString() : null);
        sb.append(",\nSlide - ");
        ca9 ca9Var = gaaVar.f40476b;
        sb.append(ca9Var != null ? ca9Var.toString() : null);
        sb.append(",\nShrink - ");
        vt0 vt0Var = gaaVar.f40477c;
        sb.append(vt0Var != null ? vt0Var.toString() : null);
        sb.append(",\nScale - ");
        jm8 jm8Var = gaaVar.f40478d;
        sb.append(jm8Var != null ? jm8Var.toString() : null);
        return sb.toString();
    }
}
