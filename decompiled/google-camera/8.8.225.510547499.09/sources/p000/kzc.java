package p000;

import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.nio.Buffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzc implements kyz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37765a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37766b;

    public /* synthetic */ kzc(EGLImage eGLImage, int i) {
        this.f37766b = i;
        this.f37765a = eGLImage;
    }

    public kzc(Object obj, int i) {
        this.f37766b = i;
        this.f37765a = obj;
    }

    public /* synthetic */ kzc(Runnable runnable, int i) {
        this.f37766b = i;
        this.f37765a = runnable;
    }

    public kzc(Throwable th, int i) {
        this.f37766b = i;
        this.f37765a = th;
    }

    public kzc(kzy kzyVar, int i) {
        this.f37766b = i;
        this.f37765a = kzyVar;
    }

    public /* synthetic */ kzc(lfw lfwVar, int i) {
        this.f37766b = i;
        this.f37765a = lfwVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.kyz
    /* JADX INFO: renamed from: a */
    public final Object mo8768a(Object obj) throws Throwable {
        switch (this.f37766b) {
            case 0:
                throw ((Throwable) this.f37765a);
            case 1:
                return this.f37765a;
            case 2:
                throw ((Throwable) this.f37765a);
            case 3:
                Object obj2 = this.f37765a;
                ((ldv) obj).m15215e();
                EGLImage.attachToTexture(((EGLImage) obj2).f7948a);
                return kyy.f37751a;
            case 4:
                Object obj3 = this.f37765a;
                ldi ldiVar = (ldi) obj;
                ldiVar.mo15188k();
                lgb lgbVarC = ((lfx) obj3).mo4710c();
                try {
                    ldiVar.mo15189l((Buffer) lgbVarC.mo15294c());
                    lgbVarC.close();
                    return kyy.f37751a;
                } catch (Throwable th) {
                    try {
                        lgbVarC.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            default:
                ?? r0 = this.f37765a;
                ldi ldiVar2 = (ldi) obj;
                ldiVar2.mo15188k();
                r0.run();
                ldiVar2.mo15190m();
                return kyy.f37751a;
        }
    }
}
