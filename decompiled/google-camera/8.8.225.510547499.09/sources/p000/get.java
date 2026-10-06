package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class get implements gfb {
    /* JADX INFO: renamed from: b */
    protected int mo5766b(gfc gfcVar) {
        throw new AssertionError("Override either getContentDescOfOption or getContentDescIdOfOption");
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: c */
    public int mo5767c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    protected int mo5768d(gfc gfcVar) {
        throw new AssertionError("Override either getIconIdOfOption or getIconOfOption");
    }

    /* JADX INFO: renamed from: f */
    protected int mo5770f(gfc gfcVar) {
        throw new AssertionError("Override either getLabelIdOfOption or getLabelOfOption");
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: h */
    public gff mo5772h() {
        return null;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: l */
    public boolean mo5776l() {
        return false;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: m */
    public boolean mo5777m(gfa gfaVar) {
        return true;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: r */
    public String mo5830r(gfc gfcVar, Resources resources) {
        return resources.getString(mo5766b(gfcVar));
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: s */
    public String mo5831s(gfc gfcVar, Resources resources) {
        return resources.getString(mo5770f(gfcVar));
    }

    @Override // p000.gfd
    /* JADX INFO: renamed from: u */
    public boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
        return false;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: v */
    public boolean mo5834v(gfa gfaVar, gfc gfcVar) {
        return true;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: x */
    public final int mo9148x() {
        return mo5771g().ordinal();
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: y */
    public Drawable mo9149y(gfc gfcVar, Resources resources) {
        return resources.getDrawable(mo5768d(gfcVar), null);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: z */
    public void mo5840z(gfa gfaVar, boolean z) {
    }
}
