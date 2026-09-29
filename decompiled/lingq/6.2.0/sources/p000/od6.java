package p000;

import android.os.Bundle;
import com.lingq.core.web.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class od6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f54212a;

    /* JADX INFO: renamed from: b */
    public final String f54213b;

    /* JADX INFO: renamed from: c */
    public final int f54214c = R$id.actionToWeb;

    public od6(String str, String str2) {
        this.f54212a = str;
        this.f54213b = str2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f54212a);
        bundle.putString("grammarOpenedPath", null);
        bundle.putString("title", this.f54213b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f54214c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        return this.f54212a.equals(od6Var.f54212a) && fa4.m11650l(this.f54213b, od6Var.f54213b);
    }

    public final int hashCode() {
        int iHashCode = this.f54212a.hashCode() * 961;
        String str = this.f54213b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("ActionToWeb(url=", this.f54212a, ", grammarOpenedPath=null, title=", this.f54213b, ")");
    }
}
