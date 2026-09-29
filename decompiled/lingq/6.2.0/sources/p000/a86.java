package p000;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.Arrays;
import kotlin.AbstractC3192a;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class a86 {

    /* JADX INFO: renamed from: a */
    public final y76 f338a;

    /* JADX INFO: renamed from: b */
    public final r86 f339b;

    /* JADX INFO: renamed from: c */
    public final Bundle f340c;

    /* JADX INFO: renamed from: d */
    public Lifecycle$State f341d;

    /* JADX INFO: renamed from: e */
    public final i86 f342e;

    /* JADX INFO: renamed from: f */
    public final String f343f;

    /* JADX INFO: renamed from: g */
    public final Bundle f344g;

    /* JADX INFO: renamed from: h */
    public final fs6 f345h;

    /* JADX INFO: renamed from: i */
    public boolean f346i;

    /* JADX INFO: renamed from: j */
    public final wb5 f347j;

    /* JADX INFO: renamed from: k */
    public Lifecycle$State f348k;

    /* JADX INFO: renamed from: l */
    public final wl8 f349l;

    /* JADX INFO: renamed from: m */
    public final cs4 f350m;

    public a86(y76 y76Var) {
        this.f338a = y76Var;
        this.f339b = y76Var.f69409b;
        this.f340c = y76Var.f69410c;
        this.f341d = y76Var.f69411d;
        this.f342e = y76Var.f69412e;
        this.f343f = y76Var.f69413f;
        this.f344g = y76Var.f69414g;
        this.f345h = new fs6(new lb4(y76Var, new y47(y76Var, 8)));
        cs4 cs4VarM15356a = AbstractC3192a.m15356a(new ri5(3));
        this.f347j = new wb5(y76Var, true);
        this.f348k = Lifecycle$State.INITIALIZED;
        this.f349l = (wl8) cs4VarM15356a.getValue();
        this.f350m = AbstractC3192a.m15356a(new ri5(4));
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m170a() {
        Bundle bundle = this.f340c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleM18160p.putAll(bundle);
        return bundleM18160p;
    }

    /* JADX INFO: renamed from: b */
    public final void m171b() {
        if (!this.f346i) {
            fs6 fs6Var = this.f345h;
            ((lb4) fs6Var.f39590b).m16060a();
            this.f346i = true;
            if (this.f342e != null) {
                ci8.m4731p(this.f338a);
            }
            fs6Var.m12091F(this.f344g);
        }
        int iOrdinal = this.f341d.ordinal();
        int iOrdinal2 = this.f348k.ordinal();
        wb5 wb5Var = this.f347j;
        if (iOrdinal < iOrdinal2) {
            wb5Var.m23835I(this.f341d);
        } else {
            wb5Var.m23835I(this.f348k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y38.m24933a(y76.class).m25414c());
        sb.append("(" + this.f343f + ')');
        sb.append(" destination=");
        sb.append(this.f339b);
        return sb.toString();
    }
}
