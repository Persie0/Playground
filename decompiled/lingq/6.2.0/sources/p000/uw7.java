package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class uw7 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f64468a;

    /* JADX INFO: renamed from: b */
    public final int f64469b = R$id.actionToDealBlueWordsComplete;

    public uw7(int i) {
        this.f64468a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f64468a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f64469b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw7) && this.f64468a == ((uw7) obj).f64468a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64468a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToDealBlueWordsComplete(lessonId=", this.f64468a, ")");
    }
}
