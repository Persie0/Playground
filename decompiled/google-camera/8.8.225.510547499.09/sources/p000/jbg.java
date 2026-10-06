package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbg extends jhh {

    /* JADX INFO: renamed from: a */
    public final GoogleSignInOptions f33660a;

    public jbg(Context context, Looper looper, jgz jgzVar, GoogleSignInOptions googleSignInOptions, jea jeaVar, jeb jebVar) {
        super(context, looper, 91, jgzVar, jeaVar, jebVar);
        jbd jbdVar = googleSignInOptions != null ? new jbd(googleSignInOptions) : new jbd();
        Random random = jkt.f34271a;
        byte[] bArr = new byte[16];
        jkt.f34271a.nextBytes(bArr);
        jbdVar.f33647b = Base64.encodeToString(bArr, 11);
        if (!jgzVar.f34016c.isEmpty()) {
            Iterator it = jgzVar.f34016c.iterator();
            while (it.hasNext()) {
                jbdVar.m12832c((Scope) it.next(), new Scope[0]);
            }
        }
        this.f33660a = jbdVar.m12830a();
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 12451000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof jbs ? (jbs) iInterfaceQueryLocalInterface : new jbs(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
