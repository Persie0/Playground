package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jwb extends g4c {

    /* JADX INFO: renamed from: b */
    public final C3275kv f46326b;

    /* JADX INFO: renamed from: c */
    public final C3275kv f46327c;

    /* JADX INFO: renamed from: d */
    public long f46328d;

    public jwb(kjc kjcVar) {
        super(kjcVar);
        this.f46327c = new C3275kv(0);
        this.f46326b = new C3275kv(0);
    }

    /* JADX INFO: renamed from: E */
    public final void m14729E(String str, long j) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str == null || str.length() == 0) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Ad unit id must be a non-empty string");
        } else {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new dfb(this, str, j, 0));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m14730F(String str, long j) {
        kjc kjcVar = (kjc) this.f60774a;
        if (str == null || str.length() == 0) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Ad unit id must be a non-empty string");
        } else {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new dfb(this, str, j, 1));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m14731G(long j) {
        j0d j0dVar = ((kjc) this.f60774a).f47444l;
        kjc.m15279k(j0dVar);
        bzc bzcVarM14237H = j0dVar.m14237H(false);
        C3275kv c3275kv = this.f46326b;
        for (String str : (C3089hv) c3275kv.keySet()) {
            m14733I(str, j - ((Long) c3275kv.get(str)).longValue(), bzcVarM14237H);
        }
        if (!c3275kv.isEmpty()) {
            m14732H(j - this.f46328d, bzcVarM14237H);
        }
        m14734J(j);
    }

    /* JADX INFO: renamed from: H */
    public final void m14732H(long j, bzc bzcVar) {
        kjc kjcVar = (kjc) this.f60774a;
        if (bzcVar == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17923a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68076I.m17924b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            rad.m20514y0(bzcVar, bundle, true);
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5854K("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m14733I(String str, long j, bzc bzcVar) {
        kjc kjcVar = (kjc) this.f60774a;
        if (bzcVar == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17923a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68076I.m17924b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            rad.m20514y0(bzcVar, bundle, true);
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5854K("am", "_xu", bundle);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m14734J(long j) {
        C3275kv c3275kv = this.f46326b;
        Iterator it = ((C3089hv) c3275kv.keySet()).iterator();
        while (it.hasNext()) {
            c3275kv.put((String) it.next(), Long.valueOf(j));
        }
        if (c3275kv.isEmpty()) {
            return;
        }
        this.f46328d = j;
    }
}
