package p312p2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p286o2.C7904d;
import p404u2.C9393m;

/* JADX INFO: renamed from: p2.m */
/* JADX INFO: loaded from: classes.dex */
public class C8181m {

    /* JADX INFO: renamed from: p2.m$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        int mo16287a(T t10);

        /* JADX INFO: renamed from: b */
        boolean mo16288b(T t10);
    }

    public C8181m() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m16289d(T[] tArr, int i10, a<T> aVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(aVar.mo16287a(t11) - i11) * 2) + (aVar.mo16288b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > iAbs) {
                t10 = t11;
                i12 = iAbs;
            }
        }
        return t10;
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo16234a(Context context, C7904d.c cVar, Resources resources, int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo16237b(Context context, C9393m[] c9393mArr, int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface mo16238c(Context context, Resources resources, int i10, String str, int i11) {
        File fileM16293d = C8182n.m16293d(context);
        if (fileM16293d == null) {
            return null;
        }
        try {
            if (C8182n.m16291b(fileM16293d, resources, i10)) {
                return Typeface.createFromFile(fileM16293d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM16293d.delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public C9393m mo16286e(int i10, C9393m[] c9393mArr) {
        return (C9393m) m16289d(c9393mArr, i10, new C8180l());
    }
}
