package p000;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class egb extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final Level f37223b;

    /* JADX INFO: renamed from: c */
    public final Set f37224c;

    /* JADX INFO: renamed from: d */
    public final vnd f37225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egb(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = fgb.f39085f;
        this.f37223b = level;
        this.f37224c = fgb.f39085f;
        this.f37225d = fgb.f39086g;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: A */
    public final boolean mo3704A(Level level) {
        return true;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: B */
    public final void mo3705B(rmd rmdVar) {
        String strMo623a = (String) rmdVar.m20717d().mo360j(lnd.f49877a);
        if (strMo623a == null) {
            strMo623a = (String) this.f60774a;
        }
        if (strMo623a == null) {
            bnd bndVar = rmdVar.f59562d;
            if (bndVar == null) {
                C3386nv.m17633t("cannot request log site information prior to postProcess()");
                return;
            }
            strMo623a = bndVar.mo623a();
            int iIndexOf = strMo623a.indexOf(36, strMo623a.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strMo623a = strMo623a.substring(0, iIndexOf);
            }
        }
        fgb.m11829E(rmdVar, zha.m25661d(strMo623a), this.f37223b, this.f37224c, this.f37225d);
    }
}
