package p176ib;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: ib.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6286p extends AbstractDialogInterfaceOnClickListenerC6292s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f36480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f36481b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36482c;

    public C6286p(int i10, Activity activity, Intent intent) {
        this.f36480a = intent;
        this.f36481b = activity;
        this.f36482c = i10;
    }

    @Override // p176ib.AbstractDialogInterfaceOnClickListenerC6292s
    /* JADX INFO: renamed from: a */
    public final void mo12928a() {
        Intent intent = this.f36480a;
        if (intent != null) {
            this.f36481b.startActivityForResult(intent, this.f36482c);
        }
    }
}
