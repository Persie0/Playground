package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class twc {

    /* JADX INFO: renamed from: a */
    public final l79 f63027a;

    public twc(l79 l79Var) {
        this.f63027a = l79Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m22330a(Uri uri, String str) {
        l79 l79Var = uri != null ? (l79) this.f63027a.get(uri.toString()) : null;
        if (l79Var == null) {
            return null;
        }
        return (String) l79Var.get(str);
    }
}
