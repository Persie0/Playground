package p070db;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p176ib.AbstractC6257c;
import p176ib.C6254b;
import p398tb.C9244c;

/* JADX INFO: renamed from: db.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5127g extends AbstractC6257c {

    /* JADX INFO: renamed from: b0 */
    public final GoogleSignInOptions f33113b0;

    public C5127g(Context context, Looper looper, C6254b c6254b, GoogleSignInOptions googleSignInOptions, AbstractC2544c.a aVar, AbstractC2544c.b bVar) {
        super(context, looper, 91, c6254b, aVar, bVar);
        GoogleSignInOptions.C2540a c2540a = googleSignInOptions != null ? new GoogleSignInOptions.C2540a(googleSignInOptions) : new GoogleSignInOptions.C2540a();
        byte[] bArr = new byte[16];
        C9244c.f47933a.nextBytes(bArr);
        c2540a.f13838i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = c6254b.f36441c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c2540a.f13830a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f33113b0 = c2540a.m7524a();
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 12451000;
    }

    @Override // p176ib.AbstractC6251a, com.google.android.gms.common.api.C2542a.e
    /* JADX INFO: renamed from: r */
    public final Intent mo7552r() {
        return C5133m.m10911a(this.f36423h, this.f33113b0);
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5138r ? (C5138r) iInterfaceQueryLocalInterface : new C5138r(iBinder);
    }
}
