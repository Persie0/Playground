package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejw extends dgs {

    /* JADX INFO: renamed from: d */
    private static final mwx f14429d;

    /* JADX INFO: renamed from: c */
    public final fly f14430c;

    /* JADX INFO: renamed from: e */
    private final Resources f14431e;

    /* JADX INFO: renamed from: f */
    private final cna f14432f;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f14429d = mwx.m17122q("/m/04h4w", fValueOf, "/m/06cnp", fValueOf, "/m/0brn2d", fValueOf, "/m/01bqvp", fValueOf);
    }

    public ejw(Resources resources, fly flyVar, jfs jfsVar, cna cnaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jfsVar, "imax_smarts_chip", null, null, null);
        this.f14431e = resources;
        this.f14430c = flyVar;
        this.f14432f = cnaVar;
    }

    @Override // p000.dgn
    /* JADX INFO: renamed from: br */
    public final Map mo6082br() {
        return f14429d;
    }

    @Override // p000.dgs
    /* JADX INFO: renamed from: c */
    protected final dgr mo6120c() {
        lmv lmvVarM6119a = dgr.m6119a();
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f14431e.getString(C0100R.string.imax_suggestion_text);
        heuVarM10165a.f27493b = this.f14431e.getDrawable(C0100R.drawable.quantum_gm_ic_vrpano_white_24, null);
        heuVarM10165a.f27494c = new efd(this, 15);
        heuVarM10165a.m10164e(7000L);
        lmvVarM6119a.f38712c = heuVarM10165a.m10160a();
        return lmvVarM6119a.m15741f();
    }

    @Override // p000.dgs
    /* JADX INFO: renamed from: e */
    protected final boolean mo6122e(Map map) {
        boolean z;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Float) f14429d.getOrDefault((String) entry.getKey(), Float.valueOf(Float.MAX_VALUE))).floatValue() <= ((Float) entry.getValue()).floatValue()) {
                z = true;
                break;
            }
        }
        if (z) {
            this.f14432f.mo3953f(ikw.IMAX);
        }
        return z;
    }
}
