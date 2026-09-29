package p042c6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import p356r5.C8734d;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: c6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1733e implements InterfaceC8736f<Uri, Drawable> {

    /* JADX INFO: renamed from: b */
    public static final C8734d<Resources.Theme> f9578b = new C8734d<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C8734d.f46326e);

    /* JADX INFO: renamed from: a */
    public final Context f9579a;

    public C1733e(Context context) {
        this.f9579a = context.getApplicationContext();
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC9207m<Drawable> mo68a(Uri uri, int i10, int i11, C8735e c8735e) throws IOException {
        return m5471c(uri, c8735e);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(Uri uri, C8735e c8735e) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0072, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00e7, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC9207m m5471c(Uri uri, C8735e c8735e) {
        Context contextCreatePackageContext;
        List<String> pathSegments;
        int identifier;
        Resources.Theme theme;
        Drawable drawableM5469a;
        String str;
        String str2;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f9579a;
        if (!authority.equals(context.getPackageName())) {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
                contextCreatePackageContext = context;
            }
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                str = pathSegments2.get(0);
                str2 = pathSegments2.get(1);
                identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
                if (identifier == 0) {
                    identifier = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (identifier != 0) {
                    throw new IllegalArgumentException("Failed to find resource id for: " + uri);
                }
            } else {
                if (pathSegments.size() == 1) {
                    throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
                }
                try {
                    identifier = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
                }
            }
            if (authority.equals(context.getPackageName())) {
                theme = (Resources.Theme) c8735e.m16963c(f9578b);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawableM5469a = C1730b.m5469a(context, contextCreatePackageContext, identifier, null);
            } else {
                drawableM5469a = C1730b.m5469a(context, context, identifier, theme);
            }
            return drawableM5469a != null ? new C1732d(drawableM5469a) : null;
        }
        contextCreatePackageContext = context;
        pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments3 = uri.getPathSegments();
            String authority3 = uri.getAuthority();
            str = pathSegments3.get(0);
            str2 = pathSegments3.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority3);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier != 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() == 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            identifier = Integer.parseInt(uri.getPathSegments().get(0));
        }
        if (authority.equals(context.getPackageName())) {
            theme = (Resources.Theme) c8735e.m16963c(f9578b);
        } else {
            theme = null;
        }
        if (theme == null) {
            drawableM5469a = C1730b.m5469a(context, contextCreatePackageContext, identifier, null);
        } else {
            drawableM5469a = C1730b.m5469a(context, context, identifier, theme);
        }
        return drawableM5469a != null ? new C1732d(drawableM5469a) : null;
    }
}
