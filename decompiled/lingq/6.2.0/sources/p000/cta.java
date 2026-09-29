package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cta {
    /* JADX INFO: renamed from: a */
    public static String[] m9882a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static bl1 m9883b(View view, bl1 bl1Var) {
        ContentInfo contentInfoMo537m = bl1Var.f8654a.mo537m();
        Objects.requireNonNull(contentInfoMo537m);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo537m);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo537m ? bl1Var : new bl1(new vqb(contentInfoPerformReceiveContent));
    }
}
