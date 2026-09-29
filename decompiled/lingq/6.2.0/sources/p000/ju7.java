package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ju7 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f46165a;

    /* JADX INFO: renamed from: b */
    public final int f46166b = R$id.actionToDealBlueWordsComplete;

    public ju7(int i) {
        this.f46165a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f46165a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f46166b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju7) && this.f46165a == ((ju7) obj).f46165a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46165a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToDealBlueWordsComplete(lessonId=", this.f46165a, ")");
    }
}
