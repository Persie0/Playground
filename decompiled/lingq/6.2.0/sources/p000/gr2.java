package p000;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gr2 extends mq2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WeakReference f41231a;

    public gr2(EditText editText) {
        this.f41231a = new WeakReference(editText);
    }

    @Override // p000.mq2
    /* JADX INFO: renamed from: b */
    public final void mo12849b() {
        Handler handler;
        EditText editText = (EditText) this.f41231a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        hr2.m13436a((EditText) this.f41231a.get(), 1);
    }
}
