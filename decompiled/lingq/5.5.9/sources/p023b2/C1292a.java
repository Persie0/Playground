package p023b2;

import android.content.Context;
import androidx.constraintlayout.core.SolverVariable;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.HashSet;
import p081e0.C5339u;
import p088e7.C5383c;
import p290o6.C7951d0;
import p290o6.C7977q0;
import p290o6.C7979r0;
import p290o6.InterfaceC7984w;
import p326q.C8452h;
import p399te.InterfaceC9279a;
import p450w6.C9815b;
import p450w6.C9818e;
import p450w6.InterfaceC9814a;

/* JADX INFO: renamed from: b2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1292a implements InterfaceC9814a {

    /* JADX INFO: renamed from: a */
    public Object f8003a;

    /* JADX INFO: renamed from: b */
    public final Object f8004b;

    /* JADX INFO: renamed from: c */
    public final Object f8005c;

    /* JADX INFO: renamed from: d */
    public Object f8006d;

    public C1292a(int i10) {
        if (i10 != 1) {
            this.f8003a = new C1293b();
            this.f8004b = new C1293b();
            this.f8005c = new C1293b();
            this.f8006d = new SolverVariable[32];
            return;
        }
        this.f8003a = new C5339u(10);
        this.f8004b = new C8452h();
        this.f8005c = new ArrayList();
        this.f8006d = new HashSet();
    }

    public C1292a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C5383c c5383c) {
        C9818e c9818e = new C9818e(context, cleverTapInstanceConfig, c7951d0);
        this.f8005c = cleverTapInstanceConfig;
        this.f8004b = c9818e;
        this.f8006d = c5383c;
        C9815b c9815b = new C9815b(c9818e.m18298c().split(","));
        cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoPrefIdentitySet [" + c9815b + "]");
        C9815b c9815b2 = new C9815b(cleverTapInstanceConfig.f10992L);
        cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoConfigIdentitySet [" + c9815b2 + "]");
        HashSet<String> hashSet = c9815b.f49959a;
        boolean zIsEmpty = hashSet.isEmpty() ^ true;
        HashSet<String> hashSet2 = c9815b2.f49959a;
        if (zIsEmpty && (!hashSet2.isEmpty()) && !c9815b.equals(c9815b2)) {
            ((C5383c) this.f8006d).m11556b(C0987y.m3821c(531, -1, new String[0]));
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepopushing error due to mismatch [Pref:" + c9815b + "], [Config:" + c9815b2 + "]");
        } else {
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoNo error found while comparing [Pref:" + c9815b + "], [Config:" + c9815b2 + "]");
        }
        if (!hashSet.isEmpty()) {
            this.f8003a = c9815b;
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Pref[" + ((C9815b) this.f8003a) + "]");
        } else if (!hashSet2.isEmpty()) {
            this.f8003a = c9815b2;
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Config[" + ((C9815b) this.f8003a) + "]");
        } else {
            this.f8003a = new C9815b(InterfaceC7984w.f43429b);
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Default[" + ((C9815b) this.f8003a) + "]");
        }
        if (!(!hashSet.isEmpty())) {
            String string = ((C9815b) this.f8003a).toString();
            C7977q0.m15830h(C7977q0.m15827e(context, null).edit().putString(C7977q0.m15833k(cleverTapInstanceConfig, "SP_KEY_PROFILE_IDENTITIES"), string));
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "saveIdentityKeysForAccount:" + string);
            cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoSaving Identity Keys in Pref[" + string + "]");
        }
    }

    public C1292a(Throwable th2, InterfaceC9279a interfaceC9279a) {
        this.f8003a = th2.getLocalizedMessage();
        this.f8004b = th2.getClass().getName();
        this.f8005c = interfaceC9279a.mo11675b(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f8006d = cause != null ? new C1292a(cause, interfaceC9279a) : null;
    }

    @Override // p450w6.InterfaceC9814a
    /* JADX INFO: renamed from: a */
    public final boolean mo4794a(String str) {
        boolean zM15834a = C7979r0.m15834a(str, ((C9815b) this.f8003a).f49959a);
        ((CleverTapInstanceConfig) this.f8005c).m6434c("ON_USER_LOGIN", "ConfigurableIdentityRepoisIdentity [Key: " + str + " , Value: " + zM15834a + "]");
        return zM15834a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m4795b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C8452h) this.f8004b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m4795b(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // p450w6.InterfaceC9814a
    /* JADX INFO: renamed from: c */
    public final C9815b mo4796c() {
        return (C9815b) this.f8003a;
    }
}
