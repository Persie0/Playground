package p000;

import java.util.LinkedHashMap;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 {

    /* JADX INFO: renamed from: b */
    public static final qv2 f58241b = new qv2(new gaa((az2) null, (ca9) null, (vt0) null, (jm8) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: c */
    public static final qv2 f58242c = new qv2(new gaa((az2) null, (ca9) null, (vt0) null, (jm8) null, (LinkedHashMap) null, 95));

    /* JADX INFO: renamed from: a */
    public final gaa f58243a;

    public qv2(gaa gaaVar) {
        this.f58243a = gaaVar;
    }

    /* JADX INFO: renamed from: a */
    public final qv2 m20180a(qv2 qv2Var) {
        gaa gaaVar = qv2Var.f58243a;
        az2 az2Var = gaaVar.f40475a;
        gaa gaaVar2 = this.f58243a;
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
        return new qv2(new gaa(az2Var, ca9Var, vt0Var, jm8Var, gaaVar.f40479e || gaaVar2.f40479e, AbstractC3194a.m15367T(gaaVar2.f40480f, gaaVar.f40480f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qv2) && ((qv2) obj).f58243a.equals(this.f58243a);
    }

    public final int hashCode() {
        return this.f58243a.hashCode();
    }

    public final String toString() {
        if (equals(f58241b)) {
            return "ExitTransition.None";
        }
        if (equals(f58242c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        gaa gaaVar = this.f58243a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(gaaVar.f40479e);
        return sb.toString();
    }
}
