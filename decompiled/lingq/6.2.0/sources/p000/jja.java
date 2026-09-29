package p000;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class jja implements jj4 {
    @Override // p000.jj4
    /* JADX INFO: renamed from: a */
    public final String mo14496a(Object obj, sz6 sz6Var) {
        Uri uri = (Uri) obj;
        if (!fa4.m11650l(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = sz6Var.f61659a.getResources().getConfiguration();
        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
