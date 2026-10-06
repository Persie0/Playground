package p000;

import android.util.AndroidRuntimeException;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aiv extends ais {

    /* JADX INFO: renamed from: q */
    public aiw f461q;

    /* JADX INFO: renamed from: r */
    public float f462r;

    /* JADX INFO: renamed from: s */
    private boolean f463s;

    public aiv(gtx gtxVar, byte[] bArr) {
        super(gtxVar, (byte[]) null);
        this.f461q = null;
        this.f462r = Float.MAX_VALUE;
        this.f463s = false;
    }

    @Override // p000.ais
    /* JADX INFO: renamed from: d */
    public final void mo780d() {
        aiw aiwVar = this.f461q;
        if (aiwVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM789a = aiwVar.m789a();
        if (dM789a > this.f454n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM789a < this.f455o) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(m778b());
        aiwVar.f466c = dAbs;
        aiwVar.f467d = dAbs * 62.5d;
        super.mo780d();
    }

    @Override // p000.ais
    /* JADX INFO: renamed from: e */
    public final boolean mo781e(long j) {
        float f;
        if (this.f463s) {
            float f2 = this.f462r;
            if (f2 != Float.MAX_VALUE) {
                this.f461q.m792d(f2);
                this.f462r = Float.MAX_VALUE;
            }
            this.f449i = this.f461q.m789a();
            this.f448h = 0.0f;
            this.f463s = false;
            return true;
        }
        if (this.f462r != Float.MAX_VALUE) {
            long j2 = j / 2;
            aio aioVarM790b = this.f461q.m790b(this.f449i, this.f448h, j2);
            this.f461q.m792d(this.f462r);
            this.f462r = Float.MAX_VALUE;
            aio aioVarM790b2 = this.f461q.m790b(aioVarM790b.f439a, aioVarM790b.f440b, j2);
            f = aioVarM790b2.f439a;
            this.f449i = f;
            this.f448h = aioVarM790b2.f440b;
        } else {
            aio aioVarM790b3 = this.f461q.m790b(this.f449i, this.f448h, j);
            f = aioVarM790b3.f439a;
            this.f449i = f;
            this.f448h = aioVarM790b3.f440b;
        }
        float fMax = Math.max(f, this.f455o);
        this.f449i = fMax;
        float fMin = Math.min(fMax, this.f454n);
        this.f449i = fMin;
        float f3 = this.f448h;
        aiw aiwVar = this.f461q;
        if (Math.abs(f3) >= aiwVar.f467d || Math.abs(fMin - aiwVar.m789a()) >= aiwVar.f466c) {
            return false;
        }
        this.f449i = this.f461q.m789a();
        this.f448h = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m788k() {
        if (this.f461q.f465b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!aif.m771a().m772b()) {
            throw new AndroidRuntimeException(hsSUWRJfoeC.lOdhYJ);
        }
        if (this.f453m) {
            this.f463s = true;
        }
    }

    public aiv(Object obj, aiu aiuVar) {
        super(obj, aiuVar);
        this.f461q = null;
        this.f462r = Float.MAX_VALUE;
        this.f463s = false;
    }
}
