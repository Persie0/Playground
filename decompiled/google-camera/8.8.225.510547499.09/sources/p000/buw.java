package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buw implements bvl {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4506a;

    /* JADX INFO: renamed from: b */
    private final Object f4507b;

    /* JADX INFO: renamed from: c */
    private final Object f4508c;

    public buw(Context context, buv buvVar, int i) {
        this.f4506a = i;
        this.f4507b = context.getApplicationContext();
        this.f4508c = buvVar;
    }

    public buw(Context context, bvl bvlVar, int i) {
        this.f4506a = i;
        this.f4507b = context.getApplicationContext();
        this.f4508c = bvlVar;
    }

    public buw(AssetManager assetManager, buk bukVar, int i) {
        this.f4506a = i;
        this.f4507b = assetManager;
        this.f4508c = bukVar;
    }

    public buw(Resources resources, bvl bvlVar, int i) {
        this.f4506a = i;
        this.f4507b = resources;
        this.f4508c = bvlVar;
    }

    /* JADX INFO: renamed from: c */
    private final Uri m3088c(Integer num) {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.f4507b).getResourcePackageName(num.intValue()) + "/" + ((Resources) this.f4507b).getResourceTypeName(num.intValue()) + "/" + ((Resources) this.f4507b).getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo3083a(Object obj) {
        switch (this.f4506a) {
            case 0:
                return true;
            case 1:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 2:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f4507b).getPackageName().equals(uri2.getAuthority());
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [buv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [bvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [buk, java.lang.Object] */
    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        switch (this.f4506a) {
            case 0:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) bqrVar.m2927b(byd.f4735a);
                return new C1058va(new cat(num), new buu(theme, theme != null ? theme.getResources() : ((Context) this.f4507b).getResources(), this.f4508c, num.intValue()));
            case 1:
                Uri uri = (Uri) obj;
                return new C1058va(new cat(uri), this.f4508c.mo3079a((AssetManager) this.f4507b, uri.toString().substring(22)));
            case 2:
                Uri uriM3088c = m3088c((Integer) obj);
                if (uriM3088c == null) {
                    return null;
                }
                return this.f4508c.mo3084b(uriM3088c, i, i2, bqrVar);
            default:
                Uri uri2 = (Uri) obj;
                List<String> pathSegments = uri2.getPathSegments();
                if (pathSegments.size() != 1) {
                    if (pathSegments.size() != 2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri2))));
                        return null;
                    }
                    List<String> pathSegments2 = uri2.getPathSegments();
                    int identifier = ((Context) this.f4507b).getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), ((Context) this.f4507b).getPackageName());
                    if (identifier != 0) {
                        return this.f4508c.mo3084b(Integer.valueOf(identifier), i, i2, bqrVar);
                    }
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri2))));
                    return null;
                }
                try {
                    int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                    if (i3 != 0) {
                        return this.f4508c.mo3084b(Integer.valueOf(i3), i, i2, bqrVar);
                    }
                    if (Log.isLoggable("ResourceUriLoader", 5)) {
                        Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + String.valueOf(uri2));
                    }
                    return null;
                } catch (NumberFormatException e) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri2))), e);
                    return null;
                }
        }
    }
}
