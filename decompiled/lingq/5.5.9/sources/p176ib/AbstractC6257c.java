package p176ib;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p152hb.InterfaceC5957c;
import p152hb.InterfaceC5980j;

/* JADX INFO: renamed from: ib.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6257c<T extends IInterface> extends AbstractC6251a<T> implements C2542a.e, InterfaceC6298v {

    /* JADX INFO: renamed from: Y */
    public final C6254b f36451Y;

    /* JADX INFO: renamed from: Z */
    public final Set<Scope> f36452Z;

    /* JADX INFO: renamed from: a0 */
    public final Account f36453a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6257c(Context context, Looper looper, int i10, C6254b c6254b, InterfaceC5957c interfaceC5957c, InterfaceC5980j interfaceC5980j) {
        C6253a1 c6253a1M12896a = AbstractC6260d.m12896a(context);
        C2548c c2548c = C2548c.f13920d;
        C6272i.m12915i(interfaceC5957c);
        C6272i.m12915i(interfaceC5980j);
        super(context, looper, c6253a1M12896a, c2548c, i10, new C6294t(interfaceC5957c), new C6296u(interfaceC5980j), c6254b.f36444f);
        this.f36451Y = c6254b;
        this.f36453a0 = c6254b.f36439a;
        Set<Scope> set = c6254b.f36441c;
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f36452Z = set;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: B */
    public final Set<Scope> mo12870B() {
        return this.f36452Z;
    }

    @Override // com.google.android.gms.common.api.C2542a.e
    /* JADX INFO: renamed from: d */
    public final Set<Scope> mo7540d() {
        return mo7553s() ? this.f36452Z : Collections.emptySet();
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: x */
    public final Account mo12889x() {
        return this.f36453a0;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: z */
    public final void mo12891z() {
    }
}
