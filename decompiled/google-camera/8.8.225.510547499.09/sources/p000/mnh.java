package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class mnh implements Runnable {

    /* JADX INFO: renamed from: d */
    public final khb f41107d;

    public mnh() {
        this.f41107d = null;
    }

    public mnh(khb khbVar, byte[] bArr, byte[] bArr2) {
        this.f41107d = khbVar;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo16640a();

    /* JADX INFO: renamed from: b */
    public final void m16657b(Exception exc) {
        khb khbVar = this.f41107d;
        if (khbVar != null) {
            khbVar.m14244j(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo16640a();
        } catch (Exception e) {
            m16657b(e);
        }
    }
}
