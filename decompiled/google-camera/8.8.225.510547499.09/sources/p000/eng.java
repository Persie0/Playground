package p000;

import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eng implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f14757a;

    public eng(int i) {
        this.f14757a = i;
    }

    /* JADX INFO: renamed from: a */
    public static jww m7558a() {
        jww jwwVar = eza.f21026a;
        jwwVar.getClass();
        return jwwVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14757a) {
            case 0:
                return new ene();
            case 1:
                return new goy();
            case 2:
                return new jwf(false);
            case 3:
                return new lbn((byte[]) null);
            case 4:
                return new enc();
            case 5:
                return new nsk();
            case 6:
                return new epy();
            case 7:
                return new jwf(false);
            case 8:
                return false;
            case 9:
                return mqu.f41450a;
            case 10:
                return new gtd(ikw.PHOTO);
            case 11:
                return new gtd(ikw.IMAGE_INTENT);
            case 12:
                return new gtd(ikw.LONG_EXPOSURE);
            case 13:
                return new gtd(ikw.MOTION_BLUR);
            case 14:
                return new gtd(ikw.PORTRAIT);
            case 15:
                return new gtd(ikw.REWIND);
            case 16:
                return new jwf("");
            case 17:
                throw null;
            case 18:
                return new InstrumentationCameraEventLogger();
            case 19:
                return new fcj();
            default:
                return new fcz();
        }
    }
}
