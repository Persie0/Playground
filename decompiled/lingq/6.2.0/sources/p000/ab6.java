package p000;

import android.os.Bundle;
import com.lingq.feature.karaoke.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ab6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f460a;

    /* JADX INFO: renamed from: b */
    public final boolean f461b;

    /* JADX INFO: renamed from: c */
    public final boolean f462c;

    /* JADX INFO: renamed from: d */
    public final int f463d = R$id.actionToKaraoke;

    public ab6(int i, boolean z, boolean z2) {
        this.f460a = i;
        this.f461b = z;
        this.f462c = z2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f460a);
        bundle.putBoolean("fromLesson", this.f461b);
        bundle.putBoolean("video", this.f462c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f463d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab6)) {
            return false;
        }
        ab6 ab6Var = (ab6) obj;
        return this.f460a == ab6Var.f460a && this.f461b == ab6Var.f461b && this.f462c == ab6Var.f462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f462c) + g9a.m12428e(Integer.hashCode(this.f460a) * 31, 31, this.f461b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToKaraoke(lessonId=");
        sb.append(this.f460a);
        sb.append(", fromLesson=");
        sb.append(this.f461b);
        sb.append(", video=");
        return AbstractC3393o1.m17740o(sb, this.f462c, ")");
    }
}
