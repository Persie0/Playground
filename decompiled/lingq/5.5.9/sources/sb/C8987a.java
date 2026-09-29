package sb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import bb.C1351b;
import bb.C1352c;
import p152hb.InterfaceC5957c;
import p152hb.InterfaceC5980j;
import p176ib.AbstractC6257c;
import p176ib.C6254b;

/* JADX INFO: renamed from: sb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8987a extends AbstractC6257c {

    /* JADX INFO: renamed from: b0 */
    public final Bundle f47171b0;

    public C8987a(Context context, Looper looper, C6254b c6254b, C1352c c1352c, InterfaceC5957c interfaceC5957c, InterfaceC5980j interfaceC5980j) {
        super(context, looper, 16, c6254b, interfaceC5957c, interfaceC5980j);
        this.f47171b0 = c1352c == null ? new Bundle() : new Bundle((Bundle) null);
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: A */
    public final Bundle mo11557A() {
        return this.f47171b0;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 12451000;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p176ib.AbstractC6251a, com.google.android.gms.common.api.C2542a.e
    /* JADX INFO: renamed from: s */
    public final boolean mo7553s() {
        C6254b c6254b = this.f36451Y;
        Account account = c6254b.f36439a;
        if (!TextUtils.isEmpty(account != null ? account.name : null)) {
            if (c6254b.f36442d.get(C1351b.f8190a) != null) {
                throw null;
            }
            if (!c6254b.f36440b.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof C8988b ? (C8988b) iInterfaceQueryLocalInterface : new C8988b(iBinder);
    }
}
