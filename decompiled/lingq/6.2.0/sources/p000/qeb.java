package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qeb extends co3 {

    /* JADX INFO: renamed from: A */
    public final GoogleSignInOptions f57663A;

    public qeb(Context context, Looper looper, co7 co7Var, GoogleSignInOptions googleSignInOptions, scb scbVar, scb scbVar2) {
        vo3 vo3Var;
        super(context, looper, 91, co7Var, scbVar, scbVar2, 0);
        Set<Scope> set = (Set) co7Var.f10361d;
        if (googleSignInOptions != null) {
            vo3Var = new vo3();
            vo3Var.f65707a = new HashSet();
            vo3Var.f65714h = new HashMap();
            vo3Var.f65707a = new HashSet(googleSignInOptions.f11598b);
            vo3Var.f65708b = googleSignInOptions.f11601e;
            vo3Var.f65709c = googleSignInOptions.f11602f;
            vo3Var.f65710d = googleSignInOptions.f11600d;
            vo3Var.f65711e = googleSignInOptions.f11603g;
            vo3Var.f65712f = googleSignInOptions.f11599c;
            vo3Var.f65713g = googleSignInOptions.f11604h;
            vo3Var.f65714h = GoogleSignInOptions.m5271J(googleSignInOptions.f11605i);
            vo3Var.f65715i = googleSignInOptions.f11606j;
        } else {
            vo3Var = new vo3();
            vo3Var.f65707a = new HashSet();
            vo3Var.f65714h = new HashMap();
        }
        vo3Var.f65715i = ieb.m13815a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = vo3Var.f65707a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = vo3Var.f65707a;
        if (hashSet2.contains(GoogleSignInOptions.f11593I)) {
            Scope scope2 = GoogleSignInOptions.f11592H;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (vo3Var.f65710d && (vo3Var.f65712f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f11596l);
        }
        this.f57663A = new GoogleSignInOptions(3, new ArrayList(hashSet2), vo3Var.f65712f, vo3Var.f65710d, vo3Var.f65708b, vo3Var.f65709c, vo3Var.f65711e, vo3Var.f65713g, vo3Var.f65714h, vo3Var.f65715i);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof xeb ? (xeb) iInterfaceQueryLocalInterface : new xeb(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 12451000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
