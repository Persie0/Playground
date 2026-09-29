package p474x5;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C10097v<Data> implements InterfaceC10090o<String, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10090o<Uri, Data> f51213a;

    /* JADX INFO: renamed from: x5.v$a */
    public static final class a implements InterfaceC10091p<String, AssetFileDescriptor> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<String, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10097v(c10094s.m18941b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: x5.v$b */
    public static class b implements InterfaceC10091p<String, ParcelFileDescriptor> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<String, ParcelFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10097v(c10094s.m18941b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: x5.v$c */
    public static class c implements InterfaceC10091p<String, InputStream> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<String, InputStream> mo18922c(C10094s c10094s) {
            return new C10097v(c10094s.m18941b(Uri.class, InputStream.class));
        }
    }

    public C10097v(InterfaceC10090o<Uri, Data> interfaceC10090o) {
        this.f51213a = interfaceC10090o;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(String str) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(String str, int i10, int i11, C8735e c8735e) {
        Uri uriFromFile;
        String str2 = str;
        InterfaceC10090o.a<Data> aVarMo18920b = null;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            InterfaceC10090o<Uri, Data> interfaceC10090o = this.f51213a;
            if (interfaceC10090o.mo18919a(uriFromFile)) {
                aVarMo18920b = interfaceC10090o.mo18920b(uriFromFile, i10, i11, c8735e);
            }
        }
        return aVarMo18920b;
    }
}
