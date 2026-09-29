package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56329a;

    public /* synthetic */ pk0(int i) {
        this.f56329a = i;
    }

    /* JADX INFO: renamed from: a */
    public final Object m19359a(Object obj, sz6 sz6Var) throws PackageManager.NameNotFoundException {
        String str;
        String authority;
        switch (this.f56329a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (AbstractC3057h.m12989d(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                str = path != null ? path : "";
                if (str.length() <= 0 || !ci8.m4732q(str.charAt(0), '/', false) || ((String) u91.m22591I0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!fa4.m11650l(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((ex3) obj).f38032i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = sz6Var.f61659a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!fa4.m11650l(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || vk9.m23391n0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                str = authority2 != null ? authority2 : "";
                Resources resourcesForApplication = sz6Var.f61659a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    ij6.m13951i(uri2, "Invalid android.resource URI: ");
                    return null;
                }
                return Uri.parse("android.resource://" + str + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
