package p000;

import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;

/* JADX INFO: loaded from: classes2.dex */
public final class wf2 {

    /* JADX INFO: renamed from: a */
    public final MiniLessonTemplate f66750a;

    /* JADX INFO: renamed from: b */
    public final vz5 f66751b;

    public wf2(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var) {
        this.f66750a = miniLessonTemplate;
        this.f66751b = vz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf2)) {
            return false;
        }
        wf2 wf2Var = (wf2) obj;
        return fa4.m11650l(this.f66750a, wf2Var.f66750a) && fa4.m11650l(this.f66751b, wf2Var.f66751b);
    }

    public final int hashCode() {
        MiniLessonTemplate miniLessonTemplate = this.f66750a;
        int iHashCode = (miniLessonTemplate == null ? 0 : miniLessonTemplate.hashCode()) * 31;
        vz5 vz5Var = this.f66751b;
        return iHashCode + (vz5Var != null ? vz5Var.hashCode() : 0);
    }

    public final String toString() {
        return "DictionaryPreviewContent(template=" + this.f66750a + ", readerStyle=" + this.f66751b + ")";
    }
}
