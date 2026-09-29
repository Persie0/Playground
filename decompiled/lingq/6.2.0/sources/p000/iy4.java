package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class iy4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f44758a;

    /* JADX INFO: renamed from: b */
    public final int f44759b = R$id.actionToDealBlueWordsComplete;

    public iy4(int i) {
        this.f44758a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f44758a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f44759b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy4) && this.f44758a == ((iy4) obj).f44758a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44758a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToDealBlueWordsComplete(lessonId=", this.f44758a, ")");
    }
}
