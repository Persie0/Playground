package p000;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dst {

    /* JADX INFO: renamed from: a */
    private static final nbh f12514a = nbh.m17259h("com/google/android/apps/camera/faceobfuscation/api/ThumbnailObfuscator");

    /* JADX INFO: renamed from: a */
    public static Bitmap m6666a(dsl dslVar, Bitmap bitmap, mrm mrmVar) {
        try {
            return (Bitmap) ((dsk) dslVar.mo6648b(new dsn(bitmap, 1), mrmVar).get()).mo6660a();
        } catch (InterruptedException | ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f12514a.m17252c()).mo17283h(e)).mo17276G((char) 1125)).mo17290o("Can't apply face obfuscation post-processing for thumbnail");
            return bitmap;
        }
    }
}
