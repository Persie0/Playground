package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mua extends mzh implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final mrf f41620a;

    /* JADX INFO: renamed from: b */
    final mzh f41621b;

    public mua(mrf mrfVar, mzh mzhVar) {
        this.f41620a = mrfVar;
        this.f41621b = mzhVar;
    }

    @Override // p000.mzh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f41621b.compare(this.f41620a.apply(obj), this.f41620a.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mua) {
            mua muaVar = (mua) obj;
            if (this.f41620a.equals(muaVar.f41620a) && this.f41621b.equals(muaVar.f41621b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41620a, this.f41621b});
    }

    public final String toString() {
        return this.f41621b + ".onResultOf(" + this.f41620a + xPAWq.CteN;
    }
}
