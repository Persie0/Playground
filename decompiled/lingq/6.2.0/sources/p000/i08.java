package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class i08 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f43292a;

    /* JADX INFO: renamed from: b */
    public final int f43293b = R$id.actionToDealBlueWordsComplete;

    public i08(int i) {
        this.f43292a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f43292a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f43293b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i08) && this.f43292a == ((i08) obj).f43292a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43292a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToDealBlueWordsComplete(lessonId=", this.f43292a, ")");
    }
}
