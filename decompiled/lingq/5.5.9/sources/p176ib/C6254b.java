package p176ib;

import android.accounts.Account;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p071dc.C5142a;
import p326q.C8446b;
import p326q.C8448d;

/* JADX INFO: renamed from: ib.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6254b {

    /* JADX INFO: renamed from: a */
    public final Account f36439a;

    /* JADX INFO: renamed from: b */
    public final Set<Scope> f36440b;

    /* JADX INFO: renamed from: c */
    public final Set<Scope> f36441c;

    /* JADX INFO: renamed from: d */
    public final Map<C2542a<?>, C6282n> f36442d;

    /* JADX INFO: renamed from: e */
    public final String f36443e;

    /* JADX INFO: renamed from: f */
    public final String f36444f;

    /* JADX INFO: renamed from: g */
    public final C5142a f36445g;

    /* JADX INFO: renamed from: h */
    public Integer f36446h;

    /* JADX INFO: renamed from: ib.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Account f36447a;

        /* JADX INFO: renamed from: b */
        public C8448d<Scope> f36448b;

        /* JADX INFO: renamed from: c */
        public String f36449c;

        /* JADX INFO: renamed from: d */
        public String f36450d;
    }

    public C6254b(Account account, Set set, C8446b c8446b, String str, String str2, C5142a c5142a) {
        this.f36439a = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f36440b = setEmptySet;
        Map<C2542a<?>, C6282n> mapEmptyMap = c8446b == null ? Collections.emptyMap() : c8446b;
        this.f36442d = mapEmptyMap;
        this.f36443e = str;
        this.f36444f = str2;
        this.f36445g = c5142a == null ? C5142a.f33121a : c5142a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<C6282n> it = mapEmptyMap.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
            hashSet.addAll(null);
        }
        this.f36441c = Collections.unmodifiableSet(hashSet);
    }
}
