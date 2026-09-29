package p474x5;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C10095t<Data> implements InterfaceC10090o<Integer, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10090o<Uri, Data> f51204a;

    /* JADX INFO: renamed from: b */
    public final Resources f51205b;

    /* JADX INFO: renamed from: x5.t$a */
    public static final class a implements InterfaceC10091p<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f51206a;

        public a(Resources resources) {
            this.f51206a = resources;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10095t(this.f51206a, c10094s.m18941b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: x5.t$b */
    public static class b implements InterfaceC10091p<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Resources f51207a;

        public b(Resources resources) {
            this.f51207a = resources;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, InputStream> mo18922c(C10094s c10094s) {
            return new C10095t(this.f51207a, c10094s.m18941b(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: x5.t$c */
    public static class c implements InterfaceC10091p<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        public final Resources f51208a;

        public c(Resources resources) {
            this.f51208a = resources;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, Uri> mo18922c(C10094s c10094s) {
            return new C10095t(this.f51208a, C10098w.f51214a);
        }
    }

    public C10095t(Resources resources, InterfaceC10090o<Uri, Data> interfaceC10090o) {
        this.f51205b = resources;
        this.f51204a = interfaceC10090o;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(Integer num) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Integer num, int i10, int i11, C8735e c8735e) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f51205b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f51204a.mo18920b(uri, i10, i11, c8735e);
    }
}
