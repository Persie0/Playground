package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vw7 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f66024a;

    /* JADX INFO: renamed from: b */
    public final int f66025b;

    /* JADX INFO: renamed from: c */
    public final String[] f66026c;

    /* JADX INFO: renamed from: d */
    public final int f66027d = R$id.actionToDealWithWords;

    public vw7(int i, int i2, String[] strArr) {
        this.f66024a = i;
        this.f66025b = i2;
        this.f66026c = strArr;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f66024a);
        bundle.putInt("page", this.f66025b);
        bundle.putStringArray("words", this.f66026c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f66027d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw7)) {
            return false;
        }
        vw7 vw7Var = (vw7) obj;
        return this.f66024a == vw7Var.f66024a && this.f66025b == vw7Var.f66025b && this.f66026c.equals(vw7Var.f66026c);
    }

    public final int hashCode() {
        return wq1.m24106b(this.f66025b, Integer.hashCode(this.f66024a) * 31, 31) + Arrays.hashCode(this.f66026c);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f66024a, this.f66025b, "ActionToDealWithWords(lessonId=", ", page=", ", words="), Arrays.toString(this.f66026c), ")");
    }
}
