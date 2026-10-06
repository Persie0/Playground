package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gyl implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f26843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f26844c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f26845d;

    public /* synthetic */ gyl(gyn gynVar, Bitmap bitmap, int i, int i2) {
        this.f26845d = i2;
        this.f26843b = gynVar;
        this.f26844c = bitmap;
        this.f26842a = i;
    }

    public /* synthetic */ gyl(jvb jvbVar, kfk kfkVar, int i, int i2) {
        this.f26845d = i2;
        this.f26844c = jvbVar;
        this.f26843b = kfkVar;
        this.f26842a = i;
    }

    public /* synthetic */ gyl(jzu jzuVar, jzv jzvVar, int i, int i2) {
        this.f26845d = i2;
        this.f26844c = jzuVar;
        this.f26843b = jzvVar;
        this.f26842a = i;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kfk] */
    @Override // p000.mrf
    public final Object apply(Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean z = false;
        switch (this.f26845d) {
            case 0:
                Object obj2 = this.f26843b;
                Object obj3 = this.f26844c;
                int i = this.f26842a;
                Uri uri = (Uri) obj;
                uri.getClass();
                Uri uriBuild = uri.buildUpon().appendPath(KMNlNMe.ZPcOGjAXFEp).build();
                gyn gynVar = (gyn) obj2;
                gynVar.f26856e.mo13944f("Writing to URI ".concat(String.valueOf(String.valueOf(uriBuild))));
                try {
                    Context context = ((gyn) obj2).f26854c;
                    moy moyVarM15915a = lrn.m15915a();
                    moyVarM15915a.m16720c();
                    moyVarM15915a.f41219a = true;
                    moyVarM15915a.m16719b(new lrl());
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(lro.m15917b(context, uriBuild, "w", moyVarM15915a.m16718a()).getParcelFileDescriptor());
                    try {
                        jvh.m13543A((Bitmap) obj3, i).compress(Bitmap.CompressFormat.JPEG, 90, autoCloseOutputStream);
                        autoCloseOutputStream.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            autoCloseOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    gynVar.f26856e.mo13943e("Failed to save bitmap to ".concat(String.valueOf(String.valueOf(uriBuild))), e);
                }
                return Boolean.valueOf(z);
            case 1:
                Object obj4 = this.f26844c;
                kfc kfcVarMo14131r = this.f26843b.mo14131r((kho) obj, this.f26842a);
                ((jvb) obj4).m13537d(kfcVarMo14131r);
                return kfcVarMo14131r;
            default:
                Object obj5 = this.f26844c;
                Object obj6 = this.f26843b;
                int i2 = this.f26842a;
                List list = (List) obj;
                mrm mrmVar = (mrm) kxk.m14974T(((jzu) obj5).f35396h);
                FileDescriptor fileDescriptor = (FileDescriptor) kxk.m14974T(((jzv) obj6).m13852t());
                lku.m15613H(list.get(0) == mrmVar);
                lku.m15613H(list.get(1) == fileDescriptor);
                try {
                    return new jzo(fileDescriptor, i2, ((jzv) obj6).f35417m, mrmVar, ((jzv) obj6).f35416l, ((jzv) obj6).f35414j, ((jzv) obj6).f35415k, ((jzv) obj6).f35407c != null ? 2 : 3, ((jzv) obj6).f35408d != null ? 1 : 3, true != ((jzv) obj6).f35420p ? 3 : 2, ((jzv) obj6).f35418n, ((jzv) obj6).f35413i, ((jzu) obj5).f35397i, ((jzu) obj5).f35391c);
                } catch (IllegalArgumentException | jyp e2) {
                    Log.e("VideoRecorderImpl", "Failed to create muxer processor", e2);
                    throw new IllegalArgumentException(e2);
                }
        }
    }
}
