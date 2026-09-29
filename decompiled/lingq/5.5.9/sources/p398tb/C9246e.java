package p398tb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import bb.C1350a;
import com.google.android.gms.common.api.AbstractC2544c;
import p176ib.AbstractC6257c;
import p176ib.C6254b;

/* JADX INFO: renamed from: tb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9246e extends AbstractC6257c {

    /* JADX INFO: renamed from: b0 */
    public final C1350a.a f47935b0;

    public C9246e(Context context, Looper looper, C6254b c6254b, C1350a.a aVar, AbstractC2544c.a aVar2, AbstractC2544c.b bVar) {
        super(context, looper, 68, c6254b, aVar2, bVar);
        C1350a.a.C10596a c10596a = new C1350a.a.C10596a(aVar == null ? C1350a.a.f8185c : aVar);
        byte[] bArr = new byte[16];
        C9244c.f47933a.nextBytes(bArr);
        c10596a.f8189b = Base64.encodeToString(bArr, 11);
        this.f47935b0 = new C1350a.a(c10596a);
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: A */
    public final Bundle mo11557A() {
        C1350a.a aVar = this.f47935b0;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f8186a);
        bundle.putString("log_session_id", aVar.f8187b);
        return bundle;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 12800000;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C9247f ? (C9247f) iInterfaceQueryLocalInterface : new C9247f(iBinder);
    }
}
