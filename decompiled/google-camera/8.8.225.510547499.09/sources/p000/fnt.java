package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fnt extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ foc f22805a;

    public fnt(foc focVar) {
        this.f22805a = focVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        foc focVar = this.f22805a;
        Bitmap bitmap = ((BitmapDrawable) focVar.f22888s.mo3692f().getResources().getDrawable(focVar.f22838Q == 1 ? C0100R.drawable.ic_photosphere_processing : C0100R.drawable.ic_panorama_processing)).getBitmap();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            gxx gxxVar = this.f22805a.f22882m.f6801b;
            gxxVar.mo9887S(kbc.m13903h(0, 0));
            gxxVar.mo9885Q(jvh.m13548F(C0100R.string.processing_photo_sphere, new Object[0]));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gxxVar.mo9892X(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, new BitmapFactory.Options()), 0);
            this.f22805a.f22895z.mo9925e(gxxVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22805a.f22836O;
            gyr gyrVar = gxxVar.f26777d;
            if (!gyrVar.m10000b()) {
                throw new IOException("Temporary session file not usable.");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(gyrVar.m9999a());
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                fileOutputStream.close();
                this.f22805a.f22882m.f6801b.m9945K();
                foc focVar2 = this.f22805a;
                focVar2.f22890u.mo8153aA(focVar2.f22885p, focVar2.f22835N, jElapsedRealtime * 0.001f);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            ((nbe) ((nbe) foc.f22821b.m17251b()).mo17276G((char) 2386)).mo17290o("Could not write temporary panorama image.");
        }
    }
}
