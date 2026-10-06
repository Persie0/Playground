package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpp extends dgs {

    /* JADX INFO: renamed from: d */
    private static final mwx f28986d = mwx.m17119n("/m/01b2w5", Float.valueOf(0.5f));

    /* JADX INFO: renamed from: c */
    public final fly f28987c;

    /* JADX INFO: renamed from: e */
    private final Resources f28988e;

    public hpp(Resources resources, fly flyVar, jfs jfsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jfsVar, "timelapse_smarts_chip", null, null, null);
        this.f28988e = resources;
        this.f28987c = flyVar;
    }

    @Override // p000.dgn
    /* JADX INFO: renamed from: br */
    public final Map mo6082br() {
        return f28986d;
    }

    @Override // p000.dgs
    /* JADX INFO: renamed from: c */
    protected final dgr mo6120c() {
        lmv lmvVarM6119a = dgr.m6119a();
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f28988e.getString(C0100R.string.timelapse_suggestion_text);
        heuVarM10165a.f27493b = this.f28988e.getDrawable(C0100R.drawable.quantum_gm_ic_fast_forward_vd_theme_24, null);
        heuVarM10165a.f27494c = new hpi(this, 18);
        heuVarM10165a.m10164e(7000L);
        lmvVarM6119a.f38712c = heuVarM10165a.m10160a();
        return lmvVarM6119a.m15741f();
    }

    @Override // p000.dgs
    /* JADX INFO: renamed from: e */
    protected final boolean mo6122e(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((Float) f28986d.getOrDefault((String) entry.getKey(), Float.valueOf(Float.MAX_VALUE))).floatValue() <= ((Float) entry.getValue()).floatValue()) {
                return true;
            }
        }
        return false;
    }
}
