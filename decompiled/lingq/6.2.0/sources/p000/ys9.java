package p000;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ys9 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f70427a;

    /* JADX INFO: renamed from: b */
    public final long f70428b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f70429c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f70430d;

    public ys9(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.f70427a = charSequence;
        this.f70428b = j;
        this.f70429c = textClassification;
        this.f70430d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys9)) {
            return false;
        }
        ys9 ys9Var = (ys9) obj;
        return fa4.m11650l(this.f70427a, ys9Var.f70427a) && cx9.m9920b(this.f70428b, ys9Var.f70428b) && fa4.m11650l(this.f70429c, ys9Var.f70429c) && this.f70430d.equals(ys9Var.f70430d);
    }

    public final int hashCode() {
        int iHashCode = this.f70427a.hashCode() * 31;
        int i = cx9.f34693c;
        return this.f70430d.hashCode() + ((this.f70429c.hashCode() + ux5.m22981d(this.f70428b, iHashCode, 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f70427a) + ", selection=" + ((Object) cx9.m9926h(this.f70428b)) + ", textClassification=" + this.f70429c + ", icons=" + this.f70430d + ')';
    }
}
