package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnm {

    /* JADX INFO: renamed from: a */
    public final Optional f22790a;

    /* JADX INFO: renamed from: b */
    public final Optional f22791b;

    /* JADX INFO: renamed from: c */
    public final Optional f22792c;

    /* JADX INFO: renamed from: d */
    public final Optional f22793d;

    public fnm() {
    }

    public fnm(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.f22790a = optional;
        this.f22791b = optional2;
        this.f22792c = optional3;
        this.f22793d = optional4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fnm) {
            fnm fnmVar = (fnm) obj;
            if (this.f22790a.equals(fnmVar.f22790a) && this.f22791b.equals(fnmVar.f22791b) && this.f22792c.equals(fnmVar.f22792c) && this.f22793d.equals(fnmVar.f22793d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22790a.hashCode() ^ 1000003) * 1000003) ^ this.f22791b.hashCode()) * 1000003) ^ this.f22792c.hashCode()) * 1000003) ^ this.f22793d.hashCode();
    }

    public final String toString() {
        return "FusionExperimentalKeys{ultraHdrEnabledKey=" + String.valueOf(this.f22790a) + gBCSQzBeB.olctjKNelxaLmx + String.valueOf(this.f22791b) + ", motionDeblurValidPhysicalResultKey=" + String.valueOf(this.f22792c) + ", afMultiDepthFaceDeblurKey=" + String.valueOf(this.f22793d) + hsSUWRJfoeC.JDvUCOEJKRGHO;
    }
}
