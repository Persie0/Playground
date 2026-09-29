package p000;

import android.os.Bundle;
import com.lingq.feature.imports.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ld6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f49500a;

    /* JADX INFO: renamed from: b */
    public final String f49501b;

    /* JADX INFO: renamed from: c */
    public final String f49502c;

    /* JADX INFO: renamed from: d */
    public final int f49503d = R$id.actionToImport;

    public ld6(String str, String str2, String str3) {
        this.f49500a = str;
        this.f49501b = str2;
        this.f49502c = str3;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f49500a);
        bundle.putString("title", this.f49501b);
        bundle.putString("fileUri", this.f49502c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f49503d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld6)) {
            return false;
        }
        ld6 ld6Var = (ld6) obj;
        return this.f49500a.equals(ld6Var.f49500a) && this.f49501b.equals(ld6Var.f49501b) && this.f49502c.equals(ld6Var.f49502c);
    }

    public final int hashCode() {
        return this.f49502c.hashCode() + ux5.m22980c(this.f49500a.hashCode() * 31, this.f49501b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ActionToImport(url=", this.f49500a, ", title=", this.f49501b, ", fileUri="), this.f49502c, ")");
    }
}
