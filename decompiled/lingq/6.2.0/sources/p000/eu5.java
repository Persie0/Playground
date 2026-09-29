package p000;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final class eu5 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final Handler f37867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fu5 f37868b;

    public eu5(fu5 fu5Var, st5 st5Var) {
        this.f37868b = fu5Var;
        Handler handlerM22816k = uma.m22816k(this);
        this.f37867a = handlerM22816k;
        st5Var.mo10713D(this, handlerM22816k);
    }

    /* JADX INFO: renamed from: a */
    public final void m11343a(long j) {
        Surface surface;
        fu5 fu5Var = this.f37868b;
        C3165jz c3165jz = fu5Var.f39669e1;
        if (this != fu5Var.f39661P1 || fu5Var.f68754i0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            fu5Var.f68724P0 = true;
            return;
        }
        try {
            fu5Var.m24678D0(j);
            lsa lsaVar = fu5Var.f39656K1;
            if (!lsaVar.equals(lsa.f50084d) && !lsaVar.equals(fu5Var.f39657L1)) {
                fu5Var.f39657L1 = lsaVar;
                c3165jz.m14752b(lsaVar);
            }
            fu5Var.f68728R0.f48972e++;
            ypa ypaVar = fu5Var.f39672h1;
            boolean z = ypaVar.f70267e != 3;
            ypaVar.f70267e = 3;
            ypaVar.f70274l.getClass();
            ypaVar.f70269g = uma.m22797B(SystemClock.elapsedRealtime());
            if (z && (surface = fu5Var.f39685u1) != null) {
                Handler handler = c3165jz.f46413a;
                if (handler != null) {
                    handler.post(new sp1(c3165jz, surface, SystemClock.elapsedRealtime()));
                }
                fu5Var.f39688x1 = true;
            }
            fu5Var.mo12187i0(j);
        } catch (ExoPlaybackException e) {
            fu5Var.f68726Q0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = uma.f64080a;
        m11343a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
