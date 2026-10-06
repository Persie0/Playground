package p000;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsn implements dsj {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12503a;

    /* JADX INFO: renamed from: b */
    private final Object f12504b;

    public dsn(Bitmap bitmap, int i) {
        this.f12503a = i;
        this.f12504b = bitmap;
    }

    public dsn(HardwareBuffer hardwareBuffer, int i) {
        this.f12503a = i;
        this.f12504b = hardwareBuffer;
    }

    @Override // p000.dsj
    /* JADX INFO: renamed from: b */
    public final dsk mo6656b(HardwareBuffer hardwareBuffer) {
        switch (this.f12503a) {
            case 0:
                return new dso(hardwareBuffer);
            default:
                return new dsm((Bitmap) this.f12504b, hardwareBuffer);
        }
    }

    @Override // p000.dsj
    /* JADX INFO: renamed from: c */
    public final ldz mo6657c(lby lbyVar) throws IllegalAccessException, InvocationTargetException {
        switch (this.f12503a) {
            case 0:
                lea leaVarM15230a = lea.m15230a(lbyVar);
                try {
                    EGLImage eGLImage = new EGLImage((HardwareBuffer) this.f12504b);
                    try {
                        lcy lcyVarM15192b = lcy.m15192b(lbyVar, eGLImage);
                        try {
                            ldz ldzVarM15227g = ldz.m15227g(lbyVar, lcyVarM15192b.m15193g());
                            ldx ldxVarM15223m = ldx.m15223m(kua.m14875n(ldzVarM15227g));
                            try {
                                leaVarM15230a.m15235e(lcyVarM15192b, ldxVarM15223m);
                                ldxVarM15223m.close();
                                lcyVarM15192b.close();
                                eGLImage.close();
                                leaVarM15230a.close();
                                return ldzVarM15227g;
                            } catch (Throwable th) {
                                try {
                                    ldxVarM15223m.close();
                                    break;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                lcyVarM15192b.close();
                                break;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            eGLImage.close();
                            break;
                        } catch (Throwable th6) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        leaVarM15230a.close();
                        break;
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                    }
                    throw th7;
                }
            default:
                Bitmap bitmap = (Bitmap) this.f12504b;
                return new ldz(lbyVar, lcf.m15165d(lbyVar, new ldy(lbyVar, new lbm(kzi.m15087d(bitmap.getWidth(), bitmap.getHeight())), bitmap, 0)));
        }
    }

    @Override // p000.dsj
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo6658d() {
        switch (this.f12503a) {
            case 0:
                break;
        }
        return this.f12504b;
    }

    @Override // p000.dsj
    /* JADX INFO: renamed from: e */
    public final void mo6659e() {
        switch (this.f12503a) {
            case 0:
                ((HardwareBuffer) this.f12504b).close();
                break;
        }
    }

    @Override // p000.dsj
    /* JADX INFO: renamed from: a */
    public final HardwareBuffer mo6655a() {
        switch (this.f12503a) {
            case 0:
                return HardwareBuffer.create(((HardwareBuffer) this.f12504b).getWidth(), ((HardwareBuffer) this.f12504b).getHeight(), ((HardwareBuffer) this.f12504b).getFormat(), ((HardwareBuffer) this.f12504b).getLayers(), ((HardwareBuffer) this.f12504b).getUsage());
            default:
                return HardwareBuffer.create(((Bitmap) this.f12504b).getWidth(), ((Bitmap) this.f12504b).getHeight(), 1, 1, 259L);
        }
    }
}
