package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlr implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lyz f40998a;

    public mlr(lyz lyzVar, byte[] bArr, byte[] bArr2) {
        this.f40998a = lyzVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                lyz lyzVar = this.f40998a;
                mkv mkvVar = (mkv) message.obj;
                synchronized (lyzVar.f39584a) {
                    try {
                        if (mkvVar == null) {
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
