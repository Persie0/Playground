package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebz implements kbg {

    /* JADX INFO: renamed from: a */
    public final int f13324a;

    /* JADX INFO: renamed from: b */
    private final Handler f13325b;

    /* JADX INFO: renamed from: c */
    private key f13326c;

    public ebz(Handler handler, dhv dhvVar) {
        this.f13325b = handler;
        this.f13324a = ((Integer) dhvVar.mo6173a(did.f11453g).orElse(615)).intValue();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized key m7105b(long j) {
        key keyVar = this.f13326c;
        if (keyVar != null && !keyVar.mo7044e() && keyVar.mo7041b() != null) {
            kfd kfdVarMo7041b = this.f13326c.mo7041b();
            kfdVarMo7041b.getClass();
            if (j - kfdVarMo7041b.f35811b < this.f13324a) {
                key keyVar2 = this.f13326c;
                keyVar2.getClass();
                return keyVar2.mo7040a();
            }
            key keyVar3 = this.f13326c;
            keyVar3.getClass();
            keyVar3.close();
        }
        return null;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized void mo3415bf(key keyVar) {
        if (keyVar != null) {
            if (!keyVar.mo7044e()) {
                key keyVar2 = this.f13326c;
                if (keyVar2 != null && !keyVar2.mo7044e()) {
                    keyVar2.close();
                }
                this.f13326c = keyVar;
                this.f13325b.postDelayed(new dgq(this, keyVar, 16), this.f13324a);
            }
        }
    }
}
