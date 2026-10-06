package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class agj extends agi {
    public agj(ago agoVar, WindowInsets windowInsets) {
        super(agoVar, windowInsets);
    }

    @Override // p000.agh, p000.agm
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agj)) {
            return false;
        }
        agj agjVar = (agj) obj;
        return Objects.equals(this.f297a, agjVar.f297a) && Objects.equals(this.f298b, agjVar.f298b);
    }

    @Override // p000.agm
    public int hashCode() {
        return this.f297a.hashCode();
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: n */
    public ael mo594n() {
        DisplayCutout displayCutout = this.f297a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ael(displayCutout);
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: o */
    public ago mo595o() {
        return ago.m601m(this.f297a.consumeDisplayCutout());
    }
}
