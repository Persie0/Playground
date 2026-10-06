package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amn extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ amp f712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amn(amp ampVar, Looper looper) {
        super(looper);
        this.f712a = ampVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        bck[] bckVarArr;
        switch (message.what) {
            case 1:
                amp ampVar = this.f712a;
                while (true) {
                    synchronized (ampVar.f720b) {
                        size = ampVar.f721c.size();
                        if (size <= 0) {
                            return;
                        }
                        bckVarArr = new bck[size];
                        ampVar.f721c.toArray(bckVarArr);
                        ampVar.f721c.clear();
                    }
                    for (int i = 0; i < size; i++) {
                        bck bckVar = bckVarArr[i];
                        int size2 = ((ArrayList) bckVar.f2949b).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            amo amoVar = (amo) ((ArrayList) bckVar.f2949b).get(i2);
                            if (!amoVar.f716d) {
                                amoVar.f714b.onReceive(ampVar.f719a, (Intent) bckVar.f2948a);
                            }
                        }
                    }
                }
                break;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
