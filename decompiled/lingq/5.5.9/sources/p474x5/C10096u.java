package p474x5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C10096u<DataT> implements InterfaceC10090o<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f51209a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o<Integer, DataT> f51210b;

    /* JADX INFO: renamed from: x5.u$a */
    public static final class a implements InterfaceC10091p<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Context f51211a;

        public a(Context context) {
            this.f51211a = context;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10096u(this.f51211a, c10094s.m18941b(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: x5.u$b */
    public static final class b implements InterfaceC10091p<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f51212a;

        public b(Context context) {
            this.f51212a = context;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10096u(this.f51212a, c10094s.m18941b(Integer.class, InputStream.class));
        }
    }

    public C10096u(Context context, InterfaceC10090o<Integer, DataT> interfaceC10090o) {
        this.f51209a = context.getApplicationContext();
        this.f51210b = interfaceC10090o;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f51209a.getPackageName().equals(uri2.getAuthority());
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        InterfaceC10090o<Integer, DataT> interfaceC10090o = this.f51210b;
        InterfaceC10090o.a<DataT> aVarMo18920b = null;
        if (size == 1) {
            try {
                int i12 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i12 != 0) {
                    aVarMo18920b = interfaceC10090o.mo18920b(Integer.valueOf(i12), i10, i11, c8735e);
                } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                }
                return aVarMo18920b;
            } catch (NumberFormatException e10) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e10);
                    return aVarMo18920b;
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f51209a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return interfaceC10090o.mo18920b(Integer.valueOf(identifier), i10, i11, c8735e);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return aVarMo18920b;
    }
}
