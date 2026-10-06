package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glm {

    /* JADX INFO: renamed from: a */
    public final String f25508a;

    /* JADX INFO: renamed from: b */
    public final String f25509b;

    /* JADX INFO: renamed from: c */
    public final Boolean f25510c;

    public glm() {
    }

    public glm(String str, String str2, Boolean bool) {
        this.f25508a = str;
        this.f25509b = str2;
        this.f25510c = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glm) {
            glm glmVar = (glm) obj;
            if (this.f25508a.equals(glmVar.f25508a) && this.f25509b.equals(glmVar.f25509b)) {
                Boolean bool = this.f25510c;
                Boolean bool2 = glmVar.f25510c;
                if (bool != null ? bool.equals(bool2) : bool2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f25508a.hashCode() ^ 1000003) * 1000003) ^ this.f25509b.hashCode();
        Boolean bool = this.f25510c;
        return (iHashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ActiveCamera{logicalCameraId=" + this.f25508a + ", physicalCameraId=" + this.f25509b + ", motionDeblurValidity=" + this.f25510c + "}";
    }
}
