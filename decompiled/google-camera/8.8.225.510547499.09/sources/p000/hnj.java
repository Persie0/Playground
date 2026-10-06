package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnj extends hei {

    /* JADX INFO: renamed from: b */
    public final jwn f28483b;

    /* JADX INFO: renamed from: c */
    public final hev f28484c;

    /* JADX INFO: renamed from: d */
    public boolean f28485d;

    /* JADX INFO: renamed from: e */
    public final ihk f28486e;

    /* JADX INFO: renamed from: f */
    public final jfs f28487f;

    public hnj(Resources resources, jwn jwnVar, jfs jfsVar, ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f28483b = jwnVar;
        this.f28487f = jfsVar;
        this.f28486e = ihkVar;
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = resources.getString(C0100R.string.taxi_macro_entered_hint);
        heuVarM10165a.f27493b = resources.getDrawable(C0100R.drawable.ic_macro_focus, null);
        heuVarM10165a.m10163d(true);
        heuVarM10165a.f27494c = new hmm(this, 8);
        heuVarM10165a.f27497f = new hmm(this, 9);
        heuVarM10165a.m10162c(true);
        this.f28484c = heuVarM10165a.m10160a();
    }
}
