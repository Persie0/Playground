package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bol extends Handler {

    /* JADX INFO: renamed from: r */
    final LinkedList f4018r;

    public bol(Looper looper) {
        super(looper);
        LinkedList linkedList = new LinkedList();
        this.f4018r = linkedList;
        linkedList.offerLast(-1);
    }

    /* JADX INFO: renamed from: c */
    final String m2808c(int i) {
        String str = new String("HIST") + "_ID" + i;
        Iterator it = this.f4018r.iterator();
        while (it.hasNext()) {
            str = str + '_' + ((Integer) it.next()).toString();
        }
        return str.concat("_HEND");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.f4018r.offerLast(Integer.valueOf(message.what));
        while (this.f4018r.size() > 400) {
            this.f4018r.pollFirst();
        }
    }
}
