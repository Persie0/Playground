package p176ib;

import android.content.Intent;
import p152hb.InterfaceC5968f;

/* JADX INFO: renamed from: ib.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6290r extends AbstractDialogInterfaceOnClickListenerC6292s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f36491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5968f f36492b;

    public C6290r(Intent intent, InterfaceC5968f interfaceC5968f) {
        this.f36491a = intent;
        this.f36492b = interfaceC5968f;
    }

    @Override // p176ib.AbstractDialogInterfaceOnClickListenerC6292s
    /* JADX INFO: renamed from: a */
    public final void mo12928a() {
        Intent intent = this.f36491a;
        if (intent != null) {
            this.f36492b.startActivityForResult(intent, 2);
        }
    }
}
