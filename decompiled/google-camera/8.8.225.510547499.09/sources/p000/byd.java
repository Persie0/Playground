package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byd implements bqt {

    /* JADX INFO: renamed from: a */
    public static final bqq f4735a = bqq.m2925b("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: b */
    private final Context f4736b;

    public byd(Context context) {
        this.f4736b = context.getApplicationContext();
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        return m3183c((Uri) obj, bqrVar);
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX INFO: renamed from: c */
    public final bsz m3183c(Uri uri, bqr bqrVar) {
        Context contextCreatePackageContext;
        int identifier;
        Drawable drawableM3180a;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + String.valueOf(uri) + " is null or empty");
        }
        if (authority.equals(this.f4736b.getPackageName())) {
            contextCreatePackageContext = this.f4736b;
        } else {
            try {
                contextCreatePackageContext = this.f4736b.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.f4736b.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                contextCreatePackageContext = this.f4736b;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        bzq.m3278r(authority);
        Resources.Theme theme = authority.equals(this.f4736b.getPackageName()) ? (Resources.Theme) bqrVar.m2927b(f4735a) : null;
        if (theme == null) {
            drawableM3180a = bya.m3180a(this.f4736b, contextCreatePackageContext, identifier, null);
        } else {
            Context context = this.f4736b;
            drawableM3180a = bya.m3180a(context, context, identifier, theme);
        }
        return byc.m3182g(drawableM3180a);
    }
}
