package p176ib;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: ib.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6288q extends AbstractDialogInterfaceOnClickListenerC6292s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f36486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f36487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36488c;

    public C6288q(int i10, Intent intent, Fragment fragment) {
        this.f36486a = intent;
        this.f36487b = fragment;
        this.f36488c = i10;
    }

    @Override // p176ib.AbstractDialogInterfaceOnClickListenerC6292s
    /* JADX INFO: renamed from: a */
    public final void mo12928a() throws Exception {
        Intent intent = this.f36486a;
        if (intent != null) {
            this.f36487b.startActivityForResult(intent, this.f36488c);
        }
    }
}
