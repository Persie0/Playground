package p000;

import android.opengl.EGLExt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fsf implements kyz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f23455a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23456b;

    public /* synthetic */ fsf(long j, int i) {
        this.f23456b = i;
        this.f23455a = j;
    }

    @Override // p000.kyz
    /* JADX INFO: renamed from: a */
    public final Object mo8768a(Object obj) {
        switch (this.f23456b) {
            case 0:
                long j = this.f23455a;
                ldi ldiVar = (ldi) obj;
                ldiVar.mo15188k();
                EGLExt.eglPresentationTimeANDROID(ldiVar.mo15183f(), ldiVar.mo15184g(), j);
                ldiVar.mo15190m();
                return true;
            case 1:
                long j2 = this.f23455a;
                ldi ldiVar2 = (ldi) obj;
                nbh nbhVar = eod.f14836a;
                EGLExt.eglPresentationTimeANDROID(ldiVar2.mo15183f(), ldiVar2.mo15184g(), j2);
                return true;
            case 2:
                ldi ldiVar3 = (ldi) obj;
                EGLExt.eglPresentationTimeANDROID(ldiVar3.mo15183f(), ldiVar3.mo15184g(), this.f23455a);
                return true;
            default:
                ldi ldiVar4 = (ldi) obj;
                EGLExt.eglPresentationTimeANDROID(ldiVar4.mo15183f(), ldiVar4.mo15184g(), this.f23455a);
                return kyy.f37751a;
        }
    }
}
