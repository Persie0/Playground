package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ame extends ald {

    /* JADX INFO: renamed from: j */
    public final int f683j;

    /* JADX INFO: renamed from: k */
    public final amk f684k;

    /* JADX INFO: renamed from: l */
    public amf f685l;

    /* JADX INFO: renamed from: m */
    private akv f686m;

    public ame(int i, amk amkVar) {
        this.f683j = i;
        this.f684k = amkVar;
        if (amkVar.f705h != null) {
            throw new IllegalStateException(wUzNh.WavqsHsRpn);
        }
        amkVar.f705h = this;
        amkVar.f699b = i;
    }

    @Override // p000.alc
    /* JADX INFO: renamed from: d */
    protected final void mo901d() {
        if (amd.m937b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Starting: ");
            sb.append(this);
        }
        amk amkVar = this.f684k;
        amkVar.f701d = true;
        amkVar.f703f = false;
        amkVar.f702e = false;
        amkVar.mo956h();
    }

    @Override // p000.alc
    /* JADX INFO: renamed from: e */
    protected final void mo902e() {
        if (amd.m937b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Stopping: ");
            sb.append(this);
        }
        amk amkVar = this.f684k;
        amkVar.f701d = false;
        amkVar.mo957i();
    }

    @Override // p000.alc
    /* JADX INFO: renamed from: f */
    public final void mo903f(ale aleVar) {
        super.mo903f(aleVar);
        this.f686m = null;
        this.f685l = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m940i() {
        akv akvVar = this.f686m;
        amf amfVar = this.f685l;
        if (akvVar == null || amfVar == null) {
            return;
        }
        super.mo903f(amfVar);
        m900c(akvVar, amfVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m941j() {
        if (amd.m937b(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Destroying: ");
            sb.append(this);
        }
        this.f684k.mo953f();
        this.f684k.f702e = true;
        amf amfVar = this.f685l;
        if (amfVar != null) {
            mo903f(amfVar);
            if (amfVar.f689c) {
                if (amd.m937b(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(NptsKnlVczSZ.xHgR);
                    sb2.append(amfVar.f687a);
                }
                amfVar.f688b.mo935c();
            }
        }
        amk amkVar = this.f684k;
        ame ameVar = amkVar.f705h;
        if (ameVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (ameVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        amkVar.f705h = null;
        amkVar.f703f = true;
        amkVar.f701d = false;
        amkVar.f702e = false;
        amkVar.f704g = false;
    }

    /* JADX INFO: renamed from: k */
    final void m942k(akv akvVar, amc amcVar) {
        amf amfVar = new amf(this.f684k, amcVar);
        m900c(akvVar, amfVar);
        ale aleVar = this.f685l;
        if (aleVar != null) {
            mo903f(aleVar);
        }
        this.f686m = akvVar;
        this.f685l = amfVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f683j);
        sb.append(" : ");
        sb.append(this.f684k.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f684k)));
        sb.append("}}");
        return sb.toString();
    }
}
